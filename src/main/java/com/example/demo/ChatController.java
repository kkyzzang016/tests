package com.example.demo;

import com.example.demo.dto.Message;
import com.example.demo.dto.OpenAIRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@Slf4j
public class ChatController {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping("/chat")
    public String chat() {

        return "chatInterface";
    }

    @PostMapping("/chat/openai")
    public ResponseEntity<String> interactWithOpenAI(@RequestBody String userInput) {
        try {
            // OpenAI API 엔드포인트 및 키
            String endpointUrl = "https://api.openai.com/v1/chat/completions";
            String apiKey = "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";

            // 요청 데이터 설정
            OpenAIRequest request = new OpenAIRequest();
            Message message = new Message();
            message.setRole("user");
            message.setContent(userInput);
            request.setMessages(List.of(message));
            request.setMax_tokens(500);
            request.setModel("gpt-3.5-turbo");

            // 객체를 JSON 문자열로 변환
            String requestBody = objectMapper.writeValueAsString(request);
            log.error(requestBody);

            // HTTP 요청 설정
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setBearerAuth(apiKey);

            // REST 템플릿 생성
            RestTemplate restTemplate = new RestTemplate();

            // OPENAI에 POST 요청 보내기
            ResponseEntity<String> response = restTemplate.exchange(
                    endpointUrl,
                    HttpMethod.POST,
                    new HttpEntity<>(requestBody, headers),
                    String.class);

            // OPENAI로부터 받은 응답 전송
//            log.error(response.getBody());
            return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("서버 오류가 발생했습니다.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}

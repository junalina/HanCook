package com.wooseung.hancook.api.controller;

import com.wooseung.hancook.api.service.PronunciationService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.StringTokenizer;

@RestController
@RequestMapping("/pronunciation")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PronunciationController {

    private static final Logger logger = LogManager.getLogger(CartController.class);
    private final PronunciationService pronunciationService;

    // 한글을 입력 받아 영어 발음 반환
    @GetMapping
    public ResponseEntity<String> getEnglishPronunciation(@RequestParam("korean") String korean) {
        logger.info("name" + korean);
        StringTokenizer st = new StringTokenizer(korean, ",");
        korean = st.nextToken();
        logger.info("realName" + korean);

        String result = pronunciationService.conversionPronunciation(korean);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}

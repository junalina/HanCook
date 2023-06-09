package com.wooseung.hancook.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ExceptionEnum {
    RUNTIME_EXCEPTION(HttpStatus.BAD_REQUEST, "E0001", "내부 문제로 다음번에 다시 시도해주세요."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "E0003", "내부 문제로 다음번에 다시 시도해주세요."),
    API_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "E0004", "존재하지 않는 API 입니다."),
    API_METHOD_NOT_ALLOWED_EXCEPTION(HttpStatus.METHOD_NOT_ALLOWED, "E0005", "지원하지 않는 Method입니다."),
    API_PARAMETER_EXCEPTION(HttpStatus.BAD_REQUEST, "E0006", "파라미터 타입과 값을 확인하세요."),
    MEMBER_ACCESS_EXCEPTION(HttpStatus.FORBIDDEN, "M0001", "접근 권한이 없습니다."),
    MEMBER_EXIST_EXCEPTION(HttpStatus.BAD_REQUEST,"M0002","이미 존재하는 유저입니다."),
    MEMBER_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND,"404", "존재하지 않는 계정입니다."),
    PASSWORD_NOT_MATCHED_EXCEPTION(HttpStatus.FORBIDDEN, "M003", "비밀번호가 일치하지 않습니다."),
    COMPANY_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND,"404", "등록되지 않은 회사입니다."),
    REVIEW_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "404", "등록되지 않은 리뷰입니다."),
    RECRUIT_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "404", "등록되지 않은 공고입니다."),
    RESUME_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "404", "등록되지 않은 이력서입니다"),
    CONFERENCE_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "404", "존재하지 않은 방입니다."),
    CARD_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "404", "카드정보가 존재하지 않습니다."),
    ApplyStatus_NOT_EXIT_EXCEPTION(HttpStatus.NOT_FOUND, "404", "지원정보가 존재하지 않습니다."),
    INGREDIENT_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "404", "재료가 존재하지 않습니다."),
    RECIPE_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "404", "레시피가 존재하지 않습니다.");
    private final HttpStatus status;
    private final String code;
    private String message;

}
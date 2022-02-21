package kr.co.test.commons.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ExceptionCode {
    NOT_FOUND_DATA(HttpStatus.NOT_FOUND, "데이터를 찾을 수 없습니다.");

    private final HttpStatus httpStatus;
    private final String detail;
}

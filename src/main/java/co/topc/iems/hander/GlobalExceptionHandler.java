package co.topc.iems.hander;

import co.topc.web.commons.TopcWebResponse;
import co.topc.web.commons.constants.TopcWebResponseEnum;
import co.topc.web.commons.utils.TopcWebResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;
import java.util.stream.Collectors;
/**
 * @author RuntimeExcepti0n
 * @date 2019/8/2 0:10
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = Exception.class)
    public TopcWebResponse handleException(Exception e) {
        if (e instanceof MethodArgumentNotValidException) {
            return handleMethodArgumentNotValidException((MethodArgumentNotValidException) e);
        } else if (e instanceof ConstraintViolationException) {
            return handleConstraintViolationException((ConstraintViolationException) e);
        } else if (e instanceof BindException) {
            return handleBindException((BindException) e);
        } else {
            logger.error("操作错误", e);
            return TopcWebResponseUtil.getFailResult(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode(), "操作错误", "");
        }
    }

    private TopcWebResponse handleBindException(BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        String failMessage = bindingResult.getFieldErrors().stream().map(FieldError::getDefaultMessage)
                .collect(Collectors.joining(","));
        return TopcWebResponseUtil.getFailResult(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode(), failMessage, "");
    }

    private TopcWebResponse handleConstraintViolationException(ConstraintViolationException e) {
        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        String failMessage = constraintViolations.stream().map(ConstraintViolation::getMessage)
                .collect(Collectors.joining(","));
        return TopcWebResponseUtil.getFailResult(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode(), failMessage, "");
    }

    private TopcWebResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        String failMessage = bindingResult.getFieldErrors().stream().map(FieldError::getDefaultMessage)
                .collect(Collectors.joining(","));
        return TopcWebResponseUtil.getFailResult(TopcWebResponseEnum.SERVER_INTERNAL_ERROR.getCode(), failMessage, "");
    }
}

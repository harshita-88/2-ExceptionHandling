package in.harshita.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = UserException.class)
	public ResponseEntity<AppExceptionInfo> handleUserException(Exception e){
		
		AppExceptionInfo info = new AppExceptionInfo();
		info.setExCode("User Error");
		info.setExMsg(e.getMessage());
		info.setExDate(LocalDateTime.now());
		
		return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<AppExceptionInfo> handleAppException(Exception e){
		
		AppExceptionInfo info = new AppExceptionInfo();
		info.setExCode("Sbi Error");
		info.setExMsg(e.getMessage());
		info.setExDate(LocalDateTime.now());
		
		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

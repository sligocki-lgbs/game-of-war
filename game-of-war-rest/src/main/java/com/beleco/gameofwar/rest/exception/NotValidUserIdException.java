package com.beleco.gameofwar.rest.exception;

import com.beleco.gameofwar.core.exception.GameException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Everdark on 04.07.2017.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "UserID is not valid")
public class NotValidUserIdException extends GameException {
    public NotValidUserIdException(String message){
        super(message);
    }
}

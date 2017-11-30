package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pojo.User;

public class UserValidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // 验证username, sex和age是否为null
        ValidationUtils.rejectIfEmpty(errors, "username", "00001", "用户名不能为空");
        ValidationUtils.rejectIfEmpty(errors, "password", "00001", "密码不能为空");
        ValidationUtils.rejectIfEmpty(errors, "loginname", "00001", "账号不能为空"); 
    }
    
}

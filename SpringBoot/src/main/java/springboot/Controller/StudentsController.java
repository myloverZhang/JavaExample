package springboot.Controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springboot.model.UserInfo;

import javax.validation.Valid;

/**
 * Created by CTWLPC on 2017/8/2.
 */
@Controller
@RequestMapping("/user")
public class StudentsController extends WebMvcConfigurerAdapter{

    private static UserInfo userInfo = new UserInfo("SHUSF",19);
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/results.html").setViewName("results");
    }
    @GetMapping("/")
    public String register(UserInfo userInfo){
        return "/register.html";
    }

    @PostMapping("/")
    public String checkPersonInfo(UserInfo userInfo, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "/register.html";
        }
        return "redirect:/results.html";
    }
}

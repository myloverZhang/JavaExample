package springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springboot.StudentInfo;

/**
 * Created by CTWLPC on 2017/7/27.
 */
@Controller
@EnableAutoConfiguration
public class TestAction{

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello World";
    }

    @GetMapping("/index")
    public String index(){
        return "Welcome to the home page!";
    }

    @RequestMapping(value = "/stu",method = RequestMethod.GET)
    @ResponseBody
    public StudentInfo getStudentInfo(@RequestParam(value = "name",defaultValue = "shusf") String name){
        return new StudentInfo(23L,name);
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name",defaultValue = "shusf") String name, Model model){
        model.addAttribute("name", name);
        return "students.html";
    }
}

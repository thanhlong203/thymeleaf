package vn.app.jansfa.front.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController extends ControllerAdapter {
	@GetMapping("/index")
	public String index() {
		return "/home/index";
	}
}

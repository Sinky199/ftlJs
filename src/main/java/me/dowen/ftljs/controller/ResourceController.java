package me.dowen.ftljs.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liufl / 2014年7月15日
 */
@Controller
public class ResourceController {

	private Logger log = LoggerFactory.getLogger(getClass());

	@RequestMapping("/{resource}")
	public String resource(Model model, HttpServletRequest request, @PathVariable("resource") String resource, String name) {
		log.info(request.getRequestURI());
		if (name != null && !"".equals(name.trim())) {
			log.info("name:" + name);
			model.addAttribute("name", name);
		}
		return resource;
	}

}

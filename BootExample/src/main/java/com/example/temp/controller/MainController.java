package com.example.temp.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.temp.model.LoginModel;
import com.example.temp.model.UserAvatarModel;
import com.example.temp.model.UserModel;
import com.example.temp.service.LoginService;
import com.example.temp.service.UserService;

@Controller
public class MainController{
	
	
	
	@Autowired
	UserService userService;

	@Autowired
	LoginService loginService;

	@RequestMapping("/index")
	public ModelAndView getIndex() {
		return new ModelAndView("index");
	}

	@RequestMapping("/chart")
	public ModelAndView getChart() {
		System.out.println("Chart controller called");
		return new ModelAndView("chart");
	}

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public @ResponseBody String uploadFileHandler(@RequestParam("name") String name,    @RequestParam("file") MultipartFile file) {
		System.out.println("Chart controller called "+name);
		if(!file.isEmpty()){
			
			try {
				byte[] imgArray = file.getBytes();
				System.out.println(imgArray);
				//String rootPath = System.getProperty("catalina.home");
				 File files = new File("F:\\Directory1");
				 if (!files.exists()) {
			            if (files.mkdir()) {
			                System.out.println("Directory is created!");
			            } else {
			                System.out.println("Failed to create directory!");
			            }
			        }
				 
				 String rootPath = files.getAbsolutePath();
				 System.out.println("Path: "+rootPath);
				 File dir = new File(rootPath + File.separator + "tmpFiles");
				 
				 if(!dir.exists())
					 dir.mkdirs();
				 
				 File serverFile = new File(dir.getAbsolutePath()
							+ File.separator + file.getOriginalFilename()+".jpg");
				 
				 BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
					stream.write(imgArray);
					stream.close();
			//	System.out.println("Path: "+rootPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLogin() {
		ModelAndView moveAdd = new ModelAndView("login", "loginForm", new LoginModel());
		List<String> selectValues = new ArrayList<String>();
		selectValues.add("Admin");
		selectValues.add("Superadmin");
		selectValues.add("Employee");
		moveAdd.addObject("selectValue", selectValues);
		return moveAdd;

	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView registerForm() {
		ModelAndView moveAdd = new ModelAndView("register", "userForm", new UserModel());
		List<String> selectValues = new ArrayList<String>();
		selectValues.add("Admin");
		selectValues.add("Superadmin");
		selectValues.add("Employee");
		moveAdd.addObject("selectValue", selectValues);
		return moveAdd;
	}

	@RequestMapping(value = "/registerForm", method = RequestMethod.POST)
	public String getRegisterFormData(@ModelAttribute("userForm") @Valid UserModel user, BindingResult results) {
		if (results.hasErrors()) {
			System.out.println("UserName: ELSE " + user.getName());
			return "register";
		}
		userService.addUser(user);
		return "register";
	}

	@RequestMapping(value = "/loginFormValue", method = RequestMethod.POST)
	public String getLoginFormData(@ModelAttribute("loginForm") @Valid LoginModel login, BindingResult results) {
		if (results.hasErrors()) {
			return "login";
		}
		boolean value = loginService.checkLogin(login);
		System.out.println("Value: " + value);
		if (value) {
			return "index";
		}
		return "login";
	}

	@RequestMapping("/contract")
	public ModelAndView getContract() {
		System.out.println("contract controller called");
		return new ModelAndView("contract");
	}
	
	@RequestMapping("/showImage")
	public ModelAndView showImage() {
		System.out.println("show Image");
		return new ModelAndView("showImage");
	}
}

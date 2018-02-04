package order.controller;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import order.helper.PasswordValidator;
import order.model.User;
import order.model.UserPrivilege;
import order.model.UserType;
import order.wrapper.UserWrapper;

@Controller
public class AdminController {

	@Autowired
	private order.service.UserService userService;
	
	@Autowired
	private order.service.UserTypeService userTypeService;
	
	@Autowired
	private order.service.UserPrivilegeService userPrivilegeService;

	@Autowired
	private order.service.EncryptionService encryptionService;
	
	/*
	 * Metoda za admina da se prikaze admin panel
	 */
	@RequestMapping(value = "/admin")
	public ModelAndView adminPage(HttpServletRequest request) {
/*
		User user = (User) request.getSession().getAttribute("user");

		if (user == null) {
			return new ModelAndView("LogIn");
		}
*/
		ModelAndView modelAndView = new ModelAndView("AdminPanel");
		//modelAndView.addObject("users", userService.getUsers());

		return modelAndView;
	}

	/*
	 * GET Metoda za admina da prikaze sve usere
	 */
	@RequestMapping(value = "/admin/user/list", method = RequestMethod.GET)
	public ModelAndView listOfUsers(HttpServletRequest request) {
/*
		User user = (User) request.getSession().getAttribute("user");

		if (user == null) {
			return new ModelAndView("LogIn");
		}
*/
		ModelAndView modelAndView = new ModelAndView("UserList");
		
		modelAndView.addObject("users", userService.getUsers());

		return modelAndView;
	}
	
	/*
	 * GET Metoda za admina da doda usera
	 */
	@RequestMapping(value = "/admin/user/add", method = RequestMethod.GET)
	public ModelAndView addUser(HttpServletRequest request) {
/*
		User user = (User) request.getSession().getAttribute("user");

		if (user == null) {
			return new ModelAndView("LogIn");
		}
*/
		UserWrapper userWrapper = new UserWrapper();
		
		ModelAndView modelAndView = new ModelAndView("UserAdd");
		modelAndView.addObject("userWrapper", userWrapper);

		return modelAndView;
	}
	
	/*
	 * POST Metoda za admina da doda usera
	 */
	@RequestMapping(value = "/admin/user/add", method = RequestMethod.POST)
	public ModelAndView addUser(@Valid @ModelAttribute("userWrapper") UserWrapper userWrapper, BindingResult result, HttpServletRequest request) {
/*
		User user = (User) request.getSession().getAttribute("user");

		if (user == null) {
			return new ModelAndView("LogIn");
		}
*/
		if(result.hasErrors())
		{
			ModelAndView modelAndView = new ModelAndView("UserAdd");
			modelAndView.addObject("userWrapper", userWrapper);

			return modelAndView;
		}
		
		ModelAndView modelAndView = new ModelAndView("userlist");
		modelAndView.addObject("users", userService.getUsers());

		return modelAndView;
	}
	
	/*
	 * GET Metoda za admina da edituje usera
	 */
	@RequestMapping(value = "/admin/user/edit/{user_id}", method = RequestMethod.GET)
	public ModelAndView editUser(@PathVariable Integer user_id, HttpServletRequest request) {
/*
		User user = (User) request.getSession().getAttribute("user");

		if (user == null) {
			return new ModelAndView("LogIn");
		}
*/
		ModelAndView modelAndView = new ModelAndView("UserEdit");
		
		UserWrapper userWrapper = new UserWrapper();
		
		userWrapper.setUser(userService.getUser(user_id));
		userWrapper.setUserPrivilege(userService.getUser(user_id).getUserPrivilege());
		userWrapper.setUserType(userService.getUser(user_id).getUserType());
		userWrapper.setAddress(userService.getUser(user_id).getUserAddress());
		
		List<UserType> userTypes = userTypeService.getUserTypes();
		List<UserPrivilege> userPrivileges = userPrivilegeService.getUserPrivileges();
		
		modelAndView.addObject("userWrapper", userWrapper);
		modelAndView.addObject("userTypes", userTypes);
		modelAndView.addObject("userPrivileges", userPrivileges);

		return modelAndView;
	}
	
	/*
	 * POST Metoda za admina da edituje usera
	 */
	@RequestMapping(value = "/admin/user/edit/{user_id}", method = RequestMethod.POST)
	public ModelAndView editUser(@PathVariable Integer user_id, @Valid @ModelAttribute("userWrapper") UserWrapper userWrapper, BindingResult result, HttpServletRequest request) {
/*
		User user = (User) request.getSession().getAttribute("user");

		if (user == null) {
			return new ModelAndView("LogIn");
		}
*/
		if(result.hasErrors())
		{
			ModelAndView modelAndView = new ModelAndView("UserEdit");
			modelAndView.addObject("userWrapper", userWrapper);

			return modelAndView;
		}
		
		//Treba se vratiti modal sa obavještenjem o uspješom dodavanju
		ModelAndView modelAndView = new ModelAndView("UserList");
		
		return modelAndView;
	}	
	
	/*
	 * GET Metoda za admina da edituje osnovne informacije
	 */
	@RequestMapping(value = "/admin/infromation/edit/{information_id}", method = RequestMethod.GET)
	public ModelAndView editInfromation(@PathVariable Integer information_id, HttpServletRequest request) {
/*
		User user = (User) request.getSession().getAttribute("user");

		if (user == null) {
			return new ModelAndView("LogIn");
		}
*/
		ModelAndView modelAndView = new ModelAndView("InformationEdit");
		
		//modelAndView.addObject("infromation", information);

		return modelAndView;
	}
	
	/*
	 * POST Metoda za admina da edituje osnovne informacije
	 */
	@RequestMapping(value = "/admin/infromation/edit/{information_id}", method = RequestMethod.POST)
	public ModelAndView editInformation(@PathVariable Integer information_id, @Valid @ModelAttribute("userWrapper") UserWrapper userWrapper, BindingResult result, HttpServletRequest request) {
/*
		User user = (User) request.getSession().getAttribute("user");

		if (user == null) {
			return new ModelAndView("LogIn");
		}
*/
		if(result.hasErrors())
		{
			ModelAndView modelAndView = new ModelAndView("InformationEdit");
			modelAndView.addObject("userWrapper", userWrapper);

			return modelAndView;
		}
		
		//Treba se vratiti modal sa obavještenjem o uspješom editovanju
		ModelAndView modelAndView = new ModelAndView("AdminPanel");
		
		return modelAndView;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Otvaranje stranice za registraciju korisnika
	@RequestMapping(value = "/admin/registration", method = RequestMethod.GET)
	public ModelAndView registrationPage() {
		return new ModelAndView("Registration");
	}

	// Pohrana podataka o registraciji korisnika
	@RequestMapping(value = "/admin/registration", method = RequestMethod.POST)
	public @ResponseBody ModelAndView registration(@RequestParam("username") String username,
			@RequestParam("password") String password) {

		ModelAndView modelAndView = null;

		if (username.equals("")) {
			modelAndView = new ModelAndView("Registration");
			modelAndView.addObject("error", " * Username required!");
			return modelAndView;
		}

		User user = userService.getUserByUsername(username);

		// Ako postoji vratiti ponovo na stranicu registration
		if (user != null) {
			modelAndView = new ModelAndView("Registration");
			modelAndView.addObject("error", " * Username already exists!");
			return modelAndView;
		}

		// Funkcija koja vraca validator (tj. regex uslov za provjeru passworda)
		PasswordValidator validator = new PasswordValidator();

		boolean passwordOK = validator.validate(password);

		// Ako password nije u ispravnom formatu vraca ponovo na stranicu za
		// registraciju
		if (!passwordOK) {
			modelAndView = new ModelAndView("Registration");
			modelAndView.addObject("error", "Password must have:");
			modelAndView.addObject("errorLength", " * 6 or more characters");
			modelAndView.addObject("errorLetters", " * Upper & lower case letters");
			modelAndView.addObject("errorNumbers", " * At least one number");
			modelAndView.addObject("errorSpecialCharacters", " * One of these special characters (@#$%)");
			modelAndView.addObject("username", username);
			return modelAndView;
		}

		// Generisanje salta i hasha za korisnika
		String user_password_salt = null;
		String user_password_hash = null;

		try {
			user_password_salt = encryptionService.getSalt();
		} catch (NoSuchAlgorithmException e) {
			// System.out.println("SALT NIJE GENERISAN!");
			e.printStackTrace();
		}

		try {
			user_password_hash = encryptionService.generatePasswordHash(password);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// System.out.println("PASSWORD HASH NIJE GENERISAN!");
			e.printStackTrace();
		}

		User novi = new User(username, user_password_salt, user_password_hash);

		modelAndView = new ModelAndView("LogIn");
		userService.addUser(novi);
		modelAndView.addObject("users", userService.getUsers());
		return modelAndView;
	}

}

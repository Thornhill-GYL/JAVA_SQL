package meet.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import meet.entity.Myuser;
import meet.service.UserService;

@Controller
public class UserController {
    
	@Autowired
	private UserService ts;
	@RequestMapping("/Insertuser")
	public String insertuser(int id, String name,String real_name,String word, String phone,String mail,HttpServletRequest request)
	{
		boolean result= ts.Insertuser(id,name,real_name,word,phone,mail);
		if(result)
		{
			request.setAttribute("message", "插入成功");
		}
		else
		{
			request.setAttribute("message", "失败");
		}
		return "/result.jsp";
	}
	@RequestMapping("/Deleteuser")
	public String deleteuser(int id,HttpServletRequest request)
	{
		boolean result=ts.deleteuser(id);
		if(result)
		{
			
			request.setAttribute("message", "成功");
		}
		else
		{
			request.setAttribute("message", "失败");
		}
		return "/result.jsp";
	}
	
	@RequestMapping("/Updateuser")
	public String updateuser(int id, String name,String real_name,String word,String phone, String mail,HttpServletRequest request)
	{
		boolean result=ts.Updateuser(id,name,real_name,word,phone,mail);
		if(result)
		{
			request.setAttribute("message", "修改成功");
		}
		else
		{
			request.setAttribute("message", "失败");
		}
		return "/result.jsp";
	}
	
	
	@RequestMapping("/Searchuser")
	@ResponseBody  //注解使test实体类变为json格式字符串传给前端
	public Myuser search(int id)
	{
		return ts.searchuser(id);
	}
	
}

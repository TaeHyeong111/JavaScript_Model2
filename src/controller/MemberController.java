package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Carrier;
import command.Sentry;
import domain.MemberBean;
import enums.Action;
import javafx.scene.AccessibleAction;
import service.MemberServiceImpl;


@WebServlet({"/member.do","/admin.do"}) //URL mapping 이름이 파라미터안의 값
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(
			HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		Sentry.init(request);
		System.out.println(request);
		switch(Action.valueOf(Sentry.cmd.getAction().toUpperCase())) {
		case MOVE : 
			System.out.println("무브"+Action.valueOf(Sentry.cmd.getAction().toUpperCase()));
				Carrier.forward(request, response);
			break;
		case JOIN :
			System.out.println("조인"+Action.valueOf(Sentry.cmd.getAction().toUpperCase()));
			Carrier.redirect(request, response,
					"/member.do?action=move&page=userLoginForm");
			break;
		case LOGIN : 
			System.out.println("========");
			if(request.getAttribute("match").equals("TRUE")) {
				Carrier.forward(request, response);
			}else {
				Carrier.redirect(request, response, "/member.do?action=move&page=userLoginForm");
			}
			break;
			
		case UPDATE : 
			Carrier.redirect(request, response,"");
			break;
		case DELETE : 
			Carrier.redirect(request, response,"");
			break;
		case ADMIN : 
			Carrier.redirect(request, response,"/admin.do?action=move&page=main");
		default:
			break;
		}
	}
//		case JOIN :
//			MemberBean mem = new MemberBean();
//			mem.setName(request.getParameter("name"));
//			mem.setUserId(request.getParameter("userid"));
//			mem.setPassword(request.getParameter("password"));
//			mem.setSsn(request.getParameter("ssn"));
//			MemberServiceImpl.getInstance().createMember(mem);
//			System.out.println(mem);
//			
//			break;
//		case "memberlist" :
//			List<MemberBean> lst = MemberServiceImpl.getInstance().listMember();
//			for(MemberBean m : lst){
//				System.out.println(m);	}
//		
//			break;
//		case "searchMemberById" :
//			MemberBean m = MemberServiceImpl.getInstance().findById(request.getParameter("uid"));
//					 m.getName() ;
//					 m.getTeamId();
//					 m.getUserId();
//					 m.getAge() ;
//					 m.getRoll() ;
//					 m.getSsn();
//					 System.out.println(m);
//			break;
//		case "searchMemberByTeam" :
//			break;
//		case "memberCount" :
//			
//			break;
//		case "memberUpdate" :
//			String newpassword = request.getParameter("newpassword");
//			
//			MemberBean memUpdate = new MemberBean();
//			memUpdate.setUserId(request.getParameter("userid"));
//			memUpdate.setPassword(request.getParameter("password"));
//			//memUpdate.newPasswrod(newpassword);
//			break;
//		case "login" :
//			MemberBean userLogin = new MemberBean();
//			userLogin.setUserId(request.getParameter("userid"));
//			userLogin.setPassword(request.getParameter("password"));
//			MemberServiceImpl.getInstance().login(userLogin);
//			break;
//		}
//		request.getRequestDispatcher("/WEB-INF/view/member/"+page+".jsp").forward(request, response);}
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}
}

package command;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import enums.Domain;
import service.MemberServiceImpl;

public class DeleteCommand extends Command {

	public DeleteCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
	public void execute() {
		switch(Domain.valueOf(Sentry.cmd.domain.toUpperCase())) {
		case MEMBER : 
			/*MemberBean mem = new MemberBean();
            mem.setUserId(request.getParameter("userid"));
            mem.setPassword(request.getParameter("password"));
			MemberServiceImpl.getInstance().deleteMemberInformation(mem);*/
	
			System.out.println("delete µé¾î¿È!!!");
            MemberBean mem = new MemberBean();
            mem.setUserId(request.getParameter("userid"));
            mem.setPassword(request.getParameter("password"));
            if(MemberServiceImpl.getInstance().login(mem)) {
                MemberServiceImpl.getInstance().deleteMemberInformation(mem);                
            } else {
                System.out.println("Error");
            }
			break;
			default:
			 
				break;
		}
	}
}

package command;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import enums.Domain;
import service.MemberServiceImpl;

public class LoginCommand extends Command {
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}

	@Override
	public void execute() {
		MemberBean bean = new MemberBean();
		bean.setUserId(request.getParameter("userid"));
		bean.setPassword(request.getParameter("password"));
		if (MemberServiceImpl.getInstance().login(bean)) {
			request.setAttribute("match", "TRUE");
			request.setAttribute("user", MemberServiceImpl.getInstance().findById(request.getParameter("userid")));
		}else {
			request.setAttribute("match", "FALSE");
		}
		super.execute();
	}
}

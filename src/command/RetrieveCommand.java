package command;

import javax.servlet.http.HttpServletRequest;

import service.MemberServiceImpl;

public class RetrieveCommand extends Command {

	public RetrieveCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {
	request.setAttribute("member", MemberServiceImpl.getInstance().findById((request.getParameter("userid"))));
		super.execute();
	}
}

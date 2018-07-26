package command;

import javax.servlet.http.HttpServletRequest;

import service.MemberServiceImpl;

public class ListCommand extends Command {

	public ListCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {
		request.setAttribute("list", MemberServiceImpl.getInstance().listMember()); //변수명, 값
		//리스트안에 뒷놈이 들어감
		super.execute();
		
	}
}

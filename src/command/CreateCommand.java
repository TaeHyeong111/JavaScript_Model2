package command;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import enums.Domain;
import service.MemberServiceImpl;

public class CreateCommand extends Command {
	public CreateCommand(HttpServletRequest request) {
		  setRequest(request);
	        setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
	        setAction(request.getParameter("action"));
	        setPage(request.getParameter("page"));
	        execute();
	    }
	@Override
	public void execute() {
		switch(Domain.valueOf(domain.toUpperCase())) {
		case MEMBER : 
			MemberBean mem = new MemberBean();
			mem.setUserId(request.getParameter("userid"));
			mem.setPassword(request.getParameter("password"));
			mem.setName(request.getParameter("name"));
			mem.setSsn(request.getParameter("ssn"));
			mem.setGender(request.getParameter("gender"));
			mem.setAge(request.getParameter("age"));
			mem.setRoll(request.getParameter("roll"));
			mem.setTeamId(request.getParameter("teamid"));
			mem.setSubject(ParamMap.getValues(request, "subject"));
			MemberServiceImpl.getInstance().createMember(mem);
			break;
			default:
			 
				break;
		}
	}
}

package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import enums.Action;

public class Commander {
    public static Command order(HttpServletRequest request){
            Command cmd =null;
            switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
            case MOVE : 
                cmd = new MoveCommand(request);
                break;
            case JOIN : 
                cmd = new CreateCommand(request);
                break;
            case LOGIN :
            	cmd = new LoginCommand(request); // cmd == sentry.cmd
            	break;
            case LIST :
            	cmd = new ListCommand(request);
            	break;
            case SEARCH : 
            	List<MemberBean> mems = ((SearchCommand) Sentry.cmd).getMembers();
            	cmd = new SearchCommand(request);
            	break;
            case RETRIEVE : 
            	cmd = new RetrieveCommand(request);
            	break;
            case UPDATE : 
            	cmd = new UpdateCommand(request);
            	break;
            case DELETE : 
            	cmd = new DeleteCommand(request);
            	break;
            case COUNT : 
            	cmd = new CountCommand(request);
            	break;
            case ADMIN:
            	cmd = new CountCommand(request);
            default:
                break;
            }
            return cmd;
    }
}
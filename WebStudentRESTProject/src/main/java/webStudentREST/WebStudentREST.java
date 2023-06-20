package webStudentREST;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



@Path("WebStudent")
public class WebStudentREST {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public  String displayHTMLHello() {
		return " Hello Mid Term";
	}

}

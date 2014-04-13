//version: 0.9.4
package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static play.templates.JavaExtensions.*;
import play.data.validation.Error;
import play.i18n.Messages;
import play.mvc.Scope.*;
import play.data.validation.Validation;
import play.i18n.Lang;
import controllers.*;
import japidviews._layouts.*;
import models.*;
import play.mvc.Http.*;
//
// NOTE: This file was generated from: japidviews/Application/listAll.html
// Change to this file will be lost next time the template file is compiled.
//
public class listAll extends main
{
	public static final String sourceTemplate = "japidviews/Application/listAll.html";
	 private void initHeaders() {
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}
	{
	}

// - add implicit fields with Play

	final play.mvc.Http.Request request = play.mvc.Http.Request.current(); 
	final play.mvc.Http.Response response = play.mvc.Http.Response.current(); 
	final play.mvc.Scope.Session session = play.mvc.Scope.Session.current();
	final play.mvc.Scope.RenderArgs renderArgs = play.mvc.Scope.RenderArgs.current();
	final play.mvc.Scope.Params params = play.mvc.Scope.Params.current();
	final play.data.validation.Validation validation = play.data.validation.Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public listAll() {
	super((StringBuilder)null);
	initHeaders();
	}
	public listAll(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public listAll(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"contacts",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<Contact>",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.listAll.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private List<Contact> contacts; // line 1, japidviews/Application/listAll.html
	public cn.bran.japid.template.RenderResult render(List<Contact> contacts) {
		this.contacts = contacts;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 1, japidviews/Application/listAll.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(List<Contact> contacts) {
		return new listAll().render(contacts);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, listAll.html
		;// line 1, listAll.html
p("\n" + 
"<table>\n" + 
"    <thead>\n" + 
"        <tr>\n" + 
"            <th class=\"name\">The Name</th>\n" + 
"            <th class=\"firstname\">First name</th>\n" + 
"            <th class=\"birthdate\">Birth date</th>\n" + 
"            <th class=\"email\">Email</th>\n" + 
"            <th class=\"edit\"></th>\n" + 
"        </tr>\n" + 
"    </thead>\n" + 
"    <tbody>\n");// line 3, listAll.html
		p("\n" + 
"        ");// line 17, listAll.html
		for (Contact contact : contacts) {// line 18, listAll.html
		p("	        <tr class=\"contact\" contactId=\"");// line 18, listAll.html
		p(contact.id);// line 19, listAll.html
		p("\" draggable=\"true\">\n" + 
"	            <td id=\"name-");// line 19, listAll.html
		p(contact.id);// line 20, listAll.html
		p("\">");// line 20, listAll.html
		p(contact.name);// line 20, listAll.html
		p("</td>\n" + 
"	            <td id=\"firstname-");// line 20, listAll.html
		p(contact.id);// line 21, listAll.html
		p("\">");// line 21, listAll.html
		p(contact.firstname);// line 21, listAll.html
		p("</td>\n" + 
"	            <td id=\"birthdate-");// line 21, listAll.html
		p(contact.id);// line 22, listAll.html
		p("\">");// line 22, listAll.html
		try { Object o = format(contact.birthdate, "yyyy-MM-dd") ; if (o.toString().length() ==0) { ; } else { p(o); } } catch (NullPointerException npe) { ; }// line 22, listAll.html
		p("</td>\n" + 
"	            <td id=\"email-");// line 22, listAll.html
		p(contact.id);// line 23, listAll.html
		p("\">");// line 23, listAll.html
		p(contact.email);// line 23, listAll.html
		p("</td>\n" + 
"	            <td><a href=\"");// line 23, listAll.html
		p(lookup("form", contact.id));// line 24, listAll.html
		p("\">&gt;</a></td>\n" + 
"	        </tr>\n" + 
"        ");// line 24, listAll.html
		}// line 26, listAll.html
		p("        <tr>\n" + 
"            <form action=\"");// line 26, listAll.html
		p(lookup("save", new Object[]{}));// line 28, listAll.html
		p("\" method=\"POST\">\n" + 
"            	");// line 28, listAll.html
		p(authenticityToken());// line 29, listAll.html
		p("\n" + 
"	            <td><input type=\"text\" name=\"contact.name\"></td>\n" + 
"	            <td><input type=\"text\" name=\"contact.firstname\"></td>\n" + 
"	            <td><input type=\"text\" name=\"contact.birthdate\"></td>\n" + 
"	            <td><input type=\"text\" name=\"contact.email\"></td>\n" + 
"	            <td><input type=\"submit\" value=\"+\"></td>\n" + 
"            </form>\n" + 
"        </tr>\n" + 
"    </tbody>\n" + 
"</table>\n" + 
"\n" + 
"<script type=\"text/javascript\" charset=\"utf-8\">\n" + 
"    // In place edition\n" + 
"    $(\".contact td\").editInPlace({\n" + 
"        bg_over: 'transparent',\n" + 
"        callback: function(el, n, o) {\n" + 
"            var m = /([a-z]+)-(\\d+)/.exec(el), data = {}\n" + 
"            data['contact.id'] = m[2]\n" + 
"            data['contact.' + m[1]] = n\n" + 
"            \n" + 
"            // Save result\n" + 
"            $.ajax({\n" + 
"                url: '");// line 29, listAll.html
		p(lookup("save", new Object[]{}));// line 51, listAll.html
		p("',\n" + 
"                type: 'POST',\n" + 
"                data: data,\n" + 
"                success: function() {$('#' + el).html(n)},\n" + 
"                error: function() {$('#' + el).html(o)}\n" + 
"            })\n" + 
"            \n" + 
"            return true\n" + 
"        }\n" + 
"    })\n" + 
"\n" + 
"    	\n" + 
"    ");// line 51, listAll.html
		p("\n" + 
"    // Drag & Drop\n" + 
"    var dragIcon = document.createElement('img')\n" + 
"    dragIcon.src = '");// line 64, listAll.html
		p(lookupStatic("public/images/avatar.png"));// line 67, listAll.html
		p("'  \n" + 
"    var action = ");// line 67, listAll.html
		p(jsAction("form", ":id"));// line 68, listAll.html
		p("\n" + 
"    var cancel = function cancel(e) {e.preventDefault()}\n" + 
"    \n" + 
"    $('#new')\n" + 
"        .bind('dragover', cancel)\n" + 
"        .bind('dragenter', cancel)\n" + 
"        .bind('drop', function(e) {\n" + 
"            document.location = action({id: e.originalEvent.dataTransfer.getData('contactId')})            \n" + 
"        })\n" + 
"      \n" + 
"    $('[draggable]').bind('dragstart', function(e) {\n" + 
"        e.originalEvent.dataTransfer.setData('contactId', $(this).attr('contactId'));\n" + 
"        e.originalEvent.dataTransfer.setDragImage(dragIcon, 0, -10);\n" + 
"    })\n" + 
"    \n" + 
"</script>\n");// line 68, listAll.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("List of all");;
	}
}
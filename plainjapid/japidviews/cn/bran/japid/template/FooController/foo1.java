//version: 0.9.37
package japidviews.cn.bran.japid.template.FooController;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import japidviews._layouts.*;
import japidviews._tags.*;
//
// NOTE: This file was generated from: japidviews/cn/bran/japid/template/FooController/foo1.html
// Change to this file will be lost next time the template file is compiled.
//
public class foo1 extends main
{
	public static final String sourceTemplate = "japidviews/cn/bran/japid/template/FooController/foo1.html";
	{
	}
	public foo1() {
	super((StringBuilder)null);
	}
	public foo1(StringBuilder out) {
		super(out);
	}
	public foo1(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"a",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.cn.bran.japid.template.FooController.foo1.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String a; // line 1, japidviews/cn/bran/japid/template/FooController/foo1.html
	public String render(String a) {
		this.a = a;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 1, japidviews/cn/bran/japid/template/FooController/foo1.html
		return getRenderResult().toString();
	}

	public static String apply(String a) {
		return new foo1().render(a);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, foo1.html
p("foo12: ");// line 3, foo1.html
		new taggy(foo1.this).render(a + "1"); // line 4, foo1.html// line 4, foo1.html
		;// line 4, foo1.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p("my view");;
	}
}
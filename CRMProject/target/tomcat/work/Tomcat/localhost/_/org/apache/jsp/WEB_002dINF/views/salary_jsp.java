/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-12-07 05:39:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class salary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("myFn:checkPermission", com._520it.crm.util.PermissionUtils.class, "checkPermission", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tld/myFn.tld", Long.valueOf(1480994776892L));
    _jspx_dependants.put("/WEB-INF/views/common.jsp", Long.valueOf(1480994737024L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>工资管理</title>\r\n");
      out.write("    ");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/js/jquery-easyui/themes/ui-pepper-grinder/easyui.css\"><!-- æ ·å¼æä»¶ -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/js/jquery-easyui/themes/icon.css\"> <!--å¾æ æ ·å¼  -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-easyui/jquery.min.js\"></script> <!-- jQueryæ ¸å¿åº -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-easyui/jquery.easyui.min.js\"></script>  <!-- EasyUIæ ¸å¿åº -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-easyui/base.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-easyui/datagrid-detailview.js\"></script>\r\n");
      out.write("<!-- æ ·å¼æä»¶ -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-easyui/jquery.portal.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/fancyBox/jquery.fancybox.pack.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/highcharts/highcharts.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/weather/js/jquery.leoweather.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/views/salary.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table id=\"salary_datagrid\">\r\n");
      out.write("\t <thead>   \r\n");
      out.write("        <tr>   \r\n");
      out.write("            <th data-options=\"field:'xxx',width:100, align: 'center' ,formatter:employeeIdFormatter\">员工编号</th>   \r\n");
      out.write("            <th data-options=\"field:'year',width:100, align: 'center',formatter:dateYearFormatter\">年份</th>   \r\n");
      out.write("            <th data-options=\"field:'month',width:100, align: 'center',formatter:dateMonthFormatter\">月份</th>   \r\n");
      out.write("            <th data-options=\"field:'salary',width:100, align: 'center'\">工资</th>  \r\n");
      out.write("            <th data-options=\"field:'employee',width:100, align: 'center',formatter:employeeFormatter \">用户名称</th>   \r\n");
      out.write("        </tr>   \r\n");
      out.write("    </thead>\r\n");
      out.write("\t\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("  ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/salary.jsp(25,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myFn:checkPermission('com._520it.crm.web.controller.CheckInController:AddCheckIn')}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <div id=\"salary_datagrid_btn\">\r\n");
        out.write("\t\t    <div>\r\n");
        out.write("\t\t        <form id=\"salary_searchForm\">\r\n");
        out.write("\t\t          年份:<input type=\"number\"  name=\"year\"  min=\"2000\" max=\"2100\">\r\n");
        out.write("\t\t           月份:<input type=\"number\"  name=\"month\"  min=\"1\" max=\"12\">\r\n");
        out.write("\t\t     \t  员工姓名:<input type=\"text\" name=\"keyword\">\r\n");
        out.write("\t\t            <a class=\"easyui-linkbutton\" iconCls=\"icon-search\" data-cmd=\"searchContent\">查询</a>\r\n");
        out.write("\t\t        </form>\r\n");
        out.write("\t\t    </div>\r\n");
        out.write("\t\t        \r\n");
        out.write("\t\t        <div>\r\n");
        out.write("\t\t         <form method=\"post\" id=\"salary_upload_form\" enctype=\"multipart/form-data\">\r\n");
        out.write("\t\t                <input type=\"file\" name=\"file\">\r\n");
        out.write("\t\t                <a class=\"easyui-linkbutton\" iconCls=\"icon-print\" data-cmd=\"uploadFile\">导入excel文件</a>\r\n");
        out.write("\t\t         </form>\r\n");
        out.write("\t\t      </div>\r\n");
        out.write("    </div>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-12-07 03:31:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customerChart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/common.jsp", Long.valueOf(1480994737024L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>员工管理</title>\r\n");
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
      out.write("    <script type=\"text/javascript\" src=\"/js/views/customerChart.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table id=\"customerChart_datagrid\"></table>\r\n");
      out.write("\r\n");
      out.write("<!-- 定义数据表格按钮 -->\r\n");
      out.write("<div id=\"customerChart_datagrid_bt\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <form id=\"customerChart_searchForm\">\r\n");
      out.write("            关键字:<input type=\"text\" name=\"keyword\">\r\n");
      out.write("            日期:<input id=\"begin\" class=\"easyui-datebox\" name=\"beginDate\">\r\n");
      out.write("            -\r\n");
      out.write("            <input id=\"end\" class=\"easyui-datebox\" name=\"endDate\">\r\n");
      out.write("            <a class=\"easyui-linkbutton\" iconCls=\"icon-search\" data-cmd=\"searchContent\">查询</a>\r\n");
      out.write("            分组信息:\r\n");
      out.write("            <select id=\"becometime_group\" class=\"easyui-combobox\" name=\"time\" style=\"width:200px;\">\r\n");
      out.write("                <option value=\"year\">年份</option>\r\n");
      out.write("                <option value=\"month\">月份</option>\r\n");
      out.write("                <option value=\"quarter\">季度</option>\r\n");
      out.write("            </select>\r\n");
      out.write("\r\n");
      out.write("            <a class=\"easyui-linkbutton\" iconCls=\"icon-reload\" plain=\"true\" data-cmd=\"refresh\">刷新</a>\r\n");
      out.write("\r\n");
      out.write("            生成图表:\r\n");
      out.write("            <select id=\"photo_group\" class=\"easyui-combobox\" name=\"photo\" style=\"width:200px;\">\r\n");
      out.write("                <option value=\"line\">线形图</option>\r\n");
      out.write("                <option value=\"column\">柱状图</option>\r\n");
      out.write("                <option value=\"pie\">饼状图</option>\r\n");
      out.write("            </select>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-04 09:39:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.webpage.modules.bpm.task.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class taskProcessList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.jeeplus.common.config.Global.class, "getAdminPath", new Class[] {});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getInstance();
  _jspx_fnmap_1.mapFunction("fns:toJson", com.jeeplus.core.mapper.JsonMapper.class, "toJsonString", new Class[] {java.lang.Object.class});
  _jspx_fnmap_1.mapFunction("fns:getDictList", com.jeeplus.modules.sys.utils.DictUtils.class, "getDictList", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/WEB-INF/tlds/menu.tld", Long.valueOf(1532968850000L));
    _jspx_dependants.put("/webpage/include/bootstraptable.jsp", Long.valueOf(1532968848000L));
    _jspx_dependants.put("/webpage/include/treeview.jsp", Long.valueOf(1532968848000L));
    _jspx_dependants.put("/webpage/modules/bpm/task/process/taskProcessList.js", Long.valueOf(1532968848000L));
    _jspx_dependants.put("/webpage/include/taglib.jsp", Long.valueOf(1532968848000L));
    _jspx_dependants.put("/WEB-INF/tlds/fns.tld", Long.valueOf(1532968850000L));
    _jspx_dependants.put("/WEB-INF/tlds/shiros.tld", Long.valueOf(1532968850000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fid_005fclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fid_005fclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fid_005fclass.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>发起流程管理</title>\n");
      out.write("\t<meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\">\n");
      out.write("\t<meta name=\"decorator\" content=\"ani\"/>\n");
      out.write("\t");
      out.write("\n");
      out.write("<!--è¿éå¼å¥bootstrap-table ä¾èµçæä»¶ï¼bootstrap-table.jså·²ç»åå¹¶å¨vendor.jsä¸­-->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxStatic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugin/bootstrapTable/bootstrap-table-zh-CN.js\"></script> \n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxStatic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugin/bootstrapTable/bootstrap-table-contextmenu.js\"></script> \n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxStatic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugin/bootstrapTable/bootstrap-table-export.js\"></script> \n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxStatic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugin/bootstrapTable/tableExport.js\"></script> \n");
      out.write('\n');
      out.write('	');
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxStatic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugin/jstree/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxStatic}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugin/jstree/jstree.min.js\" type=\"text/javascript\"></script>\n");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("<script>\n");
      out.write("$(document).ready(function() {\n");
      out.write("\t$('#processTable').bootstrapTable({\n");
      out.write("\t\t \n");
      out.write("\t\t  //请求方法\n");
      out.write("\t\t\t\tmethod: 'post',\n");
      out.write("\t\t\t\t//类型json\n");
      out.write("\t\t\t\tdataType: \"json\",\n");
      out.write("\t\t\t\tcontentType: \"application/x-www-form-urlencoded\",\n");
      out.write("\t\t\t\t//显示检索按钮\n");
      out.write("\t\t\t\tshowSearch: true,\n");
      out.write("               //显示刷新按钮\n");
      out.write("               showRefresh: true,\n");
      out.write("               //显示切换手机试图按钮\n");
      out.write("               showToggle: true,\n");
      out.write("               //显示 内容列下拉框\n");
      out.write("    \t       showColumns: true,\n");
      out.write("    \t       //显示到处按钮\n");
      out.write("    \t       showExport: true,\n");
      out.write("    \t       //显示切换分页按钮\n");
      out.write("    \t       showPaginationSwitch: true,\n");
      out.write("    \t       //最低显示2行\n");
      out.write("    \t       minimumCountColumns: 2,\n");
      out.write("               //是否显示行间隔色\n");
      out.write("               striped: true,\n");
      out.write("               //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）     \n");
      out.write("               cache: false,    \n");
      out.write("               //是否显示分页（*）  \n");
      out.write("               pagination: true,   \n");
      out.write("                //排序方式 \n");
      out.write("               sortOrder: \"asc\",  \n");
      out.write("               //初始化加载第一页，默认第一页\n");
      out.write("               pageNumber:1,   \n");
      out.write("               //每页的记录行数（*）   \n");
      out.write("               pageSize: 10,  \n");
      out.write("               //可供选择的每页的行数（*）    \n");
      out.write("               pageList: [10, 25, 50, 100],\n");
      out.write("               //这个接口需要处理bootstrap table传递的固定参数,并返回特定格式的json数据  \n");
      out.write("               url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/act/process/list/data\",\n");
      out.write("               //默认值为 'limit',传给服务端的参数为：limit, offset, search, sort, order Else\n");
      out.write("               //queryParamsType:'',   \n");
      out.write("               ////查询参数,每次调用是会带上这个参数，可自定义                         \n");
      out.write("               queryParams : function(params) {\n");
      out.write("               \tvar searchParam = $(\"#searchForm\").serializeJSON();\n");
      out.write("               \tsearchParam.pageNo = params.limit === undefined? \"1\" :params.offset/params.limit+1;\n");
      out.write("               \tsearchParam.pageSize = params.limit === undefined? -1 : params.limit;\n");
      out.write("               \tsearchParam.orderBy = params.sort === undefined? \"\" : params.sort+ \" \"+  params.order;\n");
      out.write("                   return searchParam;\n");
      out.write("               },\n");
      out.write("\t\t\t\tonShowSearch: function () {\n");
      out.write("\t\t\t\t\t$(\"#search-collapse\").slideToggle();\n");
      out.write("\t\t\t\t},\n");
      out.write("               //分页方式：client客户端分页，server服务端分页（*）\n");
      out.write("               sidePagination: \"server\",\n");
      out.write("               columns: [{\n");
      out.write("\t\t        checkbox: true\n");
      out.write("\t\t       \n");
      out.write("\t\t    }\n");
      out.write("\t\t\t,{\n");
      out.write("\t\t        field: 'category',\n");
      out.write("\t\t        title: '流程分类',\n");
      out.write("\t\t        sortable: true,\n");
      out.write("\t\t        formatter:function(value, row , index){\n");
      out.write("\t\t        \treturn jp.getDictLabel(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fns:toJson(fns:getDictList('act_category'))}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_1, false));
      out.write(", value, \"无分类\");\n");
      out.write("\t\t        }\n");
      out.write("\t\t       \n");
      out.write("\t\t    }\n");
      out.write("\t\t\t,{\n");
      out.write("\t\t        field: 'key',\n");
      out.write("\t\t        title: '流程标识',\n");
      out.write("\t\t        sortable: true,\n");
      out.write("\t\t\t    formatter:function (value, row, index) {\n");
      out.write("\t\t\t\t   return '<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/act/task/form?procDefId='+row.id+'\">'+row.key+'</a>';\n");
      out.write("\t\t\t    }\n");
      out.write("\t\t       \n");
      out.write("\t\t    }\n");
      out.write("\t\t\t,{\n");
      out.write("\t\t        field: 'name',\n");
      out.write("\t\t        title: '流程名称',\n");
      out.write("\t\t        sortable: true\n");
      out.write("\t\t       \n");
      out.write("\t\t    }\n");
      out.write("\t\t\t,{\n");
      out.write("\t\t        field: 'diagramResourceName',\n");
      out.write("\t\t        title: '流程图',\n");
      out.write("\t\t\t   formatter:function (value, row, index) {\n");
      out.write("\t\t\t\t   return \"<a  href=\\\"javascript:jp.openViewDialog('流程图','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/act/process/resource/read?procDefId=\"+row.id+\"&resType=image','1000px', '600px')\\\">\"+row.diagramResourceName+\"</a>\";\n");
      out.write("\t\t\t   }\n");
      out.write("\t\t       \n");
      out.write("\t\t    }\n");
      out.write("\t\t\t,{\n");
      out.write("\t\t        field: 'version',\n");
      out.write("\t\t        title: '流程版本',\n");
      out.write("\t\t        sortable: true\n");
      out.write("\t\t       \n");
      out.write("\t\t    }\n");
      out.write("\t\t\t,{\n");
      out.write("\t\t        field: 'deploymentTime',\n");
      out.write("\t\t        title: '更新时间',\n");
      out.write("\t\t\t   formatter:function (value, row, index) {\n");
      out.write("\t\t\t\t   return jp.dateFormat(value,\"yyyy-MM-dd hh:mm:ss\");\n");
      out.write("\t\t\t   }\n");
      out.write("\t\t       \n");
      out.write("\t\t    }, {\n");
      out.write("                       field: 'operate',\n");
      out.write("                       title: '操作',\n");
      out.write("                       align: 'center',\n");
      out.write("\t\t\t\t\t   formatter: function operateFormatter(value, row, index) {\n");
      out.write("\t\t\t\t\t\t   return [\n");
      out.write("\t\t\t\t\t\t\t   '<a class=\"start\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/act/task/form?procDefId=' + row.id + '&status=start\">【启动流程】</a>'].join('');\n");
      out.write("\t\t\t\t\t   }\n");
      out.write("                   }\n");
      out.write("\t\t     ]\n");
      out.write("\t\t\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t  \n");
      out.write("\t  if(navigator.userAgent.match(/(iPhone|iPod|Android|ios)/i)){//如果是移动端\n");
      out.write("\n");
      out.write("\t\t \n");
      out.write("\t\t  $('#processTable').bootstrapTable(\"toggleView\");\n");
      out.write("\t\t}\n");
      out.write("\t  \n");
      out.write("\n");
      out.write("\n");
      out.write("\t  $(\"#search\").click(\"click\", function() {// 绑定查询按扭\n");
      out.write("\t\t  $('#processTable').bootstrapTable('refresh');\n");
      out.write("\t\t});\n");
      out.write("\t \n");
      out.write("\t $(\"#reset\").click(\"click\", function() {// 绑定查询按扭\n");
      out.write("\t\t  $(\"#searchForm  input\").val(\"\");\n");
      out.write("\t\t  $(\"#searchForm  select\").val(\"\");\n");
      out.write("\t\t  $(\"#searchForm  .select-item\").html(\"\");\n");
      out.write("\t\t  $('#processTable').bootstrapTable('refresh');\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\t\t\n");
      out.write("  function getIdSelections() {\n");
      out.write("        return $.map($(\"#processTable\").bootstrapTable('getSelections'), function (row) {\n");
      out.write("            return row.id\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("  \n");
      out.write("\n");
      out.write("</script>");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"wrapper wrapper-content\">\n");
      out.write("\t<div class=\"panel panel-primary\">\n");
      out.write("\t<div class=\"panel-heading\">\n");
      out.write("\t\t<h3 class=\"panel-title\">发起流程列表</h3>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"panel-body\">\n");
      out.write("\n");
      out.write("\t<!-- 搜索 -->\n");
      out.write("\t<div id=\"search-collapse\" class=\"collapse\">\n");
      out.write("\t\t<div class=\"accordion-inner\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- 表格 -->\n");
      out.write("\t<table id=\"processTable\"  ></table>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /webpage/include/taglib.jsp(11,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /webpage/include/taglib.jsp(11,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}${fns:getAdminPath()}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /webpage/include/taglib.jsp(12,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("ctxStatic");
    // /webpage/include/taglib.jsp(12,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/static", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fid_005fclass.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /webpage/modules/bpm/task/process/taskProcessList.jsp(23,3) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setId("searchForm");
    // /webpage/modules/bpm/task/process/taskProcessList.jsp(23,3) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "class", "form form-horizontal well clearfix");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t <div class=\"col-xs-12 col-sm-6 col-md-4\">\n");
          out.write("\t\t\t\t<label class=\"label-item single-overflow pull-left\" title=\"流程分类：\">流程分类：</label>\n");
          out.write("\t\t\t\t <select id=\"category\" name=\"category\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t <option value=\"\">全部分类</option>\n");
          out.write("\t\t\t\t\t ");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t </select>\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t <div class=\"col-xs-12 col-sm-6 col-md-4\">\n");
          out.write("\t\t\t<div style=\"margin-top:26px\">\n");
          out.write("\t\t\t  <a  id=\"search\" class=\"btn btn-primary btn-rounded  btn-bordered btn-sm\"><i class=\"fa fa-search\"></i> 查询</a>\n");
          out.write("\t\t\t  <a  id=\"reset\" class=\"btn btn-primary btn-rounded  btn-bordered btn-sm\" ><i class=\"fa fa-refresh\"></i> 重置</a>\n");
          out.write("\t\t\t </div>\n");
          out.write("\t    </div>\t\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fid_005fclass.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /webpage/modules/bpm/task/process/taskProcessList.jsp(28,6) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fns:getDictList('act_category')}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_1, false));
    // /webpage/modules/bpm/task/process/taskProcessList.jsp(28,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("dict");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dict.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dict.value==category?'selected':''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dict.label}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t\t ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}

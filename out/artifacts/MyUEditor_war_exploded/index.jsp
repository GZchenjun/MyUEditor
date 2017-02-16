<%--
  Created by IntelliJ IDEA.
  User: interface
  Date: 2017/2/7
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
  <head>
    <title>UEditor编辑器</title>
      <!-- 配置文件 -->
      <script type="text/javascript" src="<%=path%>/utf8-jsp/ueditor.config.js"></script>
      <!-- 编辑器源码文件 -->
      <script type="text/javascript" src="<%=path%>/utf8-jsp/ueditor.all.js"></script>
      <script type="text/javascript" src="<%=path %>/utf8-jsp/lang/zh-cn/zh-cn.js"></script>
      <script type="text/javascript" src="<%=path%>/js/jquery-3.1.1.min.js"></script>

      <!-- 实例化编辑器 -->
      <script type="text/javascript">
          var ue = UE.getEditor('container');
      </script>
      <script>
          function getContent(){
              alert(UE.getEditor('container').getContent());
              $(".cont").val(UE.getEditor('container').getContent());
          }

      </script>
  </head>
  <body>
  <!-- 加载编辑器的容器 -->
  <script id="container" name="content" type="text/plain" style="width:100%;height:500px;"></script>
  <a href="javascript:;" onclick="getContent();" style="text-decoration:none;">获取文本内容</a>
  <form action="<%=path%>/con/saveText" method="post">
      <input type="hidden" name="content"  class="cont"/>
      <input type="submit" value="保存"/>
  </form>
  </body>
</html>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
<script type="text/javascript">
function filego(pagenum){
	if(pagenum == 1){
		document.fileform.action = "fileupload.do";
	}else{
	}
	
	document.fileform.submit();
}

</script>
</head>
<!-- <form method="post" enctype="multipart/form-data" action="">
<input type="file" name="filename1" size=40>
<input type="submit" value="���ε�"><br><br>
</form> -->



<body>
<jsp:include page="header.jsp" flush="true"/>
    <form id="frm" name="frm" enctype="multipart/form-data">
        <table class="board_view">
            <colgroup>
                <col width="15%">
                <col width="*"/>
            </colgroup>
            <caption>�Խñ� �ۼ�</caption>
            <tbody>
                <tr>
                    <th scope="row">����</th>
                    <td><input type="text" id="TITLE" name="TITLE" class="wdp_90"></input></td>
                </tr>
                <tr>
                    <td colspan="2" class="view_text">
                        <textarea rows="20" cols="100" title="����" id="CONTENTS" name="CONTENTS"></textarea>
                    </td>
                </tr>
            </tbody>
        </table>
        <input type="file" name="file">
        <br/><br/>
         
        <a href="#this" class="btn" id="write">�ۼ��ϱ�</a>
        <a href="#this" class="btn" id="list">�������</a>
    </form>
     
    
    <script type="text/javascript">
        $(document).ready(function(){
            $("#list").on("click", function(e){ //������� ��ư
                e.preventDefault();
                fn_openBoardList();
            });
             
            $("#write").on("click", function(e){ //�ۼ��ϱ� ��ư
                e.preventDefault();
                fn_insertBoard();
            });
        });
         
        function fn_openBoardList(){
            var comSubmit = new ComSubmit();
            comSubmit.setUrl("<c:url value='/sample/openBoardList.do' />");
            comSubmit.submit();
        }
         
        function fn_insertBoard(){
            var comSubmit = new ComSubmit("frm");
            comSubmit.setUrl("<c:url value='/sample/insertfile.do' />");
            comSubmit.submit();
        }
    </script>
</body>
</html>
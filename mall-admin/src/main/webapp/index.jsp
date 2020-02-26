<%@ page language="java"  contentType="text/html; charset=UTF-8" %>

<html>
<body>
<h2>Hello World!</h2>

<h3>测试Jenkins部署+钩子Github-Webhooks</h3>
<h3>测试NATAPP+Nginx</h3>

上传文件
<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="上传文件" />
</form>


富文本图片上传文件
<form name="form2" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="富文本图片上传文件" />
</form>

</body>
</html>

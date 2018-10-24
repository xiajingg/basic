<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>password</td>
        <td>email</td>
    </tr>
    </thead>
    <tbody>
    <#list userPOS as userPO>
    <tr>
        <td>${userPO.id}</td>
        <td>${userPO.name}</td>
        <td>${userPO.password}</td>
        <td>${userPO.email}</td>
    </tr>
    </#list>
    </tbody>
</table>
</body>
</html>
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
        <td>title</td>
        <td>text</td>
        <td>time</td>
        <td>userid</td>
    </tr>
    </thead>
    <tbody>
    <#list notePOS as notePO>
    <tr>
        <td>${notePO.id}</td>
        <td>${notePO.title}</td>
        <td>${notePO.text}</td>
        <td>${notePO.time}</td>
        <td>${notePO.userid}</td>
    </tr>
    </#list>
    </tbody>
</table>
</body>
</html>
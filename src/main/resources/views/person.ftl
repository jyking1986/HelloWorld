<#-- @ftlvariable name="" type="com.example.helloworld.views.PersonView" -->
<html>
<head>
    <#include "common/head.ftl">
    <link type="text/css" rel="stylesheet" href="/styles/app.css"/>
    <script src="/scripts/app.js"></script>
</head>
<body>
<!-- calls getPerson().getName() and sanitizes it -->
<h1>Hello, ${person.name?html}!</h1>
</body>
</html>
<#-- @ftlvariable name="" type="com.example.helloworld.views.BaseView" -->
<html>
<head>
<#include "../common/head.ftl">
    <link type="text/css" rel="stylesheet" href="/styles/app.css"/>
    <script src="/scripts/app.js"></script>
</head>
<body>
<#include "../common/navigation.ftl">
<!-- calls getPerson().getName() and sanitizes it -->
<h1>Hello, ${person.name?html}!</h1>
<h2> you are welcomed to the about page</h2>
</body>
</html>
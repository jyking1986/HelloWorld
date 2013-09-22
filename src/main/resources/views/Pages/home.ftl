<#-- @ftlvariable name="" type="com.example.helloworld.views.BaseView" -->
<html>
<head>
<#include "../common/head.ftl">
    <link type="text/css" rel="stylesheet" href="/styles/app.css"/>

    <script type="text/javascript" src="/scripts/jquery-1.4.2.min.js"></script>
    <script src="/scripts/app.js"></script>
</head>
<body>
<#include "../common/navigation.ftl">
<!-- calls getPerson().getName() and sanitizes it -->
<h1>Hello, ${person.name?html}!</h1>
<h2> you are welcomed to the home page</h2>
</body>
</html>
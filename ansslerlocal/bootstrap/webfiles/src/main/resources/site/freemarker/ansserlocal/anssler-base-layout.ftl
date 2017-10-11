<!doctype html>
<#include "../include/imports.ftl">
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="<@hst.webfile path="/css/style.css"/>" type="text/css"/>
    <@hst.defineObjects/>
    <#if hstRequest.requestContext.cmsRequest>
      <link rel="stylesheet" href="<@hst.webfile path="/css/cms-request.css"/>" type="text/css"/>
    </#if>
<@hst.headContributions categoryExcludes="htmlBodyEnd, scripts" xhtml=true/>
</head>
<body>
<div class="main">
    <div id="header">
    <div id="logo">
        <div id="logo_text">
          <h1><a href="index.html">simple<span class="logo_colour">style_purple</span></a></h1>
          <h2>Simple. Contemporary. Website Template.</h2>
        </div>
     </div>
     <div id="menubar">
        <@hst.include ref="menu"/>
      </div>	
        
    </div>
    <div id="site_content">
		<div id="banner">
			<@hst.include ref="banner"/>
		</div>
		<@hst.include ref="site_content"/>
    </div>
    <div class="footer">
        <@hst.include ref="footer"/>
    </div>
</div>
<@hst.headContributions categoryIncludes="htmlBodyEnd, scripts" xhtml=true/>
</body>
</html>
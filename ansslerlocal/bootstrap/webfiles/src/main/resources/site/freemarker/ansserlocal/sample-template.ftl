<#include "../../include/imports.ftl">
<#assign hst=JspTaglibs["http://www.hippoecm.org/jsp/hst/core"] >
<html>
<head>
</head>
<body>
  <#if document??>
    <h1>${document.title?html}</h1>
    <div>
    	<@hst.html hippohtml="${document.introduction}" />
    </div>
    <div>
    	<@fmt.formatDate type="date" pattern="yyyy-MM-dd" value="${document.documentdate.time}"/>
    </div>
    <#else>
      <h1>Goodbye? cruel world [Inside else part of *document]</h1>
  </#if>
</body>
</html>
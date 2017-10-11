<#include "../include/imports.ftl">

<@hst.setBundle basename="essentials.homepage"/>
<div>
  <h1><@fmt.message key="homepage.title" var="title"/>${title?html}</h1>
  <p><@fmt.message key="homepage.text" var="text"/>${text?html}</p>
    <#if !hstRequest.requestContext.cmsRequest>
        <p>
            Custom Layout One : Testing layout customized.
        </p>
    </#if>
</div>
<@hst.include ref="container"/>

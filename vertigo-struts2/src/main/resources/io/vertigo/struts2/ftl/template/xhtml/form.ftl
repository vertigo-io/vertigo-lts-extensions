<#--
/*
 * $Id: form.ftl,v 1.1 2013/09/23 16:25:43 npiedeloup Exp $
 */
-->
<#if mode.theme != 'xhtml'>
	<@s.set var="theme" value="'${mode.theme}'"/>
</#if>
<#include "/${parameters.templateDir}/simple/form.ftl" />
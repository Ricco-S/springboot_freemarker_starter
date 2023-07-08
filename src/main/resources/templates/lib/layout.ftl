<#macro page
    brand="RS TEST"
	title=""
    wrapperClass=""
    htmlHeaderTags=""

>

<!-- Head  -->
<!DOCTYPE html>
<html lang="de">
<head>
<#include "head.ftl">
<title>${title} | ${brand}</title>
${htmlHeaderTags}
</head>



<body class="content">
<#include "nav.ftl">


<div class="wrapper ${wrapperClass}">


</div>
<#nested>

<#include "footer.ftl">   
<#include "footerscripts.ftl">  
    

</body>
</html>
</#macro>


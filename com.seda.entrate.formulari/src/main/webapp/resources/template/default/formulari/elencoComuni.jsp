<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="x" uri="http://template.seda.it/tags" %>

<x:datagrid action="elencoComuni?_eventId=cerca" pageset="${elencoComuni}" var="comuneRow">
	<x:dgcolumn title="${x:i18n('elencoComuni.codiceBelfiore')}">${comuneRow.codiceBelfiore}</x:dgcolumn>
	<x:dgcolumn title="${x:i18n('elencoComuni.descrizioneComune')}">${comuneRow.descrizioneComune}</x:dgcolumn>
</x:datagrid>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<spring:htmlEscape defaultHtmlEscape="true" />

    <div class="back-link border">
        <a href="support-tickets">
            <span class="glyphicon glyphicon-chevron-left"></span>
        </a>
        <span class="label"><spring:theme code="text.account.supporttickets" text="Support Tickets" /></span>
    </div>

    <div class="account-section-content col-md-6">
        <form:form method="post" commandName="supportTicketForm" class="account-section-form">
            <formElement:formInputBox idKey="text.account.supporttickets.createTicket.subject" labelKey="text.account.supporttickets.createTicket.subject" path="subject" inputCSS="text" mandatory="true" />
            <formElement:formTextArea idKey="text.account.supporttickets.createTicket.message" labelKey="text.account.supporttickets.createTicket.message" path="message" mandatory="true" areaCSS="form-control" labelCSS="control-label"/>

            <!-- Associated Objects -->
            <c:if test="${not empty associatedObjects}">
                <div class="form-group">
                <label class="control-label" for="text.account.supporttickets.createTicket.associatedTo.option1"> <spring:theme code="text.account.supporttickets.createTicket.associatedTo" text="Associated To"/></label>

                <form:select path="associatedTo" cssClass="form-control">
                    <option><spring:theme code="text.account.supporttickets.createTicket.associatedTo.option1" text="Please select"></spring:theme></option>
                    <c:forEach var="associatedMap" items="${associatedObjects}">
                        <c:forEach var="associatedItem" items="${associatedMap.value}">
                            <form:option value="${associatedMap.key}=${associatedItem.code}">
                            <spring:message code="text.account.supporttickets.createTicket.${associatedMap.key}"/>: ${associatedItem.code}; <spring:message code="text.account.supporttickets.createTicket.updated"/>: <fmt:formatDate pattern="dd/MM/yy" value="${associatedItem.modifiedtime}"/>
                            </form:option>
                        </c:forEach>
                    </c:forEach>
                </form:select>
                </div>
            </c:if>

            <!-- Ticket Categories -->
            <c:if test="${not empty categories}">
                <div class="form-group">
                    <label class="control-label" for="text.account.supporttickets.createTicket.ticketCategory"> <spring:theme code="text.account.supporttickets.createTicket.ticketCategory" text="Category"/></label>

                    <form:select path="ticketCategory" cssClass="form-control">
                        <c:forEach var="category" items="${categories}">
                            <form:option value="${category}"><spring:message code="text.account.supporttickets.createTicket.ticketCategory.${category}"/></form:option>
                        </c:forEach>
                    </form:select>
                </div>
            </c:if>

            <div id="customer-ticketing-buttons" class="form-actions">
                <div class="accountActions clearfix">
                    <div class="col-sm-6 col-sm-push-6 accountButtons">
                        <ycommerce:testId code="supportTicket_create_button">
                            <button class="btn btn-primary btn-block" type="submit" id="addTicket">
                            <spring:theme code="text.account.supporttickets.createTicket.submit" text="Submit"/>
                            </button>
                        </ycommerce:testId>
                    </div>

                    <div class="col-sm-6 col-sm-pull-6 accountButtons">
                        <a href="support-tickets" class="btn btn-default btn-block">
                            <spring:theme code="text.account.supporttickets.createTicket.back" text="Cancel" />
                        </a>
                    </div>
                </div>
            </div>
        </form:form>
    </div>

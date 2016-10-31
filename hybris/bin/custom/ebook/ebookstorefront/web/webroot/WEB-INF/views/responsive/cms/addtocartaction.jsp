<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<c:url value="${url}" var="addToCartUrl"/>

<div id="attributesId">

<%-- BookRating:<c:out value="${attributesList.get(0)}"/><br><br>
BookCustomerSatisfaction :<c:out value="${attributesList.get(1)}"/><br><br> --%>

      <c:forEach items="${product.bookRating}" var="bookRating">
		<input type="checkbox" name="bookRating" value="${attributesList.get(0)}" /> 
		 Books Rating:${attributesList.get(0)}
		 </c:forEach> 
		<br>
		<c:forEach items="${product.bookCustomerSatisfaction}" var="bookCustomerSatisfaction">
		<input type="checkbox" name="bookCustomerSatisfaction" value="${attributesList.get(1)}" />
		BookCustomerSatisfaction:${attributesList.get(1)}
	</c:forEach>
	

</div>


<div id="addToCartTitle" style="display:none"><spring:theme code="basket.added.to.basket"/></div>
<form:form method="post" id="ebookAddToCartForm" class="add_to_cart_form" action="${addToCartUrl}">
<c:if test="${product.purchasable}">
	<input type="hidden" maxlength="3" size="1" id="qty" name="qty" class="qty js-qty-selector-input" value="1">
    <input type="hidden" id="addons" name="addons" value="">
</c:if>
<input type="hidden" name="productCodePost" value="${product.code}"/>

<c:if test="${empty showAddToCart ? true : showAddToCart}">
	<c:set var="buttonType">button</c:set>
	<c:if test="${product.purchasable and product.stock.stockLevelStatus.code ne 'outOfStock' }">
		<c:set var="buttonType">submit</c:set>
	</c:if>
	<c:choose>
		<c:when test="${fn:contains(buttonType, 'button')}">
			<button type="${buttonType}" class="btn btn-primary btn-block js-add-to-cart btn-icon glyphicon-shopping-cart outOfStock" disabled="disabled">
				<spring:theme code="product.variants.out.of.stock"/>
			</button>
		</c:when>
		<c:otherwise>
			<ycommerce:testId code="addToCartButton">
				<button id="addToCartButton" onclick="selectaddons()" type="${buttonType}" class="btn btn-primary btn-block js-add-to-cart js-enable-btn btn-icon glyphicon-shopping-cart" disabled="disabled">
					<spring:theme code="basket.add.to.basket"/>
				</button>
			</ycommerce:testId>
		</c:otherwise>
	</c:choose>

</c:if>
</form:form>

<script type="text/javascript">
function selectaddons()
{
alert("hi");
var allAddons =[];
var i=0;

$("#attributesId input[type=checkbox]:checked").each(function(){
	allAddons[i] = $(this).val();
	i=i+1;
});
document.getElementById('addons').value = allAddons;
alert(document.getElementById('addons').value);
}
</script>


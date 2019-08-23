<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.sbs.cuni.dto.Member"%>
<%@ page import="com.sbs.cuni.dto.CounselReservation"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="pageTitle" value="예약조회" />
<%@ include file="../part/head.jspf"%>

<div class="article-detail table-common con">
	<table>
		<colgroup>
			<col width="80">
		</colgroup>
		<tbody>
			<tr>
				<th>예약번호</th>
				<td><c:out value="${member.name}" escapeXml="true" /></td>
			</tr>
			<tr>
				<th>예약날짜</th>
				<td><c:out value="${cr.regDate}" /></td>
			</tr>
			<tr>
				<th>진료과</th>
				<td><c:out value="${member.name}" escapeXml="true" /></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><c:out value="${member.loginId}" /></td>
			</tr>
		</tbody>
	</table>
</div>


<%@ include file="../part/foot.jspf"%>
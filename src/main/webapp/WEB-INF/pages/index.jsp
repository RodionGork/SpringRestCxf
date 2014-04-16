<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
    <title>Product Groups - Demo Shop</title>
</head>
<body>
<div class="container">
    <h2>Add Group</h2>
    <c:url var="urlAddGroup" value="addgroup"/>
    <form method="post" action="${urlAddGroup}">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form>

    <h2>Add Product</h2>
    <c:url var="urlAddProd" value="addprod"/>
    <form method="post" action="${urlAddProd}">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>Group:</td>
                <td><input type="text" name="group"/></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>

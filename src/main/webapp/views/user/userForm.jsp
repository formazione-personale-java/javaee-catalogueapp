<%@ include file="/views/common/header.jsp"%>
<form action="new" method="post">
    <input type="hidden" name="id" value="" />
    <label for>Name</label>
    <input type="text" name="name" value="" required>

    <label for>Email</label>
    <input type="email" name="email" value="" required>

    <button type="submit">Save</button>
</form>
<%@ include file="/views/common/footer.jsp"%>
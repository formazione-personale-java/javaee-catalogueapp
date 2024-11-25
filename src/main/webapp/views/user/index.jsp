<!-- /WEB-INF/views/templates/mainTemplate.jsp -->
<%@ include file="/views/common/header.jsp" %>
<h1>Liste des Users</h1>
<div class="row">
  <div class="col-6">${path}</div>
    <div class="col-6"><a href="new"class="btn btn-success" >  createNewUser</a> </div>
</div>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>Email</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>John</td>
            <td>Doe</td>
            <td>john@example.com</td>
        </tr>
        <tr>
            <td>Mary</td>
            <td>Moe</td>
            <td>mary@example.com</td>
        </tr>
        <tr>
            <td>July</td>
            <td>Dooley</td>
            <td>july@example.com</td>
        </tr>
        </tbody>
    </table>
</div>


<%@ include file="/views/common/footer.jsp" %>
<%@ include file="common/header.jsp" %>
<%@ include file="common/navigation.jsp" %>
<style>
.container1{
    margin-top: 10%;
    margin-left: 35%;
    border:#bbb;
    position: absolute;
}
</style>
<div class="container1" align="center">
 <form class="form-signin" method="post" action="/login" >
   <div class="form-group row">
    <label for="inputEmail3" class="col-form-label">Email</label>
    <div class="col-sm-8">
      <input type="email" class="form-control" id="email" placeholder="Email">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-form-label">Password</label>
    <div class="col-sm-8">
      <input type="password" class="form-control" id="password" placeholder="Password">
    </div>
  </div>
  <button class="btn btn-lg btn-primary float-right"  type="submit">Sign in</button>
</form>
</div>
<%@ include file="common/footer.jsp" %>
<h1>CRM - Customer Relationship Management</h1>
<p>CRM is a web application to manage a company's interaction with current and potential customers.</p>


<h1>Motivation</h1>
The purpose of this app is to show CRUD(Create, Read, Update, Delete) operation using Spring MVC. 

<h1>Screenshots</h1>
<img src="https://github.com/FMasnaga/TodoApp/blob/master/img/dashboard.png">
<br/>
<br/>
<br/>
<br/>
<img src="https://github.com/FMasnaga/TodoApp/blob/master/img/update.png">


<h1>Tech/framework used</h1>
<ul>
  <li>Java</li>
  <li>Spring</li>
  <li>HTML & CSS</li>
  <li>Hibernate</li>
  <li>MySQL</li>
</ul>


<h1>Features</h1>
<ul>
  <li> MVC pattern</li>
  <li>CRUD operation</li>
  <li>Object Oriented  Patterns such as : Service layer pattern and DAO</li>
  <li>Routing</li>
  <li>Transaction</li>
</ul>

<h1>Installation</h1>
<p>Dotnet and angular installation are required to run this application. Below are steps to install them.</p>
<ul>
	<li>Install dotnet core version 2.1 or later from here https://dotnet.microsoft.com/download</li>
	<li>open terminal or command prompt to Install a package manager for Node.js by using this command "npm install"</li>
	<li>Install angular version 7 or later by using this command "Install npm install -g @angular/cli"</li>
</ul>
<br/>
<br/>
<p>After dotnet and angular are installed, below are steps to build and deploy this application.</p>
<ol>
	<li>Clone TodoApp from this link https://github.com/FMasnaga/TodoApp.git</li>
	<img src="https://github.com/FMasnaga/TodoApp/blob/master/img/clone.png">
	<br/>
	<br/>
	<li>Open Terminal or Command Prompt, navigate to TODO.API sub-folder</li>
	<li>Build database migration by using this command "dotnet ef migrations add InitialCreate"</li>
	<li>Update database by using this command "dotnet ef database update"</li>
	<img src="https://github.com/FMasnaga/TodoApp/blob/master/img/database.png">
	<br/>
	<br/>
	<li>run the api by using this command "dotnet watch run"</li>
	<img src="https://github.com/FMasnaga/TodoApp/blob/master/img/dotnetrun.png">
	<br/>
	<br/>
	<li>open a new terminal and navigate to TODO-SPA sub-folder</li>
	<li>Now, run the front end application by using this command "ng serve --o" </li>
	<img src="https://github.com/FMasnaga/TodoApp/blob/master/img/angular.png">
</ol>
<br/>
  
<h1>Contribute</h1>
<p>Below are list of things you can contribute or improve this application:</p>
<ul>
  <li>Improve UI by adding bootstrap</li>
  <li>Use Modal for update operation to make this application a Single Page Application</li>
  <li>Add User SignUp and Login functions</li>
</ul>

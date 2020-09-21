Feature('login');

let login = "/login";
let LoginForm = "LoginForm";
let username = "username";
let password = "password";
let LoginButton = "LogIn";

Scenario('test login', (I) => {
    I.amOnPage(login);
    I.seeElement(LoginForm);
    I.fillField(username,'test_username');
    I.fillField(password,'test_password');
    I.click(LoginButton);
    I.see('Connecté');
    I.wait(5);
});

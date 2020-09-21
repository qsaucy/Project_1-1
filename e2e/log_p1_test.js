Feature('log_p1');

let name = "toto";
let pass = "toto";

let address = "localhost:8080/Project_1/login"


Scenario('test login', (I) => {
    I.amOnPage(address);
    I.seeElement('login-form');
    I.fillField('uname',name);
    I.fillField('psw',pass);
    I.click('Login');
    I.wait(5);
});

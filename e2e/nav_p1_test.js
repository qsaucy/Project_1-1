Feature('nav_p1');

let connexionLink = "localhost:8080/Project_1/";

let accueil = "Acceuil";
let login = "Login";
let questions = "Questions";
let profil = "Profil";

Scenario('test Project 1 navigation', (I) => {
    I.amOnPage(connexionLink);
    I.wait(2);
    I.see(accueil);
    I.click(accueil);
    I.wait(2);
    I.see(login);
    I.click(login);
    I.wait(2);
    I.see(questions);
    I.click(questions);
    I.wait(2);
    I.see(profil);
    I.click(profil);
    I.wait(2);
});

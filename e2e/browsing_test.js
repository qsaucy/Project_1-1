Feature('browsing');

Scenario('test browsing', (I) => {
    //Index page to connection page
    I.amOnPage(host);
    I.see('Connection');
    I.clickLink('Connection');
    I.see('Page de connection');
    //Connection page to Enregistrement page
    I.see('S\'enregistrer');
    I.clickLink('S\'enregistrer');
    //Enregistrement page to Index page
    I.see('Retour');
    I.clickLink('Retour');
});
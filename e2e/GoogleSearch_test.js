Feature('GoogleSearch');

Scenario('test Searching', (I) => {
    I.amOnPage('https://www.google.com/');
    I.seeElement('form#tsf');
    I.fillField('q','Balzac');
    I.click('btnK');
    I.see('Honoré de Balzac');
    I.wait(5);
});

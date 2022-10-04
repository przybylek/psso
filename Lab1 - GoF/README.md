Lab 1 

I. Prototype
============

Zapoznać się z dotychczasową implementacją wzorca Prototype ([prototype\_OO\_stud.zip](./prototype_OO_stud.zip)). Aby zaimportować archiwum pod Eclipse należy wybrać: `File->Import...->General->Existing Projects into Workspace->Select archive file`.  
Stworzyć interfejs `IPrototype` wyposarzony w domyślne implementacje `shallowClone()` oraz `deepClone()` (wykorzystać _default methods_ wprowadzone w Java 8).  
Zmodyfikować klasę `Car` w taki sposób, aby zamiast dziedziczć po klasie `Prototype`, implementować interfejs `IPrototype`.  
Napisać testy _JUnit_ weryfikujące poprawne działanie metod kopiujących na obiektach `Car`.

II. Observer
============

Zapoznać się z programem _Game of Life_ ([Game\_of\_Life.zip](./Game_of_Life.zip)). Zrefaktoryzować program do postaci przedstawionej na poniższym diagramie wykorzystując wzorzec Observer. ![Game_of_Life_with_Observer](./Game_of_Life_with_Observer.jpg)
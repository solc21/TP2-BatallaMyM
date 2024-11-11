% estrategiaDefensa

% Predicado para seleccionar el personaje con mayor vida
seleccionar_objetivo_defensa(Objetivo) :-
    findall(Vida-Nombre, personaje(Nombre, Vida), Lista),
    sort(1, @>=, Lista, [_-Objetivo|_]).

    
% estrategiaAtaque.

% Predicado para seleccionar el compañero con menor o igual que 31 de vida
seleccionar_companero_debil(Companero) :-
    findall(Vida-Nombre, (personaje(Nombre, Vida), Vida < 31), Lista),
    sort(1, @=<, Lista, [_-Companero|_]).
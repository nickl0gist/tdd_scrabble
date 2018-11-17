# Wyniki w Scrabble

Oblicz wynik w Scrabble dla danego słowa.

## Wartości liter

Będziesz potrzebować tej tabeli:

```text
Litera                           Wartość
A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10
```

## Przykłady

Słowo "cabbage" powinno być policzone jako 14 punktów:

- 3 punkty dla C
- 1 punkt dla A, dwukrotnie
- 3 punkty dla B, dwukrotnie
- 2 punkty dla G
- 1 punkt dla E

Sumując:

- `3 + 2*1 + 2*3 + 2 + 1`
- = `3 + 2 + 6 + 3`
- = `5 + 9`
- = 14

# Uruchomienie testów

Możesz wywołać wszystkie testy pisząć następującą komendę

```sh
$ gradle test
```

w konsoli.

## Źródło

Zainspirowane projektem: [https://github.com/rchatley/extreme_startup](https://github.com/rchatley/extreme_startup)

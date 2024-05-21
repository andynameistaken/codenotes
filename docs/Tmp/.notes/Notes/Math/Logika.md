# Logika

## Zdania

---

### Zdanie Atomowe

- Zdanie, które ma wartość prawda albo fałsz, bez wzlędu na kontekst np.
  $x > 0$

### Zmiena Zdaniowa

- Litera, która określa dowolne zdanie.
- Jeśli za zmienną zdaniową p podstawiono zdanie prawdziwe,
  to mówimy, że dokonano podstawienia p = 1

### Zdanie

- Wyrażenie złożone ze zdań atomowych połączonych spójnikami logicznymi
- Przykład: $x > 0 \iff x^2 > 0$

### Formuła Zdaniowa

- Zdania lub zmienne zdaniowe połączone spójnikami logicznymi
- **Przykłady:**
  - $p \land q \implies p \lor q$
  - $1 + 1 = 0$

## Warunki

---

### Warunek Konieczny

- Wniosek wypływający z danego faktu.
- Jeżeli fakt ma zaistnieć, to zaistnieć (koniecznie) musi również fakt będący wnioskiem.
- *Przykład*
  - $\lnot p   \implies \lnot q$
    - p jest warunkiem koniecznym dla q, bo gdyby p nie zachodziło, to nie zajdzie również q
  - $p \implies q$
    - q jest warunkiem koniecznym dla p
  - Podzielność liczby całkowitej przez 2 i przez 3 jest warunkiem koniecznym i wystarczającym podzielności tej liczby przez 6.

### Warunek Dostateczny (wystarczający)

- to taki, który, gdy wystąpi warunek konieczny (warunek wystarczający nie musi być warunkiem koniecznym) wystarcza, żeby jakiś fakt zachodził
- **Przykłady:**
  - $p \implies q$
    - p jest warunkiem dostatecznym (i niewystarczającym), bo jeśli tylko zachodzi p, to zachodzi również q.
  - jeżeli liczba jest podzielna przez 10, to jest podzielna przez 5.
    - Fakt podzielności przez 10 jest warunkiem wystarczającym dla podzielności przez 5
    - Fakt podzielności przez 5 jest **warunkiem koniecznym** dla podzielności przez 10.
  - warunkiem koniecznym i dostatecznym na to by liczba dzieliła się przez 3, jest by suma jej cyfr była podzielna przez 3
  - jeśli suma cyfr danej liczby nie dzieli się przez 3, to liczba nie dzieli się przez 3 (warunekiem koniecznym na to by liczba dzieliła się przez 3 jest by suma jej cyfr dzieliła się przez 3),

## Semantyka

- funkcja wartościująca - $w$ - funkcja przypisująca wartość logiczną: $1$ jeśli zdanie jest prawidziwe, $0$ gdy zdanie jest fałszywe.

### Matryce Logiczne

- negacja

| $w(p)$ | $w(\lnot p)$ |
| ------ | ------------ |
| 0      | 1            |
| 1      | 0            |

- koniunkcja

| $w(p)$ | $w(q)$ | $w(p) \land w(q)$ |
| ------ | ------ | ----------------- |
| 0      | 0      | 0                 |
| 0      | 1      | 0                 |
| 1      | 0      | 0                 |
| 1      | 1      | 1                 |

- alternatywa

| $w(p)$ | $w(q)$ | $w(p) \lor w(q)$ |
| ------ | ------ | ---------------- |
| 0      | 0      | 0                |
| 0      | 1      | 1                |
| 1      | 0      | 1                |
| 1      | 1      | 1                |

- implikacja

| $w(p)$ | $w(q)$ | $w(p) \implies w(q)$ |
| ------ | ------ | -------------------- |
| 0      | 0      | 1                    |
| 0      | 1      | 1                    |
| 1      | 0      | 0                    |
| 1      | 1      | 1                    |

- równoważność

| $w(p)$ | $w(q)$ | $w(p) \iff w(q)$ |
| ------ | ------ | ---------------- |
| 0      | 0      | 1                |
| 0      | 1      | 0                |
| 1      | 0      | 0                |
| 1      | 1      | 1                |

- dysjunkcja Sheffera

| $p$ | $q$ | $p \mid q$ |
| --- | --- | ---------- |
| 0   | 0   | 1          |
| 0   | 1   | 1          |
| 1   | 0   | 1          |
| 1   | 1   | 0          |

- Funktor Sheffera, sam jeden, wystarcza do zdefiniowania wszystkich pozostałych funktorów zdaniotwórczych, zarówno jednoargumentowych jak i dwuargumentowych.

#### Spójniki logiczne z funktora Sheffera

- zaprzeczenie (Sheffer)

| $p$ | $\lnot p$ | $p\mid p$ |
| --- | --------- | --------- |
| 0   | 1         | 1         |
| 1   | 0         | 0         |

- alternatywa (Sheffer)

| $p$ | $q$ | $p \lor q$ | $(p \mid p)$ | $(q \mid q)$ | $(p \mid p) \mid (q \mid q)$ |
| --- | --- | ---------- | ------------ | ------------ | ---------------------------- |
| 0   | 0   | 0          | 1            | 1            | 0                            |
| 0   | 1   | 1          | 1            | 0            | 1                            |
| 1   | 0   | 1          | 0            | 1            | 1                            |
| 1   | 1   | 1          | 0            | 0            | 1                            |

- koniunkcja

| $p$ | $q$ | $p \land q$ | $(p \mid q)$ | $(p \mid q)$ | $(p \mid q) \mid (p \mid q)$ |
| --- | --- | ----------- | ------------ | ------------ | ---------------------------- |
| 0   | 0   | 0           | 1            | 1            | 0                            |
| 0   | 1   | 0           | 1            | 1            | 1                            |
| 1   | 0   | 0           | 1            | 1            | 1                            |
| 1   | 1   | 1           | 0            | 0            | 1                            |

- implikacja

| $p$ | $q$ | $p \implies q$ | $(q \mid q)$ | $(p \mid (q \mid q))$ |
| --- | --- | -------------- | ------------ | --------------------- |
| 0   | 0   | 1              | 1            | 1                     |
| 0   | 1   | 1              | 1            | 1                     |
| 1   | 0   | 0              | 1            | 0                     |
| 1   | 1   | 1              | 0            | 1                     |

- implikacja *(2)*

| $p$ | $q$ | $p \implies q$ | $(q \mid q)$ | $(p \mid (p \mid q))$ |
| --- | --- | -------------- | ------------ | --------------------- |
| 0   | 0   | 1              | 1            | 1                     |
| 0   | 1   | 1              | 1            | 1                     |
| 1   | 0   | 0              | 1            | 0                     |
| 1   | 1   | 1              | 0            | 1                     |

- $\lnot, \ \land, \ \lor, \ \implies, \ \iff$ nazywamy funktorami logicznymi

- Funktor ekstensjonalny - wartość logiczna zdania, utworzonego za jego pomocą zależy tylko od wartości logicznych zdań składowych, a nie od sensu tych zdań ($\lnot, \ \land, \ \lor, \ \implies, \ \iff$ cechuje ekstensjonalność).
  
  - Przykłady:
    - Zdanie eksnensjonalne: Jeśli Piotr jest najlepszym studentem, to ma najlepsze wyniki w nauce.
    - Zdanie nieekstensjonalne: Wydaje mi się, że Piotr jest najlepszym studentem.
      - Nie wiadomo jaka jest wartość takiego zdania. Nasze odczucia mogą być niezgodne z faktami. "Wydaje się" jest rodzajem operatora zdaniotwórczego, ale nie ma cech ekstensjonalności.

<!-- # Do Sprawdzenia:  -->

- Zbiór {0, 1}  z operacjami: $\lnot, \ \land, \ \lor, \ \implies$ naywamy dwuargumenową algebrą Boole'a i oznacza się ją jako $B_0$.

## Tautologie

- **Tautologie** to zdania lub schematy zdań, utworzone ze zmiennych zdaniowych za pomocą funktorów zdaniotwórczych, których wartością jest zawsze prawda, tzn. te, które są spełnione przez wszystkie możliwe wartościowania zmiennych zdaniowych.
- **Zdanie sprzeczne**  jego wartością jest fałsz, niezależnie od wartości zmiennych zdaniowych w nim występujących, nazywamy zdaniem sprzecznym.
- Formuła $\alpha$ rachunku zdań jest tautologią wtedy i tylko wtedy, gdy $\lnot \alpha$ a jest zdaniem sprzecznym.

### Przykłady Tautologii

- Prawo Tożsamości Implikacji
  - $a \implies a$
  - każde zdanie implikuje siebie
- Prawo Wyłączonego Środka
  - $a \lor \lnot a$
  - z dwóch zdań: zdania lub jego zaprzeczenia jedno zawsze jest prawdziwe
- Prawo Wyłączonej Sprzeczności
  - $\lnot (a \land \lnot a)$
  - nie może być jednocześnie prawdziwe zdanie i jego zaprzeczenie
- Prawo Podwójnego Przeczeczenia
  - $p \iff \lnot \lnot p$
  - dowolne zdanie równoważne jest podwójnej negacji tego zdania
- Prawdo Dunsa Szkota
  - $\lnot p \implies (p \implies q)$
    - jeżeli zdanie jest fałszywe, to wynika z niego każde inne zdanie  
- Prawo Claviusa
  - $(\lnot p \implies p) \implies p$
    - jeżeli zdanie wynika ze swojego zaprzeczenia, to jest prawdziwe
- Prawo Transpozycji
  - $(p \implies q) \implies (\lnot q \implies \lnot p)$
    - jeżeli z jednego zdania wynika drugie, to z zaprzeczenia drugiego wynika zaprzeczenie pierwszego
- Prawo Zaprzeczenia Implikacji
  - $\lnot (p \implies q) \iff (p \land q)$
- Pierwsze Prawo de Morgana
  - $\lnot (p \land q) \iff (\lnot p \lor \lnot q)$
- Drugie Prawo de Morgana
  - $\lnot (p \lor q) \iff (\lnot p \land \lnot q)$
- prawo sylogizmu / prawo przechodności implikacji
  - $[p\Rightarrow q)\land (q\Rightarrow r)]\Rightarrow (p\Rightarrow r)$
    - jeżeli z jednego zdania wynika drugie i z drugiego trzecie, to z pierwszego wynika trzecie

#### Reguła Podstawiania

- **Jeżeli zdanie P jest tautologią, to jeśli wszystkie wystąpienia jakiejś zmiennej (np. p) zastąpimy dowolnym zdaniem, to otrzymane zdanie złożone będzie również tautologią**
- Przykład:
  - Prawo Podwójnego Przeczenia $p \iff \lnot \lnot p$
  - Niech $p = p \implies q$
  - $w((p \implies q) \iff \lnot \lnot (p \implies q))$ może równać się 0 wtedy gdy L = 0 i P = 1 lub L = 1 i P = 0, więc jeżeli zdanie nie jest tautologią to są jedyne możliwości na fałsz.
  - Niech L = 0, wtedy $p = 1$ i $q = 0$, wtedy P = $\lnot \lnot (p \implies q) = \lnot \lnot (1 \implies 0) = \lnot \lnot 0 = \lnot 1 = 0$, więc $(L \iff P) = (0 \iff 0) = 1$ 
  - Gdy L = 1, to wtedy $p \implies q$ jest prawdziwe, więc P też będzie = 1, bo tam są te same spójniki. 

## Sprzeczność / Niesprzecznosć

### Sprzeczny Zbiór Zdań

- Zbiór, w którym nie ma opcji na to, żeby wszystkie w nim zdania były prawdziwe
- Np $\{a \in X, a \notin X\}$
- Może się zdarzyć, że żadna para zdań nie prowadzi do sprzeczności, natomiast wszystkie zdania razem nie mogą być równocześnie prawdziwe:
  - $\{X \subset Y, Y \subset Z, Z \subset U, U \subset X\}.$

### Niesprzczeczny Zbiór Zdań

- Zbiór zdań, w którym istnieje taki układ wartości zmiennych, że wszystkie zdania są prawdziwe.

## Dowody Nie Wprost

- Metoda ta polega na przyjęciu hipotezy odwrotnej do tej, którą chcemy udowodnić, i wydedukowaniu stąd, albo zaprzeczenia jednego z założeń, albo zaprzeczenia dowodzonej tezy.
- Dowody oparte o tę zasadę noszą nazwę apagogicznych, a inaczej mówi się o nich, że są to dowody przez sprowadzanie do niedorzeczności.
- Do dowódów nie wprost, można też używać prawa transpozycji:
  - $a \implies b \iff \lnot b \implies \lnot a$
Jest to proste GUI oparte na socketach, które symuluje zachowanie się zadanej płytki ewaluacyjnej.

Schemat uruchomienia:
1. Kompilujemy oba pliki: Host.java i Board.java
2. Uruchamiamy plik Board: java Board
3. Najpierw tworzy sie nam GUI, a po sekundzie na konsoli wyswietla sie adres lokalnego hosta wraz z numerem portu. Numer portu jest na sztywno przypisany do 9999.
4.Uruchamiamy plik Host.java w następujący sposób:

java Host adres-lokalnego_hosta(wyswietlilo sie wczesniej) 9999

Przykład u mnie:
java Host ASUS-R558U 9999

### Opgave 1

Java har en klasse LocalTime som er en repræsentation af et tidspunkt på døgnet. Man kan
lave en ny instans ved hjælp af metoden ”of”.

**Eksempel:**

    LocalTime pause = LocalTime.of(10, 30);

Ændrer arrival og departure attributterne i Departure klassen til at bruge LocalTime typen i
stedet for String. 

Ret koden så den virker med den nye klasse.

Skal du opdaterer kode uden for klassen Departure?

Hvis du kun vil udskrive timer og minutter af en LocalTime kan du bruge

    pause.format(DateTimeFormatter.ofPattern("HH:mm"));

### Opgave 2


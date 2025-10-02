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

Nu da I har lært om private og public modifierne, så skal I lave attributterne i Hero og
Monster klassen private.  

Dette betyder at metoderne ikke længere fungerer. Lav getters og sætters, så de fungerer igen.  

I stedet for at lave getters og sætters kan du vælge at lave metoder der er mere informative.

For eksempel kunne man lave en metode med følgende signatur.

    public boolean isAlive()

### Opgave 3

### Opgave 6*

Lav Pigs opgaven fra afleveringsopgaven igen, denne gang skal I dog bruge jeres
nyerhvervede viden og lave en Player klasse, der holder styr på de informationer der er
relevant for en spiller.

Lav også en Die klasse, der repræsenterer en terning.  

Nu vi kender til klasser kan vi også bruge Random klassen til at generere tilfældige tal. 


# Tree 

Questo progetto è un'applicazione Java per gestire l'evoluzione di un albero in base al numero di rami e alla loro crescita nel tempo. Il progetto è stato sviluppato utilizzando Maven come strumento di build.

## Struttura del Progetto

Il progetto è composto da diverse classi, ciascuna con un ruolo specifico:

- `App`: Punto di ingresso principale del programma.
- `Menu`: Classe responsabile della gestione del menu principale e del sottomenu dell'albero malato.
- `Tree`: Classe che rappresenta l'albero.
- `TreeMath`: Classe che contiene metodi matematici per calcolare il numero di rami e l'età dell'albero.
- `TreeInitializer`: Classe che gestisce l'inizializzazione dell'albero.

## Requisiti

- JDK 8 o superiore
- Maven

## Installazione

1. Clona il repository:
    ```sh
    git clone https://github.com/Dora2607/Tree---Java.git
    ```
2. Naviga nella directory del progetto:
    ```sh
    cd tree
    ```
3. Costruisci il progetto utilizzando Maven:
    ```sh
    mvn clean install
    ```

## Utilizzo

Al lancio dell'applicazione, viene visualizzato un menù principale con le seguenti opzioni:

1. Calcola il numero di rami, conoscendo l'età dell'albero.

2. Determina gli anni necessari per sviluppare un certo numero di rami.

3. Gestione dell'albero malato:

    - Se l'albero ogni anno perde un ramo.

    - Se l'albero ogni anno perde un numero specifico di rami.

    - Se l'albero ogni anno perde un numero casuale di rami.

4. Esci dall'applicazione.

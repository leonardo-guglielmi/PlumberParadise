- interface Application: punto cardine del progetto
- interface Application listener: listener creato quando viene creata un applicatin , oppure distrutto e così via, ed in concomitanza di questi eventi (creazione, distruzione, pausa ecc ecc) esegue dei metodi 
- class ApplicationAdapter: implementazione di listener, nulla di chè fa su per giù le stesse cose

- com.badlogic.gdx.utils.ScreenUtils: questione tecnica, utile solo per la gestione della pagina, più precisamente per la sua pulizia e impostazione di default(se tolto non sembra succedere nulla di diverso se non avere l'applicazione nera)
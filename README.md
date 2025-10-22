# Jak spustit v IntelliJ IDEA (Windows)

1) **Otevři projekt v IntelliJ**
   - IntelliJ → **File → Open…** → vyber složku projektu `hello-project` (nebo **Get from VCS** a vlož URL repozitáře).

2) **Zkontroluj JDK**
   - **File → Project Structure… → Project**
     - **Project SDK:** vyber **JDK 17** (nebo 21).
   - **File → Settings → Build, Execution, Deployment → Build Tools → Gradle**
     - **Gradle JVM:** nastav **Project SDK (JDK 17/21)**.

3) **Nech proběhnout Gradle Sync**
   - Pokud se nahoře objeví žlutý banner, klikni **Load/Reload Gradle Project**.
   - Případně v pravém panelu **Gradle** klikni na **↻ Refresh**.

4) **Spusť aplikaci**
   - Otevři soubor s anotací `@SpringBootApplication` (např. `HelloProjectApplication.kt`).
   - Vlevo u funkce `main` klikni na **zelený ▶ Run**.
   - V konzoli IntelliJ počkej na hlášku:
     ```
     Tomcat started on port(s): 8080
     ```

5) **Ověř endpoint**
   - Otevři prohlížeč a zadej:
     ```
     http://localhost:8080/hello
     ```
   - Zobrazí se odpověď:
     ```
     Ahoj
     ```

> Aplikaci ukončíš v IntelliJ tlačítkem **■ Stop** v Run konzoli.  
> Kdyby byl port 8080 obsazený, přidej do `src/main/resources/application.properties` řádek `server.port=8081` a spusť znovu.

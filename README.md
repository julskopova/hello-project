# Ahoj
**Jak spustit aplikaci (Windows – přes konzoli)**

1. **Otevři PowerShell nebo Příkazový řádek (Command Prompt).**

2. **Naklonuj repozitář z GitHubu:**
   
   git clone https://github.com/julskopova/hello-project.git
   cd hello-project
   
3. **Spusť aplikaci pomocí Gradle wrapperu**

   .\gradlew.bat bootRun

4. Počkej, dokud se nezobrazí hláška:

   TomCat started on port(s): 8080

5. Otevři webový prohlížeč a přejdi na:

   http://localhost:8080/hello

6. Aplikaci ukončíš stiskem Ctrl + C v konzoli.

------------------------------------------------------------------------------

# Databáze

**1. Spuštění PostgreSQL v Dockeru**


powershell:

*docker run --name postgres-demo `
  -e POSTGRES_PASSWORD=heslo123 `
  -e POSTGRES_DB=appdb `
  -p 5432:5432 `
  -d postgres:16*

Zkontroluj, že databáze běží:

   *docker ps*

**2. Spusť aplikaci**


V kořenovém adresáři projektu spusť:

   *.\gradlew.bat bootRun*

Aplikace se spustí na adrese:

*http://localhost:8080*

**3. Vyzkoušej endpoint**


Otevři prohlížeš nebo v konzoli:

powershell

   *curl http://localhost:8080/notes*

Zobrazí se seznam poznámek uložených v databázi.

**4.Konfigurace připojení**


Aplikace používá výchozí konfiguraci v application.properties:

*spring.application.name=hello-project
spring.datasource.url=jdbc:postgresql://localhost:5432/appdb
spring.datasource.username=postgres
spring.datasource.password=heslo123
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true*

**5.Struktura projektu**


*src/main/kotlin/com/example/helloproject/
  note/
    Note.kt              # Databázová entita (poznámky)
    NoteRepository.kt    # JPA repozitář pro CRUD operace
    NoteController.kt    # REST controller - endpoint /notes*

**6.Zastavení databáze**


   *docker stop postgres-demo
   docker rm postgres-demo*





# springboot_freemarker_starter
Eclipse 2023-6 | Springboot Freemarker Starter Applikation 
Setup SpringBoot Application 

Eclipse2023-6 installieren.


Auf dem PC/Notebook in das Verzeichnis Windows C: /Benutzer/User wechseln und einen neuen Ordner erstellen mit dem Projekt Namen und alle Dateien in das Verzeichnis kopieren.

Im Anschluss Eclipse öffnen und einen Workspace auswählen. 
(Achtung dieses sollte nicht der Projekt Ordner sein)!

Bei einer Neuinstallation von Eclipse wird im Standard öffnet eclipse-workspace erstellt. 
Das Verzeichnis auswählen oder alternativ unter Windows C /Benutzer einen neuen leeren Workspace Ordner erstellen und diesen dann auswählen.

Nach dem Start von Eclipse können Sie den Startscreen Begüßungs Bildschirm schließen.

*****************************************************
Wir benötigen für das Projekt die Spring Tools 4 die wir über das Hilfe Menü (Help) oben -> und in der Subnavigation -> Eclipse Marketplace installieren können. 

Wir geben in das Suchfeld oben Spring Tools ein und installieren die Extension.

Nach der Installation werden sie aufgefordert neu zu starten, was wir auch machen. 

*****************************************************

Nach dem Neustart wählen wir wieder unser Workspace aus dem ersten Schritt und schließen wieder den Eclipse Start Bildschirm. 

Jetzt sollten wir diesen Screen sehen und wählen hier Import Projekt, damit öffnet sich ein Popup und wir wählen in dem Popup unter dem Ordner Maven -> Existing Maven Projekts und bestätigen dann mit Next.
<img>
  

Es öffnet sich das Import Fenster und wir wählen hier über den Button Browse unser Projekt Verzeichnis aus was wir in Windows C /Benutzer/User erstellt haben.  (Hier als Verzeichnisname test)
und klicken die Schaltfläche -> Ordner auswählen.
<img>
 

Danach öffnet sich ein neues Fenster in der die pom.xml ausgewählt werden muss, bzw. schon markiert sein sollte. Hier klicken wir dann auf Finish und Eclipse importiert alle Einstellungen für uns. 
<img>
 

Damit wir das Projekt nun starten können öffnen wir uns das Boot Dashboard was wir uns ganz zu Anfang mit den Spring Tools 4 installiert haben. 
Das Boot Dashboard fügen wir mit dem Reiter Window ganz oben hinzu hier klicken wir auf other und geben in dem Popup boot ein, wählen das Boot Dashboard aus und klicken auf open.
        

Jetzt können wir unsere Anwendung starten, in dem wir im Boot Dashboard – das local Element aufklappen, die Anwendung mit der linken Maustaste anklicken und auf (Re)start klicken. 
 <img>


Wenn alles richtig funktioniert hat, sollte Spring in der Console starten. 

 <img>

Nun können wir uns über den Browser mit der Eingabe in der Browser Adresszeile http://localhost:8000 die Applikation anschauen. 

Die Template Dateien finden wir, wenn wir uns in Eclipse das Projekt aufklappen. 
Die Controller sind eine Ebene höher. 
          


Viel Spaß mit der Applikation. 

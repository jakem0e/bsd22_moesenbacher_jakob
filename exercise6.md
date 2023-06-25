# Exercise 6
## Was ist notewendig um eine Macen site zu generieren?
Um Maven Site-Dokumentation zu generieren, benötigen Sie die folgenden Voraussetzungen:

* Maven: Stellen Sie sicher, dass Sie Maven auf Ihrem System installiert haben. Sie können die Installation überprüfen, indem Sie den Befehl "mvn -version" in der Befehlszeile ausführen.
* Maven-Projekt: Sie benötigen ein Maven-Projekt, für das Sie die Site-Dokumentation generieren möchten. Stellen Sie sicher, dass das Projekt über eine gültige Projektstruktur und eine funktionierende Maven-Konfiguration verfügt. Das bedeutet, dass eine pom.xml-Datei im Stammverzeichnis des Projekts vorhanden sein sollte.
* Site-Plugin: Das Site-Plugin ist in Maven enthalten und wird verwendet, um die Site-Dokumentation zu generieren. Es ist in der Regel in der pom.xml-Datei des Projekts konfiguriert. Überprüfen Sie, ob das Site-Plugin in der Build-Konfiguration des Projekts angegeben ist.
* Dokumentationsquellen: Um die Site-Dokumentation zu generieren, benötigen Sie die entsprechenden Dokumentationsquellen für Ihr Projekt. Das können beispielsweise Markdown-, HTML-, AsciiDoc- oder andere Textdateien sein. Stellen Sie sicher, dass die Dokumentationsquellen im Projekt vorhanden sind und in der Maven-Konfiguration korrekt referenziert werden.
* Site-Befehl: Um die Site-Dokumentation zu generieren, verwenden Sie den Maven-Befehl "mvn site". Führen Sie diesen Befehl im Stammverzeichnis Ihres Projekts aus. Maven wird dann das Site-Plugin verwenden, um die Dokumentation zu generieren.

Nachdem Sie diese Voraussetzungen erfüllt haben, wird Maven die Site-Dokumentation generieren und in das Verzeichnis "target/site" in Ihrem Projekt schreiben. Sie können dann den generierten Inhalt in einem Webbrowser anzeigen, indem Sie die entsprechenden Dateien öffnen (z. B. index.html).

## Welche unterschiedlichen Aspekte, Konfigurationen, Informationen, usw. werden in site.xml bzw. pom.xml konfiguriert?
In pom xpl werden die Packeges die für die Dokumentation nowendig sind hinzugefügt.
In site.xml wird definiert wie das html file aussehen soll und was es beinhalten soll.



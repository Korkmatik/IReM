# /UC01.1/ Case erstellen

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Erstellen eines Cases, damit alle Daten, die zu einem Incident Response dazu gehören gemanaged werden können
  Vorbedingung  | Der Nutzer ist angemeldet
  Resultat      | Ein Case ist erstellt und eingestellt
  Nutzer        | Incident Owner
  Auslöser      | Funktion "Create Case" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Incident Owner kann ein Case erstellen und Basis Einstellungen während des Erstellungsvorgangs einstellen.

**Akteure**:
* Angemeldeter User
* Web API

**Eingehende Daten**:
* Nutzer der den Case erstellt
* Name für den Case
* Teilnehmer
* Auslöser
* Kunde
* Optionale Beschreibung

**Essentielle Schritte**:
1. Nutzer wählt Funktion "Create Case" aus
2. Dialog für das Erstellen eines Cases wird angezeigt
3. Nutzer gibt erforderliche Daten ein und bestätigt
4. Daten werden in die Datenbank gespeichert und ein Case wird erstellt

**Ausnahmen**:
- zu 3.) (a) Falls die Daten fehlerhaft sind, wird eine Fehlermeldung angezeigt (b) Weitere Schritte werden abgebrochen

**Änderungshistorie**
* 24.04.2021; Korkmatik; Use Case angelegt
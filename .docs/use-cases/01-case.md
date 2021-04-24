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

# /UC01.2/ Case löschen

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Löschen eines Cases
  Vorbedingung  | Der Nutzer ist angemeldet und ein Case wurde erstellt
  Resultat      | Ein Case zuvor erstellter Case wird von der Datenbank gelöscht
  Nutzer        | Incident Owner
  Auslöser      | Funktion "Delete Case" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Incident Owner kann ein bereits erstelltes Case wieder löschen

**Akteure**:
* Angemeldeter User
* Web API

**Eingehende Daten**:
* Case ID
* Nutzerdaten

**Essentielle Schritte**:
1. Nutzer wählt das Case aus
2. Nutzer geht in die Projekt Einstellungen
3. Nutzer wählt "Delete Case" aus
4. Das System zeigt ein confirmation dialog
5. Nutzer bestätigt, dass er den Case löschen möchte
6. Case Daten werden aus der Datenbank gelöscht

**Ausnahmen**:
- zu 5.) (a) Falls Nutzer dies nicht bestätigt, werden alle folgenden Schritte abgebrochen.

**Änderungshistorie**
* 24.04.2021; Korkmatik; Use Case angelegt

# /UC01.3/ Case bearbeiten

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Bearbeiten der Einstellungen eines Cases
  Vorbedingung  | Der Nutzer ist angemeldet und ein Case wurde erstellt
  Resultat      | Ein Case hat neue Einstellungen
  Nutzer        | Incident Owner
  Auslöser      | Funktion "Settings" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Incident Owner kann Einstellungen eines bereits erstellten Cases wieder ändern.

**Akteure**:
* Angemeldeter User
* Web API

**Eingehende Daten**:
* Case ID
* Case Settings
* Nutzer ID

**Essentielle Schritte**:
1. Nutzer wählt das Case aus
2. Nutzer geht in die Projekt Einstellungen
3. Nutzer ändert die Einstellungen
4. Nutzer speichert die Einstellungen
5. Neue Case Einstellungen werden in der Datenbank gespeichert

**Ausnahmen**:
- zu 4.) (a) Falls die eingegebenen Daten ungültig sind, wird eine Fehlermeldung angezeigt (b) Weitere Schritte werden abgebrochen

**Änderungshistorie**
* 24.04.2021; Korkmatik; Use Case angelegt

# /UC01.4/ Cases anzeigen

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Cases zu dem ein Nutzer zugeteilt wurde, werden auf der Home Page angezeigt
  Vorbedingung  | Der Nutzer ist angemeldet und ist auf der Home Page
  Resultat      | Nutzer sieht seine Cases
  Nutzer        | Angemeldeter User
  Auslöser      | Funktion "Show Home Page" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Nutzer kann auf seiner Home Page sehen, zu welchen Cases er zugeteilt wurde.

**Akteure**:
* Angemeldeter User
* Web API

**Eingehende Daten**:
* Nutzer ID

**Essentielle Schritte**:
1. Nutzer öffnet die "Home Page"
2. Cases werden in kompakter Darstellung aufgelistet

**Ausnahmen**:

**Änderungshistorie**
* 24.04.2021; Korkmatik; Use Case angelegt
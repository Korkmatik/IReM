# /UC01.1/ Incident erstellen

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Erstellen eines Incident, damit alle Daten, die zu einem Incident Response dazu gehören gemanaged werden können
  Vorbedingung  | Der Nutzer ist angemeldet
  Resultat      | Ein Incident ist erstellt und eingestellt
  Nutzer        | Incident Owner
  Auslöser      | Funktion "Create Incident" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Incident Owner kann ein Incident erstellen und Basis Einstellungen während des Erstellungsvorgangs einstellen.

**Akteure**:
* Angemeldeter User
* Web API

**Eingehende Daten**:
* Nutzer der den Incident erstellt
* Name für den Incident
* Teilnehmer
* Auslöser
* Kunde
* Optionale Beschreibung

**Essentielle Schritte**:
1. Nutzer wählt Funktion "Create Incident" aus
2. Dialog für das Erstellen eines Incidents wird angezeigt
3. Nutzer gibt erforderliche Daten ein und bestätigt
4. Daten werden in die Datenbank gespeichert und ein Incident wird erstellt

**Ausnahmen**:
- zu 3.) (a) Falls die Daten fehlerhaft sind, wird eine Fehlermeldung angezeigt (b) Weitere Schritte werden abgebrochen

**Änderungshistorie**
* 24.04.2021; Korkmatik; Use Case angelegt
* 25.04.2021; Korkmatik; Case zu Incident umbenannt

# /UC01.2/ Incident löschen

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Löschen eines Incidents
  Vorbedingung  | Der Nutzer ist angemeldet und ein Incident wurde erstellt
  Resultat      | Ein Incident zuvor erstellter Incident wird von der Datenbank gelöscht
  Nutzer        | Incident Owner
  Auslöser      | Funktion "Delete Incident" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Incident Owner kann ein bereits erstelltes Incident wieder löschen

**Akteure**:
* Angemeldeter User
* Web API

**Eingehende Daten**:
* Incident ID
* Nutzerdaten

**Essentielle Schritte**:
1. Nutzer wählt das Incident aus
2. Nutzer geht in die Projekt Einstellungen
3. Nutzer wählt "Delete Incident" aus
4. Das System zeigt ein confirmation dialog
5. Nutzer bestätigt, dass er den Incident löschen möchte
6. Incident Daten werden aus der Datenbank gelöscht

**Ausnahmen**:
- zu 5.) (a) Falls Nutzer dies nicht bestätigt, werden alle folgenden Schritte abgebrochen.

**Änderungshistorie**
* 24.04.2021; Korkmatik; Use Case angelegt
* 25.04.2021; Korkmatik; Case zu Incident umbenannt

# /UC01.3/ Incident bearbeiten

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Bearbeiten der Einstellungen eines Incidents
  Vorbedingung  | Der Nutzer ist angemeldet und ein Incident wurde erstellt
  Resultat      | Ein Incident hat neue Einstellungen
  Nutzer        | Incident Owner
  Auslöser      | Funktion "Settings" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Incident Owner kann Einstellungen eines bereits erstellten Incidents wieder ändern.

**Akteure**:
* Angemeldeter User
* Web API

**Eingehende Daten**:
* Incident ID
* Incident Settings
* Nutzer ID

**Essentielle Schritte**:
1. Nutzer wählt das Incident aus
2. Nutzer geht in die Projekt Einstellungen
3. Nutzer ändert die Einstellungen
4. Nutzer speichert die Einstellungen
5. Neue Incident Einstellungen werden in der Datenbank gespeichert

**Ausnahmen**:
- zu 4.) (a) Falls die eingegebenen Daten ungültig sind, wird eine Fehlermeldung angezeigt (b) Weitere Schritte werden abgebrochen

**Änderungshistorie**
* 24.04.2021; Korkmatik; Use Case angelegt
* 25.04.2021; Korkmatik; Case zu Incident umbenannt

# /UC01.4/ Incidents anzeigen

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Incidents zu dem ein Nutzer zugeteilt wurde, werden auf der Home Page angezeigt
  Vorbedingung  | Der Nutzer ist angemeldet und ist auf der Home Page
  Resultat      | Nutzer sieht seine Incidents
  Nutzer        | Angemeldeter User
  Auslöser      | Funktion "Show Home Page" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Nutzer kann auf seiner Home Page sehen, zu welchen Incidents er zugeteilt wurde.

**Akteure**:
* Angemeldeter User
* Web API

**Eingehende Daten**:
* Nutzer ID

**Essentielle Schritte**:
1. Nutzer öffnet die "Home Page"
2. Incidents werden in kompakter Darstellung aufgelistet

**Ausnahmen**:

**Änderungshistorie**
* 24.04.2021; Korkmatik; Use Case angelegt
* 25.04.2021; Korkmatik; Case zu Incident umbenannt
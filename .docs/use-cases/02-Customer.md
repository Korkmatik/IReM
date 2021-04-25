# /UC01.1/ Kunde erstellen

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Hinzufügen eines Kunden
  Vorbedingung  | Der Nutzer ist angemeldet
  Resultat      | Ein Kunde ist erstellt
  Nutzer        | Angemeldeter User mit Admin Rolle
  Auslöser      | Funktion "Create Customer" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Admin kann ein Kunde erstellen

**Akteure**:
* Admin
* Web API

**Eingehende Daten**:
* NutzerId
* Kunden Name
* Addresse des Kunden
* Kontaktperson/-daten: Email, Ansprechpartner

**Essentielle Schritte**:
1. Nutzer wählt Funktion "Create Customer" aus
2. Dialog für das Erstellen eines Kunden wird angezeigt
3. Nutzer gibt erforderliche Daten ein und bestätigt
4. Daten werden in die Datenbank gespeichert und ein Kunde wird erstellt

**Ausnahmen**:
- zu 3.) (a) Falls die Daten fehlerhaft sind, wird eine Fehlermeldung angezeigt (b) Weitere Schritte werden abgebrochen

**Änderungshistorie**
* 25.04.2021; Korkmatik; Use Case angelegt

# /UC01.2/ Kunde löschen

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Löschen eines Kunden und alle Daten des Kunden
  Vorbedingung  | Der Nutzer ist als Admin angemeldet
  Resultat      | Sämtliche Daten die zu dem spezifizierten Kunden gehören werden gelöscht
  Nutzer        | Admin User
  Auslöser      | Funktion "Delete Customer" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Admin kann ein bereits erstellten Kunden wieder löschen

**Akteure**:
* Angemeldeter User
* Web API

**Eingehende Daten**:
* Customer ID
* Nutzer ID

**Essentielle Schritte**:
1. Nutzer wählt das Kunde aus
2. Nutzer wählt "Delete Incident" aus
3. Das System zeigt ein confirmation dialog
4. Nutzer bestätigt, dass er den Kunden und alle dazugehörigen Daten löschen möchte
5. Kunde und dazugehörige Daten, z.B. Incidents werden gelöscht

**Ausnahmen**:
- zu 4.) (a) Falls Nutzer dies nicht bestätigt, werden alle folgenden Schritte abgebrochen.

**Änderungshistorie**
* 25.04.2021; Korkmatik; Use Case angelegt

# /UC01.3/ Kunde bearbeiten

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Bearbeiten der Kundendaten
  Vorbedingung  | Der Nutzer ist als Admin angemeldet
  Resultat      | Kundendaten wurden aktualisiert
  Nutzer        | Admin
  Auslöser      | Funktion "Customer Settings" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Admin kann Daten eines Kunden ändern

**Akteure**:
* Admin
* Web API

**Eingehende Daten**:
* Customer ID
* Neue Daten
* Nutzer ID

**Essentielle Schritte**:
1. Nutzer wählt einen Kunden aus
2. Nutzer geht in die Projekt Einstellungen
3. Nutzer ändert die Einstellungen
4. Nutzer speichert die Einstellungen
5. Neue Kundendaten werden in der Datenbank gespeichert

**Ausnahmen**:
- zu 4.) (a) Falls die eingegebenen Daten ungültig sind, wird eine Fehlermeldung angezeigt (b) Weitere Schritte werden abgebrochen

**Änderungshistorie**
* 25.04.2021; Korkmatik; Use Case angelegt

# /UC01.4/ Kunde anzeigen

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Kunden werden aufgelistet mit zugehörigen Daten
  Vorbedingung  | Der Nutzer ist angemeldet und ist auf der Home Page
  Resultat      | Nutzer sieht Kundendetails
  Nutzer        | Angemeldeter User
  Auslöser      | Funktion "Show Customers" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Nutzer kann sämtliche Kunden und Kundedetails einsehen

**Akteure**:
* Angemeldeter User
* Web API

**Eingehende Daten**:
* Nutzer ID

**Essentielle Schritte**:
1. Nutzer öffnet die "Customers" Seite
2. Kundendaten werden angezeigt. Durch klicken auf den Kunden, werden Details angezeigt, z.B. Incidents

**Ausnahmen**:

**Änderungshistorie**
* 25.04.2021; Korkmatik; Use Case angelegt

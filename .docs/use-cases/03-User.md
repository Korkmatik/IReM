# /UC03.1/ User erstellen

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Hinzufügen eines Users
  Vorbedingung  | Der Nutzer ist als Admin angemeldet
  Resultat      | Ein User ist erstellt
  Nutzer        | Angemeldeter User mit Admin Rolle
  Auslöser      | Funktion "Create User" in den Einstellungen ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Admin kann einen User hinzufügen

**Akteure**:
* Admin
* Web API

**Eingehende Daten**:
* NutzerId
* Userdaten: Vorname, Nachname, Email, Rolle

**Essentielle Schritte**:
1. Nutzer wählt Funktion "Add User" aus
2. Dialog für das Erstellen eines Users wird angezeigt
3. Nutzer gibt erforderliche Daten ein und bestätigt
4. Daten werden in die Datenbank gespeichert und ein User wird erstellt

**Ausnahmen**:
- zu 3.) (a) Falls die Daten fehlerhaft sind, wird eine Fehlermeldung angezeigt (b) Weitere Schritte werden abgebrochen

**Änderungshistorie**
* 25.04.2021; Korkmatik; Use Case angelegt

# /UC02.2/ User löschen

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Löschen eines Users
  Vorbedingung  | Der Nutzer ist als Admin angemeldet
  Resultat      | Benutzer wird gelöscht
  Nutzer        | Admin User
  Auslöser      | Funktion "Delete User" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Admin kann ein bereits erstellten User wieder löschen

**Akteure**:
* Angemeldeter User
* Web API

**Eingehende Daten**:
* User ID
* Nutzer ID

**Essentielle Schritte**:
1. Nutzer geht in die Einstellungen
2. Nutzer wählt "Show Users" aus
3. Das System zeigt alle User an
4. Der Nutzer wählt "Delete User" aus
5. Das System zeigt ein Confirmation Dialog
6. Nutzer bestätigt, dass er den Benutzer löschen möchte
7. Benutzer wird gelöscht 

**Ausnahmen**:
- zu 5.) (a) Falls Nutzer dies nicht bestätigt, werden alle folgenden Schritte abgebrochen.

**Änderungshistorie**
* 25.04.2021; Korkmatik; Use Case angelegt

# /UC03.3/ User bearbeiten

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Bearbeiten des Bentuzerdaten
  Vorbedingung  | Der Nutzer ist als Admin angemeldet oder geht in seine Benutzereinstellungen
  Resultat      | Benutzerdaten wurden aktualisiert
  Nutzer        | Admin, Angemeldeter User
  Auslöser      | Funktion "User Settings" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Admin kann Daten eines Users ändern. Ein angemeldeter User kann seine eigenen Daten ändern.

**Akteure**:
* Admin
* Web API

**Eingehende Daten**:
* User ID
* Neue Daten
* Nutzer ID

**Essentielle Schritte**:
1. Admin wählt einen User aus oder ein User geht in seine eigenen Benutzereinstellungen
2. Neue Daten werden eingegeben
3. Nutzer speichert die Einstellungen
4. Neue Kundendaten werden in der Datenbank gespeichert

**Ausnahmen**:
- zu 3.) (a) Falls die eingegebenen Daten ungültig sind, wird eine Fehlermeldung angezeigt (b) Weitere Schritte werden abgebrochen

**Änderungshistorie**
* 25.04.2021; Korkmatik; Use Case angelegt

# /UC03.4/ Benutzer anzeigen

## Übersicht

  |||
 ---------------|---------------------------------------------------------------
  Ziel          | Admin kann alle User auflisten
  Vorbedingung  | Der Nutzer ist als Admin angemeldet
  Resultat      | Nutzer sieht User
  Nutzer        | Admin
  Auslöser      | Funktion "Show Users" ausgewählt
  ------------------------------------------------------------------------------

## Detailbeschreibung

**Kurzbeschreibung**: Ein Admin kann alle Users einsehen

**Akteure**:
* Angemeldeter User
* Web API

**Eingehende Daten**:
* Nutzer ID

**Essentielle Schritte**:
1. Nutzer öffnet die "Show Users" Seite
2. User werden angezeigt

**Ausnahmen**:

**Änderungshistorie**
* 25.04.2021; Korkmatik; Use Case angelegt

# HSR: OO Testat2

## Aufgabe 1:


 Eine Studierende/ein Studierender möchte in ihrem/seinem Studium verschiedene Vorlesungsmodule besuchen. Pro Modul können aber vorher besuchte Module als Vorkenntnisse vorausgesetzt werden. Das Problem ist es nun, einen Studienplan zu berechnen, so dass alle definierten Module unter Einhaltung der Voraussetzungen belegt werden.
 
Zum Beispiel sollen folgende Module besucht werden:

| Modul | Voraussetzungen |
| ------ | ------ |
| DB1 | OO |
| DB2 | DB1 |
| Math |  |
| OO |  |
| AD1 | OO |
| CPI | OO Math |
| Thesis | DB2 SE2 UI2 |
| SE1 | AD1 CPI DB1|
| SE2 | DB1 SE1 UI1|
| UI1 | AD1|
| UI2 | UI1|

### Lösung für dieses Beispiel
Semester 1: Math OO 
Semester 2: DB1 AD1 CPI 
Semester 3: DB2 SE1 UI1 
Semester 4: SE2 UI2 
Semester 5: Thesis 



@busqueda @stress
Feature: Búsqueda masiva de vuelos
  Como tester
  Quiero validar múltiples combinaciones de búsqueda
  Para asegurar la estabilidad del sistema

  Scenario Outline: Búsqueda básica con diferentes datos
    Given que estoy en la página de búsqueda
    When ingreso "<origen>" como origen
    And ingreso "<destino>" como destino
    And selecciono fecha de salida "<fechaSalida>"
    And selecciono fecha de regreso "<fechaRegreso>"
    And hago clic en "Buscar"
    Then debo ver al menos <resultados> resultados
    And los resultados deben mostrarse en menos de <tiempo> segundos

    Examples:
      | origen        | destino       | fechaSalida   | fechaRegreso   | resultados | tiempo |
      | Buenos Aires  | Miami         | 15/12/2025    | 22/12/2025     | 20         | 5      |
      | Córdoba       | Madrid        | 10/01/2026    | 20/01/2026     | 15         | 4      |
      | Mendoza       | Santiago      | 05/02/2026    | 12/02/2026     | 10         | 3      |
      | Rosario       | Lima          | 18/03/2026    | 25/03/2026     | 12         | 4      |
      | Salta         | Bogotá        | 01/04/2026    | 10/04/2026     | 8          | 3      |
      | Tucumán       | Quito         | 12/04/2026    | 20/04/2026     | 9          | 3      |
      | La Plata      | Cancún        | 05/05/2026    | 15/05/2026     | 14         | 4      |
      | Mar del Plata | Nueva York    | 20/05/2026    | 30/05/2026     | 18         | 5      |
      | Neuquén       | Toronto       | 02/06/2026    | 12/06/2026     | 16         | 4      |
      | Bariloche     | París         | 15/06/2026    | 25/06/2026     | 20         | 5      |
      | Ushuaia       | Roma          | 01/07/2026    | 10/07/2026     | 11         | 4      |
      | Posadas       | Berlín        | 12/07/2026    | 22/07/2026     | 13         | 4      |
      | Corrientes    | Ámsterdam     | 05/08/2026    | 15/08/2026     | 17         | 5      |
      | Resistencia   | Londres       | 18/08/2026    | 28/08/2026     | 19         | 5      |
      | San Juan      | Estambul      | 01/09/2026    | 10/09/2026     | 10         | 3      |
      | San Luis      | Dubái         | 12/09/2026    | 22/09/2026     | 12         | 4      |
      | Catamarca     | Tokio         | 05/10/2026    | 15/10/2026     | 15         | 4      |
      | Jujuy         | Seúl          | 18/10/2026    | 28/10/2026     | 14         | 4      |
      | Formosa       | Shanghái      | 01/11/2026    | 10/11/2026     | 16         | 4      |
      | Río Gallegos  | Sídney        | 12/11/2026    | 22/11/2026     | 18         | 5      |
      | Bahía Blanca  | Melbourne     | 05/12/2026    | 15/12/2026     | 20         | 5      |
      | Paraná        | Los Ángeles   | 18/12/2026    | 28/12/2026     | 22         | 5      |
      | Concordia     | San Francisco | 01/01/2027    | 10/01/2027     | 21         | 5      |
      | Villa María   | Chicago       | 12/01/2027    | 22/01/2027     | 19         | 5      |
      | Rafaela       | Houston       | 05/02/2027    | 15/02/2027     | 17         | 4      |
      | Pergamino     | Dallas        | 18/02/2027    | 28/02/2027     | 15         | 4      |
      | Tandil        | Orlando       | 01/03/2027    | 10/03/2027     | 14         | 4      |
      | Azul          | Las Vegas     | 12/03/2027    | 22/03/2027     | 13         | 4      |
      | Olavarría     | Boston        | 05/04/2027    | 15/04/2027     | 12         | 4      |
      | Junín         | Filadelfia    | 18/04/2027    | 28/04/2027     | 11         | 3      |
      | Chivilcoy     | Washington    | 01/05/2027    | 10/05/2027     | 10         | 3      |
      | Mercedes      | Atlanta       | 12/05/2027    | 22/05/2027     | 9          | 3      |
      | Zárate        | Detroit       | 05/06/2027    | 15/06/2027     | 8          | 3      |
      | Campana       | Phoenix       | 18/06/2027    | 28/06/2027     | 7          | 3      |
      | Pilar         | San Diego     | 01/07/2027    | 10/07/2027     | 6          | 3      |
      | Escobar       | Denver        | 12/07/2027    | 22/07/2027     | 5          | 3      |
      | Tigre         | Seattle       | 05/08/2027    | 15/08/2027     | 4          | 3      |
      | Morón         | Portland      | 18/08/2027    | 28/08/2027     | 3          | 3      |
      | Luján         | Vancouver     | 01/09/2027    | 10/09/2027     | 2          | 3      |
      | San Fernando  | Montreal      | 12/09/2027    | 22/09/2027     | 1          | 3      |
      | San Isidro    | Ottawa        | 05/10/2027    | 15/10/2027     | 1          | 3      |
      | Vicente López | Calgary       | 18/10/2027    | 28/10/2027     | 1          | 3      |
      | Avellaneda    | Edmonton      | 01/11/2027    | 10/11/2027     | 1          | 3      |
      | Lanús         | Winnipeg      | 12/11/2027    | 22/11/2027     | 1          | 3      |
      | Quilmes       | Halifax       | 05/12/2027    | 15/12/2027     | 1          | 3      |
      | Berazategui   | Victoria      | 18/12/2027    | 28/12/2027     | 1          | 3      |
      | Florencio Varela | Regina     | 01/01/2028    | 10/01/2028     | 1          | 3      |
      | Almirante Brown | Saskatoon   | 12/01/2028    | 22/01/2028     | 1          | 3      |
      | Esteban Echeverría | Hamilton | 05/02/2028    | 15/02/2028     | 1          | 3      |
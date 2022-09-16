# language: es
Característica: Login en github
  Yo como usuario de desarrollador
  Quiero ingresar a github
  Para manejar mi versionamiento de proyecto

  Esquema del escenario:
    Dado que Jonathan debo ingresar a la url de github
    Cuando Jonathan ingreso los datos
      | user   | password   |
      | <user> | <password> |
    Entonces Jonathan puede ver el texto <text>

    Ejemplos:
      | user      | password   | text            |
      | lRiiuzaky | Steven.100 | Recent activity |

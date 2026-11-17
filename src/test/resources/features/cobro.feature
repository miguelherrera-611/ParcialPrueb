# language: es
Característica: Cobro por permanencia en el parqueadero BikeParq
  Como cajero del parqueadero
  quiero que el sistema calcule el cobro
  para no hacer cuentas a mano

  Escenario: Un carro permanece una hora
    Dado un vehículo tipo "carro"
    Cuando permanece 60 minutos
    Entonces el cobro es de 3000 pesos

  Escenario: Un vehículo que entra de noche paga el recargo nocturno
    Dado una tarifa de 3000 pesos
    Cuando el vehículo entró a las 22 horas
    Entonces el total a pagar es de 5000 pesos

  Escenario: Un vehículo que entra de día no paga recargo
    Dado una tarifa de 3000 pesos
    Cuando el vehículo entró a las 10 horas
    Entonces el total a pagar es de 3000 pesos

  Escenario: Un vehículo en tiempo de gracia no paga recargo aunque sea de noche
    Dado una tarifa de 0 pesos
    Cuando el vehículo entró a las 23 horas
    Entonces el total a pagar es de 0 pesos

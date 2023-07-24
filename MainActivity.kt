import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    var op: Int
    var operators: Int
    var conditionals: Int
    var cycles: Int

    do {

            println("Hola, bienvenido al menu de opciones")
            println("Selecciona una opcion")
            println("1. Operadores")
            println("2. Condicionales")
            println("3. Ciclos")

        op = scanner.nextInt()
            when (op) {
                1 -> {
                    println("Estas en la opcion de operadores")
                    println("1. Calcular el área de un Triángulo")
                    println("2. Suma de dos números")
                    println("3. Números elevados al cuadrado")
                    println("4. Conversión de euros a dólares")
                    println("5. Lado de un cuadrado y cálculo de área y perímetro")
                    println("6. Área y volumen de un cilindro")
                    println("7. Radio de una circunferencia")
                    println("8. Promedio de 3 números")
                    println("99. Salir")

                    operators = scanner.nextInt()

                    when (operators) {
                        1 -> {
                            println("Calcular el area de un Tríangulo")
                            println("Ingrese la base:")
                            val base: Int = readLine()!!.toInt()
                            println("Ingrese la altura: ")
                            val height: Int = readLine()!!.toInt()
                            val area = (base * height) / 2
                            println("El area es: $area")
                        }

                        2 -> {
                            println("Suma de dos numeros ")
                            println("Ingresa el numero 1")
                            val number1: Int = readLine()!!.toInt()
                            println("Ingresa el numero 2")
                            val number2: Int = readLine()!!.toInt()
                            val sum = (number1 + number2)
                            println("La suma de los dos numeros es: $sum")
                        }

                        3 -> {
                            println("Numeros elevado al cuadrado")
                            println("Ingresa el numero que deseas elevar")
                            val number = scanner.nextDouble()
                            val result = number * number
                            println("El número elevado al cuadrado es: $result")
                        }

                        4 -> {
                            println("Conversion de euros a dolares")
                            println("Ingresa el valor que deseas convertir")
                            val euro: Int = readLine()!!.toInt()
                            val dollar = euro * 1.12
                            println("La conversion de tu valor ingresado es de $dollar")
                        }

                        5 -> {
                            println("Lado de un cuadrado y muestre el valor del área y del perímetro")
                            println("Ingresa el lado")
                            val side: Int = readLine()!!.toInt()
                            val area = (side * side)
                            val perimeter = (side * 4)
                            println("El area y perimetro de tu cuadrado es de:")
                            println("area: $area")
                            println("perimetro: $perimeter")
                        }

                        6 -> {
                            println("Area y volumen de un cilindro")
                            println("Ingresa la base del cilindro")
                            val radio: Int = readLine()!!.toInt()
                            println("Ingresa la altura del cilindro")
                            val height: Int = readLine()!!.toInt()
                            val area = 2 * radio * height + 2 * radio * radio
                            println("El área del cilindro es $area")
                            val volume = radio * radio * height
                            println("El volumen del cilindro es $volume")
                        }

                        7 -> {
                            println("Radio de una circunferencia")
                            println("Ingresa el radio de la circunferencia")
                            val radio: Int = readLine()!!.toInt()
                            val longitude = 2 * radio
                            val area = radio * radio
                            println("La longitud de la circunferencia: $longitude")
                            println("El área del círculo inscrito: $area")
                        }

                        8 -> {
                            println("Promedio de 3 números")
                            println("Ingresa el numero 1")
                            val number1: Int = readLine()!!.toInt()
                            println("Ingresa el numero 2")
                            val number2: Int = readLine()!!.toInt()
                            println("Ingresa el numero 3")
                            val number3: Int = readLine()!!.toInt()
                            val average = (number1 + number2 + number3) / 3
                            println("El promedio es de: $average")
                        }

                        99 -> {
                            println("Saliendo..")
                        }

                        else -> {
                            println("Opción inválida.")
                        }
                    }
                }

                2 -> {
                    println("Estas en la opcion de Condicionales")
                    println("1. Numero es positivo o negativo")
                    println("2. numeros mayores o menores")
                    println("3. números enteros positivos, menor y el mayor de ellos")
                    println("4. numeros A y B")
                    println("5. Cociente de numeros ")
                    println("6. Suma o multiplicaion de numeros positivos o negativos ")
                    println("7. Determinar año bisiesto")
                    println("99. Salir")

                    conditionals = scanner.nextInt()

                    when (conditionals) {
                        1 -> {
                            println("Numero es positivo o negativo")
                            println("Ingresa el numero que deseas saber si es negativo o positivo")
                            val number: Int = readLine()!!.toInt()
                            if (number > 0) {
                                println("El número ingresado es positivo.")
                            } else if (number < 0) {
                                println("El número ingresado es negativo.")
                            } else {
                                println("El número es cero.")
                            }
                        }

                        2 -> {
                            println("numeros mayores o meores")
                            println("Ingresa el numero 1")
                            val number1: Int = readLine()!!.toInt()
                            println("Ingresa el numero 2")
                            val number2: Int = readLine()!!.toInt()
                            if (number1 > number2 && number2 < number1) {
                                println("El número mayor es $number1 y el numero menor es $number2")
                            } else {
                                println("El número es incorrecto.")
                            }
                        }

                        3 -> {
                            println("números enteros positivos, menor y el mayor de ellos")
                            println("Ingresa el numero 1")
                            val number1 = readLine()!!.toInt()
                            println("Ingresa el numero 2")
                            val number2 = readLine()!!.toInt()
                            println("Ingresa el numero 3")
                            val number3 = readLine()!!.toInt()
                            if (number1 != null && number2 != null && number3 != null) {
                                if (number1 >= 0 && number2 >= 0 && number3 >= 0) {
                                    val smallest =
                                        if (number1 <= number2 && number1 <= number3) number1
                                        else if (number2 <= number1 && number2 <= number3) number2 else number3
                                    val largest =
                                        if (number1 >= number2 && number1 >= number3) number1
                                        else if (number2 >= number1 && number2 >= number3) number2 else number3
                                    println("El número más pequeño es: $smallest")
                                    println("El número más grande es: $largest")
                                } else {
                                    println("Los números deben ser enteros positivos.")
                                }
                            }

                        }

                        4 -> {
                            println("Numeros A y B")
                            println("Ingrese el número A:")
                            val A = readLine()!!.toInt()
                            println("Ingrese el número B:")
                            val B = readLine()!!.toInt()
                            val sumOrSubtract = if (A < B) A + B else A - B
                            println("El resultado es: $sumOrSubtract")
                        }

                        5 -> {
                            println("Cociente de numeros ")
                            println("Ingrese el número A:")
                            val numA2 = readLine()!!.toDouble()
                            println("Ingrese el número B:")
                            val numB2 = readLine()!!.toDouble()
                            if (numB2 != 0.0) {
                                val quotient = numA2 / numB2
                                println("El cociente entre A y B es: $quotient")
                            } else {
                                println("La división no es posible (B es igual a 0)")
                            }
                        }

                        6 -> {
                            println("Suma o multiplicaion de numeros positivos o negativos ")
                            println("Ingrese el número A:")
                            val numA3 = readLine()!!.toDouble()
                            println("Ingrese el número B:")
                            val numB3 = readLine()!!.toDouble()
                            val result =
                                if (numA3 < 0 || numB3 < 0) numA3 + numB3 else numA3 * numB3
                            println("Resultado: $result")
                        }

                        7 -> {
                            println("Determinar año bisiesto")
                            println("Ingrese el año:")
                            val year = readLine()?.toIntOrNull()
                            if (year != null) {
                                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                                    println("$year es un año bisiesto.")
                                } else {
                                    println("$year no es un año bisiesto.")
                                }
                            } else {
                                println("Por favor, ingrese un año válido.")
                            }
                        }

                        99 -> {
                            println("Saliendo...")
                        }

                        else -> {
                            println("Opción inválida.")
                        }
                    }
                }

                3 -> {
                    println("Estas en la opcion de Ciclos")
                    println("1. Multiplos de 3 de 1 a 100")
                    println("2. Impares de 0 a 100")
                    println("3. Pares de 1 a 100 ")
                    println("4. Cuadros de 1 a 30")
                    println("5. Suma de los numeros naturales de al cuadrado ")
                    println("6. Suma o multiplicaion de numeros positivos o negativos ")
                    println("99. Salir")
                    println("Selecciona la opción que deseas: ")
                    cycles = scanner.nextInt()

                    when (cycles) {
                        1 -> {
                            println("Múltiplos de 3 entre 1 y 100:")
                            for (i in 1..100) {
                                if (i % 3 == 0)
                                    print("$i ")
                            }
                        }

                        2 -> {
                            println("Números impares entre 0 y 100:")
                            for (i in 1..100 step 2) {
                                print("$i ")
                            }
                        }

                        3 -> {
                            println("Números pares entre 1 y 100:")
                            for (i in 2..100 step 2) {
                                print("$i ")
                            }
                        }

                        4 -> {
                            println("Cuadrados de los números del 1 al 30:")
                            for (i in 1..30) {
                                print("${i * i} ")
                            }
                        }

                        5 -> {
                            println("Suma de los numeros naturales de al cuadrado ")
                            var sum = 0
                            for (i in 1..100) {
                                sum += i * i
                            }
                            println("La suma de los cuadrados de los cien primeros números naturales es: $sum")
                        }


                        6 -> {
                            println("Suma o multiplicaion de numeros positivos o negativos ")
                            println("Ingrese el primer número:")
                            val number1 = readLine()?.toIntOrNull() ?: 0

                            println("Ingrese el segundo número (debe ser mayor que el primero):")
                            val number2 = readLine()?.toIntOrNull() ?: 0

                            if (number1 >= number2) {
                                println("El primer número debe ser menor que el segundo.")
                            } else {
                                println("Números comprendidos entre $number1 y $number2 en secuencia ascendente:")
                                for (i in number1..number2) {
                                    print("$i ")
                                }
                            }
                        }

                        99 -> {
                            println("Saliendo...")
                        }

                        else -> {
                            println("Opción inválida.")
                        }
                    }
                }
            }
        }while (op != 99)
    }











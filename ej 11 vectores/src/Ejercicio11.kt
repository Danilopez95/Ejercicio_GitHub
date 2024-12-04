fun main() {
    var g:java.lang.reflect.Array
    var v: java.lang.reflect.Array<Int> = Array(3) { 1 }

    var cont = 0
    var indice = 0
    var seguir = true
    while (indice < (g.size - 2)) {
        if (g[indice] == v[cont]) {
            if (g[indice + 1] == v[cont + 1]) {
                if (g[indice + 2] == v[cont + 2]) {
                    println("Encontrado")
                }
            }
        }
        var sumar = 0
        while ((g[indice + sumar] == v[cont + sumar]) && seguir) {
            sumar++

        }
        if (sumar + 1 == v.size) {
            println("Encontrado")
        }
        indice++
    }
}
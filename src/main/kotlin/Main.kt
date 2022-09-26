
fun main() {
    while (true) {
        val n = readLine()!!.toInt()
        if (n in 0..1000000) {
            println(fizzBuzz(n))
        } else {
            println("Favor de entrar un entero entre el 0 y el 1,000,000")
        }
    }
}

fun fizzBuzz(n: Int): String {
    val s: String = if (n % 5 == 0 && n % 3 == 0 && n != 0) {
        "fizzbuzz!"
    } else (if (n % 5 == 0 && n != 0) {
        "fizz!"
    } else if (n % 3 == 0 && n != 0) {
        "buzz!"
    } else {
        numLetra(n)
    })
    return s
}

fun numLetra(s: Int?): String {
    val res = StringBuilder()
    val num = s!!
    val u = (num % 1000)
    val m = (num / 1000 % 1000)
    val mi = (num / 1000000 % 1000)
    if (num == 0) {
        res.append("Zero ")
        return res.toString()
    }


    if (mi == 1) {
        res.append("Million ")
    }
    if (m > 0) {
        res.append(digi(m).toString() + "Thousand ")
    }
    if (u > 0) {
        res.append(digi(u).toString())
    }
    return res.toString()
}

private fun digi(n: Int): StringBuilder {
    val cad = StringBuilder()
    val cent = n / 100
    val dec = n % 100 / 10
    val uni = n % 10
    when (cent) {
        0 -> {}
        1 -> if (dec == 0 && uni == 0) {
            cad.append("Hundred ")
            return cad
        } else {
            cad.append("Hundred and ")
        }

        2 -> cad.append("Two Hundred ")
        3 -> cad.append("Three Hundred ")
        4 -> cad.append("Four Hundred ")
        5 -> cad.append("Five Hundred ")
        6 -> cad.append("Six Hundred ")
        7 -> cad.append("Seven Hundred ")
        8 -> cad.append("Eight Hundred ")
        9 -> cad.append("Nine Hundred ")
    }
    when (dec) {
        0 -> {}
        1 -> when (uni) {

            1 -> {
                cad.append("Eleven ")
                return cad
            }
            2 -> {
                cad.append("Twelve ")
                return cad
            }
        }
        2 -> cad.append("Twenty ")
        3 -> cad.append("Thirty ")
        4 -> cad.append("Fourty ")
        5 -> cad.append("Fifty ")
        6 -> cad.append("Sixty ")
        7 -> cad.append("Seventy ")
        8 -> cad.append("Eighty ")
        9 -> cad.append("Ninety ")
    }
    when (uni) {

        0 -> {}
        1 -> cad.append("One ")
        2 -> cad.append("Two ")
        3 -> if(dec==1){
            cad.append("And Thirteen")
        }else{cad.append("Three ")}
        4 ->if(dec==1){
            cad.append("And Fourteen")
        }else{ cad.append("Four")}
        5 ->if(dec==1){
            cad.append("And Fifteen")
        }else{ cad.append("Five")}
        6 -> if(dec==1){
            cad.append("And Sixteen")
        }else{cad.append("Six")}
        7 ->if(dec==1){
            cad.append("And Seventeen")
        }else{ cad.append("Seven")}
        8 -> if(dec==1){
            cad.append("And Eightteen")
        }else{cad.append("Eight")}
        9 -> if(dec==1){
            cad.append("And Nineteen")
        }else{cad.append("Nine")}
    }
    return cad
}
fun main() {
    var healthPoints = 89;
    val playerName = "Madrigal";
    var isBlessed = true;
    var karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt();

    var healthPointsCase =
        if (healthPoints == 100) ("Madrigal is in excellent condition !");
        else if (healthPoints >= 90) ("Madrigal has a few scratches.");
        else if (healthPoints >= 75) {
            if (isBlessed) "has some minor wounds but is healing quite quickly"
            else "has some minor wounds"
        };
        else if (healthPoints >= 15) ("Madrigal looks pretty hurt.");
        else if (healthPoints >= 0) ("Madrigal is in awful condition!");
        else "wrong value !!"

    var auraColor = when (karma) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> "wrong value"
    }

    println("playerName : $playerName");
    println("random : ${Math.random()} ,    ${((110 - healthPoints) / 100.0)}");
    println("healthPointsCase : $healthPointsCase");
    println("karma : $karma <> auraColor : $auraColor");

}
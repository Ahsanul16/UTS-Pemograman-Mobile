package id.ac.pnm.ti.utsmobilesatu

// data class Club
data class Club(
    val name: String,
    val epl:Int,
    val fa:Int,
    val efl:Int,
    val championsleague:Int,
    val europaleague:Int)
{
    val totalTrophy: Int
        get() = epl + fa + efl + championsleague + europaleague
}
// extension function recap
fun Club.recap(): String {
    return "$name: "+
            "Berhasil Memenangkan EPL:$epl "+
            "FA:$fa "+
            "EFL:$efl "+
            "UCL:$championsleague "+
            "UEL:$europaleague "+
            "Total Trophies:$totalTrophy "
}
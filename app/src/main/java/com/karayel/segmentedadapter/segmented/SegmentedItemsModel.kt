package com.karayel.segmentedadapter.segmented

import com.karayel.lib.util.SectionObject

// Child
data class TeamPlayerModel(
    val playerId : Int,
    val playerName : String,
    val playerAge : Byte,
    val playerCost : Double,
    val playerPosition : Position,
    val teamLogoUrl : String,
    val teamName: Team = Team.Fenerbahce
): SectionObject<Team>{
    override fun getUniqueKey(): Any {
        return playerId
    }

    override fun getSectionObj(): Team {
        return teamName
    }
}

// Header
enum class Team(val teamAvatarUrl : String) {
    Fenerbahce("https://i.pinimg.com/originals/47/13/c1/4713c1149ee3fbf08d8d9647ce487b1d.jpg"),
    Galatasaray("https://i.pinimg.com/originals/a5/2f/5b/a52f5ba052977369a1318aa36f9a9951.png"),
    Trabzonspor("https://i.pinimg.com/originals/8c/44/ee/8c44ee5a3249d1d4358f2905ad906d47.jpg"),
    Basaksehir("https://pbs.twimg.com/profile_images/1195216198306271232/Jd3oV3_Q_400x400.jpg")
}

enum class Position {
    Goalkeeper,
    RightCenterBack,
    LeftCenterBack,
    CenterMidfielder,
    CenterDefensiveMidfielder,
    CenterAttackingMidfielder,
    RightWingMidfielder,
    LeftWingMidfielder,
    Striker,
    CenterForward
}
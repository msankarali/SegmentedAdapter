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
enum class Team {
    Fenerbahce, Galatasaray , Trabzonspor , Başakşehir
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
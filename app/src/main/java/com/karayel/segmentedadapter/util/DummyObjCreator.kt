package com.karayel.segmentedadapter.util

import com.karayel.segmentedadapter.basic.BasicItemModel
import com.karayel.segmentedadapter.segmented.Position
import com.karayel.segmentedadapter.segmented.Team
import com.karayel.segmentedadapter.segmented.TeamPlayerModel

object DummyObjCreator{

    fun getDummyPlayerList() : List<TeamPlayerModel>{
        val teamPlayers = arrayListOf<TeamPlayerModel>()
        teamPlayers.add(TeamPlayerModel(teamName = Team.Fenerbahce,playerName = "Serdar Aziz",playerAge = 29,playerPosition = Position.RightCenterBack , playerCost = 2.6, playerId = 0 , teamLogoUrl = Team.Fenerbahce.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Fenerbahce,playerName = "Luiz Gustavo",playerAge = 32,playerPosition = Position.CenterDefensiveMidfielder , playerCost = 7.0, playerId = 1 , teamLogoUrl = Team.Fenerbahce.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Fenerbahce,playerName = "Vedat Muriqi",playerAge = 25,playerPosition = Position.CenterForward , playerCost = 12.0, playerId = 2 , teamLogoUrl = Team.Fenerbahce.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Fenerbahce,playerName = "Ozan tufan",playerAge = 24,playerPosition = Position.CenterAttackingMidfielder , playerCost = 5.0, playerId = 3 , teamLogoUrl = Team.Fenerbahce.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Fenerbahce,playerName = "Ferdi Kadıoğlu",playerAge = 20,playerPosition = Position.RightWingMidfielder , playerCost = 2.8, playerId = 4 , teamLogoUrl = Team.Fenerbahce.teamAvatarUrl))

        teamPlayers.add(TeamPlayerModel(teamName = Team.Galatasaray,playerName = "Fernando Muslera",playerAge = 33,playerPosition = Position.Goalkeeper , playerCost = 5.0, playerId = 5 , teamLogoUrl = Team.Galatasaray.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Galatasaray,playerName = "Marcao",playerAge = 23,playerPosition = Position.LeftCenterBack , playerCost = 4.0, playerId = 6 , teamLogoUrl = Team.Galatasaray.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Galatasaray,playerName = "Mario Lemina",playerAge = 26,playerPosition = Position.CenterMidfielder , playerCost = 13.0, playerId = 7 , teamLogoUrl = Team.Galatasaray.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Galatasaray,playerName = "Henry Onyekuru",playerAge = 22,playerPosition = Position.LeftWingMidfielder , playerCost = 10.0, playerId = 8 , teamLogoUrl = Team.Galatasaray.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Galatasaray,playerName =  "Falcao",playerAge = 33,playerPosition = Position.Striker , playerCost = 6.0, playerId = 9 , teamLogoUrl = Team.Galatasaray.teamAvatarUrl))

        teamPlayers.add(TeamPlayerModel(teamName = Team.Trabzonspor,playerName = "Uğurcan Çakır",playerAge = 23,playerPosition = Position.Goalkeeper , playerCost = 8.0, playerId = 10 , teamLogoUrl = Team.Trabzonspor.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Trabzonspor,playerName = "Hüseyin Türkmen",playerAge = 22,playerPosition = Position.RightCenterBack , playerCost = 3.5, playerId = 11, teamLogoUrl = Team.Trabzonspor.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Trabzonspor,playerName = "Abdülkadir Ömür",playerAge = 20,playerPosition = Position.RightWingMidfielder , playerCost = 14.0, playerId = 12 , teamLogoUrl = Team.Trabzonspor.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Trabzonspor,playerName = "Alexander Sörloth",playerAge = 24,playerPosition = Position.CenterForward , playerCost = 10.0, playerId = 13 , teamLogoUrl = Team.Trabzonspor.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Trabzonspor,playerName = "Badou Ndiaye",playerAge = 29,playerPosition = Position.CenterMidfielder , playerCost = 8.5, playerId = 14 , teamLogoUrl = Team.Trabzonspor.teamAvatarUrl))

        teamPlayers.add(TeamPlayerModel(teamName = Team.Basaksehir,playerName = "Mert Günok",playerAge = 30,playerPosition = Position.Goalkeeper , playerCost = 5.0, playerId = 15 , teamLogoUrl = Team.Basaksehir.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Basaksehir,playerName = "Alexandru Epureanu",playerAge = 33,playerPosition = Position.RightCenterBack , playerCost = 1.7, playerId = 16 , teamLogoUrl = Team.Basaksehir.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Basaksehir,playerName = "İrfan Can Kahveci",playerAge = 24,playerPosition = Position.CenterAttackingMidfielder , playerCost = 9.0, playerId = 17 , teamLogoUrl = Team.Basaksehir.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Basaksehir,playerName = "Edin Visca",playerAge = 29,playerPosition = Position.RightWingMidfielder , playerCost = 12.0, playerId = 18 , teamLogoUrl = Team.Basaksehir.teamAvatarUrl))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Basaksehir,playerName = "Enzo Crivelli",playerAge = 24,playerPosition = Position.CenterForward , playerCost = 6.0, playerId = 19 , teamLogoUrl = Team.Basaksehir.teamAvatarUrl))

        return teamPlayers
    }

    fun getDummyUserList() :  List<BasicItemModel> {
        val dummyList = arrayListOf<BasicItemModel>()
        for (i in 0..10) {
            dummyList.add(
                BasicItemModel(
                    userName = "Gorkem Karayel",
                    userAge = 29,
                    userAvatarUrl = "https://i.pravatar.cc/150?img=3"
                )
            )
        }
        return dummyList
    }
}
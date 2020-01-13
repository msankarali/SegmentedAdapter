package com.karayel.segmentedadapter.util

import com.karayel.segmentedadapter.segmented.Position
import com.karayel.segmentedadapter.segmented.Team
import com.karayel.segmentedadapter.segmented.TeamPlayerModel

object Players{

    fun getDummyPlayerList() : List<TeamPlayerModel>{
        val teamPlayers = arrayListOf<TeamPlayerModel>()
        teamPlayers.add(TeamPlayerModel(teamName = Team.Fenerbahce,playerName = "Serdar Aziz",playerAge = 29,playerPosition = Position.RightCenterBack , playerCost = 2.6, playerId = 0 , teamLogoUrl = "https://i.pinimg.com/originals/47/13/c1/4713c1149ee3fbf08d8d9647ce487b1d.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Fenerbahce,playerName = "Luiz Gustavo",playerAge = 32,playerPosition = Position.CenterDefensiveMidfielder , playerCost = 7.0, playerId = 1 , teamLogoUrl = "https://i.pinimg.com/originals/47/13/c1/4713c1149ee3fbf08d8d9647ce487b1d.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Fenerbahce,playerName = "Vedat Muriqi",playerAge = 25,playerPosition = Position.CenterForward , playerCost = 12.0, playerId = 2 , teamLogoUrl = "https://i.pinimg.com/originals/47/13/c1/4713c1149ee3fbf08d8d9647ce487b1d.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Fenerbahce,playerName = "Ozan tufan",playerAge = 24,playerPosition = Position.CenterAttackingMidfielder , playerCost = 5.0, playerId = 3 , teamLogoUrl = "https://i.pinimg.com/originals/47/13/c1/4713c1149ee3fbf08d8d9647ce487b1d.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Fenerbahce,playerName = "Ferdi Kadıoğlu",playerAge = 20,playerPosition = Position.RightWingMidfielder , playerCost = 2.8, playerId = 4 , teamLogoUrl = "https://i.pinimg.com/originals/47/13/c1/4713c1149ee3fbf08d8d9647ce487b1d.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Galatasaray,playerName = "Fernando Muslera",playerAge = 33,playerPosition = Position.Goalkeeper , playerCost = 5.0, playerId = 5 , teamLogoUrl = "https://i.pinimg.com/originals/a5/2f/5b/a52f5ba052977369a1318aa36f9a9951.png"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Galatasaray,playerName = "Marcao",playerAge = 23,playerPosition = Position.LeftCenterBack , playerCost = 4.0, playerId = 6 , teamLogoUrl = "https://i.pinimg.com/originals/a5/2f/5b/a52f5ba052977369a1318aa36f9a9951.png"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Galatasaray,playerName = "Mario Lemina",playerAge = 26,playerPosition = Position.CenterMidfielder , playerCost = 13.0, playerId = 7 , teamLogoUrl = "https://i.pinimg.com/originals/a5/2f/5b/a52f5ba052977369a1318aa36f9a9951.png"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Galatasaray,playerName = "Henry Onyekuru",playerAge = 22,playerPosition = Position.LeftWingMidfielder , playerCost = 10.0, playerId = 8 , teamLogoUrl = "https://i.pinimg.com/originals/a5/2f/5b/a52f5ba052977369a1318aa36f9a9951.png"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Galatasaray,playerName =  "Falcao",playerAge = 33,playerPosition = Position.Striker , playerCost = 6.0, playerId = 9 , teamLogoUrl = "https://i.pinimg.com/originals/a5/2f/5b/a52f5ba052977369a1318aa36f9a9951.png"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Trabzonspor,playerName = "Uğurcan Çakır",playerAge = 23,playerPosition = Position.Goalkeeper , playerCost = 8.0, playerId = 10 , teamLogoUrl = "https://i.pinimg.com/originals/8c/44/ee/8c44ee5a3249d1d4358f2905ad906d47.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Trabzonspor,playerName = "Hüseyin Türkmen",playerAge = 22,playerPosition = Position.RightCenterBack , playerCost = 3.5, playerId = 11, teamLogoUrl = "https://i.pinimg.com/originals/8c/44/ee/8c44ee5a3249d1d4358f2905ad906d47.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Trabzonspor,playerName = "Abdülkadir Ömür",playerAge = 20,playerPosition = Position.RightWingMidfielder , playerCost = 14.0, playerId = 12 , teamLogoUrl = "https://i.pinimg.com/originals/8c/44/ee/8c44ee5a3249d1d4358f2905ad906d47.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Trabzonspor,playerName = "Alexander Sörloth",playerAge = 24,playerPosition = Position.CenterForward , playerCost = 10.0, playerId = 13 , teamLogoUrl = "https://i.pinimg.com/originals/8c/44/ee/8c44ee5a3249d1d4358f2905ad906d47.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Trabzonspor,playerName = "Badou Ndiaye",playerAge = 29,playerPosition = Position.CenterMidfielder , playerCost = 8.5, playerId = 14 , teamLogoUrl = "https://i.pinimg.com/originals/8c/44/ee/8c44ee5a3249d1d4358f2905ad906d47.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Başakşehir,playerName = "Mert Günok",playerAge = 30,playerPosition = Position.Goalkeeper , playerCost = 5.0, playerId = 15 , teamLogoUrl = "https://pbs.twimg.com/profile_images/1195216198306271232/Jd3oV3_Q_400x400.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Başakşehir,playerName = "Alexandru Epureanu",playerAge = 33,playerPosition = Position.RightCenterBack , playerCost = 1.7, playerId = 16 , teamLogoUrl = "https://pbs.twimg.com/profile_images/1195216198306271232/Jd3oV3_Q_400x400.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Başakşehir,playerName = "İrfan Can Kahveci",playerAge = 24,playerPosition = Position.CenterAttackingMidfielder , playerCost = 9.0, playerId = 17 , teamLogoUrl = "https://pbs.twimg.com/profile_images/1195216198306271232/Jd3oV3_Q_400x400.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Başakşehir,playerName = "Edin Visca",playerAge = 29,playerPosition = Position.RightWingMidfielder , playerCost = 12.0, playerId = 18 , teamLogoUrl = "https://pbs.twimg.com/profile_images/1195216198306271232/Jd3oV3_Q_400x400.jpg"))
        teamPlayers.add(TeamPlayerModel(teamName = Team.Başakşehir,playerName = "Enzo Crivelli",playerAge = 24,playerPosition = Position.CenterForward , playerCost = 6.0, playerId = 19 , teamLogoUrl = "https://pbs.twimg.com/profile_images/1195216198306271232/Jd3oV3_Q_400x400.jpg"))

        return teamPlayers
    }

}
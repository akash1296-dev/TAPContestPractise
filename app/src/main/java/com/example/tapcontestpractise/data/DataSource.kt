package com.example.tapcontestpractise.data

class DataSource {
    companion object {
        private val contestList = ArrayList<ContestModel>()
        private val participantList = ArrayList<ParticipantModel>()

        fun createList() {
            contestList.add(ContestModel(1,"Title For Contest - 1","Small Description for Contest - 1",0,"Long Description of Contest -1",2019,2020))
            contestList.add(ContestModel(2,"Title For Contest - 2","Small Description for Contest - 2",1,"Long Description of Contest -1",2019,2020))
            contestList.add(ContestModel(3,"Title For Contest - 3","Small Description for Contest - 3",0,"Long Description of Contest -1",2019,2020))
            contestList.add(ContestModel(4,"Title For Contest - 4","Small Description for Contest - 4",1,"Long Description of Contest -1",2019,2020))
        }

        fun createParticipantList() {
            participantList.add(ParticipantModel(1,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(2,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(3,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(4,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(5,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(6,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(7,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(8,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(9,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(10,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(11,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(12,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(13,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(9,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(10,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(11,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(12,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(13,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(9,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(10,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(11,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(12,"Aakash","akash@gmail.com",45554))
            participantList.add(ParticipantModel(13,"Aakash","akash@gmail.com",45554))

        }

        fun getContestList(): List<ContestModel> {
            return contestList
        }

        fun getParticipantList(): List<ParticipantModel> {
            return participantList
        }
    }
}
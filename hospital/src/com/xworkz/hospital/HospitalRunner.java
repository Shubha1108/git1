package com.xworkz.hospital;

import com.xworkz.hospital.RoomType;
import com.xworkz.hospital.floor.Floor;
import com.xworkz.hospital.hospital.Hospital;
import com.xworkz.hospital.patient.Patient;
import com.xworkz.hospital.room.Room;

public class HospitalRunner {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.hospitalId = 1;
        hospital.hospitalName = "Apolo";
        hospital.location = "rajajinagara";

        Floor floors[] = new Floor[2];

        Floor floor1 = new Floor();
        floor1.floorId = 1;
        floor1.numberOfRooms = 5;

        Room rooms[] = new Room[2];
        Room room1 = new Room();
        room1.roomType = RoomType.ICU;

        Patient patients1[] = new Patient[1];
        Patient patient1 = new Patient();

        patient1.setPatientId(1);
        patient1.setPatientName("suma");
        patient1.setAdress("banglore");
        patient1.setPhoneNumber(8861938137L);

        patients1[0] = patient1;
        room1.patients = patients1;
        rooms[0] = room1;


        Room room2 = new Room();
        room2.roomType = RoomType.Dulex;
        Patient patients2[] = new Patient[1];
        Patient patient2 = new Patient();

        patient2.setPatientId(1);
        patient2.setPatientName("rama");
        patient2.setAdress("chikkamagaluru");
        patient2.setPhoneNumber(8861938147L);
        patients2[0] = patient2;
        room2.patients = patients2;
        rooms[1] = room2;

        floor1.rooms = rooms;


        Floor floor2 = new Floor();
        floor2.floorId = 1;
        floor2.numberOfRooms = 5;

        Room rooms3[] = new Room[2];
        Room room3 = new Room();
        room3.roomType = RoomType.ICU;

        Patient patients3[] = new Patient[1];
        Patient patient3 = new Patient();

        patient3.setPatientId(6);
        patient3.setPatientName("raj");
        patient3.setAdress("banglore");
        patient3.setPhoneNumber(8861938137L);

        patients3[0] = patient3;
        room3.patients = patients3;
        rooms3[0] = room3;

        Room room4 = new Room();
        room4.roomType = RoomType.Dulex;

        Patient patients4[] = new Patient[1];
        Patient patient4 = new Patient();
        patient4.setPatientId(2);
        patient4.setPatientName("shama");
        patient4.setAdress("chikkamagaluru");
        patient4.setPhoneNumber(8861938147L);
        patients4[0] = patient4;
        room4.patients = patients4;
        rooms3[1] = room4;
        floor2.rooms = rooms3;

        floors[0] = floor1;
        floors[1] = floor2;


        hospital.floors = floors;

        hospital.displayDetails();


    }
}



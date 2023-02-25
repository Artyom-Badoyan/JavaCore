package homework.homework10.medicalCenter.model;


/*
Բարի երեկո։
Ուղարկում եմ գործնական տնայինը, որը պետք է ավարտել մինչև շաբաթ օրվա դասը։
Սարքում եք medicalCenter փեքիջը, որի մեջ գրելու ենք ծրագիր, որը նախատեսված է  բժշկական հաստատության համար,
հնարավոր է ունենալ բժիշկներ, և հիվանդներ, ովքեր կարող են հերթագրվել բժիշկների մոտ։
Ունենալու ենք հետևյալ օբյեկտները։
Doctor(id, name, surname, email, phoneNumber, profession)
Patient(id(այդի քարդի համարը), name, surname, phone, doctor(թե որ դոկտորի մոտ է գրանցվել), register date time)
Քանի որ երկու տիպերը իրար նման են, կարող եք ժառանգականություն օգտագործել, մի հատ Person կլասս սարքեք,
ընդհանուր դաշտերը իրա մեջ գրեք, մնացածը ամենքը իրա կլասսում։
Ունենալու ենք հետևյալ հրամանները
0 - exit
1 - add doctor
2 - search doctor by profession
3 - delete doctor by id
4 -  change doctor data by id(բացի իդ-ից ամեն ինչ կարողանալու ենք փոխել)
5 - add patient(ընտրելու եք բժշկին, բայց ստուգեք որ էդ ժամը զբաղված չլինի)
6 - print all  patients by doctor
7 - print todays patients
Ամսաթվերի հետ աշխատանքը կարող եք անել Date-կլասսի մեթոդներով։ Հարցերի դեպքում գրեք չաթի մեջ։
Հրամանները պտի պահեք Interface-ով։
Բոլոր հնարավորությունները առանձին սիրուն մեթոդներով արեք, DateUtil-ը նույնպես ինչպես անցել ենք։*/
public class Doctor extends Person {

    private String email;
    private String profession;

    public Doctor(String id, String name, String surname, String phone, String email, String profession) {
        super(id, name, surname, phone);
        this.email = email;
        this.profession = profession;
    }

    public Doctor() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Doctor doctor = (Doctor) o;

        if (getEmail() != null ? !getEmail().equals(doctor.getEmail()) : doctor.getEmail() != null) return false;
        return getProfession() != null ? getProfession().equals(doctor.getProfession()) : doctor.getProfession() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getProfession() != null ? getProfession().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                "} " + super.toString();
    }
}

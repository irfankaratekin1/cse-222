public class Assistant extends User<Assistant> {

    public Assistant(){
        super();
    }

    public Assistant(String name, String surname){
        super(name, surname);
    }

    public Assistant(String name, String surname, String mail){
        super(name, surname, mail);
    }

    @Override
    public int compareTo(Assistant o) {
        return 0;
    }
}

package sesi7;

public class Mahasiswa<N, NA, C, U> {
    private N nim;
    private NA name;
    private C clas;
    private U umur;

    public N getNim() {
        return nim;
    }

    public void setNim(N nim) {
        this.nim = nim;
    }

    public NA getName() {
        return name;
    }

    public void setName(NA name) {
        this.name = name;
    }

    public C getClas() {
        return clas;
    }

    public void setClas(C clas) {
        this.clas = clas;
    }
    public U getUmur() {
        return umur;
    }

    public void setUmur(U umur) {
        this.umur = umur;
    }
    public static void main(String[] args) {
        Mahasiswa<String, String, String, Integer> m = new Mahasiswa<>();
        m.setNim("20220040151");
        m.setName("Irdi");
        m.setClas("TI22A");
        m.setUmur(20);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
        System.out.println(m.getUmur());
    }
}
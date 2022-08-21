public class Test {
    public static void main(String[] args) {
        Guitarist b = new ClassicalGuitarist();
        b.playMusic();
        b.readNotes();
        Pianist a = new Pianist();
        a.playMusic();
        a.readNotes();
        System.out.println("------------");
        play(new Guitarist[]{new BassGuitarist(),
                new ClassicalGuitarist(), new BassGuitarist()});
        h(new Human());
        h(new Student());
        p(new Pianist());
        p(new BassGuitarist());
        p(new ClassicalGuitarist());
Student s= new Student();
s.sum(1,2,3);
s.sum(1,2);
    }

    static void play(Guitarist[] guitarists) {
        for (Guitarist g : guitarists) {
            g.playMusic();
            if (g instanceof BassGuitarist) {
                BassGuitarist bg = (BassGuitarist) g;
                bg.bass();
            }
        }
    }
static void h(Human h){

}

static void p(Musician m){
       m.playMusic();
}
}

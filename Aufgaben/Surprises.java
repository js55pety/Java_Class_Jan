class Surprises {

    public static void main(String[] args) {
        (new SurpriseBag("Schokolade")).show();
        (new SurpriseBag("Buch", "Stift")).show();
        for (int i = 0; i < (int) (Math.random() * 10); ++i) {
                (new SurpriseBag()).show();
        }
        Out.println("Gesamtzahl erzeugter Pakete: " + SurpriseBag.getTotalNumber());
        Out.println();
        SurpriseBag.showAllBags();
    }

}

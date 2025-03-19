public enum GEOPOLITICALZONES {
    SOUTHSOUTH("Akwa Ibom","Delta","Bayelsa","Edo","Rivers","Cross Rivers"),
    NORTHEAST("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    NORTHCENTRAL("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"),
    NORTHWEST("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTHWEST("Lagos","Ekiti","Osun","Oyo","Ogun","Ondo"),
    SOUTHEAST("Anambra","Imo","Abia","Ebonyi","Enugu");

    private String[] state;

    GEOPOLITICALZONES(String... state) {
        this.state = state;
    }
    public static GEOPOLITICALZONES getZoneForState(String state) {
        for(GEOPOLITICALZONES zone : GEOPOLITICALZONES.values()) {
            if(zone.state[0].equals(state)) {
                return zone;
            }
        }
        return null;
    }
}

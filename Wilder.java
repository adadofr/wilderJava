public class Wilder {
  private String firstname;
  private boolean aware;

  public Wilder(String firstname, boolean aware) {
    this.firstname = firstname;
    this.aware = aware;
  }

  public String getFirstname() {
    return this.firstname;
  }

  public boolean isAware() {
    return this.aware;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public void setAware(boolean aware) {
    this.aware = aware;
  }

  public static String whoAmI(String firstname, boolean aware) {
    if (aware && firstname.length() != 0) {
      return "Je m'appelle " + firstname + " et je suis aware";
    } else if (!aware && firstname.length() != 0) {
      return "Je m'appelle " + firstname + " et je ne suis pas aware";
    } else
      return "pas d'eleve";
  }

}

package builder;

public class BuilderExample {

  public static void main(String[] args) {

    Phone.Builder builder = new Phone.Builder()
        .backPanel("Sandstone")
        .frontPanel("AMOLED")
        .camera("12MP")
        .processor("SnapDragon");

    Phone phone = builder.build();

  }
}

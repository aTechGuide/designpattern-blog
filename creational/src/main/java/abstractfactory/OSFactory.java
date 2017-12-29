package abstractfactory;

public interface OSFactory {

  Phone create(ManufacturerType manufacturerType);
}

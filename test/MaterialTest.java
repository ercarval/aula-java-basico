
public class MaterialTest {

	public static void main(String[] args) {
		
		Material material = new Material();
		material.category = 'A';
		material.partNumber = "6005-1";
		material.dangerClass = "9.4";
		material.unitOfMeasure = "EA";
		material.weight = 123.8F;
		material.weightUnitOfMeasure = "G";
		material.materialGroup = "ABCSER";

		Material optional = new Material();
		optional.category = 'B';
		optional.partNumber = "CARACA-005-1";
		optional.dangerClass = "9.4";
		optional.unitOfMeasure = "G";
		optional.weight = 123.8F;
		optional.weightUnitOfMeasure = "G";
		optional.materialGroup = "ABCSER";

		Material interchangeable = new Material();
		interchangeable.category = 'A';
		interchangeable.partNumber = "6005-4";
		interchangeable.dangerClass = "9.4";
		interchangeable.unitOfMeasure = "PC";
		interchangeable.weight = 123.8F;
		interchangeable.weightUnitOfMeasure = "G";
		interchangeable.materialGroup = "ABCSER";
		
		
		material = interchangeable;
		interchangeable.partNumber = "CaracaMaluco";
		
		
		
		
		
	}

}

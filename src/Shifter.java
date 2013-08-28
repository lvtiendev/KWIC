// Common interfaces for shiters
public interface Shifter {
	public void setup(Storage _storage);
	public int length();
	public String shiftedLineAtIndex(int index);
}

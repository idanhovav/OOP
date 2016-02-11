public interface Animal{
	
	int getAge();
	void setAge(int age);
	int getSize();
	void setSize(int size);
	void sleep();
	void hunt();
	void drink();
	void run();
	void fight(Animal other);
	int compareTo(Animal other);

}
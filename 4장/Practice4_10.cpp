#include <iostream>
#include <string>
using namespace std;

class Person {
	string name;
public:
	Person() { name = " "; }
	Person(string name) { this->name = name; }
	string getName() { return name; }
};

class Family {
	Person *p;
	int size;
	string fname;
public:
	Family(string fname, int size);
	void show();
	void setName(int index, string name);
	~Family();
};

Family::Family(string fname, int size) {
	this->size = size;
	this->fname = fname;
	p = new Person[this->size];
}
void Family::show() {
	cout << fname << "가족은 다음과 같이 " << size << "명 입니다." << endl;
	for (int i = 0; i < size; i++)	{
		cout << p[i].getName() << "   ";
	}
}
void Family::setName(int index, string name) {
	p[index] = name;
}
Family::~Family() {
	delete [] p;
}

int main() {
	Family *simpson = new Family("Simpson", 3);
	simpson->setName(0, "Mr. Simpson");
	simpson->setName(1, "Mrs. Simpson");
	simpson->setName(2, "Bart Simpson");
	simpson->show();
	delete simpson;
}
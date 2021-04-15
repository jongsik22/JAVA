#include <iostream>
using namespace std;

class Circle {
	int radius;
	string name;
public:
	Circle();
	void setCircle(string name, int radius);
	double getArea();
	string getName();
};
void Circle::setCircle(string name, int radius) {
	this->name = name;
	this->radius = radius;
}
double Circle::getArea() {
	return radius * radius * 3.14;
}
string Circle::getName() {
	return name;
}


class CircleManager {
	Circle *p;
	int size;
public:
	CircleManager(int size);
	~CircleManager();
	void searchByName();
	void searchByArea();
};
CircleManager::CircleManager(int size) {
	p = new Circle[size];
}
CircleManager::~CircleManager() {
	delete [] p;
}
void CircleManager::searchByName() {
	string s;
	for (int i = 0; i < size; i++) {
		if (p[i] == s) {

		}
	}
}

int main() {
	int n;
	cout << "원의 개수 >> ";
	cin >> n;
}
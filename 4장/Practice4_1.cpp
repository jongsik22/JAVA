#include <iostream>
#include <string>
using namespace std;

class Color {
	string c;
public:
	Color() { c = "white"; cout << "기본" << endl; }
	Color(string c) { this->c = c; cout << "매개" << endl; }
	~Color() { cout << "소멸" << endl; }
};

class Palette {
	Color *p;
public:
	Palette() { p = new Color[3]; }
	~Palette() { delete [] p; }
};
int main() {
	Palette *p = new Palette;
	delete p;
}
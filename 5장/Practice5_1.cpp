#include <iostream>
using namespace std;

class Circle {

};
void swap(Circle &a, Circle &b) {
	Circle tmp;
	tmp = a;
	a = b;
	b = tmp;
}
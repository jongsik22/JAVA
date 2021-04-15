#include <iostream>
#include <string>
using namespace std;

class Matrix {
	int a, b, c, d;
public:
	Matrix() { a, b, c, d = 0; }
	Matrix(int a, int b, int c, int d) { this->a = a; this->b = b; this->c = c; this->d = d; }
	void show() { cout << "Matrix = { " << a << ' ' << b << ' ' << c << ' ' << d << ' ' << "}" << endl; }
	Matrix operator +(Matrix &m);
	Matrix operator +=(Matrix &m);
	bool operator ==(Matrix &m);
};

Matrix Matrix::operator+(Matrix &m) {
	Matrix tmp;
	tmp.a = a + m.a;
	tmp.b = b + m.b;
	tmp.c = c + m.c;
	tmp.d = d + m.d;
	return tmp;
}
Matrix Matrix::operator+=(Matrix &m) {
	a += m.a;
	b += m.b;
	c += m.c;
	d += m.d;
	return *this;
}
bool Matrix::operator==(Matrix &m) {
	if (a == m.a&&b == m.b&&c == m.c&&d == m.d) return true;
	else return false;
}

int main() {
	Matrix a(1, 2, 3, 4), b(2, 3, 4, 5), c;
	c = a + b;
	a += b;
	a.show(); b.show(); c.show();
	if (a == c) {
		cout << "a and c are the same" << endl;
	}
}
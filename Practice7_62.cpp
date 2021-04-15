#include <iostream>
#include <string>
using namespace std;
class Matrix;
Matrix operator +(Matrix &m, Matrix &n);
Matrix operator +=(Matrix &m, Matrix &n);
bool operator ==(Matrix &m, Matrix &n);

class Matrix {
	int a, b, c, d;
public:
	Matrix() { a, b, c, d = 0; }
	Matrix(int a, int b, int c, int d) { this->a = a; this->b = b; this->c = c; this->d = d; }
	void show() { cout << "Matrix = { " << a << ' ' << b << ' ' << c << ' ' << d << ' ' << "}" << endl; }
	friend Matrix operator +(Matrix &m, Matrix &n);
	friend Matrix operator +=(Matrix &m, Matrix &n);
	friend bool operator ==(Matrix &m, Matrix &n);
};

Matrix operator+(Matrix &m, Matrix &n) {
	Matrix tmp;
	tmp.a = n.a + m.a;
	tmp.b = n.b + m.b;
	tmp.c = n.c + m.c;
	tmp.d = n.d + m.d;
	return tmp;
}
Matrix operator+=(Matrix &m, Matrix &n) {
	m.a += n.a;
	m.b += n.b;
	m.c += n.c;
	m.d += n.d;
	return m;
}
bool operator==(Matrix &m, Matrix &n) {
	if (n.a == m.a&&n.b == m.b&&n.c == m.c&&n.d == m.d) return true;
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
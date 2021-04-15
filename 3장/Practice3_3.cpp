#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;
class Random {
public:
	Random();
	int next();
	int nextInRange();
};
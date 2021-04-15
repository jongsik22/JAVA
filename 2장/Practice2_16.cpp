#include <iostream>
#include <cstring>
#include <string>
using namespace std;

int main() {
	int sum = 0;
	int cnt = 0;
	int alpha[26];
	char a[10000];
	char A;
	cout << "영문 텍스트를 입력하세요. 히스토그램을 그립니다.\n텍스트의 끝은 ; 입니다. 10000개까지 가능합니다.";
	cin.getline(a, 10000, ';');
	for (int n = 0; n < strlen(a); n++)
	{
		if (isalpha(a[n]) != 0)
		{
			sum++;
		}
	}
	cout << "총 알파벳 수 : " << sum << "\n\n";
	for (char c = 'a'; c <= 'z'; c++)
	{
		for (int i = 0; i < strlen(a); i++)
		{
			if (isalpha(a[i]) != 0)
			{
				A = tolower(a[i]);
				if (A == c)
				{
					cnt++;
				}
				sum++;
			}
		}
		cout << c << " (" << cnt << ") : ";
		for (int j = 0; j < cnt; j++)
		{
			cout << '*';
		}
		cnt = 0;
		cout << "\n";
	}
	
}
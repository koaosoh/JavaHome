'''
Created on Sep 8, 2015

@author: Kent
'''
def main():
    tempF = input("Input the temperature in Fahrenheit: ")
    tempC = (5.0/9.0) * (tempF - 32.0)
    print (tempF, " F = ", tempC, " C")
    
main()
package Prac10;
class Complex{
    int real;
    int image;
}
public interface ComplexAbstractFactory {
    Complex createComplex(int real, int image);
    Complex createComplex();
}

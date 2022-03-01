package lesson4;

/**
 * Треугольник
 */
public class Triangle {
    /**
     * Вычислить площадь треугольника
     *
     * @param a - длина стороны а
     * @param b - длина стороны b
     * @param c - длина стороны c
     * @return - площадь треугольника
     * @throws TriangleException
     */
    public static int area(int a, int b, int c) throws TriangleException {
        if (a > 0 && b > 0 && c > 0) { // длина сторон больше нуля
            if (a + b > c && a + c > b && b + c > a) { // стороны соответсвуют треугольнику
                // считаем площадь
                double p = (a + b + c) / 2;
                double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                return (int) s;
            }
        }
        throw new TriangleException();
    }
}

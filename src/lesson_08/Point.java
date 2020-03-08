package lesson_08;

    public abstract class Point extends Shape {
        private static final String NAME = "Circle" ;

        private int x, y;

        public Point( int a, int b ) {
            x = a; y = b; }

        public int getX() {
            return x; }

        public int getY() {
            return y; }

        @Override
        public String toString() {
            return "[" + x + ", " + y + "]"; }
        @Override
        public String getName() {
            return NAME;
        }
    }


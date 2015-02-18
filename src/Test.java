class Test
{
    public static void main(String[] args)
    {
        testSum();
		testSubtract();
		testMultiplication();
    }

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }

	
    private static void testSubtract()
    {
        int a = 20;
        int b = 10;
        int expected = 10;
        BasicMath bm = new BasicMath();
        int result = bm.subtract(a, b);
        if (result == expected)
        {
            System.out.println("Subtract: OK");
        }
        else
        {
            System.out.println("Subtract: Failed, expected = " + expected + ", result = " + result);
        }
    }

    private static void testMultiplication()
    {
        int a = 5;
        int b = 6;
        int expected = 30;
        BasicMath bm = new BasicMath();
        int result = bm.multiplication(a, b);
        if (result == expected)
        {
            System.out.println("Multiplication: OK");
        }
        else
        {
            System.out.println("Multiplication: Failed, expected = " + expected + ", result = " + result);
        }
    }
}

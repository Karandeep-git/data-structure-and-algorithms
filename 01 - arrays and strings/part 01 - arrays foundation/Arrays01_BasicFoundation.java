class Arrays01_BasicFoundation {
    public static void main(String[] args) {
        
        // Declaration
        int[] arrOne;

        // Initialization
        arrOne = new int[5]; // creates 5 boxes, all filled with 0 by defaul
        
        // Declaration + Initialization together
        int[] arrTwo = new int[5];

        // Declaration + Initialization with values
        int[] arrThree = { 10, 20, 30, 40, 50 };

        // Indexing & Access
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr[4]);
        System.out.println(arr.length);

        
    }
}
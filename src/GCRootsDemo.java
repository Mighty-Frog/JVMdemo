public class GCRootsDemo {
    private static final int _1MB = 1024 * 1024;
    private byte[] bigSize = new byte[2 * _1MB];
    private static GCRootsDemo gcRootsObject;

    public static void main(String[] args) {
        gcRootsObject = new GCRootsDemo();
        //gcRootsObject != null;
        System.gc();
    }
}

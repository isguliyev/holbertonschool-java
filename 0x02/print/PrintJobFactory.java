public class PrintJobFactory {
    public static PrintJob createPrintJob(
        PrintSize printSize,
        int totalPages,
        int colorPages,
        boolean isDoubleSided
    ) {
        return switch (printSize) {
            case PrintSize.A2 -> new PrintJob(totalPages, colorPages, isDoubleSided, 0.28d, 0.18d, 0.32d, 0.22d);
            case PrintSize.A3 -> new PrintJob(totalPages, colorPages, isDoubleSided, 0.25d, 0.15d, 0.30d, 0.20d);
            case PrintSize.A4 -> new PrintJob(totalPages, colorPages, isDoubleSided, 0.20d, 0.10d, 0.25d, 0.15d);
        };
    }
}
public class PrintJob {
    private int totalPages;
    private int colorPages;
    private boolean isDoubleSided;
    private double colorDoubleSidedCost;
    private double bwDoubleSidedCost;
    private double colorSingleSidedCost;
    private double bwSingleSidedCost;

    public PrintJob(
        int totalPages,
        int colorPages,
        boolean isDoubleSided,
        double colorDoubleSidedCost,
        double bwDoubleSidedCost,
        double colorSingleSidedCost,
        double bwSingleSidedCost
    ) {
        this.totalPages = totalPages;
        this.colorPages = colorPages;
        this.isDoubleSided = isDoubleSided;
        this.colorDoubleSidedCost = colorDoubleSidedCost;
        this.bwDoubleSidedCost = bwDoubleSidedCost;
        this.colorSingleSidedCost = colorSingleSidedCost;
        this.bwSingleSidedCost = bwSingleSidedCost;
    }

    public double calculateTotal() {
        if (this.isDoubleSided) {
            return this.colorDoubleSidedCost * this.colorPages
                + (this.totalPages - this.colorPages) * this.bwDoubleSidedCost;
        }

        return this.colorSingleSidedCost * this.colorPages
            + (this.totalPages - this.colorPages) * this.bwSingleSidedCost;
    }

    @Override
    public String toString() {
        return String.format(
            "total pages: %d, color pages: %d, black-and-white pages: %d, %s. total: $%.2f",
            this.totalPages,
            this.colorPages,
            this.totalPages - this.colorPages,
            isDoubleSided ? "double-sided" : "single-sided",
            this.calculateTotal()
        );
    }

    private void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    private void setColorPages(int colorPages) {
        this.colorPages = colorPages;
    }

    private void setIsDoubleSided(boolean isDoubleSided) {
        this.isDoubleSided = isDoubleSided;
    }

    private void setColorDoubleSidedCost(double colorDoubleSidedCost) {
        this.colorDoubleSidedCost = colorDoubleSidedCost;
    }

    private void setBwDoubleSidedCost(double bwDoubleSidedCost) {
        this.bwDoubleSidedCost = bwDoubleSidedCost;
    }

    private void setColorSingleSidedCost(double colorSingleSidedCost) {
        this.colorSingleSidedCost = colorSingleSidedCost;
    }

    private void setBwSingleSidedCost(double bwSingleSidedCost) {
        this.bwSingleSidedCost = bwSingleSidedCost;
    }

    private int getTotalPages() {
        return this.totalPages;
    }

    private int getColorPages() {
        return this.colorPages;
    }

    private boolean getIsDoubleSided() {
        return this.isDoubleSided;
    }

    private double getColorDoubleSidedCost() {
        return this.colorDoubleSidedCost;
    }

    private double getBwDoubleSidedCost() {
        return this.bwDoubleSidedCost;
    }

    private double getColorSingleSidedCost() {
        return this.colorSingleSidedCost;
    }

    private double getBwSingleSidedCost() {
        return this.bwSingleSidedCost;
    }
}
public class Cell {
    private boolean isCovered;
    private boolean isMarked;
    private CellType cellType;

    public Cell() {
        this.isCovered = true;
        this.isMarked = false;
        this.cellType = CellType.Empty;
    }

    public Cell(boolean isCovered, boolean isMarked) {
        this.isCovered = isCovered;
        this.isMarked = isMarked;
        this.cellType = CellType.Empty;
    }

    public void cellCount() {
        //cell counting
    }

    public void flipUp() {
        this.isCovered = false;
    }

    public String getImageName() {
        if (isCovered) {
            if (isMarked) {
                return ImageName.Marked.toString();
            } else {
                return ImageName.Covered.toString();
            }
        } else {
            if (cellType == CellType.Bomb) {
                return ImageName.Bomb.toString();
            } else {
                return ImageName.Empty.toString();
            }
        }
    }

    public CellType getCellType() {
        return cellType;
    }

    public boolean isCoveredCell() {
        return isCovered;
    }

    public boolean isMarkedCell() {
        return isMarked;
    }

    public void changeWhetherMarked() {
        isMarked = !isMarked;
    }
}

enum CellType {
    Bomb,
    Bombneighbor,
    Empty
}

enum ImageName {
    Empty,
    Covered,
    Marked,
    Wrongmarked,
    Bomb
}


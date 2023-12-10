public class NeighborOfBombCell extends Cell {
    private int bombCellCount;

    public NeighborOfBombCell() {
        super();
        this.bombCellCount = 0;
    }

    public NeighborOfBombCell(boolean isCovered, boolean isMarked) {
        super(isCovered, isMarked);
        this.bombCellCount = 0;
    }

    public void getCount() {
        // Implementation for counting the number of bomb cells nearby
    }

    @Override
    public CellType getCellType() {
        return CellType.Bombneighbor;
    }

    @Override
    public String getImageName() {
        return ImageName.Covered.toString();
    }
}
public class EmptyCell extends Cell {
    public EmptyCell() {
        super();
    }

    public EmptyCell(boolean isCovered, boolean isMarked) {
        super(isCovered, isMarked);
    }

    @Override
    public CellType getCellType() {
        return CellType.Empty;
    }

    @Override
    public String getImageName() {
        return ImageName.Empty.toString();
    }
}
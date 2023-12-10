public class BombCell extends Cell {
    public BombCell() {
        super();
    }

    public BombCell(boolean isCovered, boolean isMarked) {
        super(isCovered, isMarked);
    }

    @Override
    public CellType getCellType() {
        return CellType.Bomb;
    }

    @Override
    public String getImageName() {
        return ImageName.Bomb.toString();
    }
}

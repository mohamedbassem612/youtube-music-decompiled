package app.rive.semantics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsBoundsUpdate {
    public static final int $stable = 0;
    private final int id;
    private final float maxX;
    private final float maxY;
    private final float minX;
    private final float minY;

    public SemanticsBoundsUpdate(int i, float f, float f2, float f3, float f4) {
        this.id = i;
        this.minX = f;
        this.minY = f2;
        this.maxX = f3;
        this.maxY = f4;
    }

    public static /* synthetic */ SemanticsBoundsUpdate copy$default(SemanticsBoundsUpdate semanticsBoundsUpdate, int i, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = semanticsBoundsUpdate.id;
        }
        if ((i2 & 2) != 0) {
            f = semanticsBoundsUpdate.minX;
        }
        if ((i2 & 4) != 0) {
            f2 = semanticsBoundsUpdate.minY;
        }
        if ((i2 & 8) != 0) {
            f3 = semanticsBoundsUpdate.maxX;
        }
        if ((i2 & 16) != 0) {
            f4 = semanticsBoundsUpdate.maxY;
        }
        return semanticsBoundsUpdate.copy(i, f, f2, f3, f4);
    }

    public final int component1() {
        return this.id;
    }

    public final float component2() {
        return this.minX;
    }

    public final float component3() {
        return this.minY;
    }

    public final float component4() {
        return this.maxX;
    }

    public final float component5() {
        return this.maxY;
    }

    public final SemanticsBoundsUpdate copy(int i, float f, float f2, float f3, float f4) {
        return new SemanticsBoundsUpdate(i, f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticsBoundsUpdate) {
            SemanticsBoundsUpdate semanticsBoundsUpdate = (SemanticsBoundsUpdate) obj;
            if (this.id == semanticsBoundsUpdate.id && Float.compare(this.minX, semanticsBoundsUpdate.minX) == 0 && Float.compare(this.minY, semanticsBoundsUpdate.minY) == 0 && Float.compare(this.maxX, semanticsBoundsUpdate.maxX) == 0 && Float.compare(this.maxY, semanticsBoundsUpdate.maxY) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int getId() {
        return this.id;
    }

    public final float getMaxX() {
        return this.maxX;
    }

    public final float getMaxY() {
        return this.maxY;
    }

    public final float getMinX() {
        return this.minX;
    }

    public final float getMinY() {
        return this.minY;
    }

    public int hashCode() {
        return (((((((this.id * 31) + Float.floatToIntBits(this.minX)) * 31) + Float.floatToIntBits(this.minY)) * 31) + Float.floatToIntBits(this.maxX)) * 31) + Float.floatToIntBits(this.maxY);
    }

    public String toString() {
        return "SemanticsBoundsUpdate(id=" + this.id + ", minX=" + this.minX + ", minY=" + this.minY + ", maxX=" + this.maxX + ", maxY=" + this.maxY + ')';
    }
}

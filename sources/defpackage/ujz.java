package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ujz {
    private final akit a;
    private final float b;
    private final float c;

    public ujz(akit akitVar, float f, float f2) {
        this.a = akitVar;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ujz) {
            ujz ujzVar = (ujz) obj;
            if (awrc.c(this.a, ujzVar.a) && Float.compare(this.b, ujzVar.b) == 0 && Float.compare(this.c, ujzVar.c) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "CropOverlay(cropOverlayData=" + this.a + ", minAspectRatio=" + this.b + ", maxAspectRatio=" + this.c + ')';
    }
}

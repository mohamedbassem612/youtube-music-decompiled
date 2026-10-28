package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ihj {
    public final Bitmap a;
    public final auiu b;

    public ihj(Bitmap bitmap, auiu auiuVar) {
        if (bitmap == null) {
            throw new NullPointerException("Null bitmap");
        }
        this.a = bitmap;
        this.b = auiuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ihj) {
            ihj ihjVar = (ihj) obj;
            if (this.a.equals(ihjVar.a) && this.b.equals(ihjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        auiu auiuVar = this.b;
        return "BitmapAndPalette{bitmap=" + this.a.toString() + ", palette=" + auiuVar.toString() + '}';
    }

    public ihj() {
        throw null;
    }
}

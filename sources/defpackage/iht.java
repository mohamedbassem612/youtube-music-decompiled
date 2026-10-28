package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iht extends iik {
    private final Bitmap a;
    private final anzs b;

    public iht(Bitmap bitmap, anzs anzsVar) {
        if (bitmap == null) {
            throw new NullPointerException("Null thumbnailBitmap");
        }
        this.a = bitmap;
        this.b = anzsVar;
    }

    @Override // defpackage.iik
    public final Bitmap a() {
        return this.a;
    }

    @Override // defpackage.iik
    public final anzs b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iik) {
            iik iikVar = (iik) obj;
            if (this.a.equals(iikVar.a()) && this.b.equals(iikVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        anzs anzsVar = this.b;
        return "RecentlyPlayedItemResult{thumbnailBitmap=" + this.a.toString() + ", proto=" + anzsVar.toString() + '}';
    }
}

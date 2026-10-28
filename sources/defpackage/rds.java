package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rds {
    public final Bitmap a;
    public final zhk b;

    public rds(Bitmap bitmap, zhk zhkVar) {
        this.a = bitmap;
        this.b = zhkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rds) {
            rds rdsVar = (rds) obj;
            Bitmap bitmap = this.a;
            if (bitmap != null ? bitmap.equals(rdsVar.a) : rdsVar.a == null) {
                zhk zhkVar = this.b;
                if (zhkVar == null) {
                    if (rdsVar.b == null) {
                        return true;
                    }
                } else if (zhkVar.equals(rdsVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int iHashCode = bitmap == null ? 0 : bitmap.hashCode();
        zhk zhkVar = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (zhkVar != null ? zhkVar.hashCode() : 0);
    }

    public final String toString() {
        zhk zhkVar = this.b;
        return "State{thumbnail=" + String.valueOf(this.a) + ", waiter=" + String.valueOf(zhkVar) + '}';
    }

    public rds() {
        throw null;
    }
}

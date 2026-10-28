package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bwj extends IllegalStateException {
    public final int a;
    public final int b;

    public bwj(int i, int i2) {
        super(i != 0 ? i != 1 ? i != 2 ? i != 3 ? a.bP(i2, "Player stuck suppressed for ", " ms") : a.bP(i2, "Player stuck playing without ending for ", " ms") : a.bP(i2, "Player stuck playing with no progress for ", " ms") : a.bP(i2, "Player stuck buffering with no progress for ", " ms") : a.bP(i2, "Player stuck buffering and not loading for ", " ms"));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bwj bwjVar = (bwj) obj;
            if (this.a == bwjVar.a && this.b == bwjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + this.b;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cri {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public cri(int i, int i2, int i3, int i4, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public final boolean a(int i) {
        if (i == 1) {
            if (this.a - this.b > 1) {
                return true;
            }
        } else if (this.c - this.d > 1) {
            return true;
        }
        return false;
    }

    public cri(int i, int i2, int i3, boolean z, int i4) {
        this.a = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.b = i4;
    }
}

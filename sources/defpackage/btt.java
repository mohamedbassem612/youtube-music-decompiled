package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class btt {
    public final int a;
    public final bto b;
    public final int[] c;
    private final boolean d;
    private final boolean[] e;

    static {
        int i = bwp.a;
    }

    public btt(bto btoVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = btoVar.a;
        this.a = i;
        ahno.F(i == iArr.length && i == zArr.length);
        this.b = btoVar;
        this.d = z && i > 1;
        this.c = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.b.c;
    }

    public final bse b(int i) {
        return this.b.b(i);
    }

    public final boolean c() {
        for (boolean z : this.e) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i) {
        return this.e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            btt bttVar = (btt) obj;
            if (this.d == bttVar.d && this.b.equals(bttVar.b) && Arrays.equals(this.c, bttVar.c) && Arrays.equals(this.e, bttVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + (this.d ? 1 : 0)) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.e);
    }
}

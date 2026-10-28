package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class btn {
    public static final btn a = new btk();

    static {
        int i = bwp.a;
    }

    protected btn() {
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract btl d(int i, btl btlVar, boolean z);

    public abstract btm e(int i, btm btmVar, long j);

    public boolean equals(Object obj) {
        int iH;
        if (this == obj) {
            return true;
        }
        if (obj instanceof btn) {
            btn btnVar = (btn) obj;
            if (btnVar.c() == c() && btnVar.b() == b()) {
                btm btmVar = new btm();
                btl btlVar = new btl();
                btm btmVar2 = new btm();
                btl btlVar2 = new btl();
                for (int i = 0; i < c(); i++) {
                    if (e(i, btmVar, 0L).equals(btnVar.e(i, btmVar2, 0L))) {
                    }
                }
                for (int i2 = 0; i2 < b(); i2++) {
                    if (d(i2, btlVar, true).equals(btnVar.d(i2, btlVar2, true))) {
                    }
                }
                int iG = g(true);
                if (iG == btnVar.g(true) && (iH = h(true)) == btnVar.h(true)) {
                    while (iG != iH) {
                        int iJ = j(iG, 0, true);
                        if (iJ == btnVar.j(iG, 0, true)) {
                            iG = iJ;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public abstract Object f(int i);

    public int g(boolean z) {
        return n() ? -1 : 0;
    }

    public int h(boolean z) {
        if (n()) {
            return -1;
        }
        return (-1) + c();
    }

    public int hashCode() {
        int i;
        btm btmVar = new btm();
        btl btlVar = new btl();
        int iC = c() + 217;
        int i2 = 0;
        while (true) {
            i = iC * 31;
            if (i2 >= c()) {
                break;
            }
            iC = i + e(i2, btmVar, 0L).hashCode();
            i2++;
        }
        int iB = i + b();
        for (int i3 = 0; i3 < b(); i3++) {
            iB = (iB * 31) + d(i3, btlVar, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = j(iG, 0, true);
        }
        return iB;
    }

    public final int i(int i, btl btlVar, btm btmVar, int i2, boolean z) {
        int i3 = d(i, btlVar, false).c;
        if (e(i3, btmVar, 0L).p != i) {
            return i + 1;
        }
        int iJ = j(i3, i2, z);
        if (iJ != -1) {
            return e(iJ, btmVar, 0L).o;
        }
        return -1;
    }

    public int j(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            }
            if (i == h(z)) {
                return g(z);
            }
        } else if (i == h(z)) {
            return -1;
        }
        return i + 1;
    }

    public final Pair k(btm btmVar, btl btlVar, int i, long j) {
        Pair pairL = l(btmVar, btlVar, i, j, 0L);
        pairL.getClass();
        return pairL;
    }

    public final Pair l(btm btmVar, btl btlVar, int i, long j, long j2) {
        ahno.W(i, c());
        e(i, btmVar, j2);
        if (j == -9223372036854775807L) {
            j = btmVar.m;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = btmVar.o;
        d(i2, btlVar, false);
        while (i2 < btmVar.p && btlVar.f != j) {
            int i3 = i2 + 1;
            if (d(i3, btlVar, false).f > j) {
                break;
            }
            i2 = i3;
        }
        d(i2, btlVar, true);
        long jMin = j - btlVar.f;
        long j3 = btlVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = btlVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public btl m(Object obj, btl btlVar) {
        return d(a(obj), btlVar, true);
    }

    public final boolean n() {
        return c() == 0;
    }

    public int o(int i, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i == g(false)) {
                return h(false);
            }
        } else if (i == g(false)) {
            return -1;
        }
        return i - 1;
    }
}

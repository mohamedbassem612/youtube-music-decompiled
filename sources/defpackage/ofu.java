package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ofu {
    protected static final void d(ogh oghVar, ogo ogoVar, ofo ofoVar) {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ogm ogmVarA = oghVar.s.c.a();
        if (ogmVarA != null) {
            if (oghVar.o == 0) {
                int i2 = ogmVarA.a;
                oghVar.o = i2;
                ((ogl) oghVar.e).r = i2;
            }
            i = ogmVarA.b;
            oghVar.l = ogmVarA.c;
        } else {
            i = 0;
            if (oghVar.t == 2) {
                oghVar.t = 1;
            }
        }
        double d = ogoVar.b;
        boolean zB = ofoVar.b();
        long j = oghVar.b;
        if (j <= 0 || oghVar.k) {
            return;
        }
        if (oghVar.c == -1) {
            oghVar.c = jCurrentTimeMillis;
        }
        int i3 = oghVar.o;
        if (i > i3 && i3 > 0) {
            i = i3;
        }
        long j2 = jCurrentTimeMillis - j;
        int i4 = i - oghVar.p;
        oghVar.g += (oghVar.j || i4 < 0) ? 0L : Math.max(j2 - ((long) i4), 0L);
        oghVar.h += i4 < 0 ? Math.abs(i4) : 0L;
        if (oghVar.i == -1 && i > 0) {
            oghVar.i = jCurrentTimeMillis - oghVar.c;
        }
        if (oghVar.t == 2) {
            j2 = i4;
        }
        long j3 = j2;
        ofl oflVar = ogoVar.a;
        if (!oghVar.j) {
            oft oftVar = oghVar.e;
            double d2 = oflVar.a;
            double d3 = oghVar.n;
            boolean z = oghVar.l;
            boolean z2 = oghVar.a;
            double d4 = oflVar.b;
            ((ogl) oftVar).e(j3, d2, d, d3, z, z2, zB, d4);
            oghVar.o().e(j3, d2, d, oghVar.n, oghVar.l, oghVar.a, zB, d4);
        }
        oghVar.p = i4 <= 0 ? oghVar.p : i;
        oghVar.b = jCurrentTimeMillis;
        oghVar.n = d;
        oghVar.f = oflVar;
    }

    public abstract double a();

    public abstract void b(ogh oghVar, ofo ofoVar);

    public abstract void c();
}

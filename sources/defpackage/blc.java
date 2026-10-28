package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class blc implements bko {
    public static final blb a = new bkt();
    public static final blb b = new bku();
    public static final blb c = new bkv();
    public static final blb d = new bkw();
    public static final blb e = new bkx();
    public static final blb f = new bkr();
    public float g;
    float h;
    boolean i;
    final Object j;
    final bld k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    private long p;
    private final ArrayList q;
    private final ArrayList r;

    public blc(Object obj, bld bldVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.m = Float.MAX_VALUE;
        this.n = -3.4028235E38f;
        this.p = 0L;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.j = obj;
        this.k = bldVar;
        float f2 = 0.1f;
        if (bldVar != c && bldVar != d && bldVar != e) {
            if (bldVar == f) {
                f2 = 0.00390625f;
            } else {
                f2 = 0.002f;
                if (bldVar != a && bldVar != b) {
                    f2 = 1.0f;
                }
            }
        }
        this.o = f2;
    }

    private static void i(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // defpackage.bko
    public final void a(long j) {
        long j2 = this.p;
        if (j2 == 0) {
            this.p = j;
            c(this.h);
            return;
        }
        long j3 = j - j2;
        this.p = j;
        float f2 = bkq.a().e;
        boolean zD = d(f2 == 0.0f ? 2147483647L : (long) (j3 / f2));
        float fMin = Math.min(this.h, this.m);
        this.h = fMin;
        float fMax = Math.max(fMin, this.n);
        this.h = fMax;
        c(fMax);
        if (zD) {
            b(false);
        }
    }

    public final void b(boolean z) {
        int i = 0;
        this.l = false;
        bkq bkqVarA = bkq.a();
        bkqVarA.a.remove(this);
        ArrayList arrayList = bkqVarA.b;
        int iIndexOf = arrayList.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            bkqVarA.d = true;
        }
        this.p = 0L;
        this.i = false;
        while (true) {
            ArrayList arrayList2 = this.q;
            if (i >= arrayList2.size()) {
                i(arrayList2);
                return;
            } else {
                if (arrayList2.get(i) != null) {
                    ((bkz) arrayList2.get(i)).a(z, this.h);
                }
                i++;
            }
        }
    }

    final void c(float f2) {
        this.k.b(this.j, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i >= arrayList.size()) {
                i(arrayList);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    ((bla) arrayList.get(i)).l(this.h);
                }
                i++;
            }
        }
    }

    public abstract boolean d(long j);

    public final void e(bkz bkzVar) {
        ArrayList arrayList = this.q;
        if (arrayList.contains(bkzVar)) {
            return;
        }
        arrayList.add(bkzVar);
    }

    public final void f(bla blaVar) {
        if (this.l) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = this.r;
        if (arrayList.contains(blaVar)) {
            return;
        }
        arrayList.add(blaVar);
    }

    public final void g(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.o = f2;
    }

    public final void h(float f2) {
        this.h = f2;
        this.i = true;
    }

    public blc(ble bleVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.m = Float.MAX_VALUE;
        this.n = -3.4028235E38f;
        this.p = 0L;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.j = null;
        this.k = new bks(bleVar);
        this.o = 1.0f;
    }
}

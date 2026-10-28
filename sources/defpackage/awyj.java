package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awyj extends axcv {
    private final awya c;
    private final ahud d;

    public awyj(long j, awyj awyjVar, awya awyaVar, int i) {
        super(j, awyjVar, i);
        this.c = awyaVar;
        this.d = new ahud(awyc.b << 1);
    }

    @Override // defpackage.axcv
    public final int a() {
        return awyc.b;
    }

    public final Object b(int i, Object obj) {
        return this.d.s((i << 1) + 1).a(obj);
    }

    public final Object c(int i) {
        return this.d.s(i << 1).a;
    }

    public final Object d(int i) {
        return this.d.s((i << 1) + 1).a;
    }

    public final Object e(int i) {
        Object objC = c(i);
        h(i, null);
        return objC;
    }

    public final awya f() {
        awya awyaVar = this.c;
        awyaVar.getClass();
        return awyaVar;
    }

    public final void g(int i, boolean z) {
        if (z) {
            f().t((this.b * ((long) awyc.b)) + ((long) i));
        }
        r();
    }

    public final void h(int i, Object obj) {
        this.d.s(i << 1).b(obj);
    }

    public final void i(int i, Object obj) {
        this.d.s((i << 1) + 1).c(obj);
    }

    public final boolean j(int i, Object obj, Object obj2) {
        return this.d.s((i << 1) + 1).d(obj, obj2);
    }

    @Override // defpackage.axcv
    public final void k(int i) {
        int i2 = awyc.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        c(i);
        while (true) {
            Object objD = d(i);
            if ((objD instanceof awxo) || (objD instanceof awyt)) {
                if (j(i, objD, z ? awyc.j : awyc.k)) {
                    h(i, null);
                    g(i, !z);
                    if (z) {
                        f();
                        return;
                    }
                    return;
                }
            } else {
                if (objD == awyc.j || objD == awyc.k) {
                    break;
                }
                if (objD != awyc.g && objD != awyc.f) {
                    if (objD == awyc.i || objD == awyc.d || objD == awyc.l) {
                        return;
                    }
                    Objects.toString(objD);
                    throw new IllegalStateException("unexpected state: ".concat(String.valueOf(objD)));
                }
            }
        }
        h(i, null);
        if (z) {
            f();
        }
    }
}

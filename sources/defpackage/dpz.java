package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dpz extends dqa {
    private final int a;

    public dpz(dpd dpdVar, String str, int i) {
        super(dpdVar, str);
        this.a = i;
    }

    @Override // defpackage.dpb
    public final int a() {
        o();
        return 0;
    }

    @Override // defpackage.dpb
    public final long b(int i) {
        o();
        wf.g(21, "no row");
        throw new awmh();
    }

    @Override // defpackage.dpb
    public final String c(int i) {
        o();
        wf.g(21, "no row");
        throw new awmh();
    }

    @Override // defpackage.dpb, java.lang.AutoCloseable
    public final void close() {
        p();
    }

    @Override // defpackage.dpb
    public final String d(int i) {
        o();
        wf.g(21, "no row");
        throw new awmh();
    }

    @Override // defpackage.dpb
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        o();
        wf.g(25, "column index out of range");
        throw new awmh();
    }

    @Override // defpackage.dpb
    public final void f(int i, double d) {
        o();
        wf.g(25, "column index out of range");
        throw new awmh();
    }

    @Override // defpackage.dpb
    public final void g(int i, long j) {
        o();
        wf.g(25, "column index out of range");
        throw new awmh();
    }

    @Override // defpackage.dpb
    public final void h(int i) {
        o();
        wf.g(25, "column index out of range");
        throw new awmh();
    }

    @Override // defpackage.dpb
    public final void i(int i, String str) {
        str.getClass();
        o();
        wf.g(25, "column index out of range");
        throw new awmh();
    }

    @Override // defpackage.dpb
    public final void j() {
        o();
    }

    @Override // defpackage.dpb
    public final boolean k(int i) {
        o();
        wf.g(21, "no row");
        throw new awmh();
    }

    @Override // defpackage.dpb
    public final boolean l() throws IllegalAccessException, InvocationTargetException {
        int i = this.a - 1;
        if (i == 0) {
            dpd dpdVar = this.f;
            dpdVar.f();
            dpdVar.d();
        } else if (i == 1) {
            this.f.d();
        } else if (i != 2) {
            dpd dpdVar2 = this.f;
            if (i == 3) {
                dpdVar2.c();
            } else if (azv.h() == null || azv.i() == null) {
                ((dpl) dpdVar2).b();
            } else {
                Method methodH = azv.h();
                methodH.getClass();
                Method methodI = azv.i();
                methodI.getClass();
                Object objInvoke = methodI.invoke(((dpl) dpdVar2).e, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                methodH.invoke(objInvoke, 0, null, 0, null);
            }
        } else {
            this.f.b();
        }
        return false;
    }

    @Override // defpackage.dpb
    public final byte[] m(int i) {
        o();
        wf.g(21, "no row");
        throw new awmh();
    }
}

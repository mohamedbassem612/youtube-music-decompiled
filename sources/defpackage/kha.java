package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kha extends khj {
    private final AtomicReference a;
    private final Handler b;

    public kha(khb khbVar) {
        this.a = new AtomicReference(khbVar);
        this.b = new afkg(khbVar.q, (byte[]) null);
    }

    @Override // defpackage.khk
    public final void b(jzt jztVar, String str, String str2, boolean z) {
        khb khbVar = (khb) this.a.get();
        if (khbVar != null) {
            khbVar.b = jztVar;
            khbVar.m = jztVar.a;
            khbVar.n = str2;
            khbVar.e = str;
            synchronized (khb.a) {
            }
        }
    }

    @Override // defpackage.khk
    public final void c(int i) {
        if (((khb) this.a.get()) != null) {
            synchronized (khb.a) {
            }
        }
    }

    @Override // defpackage.khk
    public final void d(int i) {
        khb khbVar = (khb) this.a.get();
        if (khbVar != null) {
            khbVar.m = null;
            khbVar.n = null;
            khb.p();
            if (khbVar.o != null) {
                this.b.post(new awu(khbVar, i, 17, (char[]) null));
            }
        }
    }

    @Override // defpackage.khk
    public final void e(int i) {
        if (((khb) this.a.get()) != null) {
            khb.p();
        }
    }

    @Override // defpackage.khk
    public final void f(kgq kgqVar) {
        khb khbVar = (khb) this.a.get();
        if (khbVar != null) {
            khn.e();
            this.b.post(new jmi(khbVar, kgqVar, 8));
        }
    }

    @Override // defpackage.khk
    public final void g(int i) {
        if (((khb) this.a.get()) != null) {
            khb.p();
        }
    }

    @Override // defpackage.khk
    public final void i(khf khfVar) {
        khb khbVar = (khb) this.a.get();
        if (khbVar != null) {
            khn.e();
            this.b.post(new jmi(khbVar, khfVar, 7));
        }
    }

    @Override // defpackage.khk
    public final void j(int i) {
        khb khbVarQ = q();
        if (khbVarQ != null) {
            khn.e();
            if (i != 0) {
                khbVarQ.J(2);
            }
        }
    }

    @Override // defpackage.khk
    public final void l(String str, String str2) {
        khb khbVar = (khb) this.a.get();
        if (khbVar != null) {
            khn.e();
            this.b.post(new gwb(khbVar, str, str2, 12));
        }
    }

    @Override // defpackage.khk
    public final void m(long j) {
        khb khbVar = (khb) this.a.get();
        if (khbVar != null) {
            khbVar.n(j, 0);
        }
    }

    @Override // defpackage.khk
    public final void n(long j, int i) {
        khb khbVar = (khb) this.a.get();
        if (khbVar != null) {
            khbVar.n(j, i);
        }
    }

    @Override // defpackage.khk
    public final void o() {
        Object obj = khb.a;
        khn.e();
    }

    @Override // defpackage.khk
    public final void p(byte[] bArr) {
        if (((khb) this.a.get()) != null) {
            Object obj = khb.a;
            int length = bArr.length;
            khn.e();
        }
    }

    public final khb q() {
        khb khbVar = (khb) this.a.getAndSet(null);
        if (khbVar == null) {
            return null;
        }
        khbVar.k();
        return khbVar;
    }

    @Override // defpackage.khk
    public final void h(int i) {
    }

    @Override // defpackage.khk
    public final void k(int i) {
    }
}

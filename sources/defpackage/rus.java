package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rus implements ynz {
    public final awmd a;
    public final AtomicReference b = new AtomicReference(Boolean.FALSE);

    public rus(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.ynz
    public final void a() {
        this.b.set(Boolean.FALSE);
    }

    @Override // defpackage.ynz
    public final void b() {
        this.b.set(Boolean.FALSE);
    }

    @Override // defpackage.ynz
    public final void d() {
        this.b.set(Boolean.TRUE);
    }

    @Override // defpackage.ynz
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ynz
    public final void g() {
        this.b.set(Boolean.FALSE);
    }

    @Override // defpackage.ynz
    public final void f() {
    }

    @Override // defpackage.ynv
    public final void c(wgs wgsVar, long j) {
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ake extends ajv {
    public ajv c;
    public awqg d;
    public awqg e;
    public final long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ake(ajv ajvVar) {
        awqg awqgVarD;
        super(0L, ajz.a, null);
        Object obj = aka.a;
        this.c = ajvVar;
        this.d = null;
        this.e = (ajvVar == null || (awqgVarD = ajvVar.d()) == null) ? ((ajv) aka.e).a : awqgVarD;
        this.f = ahs.j();
    }

    private final ajv p() {
        ajv ajvVar = this.c;
        return ajvVar == null ? aka.e : ajvVar;
    }

    @Override // defpackage.ajv, defpackage.ajw
    public final void a() {
        this.b = true;
        this.c = null;
        this.d = null;
        this.e = null;
        if (this.f == ahs.j()) {
            ahto ahtoVar = aka.g;
            long j = ahs.j();
            if (j == ajq.a) {
                if (ahtoVar.c == null) {
                    ahtoVar.c = this;
                    return;
                }
                return;
            }
            synchronized (ahtoVar.a) {
                Object obj = ahtoVar.b;
                xgl xglVar = (xgl) ((AtomicReference) obj).get();
                if (xglVar.e(j) == null && !xglVar.f(j, this)) {
                    ((AtomicReference) obj).set(xglVar.i(j, this));
                }
            }
        }
    }

    @Override // defpackage.ajv
    public final /* bridge */ /* synthetic */ void b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ajv, defpackage.ajw
    public final int c() {
        return p().c();
    }

    @Override // defpackage.ajv, defpackage.ajw
    public final awqg d() {
        return this.e;
    }

    @Override // defpackage.ajv, defpackage.ajw
    public final void f(akb akbVar) {
        p().f(akbVar);
    }

    @Override // defpackage.ajv, defpackage.ajw
    public final void h(int i) {
        p().h(i);
    }

    @Override // defpackage.ajv
    public final agx i() {
        return p().i();
    }

    @Override // defpackage.ajv
    public final void j(agx agxVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ajv, defpackage.ajw
    public final void k() {
        p().k();
    }

    @Override // defpackage.ajw
    public final long m() {
        return p().m();
    }

    @Override // defpackage.ajw
    public final ajz n() {
        return p().n();
    }

    @Override // defpackage.ajv, defpackage.ajw
    public final /* synthetic */ void l() {
    }
}

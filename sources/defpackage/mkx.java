package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mkx implements avmn {
    public final nuc a;
    public final ntr b;
    public final nth c;
    public final boolean d;
    public avmm e;
    public avmm f;
    public volatile avlr g;
    public volatile nsl h;
    public awkq i;
    private awly j = new awli();

    public mkx(nuc nucVar, ntr ntrVar, nsl nslVar, nth nthVar, avmm avmmVar, boolean z) {
        this.a = nucVar;
        this.b = ntrVar;
        this.h = nslVar;
        this.c = nthVar;
        this.f = avmmVar;
        this.d = z;
    }

    final synchronized fgy a() {
        awkq awkqVar;
        fgy fgyVar;
        try {
            if (f() || (awkqVar = this.i) == null) {
                return null;
            }
            synchronized (awkqVar.c) {
                try {
                    fgyVar = awkqVar.d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fgyVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void b() {
        awkq awkqVar;
        if (!f() && (awkqVar = this.i) != null) {
            synchronized (awkqVar.c) {
                awkqVar.e = true;
            }
        }
    }

    public final synchronized void c(avmb avmbVar) {
        avmm avmmVar;
        awkq awkqVar = this.i;
        if (awkqVar != null) {
            avmbVar.e(new mga(awkqVar, 5));
        }
        if (this.d && (avmmVar = this.e) != null) {
            avmbVar.e(new mga(avmmVar, 6));
        }
        this.g = null;
        this.i = null;
        this.j.kn();
        this.h = null;
    }

    public final synchronized void d(avmm avmmVar, avmb avmbVar) {
        avmm avmmVar2 = this.f;
        if (avmmVar2 == avmmVar) {
            return;
        }
        if (this.d) {
            avmm avmmVar3 = this.e;
            if (avmmVar3 != null) {
                avmbVar.e(new lfa(avmmVar3, avmmVar2, 17, (byte[]) null));
            }
            avmm avmmVar4 = new avmm();
            this.e = avmmVar4;
            this.f = avmmVar;
            avmmVar.c(avmmVar4);
        } else {
            this.f = avmmVar;
        }
    }

    @Override // defpackage.avmn
    public final synchronized void dispose() {
        avmm avmmVar;
        awkq awkqVar = this.i;
        if (awkqVar != null) {
            awkqVar.dispose();
        }
        this.g = null;
        this.i = null;
        this.j.kn();
        this.h = null;
        if (this.d && (avmmVar = this.e) != null) {
            avmmVar.dispose();
            this.e = null;
        }
    }

    public final synchronized void e(fhd fhdVar) {
        if (!f() && this.h != null) {
            this.j.kk(fhdVar);
        }
    }

    @Override // defpackage.avmn
    public final synchronized boolean f() {
        awkq awkqVar = this.i;
        return awkqVar == null || awkqVar.f();
    }

    final synchronized void g(avlr avlrVar, avlr avlrVar2, nsl nslVar, fhd fhdVar, mjb mjbVar) {
        if (((awli) this.j).c.get() == awkl.COMPLETE) {
            this.j = new awli();
        }
        this.j.kk(fhdVar);
        this.h = nslVar;
        this.g = avlrVar;
        awkq awkqVar = new awkq(mjbVar);
        this.i = awkqVar;
        if (this.d && this.e == null) {
            avmm avmmVar = new avmm();
            this.e = avmmVar;
            this.f.c(avmmVar);
        }
        avlrVar2.ad(this.j.s(new mkv(0)), new mkw(this, 0)).ak(awkqVar);
    }
}

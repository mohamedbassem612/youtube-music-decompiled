package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rdo {
    public final qyt b;
    public final rdn c;
    public boolean g;
    public final Object a = new Object();
    public boolean d = false;
    public rdm e = new rdm(1, false);
    public boolean f = true;

    public rdo(qyt qytVar, rdn rdnVar) {
        this.b = qytVar;
        this.c = rdnVar;
    }

    public final rdm a() {
        rdm rdmVar;
        synchronized (this.a) {
            rdmVar = this.e;
        }
        return rdmVar;
    }

    public final void b() {
        if (this.g) {
            f(this.e.b != 4 ? 2 : 4);
        } else {
            f(3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x0011, B:10:0x0013, B:13:0x0023, B:15:0x002a, B:16:0x0035, B:19:0x0058, B:20:0x0069, B:18:0x0040), top: B:26:0x0003 }] */
    public final void c(rdm rdmVar) {
        synchronized (this.a) {
            rdm rdmVar2 = this.e;
            if (rdmVar2.b == rdmVar.b && rdmVar2.a == rdmVar.a) {
                return;
            }
            this.e = rdmVar;
            rdn rdnVar = this.c;
            boolean zA = rdmVar2.a();
            boolean zA2 = rdmVar.a();
            if (zA) {
                if (zA2) {
                    rcz rczVar = ((rdr) rdnVar).t;
                    rczVar.n.l(new rcu(rczVar, 3));
                    ((rdr) rdnVar).g.d();
                } else {
                    rcz rczVar2 = ((rdr) rdnVar).t;
                    if (rczVar2 != null) {
                        rczVar2.n.l(new rcu(rczVar2, 0));
                    }
                    ((rdr) rdnVar).g.e();
                }
            } else if (zA2) {
                rcz rczVar3 = ((rdr) rdnVar).t;
                rczVar3.n.l(new rcu(rczVar3, 3));
                ((rdr) rdnVar).g.d();
            }
            ((rdr) rdnVar).H();
            ((rdr) rdnVar).A(new rcp(rdnVar, 7));
        }
    }

    public final void d(boolean z) {
        synchronized (this.a) {
            c(new rdm(this.e.b, z));
        }
    }

    public final void e() {
        synchronized (this.a) {
            if (this.e.b == 4) {
                return;
            }
            this.g = false;
            b();
        }
    }

    public final void f(int i) {
        synchronized (this.a) {
            c(new rdm(i, this.e.a));
        }
    }

    public final String toString() {
        String string;
        synchronized (this.a) {
            ageu ageuVarAc = ahno.ac(this);
            ageuVarAc.b("currentState", this.e);
            ageuVarAc.g("isVideoReady", this.g);
            ageuVarAc.g("isAudioReady", this.f);
            ageuVarAc.g("shouldBufferExtraFrames", this.d);
            string = ageuVarAc.toString();
        }
        return string;
    }
}

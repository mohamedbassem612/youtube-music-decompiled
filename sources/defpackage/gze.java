package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gze {
    public final sru a;
    public final abvc b;
    public final wbz c;
    public final zwb d;
    public final avmb e;
    public avmn f;
    public boolean g = false;
    public final ibu h = new igj(this, 1);
    public final hfn i;

    public gze(sru sruVar, abvc abvcVar, wbz wbzVar, hfn hfnVar, zwb zwbVar, avmb avmbVar) {
        this.a = sruVar;
        this.b = abvcVar;
        this.c = wbzVar;
        this.i = hfnVar;
        this.d = zwbVar;
        this.e = avmbVar;
    }

    public final void a(boolean z) {
        this.i.p(this.h);
        avmn avmnVar = this.f;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.f);
        }
        if (this.g && z) {
            this.b.i(abtu.c);
        }
        this.g = false;
    }
}

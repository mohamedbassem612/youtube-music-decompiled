package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tjc implements tjm {
    public final tns a;
    final /* synthetic */ tjd b;
    private final tlj c;
    private final tmt d;
    private final ReentrantLock e = new ReentrantLock();
    private tjm f;
    private boolean g;
    private final tit h;

    public tjc(tjd tjdVar, tns tnsVar, tlj tljVar, tit titVar, tmt tmtVar) {
        this.b = tjdVar;
        this.a = tnsVar;
        this.c = tljVar;
        this.h = titVar;
        this.d = tmtVar;
    }

    @Override // defpackage.tjm
    public final void a() {
        synchronized (this.e) {
            if (!this.g) {
                this.g = true;
                tjm tjmVar = this.f;
                if (tjmVar != null) {
                    tjmVar.a();
                }
            }
        }
    }

    public final void b(tjl tjlVar, tjk tjkVar) {
        synchronized (this.e) {
            if (this.g) {
                return;
            }
            tjm tjmVarC = tjlVar.c(this.a, this.c, this.h, this.d);
            this.f = tjmVarC;
            if (tjmVarC != null) {
                tjmVarC.d(tjkVar);
            }
        }
    }

    @Override // defpackage.tjm
    public final void d(tjk tjkVar) {
        tjkVar.getClass();
        tjd tjdVar = this.b;
        aunn aunnVar = tjdVar.a;
        if (aunnVar == null || !((tjl) aunnVar.io()).b(this.a)) {
            b(tjdVar.b, tjkVar);
            return;
        }
        tjb tjbVar = new tjb(tjkVar, this, tjdVar);
        Object objIo = aunnVar.io();
        objIo.getClass();
        b((tjl) objIo, tjbVar);
    }
}

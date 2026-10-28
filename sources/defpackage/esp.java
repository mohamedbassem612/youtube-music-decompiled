package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class esp implements fcr {
    final /* synthetic */ esq a;
    private final fdh b;

    public esp(esq esqVar, fdh fdhVar) {
        this.a = esqVar;
        this.b = fdhVar;
    }

    @Override // defpackage.fcr
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                fdh fdhVar = this.b;
                for (fdx fdxVar : ffs.e(fdhVar.a)) {
                    if (!fdxVar.l() && !fdxVar.k()) {
                        fdxVar.c();
                        if (fdhVar.c) {
                            fdhVar.b.add(fdxVar);
                        } else {
                            fdxVar.b();
                        }
                    }
                }
            }
        }
    }
}

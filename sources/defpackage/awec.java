package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awec extends avlr {
    final awko a;
    awea b;

    public awec(awko awkoVar) {
        this.a = awkoVar;
    }

    final void a(awea aweaVar) {
        avlu avluVar = this.a;
        if (avluVar instanceof avmn) {
            ((avmn) avluVar).dispose();
        } else if (avluVar instanceof avnu) {
            ((avnu) avluVar).kr((avmn) aweaVar.get());
        }
    }

    final void b(awea aweaVar) {
        synchronized (this) {
            boolean z = this.a instanceof awdw;
            awea aweaVar2 = this.b;
            if (z) {
                if (aweaVar2 != null && aweaVar2 == aweaVar) {
                    this.b = null;
                    avmn avmnVar = aweaVar.b;
                }
                long j = aweaVar.c - 1;
                aweaVar.c = j;
                if (j == 0) {
                    a(aweaVar);
                }
            } else if (aweaVar2 != null && aweaVar2 == aweaVar) {
                avmn avmnVar2 = aweaVar.b;
                long j2 = aweaVar.c - 1;
                aweaVar.c = j2;
                if (j2 == 0) {
                    this.b = null;
                    a(aweaVar);
                }
            }
        }
    }

    final void c(awea aweaVar) {
        synchronized (this) {
            if (aweaVar.c == 0 && aweaVar == this.b) {
                this.b = null;
                avmn avmnVar = (avmn) aweaVar.get();
                avnr.b(aweaVar);
                avlu avluVar = this.a;
                if (avluVar instanceof avmn) {
                    ((avmn) avluVar).dispose();
                } else if (avluVar instanceof avnu) {
                    if (avmnVar == null) {
                        aweaVar.e = true;
                    } else {
                        ((avnu) avluVar).kr(avmnVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        awea aweaVar;
        boolean z;
        synchronized (this) {
            aweaVar = this.b;
            if (aweaVar == null) {
                aweaVar = new awea(this);
                this.b = aweaVar;
            }
            long j = aweaVar.c;
            if (j == 0) {
                j = 0;
            }
            long j2 = j + 1;
            aweaVar.c = j2;
            z = false;
            if (!aweaVar.d && j2 == 1) {
                z = true;
                aweaVar.d = true;
            }
        }
        awko awkoVar = this.a;
        awkoVar.ak(new aweb(avlwVar, this, aweaVar));
        if (z) {
            awkoVar.a(aweaVar);
        }
    }
}

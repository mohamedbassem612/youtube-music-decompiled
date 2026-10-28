package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afmk extends awuq implements awvb {
    private final /* synthetic */ awvb a;
    private final awuq b;

    public afmk(ahey aheyVar) {
        aheyVar.getClass();
        this.a = new awvw(aheyVar);
        this.b = awvi.b;
    }

    @Override // defpackage.awuq
    public final void a(awou awouVar, Runnable runnable) {
        awouVar.getClass();
        runnable.getClass();
        long j = afwl.a;
        if (afwl.p()) {
            runnable = afwl.h(runnable);
        }
        this.b.a(awouVar, runnable);
    }

    @Override // defpackage.awvb
    public final awvk c(long j, Runnable runnable, awou awouVar) {
        awouVar.getClass();
        return this.a.c(j, runnable, awouVar);
    }

    @Override // defpackage.awvb
    public final void d(long j, awuc awucVar) {
        this.a.d(j, awucVar);
    }

    @Override // defpackage.awuq
    public final awuq e(int i) {
        return this.b.e(1);
    }

    @Override // defpackage.awuq
    public final boolean fX(awou awouVar) {
        awouVar.getClass();
        return false;
    }

    @Override // defpackage.awuq
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}

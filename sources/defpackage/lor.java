package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lor implements lpb {
    public final Object a = new Object();
    public los b;

    public lor(los losVar) {
        this.b = losVar;
    }

    @Override // defpackage.lpb
    public final void a() {
        synchronized (this.a) {
            this.b = null;
        }
    }

    @Override // defpackage.lpb
    public final void b(lpa lpaVar) {
        if (((lpf) lpaVar).c) {
            synchronized (this.a) {
                if (this.b != null) {
                    new lei(this, 15, null).run();
                }
            }
        }
    }
}

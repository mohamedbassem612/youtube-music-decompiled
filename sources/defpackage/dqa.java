package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dqa implements dpb {
    public final dpd f;
    public final String g;
    public boolean h;

    public dqa(dpd dpdVar, String str) {
        this.f = dpdVar;
        this.g = str;
    }

    @Override // defpackage.dpb
    public /* synthetic */ boolean n() {
        return b(0) != 0;
    }

    protected final void o() {
        if (this.h) {
            wf.g(21, "statement is closed");
            throw new awmh();
        }
    }

    protected final void p() {
        this.h = true;
    }
}

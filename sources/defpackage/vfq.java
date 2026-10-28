package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vfq {
    public final vfp b;
    private volatile apvr c = apvr.SHORTS_CREATION_DRAFT_SAVE_ACTION_AUTOMATIC;
    public final awku a = new awku();

    static {
        Duration.ofDays(30L);
    }

    public vfq(vfp vfpVar) {
        new awku();
        this.b = vfpVar;
    }

    public final vfr a() {
        awku awkuVar = this.a;
        if (awkuVar.aD() instanceof vfr) {
            return (vfr) awkuVar.aD();
        }
        return null;
    }

    public final vft b() {
        return (vft) this.a.aD();
    }

    public final void c(vft vftVar) {
        vftVar.getClass();
        this.a.kk(vftVar);
    }
}

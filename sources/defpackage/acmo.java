package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acmo {
    public final acqz a;
    public final avmm b;
    public acuo c;
    public final xsc d;

    public acmo(xsc xscVar, acqz acqzVar) {
        xscVar.getClass();
        acqzVar.getClass();
        this.d = xscVar;
        this.a = acqzVar;
        this.b = new avmm();
    }

    public static /* synthetic */ acrp b(Optional optional) {
        if (optional.isEmpty()) {
            return null;
        }
        return ((acra) optional.get()).i;
    }

    public final void a() {
        acuo acuoVar = this.c;
        if (acuoVar != null) {
            acuoVar.f();
        }
    }
}

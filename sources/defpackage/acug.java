package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acug implements acdm {
    private final abvk a;
    private final actx b;

    public acug(abvk abvkVar, actx actxVar) {
        abvkVar.getClass();
        actxVar.getClass();
        this.a = abvkVar;
        this.b = actxVar;
    }

    @Override // defpackage.acdm
    public final void A() {
        actx actxVar = this.b;
        if (!actxVar.h.U() || actxVar.d == 0) {
            this.a.A();
        } else {
            actxVar.b();
        }
    }

    @Override // defpackage.acdm
    public final void C() {
        this.a.C();
    }

    @Override // defpackage.acdm
    public final void P() {
        this.a.at(false);
    }

    @Override // defpackage.acdm
    public final boolean Z() {
        return this.a.Z();
    }

    @Override // defpackage.acdm
    public final boolean ae(long j, appa appaVar) {
        return this.a.ae(j, appaVar);
    }

    @Override // defpackage.acdm
    public final boolean af(long j) {
        return this.a.af(0L);
    }

    @Override // defpackage.acdm
    public final boolean ag(long j, appa appaVar) {
        return this.a.ag(j, appaVar);
    }

    @Override // defpackage.acdm
    public final acfw h() {
        return this.a.h();
    }

    @Override // defpackage.acdm
    public final void z() {
        actx actxVar = this.b;
        if (actxVar.h.U() && actxVar.e) {
            if (actxVar.d != 0 || actxVar.g()) {
                actxVar.a.ap(false, 19);
                return;
            }
            int iA = actxVar.a();
            actxVar.d = iA;
            if (iA != 0) {
                return;
            }
        }
        this.a.ap(false, 19);
    }
}

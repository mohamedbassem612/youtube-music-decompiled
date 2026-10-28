package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abgz implements abha {
    public acan a;
    public acca b;
    public acil c;
    private final acag d;
    private final twi e;
    private final abhe f;

    public abgz(acag acagVar, abhe abheVar, twi twiVar) {
        this.d = acagVar;
        this.f = abheVar;
        this.e = twiVar;
    }

    @Override // defpackage.abha
    public final void c() {
        acan acanVar = this.a;
        if (acanVar != null) {
            acanVar.a();
        }
    }

    @Override // defpackage.abha
    public final void g() {
        acil acilVar = this.c;
        if (acilVar != null) {
            acilVar.d = null;
            acilVar.c = null;
            acilVar.a.a(null);
        }
        acan acanVar = this.a;
        if (acanVar != null) {
            acanVar.a();
            this.a = null;
        }
        this.b = null;
    }

    @Override // defpackage.abha
    public final void h(acca accaVar) {
        acga acgaVar;
        wgs wgsVarD;
        if (this.c != null) {
            if (!Objects.equals(this.b, accaVar) || (this.a == null && accaVar != null)) {
                g();
                abhe abheVar = this.f;
                abheVar.e();
                this.b = accaVar;
                if (accaVar == null || (acgaVar = (acga) abheVar.d().get(accaVar.d)) == null) {
                    return;
                }
                acan acanVar = this.a;
                if (acanVar != null) {
                    acanVar.a();
                }
                acag acagVar = this.d;
                twi twiVar = this.e;
                wjf wjfVar = acagVar.p;
                acan acanVar2 = null;
                if (wjfVar != null && (wgsVarD = aawo.d(wjfVar, accaVar)) != null) {
                    acad acadVar = new acad(acagVar, accaVar);
                    abmt abmtVar = acagVar.i;
                    acbd acbdVarF = aawo.f(wgsVarD, twiVar, abmtVar.bF() ? acagVar.u : null, true, abmtVar.bz(), abmtVar);
                    if (acbdVarF != null) {
                        acanVar2 = new acan(acgaVar, acbdVarF, acadVar);
                    }
                }
                this.a = acanVar2;
                if (acanVar2 != null) {
                    this.c.a(accaVar, acanVar2);
                }
            }
        }
    }

    @Override // defpackage.abha
    public final /* synthetic */ void e(aazk aazkVar) {
    }

    @Override // defpackage.abha
    public final /* synthetic */ void f(long j, float f) {
    }
}

package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cid extends cpc {
    private final cic c;
    private final crw d;

    public cid(cic cicVar, long j, long j2, crw crwVar) {
        super(j, j2);
        this.c = cicVar;
        this.d = crwVar;
    }

    @Override // defpackage.cpc, defpackage.cpq
    public final int a() {
        int iIndexOf;
        crw crwVar = this.d;
        if (crwVar == null) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        agke agkeVar = null;
        if (crwVar.c) {
            agke agkeVar2 = crwVar.b;
            if (agkeVar2 != null) {
                agkeVar = agkeVar2;
            } else {
                agke agkeVar3 = crwVar.i;
                if (agkeVar3 != null && !agkeVar3.isEmpty()) {
                    agkeVar = crwVar.i;
                }
            }
        }
        return (agkeVar == null || (iIndexOf = agkeVar.indexOf(this.c.b.b)) == -1) ? Alert.DURATION_SHOW_INDEFINITELY : iIndexOf;
    }

    @Override // defpackage.cpq
    public final long b() {
        d();
        return this.c.e(this.a);
    }

    @Override // defpackage.cpq
    public final long c() {
        d();
        return this.c.g(this.a);
    }
}

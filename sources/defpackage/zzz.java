package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zzz extends tmn {
    private final pnp l;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzz(pnp pnpVar) {
        byte[] bArr = pnpVar.d;
        super(bArr != null ? 2 : 1, pnpVar.a.toExternalForm(), null);
        this.l = pnpVar;
    }

    private static pnq P(tnm tnmVar) {
        agkh agkhVar = new agkh(4);
        List<tnd> list = tnmVar.f;
        if (list != null) {
            for (tnd tndVar : list) {
                agkhVar.e(pno.a(tndVar.a), agke.q(tndVar.b));
            }
        }
        aak aakVarD = pnq.d();
        aakVarD.h().putAll(agkhVar.d(true));
        aakVarD.b = tnmVar.e();
        aakVarD.c = Integer.valueOf(tnmVar.d);
        aakVarD.a = true;
        return aakVarD.g();
    }

    @Override // defpackage.tns
    public final tnx aa(tnm tnmVar) {
        return tnx.e(P(tnmVar));
    }

    @Override // defpackage.tns
    public final Class ab() {
        return pnq.class;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final String ac() {
        return this.l.b;
    }

    @Override // defpackage.tns
    public final /* bridge */ /* synthetic */ void ad(Object obj) {
    }

    @Override // defpackage.tmn, defpackage.tns
    public final byte[] ae() {
        return this.l.d;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final Map e() {
        agkh agkhVar = new agkh(4);
        for (Map.Entry entry : this.l.c.entrySet()) {
            pno pnoVar = (pno) entry.getKey();
            List list = (List) entry.getValue();
            if (list != null) {
                agkhVar.e(pnoVar.f, new ager(",").b(list));
            }
        }
        return agkhVar.d(true);
    }

    @Override // defpackage.tmn, defpackage.tns
    public final toe i(toe toeVar) {
        tnm tnmVar = toeVar.b;
        if (tnmVar != null) {
            return new zzy(P(tnmVar));
        }
        aak aakVarD = pnq.d();
        aakVarD.e = toeVar;
        return new zzy(aakVarD.g());
    }
}

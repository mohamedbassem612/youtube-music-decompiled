package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class chx implements chp {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public chx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.chp
    public final agke a() {
        agke agkeVarQ;
        agke agkeVar;
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            synchronized (((chz) obj).c) {
                crw crwVar = ((chz) obj).v;
                if (crwVar == null || !crwVar.c) {
                    agkeVarQ = agpi.a;
                } else {
                    cis cisVar = ((chz) obj).g;
                    agkeVarQ = (cisVar == null || (agkeVar = ((chz) obj).h) == null || !agkeVar.contains(cisVar.b)) ? agpi.a : agke.q(((chz) obj).g.b);
                }
            }
            return agkeVarQ;
        }
        chs chsVar = (chs) obj;
        crw crwVar2 = chsVar.j;
        if (crwVar2 == null || !crwVar2.c) {
            return agpi.a;
        }
        HashSet hashSet = new HashSet();
        for (cpk cpkVar : chsVar.e) {
            cim cimVar = ((cie) cpkVar.e).f;
            if (cimVar != null) {
                hashSet.add(cimVar.b);
            }
        }
        return agke.n(hashSet);
    }
}

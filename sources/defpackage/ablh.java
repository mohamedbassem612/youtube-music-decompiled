package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ablh implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ablh(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((aazq) obj).b.ar();
            case 1:
                aayw aaywVar = (aayw) obj;
                if (aaywVar.b != abnw.e) {
                    return Optional.empty();
                }
                wgi wgiVar = aaywVar.d;
                ajiw ajiwVar = null;
                aorw aorwVar = wgiVar == null ? null : wgiVar.g;
                if (aorwVar != null && (aorwVar.b & 524288) != 0) {
                    apji apjiVar = aorwVar.e;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVar = ajix.a;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                    apjiVar.c(aihlVarCheckIsLite);
                    if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                        apji apjiVar2 = aorwVar.e;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                        apjiVar2.c(aihlVarCheckIsLite2);
                        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                        ajiwVar = (ajiw) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    }
                }
                Optional optionalOfNullable = Optional.ofNullable(ajiwVar);
                return optionalOfNullable.isPresent() ? Optional.of(Boolean.valueOf(((ajiw) optionalOfNullable.get()).b)) : Optional.empty();
            case 2:
                return ((aazq) obj).b.e();
            case 3:
                return Optional.empty();
            case 4:
                return Optional.of((wjf) obj);
            case 5:
                return Optional.empty();
            case 6:
                return Boolean.TRUE;
            case 7:
                return Boolean.TRUE;
            case 8:
                return Boolean.TRUE;
            case 9:
                return new aazq((acip) obj);
            case 10:
                return aawb.u(((aazq) obj).b).H(new ablh(9));
            case 11:
                return ((aayt) obj).a;
            case 12:
                return (weh) ((agev) obj).c();
            case 13:
                return (acvh) ((acvm) obj);
            case 14:
                Optional optional = (Optional) obj;
                String str = acoi.g;
                if (optional.isPresent()) {
                    acrp acrpVar = (acrp) optional.get();
                    if (acrpVar.I().isPresent()) {
                        acrpVar.I().get();
                        ((acrp) optional.get()).I().get();
                    }
                }
                return avlr.J(Boolean.TRUE);
            case 15:
                String str2 = acoi.g;
                return ((aazq) obj).b.N();
            case 16:
                return (weh) ((agev) obj).c();
            case 17:
                aazq aazqVar = (aazq) obj;
                acip acipVar = aazqVar.b;
                String str3 = acoi.g;
                return acipVar.M().H(new abqe(aazqVar, 19));
            case 18:
                aazq aazqVar2 = (aazq) obj;
                return aazqVar2.b.M().H(new acpr(aazqVar2, 1));
            case 19:
                return ((aazq) obj).b.M();
            default:
                aksj aksjVar = ((alik) obj).B;
                return aksjVar == null ? aksj.a : aksjVar;
        }
    }
}

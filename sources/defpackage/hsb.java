package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hsb implements agex {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hsb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.agex
    public final boolean a(Object obj) {
        tnm tnmVar;
        switch (this.$cid) {
            case 0:
                aofh aofhVar = (aofh) obj;
                int iBc = a.bc(aofhVar.c);
                if (iBc != 0 && iBc == 4) {
                    aofg aofgVar = aofhVar.e;
                    if (aofgVar == null) {
                        aofgVar = aofg.b;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(anue.b);
                    aofgVar.c(aihlVarCheckIsLite);
                    Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
                    anue anueVar = (anue) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                    anue anueVar2 = ((hsc) this.a).a;
                    int i = anueVar2.c;
                    if ((i & 64) != 0) {
                        int i2 = anueVar.c;
                        if ((i2 & 64) != 0 && anueVar2.l == anueVar.l && (i & SemanticState.Focused) != 0 && (i2 & SemanticState.Focused) != 0 && anueVar2.m == anueVar.m) {
                            if (((i & SemanticState.Hidden) != 0) == ((i2 & SemanticState.Hidden) != 0)) {
                                aofu aofuVar = anueVar2.n;
                                if (aofuVar == null) {
                                    aofuVar = aofu.a;
                                }
                                String str = aofuVar.c;
                                aofu aofuVar2 = anueVar.n;
                                if (aofuVar2 == null) {
                                    aofuVar2 = aofu.a;
                                }
                                if (str.equals(aofuVar2.c)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                return ((String) this.a).equals((String) obj);
            case 2:
                aofh aofhVar2 = (aofh) obj;
                aofg aofgVar2 = ((aofh) this.a).e;
                if (aofgVar2 == null) {
                    aofgVar2 = aofg.b;
                }
                aihl aihlVar = anyr.b;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                aofgVar2.c(aihlVarCheckIsLite2);
                Object objK2 = aofgVar2.j.k(aihlVarCheckIsLite2.d);
                String str2 = ((anyr) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).i;
                aofg aofgVar3 = aofhVar2.e;
                if (aofgVar3 == null) {
                    aofgVar3 = aofg.b;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                aofgVar3.c(aihlVarCheckIsLite3);
                Object objK3 = aofgVar3.j.k(aihlVarCheckIsLite3.d);
                return str2.equals(((anyr) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3))).i);
            case 3:
                return ((isi) this.a).c.contains(kro.O((aqof) obj));
            case 4:
                return ((jij) this.a).b.contains(kro.O((aqof) obj));
            case 5:
                oit oitVar = (oit) obj;
                int i3 = oni.e;
                oit oitVar2 = (oit) this.a;
                oiw oiwVar = oitVar2.c;
                if (oiwVar == null) {
                    oiwVar = oiw.a;
                }
                oiw oiwVar2 = oitVar.c;
                if (oiwVar2 == null) {
                    oiwVar2 = oiw.a;
                }
                if (oiwVar.equals(oiwVar2) && oitVar2.f == oitVar.f && oitVar2.d == oitVar.d) {
                    return true;
                }
                break;
            case 6:
                alaw alawVar = (alaw) obj;
                agrf agrfVar = wja.a;
                if (!alawVar.g.startsWith("audio")) {
                    return true;
                }
                if ((alawVar.c & 524288) != 0) {
                    ajhl ajhlVar = alawVar.y;
                    if (ajhlVar == null) {
                        ajhlVar = ajhl.a;
                    }
                    if (ajhlVar.d.equals(this.a)) {
                        return true;
                    }
                }
                break;
            case 7:
                toe toeVar = (toe) obj;
                int i4 = wom.l;
                if (taq.B(toeVar)) {
                    return true;
                }
                tnm tnmVar2 = toeVar.b;
                if (tnmVar2 != null) {
                    return ((ajmw) this.a).h.contains(Integer.valueOf(tnmVar2.d));
                }
                break;
            case 8:
                return this.a.contains(Integer.valueOf(((alaw) obj).e));
            case 9:
                if (((zed) obj).b() != ((zed) this.a).b()) {
                    return true;
                }
                break;
            case 10:
                if (((zed) obj).a() < ((zed) this.a).a()) {
                    return true;
                }
                break;
            case 11:
                aofh aofhVar3 = (aofh) obj;
                if (aofhVar3 != null) {
                    aofg aofgVar4 = aofhVar3.e;
                    if (aofgVar4 == null) {
                        aofgVar4 = aofg.b;
                    }
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aoom.b);
                    aofgVar4.c(aihlVarCheckIsLite4);
                    Object objK4 = aofgVar4.j.k(aihlVarCheckIsLite4.d);
                    aoom aoomVar = (aoom) (objK4 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK4));
                    int iBc2 = a.bc(aofhVar3.c);
                    if (iBc2 != 0 && iBc2 == 4) {
                        aakd aakdVar = (aakd) this.a;
                        if (aoomVar.n == aakdVar.a && ((aoomVar.c & 16384) == 0 || aoomVar.o == aakdVar.b)) {
                            return true;
                        }
                    }
                }
                break;
            case 12:
                return ((acoi) this.a).aS.contains(kro.O((aqof) obj));
            case 13:
                toe toeVar2 = (toe) obj;
                if (taq.A(toeVar2)) {
                    return true;
                }
                if (((acuw) this.a).j.l(148, 45852159L, false) && (tnmVar = toeVar2.b) != null && tnmVar.d == 503) {
                    return true;
                }
                break;
            case 14:
                if (obj instanceof advv) {
                    aowc aowcVar = ((advv) obj).a;
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aowa.b);
                    aowcVar.c(aihlVarCheckIsLite5);
                    Object objK5 = aowcVar.j.k(aihlVarCheckIsLite5.d);
                    Object objC = objK5 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK5);
                    wsv wsvVar = (wsv) this.a;
                    if (((String) objC).equals(wsvVar.a) && aowcVar.b.equals(wsvVar.b)) {
                        return true;
                    }
                }
                break;
            default:
                if (obj instanceof aowc) {
                    aowc aowcVar2 = (aowc) obj;
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aowa.b);
                    aowcVar2.c(aihlVarCheckIsLite6);
                    Object objK6 = aowcVar2.j.k(aihlVarCheckIsLite6.d);
                    Object objC2 = objK6 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK6);
                    wsv wsvVar2 = (wsv) this.a;
                    if (((String) objC2).equals(wsvVar2.a) && aowcVar2.b.equals(wsvVar2.b)) {
                        return true;
                    }
                }
                break;
        }
        return false;
    }
}

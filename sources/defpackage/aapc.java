package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aapc implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aapc(abvk abvkVar, abnl abnlVar, abng abngVar, int i) {
        this.$cid = i;
        this.b = abvkVar;
        this.a = abnlVar;
        this.c = abngVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r0v26, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, zya] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r13v22, types: [acib, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, sxu] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = 3;
        acca accaVar = null;
        acraVarK = null;
        acraVarK = null;
        acra acraVarK = null;
        accaVar = null;
        switch (this.$cid) {
            case 0:
                ((aapd) this.a).c((abnl) this.b, this.c);
                break;
            case 1:
                Object obj2 = this.b;
                ?? r2 = this.c;
                try {
                    acca accaVar2 = ((acap) obj2).a;
                    String str = accaVar2.j;
                    Object obj3 = this.a;
                    if (str != null) {
                        accaVar = accaVar2;
                    } else {
                        aaqn aaqnVarB = ((aaoh) obj3).b.b();
                        sxv sxvVarC = sxv.c();
                        String str2 = accaVar2.d;
                        aaqnVarB.v(str2, sxvVarC);
                        List<acca> list = (List) sxvVarC.get();
                        if (list != null) {
                            for (acca accaVar3 : list) {
                                if (accaVar3 != null && TextUtils.equals(accaVar2.k, accaVar3.k) && TextUtils.equals(str2, accaVar3.d)) {
                                    accaVar = accaVar3;
                                }
                            }
                        }
                    }
                    if (accaVar == null) {
                        r2.iT(obj2, new IOException());
                    } else {
                        ((aaoh) obj3).a.a(new acap(accaVar), r2);
                    }
                } catch (Exception e) {
                    r2.iT(obj2, e);
                    return;
                }
                break;
            case 2:
                ((aapd) this.a).c((abnl) this.b, this.c);
                break;
            case 3:
                ((abdl) this.b).a.m(this.c, this.a);
                break;
            case 4:
                ((abdl) this.b).a.e(this.c, this.a);
                break;
            case 5:
                ((abdl) this.a).a.w(this.c, (amdd) this.b);
                break;
            case 6:
                ((abdl) this.a).a.p(this.c, (amdd) this.b);
                break;
            case 7:
                ((abdl) this.a).a.A(this.c, (amdd) this.b);
                break;
            case 8:
                ((abvk) this.b).w.B((abnl) this.a, (abng) this.c);
                break;
            case 9:
                ?? r0 = this.b;
                if (r0.ad()) {
                    r0.z(this.c, ((xpl) this.a).b);
                }
                break;
            case 10:
                Uri uriA = ((tyt) this.c).a();
                zxi zxiVar = new zxi(2, "vss");
                zxiVar.b(uriA);
                zxiVar.d = true;
                zxiVar.k = this.a;
                Object obj4 = this.b;
                abzc abzcVar = (abzc) obj4;
                zxiVar.g = abzcVar.M;
                zxiVar.h = abzcVar.N;
                zxiVar.a(tok.HTTP_PING_VIDEO_STATS_2_CLIENT);
                abzcVar.n.b(abzcVar.o, zxiVar, new xoi(obj4, i));
                break;
            case 11:
                acfs acfsVar = (acfs) this.a;
                if (acfsVar.N()) {
                    acfsVar.a.bp(this.c.f(), ((Float) this.b).floatValue());
                }
                break;
            case 12:
                long j = achr.a;
                if (!((achu) this.c).a()) {
                    this.a.r((aony) this.b);
                }
                break;
            case 13:
                if (!((achu) this.c).a()) {
                    Object obj5 = this.b;
                    acia aciaVar = (acia) ((achw) this.a).c.io();
                    abnk abnkVar = new abnk();
                    abnkVar.a = achw.a((alvl) obj5);
                    aciaVar.g(abnkVar.a());
                }
                break;
            case 14:
                ((acid) this.a).a.jP(this.c, (String) this.b);
                break;
            case 15:
                Object obj6 = this.b;
                acnk acnkVar = (acnk) this.c;
                acnkVar.r.a((aoqt) obj6, absm.a, null, null);
                acnkVar.f();
                String strZ = ahno.Z(acnkVar.n);
                int iAX = a.aX(((alqc) this.a).f);
                acnkVar.j.g(strZ, 13, "ReelWatchStatusRenderer Error: ".concat(Integer.toString((iAX != 0 ? iAX : 1) - 1)));
                break;
            case 16:
                boolean zAp = aecm.ap((ajwo) this.a);
                Object obj7 = this.c;
                if (zAp) {
                    int i2 = ((alqc) this.b).b;
                    if ((i2 & 4) == 0 && (i2 & SemanticState.ReadOnly) == 0) {
                        acnk acnkVar2 = (acnk) obj7;
                        acnkVar2.j(Optional.empty());
                        if (acnkVar2.s.ae()) {
                            acnkVar2.j.g(acnkVar2.n, 24, "Seedless GRIW request resulted in a video unavailable error.");
                        }
                    }
                }
                acnk acnkVar3 = (acnk) obj7;
                if (!acnkVar3.s.ae()) {
                    acnkVar3.j.g(acnkVar3.n, 24, "GRIW request resulted in a video unavailable error. If it is seedless the error is shown to the user.");
                }
                break;
            case 17:
                ajwo ajwoVar = (ajwo) this.a;
                boolean zAp2 = aecm.ap(ajwoVar);
                Object obj8 = this.b;
                Object obj9 = this.c;
                if (zAp2) {
                    ((acoi) obj9).w.g((String) obj8, 24, "Seedless request failed.");
                } else {
                    ((acoi) obj9).w.b((String) obj8, 2);
                }
                acoi acoiVar = (acoi) obj9;
                if (acoiVar.F.X()) {
                    acoiVar.bD = Optional.of(new ijt(obj8));
                } else {
                    acoh acohVar = acoiVar.aJ;
                    if (acohVar.a.isPresent()) {
                        acohVar.a = Optional.empty();
                        acoiVar.bT.e(new acqy(2, false));
                    } else {
                        acoiVar.k.e(ajwoVar);
                    }
                }
                break;
            case 18:
                acoi acoiVar2 = (acoi) this.a;
                acqz acqzVar = acoiVar2.t;
                ?? r3 = this.c;
                alvt alvtVarU = r3.u();
                acqz acqzVar2 = acoiVar2.t;
                ajwo ajwoVar2 = (ajwo) this.b;
                if (!acqzVar.R(alvtVarU, acqzVar2.b(ajwoVar2))) {
                    acoiVar2.E.c(ajwoVar2, r3.u());
                }
                break;
            case 19:
                ((acoi) this.a).E.c((ajwo) this.b, this.c.u());
                break;
            default:
                Object obj10 = this.a;
                acqz acqzVar3 = ((acoi) this.c).t;
                if (obj10 != null && (obj = this.b) != null) {
                    acqh acqhVar = acqzVar3.ag;
                    if (acqhVar != null) {
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                        aihi aihiVar = (aihi) obj10;
                        aihiVar.c(aihlVarCheckIsLite);
                        Object objK = aihiVar.j.k(aihlVarCheckIsLite.d);
                        String str3 = ((apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).U;
                        if (!str3.isEmpty()) {
                            acraVarK = acqhVar.H(acqzVar3.Q, str3, new accu(i));
                        } else if (acqzVar3.at.aF()) {
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                            aihiVar.c(aihlVarCheckIsLite2);
                            Object objK2 = aihiVar.j.k(aihlVarCheckIsLite2.d);
                            String str4 = ((apfp) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).o;
                            if (!str4.isEmpty()) {
                                acraVarK = acqhVar.K(acqzVar3.Q, str4);
                            }
                        }
                    }
                    acra acraVar = acraVarK;
                    if (acraVar != null && acraVar.h == null) {
                        hno hnoVar = acqzVar3.at;
                        acrp acrpVar = acraVar.i;
                        boolean z = hnoVar.as() || hnoVar.aO() || !(acrpVar instanceof acrs) || !hnoVar.aW();
                        acqs acqsVar = new acqs(acraVar, acrpVar, z, z && !(!hnoVar.as() && hnoVar.aO() && hnoVar.aW()), (!z || hnoVar.as() || hnoVar.aW() || acrpVar == null || !acrpVar.F()) ? false : true);
                        if (acqsVar.c) {
                            acraVar.i((alqc) obj, acqsVar.d);
                        }
                        if (acqsVar.e && acqsVar.b != null) {
                            ajwo ajwoVar3 = acqsVar.a.f;
                            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
                            ajwoVar3.c(aihlVarCheckIsLite3);
                            Object objK3 = ajwoVar3.j.k(aihlVarCheckIsLite3.d);
                            String str5 = ((apfp) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3))).o;
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ aapc(acnk acnkVar, aoqt aoqtVar, alqc alqcVar, int i) {
        this.$cid = i;
        this.c = acnkVar;
        this.b = aoqtVar;
        this.a = alqcVar;
    }

    public /* synthetic */ aapc(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ aapc(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ aapc(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ aapc(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }
}

package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.JniZero;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qbj extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(aaok aaokVar, vdw vdwVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = aaokVar;
        this.c = vdwVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, yqs] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, tjm] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, yqs] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, tjk] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, tjk] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, pxk] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        qbj qbjVar;
        switch (this.$cid) {
            case 0:
                return new qbj((qbk) this.b, (Bundle) this.c, awoqVar, 0);
            case 1:
                qbjVar = new qbj((qbk) this.b, (Bundle) this.c, awoqVar, 1, (byte[]) null);
                break;
            case 2:
                qbjVar = new qbj((qbs) this.b, (pxk) this.c, awoqVar, 2);
                break;
            case 3:
                qbjVar = new qbj((qbs) this.b, (StatusBarNotification) this.c, awoqVar, 3);
                break;
            case 4:
                qbjVar = new qbj((Throwable) this.b, (tkd) this.c, awoqVar, 4);
                break;
            case 5:
                qbjVar = new qbj((tkd) this.c, (tnm) this.b, awoqVar, 5);
                break;
            case 6:
                return new qbj((tjm) this.c, (tkd) this.b, awoqVar, 6);
            case 7:
                qbjVar = new qbj((ujb) this.c, (Map) this.b, awoqVar, 7);
                break;
            case 8:
                qbjVar = new qbj((uof) this.c, (vfb) this.b, awoqVar, 8);
                break;
            case 9:
                qbjVar = new qbj((uzt) this.c, (aufd) this.b, awoqVar, 9);
                break;
            case 10:
                return new qbj((List) this.b, (uzt) this.c, awoqVar, 10);
            case 11:
                qbjVar = new qbj((aufa) this.b, (ahgb) this.c, awoqVar, 11);
                break;
            case 12:
                qbjVar = new qbj((ahgb) this.c, (aufa) this.b, awoqVar, 12);
                break;
            case 13:
                qbjVar = new qbj((xsc) this.c, (ajwo) this.b, awoqVar, 13);
                break;
            case 14:
                qbjVar = new qbj((aaok) this.b, (vdw) this.c, awoqVar, 14);
                break;
            case 15:
                qbjVar = new qbj((vwg) this.c, (asdt) this.b, awoqVar, 15);
                break;
            case 16:
                qbjVar = new qbj((vwg) this.c, (asdv) this.b, awoqVar, 16);
                break;
            case 17:
                qbjVar = new qbj((xsc) this.c, (asee) this.b, awoqVar, 17);
                break;
            case 18:
                qbjVar = new qbj((ycd) this.c, (String) this.b, awoqVar, 18);
                break;
            case 19:
                return new qbj((yqs) this.b, (tjk) this.c, awoqVar, 19);
            default:
                qbjVar = new qbj((yqs) this.b, (tjk) this.c, awoqVar, 20, (byte[]) null);
                break;
        }
        return qbjVar;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 1:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 2:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 3:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 4:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 5:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 6:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 7:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 8:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 9:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 10:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 11:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 12:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 13:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 14:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 15:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 16:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 17:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 18:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 19:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            default:
                return ((qbj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0466  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, tjk] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, tjk] */
    /* JADX WARN: Type inference failed for: r1v126, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r1v132, types: [java.lang.Object, yqs] */
    /* JADX WARN: Type inference failed for: r1v139, types: [java.lang.Object, yqs] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, tjm] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v91, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, pxk] */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object, zfs] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, zwh] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        String upperCase;
        Object objP;
        String strValueOf;
        String strName;
        ajwo ajwoVar;
        String str;
        Object objS;
        Object objJ;
        Object objK;
        Object objC;
        Object objAd;
        Object objAd2;
        switch (this.$cid) {
            case 0:
                awox awoxVar = awox.a;
                int i = this.a;
                atqp.j(obj);
                if (i != 0) {
                    objP = obj;
                } else {
                    int i2 = qbk.i;
                    qbk qbkVar = (qbk) this.b;
                    pxh pxhVar = qbkVar.c;
                    Context context = qbkVar.a;
                    pxhVar.a(context);
                    String packageName = context.getPackageName();
                    int i3 = Build.VERSION.SDK_INT;
                    Boolean bool = (Boolean) qbkVar.h.h().d();
                    if (bool == null || (strValueOf = String.valueOf(bool.booleanValue())) == null) {
                        upperCase = "CHECK_FAILED";
                    } else {
                        upperCase = strValueOf.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    qbkVar.d.d(packageName, qbkVar.e.a, i3, true, qbkVar.g, upperCase);
                    awou awouVar = qbkVar.b;
                    qbj qbjVar = new qbj(qbkVar, (Bundle) this.c, (awoq) null, 1, (byte[]) null);
                    this.a = 1;
                    objP = awro.p(awouVar, qbjVar, this);
                    if (objP == awoxVar) {
                        return awoxVar;
                    }
                }
                qbk qbkVar2 = (qbk) this.b;
                Context context2 = qbkVar2.a;
                pky pkyVar = (pky) objP;
                String packageName2 = context2.getPackageName();
                int i4 = Build.VERSION.SDK_INT;
                String strE = pkyVar.e();
                pkx pkxVarC = pkyVar.c();
                if (pkxVarC == null || (strName = pkxVarC.name()) == null) {
                    strName = "";
                }
                qbkVar2.d.c(packageName2, qbkVar2.e.a, i4, true, qbkVar2.g, false, strE, strName, qnl.ae(context2));
                return objP;
            case 1:
                awox awoxVar2 = awox.a;
                int i5 = this.a;
                atqp.j(obj);
                if (i5 == 0) {
                    Object obj2 = this.b;
                    Object obj3 = this.c;
                    this.a = 1;
                    objP = ((qbk) obj2).f.c((Bundle) obj3, this);
                    if (objP == awoxVar2) {
                        return awoxVar2;
                    }
                    return objP;
                }
                return obj;
            case 2:
                Object obj4 = awox.a;
                int i6 = this.a;
                atqp.j(obj);
                if (i6 == 0) {
                    Object obj5 = this.b;
                    ?? r2 = this.c;
                    this.a = 1;
                    qbs qbsVar = (qbs) obj5;
                    Object objA = nxf.a(qbsVar.f, qbsVar.e, new pvl(qbsVar, (pxk) r2, (awoq) null, 3), this);
                    if (objA != obj4) {
                        objA = awmy.a;
                    }
                    if (objA == obj4) {
                        return obj4;
                    }
                }
                return awmy.a;
            case 3:
                awox awoxVar3 = awox.a;
                int i7 = this.a;
                atqp.j(obj);
                if (i7 == 0) {
                    Object obj6 = this.b;
                    Object obj7 = this.c;
                    this.a = 1;
                    qbs qbsVar2 = (qbs) obj6;
                    objP = nxf.a(qbsVar2.f, qbsVar2.e, new qbr((StatusBarNotification) obj7, qbsVar2, null), this);
                    if (objP == awoxVar3) {
                        return awoxVar3;
                    }
                    return objP;
                }
                return obj;
            case 4:
                awox awoxVar4 = awox.a;
                int i8 = this.a;
                atqp.j(obj);
                if (i8 == 0) {
                    Throwable th = (Throwable) this.b;
                    tnm tnmVarK = taq.k(tjo.b(th));
                    Object obj8 = this.c;
                    if (tnmVarK != null) {
                        this.a = 1;
                        if (((tkd) obj8).d(tnmVarK, true, this) == awoxVar4) {
                            return awoxVar4;
                        }
                        ((tkd) this.c).j();
                    } else {
                        ((tkd) obj8).k(th);
                    }
                } else {
                    ((tkd) this.c).j();
                }
                return awmy.a;
            case 5:
                awox awoxVar5 = awox.a;
                int i9 = this.a;
                atqp.j(obj);
                if (i9 == 0) {
                    Object obj9 = this.c;
                    Object obj10 = this.b;
                    this.a = 1;
                    if (((tkd) obj9).d((tnm) obj10, false, this) == awoxVar5) {
                        return awoxVar5;
                    }
                }
                return awmy.a;
            case 6:
                awox awoxVar6 = awox.a;
                int i10 = this.a;
                atqp.j(obj);
                if (i10 == 0) {
                    ?? r1 = this.c;
                    tkd tkdVar = (tkd) this.b;
                    r1.d(tkdVar.d);
                    this.a = 1;
                    if (tkdVar.b.a(this) == awoxVar6) {
                        return awoxVar6;
                    }
                }
                return awmy.a;
            case 7:
                awox awoxVar7 = awox.a;
                int i11 = this.a;
                atqp.j(obj);
                if (i11 == 0) {
                    Object obj11 = this.c;
                    ?? r3 = this.b;
                    this.a = 1;
                    if (((ujb) obj11).e(r3, this) == awoxVar7) {
                        return awoxVar7;
                    }
                }
                return awmy.a;
            case 8:
                awox awoxVar8 = awox.a;
                int i12 = this.a;
                atqp.j(obj);
                if (i12 == 0) {
                    Object obj12 = this.c;
                    Object obj13 = this.b;
                    this.a = 1;
                    if (((uof) obj12).a((vfb) obj13, this) == awoxVar8) {
                        return awoxVar8;
                    }
                }
                return awmy.a;
            case 9:
                awox awoxVar9 = awox.a;
                int i13 = this.a;
                atqp.j(obj);
                if (i13 == 0) {
                    Object obj14 = this.c;
                    Object obj15 = this.b;
                    this.a = 1;
                    aufd aufdVar = (aufd) obj15;
                    apsr apsrVar = aufdVar.g;
                    if (apsrVar == null) {
                        apsrVar = apsr.a;
                    }
                    if (apsrVar.b == 4) {
                        apsr apsrVar2 = aufdVar.g;
                        if (apsrVar2 == null) {
                            apsrVar2 = apsr.a;
                        }
                        String str2 = (apsrVar2.b == 4 ? (apse) apsrVar2.c : apse.a).c;
                        str2.getClass();
                        uzt uztVar = (uzt) obj14;
                        uyr uyrVarA = uztVar.c.a(str2);
                        if (uyrVarA != null) {
                            objP = Optional.of(new ury(uzt.q(aufdVar, uyrVarA), uzt.p(aufdVar, uyrVarA)));
                        } else {
                            int i14 = aufdVar.c;
                            if (i14 != 2) {
                                objP = uztVar.n(str2, aufdVar, this);
                            } else {
                                aufe aufeVar = i14 == 2 ? (aufe) aufdVar.d : aufe.a;
                                aufeVar.getClass();
                                int i15 = aufeVar.b;
                                if ((i15 & 1) == 0 || (i15 & 2) == 0) {
                                    objP = uztVar.n(str2, aufdVar, this);
                                } else {
                                    objP = uztVar.l(str2, aufdVar, aufeVar, this);
                                }
                            }
                        }
                    } else {
                        objP = Optional.empty();
                    }
                    if (objP == awoxVar9) {
                        return awoxVar9;
                    }
                    return objP;
                }
                return obj;
            case 10:
                awox awoxVar10 = awox.a;
                int i16 = this.a;
                atqp.j(obj);
                if (i16 == 0) {
                    uzq uzqVar = new uzq((List) this.b, (uzt) this.c, (awoq) null, 0);
                    this.a = 1;
                    objP = awrc.J(uzqVar, this);
                    if (objP == awoxVar10) {
                        return awoxVar10;
                    }
                    return objP;
                }
                return obj;
            case 11:
                awox awoxVar11 = awox.a;
                int i17 = this.a;
                atqp.j(obj);
                if (i17 == 0) {
                    aiie aiieVar = ((aufa) this.b).k;
                    aiieVar.getClass();
                    aihl aihlVar = auft.b;
                    aihlVar.getClass();
                    auft auftVar = (auft) yno.gh(aiieVar, aihlVar);
                    if (auftVar != null) {
                        ajwoVar = auftVar.i;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                    } else {
                        ajwoVar = null;
                    }
                    if (ajwoVar == null) {
                        twu.d("ASCmpCompute", 6, "Segment missing GSSV command", null);
                        throw new IllegalArgumentException();
                    }
                    Object obj16 = this.c;
                    ajwo ajwoVar2 = auftVar.i;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    ajwo ajwoVar3 = ajwoVar2;
                    ajwoVar3.getClass();
                    this.a = 1;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aleb.b);
                    ajwoVar3.c(aihlVarCheckIsLite);
                    Object objK2 = ajwoVar3.j.k(aihlVarCheckIsLite.d);
                    Object objC2 = objK2 == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK2);
                    objC2.getClass();
                    aleb alebVar = (aleb) objC2;
                    apvn apvnVar = alebVar.f;
                    if (apvnVar == null) {
                        apvnVar = apvn.a;
                    }
                    if ((apvnVar.b & 2) != 0) {
                        apvn apvnVar2 = alebVar.f;
                        if (apvnVar2 == null) {
                            apvnVar2 = apvn.a;
                        }
                        str = apvnVar2.c;
                        str.getClass();
                    } else {
                        if ((alebVar.c & 1) == 0) {
                            throw new IllegalStateException();
                        }
                        str = alebVar.d;
                        str.getClass();
                    }
                    String str3 = str;
                    Object obj17 = ((ahgb) obj16).e;
                    Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(((xsc) obj17).a, str3, new uot(new hgo((Object) str3, obj17, (Object) ajwoVar3, 7, (short[]) null), 12));
                    objComputeIfAbsent.getClass();
                    objP = ((awuz) objComputeIfAbsent).c(this);
                    if (objP == awoxVar11) {
                        return awoxVar11;
                    }
                    return objP;
                }
                return obj;
            case 12:
                awox awoxVar12 = awox.a;
                int i18 = this.a;
                atqp.j(obj);
                if (i18 != 0) {
                    objS = obj;
                } else {
                    Object obj18 = this.c;
                    Object obj19 = this.b;
                    this.a = 1;
                    objS = ((ahgb) obj18).s((aufa) obj19, this);
                    if (objS == awoxVar12) {
                        return awoxVar12;
                    }
                }
                return Optional.ofNullable(objS);
            case 13:
                awox awoxVar13 = awox.a;
                int i19 = this.a;
                atqp.j(obj);
                if (i19 == 0) {
                    Object obj20 = this.c;
                    Object obj21 = this.b;
                    aaok aaokVar = (aaok) ((xsc) obj20).b;
                    zwa zwaVarE = aaokVar.b.e();
                    zwaVarE.getClass();
                    xpl xplVar = (xpl) aaokVar.a;
                    aend aendVarH = ((wub) aguu.aw((Context) xplVar.a, wub.class, ((syn) xplVar.b).m(zwaVarE))).H();
                    aihl aihlVar2 = aleb.b;
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar2);
                    aihi aihiVar = (aihi) obj21;
                    aihiVar.c(aihlVarCheckIsLite2);
                    ahno.F(aihiVar.j.n(aihlVarCheckIsLite2.d));
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                    aihiVar.c(aihlVarCheckIsLite3);
                    Object objK3 = aihiVar.j.k(aihlVarCheckIsLite3.d);
                    aleb alebVar2 = (aleb) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3));
                    wua wuaVar = new wua(aendVarH.b, aendVarH.c.hw());
                    wuaVar.a = alebVar2.d;
                    apvn apvnVar3 = alebVar2.f;
                    if (apvnVar3 == null) {
                        apvnVar3 = apvn.a;
                    }
                    wuaVar.c = apvnVar3;
                    aiie<apwy> aiieVar2 = alebVar2.g;
                    if (aiieVar2 != null) {
                        wuaVar.e = new ArrayList();
                        for (apwy apwyVar : aiieVar2) {
                            List list = wuaVar.e;
                            aihf aihfVarCreateBuilder = alqt.a.createBuilder();
                            long j = apwyVar.b;
                            aihfVarCreateBuilder.copyOnWrite();
                            alqt alqtVar = (alqt) aihfVarCreateBuilder.instance;
                            alqtVar.b |= 1;
                            alqtVar.c = j;
                            list.add((alqt) aihfVarCreateBuilder.build());
                        }
                    }
                    wuaVar.b = alebVar2.e;
                    wuaVar.D = 1;
                    if ((alebVar2.c & 8) != 0) {
                        apww apwwVar = alebVar2.h;
                        if (apwwVar == null) {
                            apwwVar = apww.a;
                        }
                        wuaVar.d = apwwVar;
                    }
                    ?? r4 = aaokVar.c;
                    wuaVar.n(((ajwo) obj21).c);
                    ListenableFuture listenableFutureB = ((wnh) aendVarH.d).b(wuaVar, r4, null);
                    this.a = 1;
                    objP = awrc.ad(listenableFutureB, this);
                    if (objP == awoxVar13) {
                        return awoxVar13;
                    }
                    return objP;
                }
                return obj;
            case 14:
                awox awoxVar14 = awox.a;
                int i20 = this.a;
                atqp.j(obj);
                if (i20 == 0) {
                    Object obj22 = this.b;
                    Object obj23 = this.c;
                    aaok aaokVar2 = (aaok) obj22;
                    aaok aaokVar3 = (aaok) aaokVar2.a;
                    String strA = ((txp) aaokVar3.a).a();
                    strA.getClass();
                    strA.getClass();
                    abri abriVarD = ((abrg) aaokVar3.c).d();
                    vdw vdwVar = (vdw) obj23;
                    String str4 = vdwVar.a;
                    abriVarD.a = str4;
                    abriVarD.n(vdwVar.c);
                    abriVarD.c = vdwVar.b;
                    abriVarD.T = strA;
                    abriVarD.G(abnr.BACKGROUND.i);
                    zh zhVar = new zh((byte[]) null, (char[]) null);
                    zhVar.m(str4);
                    zfp zfpVarB = aaokVar3.d.b(zhVar.l());
                    if (zfpVarB != null) {
                        abriVarD.ad = zfpVarB;
                    } else {
                        twu.d("VideoIdAssetUtils", 6, "PO token is null, not attaching PO token to player request.", null);
                    }
                    aaok aaokVar4 = (aaok) aaokVar2.c;
                    ListenableFuture listenableFutureAp = ahno.ap(new ldy(aaokVar4, abriVarD, 3), aaokVar4.c);
                    this.a = 1;
                    objP = awrc.ad(listenableFutureAp, this);
                    if (objP == awoxVar14) {
                        return awoxVar14;
                    }
                    return objP;
                }
                return obj;
            case 15:
                awox awoxVar15 = awox.a;
                int i21 = this.a;
                atqp.j(obj);
                if (i21 != 0) {
                    objJ = obj;
                } else {
                    avmc avmcVarN = ((vwg) this.c).a.n(((asdt) this.b).b);
                    this.a = 1;
                    awud awudVar = new awud(JniZero.q(this), 1);
                    awudVar.w();
                    avmcVarN.F(new axer(awudVar));
                    objJ = awudVar.j();
                    if (objJ == awoxVar15) {
                        return awoxVar15;
                    }
                }
                objJ.getClass();
                aihf aihfVarCreateBuilder2 = asdu.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                agqr it = ((agkz) objJ).iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    weh wehVar = (weh) next;
                    DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((asdu) aihfVarCreateBuilder2.instance).b)).getClass();
                    String strB = wehVar.b();
                    strB.getClass();
                    aigj aigjVarV = aigj.v(wehVar.c());
                    aigjVarV.getClass();
                    aihfVarCreateBuilder2.copyOnWrite();
                    asdu asduVar = (asdu) aihfVarCreateBuilder2.instance;
                    aiip aiipVar = asduVar.b;
                    if (!aiipVar.b) {
                        asduVar.b = aiipVar.a();
                    }
                    asduVar.b.put(strB, aigjVarV);
                }
                aihn aihnVarBuild = aihfVarCreateBuilder2.build();
                aihnVarBuild.getClass();
                return (asdu) aihnVarBuild;
            case 16:
                awox awoxVar16 = awox.a;
                int i22 = this.a;
                atqp.j(obj);
                if (i22 != 0) {
                    objK = obj;
                } else {
                    avlm avlmVarG = ((vwg) this.c).a.g(((asdv) this.b).b);
                    this.a = 1;
                    objK = avkz.k(avlmVarG, this);
                    if (objK == awoxVar16) {
                        return awoxVar16;
                    }
                }
                objK.getClass();
                return yno.eH((weh) objK);
            case 17:
                awox awoxVar17 = awox.a;
                int i23 = this.a;
                atqp.j(obj);
                if (i23 != 0) {
                    objC = obj;
                } else {
                    Object obj24 = this.c;
                    Object obj25 = this.b;
                    aihf aihfVarCreateBuilder3 = alwt.a.createBuilder();
                    aihfVarCreateBuilder3.getClass();
                    aklk aklkVar = ((asee) obj25).d;
                    if (aklkVar == null) {
                        aklkVar = aklk.a;
                    }
                    Object obj26 = ((xsc) obj24).a;
                    aklkVar.getClass();
                    acfz.bk(aklkVar, aihfVarCreateBuilder3);
                    aihf builder = acfz.bj(aihfVarCreateBuilder3).toBuilder();
                    builder.getClass();
                    this.a = 1;
                    objC = ((xzs) obj26).c(builder, 3, xzt.a, xzs.b, this);
                    if (objC == awoxVar17) {
                        return awoxVar17;
                    }
                }
                alwu alwuVar = (alwu) objC;
                if ((alwuVar.b & 4) != 0) {
                    Object obj27 = this.c;
                    ajwo ajwoVar4 = alwuVar.d;
                    if (ajwoVar4 == null) {
                        ajwoVar4 = ajwo.a;
                    }
                    ((xsc) obj27).b.a(ajwoVar4);
                }
                aihf aihfVarCreateBuilder4 = aseg.a.createBuilder();
                aihfVarCreateBuilder4.getClass();
                akll akllVar = alwuVar.e;
                if (akllVar == null) {
                    akllVar = akll.a;
                }
                akllVar.getClass();
                atqn.T(akllVar, aihfVarCreateBuilder4);
                return atqn.S(aihfVarCreateBuilder4);
            case 18:
                awox awoxVar18 = awox.a;
                int i24 = this.a;
                atqp.j(obj);
                if (i24 == 0) {
                    Object obj28 = this.c;
                    Object obj29 = this.b;
                    this.a = 1;
                    if (((ycd) obj28).e((String) obj29, this) == awoxVar18) {
                        return awoxVar18;
                    }
                }
                return awmy.a;
            case 19:
                awox awoxVar19 = awox.a;
                int i25 = this.a;
                atqp.j(obj);
                if (i25 != 0) {
                    objAd = obj;
                } else {
                    ListenableFuture listenableFutureA = this.b.a();
                    this.a = 1;
                    objAd = awrc.ad(listenableFutureA, this);
                    if (objAd == awoxVar19) {
                        return awoxVar19;
                    }
                }
                objAd.getClass();
                ?? r0 = this.c;
                r0.c((tnm) objAd);
                r0.a();
                return awmy.a;
            default:
                awox awoxVar20 = awox.a;
                int i26 = this.a;
                atqp.j(obj);
                if (i26 != 0) {
                    objAd2 = obj;
                } else {
                    ListenableFuture listenableFutureA2 = this.b.a();
                    this.a = 1;
                    objAd2 = awrc.ad(listenableFutureA2, this);
                    if (objAd2 == awoxVar20) {
                        return awoxVar20;
                    }
                }
                objAd2.getClass();
                ?? r5 = this.c;
                r5.c((tnm) objAd2);
                r5.a();
                return awmy.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(ahgb ahgbVar, aufa aufaVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = ahgbVar;
        this.b = aufaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(aufa aufaVar, ahgb ahgbVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = aufaVar;
        this.c = ahgbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(Throwable th, tkd tkdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = th;
        this.c = tkdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(List list, uzt uztVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = list;
        this.c = uztVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(qbk qbkVar, Bundle bundle, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = qbkVar;
        this.c = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(qbk qbkVar, Bundle bundle, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = qbkVar;
        this.c = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(qbs qbsVar, StatusBarNotification statusBarNotification, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = qbsVar;
        this.c = statusBarNotification;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(qbs qbsVar, pxk pxkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = qbsVar;
        this.c = pxkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(tjm tjmVar, tkd tkdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = tjmVar;
        this.b = tkdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(tkd tkdVar, tnm tnmVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = tkdVar;
        this.b = tnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(ujb ujbVar, Map map, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = ujbVar;
        this.b = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(uof uofVar, vfb vfbVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = uofVar;
        this.b = vfbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(uzt uztVar, aufd aufdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = uztVar;
        this.b = aufdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(vwg vwgVar, asdt asdtVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = vwgVar;
        this.b = asdtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(vwg vwgVar, asdv asdvVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = vwgVar;
        this.b = asdvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(xsc xscVar, ajwo ajwoVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = xscVar;
        this.b = ajwoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(xsc xscVar, asee aseeVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = xscVar;
        this.b = aseeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(ycd ycdVar, String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = ycdVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(yqs yqsVar, tjk tjkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = yqsVar;
        this.c = tjkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbj(yqs yqsVar, tjk tjkVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = yqsVar;
        this.c = tjkVar;
    }
}

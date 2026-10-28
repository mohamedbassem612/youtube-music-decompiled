package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pyy implements phc {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;
    private final qbn c;
    private final pzb d;
    private final pav e;
    private final pls f;
    private final awmd g;
    private final aunn h;

    public pyy(Context context, qbn qbnVar, pzb pzbVar, pav pavVar, pls plsVar, awmd awmdVar, aunn aunnVar) {
        context.getClass();
        qbnVar.getClass();
        pzbVar.getClass();
        pavVar.getClass();
        plsVar.getClass();
        awmdVar.getClass();
        aunnVar.getClass();
        this.b = context;
        this.c = qbnVar;
        this.d = pzbVar;
        this.e = pavVar;
        this.f = plsVar;
        this.g = awmdVar;
        this.h = aunnVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ee A[PHI: r1 r2 r3 r16
      0x01ee: PHI (r1v5 pbf) = (r1v0 pbf), (r1v7 pbf) binds: [B:38:0x00fe, B:80:0x01ec] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r2v6 pot) = (r2v5 pot), (r2v8 pot) binds: [B:38:0x00fe, B:80:0x01ec] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r3v5 ??) = (r3v14 ??), (r3v15 ??) binds: [B:38:0x00fe, B:80:0x01ec] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r16v1 int) = (r16v0 int), (r16v2 int) binds: [B:38:0x00fe, B:80:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x020a  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.content.Intent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r7v17 */
    @Override // defpackage.phc
    public final Object a(pbf pbfVar, awoq awoqVar) throws Throwable {
        pyx pyxVar;
        ?? r3;
        pot potVar;
        int i;
        int i2;
        int i3;
        ListenableFuture listenableFutureN;
        int i4;
        ?? r4;
        plx plxVar;
        String str;
        pfm pfmVarB;
        qbn qbnVar;
        plb plbVarC;
        aifv aifvVar;
        pbf pbfVar2 = pbfVar;
        if (awoqVar instanceof pyx) {
            pyxVar = (pyx) awoqVar;
            int i5 = pyxVar.d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                pyxVar.d = i5 - Integer.MIN_VALUE;
            } else {
                pyxVar = new pyx(this, awoqVar);
            }
        } else {
            pyxVar = new pyx(this, awoqVar);
        }
        pyx pyxVar2 = pyxVar;
        Object obj = pyxVar2.b;
        Object obj2 = awox.a;
        int i6 = pyxVar2.d;
        if (i6 != 0) {
            if (i6 == 1) {
                pot potVar2 = pyxVar2.e;
                r3 = pyxVar2.a;
                pbf pbfVar3 = pyxVar2.f;
                atqp.j(obj);
                potVar = potVar2;
                i2 = 3;
                pbfVar2 = pbfVar3;
                i3 = -1;
            } else {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
            r4 = r3;
            return awmy.a;
        }
        atqp.j(obj);
        r3 = pbfVar2.g;
        if (r3 == 0) {
            ((agsj) a.b()).t("NotificationEvent has no intent");
            return awmy.a;
        }
        if (pbfVar2.d != pbd.a) {
            ((agsj) a.b()).t("NotificationEvent threads are not system tray threads");
            return awmy.a;
        }
        agke agkeVarB = pbfVar2.b();
        if (agkeVarB.isEmpty()) {
            ((agsj) a.b()).t("NotificationEvent has no threads");
            return awmy.a;
        }
        agkeVarB.getClass();
        Object objX = atqq.X(agkeVarB);
        objX.getClass();
        potVar = (pot) objX;
        agsn agsnVar = pho.a;
        int iK = aext.K(r3.getIntExtra("com.google.android.libraries.notifications.USER_FEEDBACK_ACTION_TYPE", aext.J(2)));
        if (iK == 0) {
            iK = 2;
        }
        paw pawVarB = this.e.b(ahzv.ACTION_CLICK);
        pbc pbcVar = (pbc) pawVarB;
        pbcVar.d = pbfVar2.b;
        pbcVar.q = 3;
        int i7 = iK - 2;
        if (i7 != 1) {
            i = i7 != 2 ? 1 : 3;
        } else {
            i = 2;
        }
        pbcVar.v = i;
        plx plxVar2 = pbfVar2.c;
        pawVarB.f(plxVar2);
        pawVarB.b(potVar);
        pbcVar.r = 2;
        pawVarB.a();
        i2 = 3;
        i3 = -1;
        ((pwf) this.g.io()).m(this.b.getPackageName(), this.f.a, Build.VERSION.SDK_INT, "ACTION_CLICKED");
        r4 = r3;
        if (auwe.c()) {
            ozj ozjVarB = nvj.b(potVar);
            abqq abqqVar = (abqq) ((pcn) this.h.io()).a(ozjVarB).f();
            if (abqqVar != null) {
                Bundle bundleA = pho.a(r3);
                if (plxVar2 == null) {
                    throw new IllegalArgumentException("Event's account is null");
                }
                int iH = nqy.h(iK);
                pyxVar2.f = pbfVar2;
                pyxVar2.a = r3;
                pyxVar2.e = potVar;
                pyxVar2.d = 1;
                int i8 = 0;
                if (((vxz) abqqVar.b).l(21, 45699164L, false)) {
                    listenableFutureN = ahng.n(awmy.a);
                } else {
                    Optional optionalS = ((elr) abqqVar.j).s(ozjVarB);
                    aaab aaabVar = new aaab(abqqVar, iH, bundleA, i8);
                    if (true == optionalS.isPresent()) {
                        Object obj3 = optionalS.get();
                        Object obj4 = aaabVar.b;
                        int i9 = aaabVar.a;
                        Object obj5 = aaabVar.c;
                        ajcs ajcsVar = (ajcs) obj3;
                        amud amudVar = ajcsVar.m;
                        if (amudVar == null) {
                            amudVar = amud.b;
                        }
                        if ((amudVar.c & 1) != 0) {
                            Object obj6 = ((abqq) obj4).i;
                            xgt xgtVarB = aabp.b((Bundle) obj5);
                            if (xgtVarB == null) {
                                ((ahgb) obj6).e();
                            } else {
                                int i10 = i9 - 1;
                                if (i10 != 1) {
                                    i4 = i10 == 2 ? 262024 : 262023;
                                }
                                xgj xgjVar = new xgj(xhb.b(i4));
                                amud amudVar2 = ajcsVar.m;
                                if (amudVar2 == null) {
                                    amudVar2 = amud.b;
                                }
                                xgj xgjVar2 = new xgj(amudVar2.d, (amud) null);
                                ?? r5 = ((ahgb) obj6).b;
                                r5.C(xgtVarB);
                                r5.m(xgjVar, xgjVar2);
                                r5.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar, null);
                            }
                        }
                    }
                    listenableFutureN = ahng.n(awmy.a);
                }
                Object objAd = awrc.ad(listenableFutureN, pyxVar2);
                if (objAd != obj2) {
                    objAd = awmy.a;
                }
                if (objAd == obj2) {
                    return obj2;
                }
            }
        } else {
            r4 = r3;
            pzb pzbVar = this.d;
            int intExtra = ((Intent) r4).getIntExtra("com.google.android.libraries.notifications.USER_FEEDBACK_NEXT_VIEW_INDEX", i3);
            plxVar = pbfVar2.c;
            str = potVar.a;
            pfmVarB = pzbVar.b(plxVar, str, intExtra);
            if (pfmVarB != pfm.a || pfmVarB == pfm.b) {
                qbnVar = this.c;
                plbVarC = plb.c();
                aifvVar = potVar.g;
                pyxVar2.f = null;
                pyxVar2.a = null;
                pyxVar2.e = null;
                pyxVar2.d = 2;
                if (qbnVar.a(plxVar, str, plbVarC, aifvVar, pyxVar2) == obj2) {
                    return obj2;
                }
            }
        }
        r4 = r3;
        return awmy.a;
        agsn agsnVar2 = pho.a;
        r3.getClass();
        int iAW = a.aW(((Intent) r3).getIntExtra("com.google.android.libraries.notifications.USER_FEEDBACK_POST_CLICK_ACTION", aext.H(i2)));
        int i11 = iAW == 0 ? i2 : iAW;
        if (i11 != 5 && i11 != 4) {
            r4 = r3;
            pzb pzbVar2 = this.d;
            int intExtra2 = ((Intent) r4).getIntExtra("com.google.android.libraries.notifications.USER_FEEDBACK_NEXT_VIEW_INDEX", i3);
            plxVar = pbfVar2.c;
            str = potVar.a;
            pfmVarB = pzbVar2.b(plxVar, str, intExtra2);
            if (pfmVarB != pfm.a) {
                qbnVar = this.c;
                plbVarC = plb.c();
                aifvVar = potVar.g;
                pyxVar2.f = null;
                pyxVar2.a = null;
                pyxVar2.e = null;
                pyxVar2.d = 2;
                if (qbnVar.a(plxVar, str, plbVarC, aifvVar, pyxVar2) == obj2) {
                    return obj2;
                }
            } else {
                qbnVar = this.c;
                plbVarC = plb.c();
                aifvVar = potVar.g;
                pyxVar2.f = null;
                pyxVar2.a = null;
                pyxVar2.e = null;
                pyxVar2.d = 2;
                if (qbnVar.a(plxVar, str, plbVarC, aifvVar, pyxVar2) == obj2) {
                    return obj2;
                }
            }
        }
        r4 = r3;
        return awmy.a;
    }
}

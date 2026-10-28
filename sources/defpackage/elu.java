package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elu {
    private static final boy a = boy.s("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");
    private static final boy b = boy.s("k");

    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    /* JADX WARN: Code duplicated, block: B:22:0x0093  */
    /* JADX WARN: Code duplicated, block: B:64:0x0157  */
    public static ekj a(emz emzVar, egy egyVar) {
        ekf ekfVar;
        eka ekaVarF;
        List list;
        eka ekaVar;
        int iP = emzVar.p();
        int i = 3;
        if (iP == 3) {
            emzVar.h();
        }
        eka ekaVar2 = null;
        ekd ekdVarA = null;
        ekk ekkVarB = null;
        ekf ekfVar2 = null;
        eka ekaVarF2 = null;
        eka ekaVarF3 = null;
        ekc ekcVar = null;
        eka ekaVarF4 = null;
        eka ekaVarF5 = null;
        while (emzVar.n()) {
            switch (emzVar.q(a)) {
                case 0:
                    emzVar.h();
                    while (emzVar.n()) {
                        if (emzVar.q(b) != 0) {
                            emzVar.l();
                            emzVar.m();
                        } else {
                            ekdVarA = els.a(emzVar, egyVar);
                        }
                    }
                    emzVar.j();
                    i = 3;
                    break;
                case 1:
                    ekkVarB = els.b(emzVar, egyVar);
                    i = 3;
                    break;
                case 2:
                    ekfVar2 = new ekf(emi.a(emzVar, egyVar, 1.0f, ema.f, false));
                    i = 3;
                    break;
                case 3:
                    egyVar.e("Lottie doesn't support 3D layers.");
                    ekaVarF = qa.F(emzVar, egyVar, false);
                    list = ekaVarF.a;
                    if (list.isEmpty()) {
                        Float fValueOf = Float.valueOf(0.0f);
                        ekaVar = ekaVarF;
                        list.add(new enn(egyVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(egyVar.k)));
                    } else {
                        ekaVar = ekaVarF;
                        if (((enn) list.get(0)).b == null) {
                            Float fValueOf2 = Float.valueOf(0.0f);
                            list.set(0, new enn(egyVar, fValueOf2, fValueOf2, (Interpolator) null, 0.0f, Float.valueOf(egyVar.k)));
                        }
                    }
                    ekaVar2 = ekaVar;
                    i = 3;
                    break;
                case 4:
                    ekaVarF = qa.F(emzVar, egyVar, false);
                    list = ekaVarF.a;
                    if (list.isEmpty()) {
                        Float fValueOf3 = Float.valueOf(0.0f);
                        ekaVar = ekaVarF;
                        list.add(new enn(egyVar, fValueOf3, fValueOf3, (Interpolator) null, 0.0f, Float.valueOf(egyVar.k)));
                    } else {
                        ekaVar = ekaVarF;
                        if (((enn) list.get(0)).b == null) {
                            Float fValueOf4 = Float.valueOf(0.0f);
                            list.set(0, new enn(egyVar, fValueOf4, fValueOf4, (Interpolator) null, 0.0f, Float.valueOf(egyVar.k)));
                        }
                    }
                    ekaVar2 = ekaVar;
                    i = 3;
                    break;
                case 5:
                    ekcVar = new ekc(emi.a(emzVar, egyVar, 1.0f, ema.c, false));
                    break;
                case 6:
                    ekaVarF4 = qa.F(emzVar, egyVar, false);
                    break;
                case 7:
                    ekaVarF5 = qa.F(emzVar, egyVar, false);
                    break;
                case 8:
                    ekaVarF2 = qa.F(emzVar, egyVar, false);
                    break;
                case 9:
                    ekaVarF3 = qa.F(emzVar, egyVar, false);
                    break;
                default:
                    emzVar.l();
                    emzVar.m();
                    i = 3;
                    break;
            }
        }
        if (iP == i) {
            emzVar.j();
        }
        if (ekdVarA == null || (ekdVarA.c() && ((PointF) ((enn) ekdVarA.a.get(0)).b).equals(0.0f, 0.0f))) {
            ekdVarA = null;
        }
        if (ekkVarB == null || (!(ekkVarB instanceof ekh) && ekkVarB.c() && ((PointF) ((enn) ekkVarB.b().get(0)).b).equals(0.0f, 0.0f))) {
            ekkVarB = null;
        }
        eka ekaVar3 = true == b(ekaVar2) ? null : ekaVar2;
        if (ekfVar2 == null) {
            ekfVar = null;
        } else {
            if (ekfVar2.c()) {
                enq enqVar = (enq) ((enn) ekfVar2.a.get(0)).b;
                if (enqVar.a == 1.0f && enqVar.b == 1.0f) {
                    ekfVar = null;
                }
            }
            ekfVar = ekfVar2;
        }
        return new ekj(ekdVarA, ekkVarB, ekfVar, ekaVar3, ekcVar, ekaVarF4, ekaVarF5, true == b(ekaVarF2) ? null : ekaVarF2, true == b(ekaVarF3) ? null : ekaVarF3);
    }

    private static /* synthetic */ boolean b(eka ekaVar) {
        if (ekaVar != null) {
            return ekaVar.c() && ((Float) ((enn) ekaVar.a.get(0)).b).floatValue() == 0.0f;
        }
        return true;
    }
}

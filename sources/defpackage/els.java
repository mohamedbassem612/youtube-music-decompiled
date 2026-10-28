package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class els {
    private static final boy a = boy.s("k", "x", "y");

    public static ekd a(emz emzVar, egy egyVar) {
        ArrayList arrayList = new ArrayList();
        if (emzVar.p() == 1) {
            emzVar.g();
            while (emzVar.n()) {
                int iP = emzVar.p();
                ThreadLocal threadLocal = enm.a;
                emz emzVar2 = emzVar;
                egy egyVar2 = egyVar;
                arrayList.add(new ejf(egyVar2, emh.a(emzVar2, egyVar2, Resources.getSystem().getDisplayMetrics().density, ema.d, iP == 3, false)));
                emzVar = emzVar2;
                egyVar = egyVar2;
            }
            emzVar.i();
            emi.b(arrayList);
        } else {
            ThreadLocal threadLocal2 = enm.a;
            arrayList.add(new enn(emg.c(emzVar, Resources.getSystem().getDisplayMetrics().density)));
        }
        return new ekd(arrayList);
    }

    static ekk b(emz emzVar, egy egyVar) {
        emzVar.h();
        boolean z = false;
        ekd ekdVarA = null;
        eka ekaVarF = null;
        eka ekaVarF2 = null;
        while (emzVar.p() != 4) {
            int iQ = emzVar.q(a);
            if (iQ == 0) {
                ekdVarA = a(emzVar, egyVar);
            } else if (iQ != 1) {
                if (iQ != 2) {
                    emzVar.l();
                    emzVar.m();
                } else if (emzVar.p() == 6) {
                    emzVar.m();
                    z = true;
                } else {
                    ekaVarF2 = qa.F(emzVar, egyVar, true);
                }
            } else if (emzVar.p() == 6) {
                emzVar.m();
                z = true;
            } else {
                ekaVarF = qa.F(emzVar, egyVar, true);
            }
        }
        emzVar.j();
        if (z) {
            egyVar.e("Lottie doesn't support expressions.");
        }
        return ekdVarA == null ? new ekh(ekaVarF, ekaVarF2) : ekdVarA;
    }
}

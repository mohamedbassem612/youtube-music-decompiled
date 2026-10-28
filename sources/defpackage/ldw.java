package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ldw implements Runnable {
    final /* synthetic */ lcd a;
    final /* synthetic */ lbg b;
    final /* synthetic */ lcn c;

    public ldw(lcn lcnVar, lcd lcdVar, lbg lbgVar) {
        this.a = lcdVar;
        this.b = lbgVar;
        this.c = lcnVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    @Override // java.lang.Runnable
    public final void run() {
        lcd lcdVar;
        lcc lccVar;
        lcd lcdVar2 = this.a;
        if (!"_cmp".equals(lcdVar2.a) || (lccVar = lcdVar2.b) == null || lccVar.a.size() == 0) {
            lcdVar = lcdVar2;
        } else {
            String strD = lccVar.d("_cis");
            if ("referrer broadcast".equals(strD) || "referrer API".equals(strD)) {
                this.c.a.aT().i.b("Event has been filtered ", lcdVar2.toString());
                lcdVar = new lcd("_cmpx", lccVar, lcdVar2.c, lcdVar2.d, lcdVar2.e);
            } else {
                lcdVar = lcdVar2;
            }
        }
        lcn lcnVar = this.c;
        lbg lbgVar = this.b;
        lfv lfvVar = lcnVar.a;
        ldo ldoVarO = lfvVar.o();
        String str = lbgVar.a;
        giy giyVar = TextUtils.isEmpty(str) ? null : (giy) ldoVarO.h.b(str);
        if (giyVar == null) {
            lcnVar.a.aT().k.b("EES not loaded for", lbgVar.a);
            lcnVar.c(lcdVar, lbgVar);
            return;
        }
        try {
            Map mapR = lfvVar.q().r(lcdVar.b.a(), true);
            String str2 = lcdVar.a;
            String strA = lec.a(str2);
            if (strA == null) {
                strA = str2;
            }
            fyk fykVar = new fyk(strA, lcdVar.d, mapR);
            try {
                Object obj = giyVar.d;
                ((fyl) obj).a = fykVar;
                ((fyl) obj).b = ((fyl) obj).a.clone();
                List<fyk> list = ((fyl) obj).c;
                list.clear();
                ((kwq) ((kwq) giyVar.a).c).A("runtime.counter", new fyr(Double.valueOf(0.0d)));
                Object obj2 = giyVar.c;
                kwq kwqVarF = ((kwq) giyVar.b).F();
                fxy fxyVar = new fxy((fyl) obj);
                Object obj3 = ((kyr) obj2).b;
                for (Integer num : ((TreeMap) obj3).keySet()) {
                    fyk fykVarClone = ((fyl) obj).b.clone();
                    int iL = kyr.L(kwqVarF, (fyx) ((TreeMap) obj3).get(num), fxyVar);
                    if (iL == 2 || iL == -1) {
                        ((fyl) obj).b = fykVarClone;
                    }
                }
                Object obj4 = ((kyr) obj2).a;
                Iterator it = ((TreeMap) obj4).keySet().iterator();
                while (it.hasNext()) {
                    kyr.L(kwqVarF, (fyx) ((TreeMap) obj4).get((Integer) it.next()), fxyVar);
                }
                if (giyVar.c() || giyVar.b()) {
                    if (giyVar.c()) {
                        lfvVar.aT().k.b("EES edited event", str2);
                        lcnVar.c(lfvVar.q().j(((fyl) obj).b), lbgVar);
                    } else {
                        lcnVar.c(lcdVar, lbgVar);
                    }
                    if (giyVar.b()) {
                        for (fyk fykVar2 : list) {
                            lfvVar.aT().k.b("EES logging created event", fykVar2.a);
                            lcnVar.c(lfvVar.q().j(fykVar2), lbgVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                throw new fxu(th);
            }
        } catch (fxu unused) {
            lcnVar.a.aT().c.c("EES error. appId, eventName", lbgVar.b, lcdVar.a);
        }
        lcnVar.a.aT().k.b("EES was not applied to event", lcdVar.a);
        lcnVar.c(lcdVar, lbgVar);
    }
}

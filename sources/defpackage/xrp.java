package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class xrp implements Runnable {
    final /* synthetic */ xrr a;

    public xrp(xrr xrrVar) {
        this.a = xrrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        char c;
        xvn xvnVar;
        xrr xrrVar = this.a;
        abxv abxvVar = xrrVar.h;
        ArrayList arrayList = new ArrayList(dij.i());
        amxj[] amxjVarArr = new amxj[8];
        for (int i = 0; i < 8; i++) {
            aihf aihfVarCreateBuilder = amxj.a.createBuilder();
            int i2 = xqw.h[i];
            aihfVarCreateBuilder.copyOnWrite();
            amxj amxjVar = (amxj) aihfVarCreateBuilder.instance;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            amxjVar.c = i3;
            amxjVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            amxj amxjVar2 = (amxj) aihfVarCreateBuilder.instance;
            amxjVar2.b |= 2;
            amxjVar2.d = 0;
            amxjVarArr[i] = (amxj) aihfVarCreateBuilder.build();
        }
        xqw xqwVar = (xqw) abxvVar.b;
        xqwVar.g(arrayList, false, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            dii diiVar = (dii) arrayList.get(i4);
            if (xsa.g(diiVar)) {
                c = xqwVar.i(diiVar) ? (char) 5 : (char) 2;
            } else if (xrx.m(diiVar) && xqwVar.c) {
                c = 4;
            } else if (xqw.r(diiVar)) {
                c = 1;
            } else if (xsa.i(diiVar)) {
                c = 7;
            } else {
                c = xsa.h(diiVar) ? (char) 3 : (char) 6;
            }
            aihf builder = amxjVarArr[c].toBuilder();
            int i5 = amxjVarArr[c].d + 1;
            builder.copyOnWrite();
            amxj amxjVar3 = (amxj) builder.instance;
            amxjVar3.b |= 2;
            amxjVar3.d = i5;
            if (xsa.g(diiVar) && (xvnVar = (xvn) xqwVar.g.c(diiVar.s)) != null) {
                aihf aihfVarCreateBuilder2 = amxi.a.createBuilder();
                Uri uri = xvnVar.a;
                if (uri != null) {
                    String string = uri.toString();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amxi amxiVar = (amxi) aihfVarCreateBuilder2.instance;
                    string.getClass();
                    amxiVar.b |= 1;
                    amxiVar.c = string;
                }
                String str = xvnVar.e;
                if (str != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    amxi amxiVar2 = (amxi) aihfVarCreateBuilder2.instance;
                    amxiVar2.b |= 2;
                    amxiVar2.d = str;
                }
                String str2 = xvnVar.f;
                if (str2 != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    amxi amxiVar3 = (amxi) aihfVarCreateBuilder2.instance;
                    amxiVar3.b |= 4;
                    amxiVar3.e = str2;
                }
                amxi amxiVar4 = (amxi) aihfVarCreateBuilder2.build();
                builder.copyOnWrite();
                amxj amxjVar4 = (amxj) builder.instance;
                amxiVar4.getClass();
                aiie aiieVar = amxjVar4.e;
                if (!aiieVar.c()) {
                    amxjVar4.e = aihn.mutableCopy(aiieVar);
                }
                amxjVar4.e.add(amxiVar4);
            }
            amxjVarArr[c] = (amxj) builder.build();
        }
        agke agkeVarP = agke.p(amxjVarArr);
        xrrVar.g += xrr.a;
        agqs agqsVarListIterator = agkeVarP.listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            if (((amxj) agqsVarListIterator.next()).d > 0) {
                aihf aihfVarCreateBuilder3 = amxk.a.createBuilder();
                long j = xrrVar.g;
                aihfVarCreateBuilder3.copyOnWrite();
                amxk amxkVar = (amxk) aihfVarCreateBuilder3.instance;
                amxkVar.b |= 1;
                amxkVar.c = j;
                aihfVarCreateBuilder3.copyOnWrite();
                amxk amxkVar2 = (amxk) aihfVarCreateBuilder3.instance;
                aiie aiieVar2 = amxkVar2.d;
                if (!aiieVar2.c()) {
                    amxkVar2.d = aihn.mutableCopy(aiieVar2);
                }
                aifs.addAll(agkeVarP, amxkVar2.d);
                xeu xeuVar = xrrVar.c;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder3, alot.MDX_ROUTE_DISTRIBUTION_SNAPSHOT);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                    return;
                }
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                amxk amxkVar3 = (amxk) aihfVarCreateBuilder3.build();
                amxkVar3.getClass();
                alouVar.d = amxkVar3;
                alouVar.c = 36;
                xeuVar.b((alou) alosVar.build());
                return;
            }
        }
    }
}

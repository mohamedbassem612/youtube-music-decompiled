package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abyo implements Runnable {
    final /* synthetic */ abyq a;

    public abyo(abyq abyqVar) {
        this.a = abyqVar;
    }

    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, java.util.Set] */
    @Override // java.lang.Runnable
    public final void run() {
        int iD;
        String str;
        taq.c();
        abyq abyqVar = this.a;
        wqi wqiVar = abyqVar.b;
        wqh wqhVarA = wqiVar.a();
        wqhVarA.r = abyqVar.c;
        wqhVarA.b = abyqVar.e.c;
        wqhVarA.o(abyqVar.f);
        wqhVarA.G(abyqVar.g);
        wqhVarA.F(abyqVar.m);
        abyp abypVar = abyqVar.d;
        abmt abmtVar = abyqVar.j;
        if (abmtVar.bU() && abypVar != null) {
            Iterator it = ((acfg) abypVar).B.d.iterator();
            while (it.hasNext()) {
                ((acii) it.next()).l();
            }
        }
        aazk aazkVar = abyqVar.n;
        if (aazkVar != null) {
            aihf aihfVarCreateBuilder = arev.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            arev arevVar = (arev) aihfVarCreateBuilder.instance;
            arevVar.b |= 1;
            arevVar.c = aazkVar.a;
            aihfVarCreateBuilder.copyOnWrite();
            arev arevVar2 = (arev) aihfVarCreateBuilder.instance;
            arevVar2.b |= 2;
            arevVar2.d = aazkVar.b;
            wqhVarA.c = (arev) aihfVarCreateBuilder.build();
        }
        if (abmtVar.g.m(376, 45774531L) && (str = abyqVar.k) != null) {
            wqhVarA.e(str);
        }
        try {
            alus alusVarB = wqiVar.b(wqhVarA);
            abmt abmtVar2 = abyqVar.j;
            vxz vxzVar = abmtVar2.g;
            if (vxzVar.l(79, 45422606L, false) && (alusVarB.b & 16) != 0 && abyqVar.i.io() != null) {
                abyqVar.a.post(afwl.i(new abwl(abyqVar, alusVarB, 2, null)));
                alvl alvlVar = alusVarB.d;
                if (alvlVar == null) {
                    alvlVar = alvl.a;
                }
                xeu xeuVar = abyqVar.h;
                aihf aihfVarCreateBuilder2 = alhc.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                alhc alhcVar = (alhc) aihfVarCreateBuilder2.instance;
                alhcVar.c = 4;
                alhcVar.b |= 1;
                aihfVarCreateBuilder2.copyOnWrite();
                alhc alhcVar2 = (alhc) aihfVarCreateBuilder2.instance;
                alhcVar2.d = 1;
                alhcVar2.b |= 2;
                if (alvlVar != null) {
                    aigj aigjVar = alvlVar.t;
                    aihfVarCreateBuilder2.copyOnWrite();
                    alhc alhcVar3 = (alhc) aihfVarCreateBuilder2.instance;
                    aigjVar.getClass();
                    alhcVar3.b |= 4;
                    alhcVar3.e = aigjVar;
                }
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder2, alot.HEARTBEAT_ACTION_PLAYER_TRANSITIONED);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                    return;
                }
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                alhc alhcVar4 = (alhc) aihfVarCreateBuilder2.build();
                alhcVar4.getClass();
                alouVar.d = alhcVar4;
                alouVar.c = 330;
                xeuVar.b((alou) alosVar.build());
                return;
            }
            abyqVar.m++;
            if ((alusVarB.b & 2) == 0) {
                abyqVar.g(null, 7);
                return;
            }
            alvl alvlVar2 = alusVarB.d;
            if (alvlVar2 == null) {
                alvlVar2 = alvl.a;
            }
            if (abmtVar2.bH()) {
                int i = alvlVar2.c;
                aony aonyVarA = aony.a(i);
                if (aonyVarA == null) {
                    aonyVarA = aony.OK;
                }
                aony aonyVar = aony.OK;
                if (aonyVarA != aonyVar && abypVar != null) {
                    aony aonyVarA2 = aony.a(i);
                    if (aonyVarA2 != null) {
                        aonyVar = aonyVarA2;
                    }
                    abyqVar.a.post(new abwl(abypVar, aonyVar, 3, null));
                }
            }
            if (aaje.q(alvlVar2)) {
                abyqVar.f();
                return;
            }
            int i2 = alvlVar2.c;
            aony aonyVarA3 = aony.a(i2);
            if (aonyVarA3 == null) {
                aonyVarA3 = aony.OK;
            }
            if (aonyVarA3 == aony.ERROR) {
                abyqVar.g(null, 7);
                return;
            }
            aony aonyVarA4 = aony.a(i2);
            if (aonyVarA4 == null) {
                aonyVarA4 = aony.OK;
            }
            int i3 = 9;
            if (aonyVarA4 == aony.UNPLAYABLE && (iD = agvp.D(alvlVar2.d)) != 0 && iD == 1001) {
                i3 = 17;
            }
            abyqVar.e(new aboe(i3, true, 1, alvlVar2.e, null, null, null, vxzVar.l(302, 45735140L, false) ? aaje.m(alvlVar2) : null), alvlVar2, false);
        } catch (wno e) {
            abyqVar.g(e, 8);
        }
    }
}

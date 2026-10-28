package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sdm {
    private static final sdl a = new sdl();
    private final mbc b;
    private final awmd c;
    private final vyo d;
    private final rnj e;
    private final rnj f;

    public sdm(mbc mbcVar, rnj rnjVar, rnj rnjVar2, awmd awmdVar, vyo vyoVar) {
        this.b = mbcVar;
        this.e = rnjVar;
        this.f = rnjVar2;
        this.c = awmdVar;
        this.d = vyoVar;
    }

    private final String c() {
        return this.e.e();
    }

    public final List a(wjf wjfVar) {
        int i;
        int i2;
        int iBi;
        int iBi2;
        List listH = wjfVar.H();
        if (listH == null || listH.isEmpty()) {
            return agpi.a;
        }
        PriorityQueue priorityQueue = new PriorityQueue(listH.size(), a);
        Iterator it = listH.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            aisu aisuVar = (aisu) it.next();
            int i3 = aisuVar.f;
            int iBi3 = a.bi(i3);
            if ((iBi3 == 0 || iBi3 != 3 || aisuVar.c <= 0) && (((iBi = a.bi(i3)) == 0 || iBi != 2) && ((iBi2 = a.bi(i3)) == 0 || iBi2 != 4))) {
                int iBi4 = a.bi(i3);
                if ((iBi4 != 0 ? iBi4 : 1) == 8) {
                }
            }
            priorityQueue.add(aisuVar);
        }
        if (priorityQueue.isEmpty()) {
            return agpi.a;
        }
        ArrayList arrayList = new ArrayList();
        while (!priorityQueue.isEmpty()) {
            aisu aisuVar2 = (aisu) priorityQueue.poll();
            wgj wgjVar = new wgj(aisuVar2);
            int iBi5 = a.bi(aisuVar2.f);
            if (iBi5 == 0 || iBi5 != 2) {
                i2 = i;
                i++;
            } else {
                i2 = 0;
            }
            arrayList.add(new skl(wgjVar, i2, wjfVar.R(), wjfVar.G(), c(), wjfVar.A(), wjfVar.ab()));
        }
        return agke.n(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    @Deprecated
    public final List b(skl sklVar, List list, wjf wjfVar) {
        alvt alvtVar;
        alvt alvtVar2;
        wjf wjiVar;
        ArrayList arrayList = new ArrayList();
        if (wjfVar.i() != null) {
            arrayList.add(new sgo(sklVar.e, sklVar.h, sklVar.g, sklVar.f, sklVar.d, c(), Long.MAX_VALUE, wjfVar.i()));
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            while (it.hasNext()) {
                aisv aisvVar = (aisv) it.next();
                wiu wiuVarF = wjfVar.f();
                String strC = c();
                wjb wjbVar = (wjb) this.c.io();
                long epochMilli = this.b.f().toEpochMilli();
                int i3 = i2 + 1;
                int i4 = aisvVar.b;
                smc snaVar = null;
                if ((i4 & 1) != 0) {
                    arcg arcgVar = aisvVar.c;
                    if (arcgVar == null) {
                        arcgVar = arcg.a;
                    }
                    aivg aivgVar = arcgVar.f;
                    if (aivgVar == null) {
                        aivgVar = aivg.a;
                    }
                    if (aivgVar.b.size() == 0) {
                        rnj rnjVar = this.f;
                        byte[] bArrG = arcgVar.e.G();
                        alvtVar = alvt.a;
                        alvtVar2 = (alvt) ((wjr) rnjVar.a).D(bArrG, alvtVar);
                        if (alvtVar2 == null) {
                            rmp.n(null, "AdBreakRenderer path ad playerResponse cannot be deserialized.");
                        } else {
                            alvtVar = alvtVar2;
                        }
                        wjiVar = new wji(alvtVar, 0L, wjbVar);
                    } else {
                        aivg aivgVar2 = arcgVar.f;
                        if (aivgVar2 == null) {
                            aivgVar2 = aivg.a;
                        }
                        wjiVar = sll.a(wjbVar, aivgVar2, wiuVarF);
                        if (wjiVar == null) {
                            rnj rnjVar2 = this.f;
                            byte[] bArrG2 = arcgVar.e.G();
                            alvtVar = alvt.a;
                            alvtVar2 = (alvt) ((wjr) rnjVar2.a).D(bArrG2, alvtVar);
                            if (alvtVar2 == null) {
                                rmp.n(null, "AdBreakRenderer path ad playerResponse cannot be deserialized.");
                            } else {
                                alvtVar = alvtVar2;
                            }
                            wjiVar = new wji(alvtVar, 0L, wjbVar);
                        }
                    }
                    arcg arcgVar2 = aisvVar.c;
                    if (arcgVar2 == null) {
                        arcgVar2 = arcg.a;
                    }
                    boolean zAZ = taq.aZ(this.d);
                    String str = sklVar.e;
                    byte[] bArr = sklVar.h;
                    String str2 = sklVar.g;
                    String str3 = sklVar.f;
                    boolean z = sklVar.d;
                    int i5 = i2;
                    skz skzVar = new skz(str, bArr, str2, str3, z, strC, skz.n(wjiVar, arcgVar2, epochMilli, z), arcgVar2, wjiVar, i5, zAZ, 0);
                    i = i3;
                    snaVar = skzVar;
                    i2 = i5;
                } else if ((i4 & 2) != 0) {
                    alam alamVar = aisvVar.d;
                    if (alamVar == null) {
                        alamVar = alam.a;
                    }
                    snaVar = new ski(sklVar, wiuVarF, strC, epochMilli, alamVar);
                    i = i3;
                } else if ((i4 & 4) != 0) {
                    aqfv aqfvVar = aisvVar.e;
                    if (aqfvVar == null) {
                        aqfvVar = aqfv.a;
                    }
                    aqfv aqfvVar2 = aqfvVar;
                    i = i3;
                    snaVar = new sna(sklVar.e, sklVar.h, sklVar.g, sklVar.f, sklVar.d, wiuVarF, strC, aqfvVar2, i2);
                } else {
                    i = i3;
                    rmp.n(null, "Received unsupported ad type, this should never happen.");
                }
                if (snaVar != null) {
                    arrayList.add(snaVar);
                    if (snaVar.l()) {
                        vyo vyoVar = this.d;
                        aizx aizxVar = vyoVar.b().o;
                        if (aizxVar == null) {
                            aizxVar = aizx.a;
                        }
                        if (aizxVar.J && (snaVar instanceof skz)) {
                            ((skz) snaVar).E();
                            String strC2 = c();
                            aizx aizxVar2 = vyoVar.b().o;
                            if (aizxVar2 == null) {
                                aizxVar2 = aizx.a;
                            }
                            i2 += 2;
                            boolean z2 = aizxVar2.I;
                            arrayList.add(new sgt(snaVar, strC2, i));
                        } else {
                            String strC3 = c();
                            aizx aizxVar3 = vyoVar.b().o;
                            if (aizxVar3 == null) {
                                aizxVar3 = aizx.a;
                            }
                            arrayList.add(new sgt(snaVar, strC3, aizxVar3.I));
                        }
                    }
                }
            }
            return arrayList;
        }
    }
}

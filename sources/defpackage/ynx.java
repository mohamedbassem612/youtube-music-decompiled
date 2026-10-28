package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ynx implements Runnable {
    final /* synthetic */ yny a;
    private boolean b = false;

    public ynx(yny ynyVar) {
        this.a = ynyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.security.Key] */
    /* JADX WARN: Type inference failed for: r15v1, types: [zgy] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, mbc] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str;
        yny ynyVar;
        ynw ynwVar;
        yny ynyVar2;
        elr elrVarB;
        cpf cpfVar;
        ynx ynxVar = this;
        if (ynxVar.b) {
            throw new IllegalStateException("Download task has already run");
        }
        ynxVar.b = true;
        yny ynyVar3 = ynxVar.a;
        ynz ynzVar = ynyVar3.e;
        ynzVar.d();
        int i = 0;
        while (true) {
            try {
                List list = ynyVar3.b;
                if (i >= list.size()) {
                    break;
                }
                try {
                    AtomicBoolean atomicBoolean = ynyVar3.g;
                    if (atomicBoolean.get()) {
                        break;
                    }
                    wgs wgsVar = (wgs) list.get(i);
                    ynzVar.f();
                    abqq abqqVar = ynyVar3.i;
                    wjf wjfVar = ynyVar3.a;
                    boolean zQ = wjfVar.Q();
                    jsk jskVar = (jsk) abqqVar.g.io();
                    ynw ynwVar2 = null;
                    if (jskVar == null) {
                        str = null;
                    } else {
                        cln clnVar = new cln(13);
                        ?? r13 = abqqVar.d;
                        ?? r15 = zQ ? abqqVar.c : abqqVar.i;
                        Object obj = abqqVar.b;
                        zjr zjrVar = (zjr) obj;
                        str = null;
                        ynwVar2 = new ynw(clnVar, jskVar, r13, r13, r15, new ynt(jskVar, (zjr) obj), abqqVar.e, abqqVar.j, (ygf) abqqVar.f, (tgr) abqqVar.a, (Optional) abqqVar.h, zjrVar, zQ);
                    }
                    ynyVar3.a(ynwVar2);
                    if (ynwVar2 == null) {
                        zhq zhqVar = zhq.ABR;
                        ynzVar.g();
                        ynzVar = ynzVar;
                        i = i;
                        ynyVar2 = ynyVar3;
                    } else {
                        ynwVar2.b = ynzVar;
                        if (ynzVar.e()) {
                            long j = ynyVar3.c;
                            long j2 = ynyVar3.d;
                            wiu wiuVarF = wjfVar.f();
                            if (wgsVar.ac()) {
                                ygf ygfVar = ynwVar2.a;
                                cix cixVarN = wgsVar.n(str);
                                taq.c();
                                bse bseVar = cixVarN.c;
                                String str2 = bseVar.p;
                                cpf cpfVar2 = new cpf((TextUtils.isEmpty(str2) || !txo.d(str2)) ? new daa() : new czc(), -1, null);
                                try {
                                    civ civVar = cixVarN.h;
                                    zkf.d(civVar);
                                    String str3 = ((cim) cixVarN.d.get(0)).a;
                                    civ civVarB = civVar.b(cixVarN.b, str3);
                                    zkf.d(civVarB);
                                    byh byhVar = new byh();
                                    byhVar.a = civVarB.a(str3);
                                    yny ynyVar4 = ynyVar3;
                                    long j3 = civVarB.a;
                                    byhVar.b = j3;
                                    byhVar.g = j3;
                                    byhVar.h = civVarB.b;
                                    byhVar.i = cixVarN.a;
                                    if (ygfVar.c.cI()) {
                                        ypp yppVarA = ypq.a();
                                        yppVarA.j(tok.MEDIA_CACHE_SEGMENT_MAP_LOADER);
                                        byhVar.k = yppVarA.a();
                                    }
                                    cpfVar = cpfVar2;
                                    try {
                                        new cpn(ygfVar.b.b(wiuVarF), byhVar.a(), bseVar, 0, null, cpfVar).b();
                                        cuz cuzVarA = cpfVar.a();
                                        cpfVar.c();
                                        if (cuzVarA == null) {
                                            zhr.d(zhq.CACHE, "Segment does not contain a SegmentNumber.");
                                        }
                                        elrVarB = elr.J(cuzVarA);
                                        ynyVar = ynyVar4;
                                    } catch (Throwable th) {
                                        th = th;
                                        cpfVar.c();
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cpfVar = cpfVar2;
                                }
                            } else {
                                ynyVar = ynyVar3;
                                elrVarB = ynwVar2.a.b(wgsVar.j(), TimeUnit.MILLISECONDS.toMicros(wgsVar.d));
                            }
                            long j4 = wgsVar.d;
                            if (j4 <= 0 || elrVarB == null) {
                                ynwVar = ynwVar2;
                            } else {
                                long jMin = Math.min(j2, j4 - j);
                                long j5 = j != 0 ? ((cuz) elrVarB.a).b(TimeUnit.MILLISECONDS.toMicros(j)).a.c : 0L;
                                int iD = elrVarB.D(TimeUnit.MILLISECONDS.toMicros(j + jMin) - 1);
                                ynwVar = ynwVar2;
                                ynwVar.b(wgsVar, j5, (elrVarB.H()[iD] + ((long) elrVarB.F()[iD])) - j5, wiuVarF, null, null, null);
                            }
                            if (ynwVar.c) {
                                zhq zhqVar2 = zhq.ABR;
                                atomicBoolean.set(true);
                            }
                        } else {
                            ynyVar = ynyVar3;
                            ynzVar = ynzVar;
                            i = i;
                            ynwVar = ynwVar2;
                            zhq zhqVar3 = zhq.ABR;
                            atomicBoolean.set(true);
                        }
                        ynwVar.b = null;
                        ynyVar2 = ynyVar;
                        ynyVar2.a(null);
                    }
                    yny ynyVar5 = ynyVar2;
                    i++;
                    ynyVar3 = ynyVar5;
                    ynxVar = this;
                    ynzVar = ynzVar;
                } catch (IOException e) {
                    e = e;
                    ynxVar = this;
                    zhq zhqVar4 = zhq.CACHE;
                    yny ynyVar6 = ynxVar.a;
                    zhr.c(zhqVar4, e, "Failed to download video (IOException): %s", ynyVar6.a.G());
                    ynyVar6.e.g();
                    return;
                } catch (IllegalStateException e2) {
                    e = e2;
                    ynxVar = this;
                    zhq zhqVar5 = zhq.CACHE;
                    yny ynyVar7 = ynxVar.a;
                    zhr.c(zhqVar5, e, "Failed to download video (IllegalStateException): %s", ynyVar7.a.G());
                    ynyVar7.e.g();
                    return;
                } catch (InterruptedException e3) {
                    e = e3;
                    ynxVar = this;
                    zhq zhqVar6 = zhq.CACHE;
                    yny ynyVar8 = ynxVar.a;
                    zhr.c(zhqVar6, e, "Failed to download video (InterruptedException): %s", ynyVar8.a.G());
                    ynyVar8.e.g();
                    return;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (IllegalStateException e5) {
                e = e5;
            } catch (InterruptedException e6) {
                e = e6;
            }
        }
        yny ynyVar9 = this.a;
        if (ynyVar9.g.get()) {
            ynyVar9.e.a();
        } else {
            ynyVar9.e.b();
        }
    }
}

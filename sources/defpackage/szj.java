package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class szj implements Runnable {
    final long a;
    final /* synthetic */ szn b;

    public szj(szn sznVar, long j) {
        this.b = sznVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        szg szgVar;
        szn sznVar = this.b;
        sznVar.b(this.a);
        long jB = sznVar.b.b();
        while (true) {
            AtomicReference atomicReference = sznVar.a;
            szgVar = (szg) atomicReference.get();
            if (szgVar.c) {
                szgVar = null;
                break;
            } else if (a.av(atomicReference, szgVar, szn.g(szgVar, jB))) {
                szn.i(szgVar);
                break;
            }
        }
        if (szgVar != null) {
            sznVar.h++;
            szg szgVarA = sznVar.a(szgVar);
            do {
                Consumer consumer = sznVar.f;
                if (consumer == null) {
                    szg szgVar2 = szgVarA;
                    while (true) {
                        if (szgVar2 == null) {
                            consumer = null;
                            break;
                        } else {
                            if (szgVar2 instanceof szm) {
                                consumer = ((szm) szgVar2).e;
                                break;
                            }
                            szgVar2 = szgVar2.d;
                        }
                    }
                    if (consumer != null) {
                        sznVar.f = consumer;
                        sznVar.i++;
                        try {
                            consumer.r(new szi(szgVarA));
                        } catch (RuntimeException e) {
                            sznVar.c.execute(afwl.i(new szq(e, 1)));
                        }
                    }
                } else {
                    sznVar.i++;
                    consumer.r(new szi(szgVarA));
                }
                long jB2 = sznVar.b.b();
                while (true) {
                    AtomicReference atomicReference2 = sznVar.a;
                    szg szgVar3 = (szg) atomicReference2.get();
                    boolean z = szgVar3 instanceof szk;
                    long j = szgVar3.b;
                    boolean z2 = j == -3;
                    if (z) {
                        if (z2) {
                            synchronized (sznVar) {
                                sznVar.g = true;
                                sznVar.notifyAll();
                            }
                        }
                        szgVarA = null;
                        break;
                    }
                    if (z2 || j < ((long) sznVar.d) + jB2) {
                        if (a.av(atomicReference2, szgVar3, szn.g(szgVar3, jB2)) && (szgVarA = sznVar.a(szgVar3)) != null) {
                            szn.i(szgVarA);
                            break;
                        }
                    }
                    szh szhVar = new szh(1073741825);
                    sznVar.f(szhVar, szgVar3, jB2);
                    szhVar.c = false;
                    if (a.av(atomicReference2, szgVar3, szhVar)) {
                        if (!z) {
                            sznVar.e(szhVar, jB2);
                        }
                        szn.i(szhVar);
                        szgVarA = null;
                        break;
                        break;
                    }
                }
            } while (szgVarA != null);
        }
    }
}

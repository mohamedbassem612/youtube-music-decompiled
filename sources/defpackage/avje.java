package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avje implements avdw {
    final avjf a;
    public final /* synthetic */ avjh b;

    public avje(avjh avjhVar, avjf avjfVar) {
        this.b = avjhVar;
        this.a = avjfVar;
    }

    private static final Integer b(avbe avbeVar) {
        String str = (String) avbeVar.b(avjh.b);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // defpackage.avdw
    public final void a(Status status, avdv avdvVar, avbe avbeVar) {
        int i;
        int i2;
        avjb avjbVar;
        String string;
        avjh avjhVar = this.b;
        synchronized (avjhVar.m) {
            avjd avjdVar = avjhVar.r;
            avjf avjfVar = this.a;
            avjfVar.b = true;
            Collection collection = avjdVar.c;
            if (collection.contains(avjfVar)) {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.remove(avjfVar);
                avjdVar = new avjd(avjdVar.b, DesugarCollections.unmodifiableCollection(arrayList), avjdVar.d, avjdVar.f, avjdVar.g, avjdVar.a, avjdVar.h, avjdVar.e);
            }
            avjhVar.r = avjdVar;
            avjhVar.q.a(status.getCode());
        }
        avjh avjhVar2 = this.b;
        if (avjhVar2.u.decrementAndGet() == Integer.MIN_VALUE) {
            avjhVar2.h.execute(new avgv(this, 14));
            return;
        }
        avjf avjfVar2 = this.a;
        if (avjfVar2.c) {
            avjhVar2.d(avjfVar2);
            if (avjhVar2.r.f == avjfVar2) {
                avjhVar2.q(status, avdvVar, avbeVar);
                return;
            }
            return;
        }
        avdv avdvVar2 = avdv.d;
        if (avdvVar == avdvVar2 && avjhVar2.t.incrementAndGet() > 1000) {
            avjhVar2.d(avjfVar2);
            if (avjhVar2.r.f == avjfVar2) {
                Status.Code code = Status.Code.INTERNAL;
                avbb avbbVar = avfp.a;
                Status statusA = code.a();
                if (status.getDescription() == null) {
                    string = status.getCode().toString();
                } else {
                    string = status.getCode().toString() + ": " + status.getDescription();
                }
                avjhVar2.q(statusA.withDescription("Too many transparent retries. Might be a bug in gRPC: ".concat(String.valueOf(string))).c(status.p), avdvVar, avbeVar);
                return;
            }
            return;
        }
        if (avjhVar2.r.f == null) {
            if (avdvVar == avdvVar2 || (avdvVar == avdv.b && avjhVar2.s.compareAndSet(false, true))) {
                avjh avjhVar3 = this.b;
                avjf avjfVar3 = this.a;
                avjf avjfVarB = avjhVar3.b(avjfVar3.d, true, false);
                if (avjfVarB != null) {
                    if (avjhVar3.l) {
                        synchronized (avjhVar3.m) {
                            avjd avjdVar2 = avjhVar3.r;
                            ArrayList arrayList2 = new ArrayList(avjdVar2.d);
                            arrayList2.remove(avjfVar3);
                            arrayList2.add(avjfVarB);
                            avjhVar3.r = new avjd(avjdVar2.b, avjdVar2.c, DesugarCollections.unmodifiableCollection(arrayList2), avjdVar2.f, avjdVar2.g, avjdVar2.a, avjdVar2.h, avjdVar2.e);
                        }
                    }
                    this.b.g.execute(new aves(this, avjfVarB, 15, (short[]) null));
                    return;
                }
                return;
            }
            if (avdvVar != avdv.c) {
                avjhVar2.s.set(true);
                if (avjhVar2.l) {
                    Integer numB = b(avbeVar);
                    avjh avjhVar4 = this.b;
                    boolean zContains = avjhVar4.k.c.contains(status.getCode());
                    avjg avjgVar = avjhVar4.p;
                    boolean z = (avjgVar == null || (!zContains && (numB == null || numB.intValue() >= 0))) ? false : !avjgVar.b();
                    if (zContains && !z && !status.e() && numB != null && numB.intValue() > 0) {
                        numB = 0;
                    }
                    boolean z2 = zContains && !z;
                    if (z2 && numB != null) {
                        if (numB.intValue() < 0) {
                            avjhVar4.p();
                        } else {
                            Object obj = avjhVar4.m;
                            synchronized (obj) {
                                avjb avjbVar2 = avjhVar4.y;
                                if (avjbVar2 != null) {
                                    Future futureA = avjbVar2.a();
                                    avjb avjbVar3 = new avjb(obj);
                                    avjhVar4.y = avjbVar3;
                                    if (futureA != null) {
                                        futureA.cancel(false);
                                    }
                                    avjbVar3.b(avjhVar4.i.schedule(new awim(avjhVar4, avjbVar3, 1), numB.intValue(), TimeUnit.MILLISECONDS));
                                }
                            }
                        }
                    }
                    avjh avjhVar5 = this.b;
                    synchronized (avjhVar5.m) {
                        avjd avjdVar3 = avjhVar5.r;
                        avjf avjfVar4 = this.a;
                        ArrayList arrayList3 = new ArrayList(avjdVar3.d);
                        arrayList3.remove(avjfVar4);
                        avjhVar5.r = new avjd(avjdVar3.b, avjdVar3.c, DesugarCollections.unmodifiableCollection(arrayList3), avjdVar3.f, avjdVar3.g, avjdVar3.a, avjdVar3.h, avjdVar3.e);
                        if (z2 && (avjhVar5.w(avjhVar5.r) || !avjhVar5.r.d.isEmpty())) {
                            return;
                        }
                    }
                } else {
                    avji avjiVar = avjhVar2.j;
                    long j = 0;
                    if (avjiVar == null) {
                        i2 = 0;
                        i = 1;
                    } else {
                        boolean zContains2 = avjiVar.f.contains(status.getCode());
                        Integer numB2 = b(avbeVar);
                        avjg avjgVar2 = avjhVar2.p;
                        boolean z3 = (avjgVar2 == null || (!zContains2 && (numB2 == null || numB2.intValue() >= 0))) ? false : !avjgVar2.b();
                        if (avjiVar.a <= avjfVar2.d + 1 || z3) {
                            i = 1;
                            i2 = 0;
                        } else {
                            if (numB2 == null) {
                                if (zContains2) {
                                    long j2 = avjhVar2.z;
                                    double dNextDouble = avjh.e ? (avjh.d.nextDouble() * 0.4d) + 0.8d : avjh.d.nextDouble();
                                    i = 1;
                                    avjhVar2.z = Math.min((long) (avjhVar2.z * avjiVar.d), avjiVar.c);
                                    j = (long) (j2 * dNextDouble);
                                }
                                i = 1;
                                i2 = 0;
                            } else {
                                i = 1;
                                if (numB2.intValue() >= 0) {
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(numB2.intValue());
                                    avjhVar2.z = avjiVar.b;
                                    j = nanos;
                                } else {
                                    i2 = 0;
                                }
                            }
                            i2 = i;
                        }
                    }
                    if (i2 != 0) {
                        avjf avjfVarB2 = avjhVar2.b(avjfVar2.d + i, false, false);
                        if (avjfVarB2 != null) {
                            Object obj2 = avjhVar2.m;
                            synchronized (obj2) {
                                avjbVar = new avjb(obj2);
                                avjhVar2.x = avjbVar;
                            }
                            avjbVar.b(this.b.i.schedule(new atvv(this, avjbVar, avjfVarB2, 5), j, TimeUnit.NANOSECONDS));
                            return;
                        }
                        return;
                    }
                }
            } else if (avjhVar2.l) {
                avjhVar2.p();
            }
        }
        avjh avjhVar6 = this.b;
        avjf avjfVar5 = this.a;
        avjhVar6.d(avjfVar5);
        if (avjhVar6.r.f == avjfVar5) {
            avjhVar6.q(status, avdvVar, avbeVar);
        }
    }

    @Override // defpackage.avdw
    public final void c(avbe avbeVar) {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        avjf avjfVar = this.a;
        int i3 = avjfVar.d;
        if (i3 > 0) {
            avbb avbbVar = avjh.a;
            avbeVar.c(avbbVar);
            avbeVar.e(avbbVar, String.valueOf(i3));
        }
        avjh avjhVar = this.b;
        avjhVar.d(avjfVar);
        if (avjhVar.r.f == avjfVar) {
            avjg avjgVar = avjhVar.p;
            if (avjgVar != null) {
                do {
                    atomicInteger = avjgVar.d;
                    i = atomicInteger.get();
                    i2 = avjgVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, Math.min(avjgVar.c + i, i2)));
            }
            avjhVar.h.execute(new aves(this, avbeVar, 13));
        }
    }

    @Override // defpackage.avkb
    public final void d() {
        avjh avjhVar = this.b;
        if (avjhVar.o()) {
            avjhVar.h.execute(new avgv(this, 15));
        }
    }

    @Override // defpackage.avkb
    public final void e(auym auymVar) {
        avjh avjhVar = this.b;
        avjf avjfVar = avjhVar.r.f;
        ahno.P(avjfVar != null, "Headers should be received prior to messages.");
        if (avjfVar != this.a) {
            avfp.h(auymVar);
        } else {
            avjhVar.h.execute(new aves(this, auymVar, 16));
        }
    }
}

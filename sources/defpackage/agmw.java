package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class agmw extends ReentrantLock {
    final agnw a;
    volatile int b;
    int c;
    int d;
    volatile AtomicReferenceArray e;
    final AtomicInteger f;

    public agmw(agnw agnwVar, int i) {
        this.f = new AtomicInteger();
        this.a = agnwVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.d = (atomicReferenceArray.length() * 3) / 4;
        this.e = atomicReferenceArray;
    }

    static boolean m(agms agmsVar) {
        return agmsVar.d() == null;
    }

    static final void n(ReferenceQueue referenceQueue) {
        while (referenceQueue.poll() != null) {
        }
    }

    final agms a(agms agmsVar, agms agmsVar2) {
        return this.a.g.a(this, agmsVar, agmsVar2);
    }

    public final agms b(Object obj, int i) {
        if (this.b != 0) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            for (agms agmsVarB = (agms) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); agmsVarB != null; agmsVarB = agmsVarB.b()) {
                if (agmsVarB.a() == i) {
                    Object objC = agmsVarB.c();
                    if (objC == null) {
                        l();
                    } else if (this.a.f.c(obj, objC)) {
                        return agmsVarB;
                    }
                }
            }
        }
        return null;
    }

    final agms c(agms agmsVar, agms agmsVar2) {
        int i = this.b;
        agms agmsVarB = agmsVar2.b();
        while (agmsVar != agmsVar2) {
            agms agmsVarA = a(agmsVar, agmsVarB);
            if (agmsVarA != null) {
                agmsVarB = agmsVarA;
            } else {
                i--;
            }
            agmsVar = agmsVar.b();
        }
        this.b = i;
        return agmsVarB;
    }

    final Object d(Object obj, int i, Object obj2, boolean z) {
        Object obj3;
        lock();
        try {
            j();
            int i2 = this.b + 1;
            if (i2 > this.d) {
                AtomicReferenceArray atomicReferenceArray = this.e;
                int length = atomicReferenceArray.length();
                if (length < 1073741824) {
                    int i3 = this.b;
                    AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
                    this.d = (atomicReferenceArray2.length() * 3) / 4;
                    int length2 = atomicReferenceArray2.length() - 1;
                    for (int i4 = 0; i4 < length; i4++) {
                        agms agmsVarB = (agms) atomicReferenceArray.get(i4);
                        if (agmsVarB != null) {
                            agms agmsVarB2 = agmsVarB.b();
                            int iA = agmsVarB.a() & length2;
                            if (agmsVarB2 == null) {
                                atomicReferenceArray2.set(iA, agmsVarB);
                            } else {
                                agms agmsVar = agmsVarB;
                                while (agmsVarB2 != null) {
                                    int iA2 = agmsVarB2.a() & length2;
                                    if (iA2 != iA) {
                                        agmsVar = agmsVarB2;
                                        iA = iA2;
                                    }
                                    agmsVarB2 = agmsVarB2.b();
                                }
                                atomicReferenceArray2.set(iA, agmsVar);
                                while (agmsVarB != agmsVar) {
                                    int iA3 = agmsVarB.a() & length2;
                                    agms agmsVarA = a(agmsVarB, (agms) atomicReferenceArray2.get(iA3));
                                    if (agmsVarA != null) {
                                        atomicReferenceArray2.set(iA3, agmsVarA);
                                    } else {
                                        i3--;
                                    }
                                    agmsVarB = agmsVarB.b();
                                }
                            }
                        }
                    }
                    this.e = atomicReferenceArray2;
                    this.b = i3;
                }
                i2 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray3 = this.e;
            int length3 = (atomicReferenceArray3.length() - 1) & i;
            agms agmsVar2 = (agms) atomicReferenceArray3.get(length3);
            agms agmsVarB3 = agmsVar2;
            while (true) {
                obj3 = null;
                if (agmsVarB3 == null) {
                    this.c++;
                    agms agmsVarB4 = this.a.g.b(this, obj, i, agmsVar2);
                    k(agmsVarB4, obj2);
                    atomicReferenceArray3.set(length3, agmsVarB4);
                    this.b = i2;
                    break;
                }
                Object objC = agmsVarB3.c();
                if (agmsVarB3.a() == i && objC != null && this.a.f.c(obj, objC)) {
                    Object objD = agmsVarB3.d();
                    if (objD != null) {
                        if (!z) {
                            this.c++;
                            k(agmsVarB3, obj2);
                        }
                        obj3 = objD;
                        break;
                    }
                    this.c++;
                    k(agmsVarB3, obj2);
                    this.b = this.b;
                    break;
                }
                agmsVarB3 = agmsVarB3.b();
            }
            return obj3;
        } finally {
            unlock();
        }
    }

    final void e(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            agnw agnwVar = this.a;
            agms agmsVar = (agms) objPoll;
            int iA = agmsVar.a();
            agmw agmwVarC = agnwVar.c(iA);
            agmwVarC.lock();
            try {
                int i2 = agmwVarC.b;
                AtomicReferenceArray atomicReferenceArray = agmwVarC.e;
                int length = iA & (atomicReferenceArray.length() - 1);
                agms agmsVar2 = (agms) atomicReferenceArray.get(length);
                for (agms agmsVarB = agmsVar2; agmsVarB != null; agmsVarB = agmsVarB.b()) {
                    if (agmsVarB == agmsVar) {
                        agmwVarC.c++;
                        agms agmsVarC = agmwVarC.c(agmsVar2, agmsVarB);
                        int i3 = agmwVarC.b - 1;
                        atomicReferenceArray.set(length, agmsVarC);
                        agmwVarC.b = i3;
                        break;
                    }
                }
                agmwVarC.unlock();
                i++;
            } catch (Throwable th) {
                agmwVarC.unlock();
                throw th;
            }
        } while (i != 16);
    }

    final void f(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            agnw agnwVar = this.a;
            agnt agntVar = (agnt) objPoll;
            agms agmsVarA = agntVar.a();
            int iA = agmsVarA.a();
            agmw agmwVarC = agnwVar.c(iA);
            Object objC = agmsVarA.c();
            agmwVarC.lock();
            try {
                int i2 = agmwVarC.b;
                AtomicReferenceArray atomicReferenceArray = agmwVarC.e;
                int length = (atomicReferenceArray.length() - 1) & iA;
                agms agmsVar = (agms) atomicReferenceArray.get(length);
                for (agms agmsVarB = agmsVar; agmsVarB != null; agmsVarB = agmsVarB.b()) {
                    Object objC2 = agmsVarB.c();
                    if (agmsVarB.a() == iA && objC2 != null && agmwVarC.a.f.c(objC, objC2)) {
                        if (((agns) agmsVarB).e() != agntVar) {
                            break;
                        }
                        agmwVarC.c++;
                        agms agmsVarC = agmwVarC.c(agmsVar, agmsVarB);
                        int i3 = agmwVarC.b - 1;
                        atomicReferenceArray.set(length, agmsVarC);
                        agmwVarC.b = i3;
                        break;
                    }
                }
                agmwVarC.unlock();
                i++;
            } catch (Throwable th) {
                agmwVarC.unlock();
                throw th;
            }
        } while (i != 16);
    }

    final void i() {
        if ((this.f.incrementAndGet() & 63) == 0) {
            j();
        }
    }

    final void j() {
        if (tryLock()) {
            try {
                h();
                this.f.set(0);
            } finally {
                unlock();
            }
        }
    }

    final void k(agms agmsVar, Object obj) {
        this.a.g.f(this, agmsVar, obj);
    }

    final void l() {
        if (tryLock()) {
            try {
                h();
            } finally {
                unlock();
            }
        }
    }

    public void g() {
    }

    public void h() {
    }

    public agmw(agnw agnwVar, int i, byte[] bArr) {
        this(agnwVar, i);
    }

    public agmw(agnw agnwVar, int i, char[] cArr) {
        this(agnwVar, i);
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class avwd extends AtomicReference {
    private static final long serialVersionUID = 2346567790059478686L;
    avwf a;
    int b;
    long c;

    public avwd() {
        avwf avwfVar = new avwf(null, 0L);
        this.a = avwfVar;
        set(avwfVar);
    }

    final void a(avwf avwfVar) {
        this.a.set(avwfVar);
        this.a = avwfVar;
        this.b++;
    }

    public final void b(avwe avweVar) {
        Object obj;
        avwf avwfVar;
        synchronized (avweVar) {
            if (avweVar.e) {
                avweVar.f = true;
                return;
            }
            avweVar.e = true;
            while (!avweVar.f()) {
                long j = avweVar.get();
                Object obj2 = avweVar.c;
                if (obj2 == null) {
                    obj = obj2;
                    avwf avwfVar2 = (avwf) get();
                    avweVar.c = avwfVar2;
                    atqp.B(avweVar.d, avwfVar2.b);
                    obj = avwfVar2;
                }
                obj = obj2;
                long j2 = j;
                long j3 = 0;
                Object obj3 = obj;
                while (j2 != 0 && (avwfVar = (avwf) ((avwf) obj3).get()) != null) {
                    Object obj4 = avwfVar.a;
                    try {
                        axsp axspVar = avweVar.b;
                        if (obj4 == awkl.COMPLETE) {
                            axspVar.kn();
                        } else if (obj4 instanceof awkj) {
                            axspVar.b(((awkj) obj4).a);
                        } else {
                            axspVar.kk(obj4);
                            j3++;
                            j2--;
                            if (avweVar.f()) {
                                avweVar.c = null;
                                return;
                            }
                            obj3 = avwfVar;
                        }
                        avweVar.c = null;
                        return;
                    } catch (Throwable th) {
                        avkz.a(th);
                        avweVar.c = null;
                        avweVar.dispose();
                        if ((obj4 instanceof awkj) || obj4 == awkl.COMPLETE) {
                            return;
                        }
                        avweVar.b.b(th);
                        return;
                    }
                }
                if (j3 != 0) {
                    avweVar.c = obj3;
                    if (j != Long.MAX_VALUE) {
                        atqp.G(avweVar, j3);
                    }
                }
                synchronized (avweVar) {
                    if (!avweVar.f) {
                        avweVar.e = false;
                        return;
                    }
                    avweVar.f = false;
                }
            }
            avweVar.c = null;
        }
    }

    final void c() {
        avwf avwfVar = (avwf) get();
        if (avwfVar.a != null) {
            avwf avwfVar2 = new avwf(null, 0L);
            avwfVar2.lazySet((avwf) avwfVar.get());
            set(avwfVar2);
        }
    }

    public void d() {
    }
}

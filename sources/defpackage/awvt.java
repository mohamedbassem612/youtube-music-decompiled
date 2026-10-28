package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awvt extends awvo implements awvb {
    private final awto a;
    public final awtr c;
    public final awtr d;

    public awvt() {
        awts awtsVar = awts.a;
        this.c = new awtr(null, awtsVar);
        this.d = new awtr(null, awtsVar);
        this.a = new awto(false, awtsVar);
    }

    private final void y() {
        axee axeeVarD;
        awvs awvsVar = (awvs) this.d.a;
        if (awvsVar == null || awvsVar.g()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (awvsVar) {
                axee axeeVarB = awvsVar.b();
                axeeVarD = null;
                if (axeeVarB != null) {
                    awvr awvrVar = (awvr) axeeVarB;
                    if (jNanoTime - awvrVar.b >= 0 && z(awvrVar)) {
                        axeeVarD = awvsVar.d(0);
                    }
                }
            }
        } while (((awvr) axeeVarD) != null);
    }

    private final boolean z(Runnable runnable) {
        while (true) {
            awtr awtrVar = this.c;
            Object obj = awtrVar.a;
            if (w()) {
                return false;
            }
            int iG = awuw.g(obj);
            if (iG != -1) {
                if (iG == 0) {
                    obj.getClass();
                    axdr axdrVar = (axdr) obj;
                    int iA = axdrVar.a(runnable);
                    if (iA == 0) {
                        return true;
                    }
                    if (iA != 1) {
                        return false;
                    }
                    awtrVar.d(obj, axdrVar.c());
                } else {
                    if (obj == awvu.b) {
                        return false;
                    }
                    axdr axdrVar2 = new axdr(8, true);
                    obj.getClass();
                    axdrVar2.a((Runnable) obj);
                    axdrVar2.a(runnable);
                    if (awtrVar.d(obj, axdrVar2)) {
                        return true;
                    }
                }
            } else if (awtrVar.d(null, runnable)) {
                return true;
            }
        }
    }

    @Override // defpackage.awuq
    public final void a(awou awouVar, Runnable runnable) {
        j(runnable);
    }

    public /* bridge */ awvk c(long j, Runnable runnable, awou awouVar) {
        return awuy.a.c(j, runnable, awouVar);
    }

    @Override // defpackage.awvb
    public final void d(long j, awuc awucVar) {
        long jA = awvu.a(j);
        if (jA < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            awvp awvpVar = new awvp(this, jA + jNanoTime, awucVar);
            v(jNanoTime, awvpVar);
            ((awud) awucVar).x(new awvl(awvpVar, 0));
        }
    }

    public void j(Runnable runnable) {
        y();
        if (z(runnable)) {
            t();
        } else {
            awux.a.j(runnable);
        }
    }

    @Override // defpackage.awvo
    public void l() {
        axee axeeVarD;
        ThreadLocal threadLocal = awxh.a;
        awxh.a.set(null);
        this.a.c();
        boolean z = awuv.a;
        while (true) {
            awtr awtrVar = this.c;
            Object obj = awtrVar.a;
            int iG = awuw.g(obj);
            if (iG != -1) {
                if (iG == 0) {
                    ((axdr) obj).d();
                    break;
                } else {
                    if (obj == awvu.b) {
                        break;
                    }
                    axdr axdrVar = new axdr(8, true);
                    obj.getClass();
                    axdrVar.a((Runnable) obj);
                    if (awtrVar.d(obj, axdrVar)) {
                        break;
                    }
                }
            } else if (awtrVar.d(null, awvu.b)) {
                break;
            }
        }
        while (m() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            awvs awvsVar = (awvs) this.d.a;
            if (awvsVar == null) {
                return;
            }
            synchronized (awvsVar) {
                axeeVarD = awvsVar.a() > 0 ? awvsVar.d(0) : null;
            }
            awvr awvrVar = (awvr) axeeVarD;
            if (awvrVar == null) {
                return;
            } else {
                k(jNanoTime, awvrVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.awvo
    public final long m() {
        Runnable runnable;
        awvs awvsVar;
        awvr awvrVar;
        long jNanoTime;
        if (s()) {
            return 0L;
        }
        y();
        awtr awtrVar = this.c;
        while (true) {
            Object obj = awtrVar.a;
            int iG = awuw.g(obj);
            runnable = null;
            if (iG == -1) {
                break;
            }
            if (iG == 0) {
                obj.getClass();
                axdr axdrVar = (axdr) obj;
                Object objB = axdrVar.b();
                if (objB != axdr.a) {
                    runnable = (Runnable) objB;
                    break;
                }
                awtrVar.d(obj, axdrVar.c());
            } else {
                if (obj == awvu.b) {
                    break;
                }
                if (awtrVar.d(obj, null)) {
                    obj.getClass();
                    runnable = (Runnable) obj;
                    break;
                }
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        awnm awnmVar = this.b;
        if (((awnmVar == null || awnmVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = awtrVar.a;
        if (obj2 == null) {
            awvsVar = (awvs) this.d.a;
            if (awvsVar != null && (awvrVar = (awvr) awvsVar.c()) != null) {
                jNanoTime = awvrVar.b - System.nanoTime();
                if (jNanoTime >= 0) {
                    return jNanoTime;
                }
                return 0L;
            }
        } else if (obj2 instanceof axdr) {
            if (!((axdr) obj2).e()) {
                return 0L;
            }
            awvsVar = (awvs) this.d.a;
            if (awvsVar != null) {
                jNanoTime = awvrVar.b - System.nanoTime();
                if (jNanoTime >= 0) {
                    return jNanoTime;
                }
                return 0L;
            }
        } else if (obj2 != awvu.b) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    protected final awvk u(long j, Runnable runnable) {
        long jA = awvu.a(j);
        if (jA >= 4611686018427387903L) {
            return awwr.a;
        }
        long jNanoTime = System.nanoTime();
        awvq awvqVar = new awvq(jA + jNanoTime, runnable);
        v(jNanoTime, awvqVar);
        return awvqVar;
    }

    public final void v(long j, awvr awvrVar) {
        if (!w()) {
            awtr awtrVar = this.d;
            awvs awvsVar = (awvs) awtrVar.a;
            if (awvsVar == null) {
                awtrVar.d(null, new awvs(j));
                Object obj = awtrVar.a;
                obj.getClass();
                awvsVar = (awvs) obj;
            }
            synchronized (awvrVar) {
                if (awvrVar._heap == awvu.a) {
                    return;
                }
                synchronized (awvsVar) {
                    awvr awvrVar2 = (awvr) awvsVar.b();
                    if (!w()) {
                        if (awvrVar2 == null) {
                            awvsVar.a = j;
                        } else {
                            long j2 = awvrVar2.b;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            long j3 = awvsVar.a;
                            if (j - j3 > 0) {
                                awvsVar.a = j;
                            } else {
                                j = j3;
                            }
                        }
                        if (awvrVar.b - j < 0) {
                            awvrVar.b = j;
                        }
                        boolean z = awuv.a;
                        awvrVar.d(awvsVar);
                        axee[] axeeVarArr = awvsVar.b;
                        if (axeeVarArr == null) {
                            axeeVarArr = new axee[4];
                            awvsVar.b = axeeVarArr;
                        } else if (awvsVar.a() >= axeeVarArr.length) {
                            Object[] objArrCopyOf = Arrays.copyOf(axeeVarArr, awvsVar.a() << 1);
                            objArrCopyOf.getClass();
                            axeeVarArr = (axee[]) objArrCopyOf;
                            awvsVar.b = axeeVarArr;
                        }
                        int iA = awvsVar.a();
                        awvsVar.e(iA + 1);
                        axeeVarArr[iA] = awvrVar;
                        awvrVar.e(iA);
                        awvsVar.f(iA);
                        awvs awvsVar2 = (awvs) awtrVar.a;
                        if ((awvsVar2 != null ? (awvr) awvsVar2.c() : null) == awvrVar) {
                            t();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        k(j, awvrVar);
    }

    public final boolean w() {
        return this.a.a();
    }

    protected final boolean x() {
        if (!r()) {
            return false;
        }
        awvs awvsVar = (awvs) this.d.a;
        if (awvsVar != null && !awvsVar.g()) {
            return false;
        }
        Object obj = this.c.a;
        int iG = awuw.g(obj);
        if (iG != -1) {
            if (iG == 0) {
                return ((axdr) obj).e();
            }
            if (obj != awvu.b) {
                return false;
            }
        }
        return true;
    }
}

package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class qtg {
    final Object a;
    public final String b;
    public final qte[] c;
    HashMap d;
    public int e;
    private final awmd f;
    private boolean g = true;

    public qtg(String str, awmd awmdVar, qte... qteVarArr) {
        this.b = str;
        this.c = qteVarArr;
        int length = qteVarArr.length;
        HashMap map = new HashMap(length > 0 ? 10 : 1);
        this.d = map;
        if (length == 0) {
            map.put(qsy.b, a());
        }
        this.e = 0;
        this.f = awmdVar;
        this.a = new Object();
    }

    public abstract qsz a();

    public final void c() {
        this.g = false;
    }

    protected final void d(Object obj, qsy qsyVar) {
        synchronized (this.a) {
            qsz qszVarA = (qsz) this.d.get(qsyVar);
            if (qszVarA == null) {
                qszVarA = a();
                this.d.put(qsyVar, qszVarA);
            }
            qszVarA.b(obj);
            this.e++;
        }
        qth qthVar = ((qti) this.f).a;
        if (qthVar != null) {
            qtl qtlVar = (qtl) qthVar;
            if (qtlVar.e) {
                int i = 17;
                if (qtlVar.c > 0) {
                    AtomicLong atomicLong = qtlVar.f;
                    if (atomicLong.incrementAndGet() >= qtlVar.c) {
                        Object obj2 = qtlVar.h;
                        synchronized (obj2) {
                            if (atomicLong.get() >= ((qtl) qthVar).c) {
                                synchronized (obj2) {
                                    try {
                                        ScheduledFuture scheduledFuture = ((qtl) qthVar).g;
                                        if (scheduledFuture == null || scheduledFuture.isDone() || ((qtl) qthVar).g.isCancelled()) {
                                            ((qtl) qthVar).g = ((qtl) qthVar).a.schedule(new mbo(qthVar, i), 1L, TimeUnit.MILLISECONDS);
                                        } else if (((qtl) qthVar).g.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                            ((qtl) qthVar).b();
                                            ((qtl) qthVar).g = ((qtl) qthVar).a.schedule(new mbo(qthVar, i), 1L, TimeUnit.MILLISECONDS);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return;
                            }
                        }
                    }
                }
                synchronized (qtlVar.h) {
                    ScheduledFuture scheduledFuture2 = ((qtl) qthVar).g;
                    if (scheduledFuture2 == null || scheduledFuture2.isDone() || ((qtl) qthVar).g.isCancelled()) {
                        ((qtl) qthVar).g = ((qtl) qthVar).a.schedule(new mbo(qthVar, i), ((qtl) qthVar).d, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }

    protected final void e(Object... objArr) {
        qte[] qteVarArr = this.c;
        if (qteVarArr.length != objArr.length) {
            throw new IllegalArgumentException();
        }
        if (this.g) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    throw new NullPointerException("Streamz " + this.b + " has null parameter: " + Arrays.toString(objArr));
                }
                if (!qteVarArr[i].b.isInstance(obj)) {
                    String str = this.b;
                    String string = obj.toString();
                    String strValueOf = String.valueOf(obj.getClass());
                    qte qteVar = qteVarArr[i];
                    throw new IllegalArgumentException("Streamz " + str + " has parameter {index: " + i + ", value: " + string + ", type: " + strValueOf + "}, but expected: {name: " + qteVar.a + ", type: " + qteVar.b.toString() + '}');
                }
            }
        }
    }

    final void f(qte... qteVarArr) {
        qte[] qteVarArr2 = this.c;
        if (Arrays.equals(qteVarArr2, qteVarArr)) {
            return;
        }
        throw new qtk("Streamz " + this.b + " with field diffs: " + Arrays.toString(qteVarArr2) + " and " + Arrays.toString(qteVarArr));
    }
}

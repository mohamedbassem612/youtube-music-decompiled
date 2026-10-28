package defpackage;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahfi {
    public Object a;
    public Object b;
    public Object c;

    public ahfi() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static ThreadFactory a(ahfi ahfiVar) {
        AtomicLong atomicLong;
        ThreadFactory threadFactoryDefaultThreadFactory;
        Object obj = ahfiVar.a;
        Object obj2 = ahfiVar.b;
        Object obj3 = ahfiVar.c;
        ?? r5 = obj3;
        if (obj3 == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        if (obj != null) {
            r5 = threadFactoryDefaultThreadFactory;
            atomicLong = new AtomicLong(0L);
        } else {
            r5 = threadFactoryDefaultThreadFactory;
            atomicLong = null;
        }
        return new ahfh(r5, (String) obj, atomicLong, (Boolean) obj2);
    }

    public final void b() {
        this.b = Boolean.TRUE;
    }

    public final void c(String str) {
        String.format(Locale.ROOT, str, 0);
        this.a = str;
    }

    public final void d(ThreadFactory threadFactory) {
        threadFactory.getClass();
        this.c = threadFactory;
    }

    public final void e() {
        this.a = null;
        this.b = null;
    }

    public final void f() {
        this.c = null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [agex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, twi] */
    public final wlt g() {
        if (this.b != null && this.c != null) {
            return new wlt(this.b, this.a, (twq) this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" isErrorRetryable");
        }
        if (this.c == null) {
            sb.append(" exponentialBackoffPolicy");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void h(twq twqVar) {
        if (twqVar == null) {
            throw new NullPointerException("Null exponentialBackoffPolicy");
        }
        this.c = twqVar;
    }

    public final void i(agex agexVar) {
        if (agexVar == null) {
            throw new NullPointerException("Null isErrorRetryable");
        }
        this.b = agexVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, weh] */
    public final wff j() {
        if (this.c != null && this.b != null) {
            return new wff(this.a, (wej) this.c, (aijp) this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" metadata");
        }
        if (this.b == null) {
            sb.append(" applicability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void k(aijp aijpVar) {
        if (aijpVar == null) {
            throw new NullPointerException("Null applicability");
        }
        this.b = aijpVar;
    }

    public final void l(wej wejVar) {
        if (wejVar == null) {
            throw new NullPointerException("Null metadata");
        }
        this.c = wejVar;
    }

    public final boolean m() {
        return this.a != null;
    }

    public ahfi(char[] cArr) {
    }
}

package defpackage;

import android.os.Process;
import j$.time.Duration;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class trf {
    public final Object a;
    public Object b;
    public Object c;

    public trf(mbc mbcVar) {
        this.b = Duration.ZERO;
        this.c = null;
        this.a = mbcVar;
    }

    public final Duration a() {
        return b().plus(c());
    }

    public final Duration b() {
        if (this.b == Duration.ZERO) {
            this.b = Duration.ofMillis(Process.getStartElapsedRealtime());
        }
        return (Duration) this.b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mbc] */
    public final Duration c() {
        if (this.c == null) {
            ?? r0 = this.a;
            this.c = Duration.ofMillis(r0.f().toEpochMilli() - r0.b());
        }
        return (Duration) this.c;
    }

    public final int d() {
        return ((agu) this.a).e;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map$Entry] */
    public final Map.Entry e() {
        ?? r1 = this.c;
        if (r1 != 0) {
            return r1;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public final boolean f(Object obj) {
        obj.getClass();
        return agu.d((agu) this.a, obj);
    }

    public trf() {
        this.a = new agu(6);
    }

    public trf(Object obj) {
        this.a = obj;
    }
}

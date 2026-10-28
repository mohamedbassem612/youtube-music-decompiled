package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axec implements awot {
    private final ThreadLocal a;

    public axec(ThreadLocal threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof axec) && awrc.c(this.a, ((axec) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ')';
    }
}

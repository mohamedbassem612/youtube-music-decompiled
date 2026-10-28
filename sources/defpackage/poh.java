package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class poh implements awot {
    private final axff a;

    public poh(axff axffVar) {
        this.a = axffVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof poh) && awrc.c(this.a, ((poh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.a + ')';
    }
}

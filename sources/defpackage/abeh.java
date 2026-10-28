package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abeh implements abei {
    public final wgi a;

    public abeh(wgi wgiVar) {
        this.a = wgiVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof abeh) && awrc.c(this.a, ((abeh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WatchNextLoaded(response=" + this.a + ')';
    }
}

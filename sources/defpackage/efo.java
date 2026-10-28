package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efo {
    public static final String a = dzf.a("NetworkRequestCompat");
    public final Object b;

    public efo(Object obj) {
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof efo) && awrc.c(this.b, ((efo) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.b + ')';
    }

    public efo() {
        this(null);
    }
}

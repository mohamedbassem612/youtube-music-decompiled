package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tuy {
    public final ttq a;

    public tuy(ttq ttqVar) {
        this.a = ttqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tuy) {
            return this.a.equals(((tuy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "WindowInsets{insets=" + this.a.toString() + '}';
    }

    public tuy() {
        throw null;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class soq {
    private final sok a;

    public soq(sok sokVar) {
        this.a = sokVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof soq) {
            return this.a.equals(((soq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AdTitleOverlayState{adOverlayMetadata=" + String.valueOf(this.a) + '}';
    }

    public soq() {
        throw null;
    }
}

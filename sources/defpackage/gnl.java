package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnl {
    public static final gnl a = new heg((short[]) null).d();
    public final Optional b;

    public gnl(Optional optional) {
        this.b = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gnl) {
            return this.b.equals(((gnl) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BrowseParameters{latencyActionLogger=" + String.valueOf(this.b) + '}';
    }

    public gnl() {
        throw null;
    }
}

package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agci {
    public final Optional a;

    public agci(Optional optional) {
        this.a = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agci) {
            return this.a.equals(((agci) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "UpdateShouldClearSelectionOptions{value=" + String.valueOf(this.a) + '}';
    }

    public agci() {
        throw null;
    }
}

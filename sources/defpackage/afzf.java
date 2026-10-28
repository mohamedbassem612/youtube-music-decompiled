package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afzf {
    public final Optional a;

    public afzf(Optional optional) {
        this.a = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afzf) {
            return this.a.equals(((afzf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "UpdateHeaderVisibilityOptions{headerVisibility=" + String.valueOf(this.a) + '}';
    }

    public afzf() {
        throw null;
    }
}

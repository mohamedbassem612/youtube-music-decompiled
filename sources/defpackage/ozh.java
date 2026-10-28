package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ozh {
    public final List a;

    public ozh(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ozh) {
            return this.a.equals(((ozh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SetPreferencesRequest{preferenceEntries=" + String.valueOf(this.a) + '}';
    }

    public ozh() {
        throw null;
    }
}

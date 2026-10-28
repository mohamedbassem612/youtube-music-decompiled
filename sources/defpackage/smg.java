package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class smg {
    private final apeh a;
    private final String b;

    public smg(apeh apehVar, String str) {
        this.a = apehVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof smg) {
            return Objects.equals(this.a, ((smg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return "ReelImageAdMetadata[ id=" + this.a.e + " identifier=" + this.b + ']';
    }
}

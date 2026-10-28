package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hpz {
    private final String a;
    private final int b;

    public hpz(int i, String str) {
        typ.f(str);
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hpz)) {
            return false;
        }
        hpz hpzVar = (hpz) obj;
        return Objects.equals(this.a, hpzVar.a) && this.b == hpzVar.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return (this.b == 2 ? "PLAYLIST" : "VIDEO") + ':' + this.a;
    }
}

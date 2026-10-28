package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ilk {
    public final ill a;
    public final List b;

    public ilk(ill illVar, List list) {
        this.a = illVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ilk) {
            ilk ilkVar = (ilk) obj;
            if (awrc.c(this.a, ilkVar.a) && awrc.c(this.b, ilkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TokenizedTrack(videoIdentifier=" + this.a + ", tokenizedContent=" + this.b + ')';
    }
}

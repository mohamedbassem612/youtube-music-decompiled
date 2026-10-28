package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agii extends agpd implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;

    public agii(Comparator comparator) {
        comparator.getClass();
        this.a = comparator;
    }

    @Override // defpackage.agpd, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agii) {
            return this.a.equals(((agii) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agpu extends agpd implements Serializable {
    private static final long serialVersionUID = 0;
    final agpd a;

    public agpu(agpd agpdVar) {
        this.a = agpdVar;
    }

    @Override // defpackage.agpd
    public final agpd a() {
        return this.a;
    }

    @Override // defpackage.agpd, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agpu) {
            return this.a.equals(((agpu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}

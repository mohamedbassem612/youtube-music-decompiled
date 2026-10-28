package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agew implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final Object a;
    public final Object b;

    public agew(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agew)) {
            return false;
        }
        agew agewVar = (agew) obj;
        return Objects.equals(this.a, agewVar.a) && Objects.equals(this.b, agewVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        Object obj = this.b;
        return "(" + String.valueOf(this.a) + ", " + String.valueOf(obj) + ')';
    }
}

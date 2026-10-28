package defpackage;

import io.grpc.Status;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avbp {
    public final Status a;
    public final Object b;

    public avbp(Status status) {
        this.b = null;
        this.a = status;
        ahno.K(!status.e(), "cannot use OK status: %s", status);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            avbp avbpVar = (avbp) obj;
            if (Objects.equals(this.a, avbpVar.a) && Objects.equals(this.b, avbpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Object obj = this.b;
        if (obj != null) {
            ageu ageuVarAc = ahno.ac(this);
            ageuVarAc.b("config", obj);
            return ageuVarAc.toString();
        }
        ageu ageuVarAc2 = ahno.ac(this);
        ageuVarAc2.b("error", this.a);
        return ageuVarAc2.toString();
    }

    public avbp(Object obj) {
        this.b = obj;
        this.a = null;
    }
}

package defpackage;

import io.grpc.Status;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avcf {
    private final Status a;
    private final Object b;

    public avcf(Status status, Object obj) {
        this.a = status;
        this.b = obj;
    }

    public static avcf b(Status status) {
        avcf avcfVar = new avcf(status, null);
        ahno.K(!status.e(), "cannot use OK status: %s", status);
        return avcfVar;
    }

    public final Status a() {
        Status status = this.a;
        return status == null ? Status.OK : status;
    }

    public final Object c() {
        if (this.a == null) {
            return this.b;
        }
        throw new IllegalStateException("No value present.");
    }

    public final boolean d() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avcf) {
            avcf avcfVar = (avcf) obj;
            if (d() == avcfVar.d()) {
                return d() ? Objects.equals(this.b, avcfVar.b) : Objects.equals(this.a, avcfVar.a);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        Status status = this.a;
        if (status == null) {
            ageuVarAc.b("value", this.b);
        } else {
            ageuVarAc.b("error", status);
        }
        return ageuVarAc.toString();
    }
}

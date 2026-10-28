package defpackage;

import io.grpc.Status;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avan {
    public static final avan a = new avan(null, Status.OK, false, null, null);
    public final avaq b;
    public final Status c;
    public final boolean d;
    public final String e;
    public final String f;
    private final atxy g = null;

    private avan(avaq avaqVar, Status status, boolean z, String str, String str2) {
        this.b = avaqVar;
        status.getClass();
        this.c = status;
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    public static avan a(Status status) {
        ahno.G(!status.e(), "drop status shouldn't be OK");
        return new avan(null, status, true, null, null);
    }

    public static avan b(Status status) {
        ahno.G(!status.e(), "error status shouldn't be OK");
        return new avan(null, status, false, null, null);
    }

    public static avan d(String str) {
        return new avan(null, Status.OK, false, "connecting", str);
    }

    public static avan e(avaq avaqVar) {
        return new avan(avaqVar, Status.OK, false, null, null);
    }

    public final boolean c() {
        return (this.b == null && this.c.e()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof avan)) {
            return false;
        }
        avan avanVar = (avan) obj;
        if (!Objects.equals(this.b, avanVar.b) || !Objects.equals(this.c, avanVar.c)) {
            return false;
        }
        atxy atxyVar = avanVar.g;
        return Objects.equals(null, null) && this.d == avanVar.d;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, null, Boolean.valueOf(this.d));
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("subchannel", this.b);
        ageuVarAc.b("streamTracerFactory", null);
        ageuVarAc.b("status", this.c);
        ageuVarAc.g("drop", this.d);
        ageuVarAc.b("authority-override", null);
        return ageuVarAc.toString();
    }
}

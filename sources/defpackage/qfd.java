package defpackage;

import androidx.car.app.model.Alert;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qfd {
    public final String a;
    public final boolean b;
    public final axhz c;
    public final axgh d;
    public final String e;
    public final qjj f;
    public final boolean g;
    public final qgi h;
    public final qdo i;
    private final boolean j;
    private final int k;
    private final Predicate l;
    private final int m;

    public qfd(String str, boolean z, axhz axhzVar, axgh axghVar, String str2, qjj qjjVar, boolean z2, qgi qgiVar, boolean z3, int i, Predicate predicate, qdo qdoVar, int i2) {
        this.a = str;
        this.b = z;
        this.c = axhzVar;
        this.d = axghVar;
        this.e = str2;
        this.f = qjjVar;
        this.g = z2;
        this.h = qgiVar;
        this.j = z3;
        this.k = i;
        this.l = predicate;
        this.i = qdoVar;
        this.m = i2;
    }

    public static qfc a() {
        qfc qfcVar = new qfc();
        qfcVar.d(false);
        qfcVar.e(false);
        qfcVar.c(0);
        qfcVar.i(false);
        qfcVar.f(Alert.DURATION_SHOW_INDEFINITELY);
        qfcVar.f = new jor(4);
        return qfcVar;
    }

    public final boolean equals(Object obj) {
        axgh axghVar;
        String str;
        qjj qjjVar;
        qdo qdoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qfd) {
            qfd qfdVar = (qfd) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(qfdVar.a) : qfdVar.a == null) {
                if (this.b == qfdVar.b && this.c.equals(qfdVar.c) && ((axghVar = this.d) != null ? axghVar.equals(qfdVar.d) : qfdVar.d == null) && ((str = this.e) != null ? str.equals(qfdVar.e) : qfdVar.e == null) && ((qjjVar = this.f) != null ? qjjVar.equals(qfdVar.f) : qfdVar.f == null) && this.g == qfdVar.g) {
                    if (this.h != null) {
                        qgi qgiVar = qfdVar.h;
                        throw null;
                    }
                    if (qfdVar.h == null && this.j == qfdVar.j && this.k == qfdVar.k && this.l.equals(qfdVar.l) && ((qdoVar = this.i) != null ? qdoVar.equals(qfdVar.i) : qfdVar.i == null) && this.m == qfdVar.m) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003;
        axgh axghVar = this.d;
        int iHashCode2 = (iHashCode ^ (axghVar == null ? 0 : axghVar.hashCode())) * 1000003;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        qjj qjjVar = this.f;
        int iHashCode4 = (iHashCode3 ^ (qjjVar == null ? 0 : qjjVar.hashCode())) * 1000003;
        int i = true != this.g ? 1237 : 1231;
        if (this.h != null) {
            throw null;
        }
        int iHashCode5 = (((((((iHashCode4 ^ i) * 583896283) ^ (true == this.j ? 1231 : 1237)) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003;
        qdo qdoVar = this.i;
        return ((iHashCode5 ^ (qdoVar != null ? qdoVar.hashCode() : 0)) * 1000003) ^ this.m;
    }

    public final String toString() {
        qdo qdoVar = this.i;
        Predicate predicate = this.l;
        qgi qgiVar = this.h;
        qjj qjjVar = this.f;
        axgh axghVar = this.d;
        return "Metric{customEventName=" + this.a + ", isEventNameConstant=" + this.b + ", metric=" + String.valueOf(this.c) + ", metricExtension=" + String.valueOf(axghVar) + ", accountableComponentName=" + this.e + ", samplingRate=" + String.valueOf(qjjVar) + ", isUnsampled=" + this.g + ", samplingStrategy=null, activeCuiId=" + String.valueOf(qgiVar) + ", shouldAttachActiveTraces=" + this.j + ", maxActiveTraces=" + this.k + ", activeTracePredicate=" + String.valueOf(predicate) + ", debugLogsTime=" + String.valueOf(qdoVar) + ", debugLogsSize=" + this.m + '}';
    }

    public qfd() {
        throw null;
    }
}

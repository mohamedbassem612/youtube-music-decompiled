package defpackage;

import j$.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeqg {
    public final xgn a;
    public final Supplier b;
    public final Optional c;

    public aeqg(xgn xgnVar, Supplier supplier, Optional optional) {
        this.a = xgnVar;
        this.b = supplier;
        this.c = optional;
    }

    public final boolean equals(Object obj) {
        Supplier supplier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeqg) {
            aeqg aeqgVar = (aeqg) obj;
            if (this.a.equals(aeqgVar.a) && ((supplier = this.b) != null ? supplier.equals(aeqgVar.b) : aeqgVar.b == null) && this.c.equals(aeqgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Supplier supplier = this.b;
        return (((iHashCode * 1000003) ^ (supplier == null ? 0 : supplier.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        Supplier supplier = this.b;
        return "ScrollLoggingParams{interactionLogger=" + String.valueOf(this.a) + ", interactionLoggerSupplier=" + String.valueOf(supplier) + ", shortsExperienceType=" + String.valueOf(optional) + '}';
    }

    public aeqg() {
        throw null;
    }
}

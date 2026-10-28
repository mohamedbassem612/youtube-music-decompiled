package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vmo {
    public final String a;
    public final Optional b;

    public vmo(String str, Optional optional) {
        if (str == null) {
            throw new NullPointerException("Null getText");
        }
        this.a = str;
        this.b = optional;
    }

    public static vmo a(String str) {
        return new vmo(str, Optional.empty());
    }

    public static vmo b(String str, Long l) {
        return new vmo(str, Optional.ofNullable(l));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmo) {
            vmo vmoVar = (vmo) obj;
            if (this.a.equals(vmoVar.a) && this.b.equals(vmoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RollingNumberValue{getText=" + this.a + ", comparableValue=" + this.b.toString() + '}';
    }

    public vmo() {
        throw null;
    }
}

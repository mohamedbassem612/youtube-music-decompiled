package defpackage;

import java.io.Serializable;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axix implements Serializable, Comparable, Supplier {
    private static final long serialVersionUID = -4830728138360036487L;
    public boolean a;

    public axix(byte[] bArr) {
        this.a = false;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        boolean z = this.a;
        boolean z2 = ((axix) obj).a;
        int i = axiv.a;
        if (z == z2) {
            return 0;
        }
        return !z ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof axix) && this.a == ((axix) obj).a;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return Boolean.valueOf(this.a);
    }

    public final int hashCode() {
        if (this.a) {
            Boolean bool = Boolean.TRUE;
            return 1231;
        }
        Boolean bool2 = Boolean.FALSE;
        return 1237;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    public axix() {
    }
}

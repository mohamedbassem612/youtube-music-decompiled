package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awmn implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof awmm) {
            return ((awmm) obj).a;
        }
        return null;
    }

    public static final boolean b(Object obj) {
        return !(obj instanceof awmm);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awmn) && awrc.c(this.a, ((awmn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof awmm) {
            return ((awmm) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}

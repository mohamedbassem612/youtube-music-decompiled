package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsb {
    private final SparseBooleanArray a;

    public bsb(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        ahno.W(i, b());
        return this.a.keyAt(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean c(int i) {
        return this.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bsb) {
            return this.a.equals(((bsb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

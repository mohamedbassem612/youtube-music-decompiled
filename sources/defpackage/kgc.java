package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kgc {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kgc) {
            kgc kgcVar = (kgc) obj;
            int i = kgcVar.a;
            if (this.b == kgcVar.b) {
                int i2 = kgcVar.c;
                int i3 = kgcVar.d;
                int i4 = kgcVar.e;
                boolean z = kgcVar.f;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(0, Integer.valueOf(this.b), 0, 0, 0, Boolean.FALSE);
    }
}

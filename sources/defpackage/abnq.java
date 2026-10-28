package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abnq {
    public final int a;

    public abnq(int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            i |= i4;
        }
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof abnq) && this.a == ((abnq) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }

    public abnq(int i) {
        this.a = i;
    }

    public abnq() {
        this.a = 0;
    }
}

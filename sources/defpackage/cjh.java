package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cjh {
    public final String a;
    public final String b;

    public cjh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cjh) {
            cjh cjhVar = (cjh) obj;
            if (Objects.equals(this.a, cjhVar.a) && Objects.equals(this.b, cjhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a + ", " + this.b;
    }
}

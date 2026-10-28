package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adpy {
    public final String a;
    public final int b;

    public adpy(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adpy) {
            adpy adpyVar = (adpy) obj;
            if (awrc.c(this.a, adpyVar.a) && this.b == adpyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "RiveListSizeProperty(listPath=" + this.a + ", targetSize=" + this.b + ')';
    }
}

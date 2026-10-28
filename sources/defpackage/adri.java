package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adri implements adrj {
    public final String a;
    private final String b;

    public adri(String str) {
        this.a = str;
        this.b = str;
    }

    @Override // defpackage.adrj
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof adri) && awrc.c(this.a, ((adri) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Url(url=" + this.a + ')';
    }
}

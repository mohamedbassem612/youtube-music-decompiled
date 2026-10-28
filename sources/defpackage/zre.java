package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zre implements zrb, zqv {
    private final awmy a;

    public /* synthetic */ zre(byte[] bArr) {
        this.a = awmy.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zre) && awrc.c(this.a, ((zre) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Refreshed(unit=" + this.a + ')';
    }

    public zre() {
        this(null);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awsa extends awry {
    public static final awsa d = new awsa(1, 0);

    @Override // defpackage.awry
    public final boolean b() {
        return this.a > this.b;
    }

    public final Integer c() {
        return Integer.valueOf(this.b);
    }

    public final Integer d() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.awry
    public final boolean equals(Object obj) {
        if (!(obj instanceof awsa)) {
            return false;
        }
        if (!b() || !((awsa) obj).b()) {
            awsa awsaVar = (awsa) obj;
            if (this.a != awsaVar.a || this.b != awsaVar.b) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.awry
    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return this.b + (this.a * 31);
    }

    @Override // defpackage.awry
    public final String toString() {
        return this.a + ".." + this.b;
    }
}

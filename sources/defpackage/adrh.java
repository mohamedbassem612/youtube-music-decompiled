package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adrh implements adrj {
    public final int a;
    private final String b;

    public adrh(int i) {
        this.a = i;
        if (i == 0) {
            throw new IllegalArgumentException("resId must not be 0");
        }
        this.b = a.bR(i, "raw_res_");
    }

    @Override // defpackage.adrj
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof adrh) && this.a == ((adrh) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "RawResource(resId=" + this.a + ')';
    }
}

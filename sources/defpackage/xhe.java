package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xhe {
    private final int a;
    private final int b;

    public xhe(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('_');
        sb.append(this.b);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xhe) {
            return a().equals(((xhe) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}

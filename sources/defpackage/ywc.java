package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ywc implements zgg {
    public static final zgg b = new ywc("rqs");
    public static final zgg c = new ywc("rqs2");
    public final String d;

    public ywc(String str) {
        this.d = str;
    }

    @Override // defpackage.zgg
    public String a(long j) {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ywc) {
            return this.d.equals(((ywc) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}

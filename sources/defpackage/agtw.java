package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agtw {
    public final agvi a;
    public final String b;

    public agtw(agvi agviVar, String str) {
        agviVar.getClass();
        this.a = agviVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agtw)) {
            return false;
        }
        agtw agtwVar = (agtw) obj;
        return this.a.equals(agtwVar.a) && this.b.equals(agtwVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}

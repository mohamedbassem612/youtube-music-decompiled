package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oka {
    public final String a;
    private final int b;

    public oka(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public static oka a(String str) {
        int i = agxm.b;
        agxk agxkVarF = agxl.a.f();
        agxkVarF.j(str);
        return new oka(1, agxkVarF.o().toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oka) {
            oka okaVar = (oka) obj;
            if (this.b == okaVar.b && this.a.equals(okaVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public oka() {
        throw null;
    }
}

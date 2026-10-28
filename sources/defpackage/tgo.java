package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tgo {
    public final int a;
    public final String b;
    public final tfz c;
    public final tgn d;
    private final String e;

    public tgo(String str, int i, String str2, tfz tfzVar, tgn tgnVar) {
        this.e = str;
        this.a = i;
        this.b = str2;
        this.c = tfzVar;
        this.d = tgnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tgo) {
            tgo tgoVar = (tgo) obj;
            if (this.e.equals(tgoVar.e) && this.a == tgoVar.a && this.b.equals(tgoVar.b) && this.c.equals(tgoVar.c)) {
                tgn tgnVar = this.d;
                if (tgnVar == null) {
                    if (tgoVar.d == null) {
                        return true;
                    }
                } else if (tgnVar.equals(tgoVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        tgn tgnVar = this.d;
        return (iHashCode * 1000003) ^ (tgnVar == null ? 0 : tgnVar.hashCode());
    }

    public final String toString() {
        tgn tgnVar = this.d;
        return "HttpResponse{protocol=" + this.e + ", statusCode=" + this.a + ", reasonPhrase=" + this.b + ", headers=" + String.valueOf(this.c) + ", body=" + String.valueOf(tgnVar) + '}';
    }

    public tgo() {
        throw null;
    }
}

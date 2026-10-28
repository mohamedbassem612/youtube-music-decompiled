package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ins {
    public final ajwo a;
    public final boolean b;
    public final String c;

    public ins(ajwo ajwoVar, boolean z, String str) {
        this.a = ajwoVar;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ins) {
            ins insVar = (ins) obj;
            if (this.a.equals(insVar.a) && this.b == insVar.b && this.c.equals(insVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StartSearchDetails{command=" + String.valueOf(this.a) + ", hideBackAction=" + this.b + ", defaultSearchTab=" + this.c + '}';
    }

    public ins() {
        throw null;
    }
}

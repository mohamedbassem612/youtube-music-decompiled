package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jla {
    public final String a;
    public final boolean b;
    public final ajwo c;
    public final String d;
    public final aiqd e;
    public final aiqd f;

    public jla(String str, boolean z, ajwo ajwoVar, String str2, aiqd aiqdVar, aiqd aiqdVar2) {
        this.a = str;
        this.b = z;
        this.c = ajwoVar;
        this.d = str2;
        this.e = aiqdVar;
        this.f = aiqdVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jla) {
            jla jlaVar = (jla) obj;
            if (this.a.equals(jlaVar.a) && this.b == jlaVar.b && this.c.equals(jlaVar.c) && this.d.equals(jlaVar.d) && this.e.equals(jlaVar.e) && this.f.equals(jlaVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        aiqd aiqdVar = this.f;
        aiqd aiqdVar2 = this.e;
        return "SingleSelectOption{label=" + this.a + ", isSelected=" + this.b + ", selectedCommand=" + String.valueOf(this.c) + ", localEntityKey=" + this.d + ", selectedAccessibilityData=" + String.valueOf(aiqdVar2) + ", deselectedAccessibilityData=" + String.valueOf(aiqdVar) + '}';
    }

    public jla() {
        throw null;
    }
}

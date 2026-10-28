package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vld {
    public final String a;
    private final float b = 1.0f;

    public vld(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vld) {
            vld vldVar = (vld) obj;
            if (awrc.c(this.a, vldVar.a)) {
                float f = vldVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1065353216;
    }

    public final String toString() {
        return "IdentifiedLanguage(languageTag=" + this.a + ", confidence=1.0)";
    }
}

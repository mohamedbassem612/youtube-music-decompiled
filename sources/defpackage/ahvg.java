package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahvg {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public ahvg(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static ahvf a() {
        ahvf ahvfVar = new ahvf();
        ahvfVar.b(false);
        ahvfVar.c(false);
        ahvfVar.d(false);
        return ahvfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahvg) {
            ahvg ahvgVar = (ahvg) obj;
            if (this.a == ahvgVar.a && this.b == ahvgVar.b && this.c == ahvgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "EncoderOptions{enableCelLogsiteMetadata=" + this.a + ", enableSafeFormatArgs=" + this.b + ", includeSuppressedExceptions=" + this.c + '}';
    }

    public ahvg() {
        throw null;
    }
}

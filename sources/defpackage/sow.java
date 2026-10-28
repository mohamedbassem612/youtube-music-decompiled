package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sow {
    public final boolean a;
    public final CharSequence b;

    public sow(boolean z, CharSequence charSequence) {
        this.a = z;
        this.b = charSequence;
    }

    public static abui a() {
        abui abuiVar = new abui();
        abuiVar.a = (byte) (abuiVar.a | 1);
        abuiVar.g(false);
        abuiVar.h("<NONE>");
        return abuiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sow) {
            sow sowVar = (sow) obj;
            if (this.a == sowVar.a && this.b.equals(sowVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 385623362) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "LearnMoreOverlayState{learnMoreCtaHidden=false, learnMoreCtaEnabled=" + this.a + ", learnMoreText=" + String.valueOf(this.b) + '}';
    }

    public sow() {
        throw null;
    }
}

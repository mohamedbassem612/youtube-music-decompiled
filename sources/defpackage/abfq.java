package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abfq {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public abfq(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static abfq a(boolean z) {
        ahvf ahvfVar = new ahvf();
        ahvfVar.f(false);
        ahvfVar.b = z;
        ahvfVar.c = (byte) (ahvfVar.c | 3);
        ahvfVar.f(false);
        ahvfVar.a = !z;
        ahvfVar.c = (byte) (ahvfVar.c | 24);
        return ahvfVar.e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abfq) {
            abfq abfqVar = (abfq) obj;
            if (this.a == abfqVar.a && this.b == abfqVar.b && this.c == abfqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
    }

    public final String toString() {
        return "AccessibilityState{isAccessibilityPlayerEnabled=" + this.a + ", rotateShortsFeedEnabled=false, isTestOnlyState=" + this.b + ", canHidePlayerControls=" + this.c + ", controlsHideDelayMs=0}";
    }

    public abfq() {
        throw null;
    }
}

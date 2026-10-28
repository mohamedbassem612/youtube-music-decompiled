package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abyb extends abyc {
    private final abxp a;

    public abyb(abxp abxpVar) {
        this.a = abxpVar;
    }

    @Override // defpackage.abyc
    public final abxp a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof abyb) && awrc.c(this.a, ((abyb) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Fixed(setting=" + this.a + ')';
    }
}

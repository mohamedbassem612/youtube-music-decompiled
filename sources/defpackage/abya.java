package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abya extends abyc {
    private final abxp a;

    public abya(abxp abxpVar) {
        abxpVar.getClass();
        this.a = abxpVar;
    }

    @Override // defpackage.abyc
    public final abxp a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof abya) && awrc.c(this.a, ((abya) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Dynamic(setting=" + this.a + ')';
    }
}

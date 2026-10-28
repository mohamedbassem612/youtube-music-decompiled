package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aikd extends aike {
    public final long a;
    public final aiix b;

    public aikd(long j, aiix aiixVar) {
        this.a = j;
        if (aiixVar == null) {
            throw new NullPointerException("Null parser");
        }
        this.b = aiixVar;
    }

    @Override // defpackage.aike
    public final long a() {
        return this.a;
    }

    @Override // defpackage.aike
    public final aiix b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aike) {
            aike aikeVar = (aike) obj;
            if (this.a == aikeVar.a() && this.b.equals(aikeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GeneratedAnyExtractor{typeHash=" + this.a + ", parser=" + this.b.toString() + '}';
    }
}

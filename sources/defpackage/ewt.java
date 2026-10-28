package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ewt implements ewy {
    int a;
    public Class b;
    private final ewu c;

    public ewt(ewu ewuVar) {
        this.c = ewuVar;
    }

    @Override // defpackage.ewy
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ewt)) {
            return false;
        }
        ewt ewtVar = (ewt) obj;
        return this.a == ewtVar.a && this.b == ewtVar.b;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.a + "array=" + String.valueOf(this.b) + '}';
    }
}

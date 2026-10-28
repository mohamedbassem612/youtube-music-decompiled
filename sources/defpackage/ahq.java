package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahq implements aiv {
    private final awqg a;

    public ahq(awqg awqgVar) {
        this.a = awqgVar;
    }

    @Override // defpackage.aiv
    public final Object a(ajm ajmVar) {
        return this.a.invoke(ajmVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ahq) && awrc.c(this.a, ((ahq) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avak extends avar {
    private final avan a;

    public avak(avan avanVar) {
        avanVar.getClass();
        this.a = avanVar;
    }

    @Override // defpackage.avar
    public final avan a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avak) {
            return this.a.equals(((avak) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FixedResultPicker(" + this.a.toString() + ')';
    }
}

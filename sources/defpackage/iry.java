package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iry implements zrg {
    public final hel a;

    public iry(hel helVar) {
        this.a = helVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof iry) && awrc.c(this.a, ((iry) obj).a);
        }
        return true;
    }

    @Override // defpackage.zrg
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchResultRoute(model=" + this.a + ')';
    }
}

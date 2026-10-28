package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class akj implements akq {
    public final akq a;
    public final akq b;

    public akj(akq akqVar, akq akqVar2) {
        this.a = akqVar;
        this.b = akqVar2;
    }

    @Override // defpackage.akq
    public final boolean all(awqg awqgVar) {
        return this.a.all(awqgVar) && this.b.all(awqgVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akj) {
            akj akjVar = (akj) obj;
            if (awrc.c(this.a, akjVar.a) && awrc.c(this.b, akjVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akq
    public final Object foldIn(Object obj, awqk awqkVar) {
        return this.b.foldIn(this.a.foldIn(obj, awqkVar), awqkVar);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.akq
    public final /* synthetic */ akq then(akq akqVar) {
        return akqVar != akq.c ? new akj(this, akqVar) : this;
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) foldIn(new StringBuilder("["), new akm(1));
        sb.append(']');
        return sb.toString();
    }
}

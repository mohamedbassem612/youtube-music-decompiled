package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avkg implements avki {
    private final avcm a;

    public avkg(avcm avcmVar) {
        avcmVar.getClass();
        this.a = avcmVar;
    }

    @Override // defpackage.avki
    public final avbt a(avbq avbqVar, avbo avboVar) {
        return avbqVar.a(this.a, avboVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avkg) {
            return this.a.equals(((avkg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

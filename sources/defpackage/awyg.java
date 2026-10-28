package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awyg extends awyh {
    public final Throwable a;

    public awyg(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awyg) && awrc.c(this.a, ((awyg) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.awyh
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}

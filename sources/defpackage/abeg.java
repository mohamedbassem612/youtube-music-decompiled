package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abeg implements abei {
    public final acip a;

    public abeg(acip acipVar) {
        this.a = acipVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof abeg) && awrc.c(this.a, ((abeg) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoStarted(component=" + this.a + ')';
    }
}

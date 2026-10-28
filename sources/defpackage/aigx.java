package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aigx {
    private final Object a;
    private final int b;

    public aigx(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aigx)) {
            return false;
        }
        aigx aigxVar = (aigx) obj;
        return this.a == aigxVar.a && this.b == aigxVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wax extends way {
    private final Object a;

    public wax(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.wbi
    public final int a() {
        return 3;
    }

    @Override // defpackage.way, defpackage.wbi
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wbi)) {
            return false;
        }
        wbi wbiVar = (wbi) obj;
        return wbiVar.a() == 3 && this.a.equals(wbiVar.b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Result{update=" + this.a.toString() + '}';
    }
}

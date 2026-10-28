package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wba extends wbb {
    private final weh a;

    public wba(weh wehVar) {
        this.a = wehVar;
    }

    @Override // defpackage.wbl
    public final int b() {
        return 1;
    }

    @Override // defpackage.wbb, defpackage.wbl
    public final weh c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wbl)) {
            return false;
        }
        wbl wblVar = (wbl) obj;
        return wblVar.b() == 1 && this.a.equals(wblVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Write{entity=" + this.a.toString() + '}';
    }
}

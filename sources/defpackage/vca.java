package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vca {
    public volatile vbz a;
    private final Object b = new Object();

    public final vbz a() {
        vbz vbzVar;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this.b) {
            if (this.a != null) {
                vbzVar = this.a;
            } else {
                this.a = new vbz();
                vbzVar = this.a;
            }
        }
        return vbzVar;
    }
}

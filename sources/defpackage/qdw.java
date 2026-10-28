package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class qdw {
    public int a = 1;

    public abstract void g(qci qciVar);

    public abstract void j(qci qciVar);

    public final void k(qci qciVar) {
        if (this.a != 3) {
            this.a = 3;
            g(qciVar);
        }
    }

    public final void l(qci qciVar) {
        if (this.a != 2) {
            this.a = 2;
            j(qciVar);
        }
    }
}

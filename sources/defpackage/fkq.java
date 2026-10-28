package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fkq {
    public final int a;
    public final axr b;
    public int c = 0;

    public fkq(int i) {
        this.a = i;
        this.b = new axt(i);
    }

    public void b(Object obj) {
        synchronized (this) {
            this.b.b(obj);
            this.c = Math.min(this.a, this.c + 1);
        }
    }
}

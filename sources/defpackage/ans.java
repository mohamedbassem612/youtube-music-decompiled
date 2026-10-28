package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ans {
    public final anq a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public anv j;
    public int k = 5;
    public final anw i = new anw(this);

    public ans(anq anqVar) {
        this.a = anqVar;
    }

    public final void a(boolean z) {
        int i;
        if (this.c != z) {
            this.c = z;
            boolean z2 = this.d;
            if (z) {
                if (z2) {
                    return;
                } else {
                    i = this.e + 1;
                }
            } else if (z2) {
                return;
            } else {
                i = this.e - 1;
            }
            this.e = i;
        }
    }

    public final void b() {
        boolean z = this.i.j;
    }
}

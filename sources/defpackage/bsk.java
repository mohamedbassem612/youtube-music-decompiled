package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bsk {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    static {
        new bsk(new bsj());
        int i = bwp.a;
    }

    public bsk(bsj bsjVar) {
        int i = bwp.a;
        this.a = bsjVar.a;
        this.b = bsjVar.b;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = bsjVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bsk) {
            bsk bskVar = (bsk) obj;
            if (this.a == bskVar.a && this.b == bskVar.b) {
                boolean z = bskVar.c;
                boolean z2 = bskVar.d;
                boolean z3 = bskVar.e;
                if (this.f == bskVar.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((a.ak(this.a) * 31) + a.ak(this.b)) * 923521) + (this.f ? 1 : 0);
    }
}

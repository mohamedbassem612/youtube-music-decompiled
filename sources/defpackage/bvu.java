package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvu {
    public final Object a;
    public boolean b;
    public boolean c;
    public aerz d = new aerz(null, null);

    public bvu(Object obj) {
        this.a = obj;
    }

    public final void a(bvt bvtVar) {
        this.c = true;
        if (bvtVar == null || !this.b) {
            return;
        }
        this.b = false;
        bvtVar.a(this.a, this.d.h());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((bvu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

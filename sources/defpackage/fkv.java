package defpackage;

import com.facebook.litho.ComponentTree;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fkv implements fjl, fjj {
    private final fjm a = new fjm();

    public fkv(ComponentTree componentTree) {
        fjl fjlVar = componentTree.c;
        if (fjlVar != null) {
            fjlVar.b(this);
        }
    }

    @Override // defpackage.fjl
    public final fjk a() {
        return this.a.a;
    }

    @Override // defpackage.fjl
    public final void b(fjj fjjVar) {
        this.a.b(fjjVar);
    }

    @Override // defpackage.fjl
    public final void c(fjj fjjVar) {
        this.a.c(fjjVar);
    }

    public final void d(fjk fjkVar) {
        this.a.d(fjkVar);
    }

    @Override // defpackage.fjj
    public final void s(fjk fjkVar) {
        int iOrdinal = fjkVar.ordinal();
        if (iOrdinal == 0) {
            d(fjk.HINT_VISIBLE);
        } else if (iOrdinal == 1) {
            d(fjk.HINT_INVISIBLE);
        } else if (iOrdinal != 2) {
            throw new IllegalStateException("Illegal state: ".concat(fjkVar.d));
        }
    }
}

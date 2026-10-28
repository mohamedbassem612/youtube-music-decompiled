package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agjz extends agju {
    public agjz(int i) {
        super(i);
    }

    @Override // defpackage.agju, defpackage.agjv
    public final /* synthetic */ void c(Object obj) {
        super.b(obj);
    }

    public final agke g() {
        this.c = true;
        return agke.i(this.a, this.b);
    }

    public final void h(Object obj) {
        super.b(obj);
    }

    public final void i(Object... objArr) {
        super.d(objArr);
    }

    public final void j(Iterable iterable) {
        super.e(iterable);
    }

    public final void k(Iterator it) {
        while (it.hasNext()) {
            super.b(it.next());
        }
    }

    public agjz() {
        throw null;
    }
}

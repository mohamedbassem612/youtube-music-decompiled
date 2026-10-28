package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class vu extends vv implements Iterator {
    vs a;
    vs b;

    public vu(vs vsVar, vs vsVar2) {
        this.a = vsVar2;
        this.b = vsVar;
    }

    private final vs a() {
        vs vsVar = this.b;
        vs vsVar2 = this.a;
        if (vsVar == vsVar2 || vsVar2 == null) {
            return null;
        }
        return vsVar.c;
    }

    @Override // defpackage.vv
    public final void b(vs vsVar) {
        if (this.a == vsVar && vsVar == this.b) {
            this.b = null;
            this.a = null;
        }
        vs vsVar2 = this.a;
        if (vsVar2 == vsVar) {
            this.a = vsVar2.d;
        }
        if (this.b == vsVar) {
            this.b = a();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        vs vsVar = this.b;
        this.b = a();
        return vsVar;
    }
}

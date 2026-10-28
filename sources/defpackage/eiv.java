package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eiv implements eiu {
    private final List a;
    private enn c = null;
    private float d = -1.0f;
    private enn b = g(0.0f);

    public eiv(List list) {
        this.a = list;
    }

    private final enn g(float f) {
        List list = this.a;
        enn ennVar = (enn) list.get(list.size() - 1);
        if (f >= ennVar.c()) {
            return ennVar;
        }
        for (int size = list.size() - 2; size > 0; size--) {
            enn ennVar2 = (enn) list.get(size);
            if (this.b != ennVar2 && ennVar2.e(f)) {
                return ennVar2;
            }
        }
        return (enn) list.get(0);
    }

    @Override // defpackage.eiu
    public final float a() {
        List list = this.a;
        return ((enn) list.get(list.size() - 1)).b();
    }

    @Override // defpackage.eiu
    public final float b() {
        return ((enn) this.a.get(0)).c();
    }

    @Override // defpackage.eiu
    public final enn c() {
        return this.b;
    }

    @Override // defpackage.eiu
    public final boolean d(float f) {
        enn ennVar = this.c;
        enn ennVar2 = this.b;
        if (ennVar == ennVar2 && this.d == f) {
            return true;
        }
        this.c = ennVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.eiu
    public final boolean e() {
        return false;
    }

    @Override // defpackage.eiu
    public final boolean f(float f) {
        if (this.b.e(f)) {
            return !this.b.f();
        }
        this.b = g(f);
        return true;
    }
}

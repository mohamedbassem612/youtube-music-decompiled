package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eiw implements eiu {
    private final enn a;
    private float b = -1.0f;

    public eiw(List list) {
        this.a = (enn) list.get(0);
    }

    @Override // defpackage.eiu
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.eiu
    public final float b() {
        return this.a.c();
    }

    @Override // defpackage.eiu
    public final enn c() {
        return this.a;
    }

    @Override // defpackage.eiu
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.eiu
    public final boolean e() {
        return false;
    }

    @Override // defpackage.eiu
    public final boolean f(float f) {
        return !this.a.f();
    }
}

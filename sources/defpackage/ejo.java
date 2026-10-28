package defpackage;

import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejo extends eix {
    private final Object e;

    public ejo(enp enpVar, Object obj) {
        super(Collections.EMPTY_LIST);
        this.d = enpVar;
        this.e = obj;
    }

    @Override // defpackage.eix
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.eix
    public final Object e() {
        enp enpVar = this.d;
        Object obj = this.e;
        float f = this.c;
        return enpVar.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.eix
    public final Object f(enn ennVar, float f) {
        return e();
    }

    @Override // defpackage.eix
    public final void i() {
        if (this.d != null) {
            super.i();
        }
    }

    @Override // defpackage.eix
    public final void j(float f) {
        this.c = f;
    }
}

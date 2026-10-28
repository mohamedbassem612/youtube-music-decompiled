package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fuo extends fkx {

    @fmt(a = 3)
    @fmu(a = fmv.g)
    public int a;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float b;
    public hee[] c;

    public fuo() {
        super("TransparencyEnabledCardClip");
        this.a = -1;
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        return new fup();
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        fup fupVar = (fup) obj;
        int i = this.a;
        float f = this.b;
        fupVar.b(i);
        if (fupVar.a.getColor() != 0) {
            fupVar.a();
            fupVar.a.setColor(0);
            fupVar.b = true;
            fupVar.invalidateSelf();
        }
        fupVar.c(f);
    }

    @Override // defpackage.fgy
    public final hee[] aA() {
        return this.c;
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 2;
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        fup fupVar = (fup) obj;
        fupVar.c(0.0f);
        fupVar.b(-1);
        fupVar.a();
    }

    @Override // defpackage.fgy
    public final void ay(Object obj) {
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            fuo fuoVar = (fuo) fgyVar;
            if (this.a == fuoVar.a && Float.compare(this.b, fuoVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 3;
    }
}

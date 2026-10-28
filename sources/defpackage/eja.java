package defpackage;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eja implements eis {
    private final eis a;
    private final eix b;
    private final eix c;
    private final eix d;
    private final eix e;
    private final eix f;
    private boolean g = true;

    public eja(eis eisVar, ele eleVar, axfd axfdVar) {
        this.a = eisVar;
        eix eixVarA = ((ejz) axfdVar.e).a();
        this.b = eixVarA;
        eixVarA.h(this);
        eleVar.i(eixVarA);
        eix eixVarA2 = ((eka) axfdVar.b).a();
        this.c = eixVarA2;
        eixVarA2.h(this);
        eleVar.i(eixVarA2);
        eix eixVarA3 = ((eka) axfdVar.a).a();
        this.d = eixVarA3;
        eixVarA3.h(this);
        eleVar.i(eixVarA3);
        eix eixVarA4 = ((eka) axfdVar.d).a();
        this.e = eixVarA4;
        eixVarA4.h(this);
        eleVar.i(eixVarA4);
        eix eixVarA5 = ((eka) axfdVar.c).a();
        this.f = eixVarA5;
        eixVarA5.h(this);
        eleVar.i(eixVarA5);
    }

    public final void a(Paint paint) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((Float) this.d.e()).floatValue();
            float fFloatValue = ((Float) this.e.e()).floatValue();
            double d = dFloatValue * 0.017453292519943295d;
            float fSin = ((float) Math.sin(d)) * fFloatValue;
            float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.b.e()).intValue();
            paint.setShadowLayer(((Float) this.f.e()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.c.e()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public final void b(enp enpVar) {
        this.b.d = enpVar;
    }

    public final void c(enp enpVar) {
        this.d.d = enpVar;
    }

    @Override // defpackage.eis
    public final void d() {
        this.g = true;
        this.a.d();
    }

    public final void e(enp enpVar) {
        this.e.d = enpVar;
    }

    public final void f(enp enpVar) {
        this.c.d = new eiz(enpVar);
    }

    public final void g(enp enpVar) {
        this.f.d = enpVar;
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eiq extends ehz {
    private final ele d;
    private final String e;
    private final boolean f;
    private final eix g;
    private eix h;

    public eiq(ehm ehmVar, ele eleVar, elb elbVar) {
        super(ehmVar, eleVar, qa.K(elbVar.i), qa.J(elbVar.j), elbVar.g, elbVar.e, elbVar.f, elbVar.c, elbVar.b);
        this.d = eleVar;
        this.e = elbVar.a;
        this.f = elbVar.h;
        eix eixVarA = elbVar.d.a();
        this.g = eixVarA;
        eixVarA.h(this);
        eleVar.i(eixVarA);
    }

    @Override // defpackage.ehz, defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        super.a(obj, enpVar);
        if (obj == ehr.b) {
            this.g.d = enpVar;
            return;
        }
        if (obj == ehr.K) {
            eix eixVar = this.h;
            if (eixVar != null) {
                this.d.k(eixVar);
            }
            ejo ejoVar = new ejo(enpVar, null);
            this.h = ejoVar;
            ejoVar.h(this);
            this.d.i(this.g);
        }
    }

    @Override // defpackage.ehz, defpackage.eic
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        Paint paint = this.b;
        paint.setColor(((eiy) this.g).k());
        eix eixVar = this.h;
        if (eixVar != null) {
            paint.setColorFilter((ColorFilter) eixVar.e());
        }
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.eia
    public final String g() {
        return this.e;
    }
}

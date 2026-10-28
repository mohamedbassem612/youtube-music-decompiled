package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eim implements eis, eii, eik {
    private final String c;
    private final boolean d;
    private final ehm e;
    private final eix f;
    private final eix g;
    private final eix h;
    private boolean j;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final dov k = new dov((char[]) null, (byte[]) null);
    private eix i = null;

    public eim(ehm ehmVar, ele eleVar, eku ekuVar) {
        this.c = ekuVar.a;
        this.d = ekuVar.e;
        this.e = ehmVar;
        eix eixVarA = ekuVar.b.a();
        this.f = eixVarA;
        eix eixVarA2 = ekuVar.c.a();
        this.g = eixVarA2;
        eix eixVarA3 = ekuVar.d.a();
        this.h = eixVarA3;
        eleVar.i(eixVarA);
        eleVar.i(eixVarA2);
        eleVar.i(eixVarA3);
        eixVarA.h(this);
        eixVarA2.h(this);
        eixVarA3.h(this);
    }

    @Override // defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        eix eixVar;
        if (obj == ehr.l) {
            eixVar = this.g;
        } else if (obj == ehr.n) {
            eixVar = this.f;
        } else if (obj != ehr.m) {
            return;
        } else {
            eixVar = this.h;
        }
        eixVar.d = enpVar;
    }

    @Override // defpackage.eis
    public final void d() {
        this.j = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.ejw
    public final void e(ejv ejvVar, int i, List list, ejv ejvVar2) {
        enh.d(ejvVar, i, list, ejvVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x002c A[SYNTHETIC] */
    @Override // defpackage.eia
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            eia eiaVar = (eia) list.get(i);
            if (eiaVar instanceof eir) {
                eir eirVar = (eir) eiaVar;
                if (eirVar.e == 1) {
                    this.k.o(eirVar);
                    eirVar.a(this);
                } else if (eiaVar instanceof eio) {
                    this.i = ((eio) eiaVar).a;
                }
            } else if (eiaVar instanceof eio) {
                this.i = ((eio) eiaVar).a;
            }
        }
    }

    @Override // defpackage.eia
    public final String g() {
        return this.c;
    }

    @Override // defpackage.eik
    public final Path i() {
        eix eixVar;
        boolean z = this.j;
        Path path = this.a;
        if (!z) {
            path.reset();
            if (this.d) {
                this.j = true;
                return path;
            }
            PointF pointF = (PointF) this.g.e();
            float f = pointF.x / 2.0f;
            float f2 = pointF.y / 2.0f;
            float fK = ((ejb) this.h).k();
            if (fK == 0.0f && (eixVar = this.i) != null) {
                fK = Math.min(((Float) eixVar.e()).floatValue(), Math.min(f, f2));
            }
            float fMin = Math.min(f, f2);
            if (fK > fMin) {
                fK = fMin;
            }
            PointF pointF2 = (PointF) this.f.e();
            path.moveTo(pointF2.x + f, (pointF2.y - f2) + fK);
            path.lineTo(pointF2.x + f, (pointF2.y + f2) - fK);
            if (fK > 0.0f) {
                float f3 = fK + fK;
                RectF rectF = this.b;
                rectF.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
                path.arcTo(rectF, 0.0f, 90.0f, false);
            }
            path.lineTo((pointF2.x - f) + fK, pointF2.y + f2);
            if (fK > 0.0f) {
                float f4 = fK + fK;
                RectF rectF2 = this.b;
                rectF2.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
                path.arcTo(rectF2, 90.0f, 90.0f, false);
            }
            path.lineTo(pointF2.x - f, (pointF2.y - f2) + fK);
            if (fK > 0.0f) {
                float f5 = fK + fK;
                RectF rectF3 = this.b;
                rectF3.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
                path.arcTo(rectF3, 180.0f, 90.0f, false);
            }
            path.lineTo((pointF2.x + f) - fK, pointF2.y - f2);
            if (fK > 0.0f) {
                float f6 = fK + fK;
                RectF rectF4 = this.b;
                rectF4.set((pointF2.x + f) - f6, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + f6);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
            }
            path.close();
            this.k.p(path);
            this.j = true;
        }
        return path;
    }
}

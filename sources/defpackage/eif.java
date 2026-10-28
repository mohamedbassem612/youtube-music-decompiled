package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eif implements eic, eis, eii {
    float a;
    private final String b;
    private final boolean c;
    private final ele d;
    private final agk e = new agk(10);
    private final agk f = new agk(10);
    private final Path g;
    private final Paint h;
    private final RectF i;
    private final List j;
    private final eix k;
    private final eix l;
    private final eix m;
    private final eix n;
    private eix o;
    private ejo p;
    private final ehm q;
    private final int r;
    private eix s;
    private eja t;
    private final int u;

    public eif(ehm ehmVar, egy egyVar, ele eleVar, ekp ekpVar) {
        Path path = new Path();
        this.g = path;
        this.h = new ehy(1);
        this.i = new RectF();
        this.j = new ArrayList();
        this.a = 0.0f;
        this.d = eleVar;
        this.b = ekpVar.f;
        this.c = ekpVar.g;
        this.q = ehmVar;
        this.u = ekpVar.h;
        path.setFillType(ekpVar.a);
        this.r = (int) (egyVar.a() / 32.0f);
        eix eixVarA = ekpVar.b.a();
        this.k = eixVarA;
        eixVarA.h(this);
        eleVar.i(eixVarA);
        eix eixVarA2 = ekpVar.c.a();
        this.l = eixVarA2;
        eixVarA2.h(this);
        eleVar.i(eixVarA2);
        eix eixVarA3 = ekpVar.d.a();
        this.m = eixVarA3;
        eixVarA3.h(this);
        eleVar.i(eixVarA3);
        eix eixVarA4 = ekpVar.e.a();
        this.n = eixVarA4;
        eixVarA4.h(this);
        eleVar.i(eixVarA4);
        if (eleVar.q() != null) {
            eix eixVarA5 = ((eka) eleVar.q().a).a();
            this.s = eixVarA5;
            eixVarA5.h(this);
            eleVar.i(this.s);
        }
        if (eleVar.r() != null) {
            this.t = new eja(this, eleVar, eleVar.r());
        }
    }

    private final int h() {
        float f = this.m.c;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.c * f2);
        int iRound3 = Math.round(this.k.c * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private final int[] i(int[] iArr) {
        ejo ejoVar = this.p;
        if (ejoVar != null) {
            Integer[] numArr = (Integer[]) ejoVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length != length2) {
                int[] iArr2 = new int[length2];
                while (i < numArr.length) {
                    iArr2[i] = numArr[i].intValue();
                    i++;
                }
                return iArr2;
            }
            while (i < iArr.length) {
                iArr[i] = numArr[i].intValue();
                i++;
            }
        }
        return iArr;
    }

    @Override // defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        eja ejaVar;
        eja ejaVar2;
        eja ejaVar3;
        eja ejaVar4;
        eja ejaVar5;
        if (obj == ehr.d) {
            this.l.d = enpVar;
            return;
        }
        if (obj == ehr.K) {
            eix eixVar = this.o;
            if (eixVar != null) {
                this.d.k(eixVar);
            }
            ejo ejoVar = new ejo(enpVar, null);
            this.o = ejoVar;
            ejoVar.h(this);
            this.d.i(this.o);
            return;
        }
        if (obj == ehr.L) {
            ejo ejoVar2 = this.p;
            if (ejoVar2 != null) {
                this.d.k(ejoVar2);
            }
            this.e.h();
            this.f.h();
            ejo ejoVar3 = new ejo(enpVar, null);
            this.p = ejoVar3;
            ejoVar3.h(this);
            this.d.i(this.p);
            return;
        }
        if (obj == ehr.j) {
            eix eixVar2 = this.s;
            if (eixVar2 != null) {
                eixVar2.d = enpVar;
                return;
            }
            ejo ejoVar4 = new ejo(enpVar, null);
            this.s = ejoVar4;
            ejoVar4.h(this);
            this.d.i(this.s);
            return;
        }
        if (obj == ehr.e && (ejaVar5 = this.t) != null) {
            ejaVar5.b(enpVar);
            return;
        }
        if (obj == ehr.G && (ejaVar4 = this.t) != null) {
            ejaVar4.f(enpVar);
            return;
        }
        if (obj == ehr.H && (ejaVar3 = this.t) != null) {
            ejaVar3.c(enpVar);
            return;
        }
        if (obj == ehr.I && (ejaVar2 = this.t) != null) {
            ejaVar2.e(enpVar);
        } else {
            if (obj != ehr.J || (ejaVar = this.t) == null) {
                return;
            }
            ejaVar.g(enpVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00df  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:30:0x0105  */
    /* JADX WARN: Code duplicated, block: B:34:0x0115  */
    @Override // defpackage.eic
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        float f;
        Paint paint;
        eix eixVar;
        eix eixVar2;
        eja ejaVar;
        float fFloatValue;
        if (this.c) {
            return;
        }
        Path path = this.g;
        path.reset();
        int i2 = 0;
        while (true) {
            List list = this.j;
            if (i2 >= list.size()) {
                break;
            }
            path.addPath(((eik) list.get(i2)).i(), matrix);
            i2++;
        }
        path.computeBounds(this.i, false);
        if (this.u != 1) {
            int iH = h();
            agk agkVar = this.f;
            long j = iH;
            shader = (RadialGradient) agkVar.e(j);
            if (shader == null) {
                PointF pointF = (PointF) this.m.e();
                PointF pointF2 = (PointF) this.n.e();
                eko ekoVar = (eko) this.k.e();
                int[] iArrI = i(ekoVar.b);
                float[] fArr = ekoVar.a;
                float f2 = pointF.x;
                float f3 = pointF.y;
                f = 0.0f;
                float fHypot = (float) Math.hypot(pointF2.x - f2, pointF2.y - f3);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient = new RadialGradient(f2, f3, fHypot, iArrI, fArr, Shader.TileMode.CLAMP);
                agkVar.i(j, radialGradient);
                shader = radialGradient;
            }
            shader.setLocalMatrix(matrix);
            paint = this.h;
            paint.setShader(shader);
            eixVar = this.o;
            if (eixVar != null) {
                paint.setColorFilter((ColorFilter) eixVar.e());
            }
            eixVar2 = this.s;
            if (eixVar2 != null) {
                fFloatValue = ((Float) eixVar2.e()).floatValue();
                if (fFloatValue == f) {
                    paint.setMaskFilter(null);
                } else if (fFloatValue != this.a) {
                    paint.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
                }
                this.a = fFloatValue;
            }
            ejaVar = this.t;
            if (ejaVar != null) {
                ejaVar.a(paint);
            }
            float fIntValue = ((Integer) this.l.e()).intValue();
            int i3 = enh.a;
            paint.setAlpha(Math.max(0, Math.min(255, (int) ((((i / 255.0f) * fIntValue) / 100.0f) * 255.0f))));
            canvas.drawPath(path, paint);
        }
        int iH2 = h();
        agk agkVar2 = this.e;
        long j2 = iH2;
        shader = (LinearGradient) agkVar2.e(j2);
        if (shader == null) {
            PointF pointF3 = (PointF) this.m.e();
            PointF pointF4 = (PointF) this.n.e();
            eko ekoVar2 = (eko) this.k.e();
            LinearGradient linearGradient = new LinearGradient(pointF3.x, pointF3.y, pointF4.x, pointF4.y, i(ekoVar2.b), ekoVar2.a, Shader.TileMode.CLAMP);
            agkVar2.i(j2, linearGradient);
            shader = linearGradient;
        }
        f = 0.0f;
        shader.setLocalMatrix(matrix);
        paint = this.h;
        paint.setShader(shader);
        eixVar = this.o;
        if (eixVar != null) {
            paint.setColorFilter((ColorFilter) eixVar.e());
        }
        eixVar2 = this.s;
        if (eixVar2 != null) {
            fFloatValue = ((Float) eixVar2.e()).floatValue();
            if (fFloatValue == f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue != this.a) {
                paint.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.a = fFloatValue;
        }
        ejaVar = this.t;
        if (ejaVar != null) {
            ejaVar.a(paint);
        }
        float fIntValue2 = ((Integer) this.l.e()).intValue();
        int i4 = enh.a;
        paint.setAlpha(Math.max(0, Math.min(255, (int) ((((i / 255.0f) * fIntValue2) / 100.0f) * 255.0f))));
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.eic
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.g;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.j;
            if (i >= list.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((eik) list.get(i)).i(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.eis
    public final void d() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.ejw
    public final void e(ejv ejvVar, int i, List list, ejv ejvVar2) {
        enh.d(ejvVar, i, list, ejvVar2, this);
    }

    @Override // defpackage.eia
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            eia eiaVar = (eia) list2.get(i);
            if (eiaVar instanceof eik) {
                this.j.add((eik) eiaVar);
            }
        }
    }

    @Override // defpackage.eia
    public final String g() {
        return this.b;
    }
}

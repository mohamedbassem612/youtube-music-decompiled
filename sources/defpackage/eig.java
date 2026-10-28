package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eig extends ehz {
    private final String d;
    private final boolean e;
    private final agk f;
    private final agk g;
    private final RectF h;
    private final int i;
    private final eix j;
    private final eix k;
    private final eix l;
    private ejo m;
    private final int n;

    public eig(ehm ehmVar, ele eleVar, ekq ekqVar) {
        super(ehmVar, eleVar, qa.K(ekqVar.l), qa.J(ekqVar.m), ekqVar.g, ekqVar.c, ekqVar.f, ekqVar.h, ekqVar.i);
        this.f = new agk(10);
        this.g = new agk(10);
        this.h = new RectF();
        this.d = ekqVar.a;
        this.n = ekqVar.k;
        this.e = ekqVar.j;
        this.i = (int) (ehmVar.a.a() / 32.0f);
        eix eixVarA = ekqVar.b.a();
        this.j = eixVarA;
        eixVarA.h(this);
        eleVar.i(eixVarA);
        eix eixVarA2 = ekqVar.d.a();
        this.k = eixVarA2;
        eixVarA2.h(this);
        eleVar.i(eixVarA2);
        eix eixVarA3 = ekqVar.e.a();
        this.l = eixVarA3;
        eixVarA3.h(this);
        eleVar.i(eixVarA3);
    }

    private final int h() {
        float f = this.k.c;
        float f2 = this.i;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.l.c * f2);
        int iRound3 = Math.round(this.j.c * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private final int[] i(int[] iArr) {
        ejo ejoVar = this.m;
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

    @Override // defpackage.ehz, defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        super.a(obj, enpVar);
        if (obj == ehr.L) {
            ejo ejoVar = this.m;
            if (ejoVar != null) {
                this.a.k(ejoVar);
            }
            ejo ejoVar2 = new ejo(enpVar, null);
            this.m = ejoVar2;
            ejoVar2.h(this);
            this.a.i(this.m);
        }
    }

    @Override // defpackage.ehz, defpackage.eic
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.e) {
            return;
        }
        c(this.h, matrix, false);
        if (this.n == 1) {
            int iH = h();
            agk agkVar = this.f;
            long j = iH;
            shader = (LinearGradient) agkVar.e(j);
            if (shader == null) {
                PointF pointF = (PointF) this.k.e();
                PointF pointF2 = (PointF) this.l.e();
                eko ekoVar = (eko) this.j.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i(ekoVar.b), ekoVar.a, Shader.TileMode.CLAMP);
                agkVar.i(j, radialGradient);
                shader = radialGradient;
            }
        } else {
            int iH2 = h();
            agk agkVar2 = this.g;
            long j2 = iH2;
            shader = (RadialGradient) agkVar2.e(j2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.k.e();
                PointF pointF4 = (PointF) this.l.e();
                eko ekoVar2 = (eko) this.j.e();
                int[] iArrI = i(ekoVar2.b);
                float[] fArr = ekoVar2.a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointF4.x - f, pointF4.y - f2), iArrI, fArr, Shader.TileMode.CLAMP);
                agkVar2.i(j2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.b.setShader(shader);
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.eia
    public final String g() {
        return this.d;
    }
}

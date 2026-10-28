package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ehz implements eis, eii, eic {
    protected final ele a;
    final Paint b;
    float c;
    private final ehm h;
    private final float[] j;
    private final eix k;
    private final eix l;
    private final List m;
    private final eix n;
    private eix o;
    private eix p;
    private eja q;
    private final PathMeasure d = new PathMeasure();
    private final Path e = new Path();
    private final Path f = new Path();
    private final RectF g = new RectF();
    private final List i = new ArrayList();

    public ehz(ehm ehmVar, ele eleVar, Paint.Cap cap, Paint.Join join, float f, ekc ekcVar, eka ekaVar, List list, eka ekaVar2) {
        ehy ehyVar = new ehy(1);
        this.b = ehyVar;
        this.c = 0.0f;
        this.h = ehmVar;
        this.a = eleVar;
        ehyVar.setStyle(Paint.Style.STROKE);
        ehyVar.setStrokeCap(cap);
        ehyVar.setStrokeJoin(join);
        ehyVar.setStrokeMiter(f);
        this.l = ekcVar.a();
        this.k = ekaVar.a();
        if (ekaVar2 == null) {
            this.n = null;
        } else {
            this.n = ekaVar2.a();
        }
        this.m = new ArrayList(list.size());
        this.j = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.m.add(((eka) list.get(i)).a());
        }
        eleVar.i(this.l);
        eleVar.i(this.k);
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            eleVar.i((eix) this.m.get(i2));
        }
        eix eixVar = this.n;
        if (eixVar != null) {
            eleVar.i(eixVar);
        }
        this.l.h(this);
        this.k.h(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((eix) this.m.get(i3)).h(this);
        }
        eix eixVar2 = this.n;
        if (eixVar2 != null) {
            eixVar2.h(this);
        }
        if (eleVar.q() != null) {
            eix eixVarA = ((eka) eleVar.q().a).a();
            this.p = eixVarA;
            eixVarA.h(this);
            eleVar.i(this.p);
        }
        if (eleVar.r() != null) {
            this.q = new eja(this, eleVar, eleVar.r());
        }
    }

    @Override // defpackage.ejw
    public void a(Object obj, enp enpVar) {
        eja ejaVar;
        eja ejaVar2;
        eja ejaVar3;
        eja ejaVar4;
        eja ejaVar5;
        eix eixVar;
        if (obj == ehr.d) {
            eixVar = this.l;
        } else {
            if (obj != ehr.s) {
                if (obj == ehr.K) {
                    eix eixVar2 = this.o;
                    if (eixVar2 != null) {
                        this.a.k(eixVar2);
                    }
                    ejo ejoVar = new ejo(enpVar, null);
                    this.o = ejoVar;
                    ejoVar.h(this);
                    this.a.i(this.o);
                    return;
                }
                if (obj == ehr.j) {
                    eix eixVar3 = this.p;
                    if (eixVar3 != null) {
                        eixVar3.d = enpVar;
                        return;
                    }
                    ejo ejoVar2 = new ejo(enpVar, null);
                    this.p = ejoVar2;
                    ejoVar2.h(this);
                    this.a.i(this.p);
                    return;
                }
                if (obj == ehr.e && (ejaVar5 = this.q) != null) {
                    ejaVar5.b(enpVar);
                    return;
                }
                if (obj == ehr.G && (ejaVar4 = this.q) != null) {
                    ejaVar4.f(enpVar);
                    return;
                }
                if (obj == ehr.H && (ejaVar3 = this.q) != null) {
                    ejaVar3.c(enpVar);
                    return;
                }
                if (obj == ehr.I && (ejaVar2 = this.q) != null) {
                    ejaVar2.e(enpVar);
                    return;
                } else {
                    if (obj != ehr.J || (ejaVar = this.q) == null) {
                        return;
                    }
                    ejaVar.g(enpVar);
                    return;
                }
            }
            eixVar = this.k;
        }
        eixVar.d = enpVar;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01f2  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.eic
    public void b(Canvas canvas, Matrix matrix, int i) {
        float[] fArr = (float[]) enm.a.get();
        boolean z = false;
        float f = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            return;
        }
        ejd ejdVar = (ejd) this.l;
        float fK = ejdVar.k(ejdVar.d(), ejdVar.b());
        Paint paint = this.b;
        int i2 = enh.a;
        float f2 = (i / 255.0f) * fK;
        float f3 = 100.0f;
        paint.setAlpha(Math.max(0, Math.min(255, (int) ((f2 / 100.0f) * 255.0f))));
        paint.setStrokeWidth(((ejb) this.k).k() * enm.b(matrix));
        if (paint.getStrokeWidth() <= 0.0f) {
            return;
        }
        List list = this.m;
        if (!list.isEmpty()) {
            float fB = enm.b(matrix);
            for (int i3 = 0; i3 < list.size(); i3++) {
                float[] fArr2 = this.j;
                float fFloatValue = ((Float) ((eix) list.get(i3)).e()).floatValue();
                fArr2[i3] = fFloatValue;
                if (i3 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr2[i3] = 1.0f;
                        fFloatValue = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr2[i3] = 0.1f;
                    fFloatValue = 0.1f;
                }
                fArr2[i3] = fFloatValue * fB;
            }
            eix eixVar = this.n;
            paint.setPathEffect(new DashPathEffect(this.j, eixVar == null ? 0.0f : ((Float) eixVar.e()).floatValue() * fB));
        }
        eix eixVar2 = this.o;
        if (eixVar2 != null) {
            paint.setColorFilter((ColorFilter) eixVar2.e());
        }
        eix eixVar3 = this.p;
        if (eixVar3 != null) {
            float fFloatValue2 = ((Float) eixVar3.e()).floatValue();
            if (fFloatValue2 == 0.0f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue2 != this.c) {
                paint.setMaskFilter(this.a.h(fFloatValue2));
            }
            this.c = fFloatValue2;
        }
        eja ejaVar = this.q;
        if (ejaVar != null) {
            ejaVar.a(paint);
        }
        int i4 = 0;
        while (true) {
            List list2 = this.i;
            if (i4 >= list2.size()) {
                return;
            }
            boy boyVar = (boy) list2.get(i4);
            Object obj = boyVar.b;
            Path path = this.e;
            if (obj != null) {
                path.reset();
                ?? r7 = boyVar.a;
                int size = r7.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        path.addPath(((eik) r7.get(size)).i(), matrix);
                    }
                }
                eir eirVar = (eir) obj;
                float fFloatValue3 = ((Float) eirVar.b.e()).floatValue() / f3;
                float fFloatValue4 = ((Float) eirVar.c.e()).floatValue() / f3;
                float fFloatValue5 = ((Float) eirVar.d.e()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = this.d;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f4 = fFloatValue5 * length;
                    float f5 = (fFloatValue3 * length) + f4;
                    float fMin = Math.min((fFloatValue4 * length) + f4, (f5 + length) - 1.0f);
                    int size2 = r7.size() - 1;
                    float f6 = f;
                    while (size2 >= 0) {
                        Path path2 = this.f;
                        path2.set(((eik) r7.get(size2)).i());
                        path2.transform(matrix);
                        pathMeasure.setPath(path2, z);
                        float length2 = pathMeasure.getLength();
                        float f7 = f6 + length2;
                        if (fMin > length) {
                            float f8 = fMin - length;
                            if (f8 < f7 && f6 < f8) {
                                enm.d(path2, f5 > length ? (f5 - length) / length2 : 0.0f, Math.min(f8 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, paint);
                            } else if (f7 < f5 && f6 <= fMin) {
                                if (f7 > fMin || f5 >= f6) {
                                    float f9 = f5 < f6 ? 0.0f : (f5 - f6) / length2;
                                    float f10 = fMin > f7 ? 1.0f : (fMin - f6) / length2;
                                    f = 0.0f;
                                    enm.d(path2, f9, f10, 0.0f);
                                    canvas.drawPath(path2, paint);
                                } else {
                                    canvas.drawPath(path2, paint);
                                }
                            }
                        } else {
                            f = f7 < f5 ? 0.0f : 0.0f;
                        }
                        size2--;
                        f6 = f7;
                        z = false;
                    }
                } else {
                    canvas.drawPath(path, paint);
                }
            } else {
                path.reset();
                ?? r4 = boyVar.a;
                int size3 = r4.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    } else {
                        path.addPath(((eik) r4.get(size3)).i(), matrix);
                    }
                }
                canvas.drawPath(path, paint);
            }
            i4++;
            z = false;
            f3 = 100.0f;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.eic
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.e;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.i;
            if (i >= list.size()) {
                RectF rectF2 = this.g;
                path.computeBounds(rectF2, false);
                float fK = ((ejb) this.k).k() / 2.0f;
                rectF2.set(rectF2.left - fK, rectF2.top - fK, rectF2.right + fK, rectF2.bottom + fK);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            boy boyVar = (boy) list.get(i);
            int i2 = 0;
            while (true) {
                ?? r4 = boyVar.a;
                if (i2 < r4.size()) {
                    path.addPath(((eik) r4.get(i2)).i(), matrix);
                    i2++;
                }
            }
            i++;
        }
    }

    @Override // defpackage.eis
    public final void d() {
        this.h.invalidateSelf();
    }

    @Override // defpackage.ejw
    public final void e(ejv ejvVar, int i, List list, ejv ejvVar2) {
        enh.d(ejvVar, i, list, ejvVar2, this);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.eia
    public final void f(List list, List list2) {
        boy boyVar = null;
        eir eirVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            eia eiaVar = (eia) list.get(size);
            if (eiaVar instanceof eir) {
                eir eirVar2 = (eir) eiaVar;
                if (eirVar2.e == 2) {
                    eirVar = eirVar2;
                }
            }
        }
        if (eirVar != null) {
            eirVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            eia eiaVar2 = (eia) list2.get(size2);
            if (eiaVar2 instanceof eir) {
                eir eirVar3 = (eir) eiaVar2;
                if (eirVar3.e == 2) {
                    if (boyVar != null) {
                        this.i.add(boyVar);
                    }
                    boy boyVar2 = new boy(eirVar3);
                    eirVar3.a(this);
                    boyVar = boyVar2;
                }
            }
            if (eiaVar2 instanceof eik) {
                if (boyVar == null) {
                    boyVar = new boy(eirVar);
                }
                boyVar.a.add((eik) eiaVar2);
            }
        }
        if (boyVar != null) {
            this.i.add(boyVar);
        }
    }
}

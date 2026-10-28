package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ele implements eic, eis, ejw {
    final Matrix a;
    final ehm b;
    public final elh c;
    public ejb d;
    public ele e;
    public ele f;
    final ejn g;
    float h;
    BlurMaskFilter i;
    private final Path j = new Path();
    private final Matrix k = new Matrix();
    private final Matrix l = new Matrix();
    private final Paint m = new ehy(1);
    private final Paint n = new ehy(PorterDuff.Mode.DST_IN, null);
    private final Paint o = new ehy(PorterDuff.Mode.DST_OUT, null);
    private final Paint p;
    private final Paint q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private final RectF v;
    private List w;
    private final List x;
    private boolean y;
    private hed z;

    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, java.util.List] */
    public ele(ehm ehmVar, elh elhVar) {
        ehy ehyVar = new ehy(1);
        this.p = ehyVar;
        this.q = new ehy(PorterDuff.Mode.CLEAR);
        this.r = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectF();
        this.v = new RectF();
        this.a = new Matrix();
        this.x = new ArrayList();
        this.y = true;
        this.h = 0.0f;
        this.b = ehmVar;
        this.c = elhVar;
        String str = elhVar.c;
        if (elhVar.u == 3) {
            ehyVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            ehyVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        ejn ejnVar = new ejn(elhVar.h);
        this.g = ejnVar;
        ejnVar.d(this);
        List list = elhVar.g;
        if (list != null && !list.isEmpty()) {
            hed hedVar = new hed(elhVar.g);
            this.z = hedVar;
            Iterator it = hedVar.b.iterator();
            while (it.hasNext()) {
                ((eix) it.next()).h(this);
            }
            for (eix eixVar : this.z.c) {
                i(eixVar);
                eixVar.h(this);
            }
        }
        if (this.c.r.isEmpty()) {
            n(true);
            return;
        }
        ejb ejbVar = new ejb(this.c.r);
        this.d = ejbVar;
        ejbVar.b = true;
        ejbVar.h(new eis() { // from class: eld
            @Override // defpackage.eis
            public final void d() {
                ele eleVar = this.a;
                eleVar.n(eleVar.d.k() == 1.0f);
            }
        });
        n(((Float) this.d.e()).floatValue() == 1.0f);
        i(this.d);
    }

    private final void s() {
        if (this.w == null) {
            if (this.f == null) {
                this.w = Collections.EMPTY_LIST;
                return;
            }
            this.w = new ArrayList();
            for (ele eleVar = this.f; eleVar != null; eleVar = eleVar.f) {
                this.w.add(eleVar);
            }
        }
    }

    private final void t(Canvas canvas) {
        RectF rectF = this.r;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.q);
    }

    private final void u() {
        this.b.invalidateSelf();
    }

    private final void v() {
        qa qaVar = this.b.a.o;
        String str = this.c.c;
    }

    @Override // defpackage.ejw
    public void a(Object obj, enp enpVar) {
        this.g.e(obj, enpVar);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v48, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.eic
    public final void b(Canvas canvas, Matrix matrix, int i) throws Throwable {
        Throwable th;
        float f;
        RectF rectF;
        Integer num;
        if (this.y) {
            elh elhVar = this.c;
            if (elhVar.s) {
                return;
            }
            s();
            Matrix matrix2 = this.k;
            matrix2.reset();
            matrix2.set(matrix);
            int size = this.w.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    matrix2.preConcat(((ele) this.w.get(size)).g.a());
                }
            }
            ejn ejnVar = this.g;
            eix eixVar = ejnVar.e;
            int iIntValue = 100;
            if (eixVar != null && (num = (Integer) eixVar.e()) != null) {
                iIntValue = num.intValue();
            }
            int i2 = (int) ((((i / 255.0f) * iIntValue) / 100.0f) * 255.0f);
            if (!p() && !o()) {
                matrix2.preConcat(ejnVar.a());
                j(canvas, matrix2, i2);
                v();
                return;
            }
            RectF rectF2 = this.r;
            c(rectF2, matrix2, false);
            int i3 = 3;
            if (p() && elhVar.u != 3) {
                RectF rectF3 = this.u;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.e.c(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(ejnVar.a());
            RectF rectF4 = this.t;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i4 = 2;
            if (o()) {
                int size2 = this.z.a.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        th = null;
                        if (!rectF2.intersect(rectF4)) {
                            f = 0.0f;
                            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                            break;
                        }
                    } else {
                        ekr ekrVar = (ekr) this.z.a.get(i5);
                        th = null;
                        Path path = (Path) ((eix) this.z.b.get(i5)).e();
                        if (path != null) {
                            Path path2 = this.j;
                            path2.set(path);
                            path2.transform(matrix2);
                            int i6 = ekrVar.b;
                            int i7 = i6 - 1;
                            if (i6 == 0) {
                                throw null;
                            }
                            if (i7 != 0) {
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 == i3) {
                                        }
                                        rectF = this.v;
                                        path2.computeBounds(rectF, false);
                                        if (i5 == 0) {
                                            rectF4.set(rectF);
                                        } else {
                                            rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                        }
                                    }
                                }
                            }
                            if (ekrVar.a) {
                            }
                            rectF = this.v;
                            path2.computeBounds(rectF, false);
                            if (i5 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                            }
                        }
                        i5++;
                        i3 = 3;
                    }
                    f = 0.0f;
                    break;
                }
            } else {
                f = 0.0f;
                th = null;
            }
            RectF rectF5 = this.s;
            rectF5.set(f, f, canvas.getWidth(), canvas.getHeight());
            Matrix matrix3 = this.l;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f, f, f, f);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                Paint paint = this.m;
                paint.setAlpha(255);
                ThreadLocal threadLocal = enm.a;
                canvas.saveLayer(rectF2, paint);
                t(canvas);
                j(canvas, matrix2, i2);
                if (o()) {
                    Paint paint2 = this.n;
                    canvas.saveLayer(rectF2, paint2);
                    if (Build.VERSION.SDK_INT < 28) {
                        t(canvas);
                    }
                    int i8 = 0;
                    while (i8 < this.z.a.size()) {
                        ekr ekrVar2 = (ekr) this.z.a.get(i8);
                        eix eixVar2 = (eix) this.z.b.get(i8);
                        eix eixVar3 = (eix) this.z.c.get(i8);
                        int i9 = ekrVar2.b;
                        int i10 = i9 - 1;
                        if (i9 == 0) {
                            throw th;
                        }
                        if (i10 != 0) {
                            if (i10 == 1) {
                                if (i8 == 0) {
                                    paint.setColor(-16777216);
                                    paint.setAlpha(255);
                                    canvas.drawRect(rectF2, paint);
                                    i8 = 0;
                                }
                                if (ekrVar2.a) {
                                    Paint paint3 = this.o;
                                    canvas.saveLayer(rectF2, paint3);
                                    canvas.drawRect(rectF2, paint);
                                    paint3.setAlpha((int) (((Integer) eixVar3.e()).intValue() * 2.55f));
                                    Path path3 = (Path) eixVar2.e();
                                    Path path4 = this.j;
                                    path4.set(path3);
                                    path4.transform(matrix2);
                                    canvas.drawPath(path4, paint3);
                                    canvas.restore();
                                } else {
                                    Path path5 = (Path) eixVar2.e();
                                    Path path6 = this.j;
                                    path6.set(path5);
                                    path6.transform(matrix2);
                                    canvas.drawPath(path6, this.o);
                                }
                            } else if (i10 != i4) {
                                if (i10 == 3 && !this.z.b.isEmpty()) {
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= this.z.a.size()) {
                                            paint.setAlpha(255);
                                            canvas.drawRect(rectF2, paint);
                                            break;
                                        } else if (((ekr) this.z.a.get(i11)).b != 4) {
                                            break;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            } else if (ekrVar2.a) {
                                canvas.saveLayer(rectF2, paint2);
                                canvas.drawRect(rectF2, paint);
                                Paint paint4 = this.o;
                                paint4.setAlpha((int) (((Integer) eixVar3.e()).intValue() * 2.55f));
                                Path path7 = (Path) eixVar2.e();
                                Path path8 = this.j;
                                path8.set(path7);
                                path8.transform(matrix2);
                                canvas.drawPath(path8, paint4);
                                canvas.restore();
                            } else {
                                canvas.saveLayer(rectF2, paint2);
                                Path path9 = (Path) eixVar2.e();
                                Path path10 = this.j;
                                path10.set(path9);
                                path10.transform(matrix2);
                                paint.setAlpha((int) (((Integer) eixVar3.e()).intValue() * 2.55f));
                                canvas.drawPath(path10, paint);
                                canvas.restore();
                            }
                        } else if (ekrVar2.a) {
                            canvas.saveLayer(rectF2, paint);
                            canvas.drawRect(rectF2, paint);
                            Path path11 = (Path) eixVar2.e();
                            Path path12 = this.j;
                            path12.set(path11);
                            path12.transform(matrix2);
                            paint.setAlpha((int) (((Integer) eixVar3.e()).intValue() * 2.55f));
                            canvas.drawPath(path12, this.o);
                            canvas.restore();
                        } else {
                            Path path13 = (Path) eixVar2.e();
                            Path path14 = this.j;
                            path14.set(path13);
                            path14.transform(matrix2);
                            paint.setAlpha((int) (((Integer) eixVar3.e()).intValue() * 2.55f));
                            canvas.drawPath(path14, paint);
                        }
                        i8++;
                        i4 = 2;
                    }
                    canvas.restore();
                }
                if (p()) {
                    canvas.saveLayer(rectF2, this.p);
                    t(canvas);
                    this.e.b(canvas, matrix, i2);
                    canvas.restore();
                }
                canvas.restore();
            }
            v();
        }
    }

    @Override // defpackage.eic
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.r.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        if (z) {
            List list = this.w;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(((ele) this.w.get(size)).g.a());
                    }
                }
            } else {
                ele eleVar = this.f;
                if (eleVar != null) {
                    matrix2.preConcat(eleVar.g.a());
                }
            }
        }
        matrix2.preConcat(this.g.a());
    }

    @Override // defpackage.eis
    public final void d() {
        u();
    }

    @Override // defpackage.ejw
    public final void e(ejv ejvVar, int i, List list, ejv ejvVar2) {
        ele eleVar = this.e;
        if (eleVar != null) {
            ejv ejvVarB = ejvVar2.b(eleVar.g());
            if (ejvVar.d(this.e.g(), i)) {
                list.add(ejvVarB.c(this.e));
            }
            if (ejvVar.f(g(), i)) {
                this.e.l(ejvVar, ejvVar.a(this.e.g(), i) + i, list, ejvVarB);
            }
        }
        if (ejvVar.e(g(), i)) {
            if (!"__container".equals(g())) {
                ejvVar2 = ejvVar2.b(g());
                if (ejvVar.d(g(), i)) {
                    list.add(ejvVar2.c(this));
                }
            }
            if (ejvVar.f(g(), i)) {
                l(ejvVar, i + ejvVar.a(g(), i), list, ejvVar2);
            }
        }
    }

    @Override // defpackage.eia
    public final String g() {
        return this.c.c;
    }

    public final BlurMaskFilter h(float f) {
        if (this.h == f) {
            return this.i;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.i = blurMaskFilter;
        this.h = f;
        return blurMaskFilter;
    }

    public final void i(eix eixVar) {
        if (eixVar != null) {
            this.x.add(eixVar);
        }
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i);

    public final void k(eix eixVar) {
        this.x.remove(eixVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    public void m(float f) {
        ejn ejnVar = this.g;
        eix eixVar = ejnVar.e;
        if (eixVar != null) {
            eixVar.j(f);
        }
        eix eixVar2 = ejnVar.h;
        if (eixVar2 != null) {
            eixVar2.j(f);
        }
        eix eixVar3 = ejnVar.i;
        if (eixVar3 != null) {
            eixVar3.j(f);
        }
        eix eixVar4 = ejnVar.a;
        if (eixVar4 != null) {
            eixVar4.j(f);
        }
        eix eixVar5 = ejnVar.b;
        if (eixVar5 != null) {
            eixVar5.j(f);
        }
        eix eixVar6 = ejnVar.c;
        if (eixVar6 != null) {
            eixVar6.j(f);
        }
        eix eixVar7 = ejnVar.d;
        if (eixVar7 != null) {
            eixVar7.j(f);
        }
        ejb ejbVar = ejnVar.f;
        if (ejbVar != null) {
            ejbVar.j(f);
        }
        ejb ejbVar2 = ejnVar.g;
        if (ejbVar2 != null) {
            ejbVar2.j(f);
        }
        int i = 0;
        if (this.z != null) {
            for (int i2 = 0; i2 < this.z.b.size(); i2++) {
                ((eix) this.z.b.get(i2)).j(f);
            }
        }
        ejb ejbVar3 = this.d;
        if (ejbVar3 != null) {
            ejbVar3.j(f);
        }
        ele eleVar = this.e;
        if (eleVar != null) {
            eleVar.m(f);
        }
        while (true) {
            List list = this.x;
            if (i >= list.size()) {
                return;
            }
            ((eix) list.get(i)).j(f);
            i++;
        }
    }

    public final void n(boolean z) {
        if (z != this.y) {
            this.y = z;
            u();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    final boolean o() {
        hed hedVar = this.z;
        return (hedVar == null || hedVar.b.isEmpty()) ? false : true;
    }

    final boolean p() {
        return this.e != null;
    }

    public dov q() {
        return this.c.w;
    }

    public axfd r() {
        return this.c.y;
    }

    @Override // defpackage.eia
    public final void f(List list, List list2) {
    }

    public void l(ejv ejvVar, int i, List list, ejv ejvVar2) {
    }
}

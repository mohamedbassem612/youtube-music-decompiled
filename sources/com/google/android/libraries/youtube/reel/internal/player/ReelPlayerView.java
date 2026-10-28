package com.google.android.libraries.youtube.reel.internal.player;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import defpackage.acdk;
import defpackage.acfz;
import defpackage.acor;
import defpackage.acos;
import defpackage.acte;
import defpackage.acuo;
import defpackage.acvo;
import defpackage.acvp;
import defpackage.acvq;
import defpackage.acvr;
import defpackage.acvs;
import defpackage.acvt;
import defpackage.acvu;
import defpackage.ahbd;
import defpackage.avlh;
import defpackage.avmb;
import defpackage.avmm;
import defpackage.awku;
import defpackage.hno;
import defpackage.twm;
import defpackage.vxz;
import defpackage.zki;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ReelPlayerView extends acdk implements acvq, acuo {
    private static final Double o = Double.valueOf(0.8d);
    public final awku a;
    public ViewGroup b;
    public avmb c;
    public boolean d;
    public int e;
    public int h;
    public int i;
    public acvs j;
    public boolean k;
    public boolean l;
    public acor m;
    public hno n;
    private final avmm p;
    private final awku q;
    private acvu r;
    private boolean s;
    private double t;
    private float u;
    private boolean v;
    private double w;
    private String x;
    private boolean y;

    public ReelPlayerView(Context context) {
        super(context);
        this.p = new avmm();
        this.a = new awku();
        this.q = new awku();
        this.d = false;
        acvt acvtVarA = acvu.a();
        acvs acvsVar = acvs.a;
        acvtVarA.b = avlh.G(acvsVar);
        acvtVarA.a = avlh.G(acos.a);
        this.r = acvtVarA.a();
        this.e = 0;
        this.h = 0;
        this.i = 0;
        Optional.empty();
        this.j = acvsVar;
        this.s = true;
        this.t = 0.0d;
        this.u = 1.9f;
        this.v = false;
        this.w = 0.0d;
        this.x = "ASPECT_FIT";
        this.y = false;
    }

    private static boolean n(int i, int i2) {
        return ((double) i2) / ((double) i) <= 1.5d;
    }

    @Override // defpackage.acvq
    public final ViewGroup a() {
        return this.b;
    }

    @Override // defpackage.acvq
    public final zki b() {
        return this.f;
    }

    @Override // defpackage.acvq
    public final acvp c() {
        return new acvp(this.x, this.w);
    }

    @Override // defpackage.acvq
    public final void e(boolean z) {
        this.v = z;
    }

    @Override // defpackage.acuo
    public final void f() {
        if (this.y) {
            this.y = false;
            requestLayout();
        }
    }

    @Override // defpackage.acvq
    public final void g(double d) {
        this.t = d;
    }

    @Override // defpackage.acuo
    public final void h(float f, float f2, float f3, float f4) {
        if (ahbd.f(f, 0.0d) < 0 || ahbd.f(f2, 0.0d) < 0 || ahbd.f(f3, 0.0d) <= 0 || ahbd.f(f4, 0.0d) <= 0 || ahbd.f(f + f3, 1.0d) > 0 || ahbd.f(f2 + f4, 1.0d) > 0) {
            f();
        } else {
            this.y = true;
            requestLayout();
        }
    }

    @Override // defpackage.acvq
    public final void i(acvu acvuVar) {
        this.r = acvuVar;
        this.s = acvuVar.g;
        avmm avmmVar = this.p;
        avmmVar.b();
        if (this.c != null) {
            avlh avlhVarP = acvuVar.c.a.p().P();
            avmb avmbVar = this.c;
            avmbVar.getClass();
            avmmVar.c(avlhVarP.L(avmbVar).ak(new acte(this, 13)));
            acvr acvrVar = acvuVar.d;
            avlh avlhVarP2 = acvrVar.a.p().P();
            avmb avmbVar2 = this.c;
            avmbVar2.getClass();
            avmmVar.c(avlhVarP2.L(avmbVar2).ak(new acte(this, 14)));
            hno hnoVar = this.n;
            avlh avlhVarP3 = ((hnoVar == null || !((vxz) hnoVar.i).l(295, 45834235L, false)) ? acvuVar.b : acvuVar.b.p()).P();
            avmb avmbVar3 = this.c;
            avmbVar3.getClass();
            avmmVar.c(avlhVarP3.L(avmbVar3).ak(new acte(this, 15)));
            avlh avlhVarP4 = acvrVar.b.p().P();
            avmb avmbVar4 = this.c;
            avmbVar4.getClass();
            avmmVar.c(avlhVarP4.L(avmbVar4).ak(new acte(this, 16)));
            hno hnoVar2 = this.n;
            hnoVar2.getClass();
            if (((vxz) hnoVar2.i).l(102, 45662826L, false)) {
                avlh avlhVarP5 = acvrVar.c.p().P();
                avmb avmbVar5 = this.c;
                avmbVar5.getClass();
                avmmVar.c(avlhVarP5.L(avmbVar5).ak(new acte(this, 17)));
            }
            avlh avlhVarP6 = acvuVar.a.P();
            avmb avmbVar6 = this.c;
            avmbVar6.getClass();
            avmmVar.c(avlhVarP6.L(avmbVar6).ak(new acte(this, 18)));
        }
    }

    @Override // defpackage.acvq
    public final void j(float f) {
        this.u = f;
    }

    @Override // defpackage.acvq
    public final void m() {
        this.s = false;
    }

    @Override // defpackage.acdi, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p.b();
    }

    @Override // defpackage.acdi, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int i5;
        int iMax;
        int i6;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        if (this.d || (view = this.ac) == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean zN = n(measuredWidth, measuredHeight);
        acvu acvuVar = this.r;
        acvr acvrVar = zN ? acvuVar.c : acvuVar.d;
        if (acvrVar.equals(acvr.a())) {
            return;
        }
        Rect rect = this.aa;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        int i10 = (i8 - rect.left) - rect.right;
        int i11 = (i9 - rect.top) - rect.bottom;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        boolean zU = U(layoutParams);
        if (true == zU) {
            i8 = i10;
        }
        if (true == zU) {
            i9 = i11;
        }
        int iMin = Math.min(measuredWidth, i8);
        int iMin2 = Math.min(measuredHeight, i9);
        if (zU) {
            i5 = rect.left;
            iMax = rect.top;
        } else {
            i5 = 0;
            iMax = 0;
        }
        int i12 = n(measuredWidth, measuredHeight) ? this.e : this.h;
        int i13 = acvrVar.d;
        int i14 = i13 - 1;
        if (i13 == 0) {
            throw null;
        }
        if (i14 != 0) {
            i6 = 0;
        } else {
            iMax = Math.max(iMax + (((i9 - i12) - iMin2) / 2) + i12, 0);
            i6 = iMax + iMin2;
        }
        if (this.i > 0) {
            iMax = Math.max((zU ? rect.top : 0) + i12 + (((i9 - i12) - iMin2) / 2), 0);
            i6 = iMax + iMin2;
            double d = iMin;
            i7 = i5 + ((int) ((((double) this.i) + (0.8d * d)) - (d / 2.0d)));
        } else {
            i7 = i5 + ((i8 - iMin) / 2);
        }
        view.layout(i7, iMax, iMin + i7, i6);
        this.a.kk(Integer.valueOf(i6));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:80:0x013f  */
    @Override // defpackage.acdi, android.view.View
    protected final void onMeasure(int i, int i2) {
        Size sizeL;
        int i3;
        int i4;
        int width;
        int height;
        Size size;
        Size size2;
        int i5;
        int i6;
        super.onMeasure(i, i2);
        View view = this.ac;
        if (view != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (!this.d) {
                measuredHeight -= n(measuredWidth2, measuredHeight2) ? this.e : this.h;
            }
            acvs acvsVar = this.j;
            if (this.s && twm.v(getContext())) {
                acvsVar = acvs.b;
            }
            if (this.j == acvs.d) {
                acvsVar = acvs.b;
            }
            int iOrdinal = acvsVar.ordinal();
            if (iOrdinal == 1) {
                sizeL = acfz.L(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
                this.x = "DISABLED";
            } else if (iOrdinal == 2) {
                boolean z = this.k;
                boolean z2 = this.l;
                if (measuredWidth2 > 0) {
                    double d = measuredHeight2;
                    boolean z3 = (!z2 || measuredWidth <= measuredHeight) ? z : true;
                    double d2 = d / ((double) measuredWidth2);
                    if (d2 > 1.5d) {
                        double d3 = measuredHeight;
                        i3 = (int) (d3 / d2);
                        if (!z3 && i3 < measuredWidth) {
                            double d4 = i3;
                            double d5 = ((double) measuredWidth) / d4;
                            int i7 = (int) (d3 * d5);
                            int i8 = (int) (d4 * d5);
                            i4 = i7;
                            i3 = i8;
                        }
                    } else if (!z3 || measuredHeight2 < measuredHeight) {
                        i4 = (int) (((double) measuredWidth) * d2);
                        i3 = measuredWidth;
                    } else {
                        i3 = (int) (((double) measuredHeight) / d2);
                    }
                    Size size3 = new Size(i3, i4);
                    width = size3.getWidth();
                    height = size3.getHeight();
                    if (this.u > 1.9f && acfz.M(getContext(), this.u)) {
                        this.t = 0.14d;
                    }
                    this.x = "ASPECT_FIT";
                    this.w = 0.0d;
                    if (height >= measuredHeight || width < measuredWidth) {
                        size = new Size(width, height);
                    } else {
                        double dK = acfz.K(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
                        if (dK > this.t) {
                            size = acfz.L(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
                            if (size.getWidth() >= measuredWidth || (this.r.h && size.getHeight() >= measuredHeight)) {
                                this.x = "ASPECT_FIT";
                                this.w = 0.0d;
                            }
                        } else {
                            this.x = "ASPECT_FILL";
                            this.w = dK;
                        }
                        size = new Size(width, height);
                    }
                    sizeL = size;
                } else {
                    i3 = measuredWidth;
                }
                i4 = measuredHeight;
                Size size4 = new Size(i3, i4);
                width = size4.getWidth();
                height = size4.getHeight();
                if (this.u > 1.9f) {
                    this.t = 0.14d;
                }
                this.x = "ASPECT_FIT";
                this.w = 0.0d;
                if (height >= measuredHeight) {
                    size = new Size(width, height);
                } else {
                    size = new Size(width, height);
                }
                sizeL = size;
            } else if (iOrdinal != 3) {
                if (measuredWidth <= 0 || measuredWidth2 <= 0) {
                    i5 = measuredWidth;
                    i6 = measuredHeight;
                } else {
                    double d6 = measuredHeight;
                    double d7 = measuredWidth;
                    double d8 = d6 / d7;
                    double d9 = ((double) measuredHeight2) / ((double) measuredWidth2);
                    if (d8 > d9 && d9 != 0.0d) {
                        i5 = (int) (d6 / d9);
                        i6 = measuredHeight;
                    } else if (d8 < d9) {
                        i6 = (int) (d7 * d9);
                        i5 = measuredWidth;
                    } else {
                        i5 = measuredWidth;
                        i6 = measuredHeight;
                    }
                }
                sizeL = new Size(i5, i6);
                this.x = "DISABLED";
            } else {
                float f = measuredWidth2 / measuredHeight2;
                if (measuredWidth > measuredHeight) {
                    float f2 = measuredHeight * 0.0f;
                    size2 = new Size((int) f2, (int) (f2 / f));
                } else {
                    float f3 = measuredWidth / 0.0f;
                    size2 = new Size((int) (f * f3), (int) f3);
                }
                sizeL = size2;
                this.x = "DISABLED";
            }
            this.r.e.isPresent();
            int i9 = this.i;
            if (i9 > 0) {
                double dDoubleValue = (i9 > 0 ? o : (Double) this.r.e.get()).doubleValue();
                if (dDoubleValue < 1.0d && dDoubleValue > 0.0d) {
                    sizeL = new Size((int) (((double) sizeL.getWidth()) * dDoubleValue), (int) (((double) sizeL.getHeight()) * dDoubleValue));
                }
            }
            this.r.f.isPresent();
            view.setClipToOutline(false);
            view.setBackgroundResource(0);
            view.measure(View.MeasureSpec.makeMeasureSpec(sizeL.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(sizeL.getHeight(), 1073741824));
            if (!this.v || (this.f.m() && this.f.e() > 0)) {
                this.q.kk(new acvo(new Size(measuredWidth, measuredHeight), sizeL));
            }
        }
    }

    @Override // defpackage.acvq
    public final void k() {
    }

    @Override // defpackage.acvq
    public final void l() {
    }

    public ReelPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new avmm();
        this.a = new awku();
        this.q = new awku();
        this.d = false;
        acvt acvtVarA = acvu.a();
        acvs acvsVar = acvs.a;
        acvtVarA.b = avlh.G(acvsVar);
        acvtVarA.a = avlh.G(acos.a);
        this.r = acvtVarA.a();
        this.e = 0;
        this.h = 0;
        this.i = 0;
        Optional.empty();
        this.j = acvsVar;
        this.s = true;
        this.t = 0.0d;
        this.u = 1.9f;
        this.v = false;
        this.w = 0.0d;
        this.x = "ASPECT_FIT";
        this.y = false;
    }
}

package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dti extends dtk {
    public int[] a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    Paint.Cap h;
    Paint.Join i;
    float j;
    yre k;
    yre l;

    public dti(dti dtiVar) {
        super(dtiVar);
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
        int[] iArr = dtiVar.a;
        this.a = null;
        this.k = dtiVar.k;
        this.b = dtiVar.b;
        this.c = dtiVar.c;
        this.l = dtiVar.l;
        this.o = dtiVar.o;
        this.d = dtiVar.d;
        this.e = dtiVar.e;
        this.f = dtiVar.f;
        this.g = dtiVar.g;
        this.h = dtiVar.h;
        this.i = dtiVar.i;
        this.j = dtiVar.j;
    }

    @Override // defpackage.dtp
    public final boolean b() {
        return this.l.i() || this.k.i();
    }

    @Override // defpackage.dtp
    public final boolean c(int[] iArr) {
        return this.l.j(iArr) | this.k.j(iArr);
    }

    float getFillAlpha() {
        return this.d;
    }

    int getFillColor() {
        return this.l.a;
    }

    float getStrokeAlpha() {
        return this.c;
    }

    int getStrokeColor() {
        return this.k.a;
    }

    float getStrokeWidth() {
        return this.b;
    }

    float getTrimPathEnd() {
        return this.f;
    }

    float getTrimPathOffset() {
        return this.g;
    }

    float getTrimPathStart() {
        return this.e;
    }

    void setFillAlpha(float f) {
        this.d = f;
    }

    void setFillColor(int i) {
        this.l.a = i;
    }

    void setStrokeAlpha(float f) {
        this.c = f;
    }

    void setStrokeColor(int i) {
        this.k.a = i;
    }

    void setStrokeWidth(float f) {
        this.b = f;
    }

    void setTrimPathEnd(float f) {
        this.f = f;
    }

    void setTrimPathOffset(float f) {
        this.g = f;
    }

    void setTrimPathStart(float f) {
        this.e = f;
    }

    public dti() {
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = Paint.Cap.BUTT;
        this.i = Paint.Join.MITER;
        this.j = 4.0f;
    }
}

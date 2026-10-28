package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SizeF;
import j$.time.Duration;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qvs extends qvu implements rjp {
    public static final SizeF a = new SizeF(1.0f, 1.0f);
    public static final int i = 1;
    public int b;
    public float c;
    public int d;
    public SizeF e;
    public double f;
    public PointF g;
    public RectF h;
    public int j;

    protected qvs(qvs qvsVar) {
        super(qvsVar);
        this.b = 0;
        this.c = 1.0f;
        this.d = 0;
        this.e = a;
        this.f = 0.0d;
        this.g = new PointF(0.0f, 0.0f);
        this.h = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);
        this.j = i;
        this.b = qvsVar.b;
        this.c = qvsVar.c;
        this.d = qvsVar.d;
        this.e = qvsVar.e;
        this.f = qvsVar.f;
        this.g = qvsVar.g;
        this.h = qvsVar.h;
        this.j = qvsVar.j;
    }

    @Override // defpackage.rjp
    public final double d() {
        return this.f;
    }

    @Override // defpackage.rjp
    public final /* synthetic */ double e(Duration duration) {
        return nrc.j(this);
    }

    @Override // defpackage.rjp
    public final float f() {
        return this.c;
    }

    @Override // defpackage.rjp
    public final /* synthetic */ float g(Duration duration) {
        return nrc.i(this);
    }

    @Override // defpackage.rjp
    public final int h() {
        return this.d;
    }

    @Override // defpackage.rjp
    public final int i() {
        return this.b;
    }

    @Override // defpackage.rjp
    public final PointF j() {
        return this.g;
    }

    @Override // defpackage.rjp
    public final /* synthetic */ PointF k(Duration duration) {
        return nrc.l(this);
    }

    @Override // defpackage.rjp
    public final RectF l() {
        return this.h;
    }

    @Override // defpackage.rjp
    public final SizeF m() {
        return this.e;
    }

    @Override // defpackage.rjp
    public final /* synthetic */ SizeF n(Duration duration) {
        return nrc.k(this);
    }

    @Override // defpackage.rjp
    public final int o() {
        return this.j;
    }

    @Override // defpackage.qvu
    public String toString() {
        String str;
        Locale locale = Locale.US;
        String string = super.toString();
        Integer numValueOf = Integer.valueOf(this.b);
        Float fValueOf = Float.valueOf(this.c);
        Integer numValueOf2 = Integer.valueOf(this.d);
        SizeF sizeF = this.e;
        Double dValueOf = Double.valueOf(this.f);
        PointF pointF = this.g;
        RectF rectF = this.h;
        int i2 = this.j;
        if (i2 != 1) {
            str = i2 != 2 ? "null" : "COVER";
        } else {
            str = "CONTAIN";
        }
        return String.format(locale, "GraphicalSegment{%s, zIndex: %d, opacity: %f, backgroundColor: %d, scale: %s, rotationDegrees: %f, translation: %s, cropRect: %s, fit: %s}", string, numValueOf, fValueOf, numValueOf2, sizeF, dValueOf, pointF, rectF, str);
    }

    protected qvs() {
        this.b = 0;
        this.c = 1.0f;
        this.d = 0;
        this.e = a;
        this.f = 0.0d;
        this.g = new PointF(0.0f, 0.0f);
        this.h = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);
        this.j = i;
    }

    protected qvs(UUID uuid) {
        super(uuid);
        this.b = 0;
        this.c = 1.0f;
        this.d = 0;
        this.e = a;
        this.f = 0.0d;
        this.g = new PointF(0.0f, 0.0f);
        this.h = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);
        this.j = i;
    }
}

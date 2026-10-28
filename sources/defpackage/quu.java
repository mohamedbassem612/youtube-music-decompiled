package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SizeF;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class quu extends qus implements rjp {
    public int a;
    public float b;
    public int c;
    public SizeF d;
    public double e;
    public PointF h;
    public RectF i;
    public int j;

    protected quu(quu quuVar) {
        super(quuVar);
        this.a = 0;
        this.b = 1.0f;
        this.c = 0;
        this.d = qvs.a;
        this.e = 0.0d;
        this.h = new PointF(0.0f, 0.0f);
        this.i = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);
        this.j = qvs.i;
        this.a = quuVar.a;
        this.b = quuVar.b;
        this.c = quuVar.c;
        this.d = quuVar.d;
        this.e = quuVar.e;
        this.h = quuVar.h;
        this.i = quuVar.i;
        this.j = quuVar.j;
    }

    @Override // defpackage.rjp
    public final double d() {
        return this.e;
    }

    @Override // defpackage.rjp
    public final /* synthetic */ double e(Duration duration) {
        return nrc.j(this);
    }

    @Override // defpackage.rjp
    public final float f() {
        return this.b;
    }

    @Override // defpackage.rjp
    public final /* synthetic */ float g(Duration duration) {
        return nrc.i(this);
    }

    @Override // defpackage.rjp
    public final int h() {
        return this.c;
    }

    @Override // defpackage.rjp
    public final int i() {
        return this.a;
    }

    @Override // defpackage.rjp
    public final PointF j() {
        return this.h;
    }

    @Override // defpackage.rjp
    public final /* synthetic */ PointF k(Duration duration) {
        return nrc.l(this);
    }

    @Override // defpackage.rjp
    public final RectF l() {
        return this.i;
    }

    @Override // defpackage.rjp
    public final SizeF m() {
        return this.d;
    }

    @Override // defpackage.rjp
    public final /* synthetic */ SizeF n(Duration duration) {
        return nrc.k(this);
    }

    @Override // defpackage.rjp
    public final int o() {
        return this.j;
    }

    protected quu() {
        this.a = 0;
        this.b = 1.0f;
        this.c = 0;
        this.d = qvs.a;
        this.e = 0.0d;
        this.h = new PointF(0.0f, 0.0f);
        this.i = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);
        this.j = qvs.i;
    }
}

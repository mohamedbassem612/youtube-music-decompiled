package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zkl extends zln implements zlm {
    public int a;
    public int b;
    public zll c;
    protected final Handler d;
    private final Runnable e;
    private final Runnable f;
    private final boolean g;
    private int h;
    private int i;
    private float j;

    public zkl(Context context, zjr zjrVar) {
        super(context);
        this.j = 0.0f;
        byte[] bArr = null;
        this.c = null;
        int i = zic.a;
        this.e = new yas(this, 7, bArr);
        this.f = new yas(this, 8, bArr);
        this.g = zjrVar.j.m(240, 45656930L);
        this.d = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ boolean A(int i) {
        return false;
    }

    @Override // defpackage.zki
    public final int a() {
        return this.b;
    }

    @Override // defpackage.zki
    public final int b() {
        return this.a;
    }

    @Override // defpackage.zki
    public final int d() {
        return this.i;
    }

    @Override // defpackage.zki
    public final int e() {
        return this.h;
    }

    @Override // defpackage.zki
    public void h(Bitmap bitmap, sxu sxuVar) {
        sxuVar.iT(bitmap, null);
    }

    public void k(int i, int i2) {
        if (this.h == i && this.i == i2) {
            return;
        }
        this.h = i;
        this.i = i2;
        if (i > 0 && i2 > 0) {
            this.j = i / i2;
        }
        requestLayout();
    }

    @Override // defpackage.zki
    @Deprecated
    public final boolean l() {
        return B() == zlo.GL_CARDBOARD;
    }

    public SurfaceHolder n() {
        throw null;
    }

    public /* synthetic */ ctl o() {
        return null;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        if (z()) {
            int defaultSize = getDefaultSize(this.h, i);
            int defaultSize2 = getDefaultSize(this.i, i2);
            if (this.g) {
                float f = this.j;
                if (f > 0.0f) {
                    float f2 = defaultSize2 * f;
                    float f3 = defaultSize;
                    float f4 = (f2 / f3) - 1.0f;
                    if (f4 > 0.01f) {
                        defaultSize2 = (int) (f3 / f);
                    } else if (f4 < -0.01f) {
                        defaultSize = (int) f2;
                    }
                }
                Pair pairCreate = Pair.create(Integer.valueOf(defaultSize), Integer.valueOf(defaultSize2));
                int iIntValue = ((Integer) pairCreate.first).intValue();
                defaultSize2 = ((Integer) pairCreate.second).intValue();
                defaultSize = iIntValue;
            } else {
                int i4 = this.h;
                if (i4 > 0 && (i3 = this.i) > 0) {
                    int i5 = i4 * defaultSize2;
                    int i6 = defaultSize * i3;
                    float f5 = (i5 / i6) - 1.0f;
                    if (f5 > 0.01f) {
                        defaultSize2 = i6 / i4;
                    } else if (f5 < -0.01f) {
                        defaultSize = i5 / i3;
                    }
                }
            }
            this.a = resolveSize(defaultSize, i);
            this.b = resolveSize(defaultSize2, i2);
        } else {
            this.b = View.MeasureSpec.getSize(i2);
            this.a = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(this.a, this.b);
    }

    protected final void p(View view, int i, int i2) {
        int i3 = this.a;
        int i4 = this.b;
        int i5 = (i - i3) / 2;
        int i6 = (i2 - i4) / 2;
        view.layout(i5, i6, i3 + i5, i4 + i6);
    }

    @Override // defpackage.zlm
    public final void q() {
        L(this.e, this.f, 0);
    }

    public abstract void r();

    @Override // defpackage.zlm
    public final void s(int i) {
        L(this.f, this.e, i);
    }

    public abstract void t();

    @Override // defpackage.zlm
    public void v(zll zllVar) {
        this.c = zllVar;
    }

    @Override // defpackage.zlm
    public final void w(zlo zloVar) {
        throw null;
    }

    protected boolean z() {
        return true;
    }

    @Override // defpackage.zki
    public final ViewGroup g() {
        return this;
    }

    @Override // defpackage.zki
    public /* synthetic */ void j(float f) {
    }

    public /* synthetic */ void x(zlp zlpVar) {
    }

    public /* synthetic */ void y(boolean z, yib yibVar) {
    }

    @Override // defpackage.ctm
    public final /* synthetic */ void c(long j, long j2, bse bseVar, MediaFormat mediaFormat) {
    }

    public /* synthetic */ void u(boolean z, byte[] bArr, long j, long j2) {
    }
}

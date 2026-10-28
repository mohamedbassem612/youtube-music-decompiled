package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zku extends zkl implements SurfaceHolder.Callback {
    public SurfaceView e;
    private final View f;
    private volatile boolean g;
    private yno h;

    public zku(Context context, zjr zjrVar) {
        super(context, zjrVar);
        C();
        View view = new View(context);
        this.f = view;
        view.setBackgroundColor(-16777216);
        addView(view);
    }

    @Override // defpackage.zlm
    public final zlo B() {
        return zlo.VIDEO_DECODER_GL_SURFACE_VIEW;
    }

    public final void C() {
        ctk ctkVar = new ctk(getContext());
        this.e = ctkVar;
        ctkVar.getHolder().addCallback(this);
        addView(this.e, 0);
    }

    @Override // defpackage.zlm
    public final void H() {
        this.g = false;
        post(new zdv(this, 15));
    }

    @Override // defpackage.zki
    public final Surface f() {
        return null;
    }

    @Override // defpackage.zkl, defpackage.zki
    public final void h(Bitmap bitmap, sxu sxuVar) {
        if (this.h == null) {
            this.h = new yno((byte[]) null);
        }
        sxuVar.iT(bitmap, null);
    }

    @Override // defpackage.zki
    public final void i() {
        Surface surface = this.e.getHolder().getSurface();
        if (surface != null) {
            surface.release();
        }
    }

    @Override // defpackage.zkl, defpackage.zki
    public final void k(int i, int i2) {
        this.e.getHolder().setFixedSize(i, i2);
        super.k(i, i2);
    }

    @Override // defpackage.zki
    public final boolean m() {
        return this.g;
    }

    @Override // defpackage.zkl, defpackage.zlm
    public final SurfaceHolder n() {
        return this.e.getHolder();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.SurfaceView, ctl] */
    @Override // defpackage.zkl, defpackage.zlm
    public final ctl o() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        p(this.e, i5, i6);
        View view = this.f;
        if (view.getVisibility() != 8) {
            p(view, i5, i6);
        }
    }

    @Override // defpackage.zkl
    public final void r() {
        this.f.setVisibility(0);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.e.setVisibility(i);
        this.f.setVisibility(i);
        super.setVisibility(i);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        zll zllVar = this.c;
        if (zllVar != null) {
            zllVar.f(surfaceHolder.getSurface(), i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.g = true;
        zll zllVar = this.c;
        if (zllVar != null) {
            zllVar.c();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.g = false;
        zll zllVar = this.c;
        if (zllVar != null) {
            zllVar.d();
        }
        q();
    }

    @Override // defpackage.zkl
    public final void t() {
        this.f.setVisibility(8);
    }
}

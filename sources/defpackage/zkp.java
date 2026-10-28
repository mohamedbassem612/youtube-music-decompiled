package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zkp extends zkl implements SurfaceHolder.Callback {
    public GLSurfaceView e;
    private final View f;
    private volatile boolean g;
    private Surface h;
    private SurfaceTexture i;
    private int[] j;
    private zlb k;
    private yno l;

    public zkp(Context context, zjr zjrVar) {
        super(context, zjrVar);
        C();
        View view = new View(context);
        this.f = view;
        view.setBackgroundColor(-16777216);
        addView(view);
    }

    @Override // defpackage.zlm
    public final zlo B() {
        return zlo.GL_SURFACE;
    }

    public final void C() {
        GLSurfaceView gLSurfaceView = new GLSurfaceView(getContext());
        this.e = gLSurfaceView;
        gLSurfaceView.getHolder().addCallback(this);
        addView(this.e, 0);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        this.j = iArr;
        this.i = new SurfaceTexture(this.j[0]);
        this.k = new zlb(this.i, this.j);
        this.e.setEGLContextClientVersion(2);
        this.e.setEGLConfigChooser(8, 8, 8, 0, 0, 0);
        this.e.setPreserveEGLContextOnPause(true);
        this.e.setRenderer(this.k);
        this.e.setRenderMode(0);
        this.i.setOnFrameAvailableListener(new zko(this, 0));
    }

    @Override // defpackage.zlm
    public final void H() {
        this.g = false;
        post(new zdv(this, 12));
    }

    @Override // defpackage.zki
    public final Surface f() {
        return this.h;
    }

    @Override // defpackage.zkl, defpackage.zki
    public final void h(Bitmap bitmap, sxu sxuVar) {
        yno ynoVar = this.l;
        if (ynoVar == null) {
            ynoVar = new yno((byte[]) null);
            this.l = ynoVar;
        }
        Surface surface = this.h;
        if (ynoVar == null || surface == null || !surface.isValid() || !bitmap.isMutable()) {
            sxuVar.iT(bitmap, null);
        } else {
            yno.aq(surface, bitmap, sxuVar, this.d);
        }
    }

    @Override // defpackage.zki
    public final void i() {
        Surface surface = this.e.getHolder().getSurface();
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = this.h;
        if (surface2 != null) {
            surface2.release();
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
        this.h = new Surface(this.i);
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
        SurfaceTexture surfaceTexture = this.i;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return;
        }
        this.i.release();
    }

    @Override // defpackage.zkl
    public final void t() {
        this.f.setVisibility(8);
    }
}

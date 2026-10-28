package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class zks extends zkl implements SurfaceHolder.Callback {
    public SurfaceView e;
    private final View f;
    private volatile boolean g;
    private final Executor h;
    private yno i;

    public zks(Context context, zjr zjrVar, Executor executor) {
        super(context, zjrVar);
        this.h = executor;
        C();
        View view = new View(context);
        this.f = view;
        view.setBackgroundColor(-16777216);
        addView(view);
    }

    public zlo B() {
        return zlo.SURFACE;
    }

    public final void C() {
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.e = surfaceView;
        surfaceView.getHolder().addCallback(this);
        addView(this.e, 0);
    }

    @Override // defpackage.zlm
    public final void H() {
        this.g = false;
        post(new zdv(this, 13));
    }

    @Override // defpackage.zki
    public final Surface f() {
        return this.e.getHolder().getSurface();
    }

    @Override // defpackage.zkl, defpackage.zki
    public void h(Bitmap bitmap, sxu sxuVar) {
        yno ynoVar = this.i;
        if (ynoVar == null) {
            ynoVar = new yno((byte[]) null);
            this.i = ynoVar;
        }
        Surface surfaceF = f();
        if (ynoVar == null || surfaceF == null || !surfaceF.isValid() || !bitmap.isMutable()) {
            sxuVar.iT(bitmap, null);
        } else {
            yno.aq(surfaceF, bitmap, sxuVar, this.d);
        }
    }

    @Override // defpackage.zki
    public final void i() {
        Surface surface = this.e.getHolder().getSurface();
        if (surface != null) {
            if (Build.VERSION.SDK_INT != 28) {
                surface.release();
            } else {
                this.e.setVisibility(8);
                this.h.execute(new zdv(surface, 14));
            }
        }
    }

    @Override // defpackage.zkl, defpackage.zki
    public final void j(float f) {
        SurfaceView surfaceView;
        if (Build.VERSION.SDK_INT < 35 || (surfaceView = this.e) == null) {
            return;
        }
        surfaceView.setDesiredHdrHeadroom(f);
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

package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zkn extends zkl implements SurfaceHolder.Callback {
    public final View e;
    public final zjr f;
    public final AtomicLong g;
    public final AtomicLong h;
    public SurfaceView i;
    public SurfaceHolder j;
    public SurfaceView k;
    public SurfaceHolder l;
    public TextureView m;
    public Surface n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    private boolean s;
    private yno t;

    public zkn(Context context, zjr zjrVar) {
        super(context, zjrVar);
        this.g = new AtomicLong(0L);
        this.h = new AtomicLong(0L);
        this.o = false;
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.f = zjrVar;
        E();
        View view = new View(context);
        this.e = view;
        view.setBackgroundColor(-16777216);
        addView(view);
    }

    @Override // defpackage.zlm
    public final zlo B() {
        return zlo.DUAL_SURFACE;
    }

    public final void C() {
        ViewGroup.LayoutParams layoutParams;
        if (this.f.eG()) {
            if (this.m == null) {
                D();
                return;
            }
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        surfaceView.setAlpha(0.0f);
        SurfaceHolder holder = surfaceView.getHolder();
        holder.addCallback(this);
        holder.setFormat(842094169);
        this.l = holder;
        SurfaceView surfaceView2 = this.i;
        if (surfaceView2 != null && (layoutParams = surfaceView2.getLayoutParams()) != null) {
            surfaceView.setLayoutParams(layoutParams);
        }
        addView(surfaceView, 0);
        this.k = surfaceView;
    }

    public final void D() {
        ViewGroup.LayoutParams layoutParams;
        TextureView textureView = new TextureView(getContext());
        textureView.setAlpha(true != this.p ? 0.0f : 1.0f);
        textureView.setSurfaceTextureListener(new zkm(this, 0));
        SurfaceView surfaceView = this.i;
        if (surfaceView != null && (layoutParams = surfaceView.getLayoutParams()) != null) {
            textureView.setLayoutParams(layoutParams);
        }
        addView(textureView, 0);
        this.m = textureView;
    }

    public final void E() {
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.i = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        holder.addCallback(this);
        this.j = holder;
        addView(this.i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            C();
        }
    }

    public final void F() {
        Surface surface = this.n;
        boolean z = true;
        if (surface == null && this.m == null) {
            z = false;
        }
        if (surface != null) {
            surface.release();
            this.n = null;
        }
        TextureView textureView = this.m;
        if (textureView != null) {
            this.m = null;
            textureView.setSurfaceTextureListener(null);
            removeView(textureView);
        }
        if (z) {
            this.o = false;
            this.h.incrementAndGet();
            zll zllVar = this.c;
            if (zllVar instanceof yzo) {
                ((yzo) zllVar).i(null);
            }
        }
    }

    public final void G(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            Surface surface = surfaceHolder.getSurface();
            if (Objects.equals(surfaceHolder, this.j)) {
                this.g.incrementAndGet();
                this.s = false;
                this.j = null;
                zll zllVar = this.c;
                if (zllVar instanceof yzo) {
                    yzo yzoVar = (yzo) zllVar;
                    yzoVar.i(surface);
                    yzoVar.h();
                } else if (zllVar != null) {
                    zllVar.d();
                }
                q();
                return;
            }
            SurfaceHolder surfaceHolder2 = this.l;
            if (surfaceHolder2 == null || !Objects.equals(surfaceHolder, surfaceHolder2)) {
                return;
            }
            this.h.incrementAndGet();
            this.o = false;
            this.l = null;
            zll zllVar2 = this.c;
            if (zllVar2 instanceof yzo) {
                ((yzo) zllVar2).i(surface);
            }
        }
    }

    @Override // defpackage.zlm
    public final void H() {
        this.s = false;
        this.o = false;
        this.p = false;
        yag yagVar = new yag((Object) this, (Object) this.j, (Object) this.l, 10, (short[]) null);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            yagVar.run();
        } else {
            post(yagVar);
        }
    }

    public final boolean I() {
        return this.f.ay() && (this.c instanceof yzo);
    }

    @Override // defpackage.zki
    public final Surface f() {
        Surface surface;
        if (!this.f.bd()) {
            return this.i.getHolder().getSurface();
        }
        if (this.p) {
            SurfaceHolder surfaceHolder = this.l;
            if (surfaceHolder != null && (surface = surfaceHolder.getSurface()) != null && surface.isValid()) {
                return surface;
            }
            Surface surface2 = this.n;
            if (surface2 != null && surface2.isValid()) {
                return surface2;
            }
        }
        return this.i.getHolder().getSurface();
    }

    @Override // defpackage.zkl, defpackage.zki
    public final void h(Bitmap bitmap, sxu sxuVar) {
        TextureView textureView;
        Bitmap bitmap2;
        if (this.p && (textureView = this.m) != null && (bitmap2 = textureView.getBitmap(bitmap)) != null) {
            sxuVar.b(bitmap, bitmap2);
            return;
        }
        yno ynoVar = this.t;
        if (ynoVar == null) {
            ynoVar = new yno((byte[]) null);
            this.t = ynoVar;
        }
        Surface surfaceF = f();
        if (this.p) {
            SurfaceHolder surfaceHolder = this.l;
            if (surfaceHolder != null) {
                surfaceF = surfaceHolder.getSurface();
            } else {
                Surface surface = this.n;
                if (surface != null) {
                    surfaceF = surface;
                }
            }
        }
        if (ynoVar == null || surfaceF == null || !surfaceF.isValid() || !bitmap.isMutable()) {
            sxuVar.iT(bitmap, null);
        } else {
            yno.aq(surfaceF, bitmap, sxuVar, this.d);
        }
    }

    @Override // defpackage.zki
    public final void i() {
        zdv zdvVar = new zdv(this, 10);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zdvVar.run();
        } else {
            post(zdvVar);
        }
        zjr zjrVar = this.f;
        if (zjrVar.cD()) {
            zdv zdvVar2 = new zdv(this, 11);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                zdvVar2.run();
                return;
            } else {
                post(zdvVar2);
                return;
            }
        }
        if (zjrVar.bh()) {
            zll zllVar = this.c;
            if (zllVar instanceof yzo) {
                ((yzo) zllVar).g();
            }
        }
        F();
        SurfaceHolder surfaceHolder = this.j;
        if (surfaceHolder != null) {
            G(surfaceHolder);
            Surface surface = surfaceHolder.getSurface();
            if (surface == null || I()) {
                return;
            }
            surface.release();
        }
    }

    @Override // defpackage.zkl, defpackage.zki
    public final void j(float f) {
        if (Build.VERSION.SDK_INT >= 35) {
            SurfaceView surfaceView = this.i;
            if (surfaceView != null) {
                surfaceView.setDesiredHdrHeadroom(f);
            }
            SurfaceView surfaceView2 = this.k;
            if (surfaceView2 != null) {
                surfaceView2.setDesiredHdrHeadroom(f);
            }
        }
    }

    @Override // defpackage.zkl, defpackage.zki
    public final void k(int i, int i2) {
        SurfaceTexture surfaceTexture;
        this.q = i;
        this.r = i2;
        TextureView textureView = this.m;
        if (textureView != null && i > 0 && i2 > 0 && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this.i.getHolder().setFixedSize(i, i2);
        SurfaceView surfaceView = this.k;
        if (surfaceView != null) {
            surfaceView.getHolder().setFixedSize(i, i2);
        }
        super.k(i, i2);
    }

    @Override // defpackage.zki
    public final boolean m() {
        return this.s;
    }

    @Override // defpackage.zkl, defpackage.zlm
    public final SurfaceHolder n() {
        return this.i.getHolder();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        p(this.i, i5, i6);
        View view = this.e;
        if (view.getVisibility() != 8) {
            p(view, i5, i6);
        }
        SurfaceView surfaceView = this.k;
        if (surfaceView != null) {
            p(surfaceView, i5, i6);
        }
        TextureView textureView = this.m;
        if (textureView != null) {
            p(textureView, i5, i6);
        }
    }

    @Override // defpackage.zkl
    public final void r() {
        View view = this.e;
        view.setVisibility(0);
        if (this.f.eG()) {
            bringChildToFront(view);
        }
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
        if (this.j == null) {
            this.j = n();
        }
        SurfaceView surfaceView = this.k;
        if (surfaceView != null && this.l == null) {
            this.l = surfaceView.getHolder();
        }
        if (surfaceHolder == this.j) {
            this.g.incrementAndGet();
            this.s = true;
            zll zllVar = this.c;
            if (zllVar != null) {
                zllVar.c();
                return;
            }
            return;
        }
        SurfaceHolder surfaceHolder2 = this.l;
        if (surfaceHolder2 == null || surfaceHolder != surfaceHolder2) {
            return;
        }
        AtomicLong atomicLong = this.h;
        atomicLong.incrementAndGet();
        this.o = true;
        Surface surface = surfaceHolder.getSurface();
        zll zllVar2 = this.c;
        if (!(zllVar2 instanceof yzo) || surface == null) {
            return;
        }
        ((yzo) zllVar2).j(surface, atomicLong.get());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        G(surfaceHolder);
    }

    @Override // defpackage.zkl
    public final void t() {
        TextureView textureView;
        this.e.setVisibility(8);
        if (this.f.eG() && this.p && (textureView = this.m) != null) {
            textureView.setAlpha(1.0f);
            bringChildToFront(this.m);
        }
    }

    @Override // defpackage.zkl, defpackage.zlm
    public final void v(zll zllVar) {
        SurfaceTexture surfaceTexture;
        SurfaceHolder surfaceHolder;
        this.c = zllVar;
        if (zllVar != null) {
            if (this.s && (surfaceHolder = this.j) != null && surfaceHolder.getSurface().isValid()) {
                zllVar.c();
            }
            SurfaceHolder surfaceHolder2 = this.l;
            if (this.o && surfaceHolder2 != null && surfaceHolder2.getSurface().isValid() && (zllVar instanceof yzo)) {
                ((yzo) zllVar).j(surfaceHolder2.getSurface(), this.h.get());
                return;
            }
            if (this.o && (zllVar instanceof yzo)) {
                yzo yzoVar = (yzo) zllVar;
                TextureView textureView = this.m;
                if (textureView == null || (surfaceTexture = textureView.getSurfaceTexture()) == null) {
                    return;
                }
                Surface surface = this.n;
                if (surface == null || !surface.isValid()) {
                    Surface surface2 = this.n;
                    if (surface2 != null) {
                        surface2.release();
                    }
                    this.n = new Surface(surfaceTexture);
                }
                yzoVar.j(this.n, this.h.get());
            }
        }
    }
}

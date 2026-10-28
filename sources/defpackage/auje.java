package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auje {
    public final int a;
    public final aujf b;
    public final float[] c;
    public volatile SurfaceTexture g;
    public volatile Surface h;
    private final int l;
    private final int m;
    private final boolean n;
    private HandlerThread o;
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final int[] f = new int[1];
    public volatile boolean i = false;
    public volatile boolean j = false;
    public final Object k = new Object();

    public auje(int i, int i2, int i3, aujf aujfVar, boolean z) {
        float[] fArr = new float[16];
        this.c = fArr;
        this.a = i;
        this.l = i2;
        this.m = i3;
        this.b = aujfVar;
        this.n = z;
        Matrix.setIdentityM(fArr, 0);
        if (z) {
            HandlerThread handlerThread = new HandlerThread("SurfaceTexture Callback Thread");
            this.o = handlerThread;
            handlerThread.start();
        }
    }

    public final void a() {
        if (this.i) {
            return;
        }
        int[] iArr = this.f;
        GLES20.glGenTextures(1, iArr, 0);
        b(iArr[0]);
    }

    public final void b(int i) {
        int i2;
        if (this.i) {
            return;
        }
        int[] iArr = this.f;
        iArr[0] = i;
        Handler handler = this.n ? new Handler(this.o.getLooper()) : new Handler(Looper.getMainLooper());
        if (this.g == null) {
            this.g = new SurfaceTexture(iArr[0]);
            int i3 = this.l;
            if (i3 > 0 && (i2 = this.m) > 0) {
                this.g.setDefaultBufferSize(i3, i2);
            }
            this.g.setOnFrameAvailableListener(new zko(this, 2), handler);
            this.h = new Surface(this.g);
        } else {
            this.g.attachToGLContext(iArr[0]);
        }
        this.i = true;
        aujf aujfVar = this.b;
        if (aujfVar != null) {
            aujfVar.c();
        }
    }

    public final void c(aujc aujcVar) {
        synchronized (this.k) {
            this.j = true;
        }
        if (this.e.getAndSet(true)) {
            return;
        }
        aujf aujfVar = this.b;
        if (aujfVar != null) {
            aujfVar.a();
        }
        if (this.g != null) {
            this.g.release();
            this.g = null;
            if (this.h != null) {
                this.h.release();
            }
            this.h = null;
        }
        aujcVar.a(this.a, 0, 0L, this.c);
    }
}

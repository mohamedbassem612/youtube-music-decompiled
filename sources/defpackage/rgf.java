package defpackage;

import android.opengl.GLES20;
import android.os.Handler;
import com.google.mediapipe.framework.GlSyncToken;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rgf {
    public static final /* synthetic */ int a = 0;
    private static final rbm k = new rbm("rgf");
    private final Handler c;
    private final AtomicInteger d;
    private int f;
    private int g;
    private boolean j;
    private final Object b = new Object();
    private final AtomicInteger e = new AtomicInteger(0);
    private final Queue h = new ArrayDeque();
    private int i = 0;

    public rgf(Handler handler, int i, int i2, AtomicInteger atomicInteger) {
        this.c = handler;
        this.f = i;
        this.g = i2;
        this.d = atomicInteger;
    }

    private final rge f() throws bvn {
        try {
            int i = this.f;
            int i2 = this.g;
            int[] iArr = {0};
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            aewo.af("glTexImage2D");
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            aewo.af("texture setup");
            int i3 = iArr[0];
            DesugarAtomicInteger.accumulateAndGet(this.e, this.d.incrementAndGet(), new rgd());
            synchronized (this.b) {
                if (this.i > 21) {
                    rbc rbcVar = new rbc(k, rbd.c);
                    rbcVar.c();
                    rbcVar.d("Possible texture leak detected. framesInUse is now: %d", Integer.valueOf(this.i));
                    rbcVar.a("Possible texture leak detected.", new Object[0]);
                }
            }
            return new rge(this, i3, this.f, this.g);
        } catch (ahxq e) {
            bvn bvnVar = new bvn("Failed to create texture");
            bvnVar.initCause(e);
            throw bvnVar;
        }
    }

    private static final void g(rge rgeVar) {
        GlSyncToken glSyncToken;
        synchronized (rgeVar) {
            while (rgeVar.f && rgeVar.g == null) {
                rgeVar.wait();
            }
            glSyncToken = rgeVar.g;
            if (glSyncToken != null) {
                rgeVar.f = false;
                rgeVar.g = null;
            } else {
                glSyncToken = null;
            }
        }
        if (glSyncToken != null) {
            glSyncToken.waitOnGpu();
            glSyncToken.release();
        }
    }

    public final rfq a() throws bvn {
        rge rgeVarF;
        synchronized (this.b) {
            rgeVarF = (rge) this.h.poll();
            this.i++;
        }
        try {
            if (rgeVarF == null) {
                rgeVarF = f();
            } else if (rgeVarF.c == this.f && rgeVarF.d == this.g) {
                g(rgeVarF);
            } else {
                e(rgeVarF);
                rgeVarF = f();
            }
        } catch (InterruptedException e) {
            rbc rbcVar = new rbc(k, rbd.e);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.a("Interrupted while waiting for frame to release.", new Object[0]);
            Thread.currentThread().interrupt();
            rgeVarF = f();
        }
        synchronized (rgeVarF) {
            GlSyncToken glSyncToken = rgeVarF.g;
            if (glSyncToken != null) {
                glSyncToken.release();
                rgeVarF.g = null;
            }
            rgeVarF.f = true;
        }
        rbm rbmVar = rfs.g;
        return new rfq(rgeVarF);
    }

    public final void b(rge rgeVar) {
        synchronized (this.b) {
            if (this.j) {
                rbc rbcVar = new rbc(k, rbd.c);
                rbcVar.c();
                rbcVar.a = new IllegalStateException();
                rbcVar.a("Trying to release a frame after the pool has been released.", new Object[0]);
            }
            Queue queue = this.h;
            queue.offer(rgeVar);
            int i = this.i - 1;
            this.i = i;
            int iMax = this.j ? 0 : Math.max(21 - i, 0);
            while (queue.size() > iMax) {
                if (!this.c.post(new plj(this, (rge) queue.remove(), 19, null))) {
                    rbc rbcVar2 = new rbc(k, rbd.e);
                    rbcVar2.c();
                    rbcVar2.a("Memory leak detected failed to release the frame.", new Object[0]);
                }
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            rbc rbcVar = new rbc(k, rbd.a);
            rbcVar.c();
            rbcVar.a("Releasing TextureFramePool. Max active textures in session: %d", Integer.valueOf(this.e.get()));
            while (true) {
                Queue queue = this.h;
                if (queue.isEmpty()) {
                    this.j = true;
                } else {
                    e((rge) queue.remove());
                }
            }
        }
    }

    public final void d(int i, int i2) {
        this.f = i;
        this.g = i2;
    }

    public final void e(rge rgeVar) {
        try {
            g(rgeVar);
        } catch (InterruptedException e) {
            rbc rbcVar = new rbc(k, rbd.e);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.a("Interrupted while waiting for frame to release.", new Object[0]);
            Thread.currentThread().interrupt();
        }
        GLES20.glDeleteTextures(1, new int[]{rgeVar.b}, 0);
        this.d.decrementAndGet();
    }
}

package defpackage;

import android.graphics.Matrix;
import android.os.SystemClock;
import android.util.Size;
import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.TextureFrame;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Collection;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class rfs implements TextureFrame {
    public static final rbm g = new rbm("rfs");
    protected final TextureFrame a;
    protected int b = 1;
    public rfr c = new rfr();
    public long d = -1;
    public long e = -1;
    public rhf f;
    private GlSyncToken h;

    public rfs(TextureFrame textureFrame) {
        this.a = textureFrame;
    }

    public static rfs h() {
        rfs rfsVar = new rfs(null);
        rfsVar.c.a = UUID.randomUUID();
        return rfsVar;
    }

    public final boolean A(UUID uuid) {
        UUID uuid2 = this.c.a;
        return uuid2 != null && uuid2.equals(uuid);
    }

    public final boolean B() {
        return this.c.a != null;
    }

    public final void C(rhf rhfVar) {
        rhf rhfVar2 = this.f;
        if (rhfVar2 != null) {
            rhfVar2.a();
        }
        this.f = rhfVar;
    }

    public void a(long j) {
        this.d = j;
    }

    public final float b() {
        return this.c.f;
    }

    public final int c() {
        return this.c.d;
    }

    public final synchronized long d() {
        return this.c.a();
    }

    public final long e() {
        long j = this.e;
        return j == -1 ? getTimestamp() : j;
    }

    public final Matrix f() {
        return this.c.c;
    }

    public final Matrix g() {
        return this.c.b;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getFormat() {
        TextureFrame textureFrame = this.a;
        if (textureFrame != null) {
            return textureFrame.getFormat();
        }
        return 6408;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        TextureFrame textureFrame = this.a;
        if (textureFrame != null) {
            return textureFrame.getHeight();
        }
        return 0;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getTextureName() {
        TextureFrame textureFrame = this.a;
        if (textureFrame != null) {
            return textureFrame.getTextureName();
        }
        return 0;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        TextureFrame textureFrame = this.a;
        if (textureFrame != null) {
            return textureFrame.getTimestamp();
        }
        rbc rbcVar = new rbc(g, rbd.c);
        rbcVar.c();
        rbcVar.a = new Exception();
        rbcVar.a("Trying to get a timestamp of frame which does not have it set, defaulting to 0.", new Object[0]);
        return 0L;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        TextureFrame textureFrame = this.a;
        if (textureFrame != null) {
            return textureFrame.getWidth();
        }
        return 0;
    }

    public final agke i() {
        return agke.n(this.c.h);
    }

    public final Duration j() {
        return ahbt.b(getTimestamp());
    }

    public final Optional k() {
        return this.c.l;
    }

    public final UUID l() {
        return this.c.a;
    }

    public final UUID m() {
        return this.c.e;
    }

    public final awme n() {
        return this.c.g;
    }

    public final void o(Collection collection) {
        this.c.h.addAll(collection);
    }

    public final synchronized void p() {
        this.c.b();
    }

    public final synchronized void q() {
        this.c.c();
    }

    public final synchronized void r() {
        this.c.j = SystemClock.elapsedRealtimeNanos();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final void release() {
        synchronized (this) {
            int i = this.b;
            if (i == 0) {
                rbc rbcVar = new rbc(g, rbd.e);
                rbcVar.c();
                rbcVar.a("Frame was already released, ignoring this call to release.", new Object[0]);
                return;
            }
            int i2 = i - 1;
            this.b = i2;
            boolean z = i2 == 0;
            GlSyncToken glSyncToken = this.h;
            if (z) {
                this.h = null;
            }
            if (z) {
                C(null);
                TextureFrame textureFrame = this.a;
                if (glSyncToken != null) {
                    textureFrame.release(glSyncToken);
                } else {
                    textureFrame.release();
                }
            }
        }
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final void retain() {
        if (!z()) {
            throw new IllegalStateException("Could not retain the frame, likely because it was already released.");
        }
    }

    public final synchronized void s(long j) {
        this.c.k = j;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final boolean supportsRetain() {
        return true;
    }

    public final void t(float f) {
        this.c.f = f;
    }

    public final void u(Size size) {
        this.c.l = Optional.ofNullable(size);
    }

    public final void v(UUID uuid) {
        this.c.e = uuid;
    }

    public final void w(Matrix matrix) {
        this.c.b = matrix;
    }

    public final void x(awme awmeVar) {
        this.c.g = awmeVar;
    }

    public final void y(int i) {
        this.c.d = i;
    }

    public final synchronized boolean z() {
        boolean z;
        int i = this.b;
        if (i == 0) {
            rbc rbcVar = new rbc(g, rbd.c);
            rbcVar.c();
            z = false;
            rbcVar.a("refCount is 0, so could not acquire a reference!", new Object[0]);
        } else {
            z = true;
            this.b = i + 1;
        }
        return z;
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final void release(GlSyncToken glSyncToken) {
        synchronized (this) {
            int i = this.b;
            if (i == 0) {
                rbc rbcVar = new rbc(g, rbd.e);
                rbcVar.c();
                rbcVar.a("Frame was already released, ignoring this call to release.", new Object[0]);
                return;
            }
            int i2 = i - 1;
            this.b = i2;
            GlSyncToken glSyncToken2 = this.h;
            this.h = i2 == 0 ? null : glSyncToken;
            if (glSyncToken2 != null) {
                glSyncToken2.release();
            }
            if (i2 == 0) {
                C(null);
                this.a.release(glSyncToken);
            }
        }
    }
}

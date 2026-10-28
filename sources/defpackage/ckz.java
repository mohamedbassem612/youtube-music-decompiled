package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ckz implements clk {
    public final MediaCodec a;
    public final cld b;
    public final cll c;
    public int d = 0;
    public final mgk e;
    private boolean f;

    public ckz(MediaCodec mediaCodec, HandlerThread handlerThread, cll cllVar, mgk mgkVar) {
        this.a = mediaCodec;
        this.b = new cld(handlerThread);
        this.c = cllVar;
        this.e = mgkVar;
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(')');
        }
        return sb.toString();
    }

    @Override // defpackage.clk
    public final int a() {
        int iX;
        this.c.b();
        cld cldVar = this.b;
        synchronized (cldVar.a) {
            cldVar.b();
            iX = -1;
            if (!cldVar.d()) {
                dqp dqpVar = cldVar.k;
                iX = dqpVar.A() ? -1 : dqpVar.x();
            }
        }
        return iX;
    }

    @Override // defpackage.clk
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int i;
        this.c.b();
        cld cldVar = this.b;
        synchronized (cldVar.a) {
            cldVar.b();
            i = -1;
            if (!cldVar.d()) {
                dqp dqpVar = cldVar.l;
                if (!dqpVar.A()) {
                    int iX = dqpVar.x();
                    if (iX >= 0) {
                        cldVar.f.getClass();
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) cldVar.d.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (iX == -2) {
                        cldVar.f = (MediaFormat) cldVar.e.remove();
                        i = -2;
                    }
                    i = iX;
                }
            }
        }
        return i;
    }

    @Override // defpackage.clk
    public final MediaFormat c() {
        MediaFormat mediaFormat;
        cld cldVar = this.b;
        synchronized (cldVar.a) {
            mediaFormat = cldVar.f;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.clk
    public final ByteBuffer e(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.clk
    public final ByteBuffer f(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.clk
    public final void g() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.clk
    public final void h() {
        this.c.a();
        this.a.flush();
        cld cldVar = this.b;
        synchronized (cldVar.a) {
            cldVar.g++;
            Handler handler = cldVar.c;
            int i = bwp.a;
            handler.post(new bkn(cldVar, 18));
        }
        this.a.start();
    }

    @Override // defpackage.clk
    public final void i() {
        mgk mgkVar;
        mgk mgkVar2;
        mgk mgkVar3;
        mgk mgkVar4;
        try {
            try {
                if (this.d != 2) {
                    this.c.d();
                }
                this.d = 2;
                if (!this.f) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
                            this.a.stop();
                        }
                        if (Build.VERSION.SDK_INT >= 35 && (mgkVar4 = this.e) != null) {
                            mgkVar4.f(this.a);
                        }
                        this.a.release();
                        this.f = true;
                    } catch (Throwable th) {
                        if (Build.VERSION.SDK_INT >= 35 && (mgkVar3 = this.e) != null) {
                            mgkVar3.f(this.a);
                        }
                        this.a.release();
                        this.f = true;
                        throw th;
                    }
                }
                this.b.c();
            } catch (Throwable th2) {
                if (!this.f) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
                            this.a.stop();
                        }
                        if (Build.VERSION.SDK_INT >= 35 && (mgkVar2 = this.e) != null) {
                            mgkVar2.f(this.a);
                        }
                        this.a.release();
                        this.f = true;
                    } catch (Throwable th3) {
                        if (Build.VERSION.SDK_INT >= 35 && (mgkVar = this.e) != null) {
                            mgkVar.f(this.a);
                        }
                        this.a.release();
                        this.f = true;
                        throw th3;
                    }
                }
                this.b.c();
                throw th2;
            }
        } catch (Throwable th4) {
            this.b.c();
            throw th4;
        }
    }

    @Override // defpackage.clk
    public final void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.clk
    public final void k(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // defpackage.clk
    public final void l(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.clk
    public final void m(Bundle bundle) {
        this.c.c(bundle);
    }

    @Override // defpackage.clk
    public final void n(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.clk
    public final void o(List list) {
        this.a.subscribeToVendorParameters(list);
    }

    @Override // defpackage.clk
    public final void p(List list) {
        this.a.unsubscribeFromVendorParameters(list);
    }

    @Override // defpackage.clk
    public final void q(bwm bwmVar) {
        clp clpVar = new clp(this, bwmVar, 1);
        cld cldVar = this.b;
        synchronized (cldVar.a) {
            cldVar.b();
            clpVar.a();
        }
    }

    @Override // defpackage.clk
    public final boolean r() {
        return false;
    }

    @Override // defpackage.clk
    public final boolean s(clj cljVar) {
        cld cldVar = this.b;
        synchronized (cldVar.a) {
            cldVar.j = cljVar;
        }
        return true;
    }

    @Override // defpackage.clk
    public final void t(int i, int i2, long j, int i3) {
        this.c.f(i, i2, j, i3);
    }

    @Override // defpackage.clk
    public final void u(int i, cak cakVar, long j, int i2) {
        this.c.g(i, cakVar, j, i2);
    }
}

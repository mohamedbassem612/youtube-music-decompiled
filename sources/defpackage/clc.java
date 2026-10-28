package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class clc implements cll {
    public static final ArrayDeque a = new ArrayDeque();
    public static final Object b = new Object();
    public final MediaCodec c;
    public final AtomicReference d;
    public final zhk e;
    private final HandlerThread f;
    private Handler g;
    private boolean h;

    public clc(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zhk zhkVar = new zhk(null, null);
        this.c = mediaCodec;
        this.f = handlerThread;
        this.e = zhkVar;
        this.d = new AtomicReference();
    }

    private static clb h() {
        clb clbVar;
        ArrayDeque arrayDeque = a;
        synchronized (arrayDeque) {
            clbVar = arrayDeque.isEmpty() ? new clb() : (clb) arrayDeque.removeFirst();
        }
        return clbVar;
    }

    private static byte[] i(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < (length = bArr.length)) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        return bArr2;
    }

    private static int[] j(int[] iArr, int[] iArr2) {
        int length;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < (length = iArr.length)) {
                return Arrays.copyOf(iArr, iArr.length);
            }
            System.arraycopy(iArr, 0, iArr2, 0, length);
        }
        return iArr2;
    }

    @Override // defpackage.cll
    public final void a() {
        if (this.h) {
            try {
                Handler handler = this.g;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                zhk zhkVar = this.e;
                zhkVar.f();
                Handler handler2 = this.g;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                zhkVar.b();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.cll
    public final void b() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.cll
    public final void c(Bundle bundle) {
        b();
        Handler handler = this.g;
        int i = bwp.a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.cll
    public final void d() {
        if (this.h) {
            a();
            this.f.quit();
        }
        this.h = false;
    }

    @Override // defpackage.cll
    public final void e() {
        if (this.h) {
            return;
        }
        HandlerThread handlerThread = this.f;
        handlerThread.start();
        this.g = new cla(this, handlerThread.getLooper());
        this.h = true;
    }

    @Override // defpackage.cll
    public final void f(int i, int i2, long j, int i3) {
        b();
        clb clbVarH = h();
        clbVarH.a(i, i2, j, i3);
        Handler handler = this.g;
        int i4 = bwp.a;
        handler.obtainMessage(1, clbVarH).sendToTarget();
    }

    @Override // defpackage.cll
    public final void g(int i, cak cakVar, long j, int i2) {
        b();
        clb clbVarH = h();
        clbVarH.a(i, 0, j, i2);
        MediaCodec.CryptoInfo cryptoInfo = clbVarH.d;
        cryptoInfo.numSubSamples = cakVar.f;
        cryptoInfo.numBytesOfClearData = j(cakVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(cakVar.e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrI = i(cakVar.b, cryptoInfo.key);
        bArrI.getClass();
        cryptoInfo.key = bArrI;
        byte[] bArrI2 = i(cakVar.a, cryptoInfo.iv);
        bArrI2.getClass();
        cryptoInfo.iv = bArrI2;
        cryptoInfo.mode = cakVar.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cakVar.g, cakVar.h));
        Handler handler = this.g;
        int i3 = bwp.a;
        handler.obtainMessage(2, clbVarH).sendToTarget();
    }
}

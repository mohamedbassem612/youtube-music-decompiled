package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cld extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat f;
    public long g;
    public boolean h;
    public IllegalStateException i;
    public clj j;
    private MediaFormat m;
    private MediaCodec.CodecException n;
    private MediaCodec.CryptoException o;
    public final Object a = new Object();
    public final dqp k = new dqp((char[]) null);
    public final dqp l = new dqp((char[]) null);
    public final ArrayDeque d = new ArrayDeque();
    public final ArrayDeque e = new ArrayDeque();

    public cld(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    private final void e(MediaFormat mediaFormat) {
        this.l.y(-2);
        this.e.add(mediaFormat);
    }

    public final void a() {
        ArrayDeque arrayDeque = this.e;
        if (!arrayDeque.isEmpty()) {
            this.m = (MediaFormat) arrayDeque.getLast();
        }
        this.k.z();
        this.l.z();
        this.d.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.i;
        if (illegalStateException != null) {
            this.i = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.n;
        if (codecException != null) {
            this.n = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.o;
        if (cryptoException == null) {
            return;
        }
        this.o = null;
        throw cryptoException;
    }

    public final void c() {
        synchronized (this.a) {
            this.h = true;
            this.b.quit();
            a();
        }
    }

    public final boolean d() {
        return this.g > 0 || this.h;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.o = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.n = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.k.y(i);
            clj cljVar = this.j;
            if (cljVar != null) {
                cljVar.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            MediaFormat mediaFormat = this.m;
            if (mediaFormat != null) {
                e(mediaFormat);
                this.m = null;
            }
            this.l.y(i);
            this.d.add(bufferInfo);
            clj cljVar = this.j;
            if (cljVar != null) {
                cljVar.b();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            e(mediaFormat);
            this.m = null;
        }
    }
}

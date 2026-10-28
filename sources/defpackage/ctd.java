package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ctd extends Surface {
    private static int b;
    private static boolean c;
    public final boolean a;
    private final ctc d;
    private boolean e;

    public ctd(ctc ctcVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = ctcVar;
        this.a = z;
    }

    public static synchronized boolean a() {
        int i;
        if (!c) {
            try {
                if (bvo.k("EGL_EXT_protected_content")) {
                    i = bvo.k("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i = 0;
                }
            } catch (bvn e) {
                bvx.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e.getMessage())));
            }
            b = i;
            c = true;
        }
        return b != 0;
    }

    public static ctd b(boolean z) {
        boolean z2 = false;
        ahno.O(!z || a());
        ctc ctcVar = new ctc();
        int i = z ? b : 0;
        ctcVar.start();
        ctcVar.b = new Handler(ctcVar.getLooper(), ctcVar);
        ctcVar.a = new bvj(ctcVar.b);
        synchronized (ctcVar) {
            ctcVar.b.obtainMessage(1, i, 0).sendToTarget();
            while (ctcVar.e == null && ctcVar.d == null && ctcVar.c == null) {
                try {
                    ctcVar.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = ctcVar.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = ctcVar.c;
        if (error != null) {
            throw error;
        }
        ctd ctdVar = ctcVar.e;
        ctdVar.getClass();
        return ctdVar;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        ctc ctcVar = this.d;
        synchronized (ctcVar) {
            if (!this.e) {
                Handler handler = ctcVar.b;
                handler.getClass();
                handler.sendEmptyMessage(2);
                this.e = true;
            }
        }
    }
}

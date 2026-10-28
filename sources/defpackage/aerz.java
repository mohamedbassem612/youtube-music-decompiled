package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.io.File;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aerz {
    public boolean a;
    public final Object b;

    public aerz(Context context) {
        this.a = false;
        this.b = new File(context.getCacheDir(), "anr_detection.journal");
    }

    public static final String f(Context context, float f) {
        return context.getString(R.string.playback_rate_button_text, new DecimalFormat("0.##").format(f));
    }

    private final void k() {
        Optional optional = (Optional) this.b;
        if (optional.isEmpty()) {
            return;
        }
        wvm wvmVar = (wvm) optional.get();
        int i = abvp.b;
        wvmVar.a();
    }

    public final synchronized void a() {
        if (this.a) {
            k();
        } else {
            this.a = true;
        }
    }

    public final synchronized void b() {
        this.a = false;
        k();
    }

    public final void c() {
        if (this.a) {
            ((SurfaceTexture) this.b).detachFromGLContext();
            this.a = false;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [adxj, java.lang.Object] */
    public final int d(float f) {
        ?? r2 = this.b;
        int iB = r2.b(arqz.jo);
        if (f == 0.5f) {
            return r2.b(arqz.kK);
        }
        if (f == 0.8f) {
            return r2.b(arqz.kL);
        }
        if (f == 1.2f) {
            return r2.b(arqz.jl);
        }
        if (f == 1.5f) {
            return r2.b(arqz.jm);
        }
        if (f == 1.8f) {
            return r2.b(arqz.jn);
        }
        if (f == 2.0f) {
            return r2.b(arqz.jq);
        }
        if (f == 2.5f) {
            return r2.b(arqz.jp);
        }
        return f == 3.0f ? r2.b(arqz.jr) : iB;
    }

    public final void e() {
        this.a = false;
    }

    public final synchronized void g(ewf ewfVar, boolean z) {
        if (this.a || z) {
            ((Handler) this.b).obtainMessage(1, ewfVar).sendToTarget();
            return;
        }
        this.a = true;
        ewfVar.e();
        this.a = false;
    }

    public final bsb h() {
        if (this.a) {
            throw new IllegalStateException();
        }
        this.a = true;
        return new bsb((SparseBooleanArray) this.b);
    }

    public final void i(int i) {
        if (this.a) {
            throw new IllegalStateException();
        }
        ((SparseBooleanArray) this.b).append(i, true);
    }

    public final void j(int... iArr) {
        for (int i : iArr) {
            i(i);
        }
    }

    public aerz(SurfaceTexture surfaceTexture) {
        this.b = surfaceTexture;
        this.a = false;
    }

    public aerz(Optional optional) {
        this.a = false;
        this.b = optional;
    }

    public aerz(adxj adxjVar) {
        this.b = adxjVar;
    }

    public aerz(byte[] bArr, byte[] bArr2) {
        this.b = new SparseBooleanArray();
    }

    public aerz(byte[] bArr) {
        this.b = new Handler(Looper.getMainLooper(), new ewi());
    }

    public aerz() {
        this.b = new ahb(10);
    }
}

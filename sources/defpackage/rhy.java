package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class rhy extends rif {
    public static final rbm j = new rbm("rhy");
    public final qwr a;
    public final AtomicReference b;
    protected final AtomicReference c;
    protected final AtomicInteger d;
    protected final AtomicLong e;
    protected final AtomicLong f;
    public final AtomicBoolean g;
    public final AtomicReference h;
    protected long[] i;
    private final rjb q;

    public rhy(Context context, UUID uuid, Size size, qwr qwrVar, int i, Optional optional, rjc rjcVar, rjb rjbVar, qua quaVar, qug qugVar) {
        super(context, uuid, size, i, optional, null, rjcVar, quaVar, true, qugVar);
        this.b = new AtomicReference();
        this.c = new AtomicReference();
        this.d = new AtomicInteger(0);
        this.e = new AtomicLong(0L);
        this.f = new AtomicLong(0L);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicReference(null);
        this.a = qwrVar;
        this.q = rjbVar;
    }

    public static Bitmap j(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        if (i == 6) {
            matrix.preRotate(90.0f);
        } else if (i == 3) {
            matrix.preRotate(180.0f);
        } else if (i == 8) {
            matrix.preRotate(270.0f);
        }
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    private final synchronized void x() {
        AtomicReference atomicReference = this.c;
        Bitmap bitmap = (Bitmap) atomicReference.get();
        if (bitmap != null) {
            bitmap.recycle();
            atomicReference.set(null);
        }
        AtomicReference atomicReference2 = this.b;
        axst axstVar = (axst) atomicReference2.get();
        if (axstVar != null) {
            ((GifInfoHandle) axstVar.a).f();
            atomicReference2.set(null);
        }
    }

    @Override // defpackage.rif, java.lang.AutoCloseable
    public final void close() {
        super.close();
        x();
    }

    @Override // defpackage.rif
    protected void f(rfs rfsVar) {
        axst axstVar = (axst) this.b.get();
        AtomicReference atomicReference = this.c;
        Bitmap bitmap = (Bitmap) atomicReference.get();
        if (axstVar == null) {
            if (bitmap != null) {
                Optional optionalQ = q();
                rgi.f(rfsVar.getTextureName(), bitmap, optionalQ);
                if (optionalQ.isPresent()) {
                    rfsVar.u(new Size(bitmap.getWidth(), bitmap.getHeight()));
                    return;
                }
                return;
            }
            return;
        }
        Bitmap bitmapCreateBitmap = (Bitmap) atomicReference.get();
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(axstVar.e(), axstVar.c(), Bitmap.Config.ARGB_8888);
            atomicReference.set(bitmapCreateBitmap);
        }
        AtomicInteger atomicInteger = this.d;
        int i = atomicInteger.get();
        atomicInteger.set((i + 1) % axstVar.d());
        AtomicLong atomicLong = this.e;
        AtomicLong atomicLong2 = this.f;
        long j2 = atomicLong.get();
        if (atomicLong2.get() == 0) {
            atomicLong.set(TimeUnit.MILLISECONDS.toMicros(axstVar.b(i)) + j2);
        } else {
            atomicLong.set(atomicLong2.get() + j2);
            atomicLong2.set(0L);
        }
        if (bitmapCreateBitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is recycled");
        }
        int width = bitmapCreateBitmap.getWidth();
        GifInfoHandle gifInfoHandle = (GifInfoHandle) axstVar.a;
        if (width < gifInfoHandle.e() || bitmapCreateBitmap.getHeight() < gifInfoHandle.c()) {
            throw new IllegalArgumentException("Bitmap ia too small, size must be greater than or equal to GIF size");
        }
        if (bitmapCreateBitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Only Config.ARGB_8888 is supported. Current bitmap config: ".concat(String.valueOf(String.valueOf(bitmapCreateBitmap.getConfig()))));
        }
        gifInfoHandle.g(i, bitmapCreateBitmap);
        rfsVar.a(j2);
        Bitmap bitmapJ = j(bitmapCreateBitmap, 0);
        Optional optionalQ2 = q();
        rgi.f(rfsVar.getTextureName(), bitmapJ, optionalQ2);
        if (optionalQ2.isPresent()) {
            rfsVar.u(new Size(bitmapJ.getWidth(), bitmapJ.getHeight()));
        }
        bitmapJ.recycle();
    }

    @Override // defpackage.rif
    protected final ListenableFuture k(Context context) {
        return this.q.c(new jkb(this, context, 19, null));
    }

    public final boolean l() {
        return this.g.get();
    }

    public final void m(axst axstVar) {
        this.i = new long[axstVar.d()];
        for (int i = 0; i < axstVar.d(); i++) {
            long jB = axstVar.b(i);
            AtomicReference atomicReference = this.h;
            Duration durationOfMillis = Duration.ofMillis(jB);
            Duration duration = (Duration) atomicReference.get();
            if (duration == null || durationOfMillis.compareTo(duration) < 0) {
                atomicReference.set(durationOfMillis);
            }
            long[] jArr = this.i;
            if (i == 0) {
                jArr[0] = ahbt.a(durationOfMillis);
            } else {
                jArr[i] = jArr[i - 1] + ahbt.a(durationOfMillis);
            }
        }
    }

    public final synchronized void n(axst axstVar, Bitmap bitmap) {
        this.g.set(axstVar != null);
        if (axstVar != null) {
            m(axstVar);
            this.b.set(axstVar);
        }
        if (bitmap != null) {
            this.c.set(bitmap);
        }
        if (this.o) {
            x();
        }
    }
}

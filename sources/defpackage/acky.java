package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acky implements ackr {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/proto/formatted/font/engine/FontLoader");
    public final int b;
    public final mbc c;
    public volatile Typeface d;
    public volatile boolean e;
    public final axlj h;
    private final awut i;
    private final awou j;
    private final ackr k;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final axff g = new axfi(false);
    private final CoroutineExceptionHandler l = new ackw(CoroutineExceptionHandler.c, this);

    public acky(int i, axlj axljVar, awut awutVar, awou awouVar, ackr ackrVar, mbc mbcVar) {
        this.b = i;
        this.h = axljVar;
        this.i = awutVar;
        this.j = awouVar;
        this.k = ackrVar;
        this.c = mbcVar;
    }

    private final Typeface e(Context context) throws Exception {
        try {
            return axlj.H(context, this.b);
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            return null;
        } catch (OutOfMemoryError e2) {
            ((agrc) ((agrc) a.c()).j(e2).k("com/google/android/libraries/youtube/proto/formatted/font/engine/FontLoader", "fetchFontSynchronously", 288, "FontLoader.kt")).u("OOM loading font synchronously for resId=%d", this.b);
            return null;
        }
    }

    private final void f(Context context) {
        awut awutVar = this.i;
        if (awrc.N(awutVar) && this.f.compareAndSet(false, true)) {
            awxf awxfVar = new awxf((awwd) awutVar.b().get(awwd.d));
            try {
                awro.t(awutVar, this.j.plus(awxfVar).plus(this.l), 0, new ackx(this, context, null), 2).kJ(new acjo(this, awxfVar, 2, null));
            } catch (Exception e) {
                this.f.set(false);
                awxfVar.c();
                if (e instanceof CancellationException) {
                    return;
                }
                synchronized (this) {
                    this.e = true;
                }
            } catch (OutOfMemoryError e2) {
                this.f.set(false);
                awxfVar.c();
                ((agrc) ((agrc) a.c()).j(e2).k("com/google/android/libraries/youtube/proto/formatted/font/engine/FontLoader", "triggerAsyncLoad", 360, "FontLoader.kt")).u("OOM launching font load for resId=%d", this.b);
                synchronized (this) {
                    this.e = true;
                }
            }
        }
    }

    @Override // defpackage.ackr
    public final Typeface a() {
        return this.d;
    }

    @Override // defpackage.ackr
    public final Typeface b(Context context) {
        return c(context, false);
    }

    @Override // defpackage.ackr
    public final Typeface c(Context context, boolean z) {
        Typeface typefaceE;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        Typeface typeface = this.d;
        if (typeface != null) {
            return typeface;
        }
        if (this.e) {
            return this.k.b(context);
        }
        if (!z) {
            f(context);
            return this.k.b(context);
        }
        synchronized (this) {
            typefaceE = this.d;
            if (typefaceE == null) {
                if (this.e) {
                    typefaceE = this.k.b(context);
                } else {
                    typefaceE = e(context);
                    if (typefaceE != null) {
                        this.d = typefaceE;
                    } else {
                        this.e = true;
                        typefaceE = this.k.b(context);
                    }
                }
            }
        }
        return typefaceE;
    }
}

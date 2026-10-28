package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class avr {
    public abstract void a(int i);

    public abstract void b(Typeface typeface);

    public final void c(int i) {
        new Handler(Looper.getMainLooper()).post(new gkw(this, i, 1));
    }

    public final void d(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new bg(this, typeface, 19));
    }
}

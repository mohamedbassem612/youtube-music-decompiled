package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class glk extends Handler {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/async/WeakReferenceHandler");
    private final WeakReference b;

    public glk(Looper looper, Object obj) {
        super(looper);
        this.b = new WeakReference(obj);
        Class<?> cls = getClass();
        if ((cls.isAnonymousClass() || cls.isMemberClass() || cls.isLocalClass()) && (cls.getModifiers() & 8) == 0) {
            ((agrc) ((agrc) a.c()).k("com/google/android/apps/youtube/music/async/WeakReferenceHandler", "<init>", 33, "WeakReferenceHandler.java")).w("The following WeakReferenceHandler class should be static or leaks might occur: %s", cls.getCanonicalName());
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        jiu jiuVar;
        Object obj = this.b.get();
        if (obj == null) {
            removeCallbacksAndMessages(null);
            return;
        }
        izj izjVar = (izj) obj;
        if (message.what == 1) {
            Bitmap bitmap = (Bitmap) message.obj;
            int i = message.arg1;
            Canvas canvas = izjVar.e;
            if (canvas == null || (jiuVar = izjVar.d) == null || izjVar.f == null) {
                return;
            }
            canvas.drawBitmap(bitmap, jiuVar.b(bitmap), izjVar.d.a(i), (Paint) null);
            izjVar.b.setImageBitmap(izjVar.f);
        }
    }
}

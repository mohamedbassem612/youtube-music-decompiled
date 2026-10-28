package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tyx extends Handler {
    private final WeakReference a;

    public tyx(Looper looper, Object obj) {
        super(looper);
        this.a = new WeakReference(obj);
        Class<?> cls = getClass();
        if ((cls.isAnonymousClass() || cls.isMemberClass() || cls.isLocalClass()) && (cls.getModifiers() & 8) == 0) {
            twu.d(twu.a, 5, "The following WeakReferenceHandler class should be static or leaks might occur: ".concat(String.valueOf(cls.getCanonicalName())), null);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = this.a.get();
        if (obj == null) {
            removeCallbacksAndMessages(null);
            return;
        }
        aefv aefvVar = (aefv) obj;
        if (message.what == 1) {
            aefvVar.f((aefs) message.obj, 2);
        }
    }
}

package defpackage;

import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aoi extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException("no Looper on this thread");
        }
        aok aokVar = new aok(choreographer, aao.c(looperMyLooper));
        return aokVar.plus(aokVar.i);
    }
}

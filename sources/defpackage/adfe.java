package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adfe implements Runnable {
    private final asnm a;
    private final WeakReference b;
    private final aqi c;

    public adfe(asnm asnmVar, Context context, aqi aqiVar) {
        this.a = asnmVar;
        this.b = new WeakReference(context);
        this.c = aqiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = (Context) this.b.get();
        if (context != null) {
            this.c.b(aecm.E(this.a, context));
        }
    }
}

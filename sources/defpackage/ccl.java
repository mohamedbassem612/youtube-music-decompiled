package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ccl {
    public final WeakReference a;
    public final IntConsumer b;
    public final /* synthetic */ ccm c;

    public ccl(ccm ccmVar, Context context) {
        this.c = ccmVar;
        this.a = new WeakReference(context);
        jmj jmjVar = new jmj(this, 1);
        this.b = jmjVar;
        context.registerDeviceIdChangeListener(new cck(ccmVar.i.d(ccmVar.h, null), 0), jmjVar);
    }
}

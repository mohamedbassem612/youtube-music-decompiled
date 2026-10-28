package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adff implements Runnable {
    private final /* synthetic */ int $cid;
    private final int a;
    private final WeakReference b;
    private final aqi c;

    public adff(int i, Context context, aqi aqiVar, int i2, byte[] bArr) {
        this.$cid = i2;
        this.a = i;
        this.b = new WeakReference(context);
        this.c = aqiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        WeakReference weakReference = this.b;
        if (i != 0) {
            Context context = (Context) weakReference.get();
            if (context != null) {
                this.c.b(aecm.F(this.a, context));
                return;
            }
            return;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            aqi aqiVar = this.c;
            int i2 = this.a;
            Resources resources = context2.getResources();
            int i3 = avt.a;
            aqiVar.b(resources.getDrawable(i2, null));
        }
    }

    public adff(int i, Context context, aqi aqiVar, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = new WeakReference(context);
        this.c = aqiVar;
    }
}

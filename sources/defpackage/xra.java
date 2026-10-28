package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.mediarouter.media.MediaTransferReceiver;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xra {
    public final aunn a;
    private final Context b;
    private final xla c;
    private final Executor d;
    private Boolean i;
    private final vxz j;
    private boolean e = false;
    private boolean f = false;
    private boolean h = false;
    private final awli g = new awli(Boolean.FALSE);

    public xra(Context context, xla xlaVar, vxz vxzVar, Executor executor, aunn aunnVar) {
        this.b = context;
        this.c = xlaVar;
        this.j = vxzVar;
        this.a = aunnVar;
        this.d = executor;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        Context context = this.b;
        boolean z = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, (Class<?>) MediaTransferReceiver.class)) == 1;
        boolean zAz = this.c.az();
        agrx agrxVar = agso.a;
        this.f = z || zAz;
        txz.c(context, this.d, MediaTransferReceiver.class, true != zAz ? 2 : 1);
        this.e = true;
        boolean z2 = this.f;
        this.h = z2;
        this.g.kk(Boolean.valueOf(z2));
    }

    public final void b(boolean z) {
        boolean z2 = false;
        if (z && this.j.l(160, 45662068L, false)) {
            z2 = true;
        }
        Boolean bool = this.i;
        if (bool == null || bool.booleanValue() != z2) {
            this.i = Boolean.valueOf(z2);
            Context context = this.b;
            Executor executor = this.d;
            int i = 2;
            int i2 = true != z2 ? 2 : 1;
            context.getClass();
            executor.getClass();
            executor.execute(afwl.i(new kdw(context.getApplicationContext(), i2, i)));
        }
    }

    public final boolean c() {
        if (!this.e) {
            a();
        }
        return this.h;
    }
}

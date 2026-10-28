package defpackage;

import android.content.Context;
import j$.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qgz {
    public final ahey a;
    public final awmd b;
    private final aunn c;
    private final aunn d;
    private final Context e;

    public qgz(Context context, awmd awmdVar, aunn aunnVar, ahey aheyVar, aunn aunnVar2) {
        this.c = aunnVar;
        this.a = aheyVar;
        this.e = context;
        this.b = awmdVar;
        this.d = aunnVar2;
    }

    public static final void b(String str, String str2, long j) {
        String.format(Locale.US, "J<%s>#%s#%d", str, str2, Long.valueOf(j)).length();
    }

    public final void a(qgt qgtVar, qgs qgsVar) {
        awmd awmdVar = this.b;
        if (!((qhd) awmdVar.io()).d || ((qgv) this.d.io()).a) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Long l = 9000L;
        l.getClass();
        if (qgsVar.n > 9000 || qgsVar.g == 0) {
            return;
        }
        Double d = (Double) qgtVar.e.f();
        if (d != null && d.doubleValue() > 0.0d) {
            int i = qgsVar.i;
            if (i == 0) {
                return;
            }
            if (((double) qgsVar.g) / ((double) i) < d.doubleValue()) {
                return;
            }
        }
        Duration duration = (Duration) qgtVar.f.f();
        if (duration == null || !a.y(duration) || qgsVar.k >= duration.toMillis()) {
            ((qfl) this.c.io()).a((String) qgtVar.d.a(new one(7)).e(((qhd) awmdVar.io()).b.replace("%PACKAGE_NAME%", this.e.getPackageName())));
        }
    }
}

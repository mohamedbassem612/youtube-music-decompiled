package defpackage;

import android.content.Context;
import android.content.res.Resources;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abkq {
    public final Resources a;
    public abko b;
    public abko c;
    public int d;
    private final tpq e;

    public abkq(Context context, tpq tpqVar) {
        this.e = tpqVar;
        this.a = context.getResources();
    }

    public final Duration a() {
        tpq tpqVar = this.e;
        if ((((atpu) tpqVar.c()).b & 1) == 0) {
            Duration durationOfSeconds = Duration.ofSeconds(10L);
            durationOfSeconds.getClass();
            return durationOfSeconds;
        }
        aigu aiguVar = ((atpu) tpqVar.c()).c;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        return Duration.ofSeconds(aiguVar.b);
    }

    public final void b() {
        this.d = 0;
    }
}

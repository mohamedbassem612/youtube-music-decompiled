package defpackage;

import j$.time.Duration;
import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ybf extends awpk implements awqm {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ long c;

    public ybf(awoq awoqVar) {
        super(4, awoqVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.awqm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        ybf ybfVar = new ybf(obj4);
        ybfVar.b = obj2;
        ybfVar.c = jLongValue;
        return ybfVar.invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        boolean z = true;
        atqp.j(obj);
        if (i == 0) {
            Object obj2 = this.b;
            long j = this.c;
            Objects.checkIndex(0, 3);
            if (obj2 == null || !((obj2 instanceof toe) || (obj2 instanceof IOException))) {
                z = false;
            } else {
                ((agrc) ((agrc) ybi.b.b()).j((Throwable) obj2).k("com/google/android/libraries/youtube/mdx/remote/internal/GetStreamingActiveDevicesController", "requestStream$<anonymous>$<anonymous>$<anonymous>", 73, "GetStreamingActiveDevicesController.kt")).t("Stream error, will retry after backoff delay.");
                Duration durationOfSeconds = Duration.ofSeconds(1 << awro.g((int) j, 6));
                durationOfSeconds.getClass();
                this.a = 1;
                if (afyd.r(durationOfSeconds, this) == awoxVar) {
                    return awoxVar;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}

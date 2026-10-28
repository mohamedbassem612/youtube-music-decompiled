package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sza implements szb {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/clientsample/DefaultSampleGate");
    private final tpq b;
    private final SecureRandom c;
    private final Map d = new ConcurrentHashMap();

    public sza(tpq tpqVar, SecureRandom secureRandom) {
        this.b = tpqVar;
        this.c = secureRandom;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    @Override // defpackage.szb
    public final boolean b(float f, final szc szcVar) {
        Map map = this.d;
        String str = szcVar.m;
        Boolean bool = (Boolean) map.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        sxz sxzVar = szcVar.n;
        tpq tpqVar = this.b;
        float fFloatValue = ((Float) sxzVar.a((ator) tpqVar.c())).floatValue();
        if (fFloatValue <= 0.0f) {
            fFloatValue = this.c.nextFloat();
        }
        float f2 = fFloatValue + f;
        ?? r7 = ((f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1)) ^ (-1)) >>> 31;
        final float f3 = f2 - ((int) f2);
        ListenableFuture listenableFutureB = tpqVar.b(new agek() { // from class: syz
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                return (ator) ((aihf) szcVar.o.a(((ator) obj).toBuilder(), Float.valueOf(f3))).build();
            }
        });
        hmb hmbVar = new hmb(9);
        Executor executor = taf.a;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        taa taaVar = new taa(taf.c, null, hmbVar);
        long j = afwl.a;
        listenableFutureB.addListener(new ahei(listenableFutureB, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
        map.put(str, Boolean.valueOf((boolean) r7));
        return r7;
    }
}

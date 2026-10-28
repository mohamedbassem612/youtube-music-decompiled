package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rtl {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/ads/controlflow/externalapi/impl/AdBreakFetcher");
    public final aaqf a;
    private final agke c;
    private final tbt d;

    public rtl(aaqf aaqfVar, agke agkeVar, tbt tbtVar) {
        aaqfVar.getClass();
        this.a = aaqfVar;
        agkeVar.getClass();
        this.c = agkeVar;
        tbtVar.getClass();
        this.d = tbtVar;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, zwb] */
    public final wgk a(String str, byte[] bArr, String str2, String str3, long j, long j2, int i, long j3, axmq axmqVar, boolean z, Optional optional, boolean z2, aigj aigjVar) {
        try {
            tbt tbtVar = this.d;
            tbtVar.c(new sex());
            str2.getClass();
            str.getClass();
            aaqf aaqfVar = this.a;
            wnz wnzVar = new wnz(aaqfVar.b, aaqfVar.d.e(), z);
            wnzVar.b = str;
            wnzVar.o(bArr);
            wnzVar.a = str2;
            wnzVar.c = str3;
            wnzVar.e = j2;
            wnzVar.D = j;
            wnzVar.E = i;
            wnzVar.F = j3;
            if (optional.isPresent()) {
                wnzVar.d = (String) optional.get();
            }
            wnzVar.N = z2;
            if (aigjVar != null) {
                wnzVar.O = aigjVar;
            }
            agke agkeVar = this.c;
            int i2 = ((agpi) agkeVar).d;
            for (int i3 = 0; i3 < i2; i3++) {
                ((wny) agkeVar.get(i3)).a(wnzVar);
            }
            ListenableFuture listenableFutureG = aaqfVar.g(wnzVar, MoreExecutors.directExecutor());
            long jB = axmqVar.a - axmqVar.b.b();
            if (jB < 0) {
                jB = 0;
            }
            wgk wgkVar = (wgk) listenableFutureG.get(jB, TimeUnit.MILLISECONDS);
            tbtVar.c(new sew());
            return wgkVar;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/ads/controlflow/externalapi/impl/AdBreakFetcher", "getAdBreakResponseForAdBreakBlocking", 93, "AdBreakFetcher.java")).w("Exception when trying to request AdBreakResponseModel: %s", e.getMessage());
            return null;
        }
    }
}

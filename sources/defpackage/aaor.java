package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aaor implements aheh {
    final /* synthetic */ agex a;
    final /* synthetic */ aalv b;
    final /* synthetic */ String c;
    final /* synthetic */ ListenableFuture d;
    final /* synthetic */ Executor e;
    final /* synthetic */ int f;

    public aaor(agex agexVar, aalv aalvVar, String str, int i, ListenableFuture listenableFuture, Executor executor) {
        this.a = agexVar;
        this.b = aalvVar;
        this.c = str;
        this.f = i;
        this.d = listenableFuture;
        this.e = executor;
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i;
        aami aamiVar = (aami) obj;
        if (!this.a.a(aamiVar.b)) {
            ahng.x(this.d, new aaot(this.b, this.c, this.f), this.e);
            return;
        }
        int i2 = aamiVar.a;
        if (i2 != 1) {
            i = i2 != 2 ? 1 : 4;
        } else {
            i = 3;
        }
        if (i == 1) {
            ((agrc) ((agrc) aaou.a.b()).k("com/google/android/libraries/youtube/offline/player/OfflineFallbackStrategyFutureUtil$1", "onSuccess", 293, "OfflineFallbackStrategyFutureUtil.java")).t("[Offline] Encountered unknown fallback reason. Likely bug in fallback strategy.");
        }
        aalv aalvVar = this.b;
        String str = this.c;
        aalvVar.f(TextUtils.isEmpty(str) ? agdf.a : agev.i(str), this.f, i);
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
    }
}

package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class absl {
    private static final agrf d = agrf.h("com/google/android/libraries/youtube/player/playability/PlayabilityUtil");
    public final tpq a;
    public boolean c = false;
    public final List b = new ArrayList();

    public absl(tpq tpqVar) {
        this.a = tpqVar;
    }

    public static boolean d(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("playability_adult_confirmations:");
    }

    static String e(zwa zwaVar) {
        return "playability_adult_confirmations:".concat(zwaVar.k());
    }

    public final ListenableFuture a(zwa zwaVar) {
        return ahcs.e(this.a.a(), new vzs(e(zwaVar), 14), MoreExecutors.directExecutor());
    }

    public final void b(absk abskVar) {
        this.b.add(abskVar);
    }
}

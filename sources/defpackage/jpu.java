package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpu extends zkk {
    final /* synthetic */ Context a;
    final /* synthetic */ WatchWhileLayout b;

    public jpu(WatchWhileLayout watchWhileLayout, Context context) {
        this.a = context;
        this.b = watchWhileLayout;
    }

    @Override // defpackage.agfr
    public final /* bridge */ /* synthetic */ Object io() {
        WatchWhileLayout watchWhileLayout = this.b;
        int i = watchWhileLayout.bj;
        int i2 = watchWhileLayout.bk;
        return (i <= 0 || i2 <= 0) ? new zkj(twm.o(this.a)) : new zkj(i, i2, false);
    }
}

package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpv extends zkk {
    final /* synthetic */ Context a;
    final /* synthetic */ WatchWhileLayout b;

    public jpv(WatchWhileLayout watchWhileLayout, Context context) {
        this.a = context;
        this.b = watchWhileLayout;
    }

    @Override // defpackage.agfr
    public final /* bridge */ /* synthetic */ Object io() {
        int i = this.b.aN;
        return i > 0 ? new zkj(i, i, false) : new zkj(twm.o(this.a));
    }
}

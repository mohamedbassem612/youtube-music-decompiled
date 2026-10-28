package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class srt extends WindowInsetsAnimation$Callback {
    final /* synthetic */ Runnable a;
    final /* synthetic */ sru b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srt(sru sruVar, Runnable runnable) {
        super(0);
        this.a = runnable;
        this.b = sruVar;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.b.a();
        this.a.run();
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        return windowInsets;
    }
}

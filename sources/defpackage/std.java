package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class std extends WindowInsetsAnimation$Callback {
    final /* synthetic */ ste a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public std(ste steVar) {
        super(0);
        this.a = steVar;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.i();
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        return windowInsets;
    }
}

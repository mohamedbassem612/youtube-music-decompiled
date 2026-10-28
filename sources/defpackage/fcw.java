package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fcw implements fcx {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean b;

    @Override // defpackage.fcx
    public final void a(Activity activity) {
        if (this.b || !this.a.add(activity)) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener(new fcv(this, decorView));
    }
}

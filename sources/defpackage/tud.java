package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class tud implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/ui/TraceableOnGlobalLayoutListener");
    private final String b;
    private int c = 0;

    public tud(String str) {
        this.b = str;
    }

    protected abstract void a();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.c + 1;
        this.c = i;
        if (i > 1) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/common/ui/TraceableOnGlobalLayoutListener", "onGlobalLayout", 27, "TraceableOnGlobalLayoutListener.java")).A("TraceableOnGlobalLayoutListener.onGlobalLayout[%s] is called %d", this.b, this.c);
        }
        a();
    }
}

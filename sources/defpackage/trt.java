package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class trt {
    public final Context a;
    public final boolean b = Ctry.SCROLL_STATE.c();
    public int c;

    public trt(Context context) {
        this.a = context.getApplicationContext();
    }

    public static final String a(int i) {
        if (i == 1) {
            return ":dragging";
        }
        if (i != 2) {
            return null;
        }
        return ":settling";
    }
}

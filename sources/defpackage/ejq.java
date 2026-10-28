package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejq {
    private static final Object e = new Object();
    public final Context a;
    public final String b;
    public egr c;
    public final Map d;

    public ejq(Drawable.Callback callback, String str, egr egrVar, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = String.valueOf(str).concat("/");
        }
        this.d = map;
        this.c = egrVar;
        if (callback instanceof View) {
            this.a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.a = null;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (e) {
            ((ehn) this.d.get(str)).f = bitmap;
        }
    }
}

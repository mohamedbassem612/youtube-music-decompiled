package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mle {
    public final Context a;
    public boolean b;
    public boolean c;
    public float d;
    public float e;
    public boolean f;
    public final int g;
    public final int h;
    public final Handler i;
    public float j;
    public float k;
    public int l = 0;
    public GestureDetector m;
    public boolean n;
    public final mku o;

    public mle(Context context, mku mkuVar, Handler handler) {
        this.a = context;
        this.o = mkuVar;
        if (Build.VERSION.SDK_INT >= 29) {
            this.h = ViewConfiguration.get(context).getScaledMinimumScalingSpan() / 2;
        } else {
            this.h = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        }
        this.g = (ViewConfiguration.get(context).getScaledTouchSlop() << 1) / 2;
        this.i = handler;
    }

    public final boolean a() {
        return this.l != 0;
    }
}

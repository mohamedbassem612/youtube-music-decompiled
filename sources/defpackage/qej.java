package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qej {
    public Handler e;
    public qci h;
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    public final Set g = new HashSet();
    public final Runnable f = new mbo(this, 5);

    public qej(Context context) {
        this.e = null;
        this.e = new Handler(context.getMainLooper());
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new qeh(this));
    }

    public final void a() {
        if (this.a == 0 && this.c) {
            for (qdx qdxVar : this.g) {
            }
            this.d = true;
        }
    }
}

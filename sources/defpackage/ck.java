package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ck extends ch {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final dd e = new dd();

    public ck(Activity activity, Context context, Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
    }

    @Override // defpackage.ch
    public View a(int i) {
        throw null;
    }

    @Override // defpackage.ch
    public boolean b() {
        throw null;
    }

    public LayoutInflater c() {
        throw null;
    }

    public abstract Object d();

    public boolean f(String str) {
        throw null;
    }

    public void h(PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    public final void i(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.c.startActivity(intent, bundle);
    }

    public void e() {
    }
}

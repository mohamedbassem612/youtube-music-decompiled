package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class axy {
    public final Context c;
    public hhb d;

    public axy(Context context) {
        this.c = context;
    }

    public abstract View a();

    public View b(MenuItem menuItem) {
        return a();
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return true;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h(hhb hhbVar) {
        if (this.d != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.d = hhbVar;
    }

    public void c(SubMenu subMenu) {
    }
}

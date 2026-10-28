package defpackage;

import android.view.MenuItem;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class inn {
    public boolean a;
    public Object b;

    public inn(tbt tbtVar) {
        this.a = true;
        tbtVar.f(this);
    }

    private final void b() {
        MenuItem menuItem;
        Object obj = this.b;
        if (obj == null || (menuItem = (MenuItem) ((WeakReference) obj).get()) == null) {
            return;
        }
        menuItem.setVisible(this.a);
    }

    public final void a(MenuItem menuItem) {
        this.b = new WeakReference(menuItem);
        b();
    }

    @tcc
    void searchTabVisibilityChangeEventHandler(ino inoVar) {
        this.a = !inoVar.a;
        b();
    }

    public inn() {
    }
}

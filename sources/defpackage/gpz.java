package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gpz implements gpv {
    @Override // defpackage.gpv
    public final void b(Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.history_menu_item);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(true);
        }
    }

    @Override // defpackage.gpv
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.gpv
    public final /* synthetic */ void c(gpl gplVar) {
    }

    @Override // defpackage.gpv
    public final /* synthetic */ void f(Object obj) {
    }
}

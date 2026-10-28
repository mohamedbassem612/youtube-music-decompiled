package defpackage;

import android.content.Context;
import android.view.MenuItem;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class ii {
    final Context a;
    public aha b;

    public ii(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof awj)) {
            return menuItem;
        }
        awj awjVar = (awj) menuItem;
        aha ahaVar = this.b;
        if (ahaVar == null) {
            ahaVar = new aha(0);
            this.b = ahaVar;
        }
        MenuItem menuItem2 = (MenuItem) ahaVar.get(awjVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        ix ixVar = new ix(this.a, awjVar);
        this.b.put(awjVar, ixVar);
        return ixVar;
    }
}

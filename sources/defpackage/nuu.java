package defpackage;

import android.app.PendingIntent;
import android.util.Log;
import android.view.ActionMode;
import android.view.MenuItem;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nuu {
    public static boolean a(oxa oxaVar, MenuItem menuItem, ActionMode actionMode) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908353) {
            Object obj = ((oxe) oxaVar).o;
            if (gp$$ExternalSyntheticApiModelOutline2.m821m(obj)) {
                List actions = gp$$ExternalSyntheticApiModelOutline2.m809m(obj).getActions();
                if (!actions.isEmpty()) {
                    try {
                        gp$$ExternalSyntheticApiModelOutline2.m806m(actions.get(0)).getActionIntent().send();
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextSelection", "Failed to execute primary remote assistant action", e);
                    }
                }
            }
            actionMode.finish();
            return true;
        }
        if (itemId < 10000 || itemId >= 11000) {
            return false;
        }
        Object obj2 = ((oxe) oxaVar).o;
        if (gp$$ExternalSyntheticApiModelOutline2.m821m(obj2)) {
            int i = itemId - 10000;
            List actions2 = gp$$ExternalSyntheticApiModelOutline2.m809m(obj2).getActions();
            if (i < actions2.size()) {
                try {
                    gp$$ExternalSyntheticApiModelOutline2.m806m(actions2.get(i)).getActionIntent().send();
                } catch (PendingIntent.CanceledException e2) {
                    Log.e("TextSelection", "Failed to execute remote assistant action", e2);
                }
            }
        }
        actionMode.finish();
        return true;
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qm extends ql {
    @Override // defpackage.qk, defpackage.qi, defpackage.qo
    public void a(qx qxVar, qx qxVar2, Window window, View view, boolean z, boolean z2) {
        azz.c(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Iterator itA = new bag(viewGroup, 1).a();
            while (itA.hasNext()) {
                Object tag = ((View) itA.next()).getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof bcq)) {
                        for (Object obj : (Iterable) tag) {
                            if ((obj instanceof bcq ? (bcq) obj : null) != null) {
                                int i = ((bcq) obj).a;
                                if (i == 1) {
                                    throw null;
                                }
                                if (i == 2) {
                                    throw null;
                                }
                                if (i == 4) {
                                    throw null;
                                }
                                if (i == 8) {
                                    throw null;
                                }
                            }
                        }
                        break;
                    }
                }
            }
        }
        window.setNavigationBarContrastEnforced(true);
        zf zfVar = new zf(window, view);
        zfVar.d(!z);
        zfVar.c(!z2);
    }
}

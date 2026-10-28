package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lpe extends kot {
    public final List a;

    public lpe(kou kouVar) {
        super(kouVar);
        this.a = new ArrayList();
        this.e.c("TaskOnStopCallback", this);
    }

    @Override // defpackage.kot
    public final void j() {
        List list = this.a;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lpb lpbVar = (lpb) ((WeakReference) it.next()).get();
                if (lpbVar != null) {
                    lpbVar.a();
                }
            }
            list.clear();
        }
    }
}

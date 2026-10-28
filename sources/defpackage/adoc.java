package defpackage;

import android.database.DataSetObserver;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adoc extends DataSetObserver {
    final /* synthetic */ adyc a;

    public adoc(adyc adycVar) {
        this.a = adycVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        adyc adycVar = this.a;
        aokc aokcVarA = ((adol) adycVar.a).a();
        if (aokcVarA == null) {
            adycVar.b();
            return;
        }
        Iterator it = aokcVarA.h.iterator();
        while (it.hasNext()) {
            adof.c((ajwo) it.next(), adycVar);
        }
        Object obj = adycVar.b;
        adycVar.d(!aokcVarA.f);
        ((adof) ((ahhp) obj).a).c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(aokcVarA.i, (amud) null), null);
    }
}

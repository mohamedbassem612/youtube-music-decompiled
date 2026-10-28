package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class sob implements bnu {
    final /* synthetic */ soc a;

    public sob(soc socVar) {
        this.a = socVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        soc socVar = this.a;
        List list = (List) socVar.a.get(ajtq.TERMINATION_EVENT_TYPE_RETURNED_TO_APP);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            acrx acrxVar = (acrx) it.next();
            yno.eA(socVar.b, acrxVar.b, acrxVar.c);
            boolean z = acrxVar.a;
            it.remove();
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}

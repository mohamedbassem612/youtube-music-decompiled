package defpackage;

import com.google.android.gms.common.api.Status;
import j$.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kka extends kjq {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicReference b = new AtomicReference();
    public final String c;
    public final kjo d;
    final /* synthetic */ kkc e;
    private final List f;

    public kka(kkc kkcVar, List list, String str, kjo kjoVar) {
        this.e = kkcVar;
        this.f = list;
        this.c = str;
        this.d = kjoVar;
    }

    @Override // defpackage.kjq
    public final void d(Status status) {
        List list = this.f;
        if (kkc.d(list)) {
            kjx.a(((kjz) list.get(0)).a.a.f, 1035);
        } else {
            kjx.a(this.c, 1028);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kjx.a(((kjz) it.next()).a.a.f, 1029);
            }
        }
        agke agkeVar = (agke) Collection.EL.stream(list).map(new ixa(13)).collect(aghu.a);
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            a$$ExternalSyntheticApiModelOutline0.m7m(agkeVar.get(i)).r(status);
        }
        this.e.a(this.a, this.b, this.c, this.d);
    }
}

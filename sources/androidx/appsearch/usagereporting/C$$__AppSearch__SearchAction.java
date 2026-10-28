package androidx.appsearch.usagereporting;

import defpackage.sb;
import defpackage.sg;
import defpackage.sj;
import defpackage.sl;
import defpackage.sm;
import defpackage.ss;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.appsearch.usagereporting.$$__AppSearch__SearchAction, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C$$__AppSearch__SearchAction implements sm {
    @Override // defpackage.sm
    public final sl a() {
        sb sbVar = new sb("builtin:SearchAction");
        sg sgVar = new sg("actionType");
        sgVar.b(2);
        sgVar.c(0);
        sbVar.c(sgVar.a());
        sj sjVar = new sj("query");
        sjVar.b(2);
        sjVar.e(1);
        sjVar.c(2);
        sjVar.d(0);
        sbVar.c(sjVar.a());
        sg sgVar2 = new sg("fetchedResultCount");
        sgVar2.b(2);
        sgVar2.c(0);
        sbVar.c(sgVar2.a());
        return sbVar.a();
    }

    @Override // defpackage.sm
    public final /* bridge */ /* synthetic */ ss b(Object obj) {
        throw null;
    }

    @Override // defpackage.sm
    public final List c() {
        return Collections.EMPTY_LIST;
    }
}

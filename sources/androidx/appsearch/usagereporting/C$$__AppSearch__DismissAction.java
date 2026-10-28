package androidx.appsearch.usagereporting;

import defpackage.sb;
import defpackage.sg;
import defpackage.sj;
import defpackage.sl;
import defpackage.sm;
import defpackage.ss;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.appsearch.usagereporting.$$__AppSearch__DismissAction, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C$$__AppSearch__DismissAction implements sm {
    @Override // defpackage.sm
    public final sl a() {
        sb sbVar = new sb("builtin:DismissAction");
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
        sj sjVar2 = new sj("referencedQualifiedId");
        sjVar2.b(2);
        sjVar2.e(0);
        sjVar2.c(0);
        sjVar2.d(1);
        sbVar.c(sjVar2.a());
        sg sgVar2 = new sg("resultRankInBlock");
        sgVar2.b(2);
        sgVar2.c(0);
        sbVar.c(sgVar2.a());
        sg sgVar3 = new sg("resultRankGlobal");
        sgVar3.b(2);
        sgVar3.c(0);
        sbVar.c(sgVar3.a());
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

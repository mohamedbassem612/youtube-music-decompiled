package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abvu implements abuo {
    private final abvk a;

    public abvu(abvk abvkVar) {
        this.a = abvkVar;
    }

    @Override // defpackage.abuo
    public final /* synthetic */ ListenableFuture a(abun abunVar, abug abugVar) {
        return ahng.m(new UnsupportedOperationException());
    }

    @Override // defpackage.abuo
    public final /* synthetic */ void b(abun abunVar, abuc abucVar) {
        abpi abpiVar = this.a.s;
        abvt abvtVar = (abvt) abunVar;
        if (!abpiVar.f()) {
            abpiVar.a();
        }
        abpiVar.c(abvtVar.a, abvtVar.b);
    }

    @Override // defpackage.abuo
    public final /* synthetic */ void c(abun abunVar, abun abunVar2) {
    }
}

package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zgl extends agm {
    private final Executor c;

    public zgl(int i, Executor executor) {
        super(i);
        this.c = executor;
    }

    @Override // defpackage.agm
    protected final /* bridge */ /* synthetic */ void f(boolean z, Object obj, Object obj2, Object obj3) {
        zgj zgjVar = (zgj) obj2;
        if (z) {
            Executor executor = this.c;
            zgjVar.getClass();
            executor.execute(afwl.i(new zdv(zgjVar, 8)));
        }
    }
}

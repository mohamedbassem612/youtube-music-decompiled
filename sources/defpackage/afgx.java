package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afgx implements Function0 {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public afgx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Object invoke() {
        int i = this.$cid;
        if (i == 0) {
            return ((qe) this.a).getDefaultViewModelProviderFactory();
        }
        if (i == 1) {
            return new bou[((awzc[]) this.a).length];
        }
        Object obj = this.a;
        return i != 2 ? ((qe) obj).getDefaultViewModelCreationExtras() : ((qe) obj).getViewModelStore();
    }
}

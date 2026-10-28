package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afqt implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ afqt(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$cid;
        if (i == 0) {
            aciz acizVar = (aciz) this.a;
            String strL = qnl.l((Context) acizVar.b);
            return (strL == null || strL.length() == 0) ? acizVar.a : strL;
        }
        Object obj = this.a;
        if (i == 1) {
            return ((afpa) obj).getDefaultViewModelCreationExtras();
        }
        avmn avmnVar = (avmn) ((AtomicReference) obj).getAndSet(avns.a);
        if (avmnVar != null) {
            avmnVar.dispose();
        }
        return awmy.a;
    }
}

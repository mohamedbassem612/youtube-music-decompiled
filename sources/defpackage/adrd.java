package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adrd implements awzd {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public adrd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.awzd
    public final /* synthetic */ Object emit(Object obj, awoq awoqVar) {
        if (this.$cid != 0) {
            Function0 function0 = ((adqc) this.a).g;
            if (function0 != null) {
                function0.invoke();
            }
            return awmy.a;
        }
        Function0 function1 = ((adrf) this.a).m;
        if (function1 != null) {
            function1.invoke();
        }
        return awmy.a;
    }
}

package defpackage;

import j$.time.Duration;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yhn implements Function0 {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ yhn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v21, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [aunn, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$cid;
        if (i == 0) {
            int iD = (int) ((zhl) this.a).l.d(3, 45795045L);
            if (iD <= 0) {
                iD = 2097152;
            }
            return Integer.valueOf(iD);
        }
        if (i == 1) {
            Duration duration = ycd.a;
            return (ycp) this.a.io();
        }
        if (i == 2) {
            return (Double) this.a.io();
        }
        if (i != 3) {
            ?? r4 = this.a;
            return i == 4 ? (Double) r4.io() : r4;
        }
        zyw zywVar = (zyw) this.a;
        return Boolean.valueOf((boolean) ((zywVar.a.a > ((Number) zywVar.b.a()).doubleValue() ? 1 : (zywVar.a.a == ((Number) zywVar.b.a()).doubleValue() ? 0 : -1)) >>> 31));
    }
}

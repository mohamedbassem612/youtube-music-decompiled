package defpackage;

import j$.time.Duration;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cpt implements ToLongFunction {
    private final /* synthetic */ int $cid;

    public /* synthetic */ cpt(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.$cid) {
            case 0:
                int i = cpu.a;
                return ((abnx) obj).b;
            case 1:
                int i2 = cpu.a;
                return ((abnx) obj).a;
            case 2:
                int i3 = cyo.d;
                return ((cyo) obj).a;
            case 3:
                int i4 = cyo.d;
                return ((cyo) obj).b;
            case 4:
                int i5 = dba.a;
                return dba.d(((abnx) obj).a);
            case 5:
                return ((aawx) obj).a;
            case 6:
                return ((anyx) obj).getLengthMs().longValue();
            case 7:
                return ((aohb) ((aamo) obj).e).h;
            case 8:
                return ((Duration) obj).toMillis();
            case 9:
                return ((Long) obj).longValue();
            case 10:
                return ((skl) obj).a();
            case 11:
                return ((slj) obj).d.a;
            case 12:
                return ((atpf) obj).e;
            default:
                return ((ygu) obj).a();
        }
    }
}

package defpackage;

import java.util.Comparator;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ygh implements ToLongFunction {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ygh(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((ygj) obj).a;
        }
        if (i == 1) {
            return ((atpg) obj).c;
        }
        if (i == 2) {
            Comparator comparator = ygl.a;
            return ((ygj) obj).b.size();
        }
        if (i == 3) {
            return ((yez) obj).f;
        }
        if (i != 4) {
            return i != 5 ? ((zuo) obj).P : ((ygl) obj).a();
        }
        return ((yez) obj).d;
    }
}

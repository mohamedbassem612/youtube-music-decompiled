package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oyv implements Consumer {
    private final /* synthetic */ int $cid;

    public oyv(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((oyz) obj).d();
        } else if (i != 1) {
            ((oyz) obj).c();
        } else {
            ((oyz) obj).e();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

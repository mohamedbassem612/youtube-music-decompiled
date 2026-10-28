package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rhi implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ rhi(long j, int i) {
        this.$cid = i;
        this.a = j;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            attk attkVar = rht.c;
            ((rbr) obj).g(this.a);
        } else if (i != 1) {
            attk attkVar2 = rht.c;
            ((rbr) obj).e(this.a);
        } else {
            long j = this.a;
            attk attkVar3 = rht.c;
            ((rbr) obj).f(Optional.of(Long.valueOf(j)));
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

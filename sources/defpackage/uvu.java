package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uvu implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ uvu(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((uvw) obj).y(this.a);
            return;
        }
        if (i == 1) {
            ((urc) obj).r(this.a);
        } else {
            if (i != 2) {
                ((abnc) obj).q(this.a);
                return;
            }
            boolean z = this.a;
            String str = vjj.c;
            ((aqi) obj).b(Boolean.valueOf(z));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i != 1) {
            return i != 2 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

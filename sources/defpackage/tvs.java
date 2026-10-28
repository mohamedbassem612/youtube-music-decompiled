package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tvs implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;

    public /* synthetic */ tvs(float f, int i) {
        this.$cid = i;
        this.a = f;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.$cid != 0) {
            ((jfk) obj).b(this.a);
        } else {
            ((jfk) obj).b(this.a);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.$cid != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}

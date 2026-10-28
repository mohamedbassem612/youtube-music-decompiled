package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adbe implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ adbe(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.$cid != 0) {
            ((qtf) ((aerv) obj).c.io()).b(1L, Boolean.valueOf(this.a));
        } else {
            ((qtf) ((aerv) obj).d.io()).b(1L, Boolean.valueOf(this.a));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.$cid != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}

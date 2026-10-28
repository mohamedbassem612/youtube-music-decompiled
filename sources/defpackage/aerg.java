package defpackage;

import android.os.PowerManager;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aerg implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aerg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.$cid != 0) {
            apop apopVar = ((aecx) obj).a;
            ((aecy) this.a).j(null, null);
        } else {
            ((awkv) ((axfd) this.a).d).kk(Boolean.valueOf(((PowerManager) obj).isPowerSaveMode()));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.$cid != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}

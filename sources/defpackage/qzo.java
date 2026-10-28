package defpackage;

import android.os.Build;
import android.os.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.BiConsumer$CC;
import j$.util.stream.Collector;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qzo implements BiConsumer {
    private final /* synthetic */ int $cid;

    public /* synthetic */ qzo(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            ((qvc) obj).d((qvk) obj2);
            return;
        }
        if (i == 1) {
            String strB = ((qhb) obj).b();
            if (Build.VERSION.SDK_INT < 29 || !Trace.isEnabled()) {
                return;
            }
            qgz.b(strB, "FT#cancel", 16L);
            String.format(Locale.US, "J<%s>", strB);
            return;
        }
        if (i == 2) {
            ListenableFuture listenableFuture = (ListenableFuture) obj2;
            if (listenableFuture.isDone() || listenableFuture.isCancelled()) {
                return;
            }
            listenableFuture.cancel(false);
            return;
        }
        if (i == 3) {
            ((aecf) obj2).c();
            return;
        }
        if (i == 4) {
            ((ahgr) obj).b(obj2);
            return;
        }
        ahgr ahgrVar = (ahgr) obj;
        Collector collector = agol.a;
        if (obj2 == null) {
            obj2 = agol.b;
        }
        ahgrVar.b(obj2);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.$cid;
        if (i == 0) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
        if (i == 1) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
        if (i == 2) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
        if (i != 3) {
            return i != 4 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}

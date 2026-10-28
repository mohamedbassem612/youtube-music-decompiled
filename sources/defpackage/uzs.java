package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uzs implements Consumer {
    private final /* synthetic */ int $cid;
    final /* synthetic */ awuc a;

    public uzs(awuc awucVar, int i) {
        this.$cid = i;
        this.a = awucVar;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        if (this.$cid != 0) {
            Optional optional = (Optional) obj;
            optional.getClass();
            this.a.resumeWith(optional);
        } else {
            Optional optional2 = (Optional) obj;
            optional2.getClass();
            this.a.resumeWith(optional2);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.$cid != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}

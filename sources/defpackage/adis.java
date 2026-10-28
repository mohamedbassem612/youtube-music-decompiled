package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adis implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ adis(long j, int i) {
        this.$cid = i;
        this.a = j;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return Long.valueOf(this.a);
        }
        if (i != 1) {
            return new adiw(this.a);
        }
        aihf builder = ((aily) obj).toBuilder();
        builder.copyOnWrite();
        aily ailyVar = (aily) builder.instance;
        ailyVar.b |= 64;
        ailyVar.i = this.a;
        return (aily) builder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}

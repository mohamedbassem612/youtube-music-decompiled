package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sdj implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sdj(Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return this.$cid != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.$cid == 0) {
            Object obj2 = ((aehs) this.b).f;
            aixr aixrVar = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE_PING;
            return new slj(((xsc) obj2).Z(aixrVar), aixrVar, false, ((slb) ((sko) obj).d(sjb.class)).o, new snh(this.a, 9223372036854775806L), true, false);
        }
        aihf builder = ((atop) obj).toBuilder();
        builder.copyOnWrite();
        atop atopVar = (atop) builder.instance;
        aiip aiipVar = atopVar.f;
        if (!aiipVar.b) {
            atopVar.f = aiipVar.a();
        }
        long j = this.a;
        atopVar.f.put(this.b, Long.valueOf(j));
        return (atop) builder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.$cid != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}

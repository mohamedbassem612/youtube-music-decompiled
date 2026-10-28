package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class umd implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ umd(long j, int i) {
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
            uql uqlVar = (uql) obj;
            if (!uqlVar.n.H()) {
                return Optional.empty();
            }
            Optional optionalE = uqlVar.f.e(this.a);
            sla slaVar = new sla(uqlVar, 13);
            if (true != optionalE.isPresent()) {
                return optionalE;
            }
            return ((uql) slaVar.a).e((augy) optionalE.get());
        }
        if (i != 1) {
            return ((acqh) obj).J(this.a);
        }
        sgi sgiVar = (sgi) obj;
        int i2 = 3;
        while (true) {
            if (i2 <= 0) {
                i2 = 0;
                break;
            }
            if (this.a >= (sgiVar.f * ((long) i2)) / 4) {
                break;
            }
            i2--;
        }
        if (i2 == 0 || i2 <= sgiVar.c) {
            return null;
        }
        sgiVar.c = i2;
        return sgiVar.h(i2);
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}

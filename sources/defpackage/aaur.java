package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aaur implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ aaur(List list, boolean z, int i) {
        this.$cid = i;
        this.a = list;
        this.b = z;
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
        boolean z = false;
        z = false;
        boolean z2 = false;
        if (i == 0) {
            return Boolean.valueOf(((aaml) obj).c(this.a, this.b) != null);
        }
        if (i != 1) {
            return Boolean.valueOf(((aaml) obj).c(this.a, this.b) != null);
        }
        aamm aammVar = (aamm) obj;
        aaml aamlVar = aammVar.a;
        aaml aamlVar2 = aammVar.b;
        Optional optionalOfNullable = Optional.ofNullable(aamlVar);
        List list = this.a;
        boolean z3 = this.b;
        aaur aaurVar = new aaur(list, z3, z ? 1 : 0);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((aaml) optionalOfNullable.get()).c(aaurVar.a, aaurVar.b) != null));
        }
        Boolean bool = Boolean.TRUE;
        boolean zBooleanValue = ((Boolean) optionalOfNullable.orElse(bool)).booleanValue();
        Optional optionalOfNullable2 = Optional.ofNullable(aamlVar2);
        aaur aaurVar2 = new aaur(list, z3, 2);
        if (true == optionalOfNullable2.isPresent()) {
            optionalOfNullable2 = Optional.ofNullable(Boolean.valueOf(((aaml) optionalOfNullable2.get()).c(aaurVar2.a, aaurVar2.b) != null));
        }
        boolean zBooleanValue2 = ((Boolean) optionalOfNullable2.orElse(bool)).booleanValue();
        if (zBooleanValue && zBooleanValue2) {
            z2 = true;
        }
        return Boolean.valueOf(!z2);
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}

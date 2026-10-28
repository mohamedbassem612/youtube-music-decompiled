package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class usa implements Function {
    public final /* synthetic */ usd a;
    public final /* synthetic */ long b;

    public /* synthetic */ usa(usd usdVar, long j) {
        this.a = usdVar;
        this.b = j;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        usd usdVar = this.a;
        Optional optionalN = usj.n(usdVar.c.b, this.b);
        hqb hqbVar = new hqb(usdVar, (UUID) obj, 16);
        if (true != optionalN.isPresent()) {
            return optionalN;
        }
        return Optional.ofNullable(new usb((augy) optionalN.get(), ((usd) hqbVar.a).b((UUID) hqbVar.b)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}

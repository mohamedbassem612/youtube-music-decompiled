package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hqo implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ jan d;

    public /* synthetic */ hqo(jan janVar, Object obj, boolean z, boolean z2, int i) {
        this.$cid = i;
        this.d = janVar;
        this.c = obj;
        this.a = z;
        this.b = z2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        int i = this.$cid;
        final jan janVar = this.d;
        if (i == 0) {
            final aaex aaexVarE = ((aanb) janVar.h).b().e();
            aaexVarE.getClass();
            final Map map = (Map) Collection.EL.stream(aaexVarE.ap()).collect(Collectors.toMap(new hpp(17), new hpp(18), new hnh(6), new hcd(12)));
            ?? r0 = this.c;
            final boolean z2 = this.b;
            final boolean z3 = this.a;
            return (List) Collection.EL.stream(r0).map(new Function() { // from class: hqh
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public final /* synthetic */ Function mo840andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    aamh aamhVar = (aamh) map.get(str);
                    if (aamhVar == null) {
                        return Optional.empty();
                    }
                    boolean z4 = z3;
                    jan janVar2 = janVar;
                    if (((hlz) janVar2.g).k(aamhVar) != z4) {
                        return Optional.empty();
                    }
                    boolean z5 = z2;
                    aaex aaexVar = aaexVarE;
                    List listK = aaexVar.k(str);
                    if (!z5) {
                        return Optional.of(z4 ? ((hef) janVar2.c).h(aamhVar, listK) : ((jnm) janVar2.b).w(aamhVar, listK));
                    }
                    aogf aogfVarAl = aaexVar.al(str);
                    long jAf = aaexVar.af(str);
                    return Optional.of(z4 ? ((hef) janVar2.c).f(aamhVar, listK, jAf, aogfVarAl) : ((jnm) janVar2.b).u(aamhVar, listK, jAf, aogfVarAl));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new hcd(13)));
        }
        aaex aaexVarE2 = ((aanb) janVar.h).b().e();
        aaexVarE2.getClass();
        String str = (String) this.c;
        aamh aamhVarAi = aaexVarE2.ai(str);
        if (aamhVarAi == null || ((hlz) janVar.g).k(aamhVarAi) != (z = this.a)) {
            return Optional.empty();
        }
        boolean z4 = this.b;
        List listK = aaexVarE2.k(str);
        if (!z4) {
            return Optional.of(z ? ((hef) janVar.c).h(aamhVarAi, listK) : ((jnm) janVar.b).w(aamhVarAi, listK));
        }
        aogf aogfVarAl = aaexVarE2.al(str);
        long jAf = aaexVarE2.af(str);
        return Optional.of(z ? ((hef) janVar.c).f(aamhVarAi, listK, jAf, aogfVarAl) : ((jnm) janVar.b).u(aamhVarAi, listK, jAf, aogfVarAl));
    }
}

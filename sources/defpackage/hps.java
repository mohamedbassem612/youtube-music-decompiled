package defpackage;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.net.URLDecoder;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hps implements hpy {
    public static final /* synthetic */ int c = 0;
    private static final agkz d = agkz.r(62, 557, 318);
    public final wbz a;
    public final aauk b;
    private final how e;
    private final wco f;
    private final zwb g;
    private final Map h;
    private final Executor i;
    private final jan j;

    public hps(jan janVar, how howVar, wbz wbzVar, wco wcoVar, zwb zwbVar, Map map, Executor executor, aauk aaukVar) {
        this.j = janVar;
        this.e = howVar;
        this.a = wbzVar;
        this.f = wcoVar;
        this.g = zwbVar;
        this.h = map;
        this.i = executor;
        this.b = aaukVar;
    }

    @Override // defpackage.hpy
    public final ListenableFuture a(String str) {
        int iA;
        aigj aigjVar;
        int i = wfs.a;
        try {
            iA = wfs.a((akve) aihn.parseFrom(akve.a, Base64.decode(URLDecoder.decode(str, StandardCharsets.UTF_8), 8)));
        } catch (Exception unused) {
            iA = Integer.MIN_VALUE;
        }
        try {
            aigjVar = ((akve) aihn.parseFrom(akve.a, Base64.decode(URLDecoder.decode(str, StandardCharsets.UTF_8), 8))).f;
        } catch (Exception unused2) {
            aigjVar = aigj.d;
        }
        zwb zwbVar = this.g;
        String strB = aigjVar.B();
        zwa zwaVarE = zwbVar.e();
        agkz agkzVar = d;
        Integer numValueOf = Integer.valueOf(iA);
        if (agkzVar.contains(numValueOf)) {
            avmc avmcVarB = this.f.b(zwaVarE).g(str).r(new hpr(2)).B(Optional.empty());
            tzj tzjVar = new tzj();
            avmcVarB.F(new tzi(tzjVar));
            return tzjVar;
        }
        aahd aahdVar = (aahd) this.h.get(numValueOf);
        if (aahdVar == null) {
            return this.j.j(str);
        }
        ListenableFuture listenableFutureB = aahdVar.b(zwaVarE, strB);
        gqa gqaVar = new gqa(this, zwaVarE, 10);
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), gqaVar);
        Executor executor = this.i;
        int i2 = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureB, afwiVar);
        listenableFutureB.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return ahcrVar;
    }

    @Override // defpackage.hpy
    public final ListenableFuture b(List list) {
        int iA;
        ListenableFuture aherVar;
        if (list.isEmpty()) {
            agke agkeVar = agpi.a;
            if (agkeVar == null) {
                return aher.a;
            }
            aherVar = new aher(agkeVar);
        } else {
            if (Collection.EL.stream(list).map(new hpp(2)).distinct().count() != 1) {
                throw new IllegalArgumentException("Entity keys MUST correspond to entities with similar Entity field type");
            }
            String str = (String) list.get(0);
            int i = wfs.a;
            try {
                iA = wfs.a((akve) aihn.parseFrom(akve.a, Base64.decode(URLDecoder.decode(str, StandardCharsets.UTF_8), 8)));
            } catch (Exception unused) {
                iA = Integer.MIN_VALUE;
            }
            zwa zwaVarE = this.g.e();
            agkz agkzVar = d;
            Integer numValueOf = Integer.valueOf(iA);
            if (!agkzVar.contains(numValueOf)) {
                int i2 = 11;
                List list2 = (List) Collection.EL.stream(list).map(new hpp(3)).collect(Collectors.toCollection(new hcd(11)));
                aahd aahdVar = (aahd) this.h.get(numValueOf);
                if (aahdVar == null) {
                    return this.j.k(list);
                }
                ListenableFuture listenableFutureA = aahdVar.a(zwaVarE, list2);
                gqa gqaVar = new gqa(this, zwaVarE, i2);
                long j = afwl.a;
                afwi afwiVar = new afwi(afty.c(false), gqaVar);
                Executor executor = this.i;
                int i3 = ahcs.c;
                ahcr ahcrVar = new ahcr(listenableFutureA, afwiVar);
                listenableFutureA.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
                return ahcrVar;
            }
            avmc avmcVarU = this.f.b(zwaVarE).n(list).u(new hbn(list, 17));
            tzj tzjVar = new tzj();
            avmcVarU.F(new tzi(tzjVar));
            aherVar = tzjVar;
        }
        return aherVar;
    }

    @Override // defpackage.hpy
    public final ListenableFuture c(List list) {
        jan janVar = this.j;
        if (!janVar.r()) {
            return janVar.k(list);
        }
        if (list.isEmpty()) {
            return ahng.n(agpi.a);
        }
        ahno.G(Collection.EL.stream(list).map(new hpp(12)).distinct().count() == 1, "Entity keys MUST correspond to entities with similar Entity field type");
        int iB = wfs.b((String) list.get(0));
        List list2 = (List) Collection.EL.stream(list).map(new hpp(13)).collect(Collectors.toCollection(new hcd(13)));
        if (iB == 17) {
            return janVar.n(true, false, list2);
        }
        if (iB == 24) {
            return janVar.n(false, false, list2);
        }
        if (iB == 28) {
            return janVar.o(list2, false);
        }
        if (iB == 234) {
            return janVar.o(list2, true);
        }
        if (iB != 248) {
            return iB != 259 ? janVar.k(list) : janVar.n(true, true, list2);
        }
        return janVar.n(false, true, list2);
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.hpy
    public final ListenableFuture d(String str) {
        jan janVar = this.j;
        if (!janVar.r()) {
            return janVar.j(str);
        }
        int iB = wfs.b(str);
        String strH = wfs.h(str);
        ahno.F(hpv.a.containsKey(Integer.valueOf(iB)));
        int i = 1;
        if (iB == 17) {
            return janVar.p(true, false, strH);
        }
        if (iB == 24) {
            return janVar.p(false, false, strH);
        }
        if (iB == 28) {
            return janVar.q(strH, false);
        }
        if (iB == 234) {
            return janVar.q(strH, true);
        }
        if (iB == 248) {
            return janVar.p(false, true, strH);
        }
        if (iB != 257) {
            return iB != 259 ? janVar.j(str) : janVar.p(true, true, strH);
        }
        return ahng.r(afwl.j(new huo(janVar, i)), janVar.f);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.hpy
    public final avlr e(String str) {
        zwb zwbVar = this.g;
        if (!zwbVar.u()) {
            return avlr.z();
        }
        how howVar = this.e;
        jan janVar = this.j;
        Object obj = janVar.h;
        obj.getClass();
        Callable callableJ = afwl.j(new ub(obj, 20));
        ?? r2 = janVar.f;
        return howVar.h.c(tzk.h(ahno.as(ahng.r(callableJ, r2), new gpr(5), r2)).k(new hmd(10)).s()).z(this.a.e(zwbVar.e()).k(str).K(new hpr(3)));
    }

    @Override // defpackage.hpy
    public final avlr f(Class cls) {
        if (hpv.a.containsValue(cls)) {
            return ((hqg) this.j.d).e.aI().N().x(new ifu(cls, 1)).p().ag();
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.hpy
    public final avlr g() {
        return ((aanb) this.j.h).c();
    }

    @Override // defpackage.hpy
    public final boolean h() {
        return this.b.e.l(44, 45743860L, false);
    }

    @Override // defpackage.hpy
    public final boolean i() {
        return ((aanb) this.j.h).g();
    }
}

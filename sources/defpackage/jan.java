package defpackage;

import android.app.Application;
import android.os.Handler;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.net.URLDecoder;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jan {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public jan(aunn aunnVar, abjp abjpVar, ycp ycpVar, avlh avlhVar, abvn abvnVar, awmd awmdVar, avmb avmbVar) {
        iey ieyVar = new iey(this, 1);
        this.g = ieyVar;
        aunnVar.getClass();
        this.a = aunnVar;
        abjpVar.getClass();
        this.b = abjpVar;
        this.c = ycpVar;
        this.h = new awku(icz.a);
        this.d = new awku(Boolean.FALSE);
        this.e = abvnVar;
        this.f = awmdVar;
        abjpVar.d(0).hK(ieyVar);
        int i = 14;
        new avmm().e(avlhVar.L(avmbVar).al(new icy(this, 1), new hyx(i)), abvnVar.P().L(avmbVar).al(new icy(this, 0), new hyx(i)));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture s() {
        ListenableFuture listenableFutureY = y();
        hqm hqmVar = new hqm(this, 0);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), hqmVar, 1);
        int i = ahcs.c;
        ?? r5 = this.f;
        ahcq ahcqVar = new ahcq(listenableFutureY, ahdbVar);
        listenableFutureY.addListener(ahcqVar, MoreExecutors.c(r5, ahcqVar));
        return ahcqVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture t(final boolean z, final List list, final Function function) {
        return ahno.ar(l(), new agek() { // from class: hqk
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                final Map map = (Map) Collection.EL.stream((java.util.Collection) obj).collect(Collectors.toMap(new hpp(15), new hpp(16), new hnh(5)));
                final boolean z2 = z;
                Stream stream = Collection.EL.stream(list);
                final jan janVar = this.d;
                final Function function2 = function;
                return (List) stream.map(new Function() { // from class: hqr
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public final /* synthetic */ Function mo840andThen(Function function3) {
                        return Function$CC.$default$andThen(this, function3);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        aamj aamjVar = (aamj) map.get((String) obj2);
                        if (aamjVar == null) {
                            return Optional.empty();
                        }
                        boolean z3 = z2;
                        jan janVar2 = janVar;
                        if (((hlz) janVar2.g).k(aamjVar.a) != z3) {
                            return Optional.empty();
                        }
                        Function function3 = function2;
                        Optional optionalOf = Optional.of(aamjVar);
                        optionalOf.isPresent();
                        return Optional.ofNullable(function3.apply(optionalOf.get()));
                    }

                    public final /* synthetic */ Function compose(Function function3) {
                        return Function$CC.$default$compose(this, function3);
                    }
                }).collect(Collectors.toList());
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture u(String str) {
        return ahno.as(v(), new hqj(str, 0), this.f);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture v() {
        ebs ebsVar = new ebs(this, 5);
        long j = afwl.a;
        ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), ebsVar, 1));
        this.f.execute(ahfoVar);
        return ahfoVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture w(final List list, final Function function) {
        return ahno.ar(m(), new agek() { // from class: hqi
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                final Map map = (Map) Collection.EL.stream((java.util.Collection) obj).collect(Collectors.toMap(new hds(16), new hpp(14), new hnh(4)));
                final Function function2 = function;
                return (List) Collection.EL.stream(list).map(new Function() { // from class: hqp
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public final /* synthetic */ Function mo840andThen(Function function3) {
                        return Function$CC.$default$andThen(this, function3);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        Optional optionalOfNullable = Optional.ofNullable((aamt) map.get((String) obj2));
                        return true == optionalOfNullable.isPresent() ? Optional.ofNullable(function2.apply(optionalOfNullable.get())) : optionalOfNullable;
                    }

                    public final /* synthetic */ Function compose(Function function3) {
                        return Function$CC.$default$compose(this, function3);
                    }
                }).collect(Collectors.toList());
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture x(String str) {
        return ahno.as(y(), new hqj(str, 2), this.f);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture y() {
        ebs ebsVar = new ebs(this, 4);
        long j = afwl.a;
        ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), ebsVar, 1));
        this.f.execute(ahfoVar);
        return ahfoVar;
    }

    public final icz a() {
        int iOrdinal = b().ordinal();
        if (iOrdinal == 0) {
            return icz.b;
        }
        if (iOrdinal == 1) {
            return icz.a;
        }
        if (iOrdinal == 2) {
            return icz.c;
        }
        throw new RuntimeException(null, null);
    }

    public final icz b() {
        icz iczVar = (icz) ((awku) this.h).aD();
        return iczVar == null ? icz.a : iczVar;
    }

    public final abjz c() {
        return ((abjp) this.b).i();
    }

    public final avlh d() {
        return ((avlh) this.h).P().p();
    }

    public final void e() {
        if (b() != icz.c) {
            ((abjp) this.b).v();
            ((awku) this.h).kk(icz.a);
        }
    }

    public final void f() {
        g(a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tbj] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aunn, java.lang.Object] */
    public final void g(icz iczVar) {
        abjp abjpVar = (abjp) this.b;
        abjpVar.d(0).n(this.g);
        int iOrdinal = iczVar.ordinal();
        if (iOrdinal == 0) {
            abjpVar.A();
        } else if (iOrdinal == 1) {
            abjpVar.y();
        } else if (iOrdinal == 2) {
            abjpVar.v();
        }
        ((awku) this.h).kk(iczVar);
        ((Handler) this.a.io()).post(new hgx(this, 17));
    }

    public final boolean h() {
        Boolean bool = (Boolean) ((awku) this.d).aD();
        return bool != null && bool.booleanValue();
    }

    public final boolean i() {
        return b().equals(icz.b) && c() != abjz.c;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture j(String str) {
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
        String strB = aigjVar.B();
        agkj agkjVar = hpv.a;
        Integer numValueOf = Integer.valueOf(iA);
        if (!agkjVar.containsKey(numValueOf)) {
            throw new IllegalArgumentException();
        }
        int i2 = 1;
        int i3 = 17;
        if (iA == 17) {
            return ahno.ar(u(strB), new hrk(this, i2), this.f);
        }
        if (iA == 24) {
            return ahno.ar(u(strB), new hnd(this, 13), this.f);
        }
        if (iA == 28) {
            return ahno.ar(x(strB), new hnd(this, 19), this.f);
        }
        if (iA == 130) {
            return ahno.ar(x(strB), new hnd(this, 15), this.f);
        }
        if (iA == 198) {
            return ahno.ar(x(strB), new hnd(this, 18), this.f);
        }
        if (iA == 234) {
            return ahno.ar(x(strB), new hnd(this, 16), this.f);
        }
        if (iA == 248) {
            return ahno.ar(u(strB), new hnd(this, 12), this.f);
        }
        if (iA == 257) {
            return s();
        }
        if (iA == 259) {
            return ahno.ar(u(strB), new hnd(this, 14), this.f);
        }
        if (iA == 119) {
            return ahno.ar(x(strB), new hnd(this, i3), this.f);
        }
        if (iA == 120) {
            return ahno.ar(x(strB), new hnd(this, 20), this.f);
        }
        throw new IllegalArgumentException(String.format(Locale.getDefault(), "OfflineStore Entity field number %d requested, but not supported", numValueOf));
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture k(List list) {
        if (list.isEmpty()) {
            return ahng.n(agpi.a);
        }
        int i = 0;
        ahno.G(Collection.EL.stream(list).map(new hpp(12)).distinct().count() == 1, "Entity keys MUST correspond to entities with similar Entity field type");
        int iB = wfs.b((String) list.get(0));
        List list2 = (List) Collection.EL.stream(list).map(new hpp(13)).collect(Collectors.toList());
        if (iB == 17) {
            Object obj = this.c;
            obj.getClass();
            return t(true, list2, new hqs(obj, 6));
        }
        if (iB == 24) {
            Object obj2 = this.b;
            obj2.getClass();
            return t(false, list2, new hqs(obj2, 4));
        }
        if (iB == 28) {
            Object obj3 = this.e;
            obj3.getClass();
            return w(list2, new hqs(obj3, i));
        }
        if (iB == 120) {
            Object obj4 = this.e;
            obj4.getClass();
            return w(list2, new hqs(obj4, 3));
        }
        if (iB == 234) {
            Object obj5 = this.e;
            obj5.getClass();
            return w(list2, new hqs(obj5, 2));
        }
        if (iB == 248) {
            Object obj6 = this.b;
            obj6.getClass();
            return t(false, list2, new hqs(obj6, 5));
        }
        if (iB == 257) {
            return ahno.ar(s(), new hqt(i), this.f);
        }
        if (iB != 259) {
            return ahng.m(new IllegalArgumentException(String.format(Locale.getDefault(), "Unexpected entityFieldNumber, %d", Integer.valueOf(iB))));
        }
        Object obj7 = this.c;
        obj7.getClass();
        return t(true, list2, new hqs(obj7, 7));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture l() {
        ListenableFuture listenableFutureV = v();
        hqn hqnVar = new hqn(1);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), hqnVar, 1);
        int i = ahcs.c;
        ?? r5 = this.f;
        ahcq ahcqVar = new ahcq(listenableFutureV, ahdbVar);
        listenableFutureV.addListener(ahcqVar, MoreExecutors.c(r5, ahcqVar));
        return ahcqVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture m() {
        ListenableFuture listenableFutureY = y();
        hqn hqnVar = new hqn(0);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), hqnVar, 1);
        int i = ahcs.c;
        ?? r5 = this.f;
        ahcq ahcqVar = new ahcq(listenableFutureY, ahdbVar);
        listenableFutureY.addListener(ahcqVar, MoreExecutors.c(r5, ahcqVar));
        return ahcqVar;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture n(boolean z, boolean z2, List list) {
        return ahng.r(afwl.j(new hqo(this, list, z, z2, 0)), this.f);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture o(List list, boolean z) {
        return ahng.r(afwl.j(new hqq(this, list, z, 0)), this.f);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture p(boolean z, boolean z2, String str) {
        return ahng.r(afwl.j(new hqo(this, str, z, z2, 1)), this.f);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture q(String str, boolean z) {
        return ahng.r(afwl.j(new hqq(this, str, z, 1)), this.f);
    }

    public final boolean r() {
        return !((aanb) this.h).g();
    }

    public jan(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8) {
        this.b = aunnVar;
        this.a = aunnVar2;
        this.g = aunnVar3;
        this.d = aunnVar4;
        this.f = aunnVar5;
        this.c = aunnVar6;
        this.h = aunnVar7;
        this.e = aunnVar8;
    }

    public jan(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, tqj tqjVar, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7) {
        this.f = aunnVar;
        this.h = aunnVar2;
        this.a = aunnVar3;
        this.c = aunnVar4;
        this.d = tqjVar;
        this.g = aunnVar5;
        this.e = aunnVar6;
        this.b = aunnVar7;
    }

    public jan(Executor executor, aanb aanbVar, hqg hqgVar, hlz hlzVar, jnm jnmVar, hef hefVar, jnm jnmVar2, jnm jnmVar3) {
        this.f = executor;
        this.h = aanbVar;
        this.d = hqgVar;
        this.g = hlzVar;
        this.e = jnmVar;
        this.c = hefVar;
        this.b = jnmVar2;
        this.a = jnmVar3;
    }

    public jan(Application application, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, tqj tqjVar) {
        this.h = application;
        this.d = aunnVar;
        this.c = aunnVar2;
        this.g = aunnVar3;
        this.b = aunnVar4;
        this.f = aunnVar5;
        this.e = aunnVar6;
        this.a = tqjVar;
    }

    public jan(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, char[] cArr, byte[] bArr) {
        awmdVar.getClass();
        this.d = awmdVar;
        this.e = awmdVar2;
        awmdVar3.getClass();
        this.h = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
        awmdVar6.getClass();
        this.c = awmdVar6;
        awmdVar7.getClass();
        this.f = awmdVar7;
        awmdVar8.getClass();
        this.g = awmdVar8;
    }

    public jan(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.d = awmdVar;
        this.e = awmdVar2;
        awmdVar3.getClass();
        this.h = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
        awmdVar6.getClass();
        this.c = awmdVar6;
        awmdVar7.getClass();
        this.f = awmdVar7;
        awmdVar8.getClass();
        this.g = awmdVar8;
    }

    public jan(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, byte[] bArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.f = awmdVar2;
        awmdVar3.getClass();
        this.h = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.g = awmdVar5;
        awmdVar6.getClass();
        this.d = awmdVar6;
        awmdVar7.getClass();
        this.e = awmdVar7;
        awmdVar8.getClass();
        this.b = awmdVar8;
    }

    public jan(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, char[] cArr) {
        awmdVar.getClass();
        this.d = awmdVar;
        this.e = awmdVar2;
        awmdVar3.getClass();
        this.h = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
        awmdVar6.getClass();
        this.c = awmdVar6;
        awmdVar7.getClass();
        this.f = awmdVar7;
        awmdVar8.getClass();
        this.g = awmdVar8;
    }

    public jan(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        this.f = awmdVar6;
        awmdVar7.getClass();
        this.g = awmdVar7;
        awmdVar8.getClass();
        this.h = awmdVar8;
    }
}

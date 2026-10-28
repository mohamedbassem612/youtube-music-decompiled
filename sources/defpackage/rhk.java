package defpackage;

import android.util.Pair;
import com.google.research.xeno.effect.Control;
import com.google.research.xeno.effect.Effect;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rhk implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rhk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v52, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v53, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v54, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v55, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v60, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 4;
        switch (this.$cid) {
            case 0:
                attk attkVar = rht.c;
                return Stream.CC.ofNullable((Control) ((Effect) obj).b.get(this.a));
            case 1:
                attk attkVar2 = rht.c;
                return Stream.CC.ofNullable((Control) ((Effect) obj).b.get(this.a));
            case 2:
                qup qupVar = (qup) obj;
                quz quzVar = (quz) qupVar.b;
                Comparable comparableF = quzVar.l;
                riv rivVar = (riv) this.a;
                if (rivVar.e.f) {
                    comparableF = afyd.f(comparableF, quzVar.k.f());
                }
                Duration duration = (Duration) comparableF;
                Duration durationPlus = duration.plus(Duration.ofMillis((long) (qupVar.d.toMillis() * quzVar.n)));
                bsi bsiVar = new bsi();
                bsiVar.b = quzVar.k.c();
                Optional optionalEmpty = Optional.empty();
                optionalEmpty.isPresent();
                bsiVar.c = (String) optionalEmpty.orElse(null);
                bsj bsjVar = new bsj();
                bsjVar.d(duration.toMillis());
                bsjVar.c = rivVar.q.J;
                bsjVar.c(durationPlus.toMillis());
                bsiVar.b(new bsk(bsjVar));
                return bsiVar.a();
            case 3:
                return ((nrc) this.a).f((qwm) obj);
            case 4:
                afhn afhnVar = (afhn) obj;
                affd affdVar = afhnVar.a;
                Object obj2 = this.a;
                try {
                    return afxd.f(((roz) aguu.aw(((rpa) obj2).b, roz.class, affdVar)).p().b(afiz.a, "YTLibraryResponseStore.pb").p()).g(new rns(afhnVar, i), ((rpa) obj2).c).b(IOException.class, new rmk(5), ((rpa) obj2).d);
                } catch (IllegalStateException unused) {
                    return ahng.n(Optional.empty());
                }
            case 5:
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((atop) obj).f);
                Object obj3 = this.a;
                if (mapUnmodifiableMap.containsKey(obj3)) {
                    return (Long) mapUnmodifiableMap.get(obj3);
                }
                return null;
            case 6:
                aihf builder = ((atop) obj).toBuilder();
                builder.copyOnWrite();
                atop atopVar = (atop) builder.instance;
                atopVar.b |= 8;
                atopVar.e = (String) this.a;
                return (atop) builder.build();
            case 7:
                aihf builder2 = ((atop) obj).toBuilder();
                builder2.copyOnWrite();
                ((atop) builder2.instance).a().remove(this.a);
                return (atop) builder2.build();
            case 8:
                Boolean bool = (Boolean) ((atop) obj).h.get(this.a);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 9:
                aihf builder3 = ((atop) obj).toBuilder();
                builder3.copyOnWrite();
                atop atopVar2 = (atop) builder3.instance;
                atopVar2.b |= 4;
                atopVar2.d = (String) this.a;
                return (atop) builder3.build();
            case 10:
                aihf builder4 = ((atop) obj).toBuilder();
                builder4.copyOnWrite();
                atop atopVar3 = (atop) builder4.instance;
                aiip aiipVar = atopVar3.h;
                if (!aiipVar.b) {
                    atopVar3.h = aiipVar.a();
                }
                atopVar3.h.put(this.a, Boolean.TRUE);
                return (atop) builder4.build();
            case 11:
                return Optional.ofNullable((aijp) DesugarCollections.unmodifiableMap(((atop) obj).g).get(this.a));
            case 12:
                return sme.a((aiwc) obj, ((long) ((slb) this.a).a()) * 1000).stream();
            case 13:
                spl splVar = spl.PREFETCH_SERVICE_INITIALIZED;
                return new spo((String) obj, ((spm) this.a).b);
            case 14:
                return sme.a((aiwc) obj, ((long) ((spz) this.a).b.a()) * 1000).stream();
            case 15:
                return this.a.invoke(obj);
            case 16:
                return this.a.invoke(obj);
            case 17:
                return this.a.invoke(obj);
            case 18:
                return this.a.invoke(obj);
            case 19:
                ugl uglVar = (ugl) obj;
                uglVar.iZ();
                return new Pair(uglVar, ahno.aB(Boolean.valueOf(!((roq) ((xsc) this.a).a).a.contains(""))));
            default:
                return ((uld) this.a).p(((qvs) obj).m);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}

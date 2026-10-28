package defpackage;

import com.google.research.xeno.effect.Control;
import com.google.research.xeno.effect.Effect;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rcs implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rcs(int i) {
        this.$cid = i;
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

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((qup) obj).clone();
            case 1:
                return ((qup) obj).c;
            case 2:
                rdk rdkVar = (rdk) obj;
                int i = rdl.c;
                return rdkVar;
            case 3:
                int i2 = rdl.c;
                return new ConcurrentLinkedDeque();
            case 4:
                Duration duration = rdr.a;
                return (qvs) ((qvu) obj);
            case 5:
                return ((rfp) obj).a;
            case 6:
                return ((reo) obj).ix();
            case 7:
                Duration duration2 = rek.a;
                return (qvs) ((qvu) obj);
            case 8:
                return ((qvs) obj).m;
            case 9:
                return ((qxj) obj).b;
            case 10:
                return Integer.valueOf(((rem) obj).a());
            case 11:
                rbm rbmVar = rgc.f;
                return ((rfs) obj).c.m.stream();
            case 12:
                return ((rfs) obj).c;
            case 13:
                return (qvk) ((Optional) obj).get();
            case 14:
                return ((Optional) obj).stream();
            case 15:
                return ((qvc) obj).c();
            case 16:
                Map map = ((Effect) obj).b;
                int i3 = rha.d;
                return Collection.EL.stream(map.values());
            case 17:
                attk attkVar = rht.c;
                return Stream.CC.ofNullable(((qvk) obj).a);
            case 18:
                attk attkVar2 = rht.c;
                return Stream.CC.ofNullable(((qvk) obj).a);
            case 19:
                Map map2 = ((Effect) obj).b;
                attk attkVar3 = rht.c;
                return Collection.EL.stream(map2.values());
            default:
                return ((Control) obj).d;
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

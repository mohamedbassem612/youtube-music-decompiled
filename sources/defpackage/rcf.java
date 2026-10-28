package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rcf implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rcf(int i) {
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
                List list = (List) obj;
                if (list.size() == 1) {
                    return list;
                }
                return agke.q(new rcq(agke.n(list), nra.s(list, new qzp(19), new qzp(20))));
            case 1:
                qwm qwmVar = (qwm) obj;
                boolean z = qwmVar.r;
                boolean z2 = qwmVar.o;
                agke agkeVar = (agke) Collection.EL.stream(qwmVar.is()).map(new rcf(2)).collect(aghu.a);
                boolean z3 = qwmVar.k.e;
                return new rch(z, z2, agkeVar);
            case 2:
                return ((qvc) obj).iv();
            case 3:
                return ((qwm) obj).clone();
            case 4:
                return ((qwm) obj).p;
            case 5:
                return ((qwm) obj).m;
            case 6:
                return ((qup) obj).clone();
            case 7:
                return ((qup) obj).c;
            case 8:
                return ((qup) obj).a;
            case 9:
                return ((qup) obj).a;
            case 10:
                qus qusVar = ((qup) obj).b;
                int i = rcl.l;
                return Integer.valueOf(((quu) qusVar).a);
            case 11:
                return ((qup) obj).c;
            case 12:
                return ((qup) obj).b();
            case 13:
                return ((qup) obj).clone();
            case 14:
                return ((qup) obj).clone();
            case 15:
                return ((qup) obj).a;
            case 16:
                qus qusVar2 = ((qup) obj).b;
                rbm rbmVar = rco.g;
                return Integer.valueOf(((quu) qusVar2).a);
            case 17:
                return ((qup) obj).c;
            case 18:
                return ((qup) obj).b();
            case 19:
                return ((qwm) obj).p;
            default:
                return ((qwm) obj).clone();
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

package defpackage;

import com.google.research.xeno.effect.Control;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayDeque;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ris implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ris(int i) {
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
                qus qusVar = ((qup) obj).b;
                rbm rbmVar = riv.z;
                return Float.valueOf(((quz) qusVar).n);
            case 1:
                attk attkVar = rht.c;
                return Stream.CC.ofNullable(((Control) obj).b);
            case 2:
                qup qupVar = (qup) obj;
                rbm rbmVar2 = riv.z;
                Duration duration = qupVar.c;
                return agke.r(duration, duration.plus(qupVar.d));
            case 3:
                return ((qvu) obj).m;
            case 4:
                return ((qxj) obj).b;
            case 5:
                int i = rjo.a;
                return (qvq) ((qvu) obj);
            case 6:
                qvq qvqVar = (qvq) obj;
                String strZ = ahno.Z(qvqVar.b.a().getPath());
                double d = qvqVar.d;
                double d2 = qvqVar.f;
                Duration durationMinus = qvqVar.p.minus(qvqVar.c);
                boolean z = qvqVar.b.e;
                return new rjn(strZ, d, d2, durationMinus);
            case 7:
                return new ArrayDeque();
            case 8:
                return new ArrayDeque();
            case 9:
                return ((wnq) obj).h();
            case 10:
                return ((afhq) obj).c;
            case 11:
                return ((rlt) obj).b;
            case 12:
                zwa zwaVar = (zwa) obj;
                zwaVar.getClass();
                return rmp.b(zwaVar);
            case 13:
                return tld.i(obj);
            case 14:
                return (String) ((Optional) obj).get();
            case 15:
                return ((wnq) obj).a;
            case 16:
                aihf builder = ((atop) obj).toBuilder();
                builder.copyOnWrite();
                atop atopVar = (atop) builder.instance;
                atopVar.b &= -5;
                atopVar.d = atop.a.d;
                return (atop) builder.build();
            case 17:
                return ((atop) obj).c;
            case 18:
                aihf builder2 = ((atop) obj).toBuilder();
                builder2.copyOnWrite();
                atop atopVar2 = (atop) builder2.instance;
                atopVar2.b |= 1;
                atopVar2.c = "";
                return (atop) builder2.build();
            case 19:
                return ((atop) obj).d;
            default:
                return new rtz();
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

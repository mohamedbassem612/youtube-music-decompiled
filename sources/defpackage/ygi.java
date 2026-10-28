package defpackage;

import android.util.Pair;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ygi implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ygi(int i) {
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
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return Long.valueOf(((yez) obj).d);
            case 1:
                return Long.valueOf(((yez) obj).f);
            case 2:
                return Long.valueOf(((ygl) obj).b());
            case 3:
                ygl yglVar = (ygl) obj;
                return Collection.EL.stream(yglVar.g()).map(new hpc(yglVar, 9));
            case 4:
                aofh aofhVar = (aofh) obj;
                int iBc = a.bc(aofhVar.c);
                if (iBc == 0) {
                    iBc = 1;
                }
                return String.format("[%s, %s]", agvp.F(iBc), aofhVar.d);
            case 5:
                return aano.d(obj);
            case 6:
                return aano.d(obj);
            case 7:
                return (aofk) ((weh) obj);
            case 8:
                return ((aret) obj).getLastUpdatedClientTimestampMs();
            case 9:
                int i = adde.b;
                return (abfv) ((Pair) obj).first;
            case 10:
                return Integer.valueOf(((adlp) obj).a);
            case 11:
                ?? r6 = ((ahub) obj).a;
                agjz agjzVar = new agjz(r6.size());
                agpf agpfVar = agpf.a;
                Collections.sort(r6, agpe.a);
                Iterator it = r6.iterator();
                aglx aglxVar = it instanceof aglx ? (aglx) it : new aglx(it);
                while (aglxVar.hasNext()) {
                    agpf agpfVarD = (agpf) aglxVar.next();
                    while (aglxVar.hasNext()) {
                        if (!aglxVar.b) {
                            aglxVar.c = aglxVar.a.next();
                            aglxVar.b = true;
                        }
                        agpf agpfVar2 = (agpf) aglxVar.c;
                        if (!agpfVarD.h(agpfVar2)) {
                        }
                        ahno.M(agpfVarD.c(agpfVar2).i(), "Overlapping ranges not permitted but found %s overlapping %s", agpfVarD, agpfVar2);
                        agpfVarD = agpfVarD.d((agpf) aglxVar.next());
                        break;
                    }
                    agjzVar.h(agpfVarD);
                }
                agke agkeVarG = agjzVar.g();
                if (agkeVarG.isEmpty()) {
                    return agkw.a;
                }
                return (((agpi) agkeVarG).d == 1 && ((agpf) aguu.M(agkeVarG)).equals(agpf.a)) ? agkw.b : new agkw(agkeVarG);
            case 12:
                return ((agjz) obj).g();
            case 13:
                return ((agkx) obj).g();
            case 14:
                return ((agkh) obj).b();
            case 15:
                return ((Map.Entry) obj).getKey();
            default:
                return ((Map.Entry) obj).getValue();
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
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}

package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qdi implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ qdi(int i) {
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
                axia axiaVar = (axia) obj;
                axie axieVar = axiaVar.b == 3 ? (axie) axiaVar.c : axie.a;
                Instant instant = Instant.EPOCH;
                aijp aijpVar = axieVar.c;
                if (aijpVar == null) {
                    aijpVar = aijp.a;
                }
                Instant instantAx = ahng.ax(aijpVar);
                boolean z = false;
                for (axid axidVar : axieVar.b) {
                    aigu aiguVar = axidVar.c;
                    if (aiguVar == null) {
                        aiguVar = aigu.a;
                    }
                    Instant instantPlus = instantAx.plus(ahng.aw(aiguVar));
                    aigu aiguVar2 = axidVar.d;
                    if (aiguVar2 == null) {
                        aiguVar2 = aigu.a;
                    }
                    Instant instantPlus2 = instantPlus.plus(ahng.aw(aiguVar2));
                    if (true == instantPlus2.isAfter(instant)) {
                        instant = instantPlus2;
                    }
                    z |= !((axidVar.b & 16) != 0);
                }
                return new qdj(axiaVar, new qdk(axieVar, z, instant, 0));
            case 1:
                return (pot) ((poq) obj);
            case 2:
                axia axiaVar2 = (axia) obj;
                axha axhaVar = axiaVar2.b == 1 ? (axha) axiaVar2.c : axha.a;
                Instant instant2 = Instant.EPOCH;
                aijp aijpVar2 = axhaVar.b;
                if (aijpVar2 == null) {
                    aijpVar2 = aijp.a;
                }
                Instant instantAx2 = ahng.ax(aijpVar2);
                HashSet hashSet = new HashSet();
                for (axhe axheVar : axhaVar.c) {
                    aigu aiguVar3 = axheVar.d;
                    if (aiguVar3 == null) {
                        aiguVar3 = aigu.a;
                    }
                    Instant instantPlus3 = instantAx2.plus(ahng.aw(aiguVar3));
                    if (true == instantPlus3.isAfter(instant2)) {
                        instant2 = instantPlus3;
                    }
                    int i = axheVar.b;
                    int i2 = 4;
                    if (i != 0) {
                        if (i == 3) {
                            i2 = 1;
                        } else if (i != 4) {
                            i2 = i != 5 ? 0 : 3;
                        } else {
                            i2 = 2;
                        }
                    }
                    if (i2 == 0) {
                        throw null;
                    }
                    int i3 = i2 - 1;
                    if (i3 == 0) {
                        hashSet.add(Long.valueOf(axheVar.c));
                    } else if (i3 == 1) {
                        hashSet.remove(Long.valueOf(axheVar.c));
                    }
                }
                return new qdj(axiaVar2, new qdk(axhaVar, !hashSet.isEmpty(), instant2, 1));
            case 3:
                return ((qdl) obj).b();
            case 4:
                ((qjo) obj).b();
                return 0;
            case 5:
                axgf.a.createBuilder();
                ((qgj) obj).a();
                throw null;
            case 6:
                axgf.a.createBuilder();
                throw null;
            case 7:
                Long l = qqa.a;
                return new Semaphore(1);
            case 8:
                return ((qvu) obj).p;
            case 9:
                qvu qvuVar = (qvu) obj;
                int i4 = quc.c;
                return qvuVar.p.plus(qvuVar.iu());
            case 10:
                return ((qvu) obj).clone();
            case 11:
                return ((qxj) obj).clone();
            case 12:
                qvu qvuVar2 = (qvu) obj;
                int i5 = quc.c;
                return qvuVar2.p.plus(qvuVar2.iu());
            case 13:
                rbm rbmVar = qxm.z;
                return (qvq) ((qvu) obj);
            case 14:
                return ((qvq) obj).m;
            case 15:
                return ((qxl) obj).c();
            case 16:
                return ((qxl) obj).b();
            case 17:
                return ((qvk) obj).a;
            case 18:
                return ((qup) obj).a;
            case 19:
                return (qvc) ((Map.Entry) obj).getKey();
            default:
                int i6 = qzf.f;
                return (ListenableFuture) ((Optional) ((Map.Entry) obj).getValue()).get();
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

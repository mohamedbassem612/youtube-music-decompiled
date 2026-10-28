package defpackage;

import android.os.Bundle;
import android.util.Pair;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class woi implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ woi(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r10v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v38, types: [cjz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v53, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ahex, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object ygtVar;
        int i = 8;
        int i2 = 0;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                return Collection.EL.stream((agkz) a$$ExternalSyntheticApiModelOutline0.m8m(obj).apply(this.a));
            case 1:
                return (weh) ((Class) this.a).cast((weh) obj);
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (!((Optional) entry.getValue()).isPresent()) {
                    return ahng.n(new Pair((dii) entry.getKey(), Optional.empty()));
                }
                xrx xrxVar = (xrx) this.a;
                return ahcs.e(xrxVar.d.a.submit(new wko((Bundle) ((Optional) entry.getValue()).get(), i)), afwl.a(new xwd(entry, i3)), xrxVar.c);
            case 3:
                String str = (String) obj;
                ytv ytvVar = (ytv) this.a.io();
                return (str == null || !ytvVar.e.aV()) ? ytvVar.g : (zia) ConcurrentMap.EL.getOrDefault(ytvVar.f, str, zia.a);
            case 4:
                ygtVar = new ygt((String) this.a, (ygk) obj);
                break;
            case 5:
                ygx ygxVar = (ygx) this.a;
                return ygl.o((String) obj, ygxVar.q, ygxVar.a, ygxVar.h);
            case 6:
                ygtVar = new ygt((String) this.a, (ygk) obj);
                break;
            case 7:
                ygx ygxVar2 = (ygx) this.a;
                return ygl.o((String) obj, ygxVar2.q, ygxVar2.a, ygxVar2.h);
            case 8:
                ygx ygxVar3 = (ygx) this.a;
                return ygl.o((String) obj, ygxVar3.q, ygxVar3.a, ygxVar3.h);
            case 9:
                bse bseVar = (bse) obj;
                return bseVar.b(this.a.a(bseVar));
            case 10:
                aihf aihfVar = (aihf) obj;
                if (((ztk) this.a).c.l(115, 45617948L, false) && (((jrc) aihfVar.instance).b & 1) == 0) {
                    ztk.l(aihfVar);
                }
                ygtVar = new tld(((jrc) aihfVar.instance).c, aihfVar);
                break;
            case 11:
                return (String) this.a.get(((Integer) obj).intValue());
            case 12:
                return (tzk) ((Optional) ((agke) this.a).get(((Integer) obj).intValue())).get();
            case 13:
                return ((aahg) this.a).k((aoop) ((weh) obj));
            case 14:
                return (aaiz) ((Class) this.a).cast((aaiz) obj);
            case 15:
                return (aoop) ((Class) this.a).cast((weh) obj);
            case 16:
                return this.a;
            case 17:
                return this.a;
            case 18:
                aoeg aoegVar = (aoeg) obj;
                Iterator it = aoegVar.d.iterator();
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (it.hasNext()) {
                    aoei aoeiVar = (aoei) ((agkj) this.a).get((String) it.next());
                    if (aoeiVar != null) {
                        aamp aampVar = aamp.DELETED;
                        int iG = agvp.G(aoeiVar.d);
                        if (iG == 0) {
                            iG = 1;
                        }
                        switch (iG - 1) {
                            case 1:
                                i2++;
                                continue;
                            case 2:
                            case 3:
                            case 9:
                            case 16:
                                i5++;
                                continue;
                            case 4:
                            case 7:
                                i6++;
                                continue;
                            case 5:
                            case 8:
                            case 10:
                            case 13:
                            case 14:
                                i4++;
                                continue;
                            case 6:
                                break;
                            case 11:
                            case 12:
                            case 15:
                            default:
                                continue;
                        }
                    }
                    i7++;
                }
                aihf builder = aoegVar.toBuilder();
                builder.copyOnWrite();
                aoeg aoegVar2 = (aoeg) builder.instance;
                aoegVar2.b |= 4;
                aoegVar2.f = i2;
                builder.copyOnWrite();
                aoeg aoegVar3 = (aoeg) builder.instance;
                aoegVar3.b |= 8;
                aoegVar3.g = i4;
                builder.copyOnWrite();
                aoeg aoegVar4 = (aoeg) builder.instance;
                aoegVar4.b |= 16;
                aoegVar4.h = i5;
                builder.copyOnWrite();
                aoeg aoegVar5 = (aoeg) builder.instance;
                aoegVar5.b |= 32;
                aoegVar5.i = i6;
                builder.copyOnWrite();
                aoeg aoegVar6 = (aoeg) builder.instance;
                aoegVar6.b |= 64;
                aoegVar6.j = i7;
                return (aoeg) builder.build();
            case 19:
                Integer num = (Integer) obj;
                return Integer.valueOf((int) ((aann) this.a).n.ae(num.intValue(), ((double) num.intValue()) + (((double) num.intValue()) * 0.5d)));
            default:
                aaqb aaqbVar = (aaqb) obj;
                aaqbVar.b.add(this.a);
                return aaqbVar;
        }
        return ygtVar;
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

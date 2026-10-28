package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hnv implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hnv(int i) {
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
        Long addedTimestampMillis;
        boolean z;
        switch (this.$cid) {
            case 0:
                return wfs.h((String) obj);
            case 1:
                return wfs.h((String) obj);
            case 2:
                hcg hcgVar = (hcg) obj;
                int i = hoe.d;
                weh wehVar = (weh) hcgVar.b.get();
                String str = hcgVar.f;
                boolean z2 = wehVar instanceof anjq;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long jLongValue = (z2 ? ((anjq) wehVar).getLastModifiedTimestampMillis() : ((anuc) wehVar).getLastModifiedTimestampMillis()).longValue() / 1000;
                Object obj2 = hcgVar.a.get();
                int i2 = 3;
                String[] strArr = obj2 instanceof anjx ? (String[]) Collection.EL.stream(((anjx) obj2).e()).map(new hnv(i2)).toArray(new hhv(2)) : (String[]) Collection.EL.stream(((anuk) obj2).j()).map(new hnv(i2)).toArray(new hhv(3));
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                if (z2) {
                    addedTimestampMillis = ((anjq) wehVar).getAddedTimestampMillis();
                    z = true;
                } else {
                    addedTimestampMillis = ((anuc) wehVar).getAddedTimestampMillis();
                    z = false;
                }
                return new aapt(str, jLongValue, strArr, addedTimestampMillis.longValue() / 1000, (z ? ((anjq) wehVar).getClientLastInvalidationTimestampMillis() : ((anuc) wehVar).getClientLastInvalidationTimestampMillis()).longValue());
            case 3:
                return wfs.h((String) obj);
            case 4:
                int i3 = hoe.d;
                return new huu(wfs.h((String) obj), Optional.of(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY)));
            case 5:
                return rpi.Q((Optional) obj);
            case 6:
                return (aret) ((Optional) obj).get();
            case 7:
                return ((anyx) obj).c;
            case 8:
                return kro.aH(((aret) obj).getVideoId());
            case 9:
                return ((aret) obj).c;
            case 10:
                return ((anyx) obj).c.z;
            case 11:
                return rpi.Q((Optional) obj);
            case 12:
                agrf agrfVar = how.a;
                return ((hov) obj).a;
            case 13:
                return ((Optional) obj).stream();
            case 14:
                aigj aigjVar = hpb.a;
                return rpi.Q((Optional) obj);
            case 15:
                return ((anyx) obj).b();
            case 16:
                aigj aigjVar2 = hpb.a;
                return kro.ax(wfs.h((String) obj));
            case 17:
                aigj aigjVar3 = hpb.a;
                return kro.aJ(wfs.h((String) obj));
            case 18:
                aigj aigjVar4 = hpb.a;
                return (anyo) ((Optional) obj).get();
            case 19:
                aigj aigjVar5 = hpb.a;
                return kro.aH(wfs.h(((weh) ((Optional) obj).get()).b()));
            default:
                Optional optional = (Optional) obj;
                aigj aigjVar6 = hpb.a;
                return optional;
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

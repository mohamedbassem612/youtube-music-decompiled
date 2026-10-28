package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hnf implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hnf(int i) {
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

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, weh] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return (hmw) ((aaiz) obj);
            case 1:
                return ((hmx) obj).a();
            case 2:
                return ((anuk) obj).getPlaylistId();
            case 3:
                anuk anukVar = (anuk) obj;
                agrf agrfVar = hnl.a;
                return anukVar;
            case 4:
                return wfs.h((String) obj);
            case 5:
                String str = (String) obj;
                agrf agrfVar2 = hnl.a;
                return str;
            case 6:
                agrf agrfVar3 = hnl.a;
                return rpi.Q((Optional) obj);
            case 7:
                return aaka.c((String) obj);
            case 8:
                agrf agrfVar4 = hnl.a;
                return (anjx) ((Optional) obj).get();
            case 9:
                return ((anjx) obj).getAudioPlaylistId();
            case 10:
                anjx anjxVar = (anjx) obj;
                agrf agrfVar5 = hnl.a;
                return anjxVar;
            case 11:
                agrf agrfVar6 = hnl.a;
                return (anuk) ((Optional) obj).get();
            case 12:
                return rpi.Q((Optional) obj);
            case 13:
                return ((anyx) obj).getTitle();
            case 14:
                return rpi.Q((Optional) obj);
            case 15:
                return ((anyx) obj).getTitle();
            case 16:
                allt alltVar = ((allo) obj).c;
                return alltVar == null ? allt.a : alltVar;
            case 17:
                allp allpVar = ((allo) obj).d;
                if (allpVar == null) {
                    allpVar = allp.a;
                }
                return afxw.u(allpVar);
            case 18:
                return (String) ((Optional) obj).get();
            case 19:
                return wfs.h(((hcg) obj).a.get().b());
            default:
                return (hcg) obj;
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

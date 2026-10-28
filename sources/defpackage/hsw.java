package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hsw implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hsw(int i) {
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

    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, weh] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return kro.aH((String) obj);
            case 1:
                return kyr.B(obj);
            case 2:
                return kro.as((String) obj);
            case 3:
                return wfs.g(62, (String) obj);
            case 4:
                return rpi.Q((Optional) obj);
            case 5:
                return wfs.h((String) obj);
            case 6:
                return ((annv) obj).h();
            case 7:
                return ((annv) obj).f();
            case 8:
                return ((annv) obj).k();
            case 9:
                return ((annv) obj).f();
            case 10:
                return ((annv) obj).h();
            case 11:
                return ((hcg) obj).a;
            case 12:
                agrf agrfVar = hur.a;
                return rpi.Q((Optional) obj);
            case 13:
                return ((hcg) obj).b;
            case 14:
                agrf agrfVar2 = hur.a;
                return (anyo) ((Optional) obj).get();
            case 15:
                agrf agrfVar3 = hur.a;
                return ((hcg) obj).a.get().b();
            case 16:
                agrf agrfVar4 = hur.a;
                return rpi.Q((Optional) obj);
            case 17:
                agrf agrfVar5 = hur.a;
                return (anyo) ((Optional) obj).get();
            case 18:
                hcg hcgVar = (hcg) obj;
                agrf agrfVar6 = hur.a;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (true) {
                    agke agkeVar = hcgVar.c;
                    int size = agkeVar.size();
                    agke agkeVar2 = hcgVar.d;
                    if (i >= Math.min(size, agkeVar2.size())) {
                        return arrayList;
                    }
                    if (!igs.c(((anyx) agkeVar.get(i)).getMusicVideoType())) {
                        arrayList.add(hcg.b((anyx) agkeVar.get(i), (anyo) agkeVar2.get(i)));
                    }
                    i++;
                }
                break;
            case 19:
                return Collection.EL.stream((List) obj);
            default:
                return wfs.h((String) obj);
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

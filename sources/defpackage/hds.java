package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hds implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hds(int i) {
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
                return Collection.EL.stream((agjw) obj);
            case 1:
                return new ArrayList();
            case 2:
                return new ArrayList();
            case 3:
                return wfs.h(((weh) ((Optional) obj).get()).b());
            case 4:
                return tzk.c((ListenableFuture) obj);
            case 5:
                return ((avmc) obj).k();
            case 6:
                awgn awgnVar = new awgn(new tzh((ListenableFuture) obj));
                avnn avnnVar = atqp.o;
                return awgnVar;
            case 7:
                return ((avmc) obj).k();
            case 8:
                return ((aamj) obj).a.a;
            case 9:
                return ((aamj) obj).b;
            case 10:
                return ((aamj) obj).a.a;
            case 11:
                return ((aamj) obj).h;
            case 12:
                return kro.aH(((aamo) obj).d());
            case 13:
                return kro.aH(((aamo) obj).d());
            case 14:
                return ((aamt) obj).a;
            case 15:
                return ((aamj) obj).a;
            case 16:
                return ((aamt) obj).b();
            case 17:
                return ((aamt) obj).n;
            case 18:
                agrf agrfVar = idr.a;
                return wfs.h(((weh) ((Optional) obj).get()).b());
            case 19:
                agrf agrfVar2 = idr.a;
                return kro.aH(((hyz) obj).t());
            default:
                return afxw.s(obj);
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

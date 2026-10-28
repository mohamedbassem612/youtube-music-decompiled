package defpackage;

import android.view.View;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hgi implements Consumer {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hgi(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) throws Throwable {
        int i = 1;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                ((xir) obj).f(tau.MEDIA_BROWSER_CONNECTION_COMPLETED);
                break;
            case 1:
                ((View) obj).setForeground(null);
                break;
            case 2:
                ((ibu) obj).a();
                break;
            case 3:
                iwd.d((View) obj, 0);
                break;
            case 4:
                break;
            case 5:
                ((NodeTreeProcessorImpl) obj).S(false, 1, 1, null);
                break;
            case 6:
                qyh qyhVar = ((qxl) obj).a;
                qyhVar.getClass();
                ((brs) qyhVar.b).A(true);
                qyhVar.c.post(new qca(qyhVar.a, 19));
                break;
            case 7:
                qyh qyhVar2 = ((qxl) obj).a;
                qyhVar2.getClass();
                qyhVar2.aE();
                break;
            case 8:
                ((qxq) obj).a();
                break;
            case 9:
                ((buj) obj).g();
                break;
            case 10:
                quc qucVar = (quc) obj;
                int i3 = 16;
                Stream streamFilter = Collection.EL.stream(qucVar.d()).flatMap(new qzp(i3)).filter(new jor(i3));
                int i4 = 17;
                agke agkeVar = (agke) Collection.EL.stream(qucVar.c()).filter(new jor(i4)).map(new qzp(18)).filter(new jmy((agkz) streamFilter.map(new qzp(i4)).collect(aghu.b), 8)).collect(aghu.a);
                qucVar.getClass();
                Iterable$EL.forEach(agkeVar, new kjk(qucVar, 20));
                Iterable$EL.forEach(nra.s(agkeVar, new rcf(i), new rcf(i2)), new rcp(qucVar, i));
                break;
            case 11:
                ((ConcurrentLinkedDeque) obj).clear();
                break;
            case 12:
                ((qum) obj).c();
                break;
            case 13:
                rfs rfsVar = (rfs) obj;
                Duration duration = rek.a;
                try {
                    rfsVar.release();
                } catch (Exception e) {
                    rbc rbcVar = new rbc(rek.m, rbd.c);
                    rbcVar.a = e;
                    rbcVar.c();
                    rbcVar.a("Error releasing frame.", new Object[0]);
                    return;
                }
                break;
            case 14:
                int i5 = rhc.m;
                ((ListenableFuture) obj).cancel(false);
                break;
            case 15:
                ((zwj) obj).b();
                break;
            case 16:
                ((rsq) obj).av();
                break;
            case 17:
                ((ListenableFuture) obj).cancel(false);
                break;
            case 18:
                ((ListenableFuture) obj).cancel(false);
                break;
            case 19:
                ((mgr) obj).c();
                break;
            default:
                agrf agrfVar = tsr.a;
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
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
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

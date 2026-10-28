package defpackage;

import com.google.android.libraries.video.mediaengine.textures.processors.SkiaTextureProcessor;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rcp implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rcp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        ListenableFuture listenableFuture;
        int i = 18;
        switch (this.$cid) {
            case 0:
                ((qvu) this.a).q((rcb) obj);
                break;
            case 1:
                ((quc) this.a).g((qwm) obj);
                break;
            case 2:
                ((quz) ((qup) this.a).b).c((rcb) obj);
                break;
            case 3:
                ConcurrentLinkedDeque concurrentLinkedDeque = (ConcurrentLinkedDeque) ((rdl) this.a).b.get((rdk) obj);
                concurrentLinkedDeque.getClass();
                if (concurrentLinkedDeque.size() > 1 && (listenableFuture = (ListenableFuture) concurrentLinkedDeque.pollLast()) != null) {
                    listenableFuture.cancel(false);
                    break;
                }
                break;
            case 4:
                Duration duration = rdr.a;
                rfp rfpVar = (rfp) this.a;
                ((qum) obj).a(rfpVar.a, rfpVar.b);
                break;
            case 5:
                rfp rfpVar2 = (rfp) obj;
                rdr rdrVar = (rdr) this.a;
                int i2 = 4;
                if (Collection.EL.stream(rdrVar.n.a.c()).filter(new jmy(rfpVar2, 11)).filter(new jor(20)).map(new rcs(i2)).findFirst().isPresent()) {
                    new rbc(rdr.I, rbd.a).a("onAffineTransformChanged called for frame %s with matrix %s", rfpVar2.a, rfpVar2.b);
                    rdrVar.A(new rcp(rfpVar2, i2));
                }
                break;
            case 6:
                Duration duration2 = rdr.a;
                ((qum) obj).b((quk) this.a);
                break;
            case 7:
                rdm rdmVarA = ((rdr) this.a).i.a();
                ((qum) obj).e(rdmVarA.b, rdmVarA.a);
                break;
            case 8:
                Duration duration3 = rek.a;
                ((reo) obj).iz((Duration) this.a);
                break;
            case 9:
                ((rek) this.a).e((rec) obj);
                break;
            case 10:
                ((rgp) this.a).k((rfs) obj);
                break;
            case 11:
                int i3 = rgm.c;
                ((rhd) obj).k((rfs) this.a);
                break;
            case 12:
                ((rhd) obj).k((rfs) this.a);
                break;
            case 13:
                Semaphore semaphore = ((rgp) this.a).f;
                semaphore.getClass();
                ((rhd) obj).f(new rcu(semaphore, i));
                break;
            case 14:
                ((SkiaTextureProcessor) this.a).m((qup) obj, new IllegalStateException("Preconditions failed!"), 1);
                break;
            case 15:
                ((rgr) this.a).g((rfs) obj);
                break;
            case 16:
                ((rhc) this.a).l((rfs) obj);
                break;
            case 17:
                Iterable$EL.forEach(((rjg) obj).a, new rcp(this.a, i));
                break;
            case 18:
                ((rjg) this.a).a((rjf) obj);
                break;
            case 19:
                ((rjg) this.a).a((rjf) obj);
                break;
            default:
                ((rjg) this.a).a((rjf) obj);
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

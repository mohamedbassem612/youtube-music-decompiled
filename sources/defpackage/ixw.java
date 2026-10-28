package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ixw implements dqn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public ixw(fip fipVar, int i) {
        this.$cid = i;
        this.a = fipVar;
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, oov] */
    @Override // defpackage.dqn
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            ixx ixxVar = (ixx) this.a;
            advm advmVar = ixxVar.c;
            if (advmVar != null) {
                advmVar.a();
            }
            ixxVar.a.k(false);
            return;
        }
        if (i == 1) {
            int i2 = frw.G;
            fhz fhzVar = new fhz();
            fip fipVar = (fip) this.a;
            return;
        }
        Object obj = this.a;
        oqu oquVar = (oqu) obj;
        if (oquVar.n != null) {
            AtomicBoolean atomicBoolean = oquVar.p;
            if (atomicBoolean.compareAndSet(false, true)) {
                atbv atbvVar = oquVar.q;
                if (atbvVar == null || !atbvVar.aR()) {
                    atomicBoolean.set(false);
                    SwipeRefreshLayout swipeRefreshLayout = oquVar.o;
                    if (swipeRefreshLayout != null) {
                        swipeRefreshLayout.l(false, false);
                        return;
                    }
                    return;
                }
                if (!oquVar.q.aX().aS()) {
                    atomicBoolean.set(false);
                    SwipeRefreshLayout swipeRefreshLayout2 = oquVar.o;
                    if (swipeRefreshLayout2 != null) {
                        swipeRefreshLayout2.l(false, false);
                        return;
                    }
                    return;
                }
                orf orfVar = oquVar.n;
                mew mewVar = orfVar.f;
                if (mewVar != null) {
                    ((oyk) obj).h().l().d(mewVar, Memory.peekByte(FlagServices.b().c + 82) != 0 ? oquVar.ag(oquVar.a, null) : ors.b().a());
                    return;
                }
                Status statusReload = orfVar.reload();
                if (statusReload == null || statusReload.e()) {
                    return;
                }
                ((oyk) obj).h().L().io().c().c(aslh.LOG_TYPE_INTERNAL_ERROR, "Error reloading data driven collection (pull to refresh).", statusReload.asException());
                atomicBoolean.set(false);
                SwipeRefreshLayout swipeRefreshLayout3 = oquVar.o;
                if (swipeRefreshLayout3 != null) {
                    swipeRefreshLayout3.l(false, false);
                    return;
                }
                return;
            }
        }
        SwipeRefreshLayout swipeRefreshLayout4 = oquVar.o;
        if (swipeRefreshLayout4 != null) {
            swipeRefreshLayout4.l(false, false);
        }
    }

    public /* synthetic */ ixw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}

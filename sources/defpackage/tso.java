package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.stickyheaders.StickyHeaderContainer;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tso implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tso(Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        awwd awwdVar;
        int i = this.$cid;
        if (i == 0) {
            agrf agrfVar = tsr.a;
            ((mgr) obj).b((String) this.b, this.a);
            return;
        }
        if (i == 1) {
            ((rsq) obj).d((String) this.b, this.a);
            return;
        }
        if (i == 2) {
            RecyclerView recyclerView = (RecyclerView) obj;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), this.a);
            recyclerView.setClipToPadding(false);
            StickyHeaderContainer stickyHeaderContainer = ((vnr) this.b).i;
            if (stickyHeaderContainer != null) {
                stickyHeaderContainer.setPadding(0, 0, 0, 0);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4) {
                ((snu) obj).a((String) this.b, this.a);
                return;
            } else {
                ((acqo) this.b).o(this.a);
                ((acqt) obj).am();
                return;
            }
        }
        Throwable th = (Throwable) obj;
        int i2 = this.a;
        Object obj2 = this.b;
        synchronized (obj2) {
            aga agaVar = ((vwg) obj2).d;
            awwdVar = (awwd) agaVar.a(i2);
            if (awwdVar == null) {
                awwdVar = null;
            } else {
                agaVar.e(i2);
            }
        }
        if (awwdVar != null) {
            awwdVar.p(null);
        }
        if (th != null) {
            ((vwg) obj2).a(th, "Client returned an error when closing the stream.");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i == 2) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i != 3) {
            return i != 4 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

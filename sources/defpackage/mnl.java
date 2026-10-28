package defpackage;

import android.view.View;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class mnl extends IntersectionObserver {
    final nrv d;
    public final AtomicReference e = new AtomicReference(null);

    public mnl(nrv nrvVar) {
        this.d = nrvVar;
    }

    public final nrv a() {
        View view = (View) this.e.get();
        nrv nrvVar = this.d;
        if (view == null) {
            return nrvVar;
        }
        nrt nrtVarE = nrvVar.e();
        nrtVarE.d(view);
        return nrtVarE.a();
    }

    public final nsl b() {
        return this.d.i;
    }
}

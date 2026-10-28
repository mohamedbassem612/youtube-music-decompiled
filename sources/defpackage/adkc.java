package defpackage;

import android.widget.ImageView;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adkc implements adhu {
    private final /* synthetic */ int $cid;
    public final Object a;

    public adkc(int i) {
        this.$cid = i;
        this.a = new ConcurrentSkipListSet(new cru(13));
    }

    @Override // defpackage.adhu
    public final void e(ImageView imageView, adhr adhrVar, aqmh aqmhVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((adju) obj).e(imageView, adhrVar, aqmhVar);
            return;
        }
        Iterator it = ((ConcurrentSkipListSet) obj).iterator();
        while (it.hasNext()) {
            ((adhu) it.next()).e(imageView, adhrVar, aqmhVar);
        }
    }

    @Override // defpackage.adhu
    public final void f(ImageView imageView, adhr adhrVar, aqmh aqmhVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((adju) obj).f(imageView, adhrVar, aqmhVar);
            return;
        }
        Iterator it = ((ConcurrentSkipListSet) obj).iterator();
        while (it.hasNext()) {
            ((adhu) it.next()).f(imageView, adhrVar, aqmhVar);
        }
    }

    @Override // defpackage.adhu
    public final void g(ImageView imageView, adhr adhrVar, aqmh aqmhVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((adju) obj).g(imageView, adhrVar, aqmhVar);
            return;
        }
        Iterator it = ((ConcurrentSkipListSet) obj).iterator();
        while (it.hasNext()) {
            ((adhu) it.next()).g(imageView, adhrVar, aqmhVar);
        }
    }

    @Override // defpackage.adhu
    public final /* synthetic */ int h() {
        return -1;
    }

    @Override // defpackage.adhu
    public final void i(adjc adjcVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((adju) obj).i(adjcVar);
            return;
        }
        Iterator it = ((ConcurrentSkipListSet) obj).iterator();
        while (it.hasNext()) {
            ((adhu) it.next()).i(adjcVar);
        }
    }

    @Override // defpackage.adhu
    public final void j(ImageView imageView) {
        throw null;
    }

    public adkc(tbt tbtVar, adhv adhvVar, int i, int i2) {
        this.$cid = i2;
        this.a = new adju(adhvVar, tbtVar);
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adrz implements sxu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public adrz(adsa adsaVar, adsc adscVar, adrw adrwVar, int i) {
        this.$cid = i;
        this.c = adscVar;
        this.a = adrwVar;
        this.b = adsaVar;
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void b(Object obj, Object obj2) {
        if (this.$cid != 0) {
            Iterator it = ((List) obj2).iterator();
            while (it.hasNext()) {
                ((gxy) this.a).a.c((ajwo) it.next(), null);
            }
            ((gxy) this.a).c.c(new gsd(Optional.ofNullable(this.c), ((apyr) this.b).d));
            return;
        }
        Bitmap bitmap = (Bitmap) obj2;
        WeakReference weakReference = new WeakReference(bitmap);
        adsa adsaVar = (adsa) this.b;
        adsaVar.a.put((Uri) obj, weakReference);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ((adsc) this.c).d((adrw) this.a, bitmap);
        } else {
            adsaVar.b.execute(new adab((adsc) this.c, (adrw) this.a, bitmap, 8));
        }
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void iT(Object obj, Exception exc) {
        if (this.$cid == 0) {
            return;
        }
        Object obj2 = this.a;
        jio jioVarE = jin.e();
        gxy gxyVar = (gxy) obj2;
        ((jik) jioVarE).k(gxyVar.b.b(exc));
        gxyVar.d.d(jioVarE.b());
    }

    public adrz(gxy gxyVar, Object obj, apyr apyrVar, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = apyrVar;
        this.a = gxyVar;
    }
}

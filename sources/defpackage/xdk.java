package defpackage;

import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xdk implements avlc {
    final /* synthetic */ amej a;
    final /* synthetic */ abzo b;

    public xdk(abzo abzoVar, amej amejVar) {
        this.a = amejVar;
        this.b = abzoVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "Image preload times out.";
        }
        this.b.c(message);
        kn();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [adhv, java.lang.Object] */
    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        abzo abzoVar = this.b;
        ((AtomicBoolean) abzoVar.e).set(false);
        ?? r1 = abzoVar.f;
        r1.f((ImageView) abzoVar.g);
        r1.f((ImageView) abzoVar.k);
        ((xxj) abzoVar.d).c(this.a);
        ((awkv) abzoVar.j).kk(new Object());
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
    }
}

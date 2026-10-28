package defpackage;

import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xdl extends adhk {
    final /* synthetic */ avpr a;
    final /* synthetic */ abzo b;

    public xdl(abzo abzoVar, avpr avprVar) {
        this.a = avprVar;
        this.b = abzoVar;
    }

    private final void e() {
        avpr avprVar = this.a;
        if (avprVar.f()) {
            return;
        }
        avprVar.a();
    }

    @Override // defpackage.adhk, defpackage.adht
    public final void b(ImageView imageView) {
        e();
    }

    @Override // defpackage.adhk, defpackage.adht
    public final void c() {
        this.b.c("Image preload fails.");
        e();
    }

    @Override // defpackage.adhk, defpackage.adht
    public final void d() {
        e();
    }
}

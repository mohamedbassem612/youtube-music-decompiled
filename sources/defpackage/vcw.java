package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vcw extends adhk {
    final /* synthetic */ boolean a;
    final /* synthetic */ aljj b;
    final /* synthetic */ vda c;

    public vcw(vda vdaVar, boolean z, aljj aljjVar) {
        this.a = z;
        this.b = aljjVar;
        this.c = vdaVar;
    }

    @Override // defpackage.adhk, defpackage.adht
    public final void b(ImageView imageView) {
        if (!this.a || imageView.getDrawable() == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        aljj aljjVar = this.b;
        aljjVar.getClass();
        nsf.b(imageView, drawable, aljjVar);
    }

    @Override // defpackage.adhk, defpackage.adht
    public final void c() {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
        zvjVarA.j = 16;
        zvjVarA.d("[ShortsCreation][Android][Camera]Failed to load green screen media thumbnail via ImageManager");
        this.c.m.a(zvjVarA.a());
    }
}

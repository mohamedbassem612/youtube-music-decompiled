package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vgo implements sxu {
    final /* synthetic */ ImageView a;
    final /* synthetic */ Context b;
    public final /* synthetic */ vgp c;

    public vgo(vgp vgpVar, ImageView imageView, Context context) {
        this.a = imageView;
        this.b = context;
        this.c = vgpVar;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.c.v.A(new mrh(this, this.a, (Drawable) obj2, this.b, 16));
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        this.c.v.A(new ull(this, 20));
    }
}

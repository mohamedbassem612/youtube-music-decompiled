package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aden implements tae {
    private final Uri a;
    private final String b;
    private final WeakReference c;
    private final nxs d;
    private final mbc e;
    private final nry f;
    private final nsl g;
    private final Optional h;
    private final nuc i;
    private final Optional j;
    private final AtomicBoolean k;
    private final ci l;

    public aden(Uri uri, String str, ImageView imageView, nxs nxsVar, ci ciVar, mbc mbcVar, nry nryVar, nsl nslVar, Optional optional, nuc nucVar, Optional optional2, AtomicBoolean atomicBoolean) {
        this.a = uri;
        this.c = new WeakReference(imageView);
        this.b = str;
        this.d = nxsVar;
        this.l = ciVar;
        this.e = mbcVar;
        this.f = nryVar;
        this.g = nslVar;
        this.h = optional;
        this.i = nucVar;
        this.j = optional2;
        this.k = atomicBoolean;
    }

    @Override // defpackage.tae, defpackage.twi
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Drawable drawable = (Drawable) obj;
        ImageView imageView = (ImageView) this.c.get();
        if (imageView != null) {
            adeo.f(drawable, this.a, this.b, imageView, this.d, this.l, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        }
    }
}

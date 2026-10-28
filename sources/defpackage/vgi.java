package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vgi implements sxu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public vgi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, rmu] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, twi] */
    @Override // defpackage.sxu
    public final /* synthetic */ void b(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            ((vgj) this.a).v.A(new rmx(this, (Uri) obj, (Drawable) obj2, 11));
            return;
        }
        if (i == 1) {
            wnq wnqVar = (wnq) obj2;
            taf.g(((rrq) this.a).a.h(rlt.n(wnqVar.i(), wnqVar.g(), wnqVar.j(), false, false, false, false, false, false, 2, wnqVar.h())), new itt(this, wnqVar, 7));
            return;
        }
        if (i == 2) {
            this.a.a((Uri) obj);
        } else {
            if (i != 3) {
                ((absa) this.a).e.loadUrl((String) obj2);
                return;
            }
            xte xteVar = (xte) this.a;
            Bitmap bitmap = (Bitmap) obj2;
            xtf xtfVar = (xtf) xteVar.a;
            xtfVar.f = bitmap;
            xtfVar.g = IconCompat.f(bitmap);
            ((xsh) xteVar.c).d();
        }
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void iT(Object obj, Exception exc) {
        int i = this.$cid;
        if (i == 0) {
            ((vgj) this.a).v.A(new ull(this, 19));
        } else {
            if (i == 1) {
                return;
            }
            if (i == 2) {
                zvp.a(zvn.b, zvm.y, "VideoFX: Secondary sticker load failed");
            } else if (i != 3) {
                ((absa) this.a).c();
            } else {
                ((xsh) ((xte) this.a).c).d();
            }
        }
    }
}

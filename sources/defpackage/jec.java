package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jec implements View.OnClickListener, avlw {
    boolean a;
    final Drawable b;
    final Drawable c;
    final ajwo d;
    final ajwo e;
    final adly f;
    final /* synthetic */ jed g;

    public jec(jed jedVar, boolean z, Drawable drawable, Drawable drawable2, ajwo ajwoVar, ajwo ajwoVar2, adly adlyVar) {
        this.g = jedVar;
        this.a = z;
        this.b = drawable;
        this.c = drawable2;
        this.d = ajwoVar;
        this.e = ajwoVar2;
        this.f = adlyVar;
    }

    private final void e(boolean z) {
        this.a = z;
        this.g.b.setImageDrawable(z ? this.b : this.c);
    }

    @Override // defpackage.avlw
    public final /* synthetic */ void kk(Object obj) {
        weh wehVar = ((weo) obj).c;
        if (wehVar != null) {
            jed jedVar = this.g;
            Class<?> cls = wehVar.getClass();
            Class<?> cls2 = jedVar.c;
            if (cls == cls2) {
                boolean zBooleanValue = ((anop) cls2.cast(wehVar)).getSelected().booleanValue();
                boolean z = this.a;
                if (zBooleanValue) {
                    if (z) {
                        return;
                    }
                    e(true);
                } else if (z) {
                    e(false);
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a) {
            ajwo ajwoVar = this.e;
            if (ajwoVar != null) {
                this.g.a.a(ajwoVar);
            }
            e(false);
            return;
        }
        ajwo ajwoVar2 = this.d;
        if (ajwoVar2 != null) {
            HashMap map = new HashMap();
            Object objC = this.f.c("sectionListController");
            if (objC != null) {
                map.put("sectionListController", objC);
            }
            this.g.a.c(ajwoVar2, map);
        }
        e(true);
    }

    @Override // defpackage.avlw
    public final void kn() {
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
    }
}

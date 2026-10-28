package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nqk implements feb {
    private final int a;
    private final nuv b;
    private final nqj c;
    private final boolean d;
    private final adfx e;

    public nqk(int i, adfx adfxVar, nuv nuvVar, nqj nqjVar, boolean z) {
        this.a = i;
        this.e = adfxVar;
        this.b = nuvVar;
        this.c = nqjVar;
        this.d = z;
    }

    @Override // defpackage.feb
    public final boolean c(ewb ewbVar, fem femVar) {
        nuv nuvVar;
        nqj nqjVar;
        adfx adfxVar = this.e;
        if (adfxVar != null && adfxVar.c) {
            adfxVar.a.l(new xgj(xhb.b(197497)));
        }
        if (!this.d || (nuvVar = this.b) == null || femVar != (nqjVar = this.c)) {
            return false;
        }
        nqjVar.q();
        int i = this.a;
        fkw fkwVar = nqjVar.c;
        new Size(fkwVar.a, fkwVar.b);
        nuvVar.c(i);
        return false;
    }

    @Override // defpackage.feb
    public final /* bridge */ /* synthetic */ boolean gJ(Object obj, fem femVar, int i) {
        nuv nuvVar;
        nqj nqjVar;
        Drawable drawable = (Drawable) obj;
        if (!this.d || (nuvVar = this.b) == null || femVar != (nqjVar = this.c)) {
            return false;
        }
        nqjVar.q();
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().getAllocationByteCount();
        }
        nuvVar.f(this.a, i);
        return false;
    }
}

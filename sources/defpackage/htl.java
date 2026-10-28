package defpackage;

import android.graphics.Bitmap;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class htl implements sxu {
    final /* synthetic */ String a;
    final /* synthetic */ atr b;
    final /* synthetic */ sxu c;
    final /* synthetic */ boolean d;
    final /* synthetic */ htp e;

    public htl(htp htpVar, String str, atr atrVar, sxu sxuVar, boolean z) {
        this.a = str;
        this.b = atrVar;
        this.c = sxuVar;
        this.d = z;
        this.e = htpVar;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        htp htpVar = this.e;
        Set set = htpVar.i;
        Bitmap bitmap = (Bitmap) obj2;
        String str = this.a;
        set.add(str);
        if (htpVar.n.l(60, 45825124L, false)) {
            atr atrVar = this.b;
            atrVar.o(htpVar.e(bitmap));
            this.c.b(Boolean.valueOf(this.d), atrVar.a());
        } else {
            atr atrVarF = htpVar.f(str);
            atrVarF.o(htpVar.e(bitmap));
            this.c.b(Boolean.valueOf(this.d), atrVarF.a());
        }
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        if (this.e.n.l(60, 45825124L, false)) {
            this.c.b(Boolean.valueOf(this.d), this.b.a());
        }
    }
}

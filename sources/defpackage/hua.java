package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hua implements sxu {
    final /* synthetic */ hub a;
    final /* synthetic */ String b;
    final /* synthetic */ atr c;
    final /* synthetic */ awuc d;

    public hua(hub hubVar, String str, atr atrVar, awuc awucVar) {
        this.a = hubVar;
        this.b = str;
        this.c = atrVar;
        this.d = awucVar;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        ((Uri) obj).getClass();
        bitmap.getClass();
        hub hubVar = this.a;
        Set set = hubVar.e;
        String str = this.b;
        set.add(str);
        if (hubVar.g.l(60, 45825124L, false)) {
            atr atrVar = this.c;
            atrVar.o(hubVar.a(bitmap));
            this.d.resumeWith(atrVar.a());
        } else {
            atr atrVarC = hubVar.c(str);
            atrVarC.o(hubVar.a(bitmap));
            this.d.resumeWith(atrVarC.a());
        }
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        ((Uri) obj).getClass();
        boolean zL = this.a.g.l(60, 45825124L, false);
        awuc awucVar = this.d;
        if (zL) {
            awucVar.resumeWith(this.c.a());
        } else {
            awucVar.resumeWith(null);
        }
    }
}

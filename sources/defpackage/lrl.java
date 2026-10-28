package defpackage;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lrl extends kro {
    public lrl() {
        super(null);
    }

    @Override // defpackage.kro
    public final /* bridge */ /* synthetic */ kmt b(Context context, Looper looper, kqd kqdVar, Object obj, kna knaVar, knb knbVar) {
        lrn lrnVar = (lrn) obj;
        if (lrnVar == null) {
            lrnVar = new lrn(new avju((byte[]) null));
        }
        return new lsk(context, looper, kqdVar, knaVar, knbVar, lrnVar.a, lrnVar.d);
    }
}

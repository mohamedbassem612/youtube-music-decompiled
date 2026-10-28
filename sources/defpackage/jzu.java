package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jzu extends kro {
    public jzu() {
        super(null);
    }

    @Override // defpackage.kro
    public final /* bridge */ /* synthetic */ kmt b(Context context, Looper looper, kqd kqdVar, Object obj, kna knaVar, knb knbVar) {
        jzw jzwVar = (jzw) obj;
        kro.m(jzwVar, "Setting the API options is required.");
        CastDevice castDevice = jzwVar.a;
        int i = jzwVar.c;
        return new khb(context, looper, kqdVar, castDevice, jzwVar.e, jzwVar.b, knaVar, knbVar);
    }
}

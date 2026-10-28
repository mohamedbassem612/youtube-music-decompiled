package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@ryx(a = sip.class)
public final class ryz implements ryy {
    @Override // defpackage.ryy
    public final String a() {
        return "0";
    }

    @Override // defpackage.ryy
    public final String b(shh shhVar) {
        skl sklVar = (skl) shhVar.d(sip.class);
        if (sklVar.b() != slm.MID_ROLL) {
            return "0";
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.toString(sklVar.a() / 1000);
    }
}

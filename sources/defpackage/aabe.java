package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aabe implements aabo {
    private final Context a;
    private final Intent b;
    private final aode c;
    private final mbc d;

    public aabe(Context context, Intent intent, vyo vyoVar, mbc mbcVar) {
        this.a = context;
        this.b = intent;
        this.c = aabu.a(vyoVar);
        this.d = mbcVar;
    }

    @Override // defpackage.aabo
    public final void a(ajda ajdaVar, xgn xgnVar, aabr aabrVar, atr atrVar) {
        Intent intent = this.b;
        if (intent == null || (ajdaVar.b & 16) == 0) {
            return;
        }
        ajwo ajwoVar = ajdaVar.i;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apdc.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            Context context = this.a;
            Intent intent2 = new Intent(intent);
            ajwo ajwoVar2 = ajdaVar.i;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            aabq.b(intent2, ajwoVar2);
            amud amudVar = ajdaVar.u;
            if (amudVar == null) {
                amudVar = amud.b;
            }
            aabq.e(intent2, amudVar);
            if ((ajdaVar.b & 16384) != 0) {
                aabp.c(intent2, xgnVar.a());
                intent2.putExtra("interaction_type", 2);
            }
            aabq.h(intent2, "DISMISSED", this.c);
            aisd aisdVar = ajdaVar.o;
            if (aisdVar == null) {
                aisdVar = aisd.a;
            }
            yno.V(intent2, aisdVar);
            ajcu ajcuVar = ajdaVar.e;
            if (ajcuVar == null) {
                ajcuVar = ajcu.a;
            }
            if (ajcuVar.t > 0) {
                long epochMilli = this.d.f().toEpochMilli();
                ajcu ajcuVar2 = ajdaVar.e;
                if (ajcuVar2 == null) {
                    ajcuVar2 = ajcu.a;
                }
                intent2.putExtra("timeout_timestamp", epochMilli + ((long) ajcuVar2.t));
            }
            atrVar.n(aabq.g(context, intent2));
        }
    }
}

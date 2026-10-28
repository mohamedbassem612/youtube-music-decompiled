package defpackage;

import android.content.Context;
import android.content.Intent;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aabd implements aabo {
    private final Context a;
    private final Intent b;
    private final Intent c;
    private final aode d;
    private final Optional e;

    public aabd(Context context, Intent intent, Intent intent2, vyo vyoVar, Optional optional) {
        this.a = context;
        this.b = intent;
        this.c = intent2;
        this.d = aabu.a(vyoVar);
        this.e = optional;
    }

    @Override // defpackage.aabo
    public final void a(ajda ajdaVar, xgn xgnVar, aabr aabrVar, atr atrVar) {
        int i = ajdaVar.b;
        if ((i & 2) != 0) {
            Optional optional = this.e;
            optional.isPresent();
            Intent intent = this.b;
            ((sxn) optional.get()).b(intent, getClass());
            atrVar.h = aabq.f(this.a, b(ajdaVar, intent, xgnVar));
            return;
        }
        if ((i & 4) != 0) {
            Optional optional2 = this.e;
            optional2.isPresent();
            Intent intent2 = this.c;
            ((sxn) optional2.get()).b(intent2, getClass());
            atrVar.h = aabq.g(this.a, b(ajdaVar, intent2, xgnVar));
        }
    }

    final Intent b(ajda ajdaVar, Intent intent, xgn xgnVar) {
        Intent intent2 = new Intent(intent);
        Optional optional = this.e;
        optional.isPresent();
        ((sxn) optional.get()).b(intent, getClass());
        ajwo ajwoVar = ajdaVar.f;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        zik.bd(intent2, ajwoVar, xgnVar, (ajdaVar.b & 16384) != 0);
        ajwo ajwoVar2 = ajdaVar.g;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        aagu.q(intent2, ajwoVar2);
        aabq.h(intent2, "CLICKED", this.d);
        ajwo ajwoVar3 = ajdaVar.h;
        if (ajwoVar3 == null) {
            ajwoVar3 = ajwo.a;
        }
        aabq.b(intent2, ajwoVar3);
        aisd aisdVar = ajdaVar.o;
        if (aisdVar == null) {
            aisdVar = aisd.a;
        }
        yno.V(intent2, aisdVar);
        aqwr aqwrVar = ajdaVar.q;
        if (aqwrVar == null) {
            aqwrVar = aqwr.a;
        }
        if (aqwrVar != null && aqwrVar.b != 0) {
            intent2.putExtra("com.google.android.apps.youtube.unplugged.unplugged_notification_params_extra", aqwrVar.toByteArray());
        }
        return intent2;
    }
}

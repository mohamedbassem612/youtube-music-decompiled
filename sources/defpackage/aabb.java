package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aabb implements aabo {
    private final Context a;
    private final int b;
    private final aaas c;

    public aabb(Context context, int i, aaas aaasVar) {
        this.a = context;
        this.b = i;
        this.c = aaasVar;
    }

    @Override // defpackage.aabo
    public final void a(ajda ajdaVar, xgn xgnVar, aabr aabrVar, atr atrVar) {
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        alay alayVar4;
        alay alayVar5;
        alay alayVar6;
        ajcu ajcuVar = ajdaVar.e;
        if (ajcuVar == null) {
            ajcuVar = ajcu.a;
        }
        atrVar.e(16, true);
        if ((ajcuVar.b & 8) != 0) {
            alayVar = ajcuVar.f;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        atrVar.l(ackj.k(null, alayVar, null, false));
        if ((ajcuVar.b & 16) != 0) {
            alayVar2 = ajcuVar.g;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        atrVar.k(ackj.k(null, alayVar2, null, false));
        if ((ajcuVar.b & 64) != 0) {
            alayVar3 = ajcuVar.i;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
        } else {
            alayVar3 = null;
        }
        atrVar.j(ackj.k(null, alayVar3, null, false));
        if ((ajcuVar.b & 32) != 0) {
            alayVar4 = ajcuVar.h;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
        } else {
            alayVar4 = null;
        }
        atrVar.s(ackj.k(null, alayVar4, null, false));
        atrVar.q(this.b);
        atrVar.z = this.a.getColor(R.color.small_icon_background);
        atq atqVar = new atq();
        if ((ajcuVar.b & 16) != 0) {
            alayVar5 = ajcuVar.g;
            if (alayVar5 == null) {
                alayVar5 = alay.a;
            }
        } else {
            alayVar5 = null;
        }
        atqVar.c(ackj.k(null, alayVar5, null, false));
        if ((ajcuVar.b & 8) != 0) {
            alayVar6 = ajcuVar.f;
            if (alayVar6 == null) {
                alayVar6 = alay.a;
            }
        } else {
            alayVar6 = null;
        }
        atqVar.d(ackj.k(null, alayVar6, null, false));
        atrVar.r(atqVar);
        ajcu ajcuVar2 = ajdaVar.e;
        if (ajcuVar2 == null) {
            ajcuVar2 = ajcu.a;
        }
        int i = true == ajcuVar2.o ? 4 : 0;
        if (ajcuVar2.n && this.c.b()) {
            i |= 1;
        }
        if (ajcuVar2.p && ajdaVar.n.size() == 0) {
            i |= 2;
        }
        atrVar.m(i);
        int i2 = ajcuVar.e;
        atrVar.l = i2;
        if (i2 == -1) {
            atrVar.w = true;
        }
        if ((ajcuVar.b & 32768) != 0) {
            atrVar.x = ajcuVar.r;
        }
        if (ajdaVar.n.size() > 0) {
            atrVar.u(ahng.J(ajdaVar.n));
        }
        if ((ajdaVar.b & 16384) != 0) {
            Bundle bundle = new Bundle();
            amud amudVar = ajdaVar.u;
            if (amudVar == null) {
                amudVar = amud.b;
            }
            if (amudVar != null) {
                bundle.putByteArray("logging_directive", amudVar.toByteArray());
            }
            aabp.d(bundle, xgnVar.a());
            atrVar.y = bundle;
        }
    }
}

package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gup extends vvq {
    private final Context a;
    private final aunn b;

    public gup(Context context, tbt tbtVar, aunn aunnVar) {
        super(context, tbtVar);
        context.getClass();
        this.a = context;
        this.b = aunnVar;
    }

    private final void d(String str) {
        tuk.o(this.a, str, 0);
    }

    @Override // defpackage.vvq, defpackage.vxc
    public final boolean b() {
        return false;
    }

    @Override // defpackage.vvq, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        ahno.F(fhz.R(ajwoVar));
        boolean zBooleanValue = ((Boolean) tym.T(map, "221293762", Boolean.FALSE)).booleanValue();
        aunn aunnVar = this.b;
        if (aunnVar != null && aunnVar.io() != null && !zBooleanValue) {
            super.c(ajwoVar, map);
            return;
        }
        aixa aixaVar = fhz.O(ajwoVar).d;
        if (aixaVar == null) {
            aixaVar = aixa.a;
        }
        int i = aixaVar.b;
        if ((i & 2) != 0) {
            aocd aocdVar = aixaVar.d;
            if (aocdVar == null) {
                aocdVar = aocd.a;
            }
            alay alayVar = aocdVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            d(ackj.k(null, alayVar, null, false).toString());
            return;
        }
        if ((i & 1) != 0) {
            aoda aodaVar = aixaVar.c;
            if (aodaVar == null) {
                aodaVar = aoda.a;
            }
            alay alayVar2 = aodaVar.c;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            d(ackj.k(null, alayVar2, null, false).toString());
        }
    }
}

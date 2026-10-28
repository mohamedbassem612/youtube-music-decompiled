package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class vvq implements vxc {
    private final Context a;
    private final tbt b;

    public vvq(Context context, tbt tbtVar) {
        this.a = context;
        this.b = tbtVar;
    }

    private void d(String str) {
        tuk.o(this.a, str, 0);
    }

    @Override // defpackage.vxc
    public /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public void c(ajwo ajwoVar, Map map) {
        aoda aodaVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aiwz.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aiwz aiwzVar = (aiwz) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        boolean zBooleanValue = ((Boolean) tym.T(map, "221293762", Boolean.FALSE)).booleanValue();
        aixa aixaVar = aiwzVar.d;
        if (aixaVar == null) {
            aixaVar = aixa.a;
        }
        if ((aixaVar.b & 2) != 0) {
            aixa aixaVar2 = aiwzVar.d;
            if (aixaVar2 == null) {
                aixaVar2 = aixa.a;
            }
            aocd aocdVar = aixaVar2.d;
            if (aocdVar == null) {
                aocdVar = aocd.a;
            }
            aocd aocdVar2 = aocdVar;
            if (!zBooleanValue) {
                this.b.c(new vvr(null, aocdVar2, null, ajwoVar, map));
                return;
            }
            alay alayVar = aocdVar2.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            d(ackj.k(null, alayVar, null, false).toString());
            return;
        }
        aixa aixaVar3 = aiwzVar.d;
        if (((aixaVar3 == null ? aixa.a : aixaVar3).b & 1) != 0) {
            if (aixaVar3 == null) {
                aixaVar3 = aixa.a;
            }
            aoda aodaVar2 = aixaVar3.c;
            if (aodaVar2 == null) {
                aodaVar2 = aoda.a;
            }
            aodaVar = aodaVar2;
        } else {
            aodaVar = null;
        }
        if (!zBooleanValue || aodaVar == null) {
            this.b.c(new vvr(aodaVar, null, null, ajwoVar, map));
            return;
        }
        alay alayVar2 = aodaVar.c;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        d(ackj.k(null, alayVar2, null, false).toString());
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}

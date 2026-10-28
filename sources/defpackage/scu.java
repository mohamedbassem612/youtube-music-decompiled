package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class scu extends scr implements saq {
    public scu(awmd awmdVar, rmp rmpVar) {
        super(awmdVar);
    }

    @Override // defpackage.scr
    public final void a(aizs aizsVar, smr smrVar) throws sav {
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        if (aixrVarA != aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED) {
            throw new sav("Invalid trigger type for OnLayoutSelfExitRequestedTriggerAdapter.", 4);
        }
    }

    @Override // defpackage.saq
    public final void ab(sko skoVar, int i) {
        ArrayList arrayList = new ArrayList();
        for (snl snlVar : this.d.at()) {
            aizs aizsVar = snlVar.b;
            if (TextUtils.equals((aizsVar.b == 5 ? (aoio) aizsVar.c : aoio.a).b, skoVar.a) && nrm.c(snlVar.a, i)) {
                arrayList.add(aizsVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t(arrayList);
    }
}

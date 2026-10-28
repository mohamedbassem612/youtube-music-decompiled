package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class scr {
    final awmd c;
    public final dov d = new dov((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);

    public scr(awmd awmdVar) {
        this.c = awmdVar;
    }

    public boolean ae(aizs aizsVar, smr smrVar, sgp sgpVar) {
        return false;
    }

    public final void s(aizs aizsVar) {
        Optional optionalAs = this.d.as(aizsVar.d);
        if (!optionalAs.isEmpty()) {
            ((rsk) this.c.io()).i(Arrays.asList((snl) optionalAs.get()));
            return;
        }
        String str = aizsVar.d;
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        rmp.n(null, "Tried to activate trigger that isn't registered. Trigger ID: " + str + ", Type: " + aixrVarA.aT);
    }

    public final void t(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aizs aizsVar = (aizs) it.next();
            Optional optionalAs = this.d.as(aizsVar.d);
            if (optionalAs.isPresent()) {
                arrayList.add((snl) optionalAs.get());
            } else {
                String str = aizsVar.d;
                aixr aixrVarA = aixr.a(aizsVar.e);
                if (aixrVarA == null) {
                    aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
                }
                rmp.n(null, "Tried to activate trigger that isn't registered. Trigger ID: " + str + ", Type: " + aixrVarA.aT);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.c.io()).i(arrayList);
    }

    public final void u(aizs aizsVar) {
        ad(aizsVar);
        this.d.au(aizsVar.d);
    }

    protected void ad(aizs aizsVar) {
    }

    public void a(aizs aizsVar, smr smrVar) {
    }

    public void v(int i, aizs aizsVar, smr smrVar, sgp sgpVar) {
    }
}

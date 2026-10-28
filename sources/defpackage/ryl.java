package defpackage;

import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ryl extends ryj {
    private akpb a;
    private final ruv b;

    public ryl(smr smrVar, sko skoVar, rsk rskVar, ruv ruvVar) {
        super(smrVar, skoVar, rskVar);
        this.b = ruvVar;
    }

    private final void e(String str) {
        smr smrVar = this.d;
        sko skoVar = this.e;
        rmp.m(smrVar, skoVar, str);
        this.f.u(smrVar, skoVar, new sas(str, 3), 10);
    }

    @Override // defpackage.ryj
    public final void V(int i) {
        this.f.d(this.d, this.e, i);
    }

    @Override // defpackage.ryj
    public final void a() {
        agev agevVar = this.e.p;
        if (!agevVar.g()) {
            e("InFeedDynamicSectionListRenderingAdapter: Missing server rendering content.");
            return;
        }
        Object objC = agevVar.c();
        aihl aihlVar = aljx.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        aihi aihiVar = (aihi) objC;
        aihiVar.c(aihlVarCheckIsLite);
        if (!aihiVar.j.n(aihlVarCheckIsLite.d)) {
            e("InFeedDynamicSectionListRenderingAdapter: Missing InFeedAdLayoutRenderer extension.");
            return;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        aihiVar.c(aihlVarCheckIsLite2);
        Object objK = aihiVar.j.k(aihlVarCheckIsLite2.d);
        aljw aljwVar = (aljw) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        apji apjiVar = aljwVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVar2 = akpc.a;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
        apjiVar.c(aihlVarCheckIsLite3);
        if (!apjiVar.j.n(aihlVarCheckIsLite3.d)) {
            e("InFeedDynamicSectionListRenderingAdapter: Missing DynamicSectionListRenderer extension.");
            return;
        }
        apji apjiVar2 = aljwVar.c;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
        apjiVar2.c(aihlVarCheckIsLite4);
        Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite4.d);
        akpb akpbVar = (akpb) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
        if ((akpbVar.b & 2) == 0 || akpbVar.c.isEmpty()) {
            e("InFeedDynamicSectionListRenderingAdapter: Missing triggering layout ID.");
            return;
        }
        if ((akpbVar.b & 4) == 0 || akpbVar.d.isEmpty()) {
            e("InFeedDynamicSectionListRenderingAdapter: Missing target ID.");
            return;
        }
        this.a = akpbVar;
        ruv ruvVar = this.b;
        ruvVar.b();
        ruvVar.d.add(this);
        Iterator it = ruvVar.c.iterator();
        while (it.hasNext()) {
            d((String) it.next());
        }
    }

    @Override // defpackage.ryj
    public final void b() {
        if (this.a == null) {
            this.f.u(this.d, this.e, new sas("Missing DynamicSectionListRenderer.", 3), 10);
            return;
        }
        smr smrVar = this.d;
        sko skoVar = this.e;
        rmp.l(smrVar, skoVar, "InFeedDynamicSectionListRenderingAdapter: Layout entry failed because feed mutation was unsuccessful or incomplete.");
        this.f.u(smrVar, skoVar, new sas("Feed mutation failed or incomplete.", 153), 10);
    }

    public final void d(String str) {
        akpb akpbVar = this.a;
        if (akpbVar == null || (akpbVar.b & 2) == 0) {
            return;
        }
        TextUtils.equals(str, akpbVar.c);
    }

    @Override // defpackage.ryj
    public final void t() {
        this.b.d.remove(this);
    }
}

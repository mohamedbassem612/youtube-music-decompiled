package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rtw implements rsp {
    private final /* synthetic */ int $cid;
    final /* synthetic */ List a;
    final /* synthetic */ String b;
    final /* synthetic */ acfw c;
    final /* synthetic */ String d;
    final /* synthetic */ abzo e;

    public rtw(abzo abzoVar, List list, String str, acfw acfwVar, String str2, int i) {
        this.$cid = i;
        this.a = list;
        this.b = str;
        this.c = acfwVar;
        this.d = str2;
        this.e = abzoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [awmd, java.lang.Object] */
    @Override // defpackage.rsp
    public final void c(String str, boolean z, boolean z2, boolean z3) {
        int i = this.$cid;
        List list = this.a;
        if (i != 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.e.m((String) it.next(), this.b);
            }
            abzo abzoVar = this.e;
            xsc xscVar = (xsc) abzoVar.e.io();
            acfw acfwVar = this.c;
            xscVar.ab(acfwVar, this.d);
            try {
                abzoVar.A(acfwVar, list, this.b);
                return;
            } catch (rso e) {
                rmp.n(null, "CisaShimLegacyGaplessFlow: Failed to request interrupt on cue range entry: ".concat(e.toString()));
                return;
            }
        }
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            this.e.m(((abic) agqsVarListIterator.next()).b, this.b);
        }
        abzo abzoVar2 = this.e;
        xsc xscVar2 = (xsc) abzoVar2.e.io();
        acfw acfwVar2 = this.c;
        xscVar2.ab(acfwVar2, this.d);
        try {
            abzoVar2.z(list, acfwVar2, this.b);
        } catch (rso e2) {
            rmp.n(null, "CisaShimLegacyGaplessFlow: Failed to play interstitial on cue range entry: ".concat(e2.toString()));
        }
    }
}

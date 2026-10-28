package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cz implements cy {
    final String a;
    final int b;
    final int c;
    final /* synthetic */ dd d;

    public cz(dd ddVar, String str, int i, int i2) {
        this.d = ddVar;
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.cy
    public final boolean i(ArrayList arrayList, ArrayList arrayList2) {
        dd ddVar = this.d;
        cc ccVar = ddVar.s;
        if (ccVar == null || this.b >= 0 || this.a != null || !ccVar.getChildFragmentManager().ae(null, -1, 0)) {
            return ddVar.af(arrayList, arrayList2, this.a, this.b, this.c);
        }
        return false;
    }
}

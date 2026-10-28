package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cr implements boe {
    final /* synthetic */ String a = "voiceSearchDismissed";
    final /* synthetic */ di b;
    final /* synthetic */ boc c;
    final /* synthetic */ dd d;

    public cr(dd ddVar, di diVar, boc bocVar) {
        this.d = ddVar;
        this.b = diVar;
        this.c = bocVar;
    }

    @Override // defpackage.boe
    public final void a(bog bogVar, boa boaVar) {
        if (boaVar == boa.ON_START) {
            dd ddVar = this.d;
            String str = this.a;
            Map map = ddVar.k;
            if (((Bundle) map.get(str)) != null) {
                this.b.a();
                map.remove("voiceSearchDismissed");
            }
        }
        if (boaVar == boa.ON_DESTROY) {
            this.c.c(this);
            dd ddVar2 = this.d;
            ddVar2.l.remove(this.a);
        }
    }
}

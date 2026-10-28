package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fxz extends fys {
    final /* synthetic */ mqd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxz(mqd mqdVar) {
        super("getValue");
        this.a = mqdVar;
    }

    @Override // defpackage.fys
    public final fyy a(kwq kwqVar, List list) {
        fxw.i("getValue", 2, list);
        fyy fyyVarV = kwqVar.v((fyy) list.get(0));
        fyy fyyVarV2 = kwqVar.v((fyy) list.get(1));
        String strI = fyyVarV.i();
        mqd mqdVar = this.a;
        Map map = (Map) ((ldo) mqdVar.b).a.get(mqdVar.a);
        String str = null;
        if (map != null && map.containsKey(strI)) {
            str = (String) map.get(strI);
        }
        return str != null ? new fzb(str) : fyyVarV2;
    }
}

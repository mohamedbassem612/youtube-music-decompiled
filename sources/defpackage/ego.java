package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ego {
    public static final /* synthetic */ int a = 0;

    static {
        dzf.a("DiagnosticsWrkr");
    }

    public static final void a(eel eelVar, eff effVar, eeh eehVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ees eesVar = (ees) it.next();
            eeg eegVarA = eehVar.a(bou.e(eesVar));
            if (eegVarA != null) {
                int i = eegVarA.c;
            }
            String str = eesVar.c;
            atqq.aD(eelVar.a(str), ",", null, null, null, 62);
            atqq.aD(effVar.a(str), ",", null, null, null, 62);
            String str2 = eesVar.e;
            eesVar.d.name();
        }
    }
}

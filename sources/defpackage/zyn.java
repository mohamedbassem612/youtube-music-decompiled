package defpackage;

import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zyn extends tmn implements zyg {
    public zyn(tnr tnrVar, tng tngVar, boolean z, ainp ainpVar) {
        super(2, "", tnrVar, tngVar, z, ainpVar);
    }

    public /* synthetic */ zwa P() {
        return Q();
    }

    public zwa Q() {
        return zvz.a;
    }

    public String R() {
        return null;
    }

    public boolean W() {
        return false;
    }

    @Override // defpackage.zyg
    public final String c() {
        return s();
    }

    @Override // defpackage.tmn, defpackage.tns
    public final synchronized List u(tnm tnmVar) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.add("Default network response logging.");
        arrayList.add("Status: " + tnmVar.d + '\n');
        Map map = tnmVar.e;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add("Header:" + ((String) entry.getKey()) + ':' + ((String) entry.getValue()) + '\n');
            }
        }
        byte[] bArrE = tnmVar.e();
        if (bArrE != null) {
            arrayList.add("Actual data length: " + bArrE.length);
            arrayList.addAll(typ.e(new String(bArrE), SemanticState.Modal));
        } else {
            arrayList.add("Response had no data.");
        }
        return arrayList;
    }

    @Override // defpackage.tmn, defpackage.tns
    public List v() {
        StringBuilder sb = new StringBuilder("Basic CURL command:");
        for (Map.Entry entry : e().entrySet()) {
            String str = (String) entry.getKey();
            if (!str.equals("Content-Type")) {
                String str2 = (String) entry.getValue();
                sb.append("-H \"");
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                sb.append("\" ");
            }
        }
        sb.append('\'');
        sb.append(s());
        sb.append('\'');
        return agke.q(sb.toString());
    }

    public zyn(int i, String str, tnr tnrVar, tng tngVar) {
        super(i, str, tnrVar, tngVar, false, null);
    }

    public zyn(int i, String str, tng tngVar) {
        super(i, str, tngVar);
    }
}

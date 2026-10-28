package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class seg implements xju {
    @Override // defpackage.xju
    public final /* bridge */ /* synthetic */ Map a(Object obj) {
        seq seqVar = (seq) obj;
        afv afvVar = new afv(1);
        int iOrdinal = seqVar.a.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 3) {
                return null;
            }
            afvVar.put("yt_abt", Integer.toString(seqVar.b.e));
            return afvVar;
        }
        afv afvVar2 = new afv(5);
        afvVar2.put("mod_ad_pr", "1");
        smc smcVar = seqVar.c;
        if (!TextUtils.isEmpty(smcVar.h())) {
            afvVar2.put("ad_at", smcVar.h());
        }
        afvVar2.put("ad_docid", typ.c(smcVar.k()));
        afvVar2.put("yt_abt", Integer.toString(seqVar.b.e));
        for (amgu amguVar : smcVar.x()) {
            afvVar2.put(amguVar.e, amguVar.c == 2 ? (String) amguVar.d : "");
        }
        return afvVar2;
    }
}

package defpackage;

import android.util.Pair;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class usp implements aqk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ usp(vab vabVar, uzz uzzVar, aufd aufdVar, agke agkeVar, qvm qvmVar, int i) {
        this.$cid = i;
        this.a = vabVar;
        this.b = uzzVar;
        this.c = aufdVar;
        this.d = agkeVar;
        this.e = qvmVar;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, vab] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, qvm] */
    @Override // defpackage.aqk
    public final Object a(aqi aqiVar) {
        if (this.$cid == 0) {
            aufd aufdVar = (aufd) this.c;
            atte atteVar = (aufdVar.c == 2 ? (aufe) aufdVar.d : aufe.a).c;
            if (atteVar == null) {
                atteVar = atte.a;
            }
            atte atteVar2 = atteVar;
            ajhv ajhvVar = (aufdVar.c == 2 ? (aufe) aufdVar.d : aufe.a).d;
            if (ajhvVar == null) {
                ajhvVar = ajhv.a;
            }
            ajhv ajhvVar2 = ajhvVar;
            ?? r1 = this.e;
            this.a.k((uzz) this.b, atteVar2, ajhvVar2, (agke) this.d, new usq(aufdVar, aqiVar, r1));
            return "effectsProvider.restoreSelectedEffectAsset()";
        }
        elr elrVar = new elr(aqiVar, (byte[]) null);
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.a;
        Object obj4 = this.b;
        Object obj5 = ((xsc) obj4).c;
        ojx ojxVar = (ojx) this.e;
        String str = ojxVar.b;
        oyu oyuVar = new oyu((ozc) obj5, str, (File) obj, (String) obj2, elrVar, (tld) obj3);
        oyuVar.k = null;
        if (ojv.c == ojxVar.c) {
            oyuVar.f(oyt.b);
        } else {
            oyuVar.f(oyt.a);
        }
        int i = ojxVar.d;
        if (i > 0) {
            oyuVar.i = i;
        }
        agke agkeVar = ojxVar.e;
        int size = agkeVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) agkeVar.get(i2);
            oyuVar.e.u((String) pair.first, (String) pair.second);
        }
        aqiVar.a(new lez(obj4, obj, obj2, 6, (short[]) null), MoreExecutors.directExecutor());
        boolean zK = oyuVar.d.k(oyuVar);
        int i3 = onb.a;
        if (!zK) {
            acb acbVarA = oig.a();
            acbVarA.b = oif.DUPLICATE_REQUEST_ERROR;
            acbVarA.c = "Duplicate request for: ".concat(String.valueOf(str));
            aqiVar.d(acbVarA.a());
        }
        return "Data download scheduled for file ".concat(String.valueOf(str));
    }

    public /* synthetic */ usp(xsc xscVar, ojx ojxVar, File file, String str, tld tldVar, int i) {
        this.$cid = i;
        this.b = xscVar;
        this.e = ojxVar;
        this.d = file;
        this.c = str;
        this.a = tldVar;
    }
}

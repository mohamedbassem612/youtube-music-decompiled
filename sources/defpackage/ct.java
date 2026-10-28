package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ct implements rb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ dd a;

    public ct(dd ddVar, int i) {
        this.$cid = i;
        this.a = ddVar;
    }

    @Override // defpackage.rb
    public final /* synthetic */ void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            dd ddVar = this.a;
            ra raVar = (ra) obj;
            cv cvVar = (cv) ddVar.w.pollLast();
            if (cvVar == null) {
                toString();
                Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
                return;
            }
            ejt ejtVar = ddVar.C;
            String str = cvVar.a;
            cc ccVarC = ejtVar.c(str);
            if (ccVarC == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str)));
                return;
            } else {
                ccVarC.onActivityResult(cvVar.b, raVar.a, raVar.b);
                return;
            }
        }
        if (i != 1) {
            dd ddVar2 = this.a;
            ra raVar2 = (ra) obj;
            cv cvVar2 = (cv) ddVar2.w.pollFirst();
            if (cvVar2 == null) {
                toString();
                Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                return;
            }
            ejt ejtVar2 = ddVar2.C;
            String str2 = cvVar2.a;
            cc ccVarC2 = ejtVar2.c(str2);
            if (ccVarC2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str2)));
                return;
            } else {
                ccVarC2.onActivityResult(cvVar2.b, raVar2.a, raVar2.b);
                return;
            }
        }
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = true != ((Boolean) arrayList.get(i2)).booleanValue() ? -1 : 0;
        }
        dd ddVar3 = this.a;
        cv cvVar3 = (cv) ddVar3.w.pollFirst();
        if (cvVar3 == null) {
            toString();
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        ejt ejtVar3 = ddVar3.C;
        String str3 = cvVar3.a;
        cc ccVarC3 = ejtVar3.c(str3);
        if (ccVarC3 == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str3)));
        } else {
            ccVarC3.onRequestPermissionsResult(cvVar3.b, strArr, iArr);
        }
    }
}

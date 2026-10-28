package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rq extends rj {
    @Override // defpackage.rj
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.rj
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i != -1 || intent == null) {
            return awnp.a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return awnp.a;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        return atqq.C(atqq.as(atqq.aQ(stringArrayExtra), arrayList));
    }

    @Override // defpackage.rj
    public final /* bridge */ /* synthetic */ zf c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            return new zf(awnp.a);
        }
        for (String str : strArr) {
            if (avg.c(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(strArr.length), 16));
        for (String str2 : strArr) {
            awml awmlVar = new awml(str2, Boolean.TRUE);
            linkedHashMap.put(awmlVar.a, awmlVar.b);
        }
        return new zf(linkedHashMap);
    }
}

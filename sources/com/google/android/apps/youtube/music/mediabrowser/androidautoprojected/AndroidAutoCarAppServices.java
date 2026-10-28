package com.google.android.apps.youtube.music.mediabrowser.androidautoprojected;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import defpackage.a;
import defpackage.aaj;
import defpackage.afj;
import defpackage.ahgb;
import defpackage.hhg;
import defpackage.yd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidAutoCarAppServices extends hhg {
    public ahgb c;

    @Override // defpackage.xk
    public final afj b() {
        getApplicationContext();
        Context applicationContext = getApplicationContext();
        HashMap map = new HashMap();
        String[] stringArray = applicationContext.getResources().getStringArray(R.array.ytm_hosts_allowlist);
        if (stringArray == null) {
            throw new IllegalArgumentException("Invalid allowlist res id: 2130903068");
        }
        for (String str : stringArray) {
            String[] strArrSplit = str.split(",", -1);
            if (strArrSplit.length != 2) {
                throw new IllegalArgumentException(a.bU((byte) 39, str, "Invalid allowed host entry: '"));
            }
            String strA = aaj.a(strArrSplit[1]);
            String strA2 = aaj.a(strArrSplit[0]);
            strA.getClass();
            strA2.getClass();
            List arrayList = (List) map.get(strA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(strA, arrayList);
            }
            arrayList.add(strA2);
        }
        return new afj(applicationContext.getPackageManager(), map, false);
    }

    @Override // defpackage.xk
    public final yd c() {
        return new yd(this);
    }
}

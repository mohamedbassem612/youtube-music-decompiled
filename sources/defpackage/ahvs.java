package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahvs implements kje {
    @Override // defpackage.kje
    public final kii a(Context context, String str) {
        kii kiiVar;
        Map map = kkh.a;
        synchronized (map) {
            kiiVar = (kii) j$.util.Map.EL.computeIfAbsent(map, str, new iuk(context, 6));
        }
        return kiiVar;
    }
}

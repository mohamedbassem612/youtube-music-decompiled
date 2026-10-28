package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qko {
    private static final Map a = new afv();
    private final SharedPreferences b;
    private SharedPreferences.OnSharedPreferenceChangeListener c;

    static synchronized void a() {
        Map map = a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            qko qkoVar = (qko) it.next();
            SharedPreferences sharedPreferences = qkoVar.b;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = qkoVar.c;
            throw null;
        }
        map.clear();
    }
}

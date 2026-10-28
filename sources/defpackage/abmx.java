package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abmx {
    private static final Map a = new EnumMap(abmw.class);

    static {
        for (abmw abmwVar : abmw.values()) {
            a.put(abmwVar, agsn.i(abmwVar.h));
        }
    }

    public static void a(abmw abmwVar, Object obj) {
        b(abmwVar, "%s", obj);
    }

    public static void b(abmw abmwVar, String str, Object... objArr) {
        ((agsj) ((agsj) ((agsn) a.get(abmwVar)).c()).k("com/google/android/libraries/youtube/player/internal/utils/PlayerLog", "w", 114, "PlayerLog.java")).I(str, objArr);
    }
}

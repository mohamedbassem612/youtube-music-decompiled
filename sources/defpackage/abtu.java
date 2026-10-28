package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abtu {
    public static final abtu a = new abtu(abtt.NEXT, null, null, null);
    public static final abtu b = new abtu(abtt.PREVIOUS, null, null, null);
    public static final abtu c = new abtu(abtt.AUTOPLAY, null, null, null);
    public static final abtu d = new abtu(abtt.AUTONAV, null, null, null);
    public final abtt e;
    public final abnl f;
    public final abnp g;
    private final Map h;

    public abtu(abtt abttVar, abnl abnlVar, abnp abnpVar, Map map) {
        this.e = abttVar;
        this.f = abnlVar;
        this.g = abnpVar;
        this.h = map;
    }

    public static final int b(boolean z) {
        return z ? 2 : 1;
    }

    public final Map a() {
        Map map = this.h;
        if (map == null) {
            return null;
        }
        return agkj.h(map);
    }
}

package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class fwx {
    public static final axlj a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ahql ahqlVar = ahqu.a;
        ahqu.a(fwx.class, fww.a, map, map2);
        ahqu.a(ahub.class, fwv.a, map, map2);
        ahqu.a(ahua.class, fwu.a, map, map2);
        a = new axlj((Map) new HashMap(map), (Map) new HashMap(map2), ahqlVar);
    }

    private fwx() {
    }

    public abstract ahub a();
}

package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class izb implements izc {
    private final vxe a;
    private final xgn b;
    private final ajwo c;
    private final Map d;
    private final Consumer e;

    private izb(vxe vxeVar, xgn xgnVar, ajwo ajwoVar, Map map, Consumer consumer) {
        this.a = vxeVar;
        xgnVar.getClass();
        this.b = xgnVar;
        this.c = ajwoVar;
        map.getClass();
        this.d = map;
        this.e = consumer;
    }

    public static izb b(vxe vxeVar, xgn xgnVar, ajwo ajwoVar, Map map) {
        return c(vxeVar, xgnVar, ajwoVar, map, new hgi(4));
    }

    public static izb c(vxe vxeVar, xgn xgnVar, ajwo ajwoVar, Map map, Consumer consumer) {
        if (ajwoVar == null || vxeVar == null) {
            return null;
        }
        return new izb(vxeVar, xgnVar, ajwoVar, map, consumer);
    }

    @Override // defpackage.izc
    public final void a() {
        xgn xgnVar = this.b;
        ajwo ajwoVar = this.c;
        xgnVar.f(ajwoVar);
        HashMap map = new HashMap();
        map.put("com.google.android.libraries.youtube.logging.interaction_logger", xgnVar);
        map.putAll(this.d);
        this.e.r(map);
        this.a.c(ajwoVar, map);
    }
}

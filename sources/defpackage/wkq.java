package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wkq implements zxy {
    private final alol a;
    private final agfr b;

    public wkq(Context context, alol alolVar) {
        this.a = alolVar;
        this.b = aguu.al(new tar(context, 8));
    }

    @Override // defpackage.zxy
    public final amum a() {
        return amum.UNKNOWN;
    }

    @Override // defpackage.zxy
    public final void b(Map map, zyg zygVar) {
        map.put("X-Youtube-Client-Name", String.valueOf(this.a.aO));
        map.put("X-Youtube-Client-Version", (String) this.b.io());
    }

    @Override // defpackage.zxy
    public final boolean c() {
        return true;
    }
}

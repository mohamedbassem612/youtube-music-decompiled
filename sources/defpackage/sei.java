package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sei extends xjm {
    private final aawh b;
    private final abnr c;
    private final Map d;

    public sei(aawh aawhVar, abnr abnrVar, Map map, xkd xkdVar) {
        super("video_to_ad", xkdVar);
        this.b = aawhVar;
        this.c = abnrVar;
        map.getClass();
        this.d = map;
    }

    @Override // defpackage.xjm
    protected final void a(tas tasVar, Set set, Set set2) {
        super.a(tasVar, set, set2);
        Map map = this.d;
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            f((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // defpackage.xjm
    public final gdk b() {
        f("vis", this.c.a());
        f("mod_ad", "1");
        aawh aawhVar = this.b;
        if (aawhVar.g() > 0) {
            f("cache_bytes", String.valueOf(aawhVar.g()));
        }
        return super.b();
    }

    @Override // defpackage.xjm
    protected final boolean c(tas tasVar) {
        boolean zC = super.c(tasVar);
        if (!tasVar.d.isEmpty() && tasVar.d.equals("ad_ba")) {
            super.d();
        } else {
            if (!zC || !(tasVar instanceof aaxz) || ((aaxz) tasVar).c) {
                return zC;
            }
            super.d();
        }
        return true;
    }
}

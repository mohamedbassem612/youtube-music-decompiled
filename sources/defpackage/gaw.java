package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gaw extends fzq {
    public long a;
    public long b;

    public gaw(String str) {
        this.a = -1L;
        this.b = -1L;
        HashMap mapA = a(str);
        if (mapA != null) {
            this.a = ((Long) mapA.get(0)).longValue();
            this.b = ((Long) mapA.get(1)).longValue();
        }
    }

    @Override // defpackage.fzq
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.a));
        map.put(1, Long.valueOf(this.b));
        return map;
    }
}

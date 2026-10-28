package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbf extends fzq {
    public Long a;
    public Long b;

    public gbf(String str) {
        HashMap mapA = a(str);
        if (mapA != null) {
            this.a = (Long) mapA.get(0);
            this.b = (Long) mapA.get(1);
        }
    }

    @Override // defpackage.fzq
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.a);
        map.put(1, this.b);
        return map;
    }
}

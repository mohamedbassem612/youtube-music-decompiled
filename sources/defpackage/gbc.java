package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gbc extends fzq {
    public Long a;
    public Boolean b;
    public Boolean c;

    public gbc(String str) {
        HashMap mapA = a(str);
        if (mapA != null) {
            this.a = (Long) mapA.get(0);
            this.b = (Boolean) mapA.get(1);
            this.c = (Boolean) mapA.get(2);
        }
    }

    @Override // defpackage.fzq
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.a);
        map.put(1, this.b);
        map.put(2, this.c);
        return map;
    }
}

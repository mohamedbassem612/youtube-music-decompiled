package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ofy implements ofw {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public ofy(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ofw
    public final String a(Map map) {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            return (String) obj;
        }
        if (!map.containsKey(obj)) {
            return null;
        }
        if (map.get(obj) instanceof Boolean) {
            return true != ((Boolean) map.get(obj)).booleanValue() ? "0" : "1";
        }
        return String.valueOf(map.get(obj));
    }
}

package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ahqt implements ahql {
    private final /* synthetic */ int $cid;

    @Override // defpackage.ahqh
    public final void a(Object obj, Object obj2) {
        if (this.$cid == 0) {
            throw new ahqi("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
        Map.Entry entry = (Map.Entry) obj;
        ahqs ahqsVar = (ahqs) obj2;
        ahqsVar.c(ahqs.a, entry.getKey(), true);
        ahqsVar.c(ahqs.b, entry.getValue(), true);
    }
}

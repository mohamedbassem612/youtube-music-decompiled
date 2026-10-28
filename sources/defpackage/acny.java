package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acny implements avnj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ acny(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnj
    public final Object a(Object obj, Object obj2, Object obj3) {
        if (this.$cid != 0) {
            Duration duration = xun.b;
            return new xum((ajpb) obj2, ((Integer) obj3).intValue(), ((Boolean) obj).booleanValue());
        }
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        String str = acoi.g;
        return new acof((Optional) obj, (Optional) obj2, zBooleanValue);
    }
}

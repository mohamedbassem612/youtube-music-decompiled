package defpackage;

import android.content.res.Configuration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vvj implements avnf {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vvj(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnf
    public final Object a(Object obj, Object obj2) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? a.F((Boolean) obj, (Boolean) obj2) : Boolean.valueOf(((vob) ((agev) obj).c()).G(((Configuration) obj2).orientation));
        }
        return a.G((Boolean) obj, (Boolean) obj2);
    }
}

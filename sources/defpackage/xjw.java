package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class xjw extends zyn {
    private static final agrf l = agrf.h("com/google/android/libraries/youtube/logging/latency/legacy/CsiRequest");
    private final Set m;
    private final zwa n;

    public xjw(String str, tnr tnrVar, Set set, zwa zwaVar, tng tngVar) {
        super(1, str, tnrVar, tngVar);
        set.getClass();
        this.m = set;
        zwaVar.getClass();
        this.n = zwaVar;
    }

    @Override // defpackage.zyn, defpackage.zyg
    public final zwa Q() {
        return this.n;
    }

    @Override // defpackage.tns
    public final tnx aa(tnm tnmVar) {
        return tnx.e(null);
    }

    @Override // defpackage.tns
    public final Class ab() {
        return Void.class;
    }

    @Override // defpackage.tns
    public final /* bridge */ /* synthetic */ void ad(Object obj) {
    }

    @Override // defpackage.tmn, defpackage.tns
    public final Map e() {
        HashMap map = new HashMap();
        try {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((zxy) it.next()).b(map, this);
            }
        } catch (tmg unused) {
            ((agrc) ((agrc) l.b()).k("com/google/android/libraries/youtube/logging/latency/legacy/CsiRequest", "getHeaders", 57, "CsiRequest.java")).t("CsiRequest: unexpected AuthFailureError");
        }
        return map;
    }
}

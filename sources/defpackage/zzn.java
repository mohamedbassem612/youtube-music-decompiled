package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zzn implements zxy {
    private final /* synthetic */ int $cid;
    private final Object a;

    public zzn(wnb wnbVar, int i) {
        this.$cid = i;
        wnbVar.getClass();
        this.a = wnbVar;
    }

    @Override // defpackage.zxy
    public final amum a() {
        return this.$cid != 0 ? amum.ROLLOUT_TOKEN : amum.VISITOR_ID;
    }

    @Override // defpackage.zxy
    public final void b(Map map, zyg zygVar) {
        String strAD;
        if (this.$cid != 0) {
            String strA = ((wnb) this.a).a();
            if (strA == null || strA.isEmpty()) {
                return;
            }
            map.put("X-YouTube-Rollout-Token", strA);
            return;
        }
        if (zygVar.W()) {
            strAD = zygVar.R();
        } else {
            strAD = ((ci) this.a).aD(zygVar.P());
        }
        if (strAD != null) {
            map.put("X-Goog-Visitor-Id", strAD);
        }
    }

    @Override // defpackage.zxy
    public final boolean c() {
        return this.$cid == 0;
    }

    public zzn(ci ciVar, int i) {
        this.$cid = i;
        this.a = ciVar;
    }
}

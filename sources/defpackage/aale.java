package defpackage;

import android.os.Bundle;
import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aale implements wfv {
    private final aalm a;
    private final awmd b;
    private final awmd c;
    private final vxz d;

    public aale(aalm aalmVar, vxz vxzVar, awmd awmdVar, awmd awmdVar2) {
        this.a = aalmVar;
        this.d = vxzVar;
        this.b = awmdVar;
        this.c = awmdVar2;
    }

    @Override // defpackage.wfv
    public final void b(Bundle bundle) {
        aoec aoecVarA = this.a.a();
        if (aoecVarA == null) {
            bundle.putString("offline_client_state", "Error getting offline client state");
            return;
        }
        bundle.putString("offline_videos_count", String.valueOf(aoecVarA.c.size()));
        bundle.putString("offline_playlists_count", String.valueOf(aoecVarA.d.size()));
        if (aoecVarA.c.size() == 0 && aoecVarA.d.size() == 0) {
            return;
        }
        int i = 0;
        long j = 0;
        int i2 = 0;
        for (aoei aoeiVar : aoecVarA.c) {
            j += aoeiVar.g;
            int i3 = aoeiVar.d;
            int iG = agvp.G(i3);
            if (iG != 0 && iG == 2) {
                i++;
            }
            int iG2 = agvp.G(i3);
            if (iG2 != 0 && iG2 == 18) {
                i2++;
            }
        }
        bundle.putString("offline_videos_playable", String.valueOf(i));
        bundle.putString("offline_videos_candidate", String.valueOf(i2));
        bundle.putString("offline_used_disk_space_bytes", String.valueOf(j));
        bundle.putString("offline_free_disk_space_bytes", String.valueOf(aoecVarA.e));
        bundle.putString("offline_client_state", Base64.encodeToString(aoecVarA.toByteArray(), 10));
        bundle.putString("orchestration_action_queue_count", String.valueOf(aoecVarA.g.size()));
        bundle.putString("orchestration_actions_waiting_for_constraints_queue_count", String.valueOf(aoecVarA.h.size()));
        bundle.putString("orchestration_actions_waiting_for_prereqs_queue_count", String.valueOf(aoecVarA.i.size()));
    }

    @Override // defpackage.wfv
    public final void c(Bundle bundle) {
        bundle.putString("offline_network_preference", ((aaqg) this.b.io()).s().name());
        if (this.d.l(92, 45477225L, false)) {
            ajuf ajufVarA = ajuf.a(((tfq) this.c.io()).a());
            bundle.putString("offline_current_network_type", ajufVarA != null ? ajufVarA.name() : ajuf.CONN_INVALID.name());
        }
    }
}

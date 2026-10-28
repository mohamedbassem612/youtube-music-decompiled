package defpackage;

import android.os.Bundle;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class waj implements wfv {
    private final /* synthetic */ int $cid;
    private final Object a;

    public waj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.wfv
    public final void b(Bundle bundle) {
        if (this.$cid == 2) {
            bundle.putString("audio_routes", ((hed) this.a).z().name());
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [awmd, java.lang.Object] */
    @Override // defpackage.wfv
    public final void c(Bundle bundle) {
        int i = this.$cid;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                if (bundle.containsKey("has_unlimited_entitlement")) {
                    return;
                }
                bundle.putString("probably_has_unlimited_entitlement", String.valueOf(((jnm) this.a).C()));
                return;
            } else {
                if (i != 2) {
                    isi isiVar = (isi) this.a.io();
                    bundle.putString("is_backing_server_queue_out_of_sync", String.valueOf(isiVar != null ? isiVar.j() : false));
                    return;
                }
                return;
            }
        }
        ?? r11 = this.a;
        vzw vzwVar = (vzw) r11.io();
        Boolean bool = Boolean.TRUE;
        HashMap map = new HashMap();
        ConcurrentHashMap concurrentHashMap = vzwVar.a;
        for (vzv vzvVar : concurrentHashMap.keySet()) {
            String str = vzvVar.a;
            akju akjuVar = ((aplx) concurrentHashMap.get(vzvVar)).c;
            if (akjuVar == null) {
                akjuVar = akju.a;
            }
            long j = akjuVar.c;
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append('.');
            String string = sb.toString();
            bool.booleanValue();
            ((List) Map.EL.computeIfAbsent(map, str, new vmw(i2))).add(string.concat(ahng.at(vzvVar.b)));
        }
        bundle.putString("datapush_srs_build_ids", vzw.i(map));
        vzw vzwVar2 = (vzw) r11.io();
        HashMap map2 = new HashMap();
        ConcurrentHashMap concurrentHashMap2 = vzwVar2.b;
        for (vzv vzvVar2 : concurrentHashMap2.keySet()) {
            String str2 = vzvVar2.a;
            akju akjuVar2 = ((aoql) concurrentHashMap2.get(vzvVar2)).b;
            if (akjuVar2 == null) {
                akjuVar2 = akju.a;
            }
            long j2 = akjuVar2.c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j2);
            sb2.append('.');
            String string2 = sb2.toString();
            bool.booleanValue();
            ((List) Map.EL.computeIfAbsent(map2, str2, new vmw(3))).add(string2.concat(ahng.at(vzvVar2.b)));
        }
        bundle.putString("datapush_player_build_ids", vzw.i(map2));
    }
}

package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aanm implements syk {
    private final aann a;
    private final aany b;

    public aanm(aann aannVar, aany aanyVar) {
        this.a = aannVar;
        this.b = aanyVar;
    }

    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        agkj agkjVarD;
        agrf agrfVar = aann.a;
        aann aannVar = this.a;
        zwa zwaVarE = aannVar.i.e();
        int i = 3;
        if (zwaVarE.h()) {
            agkjVarD = agpn.b;
        } else {
            wcn wcnVarB = ((wco) aannVar.e.io()).b(zwaVarE);
            abxv abxvVar = (abxv) aannVar.f.io();
            ArrayList arrayList = new ArrayList();
            wcu wcuVar = aagt.c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            tzk.ag(wcuVar, 4, Long.valueOf(aannVar.g.f().toEpochMilli() / 1000), abxvVar, arrayList);
            agke agkeVar = (agke) wcnVarB.s(tzk.ai(abxvVar, arrayList)).E();
            HashMap map = new HashMap();
            int size = agkeVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = (String) agkeVar.get(i2);
                agkz agkzVar = (agkz) wcnVarB.a(str).E();
                if (agkzVar == null || agkzVar.isEmpty()) {
                    ((agrc) ((agrc) aann.a.c()).k("com/google/android/libraries/youtube/offline/orchestration/AutoRefreshController", "fetchEntitiesToRefresh", 261, "AutoRefreshController.java")).w("[Offline] Couldn't find parent key for refreshEntity: %s", str);
                } else {
                    agqr it = agkzVar.iterator();
                    while (it.hasNext()) {
                        map.put((String) it.next(), str);
                    }
                }
            }
            aaof aaofVar = (aaof) ((aany) aannVar.h.io()).h.get();
            map.keySet().removeAll((Set) Collection.EL.stream(aaofVar == null ? agpr.a : aaofVar.j()).filter(new aaep(6)).map(new aalr(i)).collect(Collectors.toSet()));
            agkh agkhVar = new agkh(4);
            for (Map.Entry entry : map.entrySet()) {
                aphh aphhVar = (aphh) wcnVarB.g((String) entry.getValue()).g(aphh.class).E();
                if (aphhVar != null) {
                    agkhVar.e((String) entry.getKey(), aphhVar.getConstraints());
                }
            }
            agkjVarD = agkhVar.d(true);
        }
        HashMap map2 = new HashMap();
        agke agkeVar2 = aannVar.l.b.l(38, 45382418L, false) ? (agke) Collection.EL.stream(aann.d).map(new woi(aannVar, 19)).collect(aghu.a) : aann.d;
        agqr it2 = ((agpk) ((agpn) agkjVarD).entrySet()).iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            aihf aihfVarCreateBuilder = aofh.a.createBuilder();
            String str2 = (String) entry2.getKey();
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
            str2.getClass();
            aofhVar.b |= 2;
            aofhVar.d = str2;
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
            aofhVar2.c = 3;
            aofhVar2.b |= 1;
            List list = (List) entry2.getValue();
            aihh aihhVar = (aihh) aofg.b.createBuilder();
            aihhVar.m(list);
            aihhVar.n(agkeVar2);
            aihl aihlVar = aphe.b;
            aihf aihfVarCreateBuilder2 = aphe.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aphe apheVar = (aphe) aihfVarCreateBuilder2.instance;
            apheVar.c |= 1;
            apheVar.d = true;
            aihhVar.e(aihlVar, (aphe) aihfVarCreateBuilder2.build());
            aofg aofgVar = (aofg) aihhVar.build();
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
            aofgVar.getClass();
            aofhVar3.e = aofgVar;
            aofhVar3.b |= 4;
            aofh aofhVar4 = (aofh) aihfVarCreateBuilder.build();
            Integer numValueOf = Integer.valueOf(wfs.b((String) entry2.getKey()));
            List arrayList2 = (List) map2.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map2.put(numValueOf, arrayList2);
            }
            arrayList2.add(aofhVar4);
        }
        Iterator it3 = map2.values().iterator();
        while (it3.hasNext()) {
            try {
                ((aany) aannVar.h.io()).b((List) it3.next());
            } catch (aaob e) {
                String str3 = String.format("Refresh error. Msg: %s", e.getMessage());
                ((agrc) ((agrc) ((agrc) aann.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/orchestration/AutoRefreshController", "enqueueRefreshActions", (char) 336, "AutoRefreshController.java")).w("%s", str3);
                zvp.b(zvn.b, zvm.C, str3, e);
            }
        }
        try {
            ListenableFuture listenableFuture = ((aaog) this.b.a.io()).b;
            if (listenableFuture == null) {
                listenableFuture = aher.a;
            }
            listenableFuture.get();
            aannVar.c(aannVar.a());
            return 0;
        } catch (InterruptedException | ExecutionException unused) {
            return 1;
        }
    }
}

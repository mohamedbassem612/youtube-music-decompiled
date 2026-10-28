package defpackage;

import android.content.SharedPreferences;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import com.google.protos.youtube.api.innertube.InnertubeDrmService$LicenseRequest;
import j$.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wql implements sya {
    private final /* synthetic */ int $cid;

    public /* synthetic */ wql(int i) {
        this.$cid = i;
    }

    @Override // defpackage.sya
    public final Object a(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                aihf aihfVar = (aihf) obj;
                aihfVar.copyOnWrite();
                alrh alrhVar = (alrh) aihfVar.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alrh alrhVar2 = alrh.a;
                innertubeContext$InnerTubeContext.getClass();
                alrhVar.c = innertubeContext$InnerTubeContext;
                alrhVar.b |= 1;
                return aihfVar;
            case 1:
                aihf aihfVar2 = (aihf) obj;
                aihfVar2.copyOnWrite();
                alrj alrjVar = (alrj) aihfVar2.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext2 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alrj alrjVar2 = alrj.a;
                innertubeContext$InnerTubeContext2.getClass();
                alrjVar.c = innertubeContext$InnerTubeContext2;
                alrjVar.b |= 1;
                return aihfVar2;
            case 2:
                aihf aihfVar3 = (aihf) obj;
                aihfVar3.copyOnWrite();
                alrl alrlVar = (alrl) aihfVar3.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext3 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alrl alrlVar2 = alrl.a;
                innertubeContext$InnerTubeContext3.getClass();
                alrlVar.c = innertubeContext$InnerTubeContext3;
                alrlVar.b |= 1;
                return aihfVar3;
            case 3:
                aihf aihfVar4 = (aihf) obj;
                aihfVar4.copyOnWrite();
                alow alowVar = (alow) aihfVar4.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext4 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alow alowVar2 = alow.a;
                innertubeContext$InnerTubeContext4.getClass();
                alowVar.c = innertubeContext$InnerTubeContext4;
                alowVar.b |= 1;
                return aihfVar4;
            case 4:
                aihf aihfVar5 = (aihf) obj;
                aihfVar5.copyOnWrite();
                alsy alsyVar = (alsy) aihfVar5.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext5 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alsy alsyVar2 = alsy.a;
                innertubeContext$InnerTubeContext5.getClass();
                alsyVar.c = innertubeContext$InnerTubeContext5;
                alsyVar.b |= 1;
                return aihfVar5;
            case 5:
                aihf aihfVar6 = (aihf) obj;
                aihfVar6.copyOnWrite();
                alxf alxfVar = (alxf) aihfVar6.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext6 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alxf alxfVar2 = alxf.a;
                innertubeContext$InnerTubeContext6.getClass();
                alxfVar.c = innertubeContext$InnerTubeContext6;
                alxfVar.b |= 1;
                return aihfVar6;
            case 6:
                aihf aihfVar7 = (aihf) obj;
                aihfVar7.copyOnWrite();
                amad amadVar = (amad) aihfVar7.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext7 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                amad amadVar2 = amad.a;
                innertubeContext$InnerTubeContext7.getClass();
                amadVar.d = innertubeContext$InnerTubeContext7;
                amadVar.b |= 1;
                return aihfVar7;
            case 7:
                aihf aihfVar8 = (aihf) obj;
                aihfVar8.copyOnWrite();
                alrf alrfVar = (alrf) aihfVar8.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext8 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alrf alrfVar2 = alrf.a;
                innertubeContext$InnerTubeContext8.getClass();
                alrfVar.e = innertubeContext$InnerTubeContext8;
                alrfVar.b |= 1;
                return aihfVar8;
            case 8:
                aihf aihfVar9 = (aihf) obj;
                aihf aihfVar10 = (aihf) obj2;
                int i = xpi.g;
                aihfVar9.getClass();
                aihfVar10.getClass();
                aihfVar9.copyOnWrite();
                alwt alwtVar = (alwt) aihfVar9.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext9 = (InnertubeContext$InnerTubeContext) aihfVar10.build();
                alwt alwtVar2 = alwt.a;
                innertubeContext$InnerTubeContext9.getClass();
                alwtVar.c = innertubeContext$InnerTubeContext9;
                alwtVar.b |= 1;
                return aihfVar9;
            case 9:
                atpe atpeVar = (atpe) obj2;
                return ((SharedPreferences.Editor) obj).putInt("mdx.recovery.session_type", atpeVar.c).putInt("mdx.recovery.session_source", atpeVar.n).putInt("mdx.recovery.disconnect_reason", atpeVar.d).putLong("mdx.recovery.last_connected_time", atpeVar.e).putLong("mdx.recovery.expiration_time", atpeVar.f).putString("mdx.recovery.route_id", atpeVar.g).putString("mdx.recovery.ssdp_id", atpeVar.m).putString("mdx.recovery.screen_name", atpeVar.h).putString("mdx.recovery.session_nonce", atpeVar.i).putInt("mdx.recovery.session_index", atpeVar.j).putLong("mdx.recovery.first_connected_time_ms", atpeVar.l).putLong("mdx.recovery.started_time_ms", atpeVar.k);
            case 10:
                aihf aihfVar11 = (aihf) obj;
                aihfVar11.copyOnWrite();
                InnertubeDrmService$LicenseRequest innertubeDrmService$LicenseRequest = (InnertubeDrmService$LicenseRequest) aihfVar11.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext10 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                InnertubeDrmService$LicenseRequest innertubeDrmService$LicenseRequest2 = InnertubeDrmService$LicenseRequest.a;
                innertubeContext$InnerTubeContext10.getClass();
                innertubeDrmService$LicenseRequest.c = innertubeContext$InnerTubeContext10;
                innertubeDrmService$LicenseRequest.b |= 1;
                return aihfVar11;
            case 11:
                Object obj3 = ((dov) obj).a;
                jrq jrqVar = (jrq) obj2;
                agqr it = ((agkj) obj3).entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (str.startsWith("dispatched_event_count_")) {
                        jrqVar.b(str.substring(23), ((Integer) value).intValue());
                    } else if (str.startsWith("last_capture_time_ms_")) {
                        String strSubstring = str.substring(21);
                        Long l = (Long) value;
                        l.longValue();
                        strSubstring.getClass();
                        jrqVar.copyOnWrite();
                        atpn atpnVar = (atpn) jrqVar.instance;
                        atpn atpnVar2 = atpn.a;
                        aiip aiipVar = atpnVar.h;
                        if (!aiipVar.b) {
                            atpnVar.h = aiipVar.a();
                        }
                        atpnVar.h.put(strSubstring, l);
                    } else if (str.startsWith("dispatch_count_")) {
                        jrqVar.a(str.substring(15), ((Integer) value).intValue());
                    } else if (str.startsWith("sum_time_between_")) {
                        jrqVar.f(str.substring(17, str.length() - 12), ((Long) value).longValue());
                    } else if (str.startsWith("expired_events_")) {
                        jrqVar.d(str.substring(15), ((Integer) value).intValue());
                    } else if (str.startsWith("stored_events_")) {
                        jrqVar.e(str.substring(14), ((Integer) value).intValue());
                    } else {
                        jrqVar.c(str.substring(14, str.length() - 9), ((Boolean) value).booleanValue());
                    }
                }
                return jrqVar;
            case 12:
                Object obj4 = ((dov) obj).a;
                aihf aihfVar12 = (aihf) obj2;
                agqr it2 = ((agkj) obj4).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    String str2 = (String) entry2.getKey();
                    if (str2.startsWith("com.google.android.libraries.youtube.notification.badgecount.badgecount")) {
                        Integer num = (Integer) entry2.getValue();
                        num.intValue();
                        str2.getClass();
                        aihfVar12.copyOnWrite();
                        atpq atpqVar = (atpq) aihfVar12.instance;
                        atpq atpqVar2 = atpq.a;
                        aiip aiipVar2 = atpqVar.l;
                        if (!aiipVar2.b) {
                            atpqVar.l = aiipVar2.a();
                        }
                        atpqVar.l.put(str2, num);
                    } else if (str2.startsWith("com.google.android.libraries.youtube.notification.pref.notification_channel_importance")) {
                        aihfVar12.cN(str2, ((Integer) entry2.getValue()).intValue());
                    } else {
                        aihfVar12.cO(str2, ((Boolean) entry2.getValue()).booleanValue());
                    }
                }
                return aihfVar12;
            case 13:
                aihf aihfVar13 = (aihf) obj;
                aihfVar13.copyOnWrite();
                alue alueVar = (alue) aihfVar13.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext11 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                alue alueVar2 = alue.a;
                innertubeContext$InnerTubeContext11.getClass();
                alueVar.c = innertubeContext$InnerTubeContext11;
                alueVar.b |= 1;
                return aihfVar13;
            case 14:
                aihf aihfVar14 = (aihf) obj;
                aihfVar14.copyOnWrite();
                altu altuVar = (altu) aihfVar14.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext12 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                altu altuVar2 = altu.a;
                innertubeContext$InnerTubeContext12.getClass();
                altuVar.c = innertubeContext$InnerTubeContext12;
                altuVar.b |= 1;
                return aihfVar14;
            case 15:
                aihf aihfVar15 = (aihf) obj;
                aihfVar15.copyOnWrite();
                altr altrVar = (altr) aihfVar15.instance;
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext13 = (InnertubeContext$InnerTubeContext) ((aihf) obj2).build();
                altr altrVar2 = altr.a;
                innertubeContext$InnerTubeContext13.getClass();
                altrVar.c = innertubeContext$InnerTubeContext13;
                altrVar.b |= 1;
                return aihfVar15;
            case 16:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                for (Map.Entry entry3 : DesugarCollections.unmodifiableMap(((atpt) obj2).d).entrySet()) {
                    String strY = tym.y("offline_auto_offline_time_%s", (String) entry3.getKey());
                    atps atpsVar = (atps) entry3.getValue();
                    if (atps.a.equals(atpsVar)) {
                        editor.remove(strY);
                    } else {
                        editor.putLong(strY, atpsVar.c);
                    }
                }
                return editor;
            default:
                Object obj5 = ((dov) obj).a;
                aihf aihfVar16 = (aihf) obj2;
                agqr it3 = ((agkj) obj5).entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it3.next();
                    if (absl.d((String) entry4.getKey())) {
                        aihfVar16.cQ((String) entry4.getKey(), entry4.getValue() == null ? false : ((Boolean) entry4.getValue()).booleanValue());
                    } else {
                        long jLongValue = entry4.getValue() == null ? 0L : ((Long) entry4.getValue()).longValue();
                        String str3 = (String) entry4.getKey();
                        str3.getClass();
                        aihfVar16.copyOnWrite();
                        atpv atpvVar = (atpv) aihfVar16.instance;
                        atpv atpvVar2 = atpv.a;
                        aiip aiipVar3 = atpvVar.e;
                        if (!aiipVar3.b) {
                            atpvVar.e = aiipVar3.a();
                        }
                        atpvVar.e.put(str3, Long.valueOf(jLongValue));
                    }
                }
                return aihfVar16;
        }
    }
}

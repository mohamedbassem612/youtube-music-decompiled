package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tpi implements qro {
    private final /* synthetic */ int $cid;

    public /* synthetic */ tpi(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r4v23, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.qro
    public final MessageLite a(tld tldVar, MessageLite messageLite) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                aino ainoVar = (aino) messageLite;
                if (!tldVar.u("com.google.android.libraries.youtube.innertube.pref.startup_uncaught_exception_count")) {
                    return ainoVar;
                }
                aihf builder = ainoVar.toBuilder();
                int iP = tldVar.p("com.google.android.libraries.youtube.innertube.pref.startup_uncaught_exception_count", 0);
                builder.copyOnWrite();
                aino ainoVar2 = (aino) builder.instance;
                ainoVar2.b |= 1;
                ainoVar2.c = iP;
                return (aino) builder.build();
            case 1:
                aihf builder2 = ((atoq) messageLite).toBuilder();
                if (tldVar.u("last_ad_time")) {
                    long jQ = tldVar.q("last_ad_time", 0L);
                    builder2.copyOnWrite();
                    atoq atoqVar = (atoq) builder2.instance;
                    atoqVar.b |= 1;
                    atoqVar.c = jQ;
                }
                if (tldVar.u("last_ad_signals_adid")) {
                    String strS = tldVar.s("last_ad_signals_adid", null);
                    builder2.copyOnWrite();
                    atoq atoqVar2 = (atoq) builder2.instance;
                    strS.getClass();
                    atoqVar2.b |= 2;
                    atoqVar2.d = strS;
                }
                if (tldVar.u("last_ad_signals_lat")) {
                    boolean zV = tldVar.v("last_ad_signals_lat", false);
                    builder2.copyOnWrite();
                    atoq atoqVar3 = (atoq) builder2.instance;
                    atoqVar3.b |= 4;
                    atoqVar3.e = zV;
                }
                if (tldVar.u("last_ad_signals_timestamp")) {
                    long jQ2 = tldVar.q("last_ad_signals_timestamp", 0L);
                    builder2.copyOnWrite();
                    atoq atoqVar4 = (atoq) builder2.instance;
                    atoqVar4.b |= 16;
                    atoqVar4.g = jQ2;
                }
                if (tldVar.u("last_ad_signals_identity")) {
                    String strS2 = tldVar.s("last_ad_signals_identity", null);
                    builder2.copyOnWrite();
                    atoq atoqVar5 = (atoq) builder2.instance;
                    strS2.getClass();
                    atoqVar5.b |= 8;
                    atoqVar5.f = strS2;
                }
                return (atoq) builder2.build();
            case 2:
                aihf builder3 = ((atou) messageLite).toBuilder();
                if (tldVar.u("innertube_safety_mode_enabled")) {
                    boolean zV2 = tldVar.v("innertube_safety_mode_enabled", false);
                    builder3.copyOnWrite();
                    atou atouVar = (atou) builder3.instance;
                    atouVar.b |= 1;
                    atouVar.c = zV2;
                }
                return (atou) builder3.build();
            case 3:
                aihf builder4 = ((ainm) messageLite).toBuilder();
                if (tldVar.u("screenIds")) {
                    String[] strArrSplit = tldVar.s("screenIds", "").split(",");
                    String[] strArrSplit2 = tldVar.s("screenNames", "").split(",");
                    List listH = agfm.b(',').h(tldVar.s("deviceIds", ""));
                    while (i < strArrSplit.length) {
                        String str = strArrSplit[i];
                        if (!TextUtils.isEmpty(str) && i < listH.size() && !TextUtils.isEmpty((CharSequence) listH.get(i))) {
                            aihf aihfVarCreateBuilder = ainl.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            ainl ainlVar = (ainl) aihfVarCreateBuilder.instance;
                            str.getClass();
                            ainlVar.b |= 1;
                            ainlVar.c = str;
                            String str2 = (String) listH.get(i);
                            aihfVarCreateBuilder.copyOnWrite();
                            ainl ainlVar2 = (ainl) aihfVarCreateBuilder.instance;
                            str2.getClass();
                            ainlVar2.b |= 4;
                            ainlVar2.e = str2;
                            String str3 = i < strArrSplit2.length ? strArrSplit2[i] : "";
                            aihfVarCreateBuilder.copyOnWrite();
                            ainl ainlVar3 = (ainl) aihfVarCreateBuilder.instance;
                            str3.getClass();
                            ainlVar3.b |= 2;
                            ainlVar3.d = str3;
                            ainl ainlVar4 = (ainl) aihfVarCreateBuilder.build();
                            builder4.copyOnWrite();
                            ainm ainmVar = (ainm) builder4.instance;
                            ainlVar4.getClass();
                            ainmVar.a();
                            ainmVar.b.add(ainlVar4);
                        }
                        i++;
                    }
                }
                return (ainm) builder4.build();
            case 4:
                aihf builder5 = ((atpi) messageLite).toBuilder();
                long jQ3 = tldVar.q("mdx-last-connection-timestamp", 0L);
                builder5.copyOnWrite();
                atpi atpiVar = (atpi) builder5.instance;
                atpiVar.b |= 1;
                atpiVar.c = jQ3;
                if (tldVar.u("user-stats-timestamp")) {
                    long jQ4 = tldVar.q("user-stats-timestamp", 0L);
                    builder5.copyOnWrite();
                    atpi atpiVar2 = (atpi) builder5.instance;
                    atpiVar2.b |= 4;
                    atpiVar2.g = jQ4;
                }
                if (tldVar.u("mdx-profile-creation-timestamp")) {
                    long jQ5 = tldVar.q("mdx-profile-creation-timestamp", -1L);
                    builder5.copyOnWrite();
                    atpi atpiVar3 = (atpi) builder5.instance;
                    atpiVar3.b |= 2;
                    atpiVar3.d = jQ5;
                }
                int[] iArr = new int[28];
                int[] iArr2 = new int[28];
                yds.e(tldVar.s("mdx-connection-count", ""), iArr);
                yds.e(tldVar.s("cast-available-session-count", ""), iArr2);
                builder5.copyOnWrite();
                ((atpi) builder5.instance).e = atpi.emptyIntList();
                builder5.cK(ahng.Q(iArr));
                builder5.copyOnWrite();
                ((atpi) builder5.instance).f = atpi.emptyIntList();
                builder5.cJ(ahng.Q(iArr2));
                return (atpi) builder5.build();
            case 5:
                aihf builder6 = ((atpl) messageLite).toBuilder();
                String strS3 = tldVar.s("last_manual_quality_selection_cpn", "");
                builder6.copyOnWrite();
                atpl atplVar = (atpl) builder6.instance;
                strS3.getClass();
                atplVar.b |= 8;
                atplVar.g = strS3;
                return (atpl) builder6.build();
            case 6:
                String strS4 = tldVar.s("DeviceContextCache.KEY_PROTO", "");
                long jQ6 = tldVar.q("DeviceContextCache.KEY_TIMESTAMP", 0L);
                aihf builder7 = ((atpq) messageLite).toBuilder();
                if (!TextUtils.isEmpty(strS4)) {
                    try {
                        aklo akloVar = (aklo) aihn.parseFrom(aklo.a, aigj.x(strS4), ExtensionRegistryLite.getGeneratedRegistry());
                        builder7.copyOnWrite();
                        atpq atpqVar = (atpq) builder7.instance;
                        atpqVar.b |= 2;
                        atpqVar.d = jQ6;
                        builder7.copyOnWrite();
                        atpq atpqVar2 = (atpq) builder7.instance;
                        akloVar.getClass();
                        atpqVar2.c = akloVar;
                        atpqVar2.b |= 1;
                        break;
                    } catch (aiik unused) {
                    }
                }
                String strS5 = tldVar.s("gcm_registration_id", "");
                builder7.copyOnWrite();
                atpq atpqVar3 = (atpq) builder7.instance;
                strS5.getClass();
                atpqVar3.b |= 4;
                atpqVar3.e = strS5;
                long jQ7 = tldVar.q("com.google.android.libraries.youtube.notification.pref.last_notification_registration_time", 0L);
                builder7.copyOnWrite();
                atpq atpqVar4 = (atpq) builder7.instance;
                atpqVar4.b |= 8;
                atpqVar4.f = jQ7;
                boolean zV3 = tldVar.v("pending_notification_registration", false);
                builder7.copyOnWrite();
                atpq atpqVar5 = (atpq) builder7.instance;
                atpqVar5.b |= SemanticState.Hidden;
                atpqVar5.k = zV3;
                if (tldVar.u("com.google.android.libraries.youtube.notification.pref.last_os_notifications_enabled")) {
                    boolean zV4 = tldVar.v("com.google.android.libraries.youtube.notification.pref.last_os_notifications_enabled", false);
                    builder7.copyOnWrite();
                    atpq atpqVar6 = (atpq) builder7.instance;
                    atpqVar6.b |= 16;
                    atpqVar6.g = zV4;
                }
                if (tldVar.u("com.google.android.libraries.youtube.notification.pref.LAST_OS_NOTIFICATIONS_CHANGED_TIME_MS")) {
                    long jQ8 = tldVar.q("com.google.android.libraries.youtube.notification.pref.LAST_OS_NOTIFICATIONS_CHANGED_TIME_MS", 0L);
                    builder7.copyOnWrite();
                    atpq atpqVar7 = (atpq) builder7.instance;
                    atpqVar7.b |= 32;
                    atpqVar7.h = jQ8;
                }
                if (tldVar.u("com.google.android.libraries.youtube.notification.pref.last_notifications_settings_enabled")) {
                    boolean zV5 = tldVar.v("com.google.android.libraries.youtube.notification.pref.last_notifications_settings_enabled", false);
                    builder7.copyOnWrite();
                    atpq atpqVar8 = (atpq) builder7.instance;
                    atpqVar8.b |= 64;
                    atpqVar8.i = zV5;
                }
                if (tldVar.u("device_context_app_last_opened")) {
                    long jQ9 = tldVar.q("device_context_app_last_opened", 0L);
                    builder7.copyOnWrite();
                    atpq atpqVar9 = (atpq) builder7.instance;
                    atpqVar9.b |= SemanticState.Focused;
                    atpqVar9.j = jQ9;
                }
                return (atpq) builder7.build();
            default:
                aihf builder8 = ((ator) messageLite).toBuilder();
                szc[] szcVarArrValues = szc.values();
                int length = szcVarArrValues.length;
                while (i < length) {
                    szc szcVar = szcVarArrValues[i];
                    sya syaVar = szcVar.o;
                    String str4 = szcVar.m;
                    ?? r4 = tldVar.a;
                    tldVar.w(str4);
                    syaVar.a(builder8, Float.valueOf(r4.getFloat(str4, -1.0f)));
                    i++;
                }
                return (ator) builder8.build();
        }
    }
}

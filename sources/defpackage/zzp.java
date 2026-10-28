package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zzp implements syk {
    private final aaax a;

    public zzp(aaax aaaxVar) {
        this.a = aaaxVar;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x028c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0291  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:127:0x02af  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Type inference failed for: r6v18, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Object, qbn] */
    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        ajwo ajwoVarB;
        HashMap map;
        aabr aabrVarN;
        int i;
        String str;
        aisd aisdVar;
        boolean z;
        pxk pxlVar;
        String str2;
        Intent intent = new Intent();
        intent.putExtras(bundle);
        aaax aaaxVar = this.a;
        if (aaaxVar.j.l(22, 45711443L, false) && intent.getIntExtra("local_notification_interaction_type", -1) == 1) {
            Bundle extras = intent.getExtras();
            Optional optionalEmpty = (extras == null || !extras.containsKey("local_notification_ve_type")) ? Optional.empty() : Optional.of(Integer.valueOf(extras.getInt("local_notification_ve_type")));
            if (optionalEmpty.isPresent()) {
                int iIntValue = ((Integer) optionalEmpty.get()).intValue();
                xgt xgtVarA = aabp.a(intent);
                if (xgtVarA != null) {
                    xgn xgnVar = aaaxVar.h;
                    xgnVar.C(xgtVarA);
                    xgj xgjVar = new xgj(xhb.b(iIntValue));
                    xgj xgjVar2 = new xgj(xhb.b(74726));
                    xgnVar.m(xgjVar2, xgjVar);
                    xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar2, null);
                    return 0;
                }
            }
        } else {
            String stringExtra = intent.getStringExtra("chime-thread-id");
            if (!TextUtils.isEmpty(stringExtra)) {
                Optional optional = aaaxVar.e;
                if (optional.isEmpty()) {
                    ((agrc) ((agrc) aaax.a.b()).k("com/google/android/libraries/youtube/notification/push/NotificationInteractionController", "cancelChimeNotification", 246, "NotificationInteractionController.java")).t("ChimeNotificationRemover was unexpectedly not present.");
                } else {
                    try {
                        Object obj = optional.get();
                        String stringExtra2 = intent.getStringExtra("gnp-account-type");
                        if (stringExtra2 == null) {
                            pxlVar = null;
                        } else {
                            String stringExtra3 = intent.getStringExtra("encoded-gnp-account-id");
                            if (stringExtra3 != null) {
                                try {
                                    str2 = new String(Base64.decode(stringExtra3, 0), StandardCharsets.UTF_8);
                                } catch (IllegalArgumentException unused) {
                                    str2 = null;
                                }
                            } else {
                                str2 = null;
                            }
                            int iHashCode = stringExtra2.hashCode();
                            if (iHashCode != -587044078) {
                                if (iHashCode != -374317998) {
                                    if (iHashCode == 2179954 && stringExtra2.equals("GAIA") && str2 != null) {
                                        pxlVar = new pxo(str2);
                                    } else {
                                        pxlVar = null;
                                    }
                                } else if (!stringExtra2.equals("DELEGATED_GAIA") || str2 == null) {
                                    pxlVar = null;
                                } else {
                                    pxlVar = new pxl(str2);
                                }
                            } else if (stringExtra2.equals("YOUTUBE_VISITOR")) {
                                pxlVar = pyb.a;
                            } else {
                                pxlVar = null;
                            }
                        }
                        ((elr) obj).a.c(pxlVar, agke.q(stringExtra));
                    } catch (plu unused2) {
                        ((agrc) ((agrc) aaax.a.b()).k("com/google/android/libraries/youtube/notification/push/NotificationInteractionController", "cancelChimeNotification", SemanticState.Hidden, "NotificationInteractionController.java")).t("Failed to remove notification.");
                    }
                    xgt xgtVarA2 = aabp.a(intent);
                    if (xgtVarA2 != null) {
                        xgn xgnVar2 = aaaxVar.h;
                        xgnVar2.C(xgtVarA2);
                        amud amudVarD = intent.hasExtra("parent_logging_directive") ? aabq.d(intent.getExtras(), "parent_logging_directive") : null;
                        if (amudVarD != null) {
                            xgj xgjVar3 = new xgj(amudVarD.d, (amud) null);
                            xgj xgjVar4 = new xgj(xhb.b(82046));
                            xgnVar2.m(xgjVar4, xgjVar3);
                            xgnVar2.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar4, null);
                        }
                    }
                }
            }
            yno.X(aaaxVar.c, aaaxVar.h, intent);
            ajwo ajwoVarA = aabq.a(intent);
            if (ajwoVarA != null) {
                try {
                    aaaxVar.f.c(ajwoVarA, null);
                } catch (vxo unused3) {
                    ((agrc) ((agrc) aaax.a.c()).k("com/google/android/libraries/youtube/notification/push/NotificationInteractionController", "onHandleIntent", 132, "NotificationInteractionController.java")).t("Invalid interactions service endpoint.");
                }
            }
            String stringExtra4 = (intent.getExtras() == null || !intent.hasExtra("push_notification_clientstreamz_logging")) ? null : intent.getStringExtra("push_notification_clientstreamz_logging");
            if (!TextUtils.isEmpty(stringExtra4)) {
                aaal.d(aaaxVar.g, stringExtra4);
            }
            Bundle extras2 = intent.getExtras();
            Optional optionalEmpty2 = (extras2 == null || !intent.hasExtra("timeout_timestamp")) ? Optional.empty() : Optional.of(Instant.ofEpochMilli(extras2.getLong("timeout_timestamp")));
            if (optionalEmpty2.isPresent() && Duration.between(aaaxVar.i.f(), optionalEmpty2.get()).abs().toSeconds() <= 5) {
                aaal.d(aaaxVar.g, "TTL");
            }
            amud amudVarD2 = intent.hasExtra("logging_directive") ? aabq.d(intent.getExtras(), "logging_directive") : null;
            xgt xgtVarA3 = aabp.a(intent);
            if (amudVarD2 != null && xgtVarA3 != null && intent.getIntExtra("interaction_type", -1) == 2) {
                xgn xgnVar3 = aaaxVar.h;
                xgnVar3.C(xgtVarA3);
                xgj xgjVar5 = new xgj(amudVarD2.d, (amud) null);
                xgj xgjVar6 = new xgj(xhb.b(74726));
                xgnVar3.e(xgjVar6, xgjVar5);
                xgnVar3.w(xgjVar6, null);
                xgnVar3.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar6, null);
            }
            if (stringExtra == null) {
                zwb zwbVar = aaaxVar.d;
                boolean zU = zwbVar.u();
                if (intent.getExtras() == null || !intent.hasExtra("identity_token")) {
                    aisdVar = null;
                } else {
                    try {
                        aisdVar = (aisd) aihn.parseFrom(aisd.a, intent.getExtras().getByteArray("identity_token"), ExtensionRegistryLite.getGeneratedRegistry());
                    } catch (aiik unused4) {
                        aisdVar = null;
                    }
                }
                if (aisdVar == null) {
                    z = false;
                } else {
                    aisf aisfVar = aisdVar.d;
                    if (aisfVar == null) {
                        aisfVar = aisf.a;
                    }
                    if ((aisfVar.b & 1) != 0) {
                        String strK = zwbVar.e().k();
                        aisf aisfVar2 = aisdVar.d;
                        if (aisfVar2 == null) {
                            aisfVar2 = aisf.a;
                        }
                        if (strK.equals(aisfVar2.c)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                if (!zU || z) {
                    if (intent.getExtras() == null && intent.hasExtra("service_endpoint")) {
                        ajwoVarB = vxg.b(intent.getExtras().getByteArray("service_endpoint"));
                    } else {
                        ajwoVarB = null;
                    }
                    if (ajwoVarB != null) {
                        map = new HashMap();
                        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ajwoVarB.c.G());
                        aabrVarN = aagu.n(intent);
                        i = aabrVarN.b;
                        if (i != -666) {
                            str = aabrVarN.a;
                            if (!TextUtils.isEmpty(str)) {
                                map.put("notification_data", new aaav(i, str));
                            }
                        }
                        aaaxVar.b.c(ajwoVarB, map);
                        if (amudVarD2 != null && xgtVarA3 != null && intent.getIntExtra("interaction_type", -1) == 1) {
                            xgn xgnVar4 = aaaxVar.h;
                            xgnVar4.C(xgtVarA3);
                            xgnVar4.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(amudVarD2.d, (amud) null), null);
                        }
                    }
                }
            } else {
                if (intent.getExtras() == null) {
                    ajwoVarB = null;
                } else {
                    ajwoVarB = null;
                }
                if (ajwoVarB != null) {
                    map = new HashMap();
                    map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ajwoVarB.c.G());
                    aabrVarN = aagu.n(intent);
                    i = aabrVarN.b;
                    if (i != -666) {
                        str = aabrVarN.a;
                        if (!TextUtils.isEmpty(str)) {
                            map.put("notification_data", new aaav(i, str));
                        }
                    }
                    aaaxVar.b.c(ajwoVarB, map);
                    if (amudVarD2 != null) {
                        xgn xgnVar5 = aaaxVar.h;
                        xgnVar5.C(xgtVarA3);
                        xgnVar5.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(amudVarD2.d, (amud) null), null);
                    }
                }
            }
        }
        return 0;
    }
}

package com.google.android.apps.youtube.music.notifications;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aaal;
import defpackage.aaat;
import defpackage.aabr;
import defpackage.aabz;
import defpackage.aacj;
import defpackage.aagu;
import defpackage.aaok;
import defpackage.aerv;
import defpackage.agrc;
import defpackage.ahcs;
import defpackage.ahth;
import defpackage.aihl;
import defpackage.aihn;
import defpackage.aiik;
import defpackage.ajda;
import defpackage.ajwo;
import defpackage.apbu;
import defpackage.apje;
import defpackage.aunn;
import defpackage.awmd;
import defpackage.elr;
import defpackage.hla;
import defpackage.pnl;
import defpackage.qrx;
import defpackage.qtf;
import defpackage.syi;
import defpackage.taf;
import defpackage.tym;
import defpackage.vxz;
import defpackage.vyo;
import defpackage.xfa;
import defpackage.xgn;
import defpackage.xwd;
import defpackage.yno;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class FcmMessageListenerService extends hla {
    public Intent a;
    public vyo b;
    public aunn c;
    public awmd d;
    public xgn e;
    public awmd f;
    public awmd g;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void a(ahth ahthVar) {
        apbu apbuVar;
        Intent intent;
        int i;
        byte[] bArrDecode;
        awmd awmdVar = this.d;
        if (aaal.c(this.b, awmdVar)) {
            ((qtf) ((aerv) awmdVar.io()).m.io()).b(1L, "GCM_DATA_RECEIVED");
        }
        if (((pnl) this.g.io()).a(getApplicationContext(), ahthVar)) {
            return;
        }
        Application application = getApplication();
        Bundle bundle = new Bundle();
        for (Map.Entry entry : ahthVar.a().entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        String string = ahthVar.a.getString("from");
        if (string != null) {
            bundle.putString("from", string);
        }
        String string2 = bundle.getString("r");
        apje apjeVar = null;
        try {
            if (TextUtils.isEmpty(string2)) {
                apbuVar = null;
            } else {
                try {
                    bArrDecode = Base64.decode(string2, 0);
                } catch (IllegalArgumentException unused) {
                    try {
                        bArrDecode = Base64.decode(string2, 8);
                    } catch (IllegalArgumentException e) {
                        e = e;
                        ((agrc) ((agrc) ((agrc) aacj.a.c()).j(e)).k("com/google/android/libraries/youtube/notification/topic/NotificationIntentParser", "extractPushNotificationSupportedRenderers", 't', "NotificationIntentParser.java")).t("Could not convert base64-encoded byte stream into PushNotificationSupportedRenderers proto: ");
                        apbuVar = null;
                    }
                }
                apbuVar = (apbu) aihn.parseFrom(apbu.a, bArrDecode, ExtensionRegistryLite.getGeneratedRegistry());
            }
        } catch (aiik e2) {
            e = e2;
        }
        ajda ajdaVar = (apbuVar == null || (i = apbuVar.b) != 77819057) ? null : i == 77819057 ? (ajda) apbuVar.c : ajda.a;
        if (ajdaVar != null) {
            if (aagu.l(ajdaVar)) {
                aaok aaokVar = (aaok) this.c.io();
                if (((vxz) aaokVar.c).l(4, 45352805L, false)) {
                    Object obj = ((elr) aaokVar.d).a;
                    String strL = tym.l();
                    taf.h(ahcs.e(ahcs.e(ahcs.e(((qrx) obj).a(new aaat(strL, ajdaVar, 2), MoreExecutors.directExecutor()), new xwd(strL, 16), MoreExecutors.directExecutor()), new xwd(ajdaVar, 9), MoreExecutors.directExecutor()), new xwd(aaokVar, 10), MoreExecutors.directExecutor()), MoreExecutors.directExecutor(), new xfa(aaokVar, ajdaVar, 6));
                    return;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putByteArray("com.google.android.libraries.youtube.notification.pref.notification_renderer", ajdaVar.toByteArray());
                    bundle2.putString("renderer_class_name", ajdaVar.getClass().getName());
                    ((syi) aaokVar.b).a("notification_processing", bundle2);
                    return;
                }
            }
            for (ajwo ajwoVar : ajdaVar.l) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apje.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apje.b);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    apjeVar = (apje) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    break;
                }
            }
            if (apjeVar == null || (intent = this.a) == null) {
                return;
            }
            aagu.p(intent, new aabr(apjeVar.c, apjeVar.d, ""));
            yno.X(application, this.e, this.a);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void b(String str) {
        ((aabz) this.f.io()).b(str);
    }
}

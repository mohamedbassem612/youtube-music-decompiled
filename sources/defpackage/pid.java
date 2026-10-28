package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pid implements pgy {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;
    private final pls c;

    public pid(Context context, pls plsVar) {
        this.b = context;
        this.c = plsVar;
    }

    @Override // defpackage.pgy
    public final String a(pot potVar) {
        afx afxVar = new afx(0);
        Iterator it = ((NotificationManager) this.b.getSystemService("notification")).getNotificationChannels().iterator();
        while (it.hasNext()) {
            afxVar.add(bd$$ExternalSyntheticApiModelOutline1.m(it.next()).getId());
        }
        aidc aidcVar = potVar.o.o;
        if (aidcVar == null) {
            aidcVar = aidc.a;
        }
        String str = aidcVar.b;
        if (!TextUtils.isEmpty(str) && afxVar.contains(str)) {
            return str;
        }
        String str2 = this.c.c.j;
        if (!TextUtils.isEmpty(str2) && afxVar.contains(str2)) {
            return str2;
        }
        ((agsj) ((agsj) a.b()).k("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationChannelHelperImpl", "getChannelIdAndroidOOrLater", 182, "NotificationChannelHelperImpl.java")).E("Did not find the intended channel '%s' or the default channel '%s' in '%s'", str, str2, afxVar);
        return null;
    }

    @Override // defpackage.pgy
    public final List b() {
        Object obj;
        if (!a.aK()) {
            return Arrays.asList(new pgx[0]);
        }
        NotificationManager notificationManager = (NotificationManager) this.b.getSystemService("notification");
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = notificationManager.getNotificationChannelGroups().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup notificationChannelGroupM = gp$$ExternalSyntheticApiModelOutline2.m(it.next());
                pgw pgwVar = new pgw();
                pgwVar.a(false);
                String id = notificationChannelGroupM.getId();
                if (id == null) {
                    throw new NullPointerException("Null id");
                }
                pgwVar.c = id;
                pgwVar.a(notificationChannelGroupM.isBlocked());
                if (pgwVar.b != 1 || (obj = pgwVar.c) == null) {
                    StringBuilder sb = new StringBuilder();
                    if (pgwVar.c == null) {
                        sb.append(" id");
                    }
                    if (pgwVar.b == 0) {
                        sb.append(" blocked");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                arrayList.add(new pgx((String) obj, pgwVar.a));
            }
            return arrayList;
        } catch (RuntimeException e) {
            ((agsj) ((agsj) ((agsj) a.c()).j(e)).k("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationChannelHelperImpl", "getNotificationChannelGroupsAndroidPOrLater", 138, "NotificationChannelHelperImpl.java")).t("Failed getting notification channel groups");
            return arrayList;
        }
    }

    @Override // defpackage.pgy
    public final List c() {
        pgu pguVar;
        Object obj;
        Object obj2;
        Object obj3;
        NotificationManager notificationManager = (NotificationManager) this.b.getSystemService("notification");
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = notificationManager.getNotificationChannels().iterator();
            while (it.hasNext()) {
                NotificationChannel notificationChannelM = bd$$ExternalSyntheticApiModelOutline1.m(it.next());
                adyp adypVar = new adyp();
                adypVar.j("");
                String id = notificationChannelM.getId();
                if (id == null) {
                    throw new NullPointerException("Null id");
                }
                adypVar.c = id;
                int importance = notificationChannelM.getImportance();
                if (importance == 0) {
                    pguVar = pgu.g;
                } else if (importance == 1) {
                    pguVar = pgu.e;
                } else if (importance == 2) {
                    pguVar = pgu.d;
                } else if (importance == 3) {
                    pguVar = pgu.b;
                } else if (importance != 4) {
                    pguVar = importance != 5 ? pgu.a : pgu.f;
                } else {
                    pguVar = pgu.c;
                }
                adypVar.d = pguVar;
                adypVar.a = notificationChannelM.canShowBadge();
                adypVar.b = (byte) 1;
                if (!TextUtils.isEmpty(notificationChannelM.getGroup())) {
                    adypVar.j(notificationChannelM.getGroup());
                }
                if (adypVar.b != 1 || (obj = adypVar.c) == null || (obj2 = adypVar.e) == null || (obj3 = adypVar.d) == null) {
                    StringBuilder sb = new StringBuilder();
                    if (adypVar.c == null) {
                        sb.append(" id");
                    }
                    if (adypVar.e == null) {
                        sb.append(" group");
                    }
                    if (adypVar.d == null) {
                        sb.append(" importance");
                    }
                    if (adypVar.b == 0) {
                        sb.append(" canShowBadge");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                arrayList.add(new pgv((String) obj, (String) obj2, (pgu) obj3, adypVar.a));
            }
        } catch (Exception e) {
            ((agsj) ((agsj) ((agsj) a.b()).j(e)).k("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationChannelHelperImpl", "getNotificationChannelsAndroidOOrLater", 91, "NotificationChannelHelperImpl.java")).t("Failed to get notification channels from Android.");
        }
        return arrayList;
    }

    @Override // defpackage.pgy
    public final void d(atr atrVar, pot potVar) {
        String strA = a(potVar);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        atrVar.E = strA;
    }

    @Override // defpackage.pgy
    public final boolean e(String str) {
        NotificationChannel notificationChannel;
        Context context = this.b;
        if (qnl.ab(context)) {
            return (TextUtils.isEmpty(str) || (notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str)) == null || notificationChannel.getImportance() <= 0) ? false : true;
        }
        return true;
    }
}

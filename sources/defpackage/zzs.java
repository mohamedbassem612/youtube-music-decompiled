package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zzs {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/notification/NotificationProcessingController");
    public final agev a;
    private final Context c;
    private final agev d;
    private final Executor e;
    private final awmd f;
    private final vyo g;
    private final xgn h;
    private final aaak i;
    private final agev j;
    private final aaci k;
    private final aeiy l;
    private final elr m;

    public zzs(Context context, agev agevVar, aaci aaciVar, elr elrVar, aeiy aeiyVar, Executor executor, agev agevVar2, awmd awmdVar, vyo vyoVar, xgn xgnVar, aaak aaakVar, agev agevVar3) {
        this.c = context;
        this.d = agevVar;
        this.k = aaciVar;
        this.m = elrVar;
        this.l = aeiyVar;
        this.e = executor;
        this.a = agevVar2;
        this.f = awmdVar;
        this.g = vyoVar;
        this.h = xgnVar;
        this.i = aaakVar;
        this.j = agevVar3;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    private static MessageLite b(aiix aiixVar, byte[] bArr) {
        try {
            return aiixVar.h(bArr, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused) {
            return null;
        }
    }

    private final void c(List list) {
        if (list != null) {
            this.e.execute(afwl.i(new zgc(this, list, 16)));
        }
    }

    private static boolean d(Class cls, String str) {
        return cls.getName().equals(str);
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9, types: [aduv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r11v11, types: [aduv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, qbn] */
    /* JADX WARN: Type inference failed for: r13v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.Set] */
    public final void a(byte[] bArr, String str) {
        amfn amfnVar;
        boolean z;
        aocc aoccVar;
        boolean z2;
        xsc xscVar = null;
        if (!d(ajda.class, str)) {
            if (d(ajjf.class, str)) {
                ajjf ajjfVar = ajjf.a;
                ajjf ajjfVar2 = (ajjf) b(aihn.getParserForClass(ajjf.class), bArr);
                if (ajjfVar2 != null) {
                    c(ajjfVar2.b);
                    return;
                }
                return;
            }
            if (!d(amfo.class, str)) {
                ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/notification/NotificationProcessingController", "onHandleIntent", 105, "NotificationProcessingController.java")).t("Unknown renderer type.");
                return;
            }
            try {
                amfo amfoVar = (amfo) aihn.parseFrom(amfo.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
                if ((amfoVar.b & 1) != 0) {
                    aaci aaciVar = this.k;
                    amfm amfmVar = amfoVar.c;
                    if (amfmVar == null) {
                        amfmVar = amfm.a;
                    }
                    amfl amflVar = amfmVar.c;
                    if (amflVar == null) {
                        amflVar = amfl.a;
                    }
                    String str2 = amflVar.e;
                    amfm amfmVar2 = amfoVar.c;
                    if (((amfmVar2 == null ? amfm.a : amfmVar2).b & 2) != 0) {
                        if (amfmVar2 == null) {
                            amfmVar2 = amfm.a;
                        }
                        amfn amfnVar2 = amfmVar2.d;
                        if (amfnVar2 == null) {
                            amfnVar2 = amfn.a;
                        }
                        amfnVar = amfnVar2;
                    } else {
                        amfnVar = null;
                    }
                    if (a.x()) {
                        aaciVar.c(str2, amfnVar);
                        return;
                    } else {
                        aaciVar.d.execute(new yag((Object) aaciVar, (Object) str2, (Object) amfnVar, 15, (char[]) null));
                        return;
                    }
                }
                return;
            } catch (aiik unused) {
                return;
            }
        }
        ajda ajdaVar = ajda.a;
        ajda ajdaVar2 = (ajda) b(aihn.getParserForClass(ajda.class), bArr);
        aaak aaakVar = this.i;
        aaakVar.a(14, ajdaVar2);
        boolean z3 = (ajdaVar2 == null || ajdaVar2.m.size() == 0) ? false : true;
        char c = 4;
        if (z3) {
            c(ajdaVar2.m);
            aaakVar.a(4, ajdaVar2);
        }
        if (!aagu.l(ajdaVar2) && !aagu.m(ajdaVar2, ((agfa) this.d).a)) {
            if (z3) {
                return;
            }
            this.i.a(13, ajdaVar2);
            return;
        }
        aaakVar.a(8, ajdaVar2);
        xgn xgnVar = this.h;
        if (xgnVar != null && (ajdaVar2.b & 16384) != 0) {
            xgnVar.b(xhb.a(28631), null, null);
            amud amudVar = ajdaVar2.u;
            if (amudVar == null) {
                amudVar = amud.b;
            }
            xgnVar.d(new xgj(amudVar.d, (amud) null));
        }
        elr elrVar = this.m;
        aeiy aeiyVar = this.l;
        Iterator it = elrVar.a.iterator();
        while (true) {
            if (it.hasNext()) {
                aaaw aaawVar = (aaaw) ((WeakReference) it.next()).get();
                if (aaawVar == null) {
                    it.remove();
                } else if (aaawVar.a()) {
                }
            } else if (aagu.l(ajdaVar2) || aagu.m(ajdaVar2, ((agfa) aeiyVar.b).a)) {
                ajcu ajcuVar = ajdaVar2.e;
                if (ajcuVar == null) {
                    ajcuVar = ajcu.a;
                }
                String str3 = ajcuVar.c;
                ajcu ajcuVar2 = ajdaVar2.e;
                if (ajcuVar2 == null) {
                    ajcuVar2 = ajcu.a;
                }
                aabr aabrVar = new aabr(str3, ajcuVar2.d, tym.l());
                Object obj = aeiyVar.a;
                atr atrVar = new atr((Context) obj, null);
                z = true;
                if (((vxz) aeiyVar.c).l(9, 45530965L, false)) {
                    ((aabb) aeiyVar.h).a(ajdaVar2, xgnVar, aabrVar, atrVar);
                    Iterator it2 = aeiyVar.e.iterator();
                    while (it2.hasNext()) {
                        ((aabo) it2.next()).a(ajdaVar2, xgnVar, aabrVar, atrVar);
                    }
                } else {
                    Iterator it3 = aeiyVar.d.iterator();
                    while (it3.hasNext()) {
                        ((aabo) it3.next()).a(ajdaVar2, xgnVar, aabrVar, atrVar);
                    }
                }
                String str4 = aabrVar.c;
                if (!TextUtils.isEmpty(str4)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("client_id", str4);
                    atrVar.h(bundle);
                }
                aaok aaokVar = new aaok(atrVar.a(), aabrVar, (awmd) aeiyVar.f, (vyo) aeiyVar.g);
                agjz agjzVar = new agjz(4);
                amud amudVar2 = ajdaVar2.u;
                if (amudVar2 == null) {
                    amudVar2 = amud.b;
                }
                agjzVar.h(amudVar2);
                ajdd ajddVarJ = aagu.j(ajdaVar2);
                if (ajddVarJ != null) {
                    for (apji apjiVar : ajddVarJ.d) {
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajdc.b);
                        apjiVar.c(aihlVarCheckIsLite);
                        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                        ajdc ajdcVar = (ajdc) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                        if ((ajdcVar.c & 8) != 0) {
                            amud amudVar3 = ajdcVar.g;
                            if (amudVar3 == null) {
                                amudVar3 = amud.b;
                            }
                            agjzVar.h(amudVar3);
                        }
                    }
                }
                xscVar = new xsc(obj, (Object) aaokVar, (Object) agjzVar.g(), (byte[]) null);
                break;
            }
            z = true;
            break;
        }
        if (xscVar == null) {
            this.i.a(9, ajdaVar2);
            ((agrc) ((agrc) b.c()).k("com/google/android/libraries/youtube/notification/NotificationProcessingController", "postNotification", 223, "NotificationProcessingController.java")).t("System notification suppressed or failed to build.");
            return;
        }
        if ((ajdaVar2.b & SemanticState.Multiline) != 0) {
            aoccVar = ajdaVar2.t;
            if (aoccVar == null) {
                aoccVar = aocc.a;
            }
        } else {
            aoccVar = null;
        }
        Object obj2 = xscVar.c;
        NotificationManager notificationManager = (NotificationManager) ((Context) xscVar.b).getSystemService("notification");
        try {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            int length = activeNotifications.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = false;
                    break;
                }
                StatusBarNotification statusBarNotification = activeNotifications[i];
                Object obj3 = ((aaok) obj2).b;
                char c2 = c;
                try {
                    if (((aabr) obj3).a.equals(statusBarNotification.getTag()) && ((aabr) obj3).b == statusBarNotification.getId()) {
                        z2 = z;
                        break;
                    } else {
                        i++;
                        c = c2;
                    }
                } catch (RuntimeException e) {
                    e = e;
                    zvp.a(zvn.a, zvm.h, e.getMessage());
                }
            }
            Object obj4 = ((aaok) obj2).b;
            notificationManager.notify(((aabr) obj4).a, ((aabr) obj4).b, (Notification) ((aaok) obj2).c);
            if (z2) {
                aaal.e(((aaok) obj2).d, "REPLACED", (vyo) ((aaok) obj2).a);
            }
            aaal.e(((aaok) obj2).d, "POSTED", (vyo) ((aaok) obj2).a);
        } catch (RuntimeException e2) {
            e = e2;
        }
        if (aaakVar != null) {
            aaakVar.b(10, aoccVar);
        }
        if (xgnVar != null) {
            ?? r0 = xscVar.a;
            for (int i2 = 0; i2 < ((agpi) r0).d; i2++) {
                amud amudVar4 = (amud) r0.get(i2);
                if ((amudVar4.c & 1) != 0) {
                    xgj xgjVar = new xgj(amudVar4.d, (amud) null);
                    aihf aihfVarCreateBuilder = amdm.a.createBuilder();
                    aaok aaokVar2 = (aaok) xscVar.c;
                    if (aaokVar2.a().isPresent()) {
                        boolean zBooleanValue = ((Boolean) aaokVar2.a().get()).booleanValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        amdm amdmVar = (amdm) aihfVarCreateBuilder.instance;
                        amdmVar.b |= 4;
                        amdmVar.c = zBooleanValue;
                    }
                    aihf aihfVarCreateBuilder2 = amdd.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    amdd amddVar = (amdd) aihfVarCreateBuilder2.instance;
                    amdm amdmVar2 = (amdm) aihfVarCreateBuilder.build();
                    amdmVar2.getClass();
                    amddVar.B = amdmVar2;
                    amddVar.d |= 262144;
                    xgnVar.w(xgjVar, (amdd) aihfVarCreateBuilder2.build());
                }
            }
        }
        if ((ajdaVar2.b & 32) != 0) {
            Object obj5 = xscVar.c;
            agev agevVar = this.a;
            Optional optionalA = ((aaok) obj5).a();
            ajwo ajwoVar = ajdaVar2.j;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            ((agfa) agevVar).a.c(ajwoVar, optionalA.isPresent() ? agkj.j("ALL_IMAGES_LOADED", optionalA.get()) : null);
        }
        int i3 = ajdaVar2.r;
        if (i3 > 0) {
            Context context = this.c;
            xgn xgnVar2 = this.h;
            awmd awmdVar = this.f;
            vyo vyoVar = this.g;
            elr elrVar2 = (elr) ((agfa) this.j).a;
            NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
            StatusBarNotification[] statusBarNotificationArrY = yno.Y(context);
            int length2 = statusBarNotificationArrY.length - i3;
            if (length2 > 0) {
                Arrays.sort(statusBarNotificationArrY, new rit(9));
                for (int i4 = 0; i4 < length2; i4++) {
                    StatusBarNotification statusBarNotification2 = statusBarNotificationArrY[i4];
                    if (!elrVar2.a.d(statusBarNotification2)) {
                        yno.W(xgnVar2, statusBarNotification2.getNotification());
                        notificationManager2.cancel(statusBarNotification2.getTag(), statusBarNotification2.getId());
                    }
                    aaal.e(awmdVar, "CAPPED", vyoVar);
                }
            }
        }
        c(ajdaVar2.l);
    }
}

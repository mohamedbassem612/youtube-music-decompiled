package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.mdx.mediaroute.service.RemotePlaybackControlsService;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abrt implements acdp {
    public final acdo a;
    public final abrx b;
    public String c;
    public volatile List d;
    public xxj e;
    public xxj f;
    private final abmt g;
    private final Context h;
    private final abrs i;
    private final abrs j;
    private final IntentFilter k;
    private final IntentFilter l;
    private final abrp m;
    private final acdq n;
    private final abrv o;
    private final mbc p;
    private final Handler q;
    private final Runnable r;
    private boolean s;
    private volatile boolean t;
    private final List u;
    private final Map v;
    private long w;
    private boolean x;
    private final aboi y;
    private final abxv z;

    public abrt(Context context, acdq acdqVar, abxv abxvVar, acdo acdoVar, aboi aboiVar, abrp abrpVar, abrv abrvVar, mbc mbcVar, abrx abrxVar, List list, abmt abmtVar) {
        this.s = false;
        context.getClass();
        this.h = context;
        abrpVar.getClass();
        this.m = abrpVar;
        acdqVar.getClass();
        this.n = acdqVar;
        acdoVar.getClass();
        this.a = acdoVar;
        aboiVar.getClass();
        this.y = aboiVar;
        this.o = abrvVar;
        mbcVar.getClass();
        this.p = mbcVar;
        this.b = abrxVar;
        this.q = new Handler(Looper.getMainLooper());
        this.u = list;
        this.d = list;
        this.g = abmtVar;
        this.r = new abaq(abmtVar, abrpVar, 20);
        this.i = new abrs(this);
        this.j = new abrs(this);
        this.v = new HashMap();
        IntentFilter intentFilter = new IntentFilter();
        this.k = intentFilter;
        IntentFilter intentFilter2 = new IntentFilter();
        this.l = intentFilter2;
        intentFilter2.addAction("android.intent.action.MAIN");
        intentFilter.addAction("com.google.android.libraries.youtube.player.action.controller_notification_delete");
        intentFilter.addAction("noop");
        intentFilter.addAction("SEEK_BACK_NOTIFICATION_ACTION_PLUGIN");
        intentFilter.addAction("SEEK_FORWARD_NOTIFICATION_ACTION_PLUGIN");
        f(list);
        this.z = true != abmtVar.K() ? null : abxvVar;
    }

    private static void j(IntentFilter intentFilter, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((abrn) it.next()).e().iterator();
            while (it2.hasNext()) {
                intentFilter.addAction((String) it2.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0095 A[Catch: all -> 0x0234, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:8:0x001e, B:10:0x0035, B:43:0x0149, B:44:0x0151, B:46:0x0157, B:48:0x0165, B:50:0x016b, B:51:0x0189, B:53:0x018f, B:54:0x01ae, B:56:0x01bb, B:57:0x01ca, B:59:0x01d2, B:61:0x01dd, B:63:0x01f6, B:64:0x021f, B:60:0x01d8, B:13:0x0052, B:15:0x0095, B:17:0x00d5, B:19:0x00ec, B:21:0x00f2, B:22:0x00fa, B:24:0x0100, B:25:0x0103, B:27:0x0113, B:29:0x011a, B:31:0x0120, B:32:0x0127, B:34:0x0136, B:42:0x0146, B:28:0x0116, B:18:0x00d8), top: B:71:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x00d5 A[Catch: all -> 0x0234, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:8:0x001e, B:10:0x0035, B:43:0x0149, B:44:0x0151, B:46:0x0157, B:48:0x0165, B:50:0x016b, B:51:0x0189, B:53:0x018f, B:54:0x01ae, B:56:0x01bb, B:57:0x01ca, B:59:0x01d2, B:61:0x01dd, B:63:0x01f6, B:64:0x021f, B:60:0x01d8, B:13:0x0052, B:15:0x0095, B:17:0x00d5, B:19:0x00ec, B:21:0x00f2, B:22:0x00fa, B:24:0x0100, B:25:0x0103, B:27:0x0113, B:29:0x011a, B:31:0x0120, B:32:0x0127, B:34:0x0136, B:42:0x0146, B:28:0x0116, B:18:0x00d8), top: B:71:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00d8 A[Catch: all -> 0x0234, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:8:0x001e, B:10:0x0035, B:43:0x0149, B:44:0x0151, B:46:0x0157, B:48:0x0165, B:50:0x016b, B:51:0x0189, B:53:0x018f, B:54:0x01ae, B:56:0x01bb, B:57:0x01ca, B:59:0x01d2, B:61:0x01dd, B:63:0x01f6, B:64:0x021f, B:60:0x01d8, B:13:0x0052, B:15:0x0095, B:17:0x00d5, B:19:0x00ec, B:21:0x00f2, B:22:0x00fa, B:24:0x0100, B:25:0x0103, B:27:0x0113, B:29:0x011a, B:31:0x0120, B:32:0x0127, B:34:0x0136, B:42:0x0146, B:28:0x0116, B:18:0x00d8), top: B:71:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x00f2 A[Catch: all -> 0x0234, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:8:0x001e, B:10:0x0035, B:43:0x0149, B:44:0x0151, B:46:0x0157, B:48:0x0165, B:50:0x016b, B:51:0x0189, B:53:0x018f, B:54:0x01ae, B:56:0x01bb, B:57:0x01ca, B:59:0x01d2, B:61:0x01dd, B:63:0x01f6, B:64:0x021f, B:60:0x01d8, B:13:0x0052, B:15:0x0095, B:17:0x00d5, B:19:0x00ec, B:21:0x00f2, B:22:0x00fa, B:24:0x0100, B:25:0x0103, B:27:0x0113, B:29:0x011a, B:31:0x0120, B:32:0x0127, B:34:0x0136, B:42:0x0146, B:28:0x0116, B:18:0x00d8), top: B:71:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0100 A[Catch: all -> 0x0234, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:8:0x001e, B:10:0x0035, B:43:0x0149, B:44:0x0151, B:46:0x0157, B:48:0x0165, B:50:0x016b, B:51:0x0189, B:53:0x018f, B:54:0x01ae, B:56:0x01bb, B:57:0x01ca, B:59:0x01d2, B:61:0x01dd, B:63:0x01f6, B:64:0x021f, B:60:0x01d8, B:13:0x0052, B:15:0x0095, B:17:0x00d5, B:19:0x00ec, B:21:0x00f2, B:22:0x00fa, B:24:0x0100, B:25:0x0103, B:27:0x0113, B:29:0x011a, B:31:0x0120, B:32:0x0127, B:34:0x0136, B:42:0x0146, B:28:0x0116, B:18:0x00d8), top: B:71:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0113 A[Catch: all -> 0x0234, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:8:0x001e, B:10:0x0035, B:43:0x0149, B:44:0x0151, B:46:0x0157, B:48:0x0165, B:50:0x016b, B:51:0x0189, B:53:0x018f, B:54:0x01ae, B:56:0x01bb, B:57:0x01ca, B:59:0x01d2, B:61:0x01dd, B:63:0x01f6, B:64:0x021f, B:60:0x01d8, B:13:0x0052, B:15:0x0095, B:17:0x00d5, B:19:0x00ec, B:21:0x00f2, B:22:0x00fa, B:24:0x0100, B:25:0x0103, B:27:0x0113, B:29:0x011a, B:31:0x0120, B:32:0x0127, B:34:0x0136, B:42:0x0146, B:28:0x0116, B:18:0x00d8), top: B:71:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0116 A[Catch: all -> 0x0234, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:8:0x001e, B:10:0x0035, B:43:0x0149, B:44:0x0151, B:46:0x0157, B:48:0x0165, B:50:0x016b, B:51:0x0189, B:53:0x018f, B:54:0x01ae, B:56:0x01bb, B:57:0x01ca, B:59:0x01d2, B:61:0x01dd, B:63:0x01f6, B:64:0x021f, B:60:0x01d8, B:13:0x0052, B:15:0x0095, B:17:0x00d5, B:19:0x00ec, B:21:0x00f2, B:22:0x00fa, B:24:0x0100, B:25:0x0103, B:27:0x0113, B:29:0x011a, B:31:0x0120, B:32:0x0127, B:34:0x0136, B:42:0x0146, B:28:0x0116, B:18:0x00d8), top: B:71:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0120 A[Catch: all -> 0x0234, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:8:0x001e, B:10:0x0035, B:43:0x0149, B:44:0x0151, B:46:0x0157, B:48:0x0165, B:50:0x016b, B:51:0x0189, B:53:0x018f, B:54:0x01ae, B:56:0x01bb, B:57:0x01ca, B:59:0x01d2, B:61:0x01dd, B:63:0x01f6, B:64:0x021f, B:60:0x01d8, B:13:0x0052, B:15:0x0095, B:17:0x00d5, B:19:0x00ec, B:21:0x00f2, B:22:0x00fa, B:24:0x0100, B:25:0x0103, B:27:0x0113, B:29:0x011a, B:31:0x0120, B:32:0x0127, B:34:0x0136, B:42:0x0146, B:28:0x0116, B:18:0x00d8), top: B:71:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0136 A[Catch: all -> 0x0234, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:8:0x001e, B:10:0x0035, B:43:0x0149, B:44:0x0151, B:46:0x0157, B:48:0x0165, B:50:0x016b, B:51:0x0189, B:53:0x018f, B:54:0x01ae, B:56:0x01bb, B:57:0x01ca, B:59:0x01d2, B:61:0x01dd, B:63:0x01f6, B:64:0x021f, B:60:0x01d8, B:13:0x0052, B:15:0x0095, B:17:0x00d5, B:19:0x00ec, B:21:0x00f2, B:22:0x00fa, B:24:0x0100, B:25:0x0103, B:27:0x0113, B:29:0x011a, B:31:0x0120, B:32:0x0127, B:34:0x0136, B:42:0x0146, B:28:0x0116, B:18:0x00d8), top: B:71:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0145  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final synchronized void k(boolean z) {
        Context context;
        atr atrVar;
        acdq acdqVar;
        Intent intent;
        agev agevVarH;
        Bitmap bitmapQ;
        int iB;
        boolean z2;
        abrx abrxVar = this.b;
        abrxVar.c();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            abrxVar.a((abrn) it.next());
        }
        abrp abrpVar = this.m;
        abrv abrvVar = this.o;
        String str = this.c;
        xxj xxjVar = this.e;
        Map map = this.v;
        List<abrn> list = this.d;
        ArrayList arrayList = new ArrayList();
        if (xxjVar != null) {
            Object obj = xxjVar.a;
            xzu xzuVar = ((yat) ((ycp) ((RemotePlaybackControlsService) obj).i.io()).g.io()).d;
            if (xzuVar.a != 1) {
                atrVar = null;
            } else {
                String string = ((RemotePlaybackControlsService) obj).getString(R.string.mdx_connection_lost);
                Spanned spannedFromHtml = Html.fromHtml(((RemotePlaybackControlsService) obj).getString(R.string.searching_for_screen, new Object[]{xzuVar.b}));
                atrVar = new atr((Context) obj, null);
                atrVar.l(string);
                atrVar.t(string);
                atrVar.k(spannedFromHtml);
                atrVar.s(null);
                atrVar.q(((RemotePlaybackControlsService) obj).j.e);
                atrVar.l = 2;
                atrVar.E = "generic_notifications";
            }
            if (atrVar == null) {
                context = abrvVar.b;
                atrVar = new atr(context, null);
                acdqVar = abrvVar.a;
                atrVar.l(acdqVar.u());
                atrVar.t(acdqVar.u());
                atrVar.k(acdqVar.t());
                atrVar.q(abrvVar.d);
                atrVar.l = 2;
                atrVar.m = false;
                atrVar.A = 1;
                atrVar.n(abrvVar.a("com.google.android.libraries.youtube.player.action.controller_notification_delete"));
                atrVar.t = "PlaybackNotificationsGroup";
                intent = (Intent) abrvVar.c.io();
                if (intent == null) {
                    agevVarH = agdf.a;
                } else {
                    Intent intent2 = new Intent(intent);
                    intent2.putExtra("playback_notification_click_extra", true);
                    agevVarH = agev.h(qof.b(context, 0, intent2, 201326592));
                }
                if (agevVarH.g()) {
                    atrVar.h = (PendingIntent) agevVarH.c();
                }
                bitmapQ = acdqVar.q();
                if (bitmapQ != null) {
                    atrVar.o(bitmapQ);
                }
                if (((NotificationManager) context.getSystemService("notification")).getNotificationChannel("7") != null) {
                    atrVar.E = "7";
                } else {
                    atrVar.E = "generic_notifications";
                }
                if (!TextUtils.isEmpty(str)) {
                    atrVar.s(Html.fromHtml(str));
                }
                if (abrvVar.g.g.l(439, 45800863L, false)) {
                    iB = acdqVar.b();
                    if (iB != 2 || iB == 5 || iB == 9) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    atrVar.e(2, z2);
                }
            }
        } else {
            context = abrvVar.b;
            atrVar = new atr(context, null);
            acdqVar = abrvVar.a;
            atrVar.l(acdqVar.u());
            atrVar.t(acdqVar.u());
            atrVar.k(acdqVar.t());
            atrVar.q(abrvVar.d);
            atrVar.l = 2;
            atrVar.m = false;
            atrVar.A = 1;
            atrVar.n(abrvVar.a("com.google.android.libraries.youtube.player.action.controller_notification_delete"));
            atrVar.t = "PlaybackNotificationsGroup";
            intent = (Intent) abrvVar.c.io();
            if (intent == null) {
                agevVarH = agdf.a;
            } else {
                Intent intent3 = new Intent(intent);
                intent3.putExtra("playback_notification_click_extra", true);
                agevVarH = agev.h(qof.b(context, 0, intent3, 201326592));
            }
            if (agevVarH.g()) {
                atrVar.h = (PendingIntent) agevVarH.c();
            }
            bitmapQ = acdqVar.q();
            if (bitmapQ != null) {
                atrVar.o(bitmapQ);
            }
            if (((NotificationManager) context.getSystemService("notification")).getNotificationChannel("7") != null) {
                atrVar.E = "7";
            } else {
                atrVar.E = "generic_notifications";
            }
            if (!TextUtils.isEmpty(str)) {
                atrVar.s(Html.fromHtml(str));
            }
            if (abrvVar.g.g.l(439, 45800863L, false)) {
                iB = acdqVar.b();
                if (iB != 2) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                atrVar.e(2, z2);
            }
        }
        atr atrVar2 = atrVar;
        atrVar2.p(0, 0, true);
        for (abrn abrnVar : list) {
            abrn abrnVar2 = (abrn) map.get(abrnVar);
            if (abrnVar2 != null) {
                if (abrnVar2.j()) {
                    abrvVar.b(atrVar2, abrnVar2.a(), abrnVar2.b(), abrvVar.a(abrnVar2.d()), arrayList, abrnVar2.k());
                }
            } else if (abrnVar.j()) {
                abrvVar.b(atrVar2, abrnVar.a(), abrnVar.b(), abrvVar.a(abrnVar.d()), arrayList, abrnVar.k());
            }
        }
        int iMin = Math.min(arrayList.size(), 3);
        int[] iArr = new int[iMin];
        for (int i = 0; i < iMin; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        abrr abrrVar = abrvVar.f;
        brl brkVar = abrrVar.d() ? new brk() : new brl();
        brkVar.a = iArr;
        brkVar.b = ((fg) abrvVar.e.io()).c();
        atrVar2.r(brkVar);
        if (abrrVar.d()) {
            RemoteViews remoteViews = new RemoteViews(abrvVar.b.getPackageName(), abrrVar.a());
            int iC = abrrVar.c();
            acdq acdqVar2 = abrvVar.a;
            remoteViews.setTextViewText(iC, acdqVar2.u());
            remoteViews.setTextViewText(abrrVar.b(), acdqVar2.t());
            atrVar2.C = remoteViews;
        }
        abrpVar.i(atrVar2.a(), z);
        this.w = this.p.b();
    }

    private final void l() {
        if (!this.t) {
            this.t = true;
            Context context = this.h;
            avg.f(context, this.i, this.k, null, 4);
            avg.f(context, this.j, this.l, null, 2);
        }
        abxv abxvVar = this.z;
        if (abxvVar != null) {
            ((CopyOnWriteArraySet) abxvVar.c).add(this);
        } else {
            this.n.w(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    public final synchronized void a() {
        boolean z;
        l();
        abxv abxvVar = this.z;
        if (abxvVar == null || !this.g.w()) {
            z = false;
        } else {
            Object obj = abxvVar.a;
            if (((acdv) obj).f() ? ((acdv) obj).e() : ((acdv) abxvVar.d).e()) {
                z = true;
            } else {
                z = false;
            }
        }
        abmw abmwVar = abmw.MEDIASESSION;
        if (z) {
            c(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x0014, B:13:0x0019, B:15:0x0023, B:17:0x002c, B:20:0x003c, B:22:0x0045, B:24:0x0054, B:28:0x005e, B:32:0x0066), top: B:39:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0019 A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x0014, B:13:0x0019, B:15:0x0023, B:17:0x002c, B:20:0x003c, B:22:0x0045, B:24:0x0054, B:28:0x005e, B:32:0x0066), top: B:39:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0045 A[Catch: all -> 0x007c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x0014, B:13:0x0019, B:15:0x0023, B:17:0x002c, B:20:0x003c, B:22:0x0045, B:24:0x0054, B:28:0x005e, B:32:0x0066), top: B:39:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:8:0x000b A[Catch: all -> 0x007c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x0014, B:13:0x0019, B:15:0x0023, B:17:0x002c, B:20:0x003c, B:22:0x0045, B:24:0x0054, B:28:0x005e, B:32:0x0066), top: B:39:0x0003 }] */
    public final synchronized void c(boolean z) {
        long jB;
        int i;
        long j;
        if (z) {
            jB = this.p.b();
            if (z) {
                k(true);
                return;
            }
            i = 16;
            if (!txz.g(this.h)) {
            }
            j = this.w + 200;
            if (jB <= j) {
                if (this.g.e.m(184, 45618141L)) {
                }
                e();
            } else {
                long jMax = Math.max(0L, j - jB);
                abmw abmwVar = abmw.MEDIASESSION;
                this.q.postDelayed(new abbj(this, i), jMax);
                this.x = true;
                return;
            }
        }
        if (this.t && !this.x) {
            jB = this.p.b();
            if (z) {
                k(true);
                return;
            }
            i = 16;
            if (!txz.g(this.h) && this.n.b() != 2) {
                this.q.postDelayed(new abbj(this, i), 1500L);
                this.x = true;
                return;
            }
            j = this.w + 200;
            if (jB <= j) {
                long jMax2 = Math.max(0L, j - jB);
                abmw abmwVar2 = abmw.MEDIASESSION;
                this.q.postDelayed(new abbj(this, i), jMax2);
                this.x = true;
                return;
            }
            if (this.g.e.m(184, 45618141L) || this.n.b() != 0) {
                e();
            }
        }
    }

    public final synchronized void d(boolean z) {
        abmw abmwVar = abmw.MEDIASESSION;
        abxv abxvVar = this.z;
        if (abxvVar != null) {
            abxvVar.S(this);
        } else {
            this.n.y(this);
        }
        if (z) {
            this.m.a();
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((abrn) it.next()).g();
        }
        if (this.t) {
            this.t = false;
            Context context = this.h;
            context.unregisterReceiver(this.i);
            context.unregisterReceiver(this.j);
            this.b.e();
        }
        if (this.x) {
            this.q.removeCallbacks(new abbj(this, 16));
            this.x = false;
        }
    }

    public final synchronized void e() {
        boolean zK;
        int i;
        this.x = false;
        if (this.t) {
            xxj xxjVar = this.f;
            if (xxjVar != null) {
                ycp ycpVar = (ycp) ((RemotePlaybackControlsService) xxjVar.a).i.io();
                zK = ycpVar.j() || (i = ycpVar.b) == 0 || i == 1;
                abmw abmwVar = abmw.MEDIASESSION;
                aajg.k(this.n.b());
            } else {
                zK = this.y.k();
                abmw abmwVar2 = abmw.MEDIASESSION;
            }
            k(zK);
        }
    }

    public final void f(List list) {
        IntentFilter intentFilter = this.k;
        agke agkeVarN = agke.n(list);
        j(intentFilter, agkeVarN);
        List list2 = this.d;
        this.d = agkeVarN;
        List list3 = this.d;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((abrn) it.next()).l(null);
            }
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            ((abrn) it2.next()).l(this);
        }
    }

    @Deprecated
    public final void g(abrn abrnVar, abrn abrnVar2) {
        this.v.put(abrnVar, abrnVar2);
        j(this.k, agke.q(abrnVar2));
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        if ((i & 355) != 0) {
            abmw abmwVar = abmw.MEDIASESSION;
            acdq acdqVar = this.n;
            aajg.k(acdqVar.b());
            vxz vxzVar = this.g.g;
            if (vxzVar.l(195, 45684602L, false)) {
                if (acdqVar.b() == 2 || acdqVar.b() == 5 || acdqVar.b() == 9) {
                    if (this.s) {
                        this.q.removeCallbacks(this.r);
                        this.s = false;
                    }
                } else if (!this.s) {
                    this.q.postDelayed(this.r, Duration.ofMinutes(vxzVar.c(25, 45684617L, 20L)).toMillis());
                    this.s = true;
                }
            }
            c(false);
        }
    }

    public final synchronized void h() {
        i(false);
    }

    public final synchronized void i(boolean z) {
        abmw abmwVar = abmw.MEDIASESSION;
        l();
        c(z);
    }

    public abrt(Context context, acdq acdqVar, abxv abxvVar, acdo acdoVar, aboi aboiVar, abrp abrpVar, abrv abrvVar, mbc mbcVar, List list, abmt abmtVar) {
        this(context, acdqVar, abxvVar, acdoVar, aboiVar, abrpVar, abrvVar, mbcVar, new abrw(), list, abmtVar);
    }
}

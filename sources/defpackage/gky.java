package defpackage;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gky implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gky(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v23, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v35, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v86, types: [abji, java.lang.Object, tbj] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.$cid) {
            case 0:
                zpw zpwVar = (zpw) this.a;
                ((Application) zpwVar.n).getFilesDir();
                break;
            case 1:
                ((glb) this.a).h.io();
                break;
            case 2:
                Object obj = this.a;
                if (Build.VERSION.SDK_INT == 29) {
                    ite iteVar = (ite) ((dov) obj).a.io();
                    if (Build.VERSION.SDK_INT == 29) {
                        itd itdVar = (itd) iteVar.f.io();
                        ahex ahexVar = itdVar.c;
                        huo huoVar = new huo(itdVar, 8);
                        long j = afwl.a;
                        taf.g(ahno.as(ahexVar.submit(new ahcz(afty.c(false), huoVar, 1)), new isv(itdVar, 3), MoreExecutors.directExecutor()), new gpq(9));
                        ((syn) iteVar.e.io()).c("sideloaded_playlist_export_task_name", ite.b, ite.c, false, 0, true, null, null);
                    } else {
                        iteVar.a("sideloaded_playlist_export_task_name");
                    }
                } else if (Build.VERSION.SDK_INT == 30) {
                    ite iteVar2 = (ite) ((dov) obj).a.io();
                    if (Build.VERSION.SDK_INT == 30) {
                        iteVar2.a("sideloaded_playlist_export_task_name");
                        ((syn) iteVar2.e.io()).d("sideloaded_playlist_restore_task_name", 0L, 2, 0, false, null, ite.d, false);
                    } else {
                        iteVar2.a("sideloaded_playlist_restore_task_name");
                    }
                }
                break;
            case 3:
                ((vxp) ((zpw) this.a).h.io()).a();
                break;
            case 4:
                jnj jnjVar = (jnj) this.a;
                tqc tqcVar = new tqc((Context) jnjVar.d, (tqa) jnjVar.f.io(), (tbt) jnjVar.a.io());
                tqcVar.b = tqcVar.c.e();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
                intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
                intentFilter.addDataScheme("file");
                avg.f(tqcVar.a, tqcVar, intentFilter, null, 4);
                break;
            case 5:
                jnm jnmVar = (jnm) this.a;
                ((aabz) jnmVar.c.io()).f();
                ((axfd) jnmVar.b.io()).am(1);
                break;
            case 6:
                Context context = (Context) ((jnm) this.a).a;
                ((NotificationManager) context.getSystemService("notification")).deleteNotificationChannel("GenericNotifications");
                tym.aC(context, "generic_notifications", context.getString(R.string.default_notifications_channel), 2, false, true);
                tym.aB(context, new tph("7", R.string.playback_notification_channel_title, 2, false, false));
                agrx agrxVar = agso.a;
                tym.aB(context, new tph("8", R.string.account_updates_notification_channel_title, 4, true, true));
                tym.aB(context, new tph("5", R.string.recommended_notification_channel_title, 2, false, false));
                tym.aB(context, new tph("9", R.string.playlist_update_notification_channel_title, 2, false, false));
                tym.aB(context, new tph("3", R.string.comments_notification_channel, 4, true, false));
                tym.aB(context, new tph("10", R.string.connected_experiences_notification_channel_title, 4, true, true));
                break;
            case 7:
                ((icx) ((gli) this.a).w.io()).f();
                break;
            case 8:
                ((jnj) ((gli) this.a).p.io()).y();
                break;
            case 9:
                ((hzs) ((gli) this.a).q.io()).a();
                break;
            case 10:
                ((yen) ((gli) this.a).o.io()).h();
                break;
            case 11:
                grf grfVar = (grf) this.a;
                grfVar.W.c(new hak());
                grfVar.W.c(new hag());
                break;
            case 12:
                AppBarLayout appBarLayout = ((grf) this.a).A;
                if (appBarLayout != null) {
                    appBarLayout.l(true, false, true);
                }
                break;
            case 13:
                ((hqg) this.a).e(119);
                break;
            case 14:
                ((hqg) this.a).e(120);
                break;
            case 15:
                ((hqg) this.a).e(198);
                break;
            case 16:
                ((hqg) this.a).e(130);
                break;
            case 17:
                ((hqg) this.a).e(452);
                break;
            case 18:
                Object obj2 = this.a;
                abtu abtuVar = abtu.c;
                hwt hwtVar = (hwt) obj2;
                abvc abvcVar = hwtVar.a;
                if (aajg.g(abvcVar.q(abtuVar))) {
                    abvcVar.i(abtuVar);
                    hwtVar.g++;
                }
                break;
            case 19:
                Object obj3 = this.a;
                ibc ibcVar = (ibc) obj3;
                Runnable runnable = ibcVar.e;
                ibe ibeVar = ibcVar.f;
                ibeVar.removeCallbacks(runnable);
                ibd ibdVar = (ibd) obj3;
                if (ibdVar.b() != 0.0f) {
                    ibdVar.c();
                    ibeVar.postInvalidate();
                } else {
                    ibdVar.g();
                }
                break;
            default:
                ?? r11 = this.a;
                ict ictVar = (ict) r11;
                int i = ictVar.c;
                abjp abjpVar = ictVar.a;
                ictVar.d = abjpVar.d(i);
                ictVar.m();
                abjpVar.p(r11);
                ictVar.d.hK(r11);
                break;
        }
    }

    public gky(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}

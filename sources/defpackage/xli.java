package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xli extends BroadcastReceiver {
    final /* synthetic */ xlj a;

    public xli(xlj xljVar) {
        this.a = xljVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        xlj xljVar = this.a;
        xxj xxjVar = xljVar.g;
        if (xxjVar == null) {
            ((agrc) ((agrc) xlj.a.c().i(agso.a, "MDX.bgPlaybackNotifPres")).k("com/google/android/libraries/youtube/mdx/background/MdxBackgroundPlaybackStatusNotificationPresenter$MdxBackgroundPlaybackStatusNotificationBroadcastReceiver", "onReceive", 270, "MdxBackgroundPlaybackStatusNotificationPresenter.java")).t("no action listener set, ignoring action");
            return;
        }
        xgt xgtVar = (xgt) intent.getParcelableExtra("INTERACTION_SCREEN");
        String action = intent.getAction();
        agrx agrxVar = agso.a;
        switch (action.hashCode()) {
            case -670475291:
                if (action.equals("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.CANCEL")) {
                    xlh xlhVar = xljVar.e;
                    if (xgtVar != null) {
                        if (xlhVar.g.a() == null) {
                        }
                        xgn xgnVar = xlhVar.g;
                        xgnVar.C(xgtVar);
                        xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xlh.d), null);
                        xlc xlcVar = (xlc) xxjVar.a;
                        xlcVar.b();
                        xlcVar.m.c();
                        return;
                    }
                    xgtVar = null;
                    ((agrc) ((agrc) xlh.a.c().i(agrxVar, "MDX.bgPlaybackLogger")).k("com/google/android/libraries/youtube/mdx/background/MdxBackgroundPlaybackStatusInteractionLogger", "logCancelClick", 84, "MdxBackgroundPlaybackStatusInteractionLogger.java")).t("Interaction logging screen is not set");
                    xgn xgnVar2 = xlhVar.g;
                    xgnVar2.C(xgtVar);
                    xgnVar2.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xlh.d), null);
                    xlc xlcVar2 = (xlc) xxjVar.a;
                    xlcVar2.b();
                    xlcVar2.m.c();
                    return;
                }
                break;
            case 685086653:
                if (action.equals("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.RETRY")) {
                    xlh xlhVar2 = xljVar.e;
                    if (xgtVar != null) {
                        if (xlhVar2.g.a() == null) {
                        }
                        xgn xgnVar3 = xlhVar2.g;
                        xgnVar3.C(xgtVar);
                        xgnVar3.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xlh.e), null);
                        xlg xlgVar = xljVar.d;
                        xlgVar.getClass();
                        ((xlc) xxjVar.a).d(xlgVar, true);
                        return;
                    }
                    xgtVar = null;
                    ((agrc) ((agrc) xlh.a.c().i(agrxVar, "MDX.bgPlaybackLogger")).k("com/google/android/libraries/youtube/mdx/background/MdxBackgroundPlaybackStatusInteractionLogger", "logRetryClick", 114, "MdxBackgroundPlaybackStatusInteractionLogger.java")).t("Interaction logging screen is not set");
                    xgn xgnVar4 = xlhVar2.g;
                    xgnVar4.C(xgtVar);
                    xgnVar4.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xlh.e), null);
                    xlg xlgVar2 = xljVar.d;
                    xlgVar2.getClass();
                    ((xlc) xxjVar.a).d(xlgVar2, true);
                    return;
                }
                break;
            case 1446453054:
                if (action.equals("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.DISMISSED")) {
                    xlc xlcVar3 = (xlc) xxjVar.a;
                    xlcVar3.b();
                    xlcVar3.m.c();
                    xljVar.e();
                    return;
                }
                break;
            case 1545822060:
                if (action.equals("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.HELP")) {
                    xlh xlhVar3 = xljVar.e;
                    if (xgtVar != null) {
                        if (xlhVar3.g.a() == null) {
                        }
                        xgn xgnVar5 = xlhVar3.g;
                        xgnVar5.C(xgtVar);
                        xgnVar5.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xlh.f), null);
                        if (Build.VERSION.SDK_INT < 31) {
                            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                        }
                        xlc xlcVar4 = (xlc) xxjVar.a;
                        Intent intent2 = xlcVar4.f;
                        intent2.setFlags(268435456);
                        xlcVar4.b.startActivity(intent2);
                        return;
                    }
                    xgtVar = null;
                    ((agrc) ((agrc) xlh.a.c().i(agrxVar, "MDX.bgPlaybackLogger")).k("com/google/android/libraries/youtube/mdx/background/MdxBackgroundPlaybackStatusInteractionLogger", "logHelpClick", 99, "MdxBackgroundPlaybackStatusInteractionLogger.java")).t("Interaction logging screen is not set");
                    xgn xgnVar6 = xlhVar3.g;
                    xgnVar6.C(xgtVar);
                    xgnVar6.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xlh.f), null);
                    if (Build.VERSION.SDK_INT < 31) {
                        context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                    }
                    xlc xlcVar5 = (xlc) xxjVar.a;
                    Intent intent3 = xlcVar5.f;
                    intent3.setFlags(268435456);
                    xlcVar5.b.startActivity(intent3);
                    return;
                }
                break;
        }
        ((agrc) ((agrc) xlj.a.c().i(agrxVar, "MDX.bgPlaybackNotifPres")).k("com/google/android/libraries/youtube/mdx/background/MdxBackgroundPlaybackStatusNotificationPresenter$MdxBackgroundPlaybackStatusNotificationBroadcastReceiver", "onReceive", 299, "MdxBackgroundPlaybackStatusNotificationPresenter.java")).w("Unknown action:%s", action);
    }
}

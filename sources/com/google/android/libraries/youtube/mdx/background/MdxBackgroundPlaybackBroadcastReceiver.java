package com.google.android.libraries.youtube.mdx.background;

import android.content.Context;
import android.content.Intent;
import defpackage.a;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.agrx;
import defpackage.agso;
import defpackage.ahno;
import defpackage.ameb;
import defpackage.typ;
import defpackage.xgj;
import defpackage.xgn;
import defpackage.xgt;
import defpackage.xhb;
import defpackage.xlc;
import defpackage.xld;
import defpackage.xle;
import defpackage.xlf;
import defpackage.xyu;
import defpackage.xyv;
import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MdxBackgroundPlaybackBroadcastReceiver extends xld {
    private static final agrf e = agrf.h("com/google/android/libraries/youtube/mdx/background/MdxBackgroundPlaybackBroadcastReceiver");
    public xgn c;
    public xlc d;

    @Override // defpackage.xld, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((xle) CommonApis.j(context)).dV(this);
                    this.a = true;
                }
            }
        }
        String stringExtra = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.route_id");
        String stringExtra2 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.device_name");
        String stringExtra3 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.playlist_id");
        String stringExtra4 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.video_id");
        int intExtra = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.session_type", -1);
        if (ahno.aa(stringExtra) || ahno.aa(stringExtra2) || ((ahno.aa(stringExtra3) && ahno.aa(stringExtra4)) || intExtra == -1)) {
            ((agrc) ((agrc) e.c().i(agso.a, "MDX.MdxBackgroundPBR")).k("com/google/android/libraries/youtube/mdx/background/MdxBackgroundPlaybackBroadcastReceiver", "onReceive", 68, "MdxBackgroundPlaybackBroadcastReceiver.java")).t("playback request not valid, ignoring");
            return;
        }
        int intExtra2 = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.timeout", -1);
        xlf xlfVar = new xlf();
        xlfVar.c(1);
        xlfVar.b(0);
        if (stringExtra == null) {
            throw new NullPointerException("Null routeId");
        }
        int iBt = a.bt(intExtra);
        xlfVar.c = stringExtra;
        xlfVar.c(iBt);
        if (stringExtra2 == null) {
            throw new NullPointerException("Null deviceName");
        }
        xlfVar.d = stringExtra2;
        xyv xyvVar = xyv.a;
        xyu xyuVar = new xyu();
        xyuVar.f(typ.c(stringExtra3));
        xyuVar.n(typ.c(stringExtra4));
        xyuVar.c(intent.getLongExtra("com.google.android.libraries.youtube.mdx.background.video_position_ms", 0L));
        xyuVar.l(Integer.valueOf(intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.playlist_index", 0)));
        xlfVar.e = xyuVar.a();
        if (intExtra2 >= 0) {
            xlfVar.b(intExtra2);
        }
        agrx agrxVar = agso.a;
        this.d.d(xlfVar.a(), false);
        xgt xgtVar = (xgt) intent.getParcelableExtra("com.google.android.libraries.youtube.mdx.background.ve_screen");
        int intExtra3 = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.ve_type", 0);
        if (xgtVar == null || intExtra3 == 0) {
            return;
        }
        this.c.C(xgtVar);
        this.c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(intExtra3)), null);
    }
}

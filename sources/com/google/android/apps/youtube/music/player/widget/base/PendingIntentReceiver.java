package com.google.android.apps.youtube.music.player.widget.base;

import android.content.Context;
import android.content.Intent;
import defpackage.acdo;
import defpackage.agrx;
import defpackage.agso;
import defpackage.ahno;
import defpackage.aihf;
import defpackage.ainv;
import defpackage.ameb;
import defpackage.aunn;
import defpackage.avmb;
import defpackage.awmd;
import defpackage.hxe;
import defpackage.ido;
import defpackage.ied;
import defpackage.ihg;
import defpackage.ihi;
import defpackage.ihm;
import defpackage.ihs;
import defpackage.ilx;
import defpackage.maj;
import defpackage.map;
import defpackage.mdu;
import defpackage.usm;
import defpackage.xgj;
import defpackage.xgn;
import defpackage.xhb;
import defpackage.xhc;
import internal.org.jni_zero.CommonApis;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class PendingIntentReceiver extends ihg {
    public awmd c;
    public aunn d;
    public aunn e;
    public aunn f;
    public xgn g;
    public avmb h;
    public ihs i;

    private final void b(xhc xhcVar) {
        this.g.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhcVar), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0151  */
    public final void a(Context context, String str, String str2) {
        String str3 = "YTM Play Pause";
        switch (str) {
            case "com.google.android.youtube.music.pendingintent.controller_widget_forward":
                ((acdo) this.d.io()).g(30000L);
                b(xhb.b(147861));
                str3 = "YTM Forward";
                break;
            case "com.google.android.youtube.music.pendingintent.controller_widget_pause":
                ((acdo) this.d.io()).c();
                b(xhb.b(79496));
                break;
            case "com.google.android.youtube.music.pendingintent.controller_widget_retry":
                ((acdo) this.d.io()).f();
                b(xhb.b(80295));
                str3 = "YTM Retry";
                break;
            case "com.google.android.youtube.music.pendingintent.controller_widget_like":
                this.i.c.c();
                b(xhb.b(79497));
                str3 = "YTM Like";
                break;
            case "com.google.android.youtube.music.pendingintent.controller_widget_next":
                ((acdo) this.d.io()).j();
                b(xhb.b(79495));
                str3 = "YTM Next";
                break;
            case "com.google.android.youtube.music.pendingintent.controller_widget_play":
                ((ilx) this.e.io()).c = false;
                ((acdo) this.d.io()).d();
                b(xhb.b(79496));
                break;
            case "com.google.android.youtube.music.pendingintent.controller_widget_dislike":
                this.i.c.b();
                b(xhb.b(79498));
                str3 = "YTM Dislike";
                break;
            case "com.google.android.youtube.music.pendingintent.controller_widget_previous":
                ((acdo) this.d.io()).k();
                b(xhb.b(79494));
                str3 = "YTM Previous";
                break;
            case "com.google.android.youtube.music.pendingintent.controller_widget_replay":
                ((acdo) this.d.io()).e();
                b(xhb.b(79499));
                str3 = "YTM Replay";
                break;
            case "com.google.android.youtube.music.pendingintent.controller_widget_rewind":
                ((acdo) this.d.io()).g(-10000L);
                b(xhb.b(147862));
                str3 = "YTM Rewind";
                break;
            default:
                str3 = "";
                break;
        }
        if (str3.isEmpty()) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = maj.a;
        map mapVarJ = mdu.j(context);
        aihf aihfVarCreateBuilder = ainv.a.createBuilder();
        String strZ = ahno.Z(str2);
        aihfVarCreateBuilder.copyOnWrite();
        ainv ainvVar = (ainv) aihfVarCreateBuilder.instance;
        ainvVar.b |= 2;
        ainvVar.d = "YTM ".concat(strZ);
        aihfVarCreateBuilder.copyOnWrite();
        ainv ainvVar2 = (ainv) aihfVarCreateBuilder.instance;
        ainvVar2.b |= 4;
        ainvVar2.e = str3;
        aihfVarCreateBuilder.copyOnWrite();
        ainv ainvVar3 = (ainv) aihfVarCreateBuilder.instance;
        ainvVar3.c = 1;
        ainvVar3.b |= 1;
        mapVarJ.a((ainv) aihfVarCreateBuilder.build());
    }

    @Override // defpackage.ihg, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((ihi) CommonApis.j(context)).eb(this);
                    this.a = true;
                }
            }
        }
        String action = intent.getAction();
        if (action != null) {
            String stringExtra = intent.getStringExtra("widget_key");
            if (action.equals("com.google.android.youtube.music.pendingintent.controller_widget_request_data")) {
                ((ihm) this.c.io()).e();
                return;
            }
            if (action.equals("com.google.android.youtube.music.pendingintent.controller_widget_launch_app")) {
                agrx agrxVar = agso.a;
                a(context, action, stringExtra);
            } else if (((ied) this.f.io()).h()) {
                ((ied) this.f.io()).a().x(new hxe(13)).at().s(this.h).C(new usm(this, context, action, stringExtra, 1), new ido(3));
            } else {
                a(context, action, stringExtra);
            }
        }
    }
}

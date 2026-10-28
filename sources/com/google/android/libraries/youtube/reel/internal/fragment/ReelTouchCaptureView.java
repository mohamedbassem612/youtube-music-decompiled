package com.google.android.libraries.youtube.reel.internal.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.aihf;
import defpackage.aldb;
import defpackage.aldd;
import defpackage.alos;
import defpackage.alot;
import defpackage.alou;
import defpackage.hno;
import defpackage.vxz;
import defpackage.xeu;
import defpackage.xff;
import defpackage.ztf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ReelTouchCaptureView extends View {
    public xeu a;
    public hno b;

    public ReelTouchCaptureView(Context context) {
        super(context);
    }

    private final void a(aldd alddVar) {
        xeu xeuVar = this.a;
        if (xeuVar != null) {
            aihf aihfVarCreateBuilder = aldb.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aldb aldbVar = (aldb) aihfVarCreateBuilder.instance;
            aldbVar.c = alddVar.aW;
            aldbVar.b |= 1;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.GENERIC_CLIENT_EXPERIMENT_EVENT);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                return;
            }
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            aldb aldbVar2 = (aldb) aihfVarCreateBuilder.build();
            aldbVar2.getClass();
            alouVar.d = aldbVar2;
            alouVar.c = 423;
            xeuVar.b((alou) alosVar.build());
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            hno hnoVar = this.b;
            if (hnoVar == null || !((vxz) hnoVar.i).l(55, 45613566L, false)) {
                a(aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_FAST_SWIPE_SUPPRESSED);
                return true;
            }
            a(aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_FAST_SWIPE_ALLOWED);
        }
        return super.onTouchEvent(motionEvent);
    }

    public ReelTouchCaptureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReelTouchCaptureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

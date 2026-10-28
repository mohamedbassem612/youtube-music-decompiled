package com.google.android.libraries.youtube.reel.internal.pager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.reel.internal.fragment.ReelTouchCaptureView;
import defpackage.acfz;
import defpackage.acnb;
import defpackage.aihf;
import defpackage.aihn;
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
public class ReelRecyclerView extends RecyclerView {
    public boolean ae;
    public acnb af;
    public hno ag;
    private boolean ah;
    private float ai;
    private float aj;
    private View ak;

    public ReelRecyclerView(Context context) {
        super(context);
        this.ah = false;
        this.ae = false;
        this.ai = -1.0f;
        this.aj = -1.0f;
    }

    public final void a(boolean z) {
        if (this.ah != z) {
            this.ah = z;
            if (z) {
                an();
            }
        }
    }

    public final void aK(ReelTouchCaptureView reelTouchCaptureView) {
        this.ak = reelTouchCaptureView;
        acfz.I(reelTouchCaptureView, false);
    }

    public final void aL(boolean z) {
        acfz.I(this.ak, z);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.ai = motionEvent.getX();
            this.aj = motionEvent.getY();
            actionMasked = 0;
        }
        hno hnoVar = this.ag;
        if (hnoVar != null && hnoVar.p()) {
            if (actionMasked == 5) {
                a(true);
                return false;
            }
            if (actionMasked == 1 || actionMasked == 3) {
                a(false);
                this.ai = -1.0f;
                this.aj = -1.0f;
            } else if (actionMasked == 6) {
                if (motionEvent.getPointerCount() == 2) {
                    actionMasked = 6;
                    a(false);
                    this.ai = -1.0f;
                    this.aj = -1.0f;
                } else {
                    actionMasked = 6;
                }
            }
            if (this.ah) {
                return false;
            }
        }
        hno hnoVar2 = this.ag;
        if (hnoVar2 != null && ((vxz) hnoVar2.m).l(70, 45761823L, false)) {
            if (actionMasked == 2 && this.ae) {
                float degrees = (float) Math.toDegrees(Math.abs(Math.atan2(motionEvent.getY() - this.aj, motionEvent.getX() - this.ai)));
                if (degrees > 90.0f) {
                    degrees = 180.0f - degrees;
                }
                float f = 90.0f - degrees;
                hno hnoVar3 = this.ag;
                if (hnoVar3 != null && f > ((int) ((vxz) hnoVar3.m).c(1, 45761824L, 30L))) {
                    return false;
                }
            }
            if (actionMasked == 1 || actionMasked == 3) {
                this.ai = -1.0f;
                this.aj = -1.0f;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        acnb acnbVar;
        hno hnoVar = this.ag;
        if (hnoVar != null && hnoVar.p() && (this.ah || motionEvent.getPointerCount() > 1)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            this.ai = -1.0f;
            this.aj = -1.0f;
        } else if (action == 2) {
            if (this.aj == -1.0f) {
                this.ai = motionEvent.getX();
                this.aj = motionEvent.getY();
            } else if (motionEvent.getY() - this.aj > 100.0f && (acnbVar = this.af) != null && acnbVar.b.N()) {
                aihf aihfVarCreateBuilder = aldb.a.createBuilder();
                aldd alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_PULL_TO_REFRESH_ATTEMPT;
                aihfVarCreateBuilder.copyOnWrite();
                aldb aldbVar = (aldb) aihfVarCreateBuilder.instance;
                aldbVar.c = alddVar.aW;
                aldbVar.b |= 1;
                xeu xeuVar = acnbVar.e;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.GENERIC_CLIENT_EXPERIMENT_EVENT);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    aldb aldbVar2 = (aldb) aihfVarCreateBuilder.build();
                    aldbVar2.getClass();
                    alouVar.d = aldbVar2;
                    alouVar.c = 423;
                    aihn aihnVarBuild = alosVar.build();
                    aihnVarBuild.getClass();
                    xeuVar.b((alou) aihnVarBuild);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public ReelRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ah = false;
        this.ae = false;
        this.ai = -1.0f;
        this.aj = -1.0f;
    }

    public ReelRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ah = false;
        this.ae = false;
        this.ai = -1.0f;
        this.aj = -1.0f;
    }
}

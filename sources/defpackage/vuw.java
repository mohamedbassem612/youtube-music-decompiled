package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vuw implements vvk, vuz {
    public int a;
    public int b;
    public int c;
    public final vwt d;
    private final ttn e;
    private final awku f;
    private final avlh g;
    private final awkv h;
    private final awkv i;
    private final avlh j;
    private final avlh k;
    private final awkv l;
    private final avlh m;

    public vuw(Context context, vwt vwtVar) {
        this.d = vwtVar;
        int i = 0;
        this.e = new ttn(context, Math.max(ViewConfiguration.get(context).getScaledMinimumFlingVelocity() << 5, 200), 2, 0);
        awku awkuVar = new awku(Boolean.FALSE);
        this.f = awkuVar;
        this.g = awkuVar.E().i(new vqh(6));
        awkv awkvVarAI = new awkx().aI();
        this.h = awkvVarAI;
        this.j = awkvVarAI.i(new tyc(awkuVar, i)).E();
        awkv awkvVarAI2 = new awkx().aI();
        this.i = awkvVarAI2;
        this.k = awkvVarAI2.i(new tyc(awkuVar, i)).E();
        awkv awkvVarAI3 = new awkx().aI();
        this.l = awkvVarAI3;
        this.m = awkvVarAI3.E().S();
        this.c = 1;
    }

    private final void b(ttn ttnVar, MotionEvent motionEvent) {
        if (d(ttnVar, motionEvent) && !c()) {
            ttnVar.d(motionEvent);
            this.f.kk(Boolean.TRUE);
            return;
        }
        int x = 0;
        if (this.c == 1) {
            awkv awkvVar = this.i;
            int iFindPointerIndex = motionEvent.findPointerIndex(ttnVar.g);
            if (iFindPointerIndex >= 0) {
                x = (int) (ttnVar.d - motionEvent.getY(iFindPointerIndex));
            }
            awkvVar.kk(Integer.valueOf(-x));
            return;
        }
        awkv awkvVar2 = this.h;
        int iFindPointerIndex2 = motionEvent.findPointerIndex(ttnVar.g);
        if (iFindPointerIndex2 >= 0) {
            x = (int) (ttnVar.c - motionEvent.getX(iFindPointerIndex2));
        }
        awkvVar2.kk(Integer.valueOf(-x));
    }

    private final boolean c() {
        Boolean bool = (Boolean) this.f.aD();
        return bool != null && bool.booleanValue();
    }

    private final boolean d(ttn ttnVar, MotionEvent motionEvent) {
        int iA = ttnVar.a(motionEvent, this.c);
        if (this.c == 1) {
            if (iA != 2 && iA != 4) {
                return false;
            }
        } else if (iA != 1 && iA != 3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0019  */
    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vvk
    public final boolean a(MotionEvent motionEvent) {
        ttn ttnVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e.d(motionEvent);
        } else if (actionMasked == 1) {
            ttnVar = this.e;
            if (!d(ttnVar, motionEvent)) {
                return true;
            }
            ttnVar.c();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                ttnVar = this.e;
                if (!d(ttnVar, motionEvent)) {
                    return true;
                }
                ttnVar.c();
            }
        } else if (d(this.e, motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int iE;
        vuy vuyVar;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        boolean z = true;
        z = true;
        if (this.c == 1) {
            motionEventObtain.offsetLocation(0.0f, this.b);
        } else {
            motionEventObtain.offsetLocation(this.a, 0.0f);
        }
        ttn ttnVar = this.e;
        ttnVar.b(motionEventObtain);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                b(ttnVar, motionEvent);
                iE = ttnVar.e(motionEventObtain, this.c);
                if (iE == 2) {
                    vuyVar = vuy.b;
                } else if (iE == 1) {
                    vuyVar = vuy.c;
                } else {
                    vuyVar = vuy.a;
                }
                this.l.kk(vuyVar);
                ttnVar.c();
                if (!c()) {
                    view.performClick();
                }
                this.f.kk(Boolean.FALSE);
                if (iE == 0) {
                    z = false;
                }
            } else {
                if (actionMasked == 2) {
                    b(ttnVar, motionEvent);
                } else if (actionMasked == 3) {
                    b(ttnVar, motionEvent);
                    iE = ttnVar.e(motionEventObtain, this.c);
                    if (iE == 2) {
                        vuyVar = vuy.b;
                    } else if (iE == 1) {
                        vuyVar = vuy.c;
                    } else {
                        vuyVar = vuy.a;
                    }
                    this.l.kk(vuyVar);
                    ttnVar.c();
                    if (!c()) {
                        view.performClick();
                    }
                    this.f.kk(Boolean.FALSE);
                    if (iE == 0) {
                    }
                } else if (actionMasked == 6) {
                    int action = (motionEvent.getAction() >> 8) & 255;
                    if (motionEvent.getPointerId(action) == ttnVar.g) {
                        int i = action != 0 ? 0 : 1;
                        ttnVar.e = motionEvent.getX(i);
                        float y = motionEvent.getY(i);
                        ttnVar.f = y;
                        ttnVar.c = ttnVar.e;
                        ttnVar.d = y;
                        ttnVar.g = motionEvent.getPointerId(i);
                        VelocityTracker velocityTracker = ttnVar.b;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    }
                }
                z = false;
            }
        }
        motionEventObtain.recycle();
        return z;
    }

    @Override // defpackage.vuz
    public final vux q() {
        return vux.a;
    }

    @Override // defpackage.vuz
    public final avlh r() {
        return this.g;
    }

    @Override // defpackage.vuz
    public final avlh s() {
        return this.m;
    }

    @Override // defpackage.vuz
    public final avlh t() {
        return this.j;
    }

    @Override // defpackage.vuz
    public final avlh u() {
        return this.k;
    }
}

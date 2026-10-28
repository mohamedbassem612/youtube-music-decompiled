package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class acea implements acdx {
    protected static final agkz h = agkz.u(0, 4, 5, 6, 9, 7, new Integer[0]);
    private final tbt a;
    private final abmt b;
    private final awmd c;
    public final acdy i;

    public acea(acdo acdoVar, adws adwsVar, awmd awmdVar, acdw acdwVar, ahey aheyVar, abwg abwgVar, avlh avlhVar, avlh avlhVar2, avlh avlhVar3, tbt tbtVar, abmt abmtVar, acdq acdqVar, abxv abxvVar, awmd awmdVar2) {
        this.a = tbtVar;
        this.b = abmtVar;
        this.c = awmdVar2;
        this.i = abmtVar.K() ? new acec(acdoVar, adwsVar, acdwVar, abwgVar, avlhVar, avlhVar2, avlhVar3, abmtVar, acdqVar, abxvVar, awmdVar2) : new acdz(acdoVar, adwsVar, awmdVar, acdwVar, aheyVar, abwgVar, avlhVar, avlhVar2, avlhVar3, abmtVar, acdqVar);
    }

    @Override // defpackage.acdx
    public final void e(acee aceeVar) {
        this.i.l(aceeVar);
    }

    @Override // defpackage.acdx
    public final void f(aceh acehVar) {
        this.i.m(acehVar);
    }

    @Override // defpackage.acdx
    public final void g(int i) {
        this.i.o(i);
    }

    @Override // defpackage.acdx
    public final void h(Bitmap bitmap, Bitmap bitmap2) {
        this.i.p(bitmap, bitmap2);
    }

    @tcc
    public void handleFormatStreamChangeEvent(yvu yvuVar) {
        this.i.c(yvuVar);
    }

    @tcc
    public void handlePlaybackRateChangedEvent(aaxh aaxhVar) {
        this.i.d(aaxhVar);
    }

    @tcc
    public void handlePlaybackServiceException(aboe aboeVar) {
        this.i.u();
    }

    @tcc
    public void handleSequencerHasPreviousNextEvent(aayv aayvVar) {
        this.i.e(aayvVar);
    }

    @tcc
    public void handleSequencerStageEvent(aayw aaywVar) {
        this.i.f(aaywVar);
    }

    @tcc
    public void handleVideoStageEvent(aazj aazjVar) {
        if (this.b.o.l(274, 45822851L, false) && ((abnc) this.c.io()).t()) {
            return;
        }
        afvn afvnVarB = aawb.b(aazjVar, "PCUI");
        try {
            this.i.g(aazjVar);
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @tcc
    public void handleVideoTimeEvent(aazk aazkVar) {
        afvx afvxVarAe = tym.ae(tsa.EVENT_BUS_HANDLE_VIDEO_TIME_EVENT, aawm.b("PCUI", aazkVar != null ? aazkVar.i : null));
        try {
            this.i.h(aazkVar);
            afvxVarAe.close();
        } catch (Throwable th) {
            try {
                afvxVarAe.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @tcc
    public void handleYouTubePlayerStateEvent(aazn aaznVar) {
        this.i.i(aaznVar);
    }

    @Override // defpackage.acdx
    public final void i(CharSequence charSequence) {
        this.i.q(charSequence);
    }

    @Override // defpackage.acdx
    public final void j(Bitmap bitmap, Bitmap bitmap2) {
        this.i.r(bitmap, bitmap2);
    }

    @Override // defpackage.acdx
    public final void k(CharSequence charSequence) {
        this.i.s(charSequence);
    }

    @Override // defpackage.acdx
    public final void l(abuz abuzVar) {
        this.i.w(abuzVar);
    }

    protected final void m() {
        this.i.a();
    }

    public final void n(aawn aawnVar) {
        this.i.b(aawnVar);
    }

    public final void o() {
        this.i.j(this.a, this);
    }

    protected final void p() {
        this.i.t();
    }
}

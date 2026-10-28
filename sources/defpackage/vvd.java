package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vvd extends vtg {
    public final Context a;
    public final awkv b;
    public final awkv c;
    public final int d;
    private final ViewGroup j;
    private final int k;
    private final awku l;
    private final awku m;
    private final awku n;
    private final avlh o;
    private final avlh p;
    private final avlh q;
    private final avlh r;
    private final avmb s;
    private final vwt t;

    public vvd(Context context, ViewGroup viewGroup, int i, avmb avmbVar, ahto ahtoVar, avlr avlrVar, vxz vxzVar, vwt vwtVar) {
        super(avmbVar, vwtVar);
        this.a = context;
        viewGroup.getClass();
        this.j = viewGroup;
        this.k = i;
        this.s = avmbVar;
        this.t = vwtVar;
        this.n = new awku(new Rect(0, 0, 0, 0));
        this.l = new awku(0);
        this.m = new awku(0);
        this.b = new awku(new Rect(0, 0, 0, 0));
        this.c = new awku(0);
        DisplayMetrics displayMetrics = viewGroup.getContext().getResources().getDisplayMetrics();
        agrf agrfVar = twm.a;
        displayMetrics.getClass();
        this.d = (int) (((double) (displayMetrics.density * 400.0f)) + 0.5d);
        avlh avlhVarS = ((avlh) ahtoVar.b).x(new jna(20)).H(new vup(6)).S();
        this.o = avlhVarS;
        this.p = avlh.f(avlhVarS, avlrVar.g(avla.e).U(viewGroup.getContext().getResources().getConfiguration()).H(new vup(7)).p(), new mkw(vxzVar, 2)).U(Double.valueOf(0.34d)).p();
        this.q = avlhVarS.H(new vup(8)).U(Boolean.FALSE).p();
        this.r = tzk.W(avlrVar, (avlh) ahtoVar.b);
    }

    @Override // defpackage.vul
    public final int a() {
        Integer num = (Integer) this.l.aD();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // defpackage.vtg, defpackage.vul
    public final int b() {
        Integer num = (Integer) this.m.aD();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // defpackage.vul
    public final Rect c() {
        Rect rect = (Rect) this.n.aD();
        return rect == null ? new Rect(0, 0, 0, 0) : rect;
    }

    @Override // defpackage.vtg
    public final avlh e() {
        return this.b.H(new uxe(13));
    }

    @Override // defpackage.vul
    public final avlh f() {
        return this.n;
    }

    @Override // defpackage.vul
    public final avlh g() {
        return this.n.H(new vvb(this, 0));
    }

    @Override // defpackage.vul
    public final avlh h() {
        return this.l;
    }

    @Override // defpackage.vtg, defpackage.vul
    public final avlh i() {
        return this.m;
    }

    @Override // defpackage.vtg, defpackage.vul
    public final void j(View view, View view2, View view3) {
        super.j(view, view2, view3);
        ViewGroup viewGroup = this.j;
        final View viewFindViewById = viewGroup.findViewById(this.k);
        viewFindViewById.getClass();
        Rect rect = new Rect(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom());
        awku awkuVar = this.n;
        awkuVar.kk(rect);
        avmb avmbVar = this.s;
        avlr avlrVarG = tuk.g(viewFindViewById, avmbVar);
        avla avlaVar = avla.e;
        avlh avlhVarG = avlrVarG.g(avlaVar);
        avlh avlhVarG2 = avlr.o(new tuf(view, 0)).W(avmbVar).g(avlaVar);
        this.b.kk(new Rect(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom()));
        byte[] bArr = null;
        tsn tsnVar = new tsn(this, avlhVarG, 14, bArr);
        vwt vwtVar = this.t;
        vwtVar.D(tsnVar);
        vwtVar.D(new tsn(this, avlhVarG2, 15, bArr));
        avlh.g(this.p, this.q, avlhVarG, new avnj() { // from class: vvc
            /* JADX WARN: Code duplicated, block: B:10:0x0035  */
            @Override // defpackage.avnj
            public final Object a(Object obj, Object obj2, Object obj3) {
                DisplayMetrics displayMetrics = viewFindViewById.getContext().getResources().getDisplayMetrics();
                int iHeight = ((Rect) obj3).height();
                double dDoubleValue = ((Double) obj).doubleValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int i = 0;
                if (displayMetrics != null) {
                    int i2 = (int) (((double) iHeight) * dDoubleValue);
                    if (zBooleanValue) {
                        i = i2;
                    } else {
                        int i3 = iHeight - i2;
                        int i4 = this.a.d;
                        if (iHeight >= i4) {
                            if (i3 < i4) {
                                i = iHeight - i4;
                            } else {
                                i = i2;
                            }
                        }
                    }
                }
                return Integer.valueOf(i);
            }
        }).ap(this.l);
        this.r.W(new hpn(tuk.g(view, avmbVar).g(avlaVar), avlhVarG, 9)).ap(awkuVar);
    }

    @Override // defpackage.vtg
    public final avlh l() {
        return this.c;
    }
}

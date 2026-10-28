package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hbv extends vtg {
    public final Context a;
    public final awku b;
    public final awku c;
    public final awkv d;
    private final ViewGroup j;
    private final awku k;
    private final awmd l;
    private final avmm m;
    private final vxz n;

    public hbv(Context context, ViewGroup viewGroup, vxz vxzVar, awmd awmdVar, vwt vwtVar, avmb avmbVar) {
        super(avmbVar, vwtVar);
        this.m = new avmm();
        this.a = context;
        this.j = viewGroup;
        this.n = vxzVar;
        this.b = new awku(new Rect(0, 0, 0, 0));
        this.l = awmdVar;
        this.c = new awku(0);
        this.k = new awku(0);
        this.d = new awku(new Rect(0, 0, 0, 0));
    }

    @Override // defpackage.vul
    public final int a() {
        Integer num = (Integer) this.c.aD();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // defpackage.vtg, defpackage.vul
    public final int b() {
        Integer num = (Integer) this.k.aD();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // defpackage.vul
    public final Rect c() {
        Rect rect = (Rect) this.b.aD();
        return rect == null ? new Rect(0, 0, 0, 0) : rect;
    }

    public final Rect d() {
        ViewGroup viewGroup = this.j;
        return new Rect(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom());
    }

    @Override // defpackage.vtg
    public final avlh e() {
        return this.d.H(new gnw(7));
    }

    @Override // defpackage.vul
    public final avlh f() {
        return this.b;
    }

    @Override // defpackage.vul
    public final avlh g() {
        return this.b.H(new hby(this, 1));
    }

    @Override // defpackage.vul
    public final avlh h() {
        return this.c;
    }

    @Override // defpackage.vtg, defpackage.vul
    public final avlh i() {
        return this.k;
    }

    @Override // defpackage.vtg, defpackage.vul
    public final void j(View view, View view2, View view3) {
        super.j(view, view2, view3);
        this.d.kk(d());
        this.b.kk(d());
        awmd awmdVar = this.l;
        avmn[] avmnVarArr = {((WatchWhileLayout) awmdVar.io()).bS.p().al(new hbr(this, 3), new glg(13)), ((WatchWhileLayout) awmdVar.io()).bT.p().al(new hbr(this, 4), new glg(13)), ((WatchWhileLayout) awmdVar.io()).bQ.al(new hbr(this, 5), new glg(13))};
        avmm avmmVar = this.m;
        avmmVar.e(avmnVarArr);
        vxz vxzVar = this.n;
        if (vxzVar.l(132, 45845054L, false)) {
            avmmVar.c(((WatchWhileLayout) awmdVar.io()).bR.p().al(new hbr(this.k, 6), new glg(13)));
        }
        if (vxzVar.l(41, 45679250L, false)) {
            this.k.kk(Integer.valueOf(((WatchWhileLayout) awmdVar.io()).u()));
        }
    }
}

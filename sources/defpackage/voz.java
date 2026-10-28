package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class voz {
    public final int a;
    public final vuk b;
    public final avlr c;
    public final Context d;
    public final vul e;
    public vpc f;
    public RelativeLayout g;
    public FrameLayout h;
    public View i;
    public View j;
    public View k;
    public ViewGroup l;
    public int m;
    public final tth n;
    public final vxz o;
    public final vxz p;
    public final vxz q;
    public final vxz r;
    public final vxz s;
    public final vxz t;
    public final vwt u;
    public final axfd v;

    public voz(vuk vukVar, tth tthVar, vwt vwtVar, Context context, axfd axfdVar, vul vulVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, vxz vxzVar4, vxz vxzVar5, avlr avlrVar, vxz vxzVar6) {
        this.b = vukVar;
        this.n = tthVar;
        this.u = vwtVar;
        this.d = context;
        this.v = axfdVar;
        this.e = vulVar;
        this.o = vxzVar;
        this.p = vxzVar2;
        this.r = vxzVar3;
        this.q = vxzVar4;
        this.s = vxzVar5;
        this.c = avlrVar;
        this.t = vxzVar6;
        Boolean.FALSE.booleanValue();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        agrf agrfVar = twm.a;
        displayMetrics.getClass();
        this.a = (int) (((double) (displayMetrics.density * 528.0f)) + 0.5d);
    }
}

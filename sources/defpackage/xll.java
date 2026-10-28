package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.blocks.runtime.RuntimeSignal;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xll extends agcv {
    public static final /* synthetic */ int p = 0;
    private static final ListenableFuture q;
    private static final ListenableFuture r;
    public final Context a;
    public final xql b;
    public final avmb c;
    public final avmb d;
    public final awmd e;
    public final vxe f;
    public final xpn g;
    public final xpq h;
    public final avmr i;
    public final awmi j;
    public final awmi k;
    public final RuntimeSignal l;
    public final vxz m;
    public final hfn n;
    public final xsc o;

    static {
        aihf aihfVarCreateBuilder = aseg.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihf aihfVarCreateBuilder2 = akll.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        afxw.ab(2, aihfVarCreateBuilder2);
        atqn.T(afxw.aa(aihfVarCreateBuilder2), aihfVarCreateBuilder);
        q = ahng.n(atqn.S(aihfVarCreateBuilder));
        aihf aihfVarCreateBuilder3 = aseg.a.createBuilder();
        aihfVarCreateBuilder3.getClass();
        aihf aihfVarCreateBuilder4 = akll.a.createBuilder();
        aihfVarCreateBuilder4.getClass();
        afxw.ab(3, aihfVarCreateBuilder4);
        atqn.T(afxw.aa(aihfVarCreateBuilder4), aihfVarCreateBuilder3);
        r = ahng.n(atqn.S(aihfVarCreateBuilder3));
    }

    public xll(may mayVar, Context context, xql xqlVar, avmb avmbVar, avmb avmbVar2, awmd awmdVar, hfn hfnVar, vxe vxeVar, xsc xscVar, xpn xpnVar, xpq xpqVar, vxz vxzVar) {
        this.a = context;
        this.b = xqlVar;
        this.c = avmbVar;
        this.d = avmbVar2;
        this.e = awmdVar;
        this.n = hfnVar;
        this.f = vxeVar;
        this.o = xscVar;
        this.g = xpnVar;
        this.h = xpqVar;
        this.m = vxzVar;
        asem asemVar = asem.a;
        aihn.getParserForClass(asem.class);
        this.l = new RuntimeSignal(279863794, mayVar.a);
        this.i = new avmr();
        this.j = new awmp(new pbm(this, 14));
        this.k = new awmp(new pbm(this, 15));
    }

    public static final ListenableFuture b(boolean z) {
        return z ? q : r;
    }

    public final void a(yct yctVar) {
        Context context = this.a;
        Intent intentCQ = yno.cQ(context);
        intentCQ.setFlags(268435456);
        intentCQ.putExtra("com.google.android.libraries.youtube.mdx.smartremote.startingUiMode", yctVar.f);
        intentCQ.putExtra("com.google.android.libraries.youtube.mdx.smartremote.dialogStyle", true != yno.C(context) ? 2132084322 : 2132084329);
        yno.dc(context, intentCQ);
    }
}

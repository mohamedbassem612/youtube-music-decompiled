package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.apps.youtube.music.R;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vhg extends nh {
    public static final Object a = new Object();
    private final xgm A;
    private final aeiv B;
    public final Handler e;
    public final vgw g;
    public final vho h;
    public final via i;
    public final vil j;
    public final vie k;
    public final vik l;
    public final vhd m;
    public final vic n;
    public cc o;
    public vhh p;
    public vhj q;
    public boolean s;
    public final via t;
    public final vil u;
    public final xpl v;
    private final Context w;
    private final int x;
    private final HandlerThread y;
    private final List z = new ArrayList();
    public final Set f = DesugarCollections.synchronizedSet(new HashSet());
    public int r = 4;

    public vhg(Context context, vgw vgwVar, vho vhoVar, via viaVar, via viaVar2, vil vilVar, vil vilVar2, vie vieVar, vik vikVar, xgm xgmVar, vic vicVar, vhd vhdVar, aeiv aeivVar, xpl xplVar) {
        this.w = context;
        this.g = vgwVar;
        this.h = vhoVar;
        this.t = viaVar;
        this.v = xplVar;
        this.i = viaVar2;
        this.j = vilVar;
        this.u = vilVar2;
        this.k = vieVar;
        this.l = vikVar;
        this.A = xgmVar;
        this.m = vhdVar;
        this.n = vicVar;
        this.B = aeivVar;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.x = point.x;
        this.e = new Handler(context.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("vhg");
        this.y = handlerThread;
        handlerThread.start();
        new Handler(handlerThread.getLooper());
        aeivVar.s();
    }

    public final void A(Runnable runnable) {
        this.e.postAtTime(runnable, a, SystemClock.uptimeMillis());
    }

    public final void B(Uri uri) {
        vhj vhjVar;
        Set set = this.f;
        set.remove(uri);
        if (!set.isEmpty() || (vhjVar = this.q) == null) {
            return;
        }
        vhjVar.o(false);
    }

    public final void C(apji apjiVar) {
        Optional optionalFj = yno.fj(apjiVar);
        if (optionalFj.isPresent()) {
            B((Uri) optionalFj.get());
        }
        List list = this.z;
        int iIndexOf = list.indexOf(apjiVar);
        list.remove(apjiVar);
        n(iIndexOf);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void D(List list) {
        vhj vhjVar;
        List list2 = this.z;
        list2.clear();
        list.getClass();
        list2.addAll(list);
        aeiv aeivVar = this.B;
        if (!((Optional) aeivVar.c).isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Optional optionalFj = yno.fj((apji) it.next());
                Optional optionalEmpty = optionalFj.isEmpty() ? Optional.empty() : yno.fi((Uri) optionalFj.get());
                if (optionalEmpty.isPresent()) {
                    hashSet.add((String) optionalEmpty.get());
                }
            }
            aeivVar.a.execute(new uqd(aeivVar, hashSet, 7));
        }
        if (!list.isEmpty() || (vhjVar = this.q) == null) {
            return;
        }
        vhjVar.o(false);
    }

    @Override // defpackage.nh
    public final int a() {
        return this.z.size();
    }

    @Override // defpackage.nh
    public final int b(int i) {
        List list = this.z;
        apji apjiVar = (apji) list.get(i);
        aihl aihlVar = aqct.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            return Integer.MIN_VALUE;
        }
        apji apjiVar2 = (apji) list.get(i);
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        int iBi = a.bi(((aqcr) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c);
        if (iBi == 0) {
            iBi = 1;
        }
        return iBi - 1;
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        View viewInflate;
        oh vgjVar;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        int i2 = this.x / this.r;
        if (i == Integer.MIN_VALUE) {
            viewInflate = layoutInflaterFrom.inflate(R.layout.sticker_cell, viewGroup, false);
            viewInflate.getLayoutParams().height = i2;
            viewInflate.getLayoutParams().width = i2;
            vgjVar = new vgj(viewInflate, this, this.n, this.o);
        } else {
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 7 && i != 8 && i != 9) {
                throw new IllegalArgumentException(a.bR(i, "Unexpected view type: "));
            }
            viewInflate = layoutInflaterFrom.inflate(R.layout.sticker_catalog_dynamic_sticker_container, viewGroup, false);
            viewInflate.getLayoutParams().height = i2;
            viewInflate.getLayoutParams().width = i2;
            vgjVar = new vgp(viewInflate, this, this.n, this.o);
        }
        if (i == 3 && Build.VERSION.SDK_INT == 28) {
            viewInflate.setLayerType(1, null);
        }
        return vgjVar;
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void o(oh ohVar, int i) {
        vhf vhfVar = (vhf) ohVar;
        vhfVar.w = (apji) this.z.get(i);
        vhfVar.C();
    }

    @Override // defpackage.nh
    public final /* synthetic */ void s(oh ohVar) {
        ((vhf) ohVar).D();
    }

    public final xgn z() {
        return this.A.hB();
    }
}

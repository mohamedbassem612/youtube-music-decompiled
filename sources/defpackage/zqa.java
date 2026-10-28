package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqa implements zpu {
    public final xgn a;
    public final zpr d;
    public final aaqf e;
    private final Context f;
    private final advb g;
    private final xeu h;
    private final RecyclerView i;
    private final vxz m;
    private final abte n;
    private final ahek o;
    private final dov p;
    private final Handler j = new Handler(Looper.getMainLooper());
    public admu b = null;
    public String c = null;
    private String k = null;
    private String l = null;

    public zqa(ahek ahekVar, advb advbVar, xeu xeuVar, abte abteVar, dov dovVar, aaqf aaqfVar, vxz vxzVar, Context context, zpr zprVar, RecyclerView recyclerView, xgn xgnVar) {
        this.e = aaqfVar;
        this.f = context;
        this.o = ahekVar;
        this.g = advbVar;
        this.h = xeuVar;
        this.n = abteVar;
        this.p = dovVar;
        this.d = zprVar;
        this.i = recyclerView;
        this.a = xgnVar;
        this.m = vxzVar;
    }

    private final void l(String str) {
        Handler handler = this.j;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new zgc((Object) this, (Object) str, 8), 200L);
    }

    private final void m(aihf aihfVar) {
        xeu xeuVar = this.h;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVar, alot.USER_MENTION_AUTO_COMPLETE_BOX_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arbf arbfVar = (arbf) aihfVar.build();
        arbfVar.getClass();
        alouVar.d = arbfVar;
        alouVar.c = 227;
        xeuVar.b((alou) alosVar.build());
    }

    private final aihf n(int i) {
        if (this.k == null) {
            return null;
        }
        aihf aihfVarCreateBuilder = arbf.a.createBuilder();
        String str = this.k;
        aihfVarCreateBuilder.copyOnWrite();
        arbf arbfVar = (arbf) aihfVarCreateBuilder.instance;
        str.getClass();
        arbfVar.b |= 1;
        arbfVar.e = str;
        aihfVarCreateBuilder.copyOnWrite();
        arbf arbfVar2 = (arbf) aihfVarCreateBuilder.instance;
        arbfVar2.f = i - 1;
        arbfVar2.b |= 2;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.zpu
    public final zpx a(int i) {
        admu admuVar;
        if (i < 0 || (admuVar = this.b) == null || i >= admuVar.size()) {
            return null;
        }
        return new zpy((arbg) this.b.get(i), 3);
    }

    @Override // defpackage.zpu
    public final void b() {
        zpz zpzVar = new zpz();
        zpzVar.e(new gob(this, 18));
        admo admoVarD = this.o.d((admh) this.g.io());
        admoVarD.t(true);
        admoVarD.D(zpzVar, null);
        this.b = zpzVar;
        int dimensionPixelSize = this.f.getResources().getDimensionPixelSize(R.dimen.user_mention_suggestions_list_padding_top);
        RecyclerView recyclerView = this.i;
        recyclerView.setPadding(0, dimensionPixelSize, 0, 0);
        recyclerView.setClipToPadding(false);
        recyclerView.af(null);
        recyclerView.ad(admoVarD);
        recyclerView.setMotionEventSplittingEnabled(false);
    }

    @Override // defpackage.zpu
    public final void c(String str) {
        if (this.c == null && str.trim().isEmpty() && !g()) {
            return;
        }
        l(str);
        k(6);
        j(6, -1);
    }

    @Override // defpackage.zpu
    public final void d(int i) {
        aihf aihfVarN = n(4);
        if (aihfVarN != null) {
            aihf aihfVarCreateBuilder = arbe.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            arbe arbeVar = (arbe) aihfVarCreateBuilder.instance;
            arbeVar.b |= 1;
            arbeVar.c = i;
            aihfVarN.copyOnWrite();
            arbf arbfVar = (arbf) aihfVarN.instance;
            arbe arbeVar2 = (arbe) aihfVarCreateBuilder.build();
            arbf arbfVar2 = arbf.a;
            arbeVar2.getClass();
            arbfVar.d = arbeVar2;
            arbfVar.c = 3;
            m(aihfVarN);
            j(4, i);
        }
    }

    @Override // defpackage.zpu
    public final void e() {
        dov dovVar = this.p;
        this.k = dovVar.af(16);
        this.l = dovVar.af(16);
        if (g()) {
            l("");
        }
        k(2);
        j(2, -1);
    }

    @Override // defpackage.zpu
    public final void f() {
        k(3);
        j(3, -1);
        this.c = null;
        this.j.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.zpu
    public final boolean g() {
        return this.m.m(5, 45617552L);
    }

    @Override // defpackage.zpu
    public final boolean h() {
        return true;
    }

    public final void j(int i, int i2) {
        if (this.l != null) {
            xfh xfhVar = new xfh(i - 1, 20);
            aihf aihfVarCreateBuilder = aqat.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aqat aqatVar = (aqat) aihfVarCreateBuilder.instance;
            aqatVar.c = 2;
            aqatVar.b |= 1;
            if (i2 != -1) {
                aihfVarCreateBuilder.copyOnWrite();
                aqat aqatVar2 = (aqat) aihfVarCreateBuilder.instance;
                aqatVar2.b |= 2;
                aqatVar2.d = i2;
            }
            aihf aihfVarCreateBuilder2 = akzk.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            akzk akzkVar = (akzk) aihfVarCreateBuilder2.instance;
            aqat aqatVar3 = (aqat) aihfVarCreateBuilder.build();
            aqatVar3.getClass();
            akzkVar.i = aqatVar3;
            akzkVar.b |= SemanticState.Obscured;
            xfhVar.a = (akzk) aihfVarCreateBuilder2.build();
            this.n.e(xfhVar, alai.FLOW_TYPE_SOCIAL_SUGGESTIONS, this.l);
        }
    }

    public final void k(int i) {
        aihf aihfVarN = n(i);
        if (aihfVarN != null) {
            m(aihfVarN);
        }
    }

    @Override // defpackage.zpu
    public final void i(zpr zprVar, RecyclerView recyclerView) {
    }
}

package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vhz {
    public final Context a;
    public final vxe b;
    public final ajwo c;
    public final xgn d;
    public final Handler e;
    public final admu f;
    public String g;
    public String h;
    public final vhx i;
    public final vxz j;
    public final dov k;
    private final advb l;
    private final xeu m;
    private final RecyclerView n;
    private boolean o;
    private final ahek p;

    public vhz(Context context, ahek ahekVar, advb advbVar, vxe vxeVar, xeu xeuVar, dov dovVar, vxz vxzVar, Handler handler, vxz vxzVar2, vhx vhxVar, RecyclerView recyclerView, ajwo ajwoVar, xgn xgnVar) {
        this.o = false;
        this.a = context;
        this.p = ahekVar;
        this.l = advbVar;
        this.b = vxeVar;
        this.m = xeuVar;
        this.k = dovVar;
        this.e = handler;
        this.i = vhxVar;
        this.n = recyclerView;
        this.c = ajwoVar;
        this.d = xgnVar;
        vxzVar.m(2, 45380174L);
        this.o = vxzVar.m(16, 45422411L);
        this.j = vxzVar2;
        vhy vhyVar = new vhy();
        vhyVar.e(new adwz(this, new yno((byte[]) null), 1));
        admo admoVarD = ahekVar.d((admh) advbVar.io());
        admoVarD.t(true);
        admoVarD.D(vhyVar, null);
        this.f = vhyVar;
        recyclerView.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.user_mention_suggestions_list_padding_top), 0, 0);
        recyclerView.setClipToPadding(false);
        recyclerView.af(null);
        recyclerView.ah(new LinearLayoutManager(context));
        recyclerView.ad(admoVarD);
        recyclerView.setMotionEventSplittingEnabled(false);
    }

    public final boolean a() {
        return false;
    }

    public final void b(int i) {
        aihf aihfVarCreateBuilder = arbf.a.createBuilder();
        String str = this.h;
        aihfVarCreateBuilder.copyOnWrite();
        arbf arbfVar = (arbf) aihfVarCreateBuilder.instance;
        str.getClass();
        arbfVar.b |= 1;
        arbfVar.e = str;
        aihfVarCreateBuilder.copyOnWrite();
        arbf arbfVar2 = (arbf) aihfVarCreateBuilder.instance;
        arbfVar2.g = 2;
        arbfVar2.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        arbf arbfVar3 = (arbf) aihfVarCreateBuilder.instance;
        arbfVar3.f = i - 1;
        arbfVar3.b |= 2;
        xeu xeuVar = this.m;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.USER_MENTION_AUTO_COMPLETE_BOX_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arbf arbfVar4 = (arbf) aihfVarCreateBuilder.build();
        arbfVar4.getClass();
        alouVar.d = arbfVar4;
        alouVar.c = 227;
        xeuVar.b((alou) alosVar.build());
    }
}

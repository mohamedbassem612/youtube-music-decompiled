package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xub extends xtv implements xro {
    public AdapterView.OnItemClickListener A;
    public final tbt B;
    public final awmd C;
    public final xrd D;
    public final ydu E;
    public final xgn F;
    public final Map G;
    protected List H;
    protected xue I;
    protected LinearLayoutManager J;
    public final ycp K;
    public final dov L;
    private final xqw M;
    private final xrx N;
    private final xla O;
    private final xmr P;
    private final xru Q;
    private final ycp R;
    private final xsc S;

    public xub(Context context, yar yarVar, dov dovVar, boolean z, tbt tbtVar, awmd awmdVar, awmd awmdVar2, xrd xrdVar, xsc xscVar, xmr xmrVar, xla xlaVar, ydu yduVar, ycp ycpVar, ycp ycpVar2, xru xruVar, xgn xgnVar, Executor executor, xrx xrxVar, abte abteVar, vxz vxzVar) {
        super(context, xgnVar, abteVar);
        this.M = new xqw(yarVar, ycpVar2, z, this, awmdVar2 == null ? null : (String) awmdVar2.io(), executor, xrxVar, dovVar, vxzVar);
        this.L = dovVar;
        this.B = tbtVar;
        this.C = awmdVar;
        this.D = xrdVar;
        this.O = xlaVar;
        this.S = xscVar;
        this.P = xmrVar;
        this.E = yduVar;
        this.K = ycpVar;
        this.R = ycpVar2;
        this.Q = xruVar;
        this.F = xgnVar;
        this.G = new HashMap();
        this.N = xrxVar;
    }

    @Override // defpackage.xro
    public final boolean a(dii diiVar) {
        return l(diiVar);
    }

    @Override // defpackage.dfu
    public final void b(List list) {
        this.M.g(list, true, false);
        xgn xgnVar = this.F;
        if (xgnVar.a() == null) {
            ((agrc) ((agrc) xuf.m.b().i(agso.a, "MDX.MdxMediaRouteChooserDialogFragment")).k("com/google/android/libraries/youtube/mdx/mediaroute/dialogfactory/MdxMediaRouteChooserDialogFragment$MdxMediaRouteChooserDialog", "onFilterRoutes", 403, "MdxMediaRouteChooserDialogFragment.java")).t("No screen attached to interaction logger yet.");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dii diiVar = (dii) it.next();
            Map map = this.G;
            if (map.containsKey(xrx.a(diiVar))) {
                xgnVar.w((xgz) map.get(xrx.a(diiVar)), x(diiVar));
            } else {
                xgx xgxVar = new xgx(xgnVar.a(), xhb.b(12926));
                xgnVar.d(xgxVar);
                xgnVar.w(xgxVar, x(diiVar));
                map.put(xrx.a(diiVar), xgxVar);
            }
        }
    }

    @Override // defpackage.xtv
    protected final void n(lot lotVar) {
        xsc xscVar = this.S;
        xmj xmjVar = (xmj) xscVar.b;
        ((lpa) (xmjVar.c.m(xmjVar.b, 211500000) == 0 ? ((lpo) xscVar.c).b() : xscVar.a)).o(lotVar);
    }

    @Override // defpackage.xtv
    protected final void s() {
        ListView listView = this.n;
        this.A = listView.getOnItemClickListener();
        listView.setOnItemClickListener(new xua(this));
    }

    @Override // defpackage.xtv
    protected final void t() {
        if (v()) {
            this.h = findViewById(R.id.suggested_devices_bar);
            this.i = (TextView) findViewById(R.id.suggested_devices_subtitle);
            this.l = (TextView) findViewById(R.id.all_devices_subtitle);
            this.j = (RecyclerView) findViewById(R.id.suggested_devices_chip_cloud);
            this.i.setText(R.string.mdx_media_route_dialog_suggested_devices_subtitle);
            this.l.setText(R.string.mdx_media_route_dialog_all_devices_subtitle);
            this.H = new ArrayList();
            this.I = new xue(this.H, this.E, this.R, this.K, this.Q, this.F, this.N, this.D, this.L, this.C, this.B, this.O);
            Context context = this.w;
            this.J = new LinearLayoutManager(context, 0, false);
            this.j.ah(this.J);
            this.j.ad(this.I);
            this.j.af(new lu());
            lv lvVar = new lv(this.j.getContext(), this.J.getOrientation());
            Drawable drawable = context.getDrawable(R.drawable.suggested_device_divider);
            if (drawable == null) {
                throw new IllegalArgumentException("Drawable cannot be null.");
            }
            lvVar.a = drawable;
            this.j.aJ(lvVar);
            this.m.registerDataSetObserver(new xtx(this));
            this.I.x(new xty(this));
        }
    }

    @Override // defpackage.xtv
    protected final boolean u() {
        return this.O.am();
    }

    @Override // defpackage.xtv
    protected final boolean v() {
        boolean z = this.P.j;
        return this.E.b() > 0;
    }

    @Override // defpackage.xtv
    protected final boolean w() {
        xmr xmrVar = this.P;
        return xmrVar != null && xmrVar.a.equals("cl");
    }

    public final amdd x(dii diiVar) {
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amdg.a.createBuilder();
        int iL = this.N.l(diiVar);
        aihfVarCreateBuilder2.copyOnWrite();
        amdg amdgVar = (amdg) aihfVarCreateBuilder2.instance;
        amdgVar.c = iL - 1;
        amdgVar.b |= 1;
        int iBU = zik.bU(this.R.b);
        aihfVarCreateBuilder2.copyOnWrite();
        amdg amdgVar2 = (amdg) aihfVarCreateBuilder2.instance;
        amdgVar2.d = iBU - 1;
        amdgVar2.b |= 4;
        amdg amdgVar3 = (amdg) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amdgVar3.getClass();
        amddVar.f = amdgVar3;
        amddVar.b |= 4;
        return (amdd) aihfVarCreateBuilder.build();
    }
}

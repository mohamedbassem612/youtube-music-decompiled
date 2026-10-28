package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class xtv extends dfu implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final agrf f = agrf.h("com/google/android/libraries/youtube/mdx/mediaroute/dialogfactory/MdxBaseMediaRouteChooserDialog");
    private final xgn A;
    private final abte B;
    protected TextView g;
    protected View h;
    protected TextView i;
    protected RecyclerView j;
    protected View k;
    protected TextView l;
    protected ListAdapter m;
    protected ListView n;
    protected ListView o;
    public ProgressBar p;
    public View q;
    public TextView r;
    protected View s;
    protected YouTubeTextView t;
    protected Handler u;
    protected Runnable v;
    protected final Context w;
    public Optional x;
    public xgx y;
    public xgx z;

    public xtv(Context context, xgn xgnVar, abte abteVar) {
        super(context);
        this.x = Optional.empty();
        this.w = context;
        this.A = xgnVar;
        this.B = abteVar;
    }

    @Override // defpackage.dfu, defpackage.gr, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        View view = this.s;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.u.removeCallbacks(this.v);
        }
        this.y = null;
        this.z = null;
    }

    protected final xgx m(xgx xgxVar, xhc xhcVar) {
        xgn xgnVar;
        xgt xgtVarA;
        if (xgxVar != null || (xgnVar = this.A) == null || (xgtVarA = xgnVar.a()) == null) {
            return null;
        }
        xgx xgxVar2 = new xgx(xgtVarA, xhcVar);
        xgnVar.d(xgxVar2);
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amdg.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amdg amdgVar = (amdg) aihfVarCreateBuilder2.instance;
        amdgVar.d = zik.bU(2) - 1;
        amdgVar.b |= 4;
        amdg amdgVar2 = (amdg) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amdgVar2.getClass();
        amddVar.f = amdgVar2;
        amddVar.b |= 4;
        xgnVar.w(xgxVar2, (amdd) aihfVarCreateBuilder.build());
        return xgxVar2;
    }

    protected abstract void n(lot lotVar);

    public final void o(xgx xgxVar) {
        xgn xgnVar = this.A;
        if (xgnVar == null || xgxVar == null) {
            return;
        }
        xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgxVar, null);
    }

    @Override // defpackage.dfu, defpackage.gr, defpackage.qg, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        this.o = listView;
        if (listView != null) {
            setContentView(R.layout.mdx_media_route_chooser_dialog);
            Context context = this.w;
            this.u = new Handler(context.getMainLooper());
            this.n = (ListView) findViewById(R.id.list_of_routes);
            ListAdapter adapter = this.o.getAdapter();
            this.m = adapter;
            this.n.setAdapter(adapter);
            this.n.setOnItemClickListener(this.o.getOnItemClickListener());
            if (v()) {
                ListView listView2 = this.n;
                listView2.setPaddingRelative(listView2.getPaddingStart(), 0, this.n.getPaddingEnd(), this.n.getPaddingBottom());
            }
            t();
            this.g = (TextView) findViewById(R.id.dialog_title);
            this.p = (ProgressBar) findViewById(R.id.progress_bar);
            this.r = (TextView) findViewById(R.id.search_status);
            this.q = findViewById(R.id.space);
            View viewFindViewById = findViewById(android.R.id.empty);
            this.s = viewFindViewById;
            viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.n.setEmptyView(this.s);
            this.v = new xfd(this, 12);
            YouTubeTextView youTubeTextView = (YouTubeTextView) findViewById(R.id.learn_more);
            this.t = youTubeTextView;
            youTubeTextView.setOnClickListener(new xpr(this, 19));
            TypedValue typedValue = new TypedValue();
            this.t.setCompoundDrawablesWithIntrinsicBounds(true != (context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0) ? R.drawable.quantum_ic_info_outline_white_24 : R.drawable.quantum_ic_info_outline_grey600_24, 0, 0, 0);
            if (w()) {
                YouTubeTextView youTubeTextView2 = (YouTubeTextView) findViewById(R.id.link_with_tv_code);
                youTubeTextView2.setVisibility(0);
                q(youTubeTextView2);
                YouTubeTextView youTubeTextView3 = (YouTubeTextView) View.inflate(context, R.layout.mdx_media_route_chooser_dialog_link_tv_footer, null);
                this.n.addFooterView(youTubeTextView3);
                q(youTubeTextView3);
                xgx xgxVarM = m(this.y, xhb.b(82853));
                if (xgxVarM != null) {
                    this.y = xgxVarM;
                }
            }
            s();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object tag = this.s.getTag();
        int visibility = this.s.getVisibility();
        if (tag == null || ((Integer) tag).intValue() != visibility) {
            if (visibility == 0) {
                this.g.setText(R.string.mdx_media_route_dialog_searching_title);
                this.p.setVisibility(0);
                this.q.setVisibility(0);
                this.r.setText(R.string.mdx_searching_for_device_text);
                this.u.postDelayed(this.v, 20000L);
                xgx xgxVarM = m(this.z, xhb.b(55768));
                if (xgxVarM != null) {
                    this.z = xgxVarM;
                }
            } else {
                boolean zV = v();
                TextView textView = this.g;
                if (zV) {
                    textView.setText(R.string.mdx_media_route_dialog_cast_to_a_device_title);
                    int dimensionPixelSize = this.w.getResources().getDimensionPixelSize(R.dimen.mdx_media_route_dialog_section_spacing);
                    TextView textView2 = this.g;
                    textView2.setPaddingRelative(textView2.getPaddingStart(), this.g.getPaddingTop(), this.g.getPaddingEnd(), dimensionPixelSize);
                    View viewFindViewById = findViewById(R.id.all_devices_bar);
                    this.k = viewFindViewById;
                    viewFindViewById.setVisibility(0);
                } else {
                    textView.setText(R.string.mdx_media_route_dialog_devices_title);
                }
            }
            this.s.setTag(Integer.valueOf(visibility));
        }
    }

    public final void p(Intent intent) {
        try {
            afwl.m(this.w, intent);
        } catch (ActivityNotFoundException e) {
            ((agrc) ((agrc) ((agrc) f.b().i(agso.a, "MDX.MdxBaseMediaRouteChooserDialog")).j(e)).k("com/google/android/libraries/youtube/mdx/mediaroute/dialogfactory/MdxBaseMediaRouteChooserDialog", "maybeStartActivity", (char) 296, "MdxBaseMediaRouteChooserDialog.java")).t("Could not resolve intent");
        }
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [aeda, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [aeda, java.lang.Object] */
    protected final void q(YouTubeTextView youTubeTextView) {
        TypedValue typedValue = new TypedValue();
        Context context = this.w;
        boolean z = context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
        Intent intentDf = yno.df(context, !z, this.x.isPresent() && this.x.get().f() && this.x.get().g());
        intentDf.putExtra("useTvCode", 1);
        youTubeTextView.setOnClickListener(new vqd(this, intentDf, 16));
        youTubeTextView.setCompoundDrawablesWithIntrinsicBounds(true != z ? R.drawable.quantum_ic_youtube_linked_tv_white_24 : R.drawable.quantum_ic_youtube_linked_tv_grey600_24, 0, 0, 0);
    }

    final void r(int i) {
        View view = this.h;
        if (view != null) {
            view.setVisibility(i);
        }
        TextView textView = this.i;
        if (textView != null) {
            textView.setVisibility(i);
        }
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            recyclerView.setVisibility(i);
        }
        TextView textView2 = this.l;
        if (textView2 != null) {
            textView2.setVisibility(i);
        }
    }

    protected abstract void s();

    @Override // android.app.Dialog
    public final void show() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        super.show();
        m(null, xhb.b(162177));
        xfh xfhVar = new xfh(3, 55);
        aihf aihfVarCreateBuilder = amym.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amym amymVar = (amym) aihfVarCreateBuilder.instance;
        amymVar.c = 3;
        amymVar.b |= 1;
        amym amymVar2 = (amym) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = akzk.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        akzk akzkVar = (akzk) aihfVarCreateBuilder2.instance;
        amymVar2.getClass();
        akzkVar.o = amymVar2;
        akzkVar.c |= 1;
        xfhVar.a = (akzk) aihfVarCreateBuilder2.build();
        abte abteVar = this.B;
        if (abteVar != null) {
            abteVar.b(xfhVar, alai.FLOW_TYPE_MDX_DEVICE_SELECTION);
        }
        if (!u() || (viewFindViewById = findViewById(R.id.cast_setting_desc)) == null || (viewFindViewById2 = findViewById(R.id.go_to_cast_settings)) == null || (viewFindViewById3 = findViewById(R.id.separator)) == null) {
            return;
        }
        viewFindViewById2.setOnClickListener(new xpr(this, 18));
        n(new lpg(viewFindViewById, viewFindViewById2, viewFindViewById3, 2));
    }

    protected abstract void t();

    protected abstract boolean u();

    protected abstract boolean v();

    protected abstract boolean w();
}

package defpackage;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xqe {
    private long A;
    private ConnectivityManager B;
    private dii C;
    private final yar E;
    private final vxz F;
    private final abxv G;
    private final lqa H;
    public final cc a;
    public final awmd b;
    public final did c;
    public final xru d;
    public final xgn e;
    public final xrd f;
    public xgn g;
    public Context h;
    public ScrollView i;
    public TextView j;
    public LinearLayout k;
    public List l;
    public View.OnClickListener m;
    public View n;
    public TextView o;
    public TextView p;
    public TextView q;
    public View r;
    public View s;
    public View t;
    public BroadcastReceiver u;
    boolean v;
    public Handler w;
    private final mbc y;
    private final aeda z;
    private final Runnable D = new xfd(this, 11);
    public final azs x = new xqc(this);

    public xqe(cc ccVar, awmd awmdVar, did didVar, xru xruVar, abxv abxvVar, yar yarVar, mbc mbcVar, xgn xgnVar, xrd xrdVar, lqa lqaVar, aeda aedaVar, vxz vxzVar) {
        this.a = ccVar;
        this.b = awmdVar;
        this.c = didVar;
        this.d = xruVar;
        this.G = abxvVar;
        this.E = yarVar;
        this.y = mbcVar;
        this.e = xgnVar;
        this.f = xrdVar;
        this.H = lqaVar;
        this.z = aedaVar;
        this.F = vxzVar;
    }

    private final int e() {
        return this.H.O() ? R.string.mdx_pref_pair_with_tv_tv_code_button_sentence_case : R.string.mdx_pref_pair_with_tv_tv_code_button;
    }

    private final int f() {
        return this.H.O() ? R.string.mdx_pref_pair_with_tv_no_tvs_found_with_wifi_button_sentence_case : R.string.mdx_pref_pair_with_tv_no_tvs_found_with_wifi_button;
    }

    private final void g(boolean z) {
        int iOrElse;
        Context context = this.h;
        if (z) {
            iOrElse = tzk.n(context, R.attr.ytThemedBlue).orElse(0);
        } else {
            iOrElse = tzk.n(context, true != this.z.e() ? R.attr.ytStaticBrandRed : R.attr.ytRedIndicator).orElse(0);
        }
        this.j.setBackgroundColor(iOrElse);
        this.k.setVisibility(true != z ? 8 : 0);
        View view = this.n;
        int i = true == z ? 8 : 0;
        view.setVisibility(i);
        this.o.setVisibility(i);
        this.p.setVisibility(i);
    }

    public final void a() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/youtube/answer/3230451"));
        try {
            afwl.m(this.a.getActivity(), intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.a.getActivity(), R.string.mdx_pref_pair_with_tv_no_browser_to_show_help_page, 1).show();
        }
    }

    public final void b(dii diiVar) {
        amyv amyvVar = amyv.MDX_SESSION_SOURCE_SMART_PAIRING_SELECT_DEVICE;
        diiVar.getClass();
        this.d.T(diiVar, null, amyvVar);
        if (this.F.k(45846193L, false)) {
            cf activity = this.a.getActivity();
            if (activity instanceof PairWithTvActivity) {
                ((PairWithTvActivity) activity).h(true);
                return;
            }
        }
        this.i.fullScroll(33);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0297  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x020a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    public final void c() {
        dii diiVar;
        View viewInflate;
        ahgb ahgbVar;
        ?? r13;
        int i;
        xvp xvpVarA;
        int iAV;
        long epochMilli = this.y.f().toEpochMilli();
        long j = epochMilli - this.A;
        if (j < 300) {
            Handler handler = this.w;
            Runnable runnable = this.D;
            handler.removeCallbacks(runnable);
            this.w.postDelayed(runnable, 300 - j);
            return;
        }
        this.A = epochMilli;
        int i2 = 1;
        List listL = this.G.l(true);
        int size = listL.size();
        while (true) {
            size--;
            if (size < 0) {
                diiVar = null;
                break;
            } else if (((dii) listL.get(size)).o()) {
                diiVar = (dii) listL.remove(size);
                break;
            }
        }
        Collections.sort(listL, new rit(7));
        ?? r4 = 0;
        if (diiVar != null) {
            listL.add(0, diiVar);
        }
        Resources resources = this.j.getResources();
        if (!listL.isEmpty()) {
            g(true);
            TextView textView = this.j;
            if (diiVar != null) {
                textView.setText(Html.fromHtml(resources.getString(R.string.mdx_pref_pair_with_tv_header_connected, diiVar.e)));
                if (!Objects.equals(this.C, diiVar)) {
                    twb.b(this.h, this.j, resources.getString(R.string.mdx_pref_pair_with_tv_header_connected_content_description, diiVar.e));
                }
            } else {
                textView.setText(R.string.mdx_pref_pair_with_tv_header_normal);
                dii diiVar2 = this.C;
                if (diiVar2 != null) {
                    twb.b(this.h, this.j, resources.getString(R.string.mdx_pref_pair_with_tv_header_disconnected_content_description, diiVar2.e));
                }
            }
        } else if (this.v) {
            g(false);
            this.j.setText(R.string.mdx_pref_pair_with_tv_header_with_wifi);
            this.o.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_with_wifi_summary);
            this.p.setText(f());
            this.q.setText(e());
            this.g.l(new xgj(xhb.b(27852)));
        } else {
            g(false);
            this.j.setText(R.string.mdx_pref_pair_with_tv_header_no_wifi);
            this.o.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_no_wifi_summary);
            this.p.setText(f());
            this.q.setText(e());
            this.g.l(new xgj(xhb.b(27851)));
        }
        yar yarVar = this.E;
        boolean zIsEmpty = yarVar.e.isEmpty();
        int i3 = true != zIsEmpty ? 0 : 8;
        this.s.setVisibility(i3);
        this.t.setVisibility(i3);
        if (!zIsEmpty) {
            this.g.l(new xgj(xhb.b(27853)));
        }
        this.r.setVisibility(diiVar == null ? 0 : 8);
        if (diiVar == null) {
            this.g.l(new xgj(xhb.b(27849)));
        }
        this.C = diiVar;
        int childCount = this.k.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            } else {
                this.l.add(this.k.getChildAt(childCount));
            }
        }
        this.k.removeAllViews();
        int i4 = 0;
        ?? From = LayoutInflater.from(this.h);
        while (i4 < listL.size()) {
            if (this.l.isEmpty()) {
                viewInflate = From.inflate(R.layout.mdx_pair_with_tv_row, this.k, r4);
                ahgbVar = new ahgb(viewInflate, this.m);
                viewInflate.setTag(ahgbVar);
            } else {
                viewInflate = (View) this.l.remove(r4);
                ahgbVar = (ahgb) viewInflate.getTag();
            }
            dii diiVar3 = (dii) listL.get(i4);
            xgn xgnVar = this.g;
            dii diiVar4 = this.C;
            if (xrx.j(diiVar3)) {
                String strA = xrx.a(diiVar3);
                if (strA != null && (xvpVarA = yarVar.a(strA)) != null && xvpVarA.h != null) {
                    airx airxVar = xvpVarA.b;
                    aisk aiskVar = airxVar.h;
                    if (aiskVar == null) {
                        aiskVar = aisk.a;
                    }
                    int iBt = a.bt(aiskVar.c);
                    if (iBt == 0) {
                        iBt = i2;
                    }
                    if (iBt != 2 && iBt != i2 && ((iAV = a.aV(airxVar.c)) == 0 || iAV != 4)) {
                        r13 = i2;
                    }
                }
                r13 = r4;
            } else {
                r13 = i2;
            }
            ((TextView) ahgbVar.b).setText(diiVar3.e);
            boolean zO = diiVar3.o();
            ?? r15 = diiVar3.j == i2 ? i2 : r4;
            View view = (View) ahgbVar.d;
            Resources resources2 = view.getResources();
            List list = listL;
            ?? r17 = From;
            tym.h(view, new tyl(resources2.getDimensionPixelSize(zO ? R.dimen.mdx_pair_with_tv_row_height_selected : R.dimen.mdx_pair_with_tv_row_height_unselected), 1), ViewGroup.LayoutParams.class);
            ((View) ahgbVar.a).setVisibility(true != zO ? 8 : 0);
            xgnVar.l(new xgj(zO ? xhb.b(27848) : xhb.b(27847)));
            TextView textView2 = (TextView) ahgbVar.e;
            textView2.setContentDescription(resources2.getString(zO ? R.string.mdx_pref_pair_with_tv_unlink_button_content_description : R.string.mdx_pref_pair_with_tv_link_button_content_description));
            textView2.setTag(diiVar3);
            if (zO) {
                textView2.setText(R.string.mdx_pref_pair_with_tv_unlink_button);
            } else {
                textView2.setText(R.string.mdx_pref_pair_with_tv_link_button);
                int i5 = (diiVar4 != null || r13 == 0) ? 8 : 0;
                textView2.setVisibility(i5);
                Object obj = ahgbVar.c;
                if (1 != r15) {
                    i = 8;
                } else {
                    i = 0;
                }
                ((View) obj).setVisibility(i);
                this.k.addView(viewInflate);
                i4++;
                i2 = 1;
                listL = list;
                From = r17;
                r4 = 0;
            }
            if (r15 == 0) {
            }
            textView2.setVisibility(i5);
            Object obj2 = ahgbVar.c;
            if (1 != r15) {
                i = 8;
            } else {
                i = 0;
            }
            ((View) obj2).setVisibility(i);
            this.k.addView(viewInflate);
            i4++;
            i2 = 1;
            listL = list;
            From = r17;
            r4 = 0;
        }
    }

    protected final void d() {
        ConnectivityManager connectivityManager = this.B;
        if (connectivityManager == null) {
            connectivityManager = (ConnectivityManager) this.h.getSystemService("connectivity");
            this.B = connectivityManager;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            z = true;
        }
        this.v = z;
    }
}

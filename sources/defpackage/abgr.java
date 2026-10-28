package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abgr extends abgs implements View.OnClickListener, abgm {
    private static final float[] c = {0.0f, 1.31072E8f};
    private static final int[] d = {-1, -1};
    private static final float[] e = {0.0f, 15.0f, 30.0f, 60.0f, 90.0f, 120.0f};
    private static final int[] f = {-16777216, -151967, -1641064, -10042715, -13465411, -1};
    private TextView A;
    private TextView B;
    private View C;
    private TextView D;
    private TextView E;
    private TextView F;
    private View G;
    private TextView H;
    private TextView I;
    private vic J;
    private vic K;
    public abgl a;
    public abmt b;
    private View g;
    private View h;
    private View i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private View q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private ImageView v;
    private TextView w;
    private ImageView x;
    private TextView y;
    private TextView z;

    public abgr(Context context) {
        super(context);
    }

    private static String x(String str) {
        return ahno.aa(str) ? "" : a.bU((byte) 93, str, " [");
    }

    @Override // defpackage.abgm
    public final void a() {
        View view = this.g;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // defpackage.acdg
    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.abgm
    public final void c(wgs wgsVar) {
        TextView textView = this.s;
        if (textView != null) {
            textView.setText(aaja.e(wgsVar));
        }
    }

    @Override // defpackage.abgm
    public final void d(float f2, boolean z) {
        String str;
        ((Paint) this.J.c).setColor(true != z ? -12671196 : -48060);
        this.v.setImageBitmap(this.J.e(f2));
        TextView textView = this.u;
        double d2 = f2;
        if (d2 < 1000000.0d) {
            str = String.format(Locale.US, " %.3g kbps", Double.valueOf(d2 / 1000.0d));
        } else {
            str = d2 < 1.0E9d ? String.format(Locale.US, " %.3g mbps", Double.valueOf(d2 / 1000000.0d)) : String.format(Locale.US, " %.3g gbps", Double.valueOf(d2 / 1.0E9d));
        }
        textView.setText(str);
    }

    @Override // defpackage.abgm
    public final void e(String str) {
        TextView textView = this.H;
        if (textView == null || this.G == null) {
            return;
        }
        if (str.isEmpty()) {
            textView.setVisibility(8);
            this.G.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.G.setVisibility(0);
            this.H.setText(str);
        }
    }

    @Override // defpackage.abgm
    public final void f(String str) {
        this.j.setText(str);
    }

    @Override // defpackage.abgm
    public final void g(int i, int i2) {
        this.z.setText(i + " / " + (i + i2));
    }

    @Override // defpackage.abgm
    public final void h(String str) {
        if (this.b.bn()) {
            this.I.setText(str);
        }
    }

    @Override // defpackage.abgm
    public final void i(long j) {
        View view = this.C;
        if (j == -1) {
            view.setVisibility(8);
            this.D.setVisibility(8);
        } else {
            view.setVisibility(0);
            this.D.setVisibility(0);
            this.D.setText(String.format(Locale.US, "%.2fs", Float.valueOf(j / 1000.0f)));
        }
    }

    @Override // defpackage.abgm
    public final void j(abgl abglVar) {
        this.a = abglVar;
    }

    @Override // defpackage.abgm
    public final void k(agev agevVar) {
        boolean zG = agevVar.g();
        TextView textView = this.E;
        if (!zG) {
            textView.setVisibility(8);
            this.F.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.F.setVisibility(0);
            this.F.setText((CharSequence) agevVar.c());
        }
    }

    @Override // defpackage.abgm
    public final void l(String str) {
        this.m.setText(str);
    }

    @Override // defpackage.abgm
    public final void m(String str) {
        this.o.setText(x(str));
    }

    @Override // defpackage.abgm
    public final void n(String str) {
        this.n.setText(x(str));
    }

    @Override // defpackage.abgm
    public final void o(long j) {
        float f2 = j / 1000.0f;
        this.x.setImageBitmap(this.K.e(f2));
        this.w.setText(String.format(Locale.US, " %.3g s", Float.valueOf(f2)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.h) {
            this.a.h();
            this.J.f();
            this.K.f();
        } else if (view == this.i) {
            this.a.g();
        }
    }

    @Override // defpackage.abgm
    public final void p(String str) {
        this.l.setText(str);
    }

    @Override // defpackage.abgm
    public final void q(wgs wgsVar) {
        TextView textView = this.p;
        if (textView != null) {
            textView.setText(aaja.e(wgsVar));
        }
    }

    @Override // defpackage.abgm
    public final void r(wiz wizVar) {
        if (this.r != null) {
            if (wizVar == null || wizVar == wiz.e || wizVar == wiz.a) {
                this.q.setVisibility(8);
                this.r.setVisibility(8);
            } else {
                this.q.setVisibility(0);
                this.r.setVisibility(0);
                this.r.setText(wizVar.toString().toLowerCase(Locale.US));
            }
        }
    }

    @Override // defpackage.abgm
    public final void s(String str) {
        this.k.setText(str);
    }

    @Override // defpackage.abgm
    public final void t(zkj zkjVar) {
        this.y.setText(zkjVar.toString());
    }

    @Override // defpackage.abgm
    public final void u(int i, yvd yvdVar) {
        String str;
        String strCd;
        TextView textView = this.t;
        if (textView != null) {
            Float f2 = yvdVar.c;
            int iRound = Math.round(yvdVar.f * i);
            String str2 = "-";
            if (f2 == null) {
                str = "-";
            } else {
                str = (Math.round(((double) f2.floatValue()) * 10.0d) / 10.0d) + "LK";
            }
            String str3 = i + "%/" + iRound + "%(F:" + str;
            if (yvdVar.a.equals("UNKNOWN")) {
                Float f3 = yvdVar.d;
                if (f3 != null) {
                    str2 = (Math.round(((double) f3.floatValue()) * 10.0d) / 10.0d) + "LK";
                }
                strCd = a.cd(str2, str3, "/G: ");
            } else {
                Float f4 = yvdVar.b;
                String strConcat = f4 == null ? "-" : f4.toString().concat("LK");
                Float f5 = yvdVar.e;
                if (f5 != null) {
                    str2 = (Math.round(((double) f5.floatValue()) * 10.0d) / 10.0d) + "LK";
                }
                strCd = str3 + "/T: " + strConcat + "/G: " + str2;
            }
            textView.setText(strCd.concat(")"));
        }
    }

    @Override // defpackage.abgm
    public final void v() {
        if (this.g == null) {
            LayoutInflater.from(getContext()).inflate(true != this.b.g.l(461, 45811633L, false) ? R.layout.default_nerd_stats_overlay : R.layout.default_nerd_stats_overlay_scrollable, this);
            this.g = findViewById(R.id.nerd_stats_layout);
            View viewFindViewById = findViewById(R.id.dismiss_button);
            this.h = viewFindViewById;
            viewFindViewById.setOnClickListener(this);
            this.h.setVisibility(0);
            View viewFindViewById2 = findViewById(R.id.copy_debug_info_button);
            this.i = viewFindViewById2;
            viewFindViewById2.setOnClickListener(this);
            this.i.setVisibility(0);
            this.j = (TextView) findViewById(R.id.device_info);
            this.k = (TextView) findViewById(R.id.video_id);
            this.l = (TextView) findViewById(R.id.scpn);
            this.n = (TextView) findViewById(R.id.player_type);
            this.o = (TextView) findViewById(R.id.playback_type);
            this.p = (TextView) findViewById(R.id.video_format);
            this.s = (TextView) findViewById(R.id.audio_format);
            this.t = (TextView) findViewById(R.id.volume);
            this.u = (TextView) findViewById(R.id.bandwidth_estimate);
            this.v = (ImageView) findViewById(R.id.bandwidth_sparkline);
            this.w = (TextView) findViewById(R.id.readahead);
            this.x = (ImageView) findViewById(R.id.readahead_sparkline);
            this.y = (TextView) findViewById(R.id.viewport);
            this.z = (TextView) findViewById(R.id.dropped_frames);
            this.A = (TextView) findViewById(R.id.battery_current_title);
            this.B = (TextView) findViewById(R.id.battery_current);
            this.m = (TextView) findViewById(R.id.mystery_text);
            this.C = findViewById(R.id.latency_title);
            this.D = (TextView) findViewById(R.id.latency);
            this.E = (TextView) findViewById(R.id.live_mode_title);
            this.F = (TextView) findViewById(R.id.live_mode);
            this.q = findViewById(R.id.video_gl_rendering_mode_title);
            this.r = (TextView) findViewById(R.id.video_gl_rendering_mode);
            this.H = (TextView) findViewById(R.id.content_protection);
            this.G = findViewById(R.id.content_protection_title);
            this.I = (TextView) findViewById(R.id.format_debug_info);
            if (this.b.bn()) {
                findViewById(R.id.format_debug_info_title).setVisibility(0);
                this.I.setVisibility(0);
            }
            this.C.measure(0, 0);
            int iC = twm.c(getResources().getDisplayMetrics(), 100);
            int measuredHeight = this.C.getMeasuredHeight() - 1;
            this.J = new vic(iC, measuredHeight, c, d);
            this.K = new vic(iC, measuredHeight, e, f);
            this.A.setVisibility(8);
            this.B.setVisibility(8);
            this.E.setVisibility(8);
            this.F.setVisibility(8);
        }
        this.g.setVisibility(0);
    }
}

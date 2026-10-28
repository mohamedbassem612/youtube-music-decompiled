package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.TouchImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwj implements View.OnClickListener {
    private final jnm A;
    public final View a;
    public final avmb b;
    public boolean c;
    private final xgn e;
    private final aunn f;
    private final aunn g;
    private final aunn h;
    private final View i;
    private final ImageView j;
    private final TextView k;
    private final TextView l;
    private final Button m;
    private final Button n;
    private final Button o;
    private final TouchImageView p;
    private final hwi q;
    private final jbm r;
    private final jbm s;
    private final jbm t;
    private aboe u;
    private final tfq w;
    private final ycp x;
    private final jin y;
    private final hbf z;
    private hww v = hww.a;
    public final hwf d = new hwf(this);

    public hwj(jnm jnmVar, tfq tfqVar, ycp ycpVar, jin jinVar, jij jijVar, hbf hbfVar, avmb avmbVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, vxz vxzVar, xgn xgnVar, View view, hwi hwiVar) {
        this.A = jnmVar;
        this.w = tfqVar;
        this.x = ycpVar;
        this.y = jinVar;
        this.e = xgnVar;
        this.z = hbfVar;
        this.b = avmbVar;
        this.f = aunnVar;
        this.g = aunnVar2;
        this.h = aunnVar3;
        this.a = view;
        if (vxzVar.l(95, 45762151L, false)) {
            view.setBackground(null);
        }
        View viewFindViewById = view.findViewById(R.id.music_playback_error_v2);
        this.i = viewFindViewById;
        TouchImageView touchImageView = (TouchImageView) view.findViewById(R.id.player_error_collapse_button_v2);
        this.p = touchImageView;
        this.j = (ImageView) viewFindViewById.findViewById(R.id.player_error_icon_v2);
        this.k = (TextView) viewFindViewById.findViewById(R.id.player_error_text_v2);
        this.l = (TextView) viewFindViewById.findViewById(R.id.player_error_subtext_v2);
        Button button = (Button) viewFindViewById.findViewById(R.id.player_error_retry_v2);
        this.m = button;
        Button button2 = (Button) viewFindViewById.findViewById(R.id.player_error_browse_v2);
        this.n = button2;
        Button button3 = (Button) viewFindViewById.findViewById(R.id.player_error_upsell);
        this.o = button3;
        this.r = jijVar.a(button, null, this, null, false);
        this.s = jijVar.a(button2, null, this, null, false);
        this.t = jijVar.a(button3, null, this, null, false);
        touchImageView.setOnClickListener(this);
        this.q = hwiVar;
        xgnVar.d(new xgj(xhb.b(156249)));
        xgnVar.d(new xgj(xhb.b(159594)));
        xgnVar.d(new xgj(xhb.b(159593)));
        xgnVar.d(new xgj(xhb.b(293230)));
    }

    private final void e(int i) {
        this.e.w(new xgj(xhb.b(i)), null);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0216  */
    /* JADX WARN: Code duplicated, block: B:107:0x021c  */
    /* JADX WARN: Code duplicated, block: B:89:0x01df  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:96:0x0202  */
    private final void f() {
        abgh abghVar;
        abgh abghVar2;
        boolean z;
        boolean z2;
        aboe aboeVar;
        int i;
        String str;
        CharSequence charSequenceK;
        aoqp aoqpVar;
        if (this.u != null) {
            e(156249);
            TouchImageView touchImageView = this.p;
            aunn aunnVar = this.f;
            touchImageView.setImageResource(((adxj) aunnVar.io()).b(arqz.fP));
            this.j.setImageResource(((adxj) aunnVar.io()).b(arqz.eb));
            aboe aboeVar2 = this.u;
            aoqp aoqpVar2 = aboeVar2.f;
            if (aoqpVar2 == null || (aoqpVar2.b & 1) == 0) {
                charSequenceK = aboeVar2.c;
            } else {
                alay alayVar = aoqpVar2.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                charSequenceK = ackj.k(null, alayVar, (ackf) this.g.io(), false);
            }
            int i2 = this.u.j;
            if (i2 == 3) {
                TextView textView = this.k;
                textView.setText(this.c ? ((Context) this.z.a).getString(R.string.playback_error_episode_unavailable) : textView.getContext().getString(R.string.playback_error_song_unavailable));
                this.l.setText(charSequenceK);
                this.s.i(this.n.getContext().getString(R.string.playback_browse), 27, 2);
            } else if (i2 != 4 || this.w.i()) {
                this.k.setText(R.string.common_error_generic);
                this.l.setText(charSequenceK);
                if (g() && (aoqpVar = this.u.f) != null) {
                    jbm jbmVar = this.t;
                    adly adlyVar = new adly();
                    ajng ajngVar = aoqpVar.d;
                    if (ajngVar == null) {
                        ajngVar = ajng.a;
                    }
                    ajnf ajnfVar = ajngVar.c;
                    if (ajnfVar == null) {
                        ajnfVar = ajnf.a;
                    }
                    aihh aihhVar = (aihh) ajnfVar.toBuilder();
                    aihhVar.copyOnWrite();
                    ajnf ajnfVar2 = (ajnf) aihhVar.instance;
                    ajnfVar2.d = 26;
                    ajnfVar2.c = 1;
                    aihhVar.copyOnWrite();
                    ajnf ajnfVar3 = (ajnf) aihhVar.instance;
                    ajnfVar3.i = 1;
                    ajnfVar3.b |= 1;
                    jbmVar.hU(adlyVar, (ajnf) aihhVar.build());
                }
            } else {
                this.k.setText(R.string.no_connection);
                this.l.setText(R.string.playback_error_no_connection_subtext);
                this.s.i(this.n.getContext().getString(R.string.offline_music), 27, 2);
            }
        }
        abgi abgiVar = this.u != null ? new abgi(abgh.d, false) : new abgi(abgh.a, false);
        hww hwwVar = this.v;
        boolean z3 = hwwVar == hww.b || hwwVar == hww.l || hwwVar == hww.i;
        View view = this.a;
        Context context = view.getContext();
        aboe aboeVar3 = this.u;
        boolean z4 = aboeVar3 != null && ((i = aboeVar3.j) == 4 || (i == 10 && (str = aboeVar3.c) != null && (str.equals(context.getString(R.string.connection_to_server_lost)) || str.equals(context.getString(R.string.unable_to_connect)) || str.equals(context.getString(R.string.common_no_network)))));
        tfq tfqVar = this.w;
        jnm jnmVar = this.A;
        boolean zI = tfqVar.i();
        boolean zC = jnmVar.C();
        boolean z5 = abgiVar.a() && !z3;
        tuk.l(view, z5);
        tuk.l(this.i, z5);
        boolean z6 = abgiVar.a() && !z3 && z4 && !zI && zC;
        aboe aboeVar4 = this.u;
        if (aboeVar4 == null || aboeVar4.j != 3) {
            tuk.l(this.n, z6);
            if (z6) {
            }
            abghVar = abgiVar.a;
            abghVar2 = abgh.d;
            if (abghVar.equals(abghVar2) || !g()) {
                z = false;
            } else {
                z = true;
            }
            tuk.l(this.o, z);
            if (z) {
                e(293230);
            }
            jbm jbmVar2 = this.r;
            Button button = this.m;
            jbmVar2.i(button.getContext().getString(R.string.yt_lib_common_retry), (!z6 || z) ? 35 : 27, 2);
            if (abghVar.equals(abghVar2) || (aboeVar = this.u) == null || aboeVar.j == 3) {
                z2 = false;
            } else {
                z2 = true;
            }
            tuk.l(button, z2);
            if (z2) {
                e(159593);
            }
            tuk.l(this.p, this.v.b(hww.h));
        }
        tuk.l(this.n, true);
        e(159594);
        abghVar = abgiVar.a;
        abghVar2 = abgh.d;
        if (abghVar.equals(abghVar2)) {
            z = false;
        } else {
            z = false;
        }
        tuk.l(this.o, z);
        if (z) {
            e(293230);
        }
        jbm jbmVar3 = this.r;
        Button button2 = this.m;
        jbmVar3.i(button2.getContext().getString(R.string.yt_lib_common_retry), (!z6 || z) ? 35 : 27, 2);
        if (abghVar.equals(abghVar2)) {
            z2 = false;
        } else {
            z2 = false;
        }
        tuk.l(button2, z2);
        if (z2) {
            e(159593);
        }
        tuk.l(this.p, this.v.b(hww.h));
    }

    private final boolean g() {
        aboe aboeVar;
        aoqp aoqpVar;
        return (!((vxz) this.h.io()).l(302, 45735140L, false) || (aboeVar = this.u) == null || aboeVar.j != 9 || (aoqpVar = aboeVar.f) == null || (aoqpVar.b & 8) == 0) ? false : true;
    }

    public final void a(aboe aboeVar) {
        aboe aboeVar2;
        this.u = aboeVar;
        f();
        yco ycoVar = this.x.e;
        if (ycoVar == null || ycoVar.b() != 1 || (aboeVar2 = this.u) == null || aboeVar2.j != 3) {
            return;
        }
        jin jinVar = this.y;
        View view = this.a;
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(view.getResources().getText(R.string.toast_skip_track));
        jinVar.d(jioVarE.b());
    }

    public final void b(boolean z) {
        if (z) {
            d(0.0f);
        }
    }

    public final void c(hww hwwVar) {
        this.v = hwwVar;
        f();
    }

    public final void d(float f) {
        ImageView imageView = this.j;
        this.i.setTranslationY((imageView.getMeasuredHeight() * (-f)) / 2.0f);
        imageView.setAlpha((float) Math.pow(1.0f - f, 2.0d));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hwi hwiVar = this.q;
        if (hwiVar != null) {
            if (view == this.m) {
                hwiVar.O();
                this.e.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(159593)), null);
                return;
            }
            if (view == this.n) {
                aboe aboeVar = this.u;
                if (aboeVar == null || aboeVar.j != 3) {
                    hwiVar.N();
                } else {
                    hwiVar.L();
                }
                this.e.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(159594)), null);
                return;
            }
            if (view == this.p) {
                hwiVar.M();
            } else if (view == this.o) {
                this.e.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(293230)), null);
            }
        }
    }
}

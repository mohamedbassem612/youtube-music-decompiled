package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class xay extends xad {
    private final wbz A;
    private final avmb B;
    private final ImageView C;
    private final ImageView D;
    private long E;
    private long F;
    private long G;
    private final LinearLayout H;
    private final LinearLayout I;
    private String J;
    private String K;
    private String L;
    private final ConstraintLayout M;
    private String N;
    private final String O;
    private aliz P;
    private aliz Q;
    private aliz R;
    private int S;
    private final wwn T;
    private int U;
    public final zvl k;
    public final TextView l;
    public final LinearLayout m;
    public String n;
    public AnimatorSet o;
    private final aduv p;
    private final adia q;
    private final xgz r;
    private final zwb s;
    private final TextView t;
    private final ImageView u;
    private final adia v;
    private avmn w;
    private avmn x;
    private avmn y;
    private avmn z;

    public xay(Context context, wwn wwnVar, avmb avmbVar, zwb zwbVar, aduv aduvVar, xgm xgmVar, vxe vxeVar, adhv adhvVar, wbz wbzVar, zvl zvlVar, vxz vxzVar) {
        super(context, xgmVar, vxeVar, vxzVar);
        this.T = wwnVar;
        xgt xgtVarA = xgmVar.hB().a();
        if (xgtVarA != null) {
            this.r = new xgx(xgtVarA, xhb.b(70098));
        } else {
            this.r = new xgj(xhb.b(70098));
        }
        ImageView imageView = (ImageView) this.b.findViewById(R.id.currency_image);
        this.u = imageView;
        this.v = new adia(adhvVar, imageView, false);
        this.q = new adia(adhvVar, this.c, false);
        this.p = aduvVar;
        this.s = zwbVar;
        this.A = wbzVar;
        this.k = zvlVar;
        this.B = avmbVar;
        this.M = (ConstraintLayout) this.b.findViewById(R.id.content_container);
        this.m = (LinearLayout) this.b.findViewById(R.id.state_container);
        this.t = (TextView) this.b.findViewById(R.id.like_count_text);
        this.C = (ImageView) this.b.findViewById(R.id.like_icon);
        this.H = (LinearLayout) this.b.findViewById(R.id.like_container);
        this.I = (LinearLayout) this.b.findViewById(R.id.reply_container);
        this.l = (TextView) this.b.findViewById(R.id.reply_count_text);
        this.D = (ImageView) this.b.findViewById(R.id.reply_icon);
        this.U = 1;
        this.n = "0";
        this.N = "0";
        this.O = "1";
        aliz alizVar = aliz.UNKNOWN;
        this.P = alizVar;
        this.Q = alizVar;
        this.R = alizVar;
        this.J = "";
        this.K = "";
        this.L = "";
        this.o = new AnimatorSet();
    }

    private final String x(akuv akuvVar, amky amkyVar) {
        boolean z = false;
        if (akuvVar != null && akuvVar.getLikeState() == akus.TOOLBAR_LIKE_STATE_LIKED) {
            z = true;
        }
        if (amkyVar == null) {
            return z ? this.O : this.N;
        }
        return z ? amkyVar.getLikeCountIfLiked().c : amkyVar.getLikeCountIfIndifferent().c;
    }

    private static final long y(akuv akuvVar, amky amkyVar) {
        boolean z = false;
        if (akuvVar != null && akuvVar.getLikeState() == akus.TOOLBAR_LIKE_STATE_LIKED) {
            z = true;
        }
        if (amkyVar == null) {
            return z ? 1L : 0L;
        }
        return (z ? amkyVar.getLikeCountIfLikedNumber() : amkyVar.getLikeCountIfIndifferentNumber()).longValue();
    }

    @Override // defpackage.xad, defpackage.adma
    public final void b(admh admhVar) {
        super.b(admhVar);
        this.v.a();
        this.q.a();
        Object obj = this.w;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        Object obj2 = this.y;
        if (obj2 != null) {
            avnr.b((AtomicReference) obj2);
        }
        Object obj3 = this.x;
        if (obj3 != null) {
            avnr.b((AtomicReference) obj3);
        }
        Object obj4 = this.z;
        if (obj4 != null) {
            avnr.b((AtomicReference) obj4);
        }
    }

    @Override // defpackage.xad
    protected final /* synthetic */ int d(Object obj) {
        return ((amrc) obj).e;
    }

    @Override // defpackage.xad
    protected final /* synthetic */ int e(Object obj) {
        return ((amrc) obj).g;
    }

    @Override // defpackage.xad
    protected final /* synthetic */ int g(Object obj) {
        return ((amrc) obj).f;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ long h(Object obj) {
        return ((long) ((amrc) obj).j) * 1000;
    }

    @Override // defpackage.xad, defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        aqmh aqmhVar;
        xby xbyVarP;
        amrc amrcVar = (amrc) obj;
        super.hU(adlyVar, amrcVar);
        if (amrcVar == null) {
            aqmhVar = null;
        } else {
            akji akjiVar = amrcVar.h;
            if (akjiVar == null) {
                akjiVar = akji.a;
            }
            aqmhVar = akjiVar.b;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
        }
        boolean zO = aawb.O(aqmhVar);
        ImageView imageView = this.u;
        if (zO) {
            imageView.setVisibility(0);
            this.v.f(aqmhVar, null);
        } else {
            imageView.setVisibility(8);
        }
        Object obj2 = this.w;
        if (obj2 != null) {
            avnr.b((AtomicReference) obj2);
        }
        Object obj3 = this.y;
        if (obj3 != null) {
            avnr.b((AtomicReference) obj3);
        }
        Object obj4 = this.x;
        if (obj4 != null) {
            avnr.b((AtomicReference) obj4);
        }
        Object obj5 = this.z;
        if (obj5 != null) {
            avnr.b((AtomicReference) obj5);
        }
        int i = 1;
        if ((amrcVar.b & 65536) != 0) {
            amqz amqzVar = amrcVar.p;
            if (amqzVar == null) {
                amqzVar = amqz.a;
            }
            this.S = amrcVar.e;
            this.E = amqzVar.k;
            this.F = amqzVar.l;
            this.G = amqzVar.j;
            askp askpVar = amqzVar.i;
            if (askpVar == null) {
                askpVar = askp.a;
            }
            this.n = askpVar.c;
            Resources resources = this.a.getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_ticker_item_min_width);
            int i2 = amqzVar.b;
            if ((i2 & 1) != 0 && (i2 & 2) != 0) {
                dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_ticker_item_min_width_two_stats);
            }
            ConstraintLayout constraintLayout = this.M;
            constraintLayout.setMinimumWidth(dimensionPixelOffset);
            if (dimensionPixelOffset != constraintLayout.d) {
                constraintLayout.d = dimensionPixelOffset;
                constraintLayout.requestLayout();
            }
            if ((amqzVar.b & 1) != 0) {
                this.H.setVisibility(0);
                TextView textView = this.t;
                textView.setTextColor(this.S);
                this.J = amqzVar.e;
                this.K = amqzVar.c;
                this.N = this.n;
                alja aljaVar = amqzVar.g;
                if (aljaVar == null) {
                    aljaVar = alja.a;
                }
                aliz alizVarA = aliz.a(aljaVar.c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                this.P = alizVarA;
                alja aljaVar2 = amqzVar.f;
                if (aljaVar2 == null) {
                    aljaVar2 = alja.a;
                }
                aliz alizVarA2 = aliz.a(aljaVar2.c);
                if (alizVarA2 == null) {
                    alizVarA2 = aliz.UNKNOWN;
                }
                this.Q = alizVarA2;
                akuv akuvVarT = t();
                textView.setText(x(akuvVarT, u()));
                aliz alizVar = this.Q;
                if (akuvVarT != null && akuvVarT.getLikeState() == akus.TOOLBAR_LIKE_STATE_LIKED) {
                    alizVar = this.P;
                }
                ImageView imageView2 = this.C;
                imageView2.setImageResource(this.p.a(alizVar));
                imageView2.getDrawable().setTint(this.S);
                wbz wbzVar = this.A;
                zwb zwbVar = this.s;
                avlr avlrVarJ = wbzVar.b(zwbVar.e()).j(this.J, false);
                avmb avmbVar = this.B;
                this.y = avlrVarJ.O(avmbVar).ag(new vva(this, 20), new vqe(13));
                this.x = wbzVar.b(zwbVar.e()).j(this.K, false).O(avmbVar).ag(new xbo(this, i), new vqe(14));
            }
            if ((amqzVar.b & 2) != 0) {
                LinearLayout linearLayout = this.I;
                linearLayout.setVisibility(0);
                TextView textView2 = this.l;
                textView2.setTextColor(this.S);
                this.L = amqzVar.d;
                if ((amqzVar.b & 1) == 0) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.setMarginStart(0);
                    }
                    linearLayout.setLayoutParams(layoutParams);
                }
                alja aljaVar3 = amqzVar.h;
                if (aljaVar3 == null) {
                    aljaVar3 = alja.a;
                }
                aliz alizVarA3 = aliz.a(aljaVar3.c);
                if (alizVarA3 == null) {
                    alizVarA3 = aliz.UNKNOWN;
                }
                this.R = alizVarA3;
                wbz wbzVar2 = this.A;
                zwb zwbVar2 = this.s;
                apka apkaVar = (apka) wbzVar2.b(zwbVar2.e()).g(this.L).g(apka.class).E();
                if (apkaVar != null) {
                    textView2.setText(apkaVar.getReplyCount().c);
                } else {
                    textView2.setText(this.n);
                }
                ImageView imageView3 = this.D;
                imageView3.setImageResource(this.p.a(this.R));
                imageView3.getDrawable().setTint(this.S);
                this.z = wbzVar2.b(zwbVar2.e()).j(this.L, false).O(this.B).ag(new vva(this, 18), new vva(this, 19));
            }
            wxr wxrVarF = this.T.f();
            if (wxrVarF != null) {
                xbn xbnVar = (xbn) wxrVarF;
                this.w = ((!xbnVar.w.m(26, 45629546L) || (xbyVarP = xbnVar.p()) == null) ? xbnVar.r : xbyVarP.l).af(new vva(this, 17));
            }
        }
        int iAV = a.aV(amrcVar.q);
        this.U = iAV != 0 ? iAV : 1;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ long i(Object obj) {
        return ((long) ((amrc) obj).k) * 1000;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ Spanned j(Object obj) {
        alay alayVar;
        amrc amrcVar = (amrc) obj;
        int i = amrcVar.b;
        if ((32768 & i) != 0) {
            alayVar = amrcVar.o;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else if ((i & 2) != 0) {
            alayVar = amrcVar.d;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        return ackj.k(null, alayVar, null, false);
    }

    @Override // defpackage.xad
    protected final xgz k() {
        return this.r;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ ajwo l(Object obj) {
        amrc amrcVar = (amrc) obj;
        if ((amrcVar.b & SemanticState.Obscured) != 0) {
            ajwo ajwoVar = amrcVar.m;
            return ajwoVar == null ? ajwo.a : ajwoVar;
        }
        ajwo ajwoVar2 = amrcVar.l;
        return ajwoVar2 == null ? ajwo.a : ajwoVar2;
    }

    @Override // defpackage.xad
    protected final /* bridge */ /* synthetic */ String m(Object obj) {
        return null;
    }

    @Override // defpackage.xad
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        aqmh aqmhVar = ((amrc) obj).i;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        this.q.f(aqmhVar, null);
    }

    @Override // defpackage.xad
    protected final /* synthetic */ boolean s(Object obj) {
        return (((amrc) obj).b & 32768) != 0;
    }

    public final akuv t() {
        return (akuv) this.A.b(this.s.e()).g(this.J).g(akuv.class).E();
    }

    public final amky u() {
        return (amky) this.A.b(this.s.e()).g(this.K).g(amky.class).E();
    }

    public final void v(String str, String str2, TextView textView) {
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        LinearLayout linearLayout = this.m;
        ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(this.G);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(this.G);
        duration2.addListener(new xav(this));
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.TRANSLATION_Y, 10.0f, 0.0f).setDuration(this.G);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.TRANSLATION_Y, 0.0f, 10.0f).setDuration(this.G);
        TextView textView2 = this.e;
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(this.G);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(this.G);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) View.TRANSLATION_Y, -10.0f, 0.0f).setDuration(this.G);
        ObjectAnimator duration8 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) View.TRANSLATION_Y, 0.0f, -10.0f).setDuration(this.G);
        ValueAnimator duration9 = ValueAnimator.ofInt(0, 0).setDuration(this.F);
        duration9.addListener(new xaw(textView, str2));
        AnimatorSet animatorSet = new AnimatorSet();
        textView.setText(str);
        linearLayout.setVisibility(0);
        if (this.o.isRunning()) {
            animatorSet.play(duration9);
        } else {
            xgn xgnVar = this.g;
            xgz xgzVar = this.r;
            aihf aihfVarCreateBuilder2 = amcw.a.createBuilder();
            int i = this.U;
            aihfVarCreateBuilder2.copyOnWrite();
            amcw amcwVar = (amcw) aihfVarCreateBuilder2.instance;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            amcwVar.c = i2;
            amcwVar.b |= 1;
            amcw amcwVar2 = (amcw) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
            amcwVar2.getClass();
            amddVar.A = amcwVar2;
            amddVar.d |= 65536;
            xgnVar.A(xgzVar, (amdd) aihfVarCreateBuilder.build());
            duration.addListener(new xax(this, animatorSet));
            animatorSet.playTogether(duration, duration3, duration6, duration8);
            animatorSet.play(duration9).after(duration);
            animatorSet.playTogether(duration2, duration4, duration5, duration7);
            animatorSet.play(duration2).after(duration9);
            animatorSet.play(duration9).after(this.E);
        }
        animatorSet.start();
    }

    public final void w(akuv akuvVar, amky amkyVar, akuv akuvVar2, amky amkyVar2) {
        String strX = x(akuvVar, amkyVar);
        long jY = y(akuvVar, amkyVar);
        String strX2 = x(akuvVar2, amkyVar2);
        if (jY <= y(akuvVar2, amkyVar2) || strX.equals(strX2)) {
            this.t.setText(strX);
        } else {
            v(strX2, strX, this.t);
        }
        if (akuvVar != null) {
            aliz alizVar = akuvVar.getLikeState() == akus.TOOLBAR_LIKE_STATE_LIKED ? this.P : this.Q;
            ImageView imageView = this.C;
            imageView.setImageResource(this.p.a(alizVar));
            imageView.getDrawable().setTint(this.S);
        }
    }
}

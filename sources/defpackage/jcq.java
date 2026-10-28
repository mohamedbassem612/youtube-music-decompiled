package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jcq implements adma {
    private final admd a;
    private final aduv b;
    private jbm c;
    private jbm d;
    private final vxe e;
    private final Context f;
    private View g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private YouTubeButton l;
    private YouTubeButton m;
    private View n;
    private View o;
    private final jij p;

    public jcq(Context context, aduv aduvVar, jij jijVar, vxe vxeVar) {
        this.a = new jdw(context);
        context.getClass();
        this.f = context;
        aduvVar.getClass();
        this.b = aduvVar;
        this.p = jijVar;
        vxeVar.getClass();
        this.e = vxeVar;
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.a).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.j;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x01f9  */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        CharSequence charSequenceA;
        angn angnVar = (angn) obj;
        ango angoVar = angnVar.g;
        if (angoVar == null) {
            angoVar = ango.a;
        }
        int iP = aext.p(angoVar.b);
        if (iP == 0) {
            iP = 1;
        }
        Context context = this.f;
        alay alayVar2 = null;
        View viewInflate = View.inflate(context, iP == 3 ? R.layout.message_item_horizontal : R.layout.message_item, null);
        this.g = viewInflate;
        this.h = (ImageView) viewInflate.findViewById(R.id.message_icon);
        this.i = (TextView) this.g.findViewById(R.id.message_text);
        this.j = (TextView) this.g.findViewById(R.id.simple_header_message_text);
        this.k = (TextView) this.g.findViewById(R.id.message_subtext);
        this.l = (YouTubeButton) this.g.findViewById(R.id.button);
        this.m = (YouTubeButton) this.g.findViewById(R.id.secondary_button);
        this.n = this.g.findViewById(R.id.message_top_divider);
        this.o = this.g.findViewById(R.id.message_bottom_divider);
        jij jijVar = this.p;
        this.c = jijVar.a(this.l, null, null, null, false);
        YouTubeButton youTubeButton = this.m;
        this.d = youTubeButton == null ? null : jijVar.a(youTubeButton, null, null, null, false);
        admd admdVar = this.a;
        admdVar.c(this.g);
        this.n.setVisibility(8);
        this.o.setVisibility(8);
        int i = angnVar.c;
        if (i == 2) {
            aduv aduvVar = this.b;
            aliz alizVarA = aliz.a((i == 2 ? (angt) angnVar.d : angt.a).c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            int iA = aduvVar.a(alizVarA);
            if (iA == 0) {
                aliz alizVarA2 = aliz.a((angnVar.c == 2 ? (angt) angnVar.d : angt.a).c);
                if (alizVarA2 == null) {
                    alizVarA2 = aliz.UNKNOWN;
                }
                throw new IllegalArgumentException("Unsupported icon type ".concat(String.valueOf(alizVarA2.name())));
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.empty_state_icon_height);
            aduk adukVar = new aduk(context, iA);
            adukVar.c(dimensionPixelSize, dimensionPixelSize);
            Drawable drawableA = adukVar.a();
            this.h.setVisibility(0);
            this.h.setImageDrawable(drawableA);
            if (!((Boolean) adlyVar.d("messageRendererHideDivider", Boolean.FALSE)).booleanValue()) {
                this.n.setVisibility(0);
                this.o.setVisibility(0);
            }
        } else {
            this.h.setVisibility(8);
        }
        ango angoVar2 = angnVar.g;
        if (angoVar2 == null) {
            angoVar2 = ango.a;
        }
        int iP2 = aext.p(angoVar2.b);
        TextView textView = (iP2 == 0 || iP2 != 8) ? this.i : this.j;
        if ((angnVar.b & 1) != 0) {
            alayVar = angnVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        vxe vxeVar = this.e;
        tuk.u(textView, vxl.a(context, alayVar, vxeVar, false));
        angq angqVar = angnVar.f;
        if (angqVar == null) {
            angqVar = angq.a;
        }
        if ((angqVar.b & 1) != 0) {
            angq angqVar2 = angnVar.f;
            if (angqVar2 == null) {
                angqVar2 = angq.a;
            }
            angp angpVar = angqVar2.c;
            if (angpVar == null) {
                angpVar = angp.a;
            }
            if ((angpVar.b & 1) != 0) {
                angq angqVar3 = angnVar.f;
                if (angqVar3 == null) {
                    angqVar3 = angq.a;
                }
                angp angpVar2 = angqVar3.c;
                if (angpVar2 == null) {
                    angpVar2 = angp.a;
                }
                alayVar2 = angpVar2.c;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            }
            charSequenceA = vxl.a(context, alayVar2, vxeVar, false);
        } else {
            charSequenceA = "";
        }
        tuk.u(this.k, charSequenceA);
        ajng ajngVar = angnVar.h;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        if ((ajngVar.b & 1) != 0) {
            jbm jbmVar = this.c;
            ajng ajngVar2 = angnVar.h;
            if (ajngVar2 == null) {
                ajngVar2 = ajng.a;
            }
            ajnf ajnfVar = ajngVar2.c;
            if (ajnfVar == null) {
                ajnfVar = ajnf.a;
            }
            jbmVar.j(adlyVar, ajnfVar, 3);
            this.l.setVisibility(0);
        } else {
            this.l.setVisibility(8);
        }
        YouTubeButton youTubeButton2 = this.m;
        if (youTubeButton2 != null) {
            ajng ajngVar3 = angnVar.i;
            if (((ajngVar3 == null ? ajng.a : ajngVar3).b & 1) != 0) {
                jbm jbmVar2 = this.d;
                if (ajngVar3 == null) {
                    ajngVar3 = ajng.a;
                }
                ajnf ajnfVar2 = ajngVar3.c;
                if (ajnfVar2 == null) {
                    ajnfVar2 = ajnf.a;
                }
                jbmVar2.j(adlyVar, ajnfVar2, 16);
                this.m.setVisibility(0);
            } else if (youTubeButton2 != null) {
                youTubeButton2.setVisibility(8);
            }
        } else if (youTubeButton2 != null) {
            youTubeButton2.setVisibility(8);
        }
        int iIntValue = ((Integer) adlyVar.d("messageRendererLayoutTopMargin", 0)).intValue();
        if (this.g.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this.g.getLayoutParams()).topMargin = iIntValue;
            if (iIntValue != 0) {
                this.n.setVisibility(8);
                this.o.setVisibility(8);
            }
        }
        admdVar.e(adlyVar);
    }
}

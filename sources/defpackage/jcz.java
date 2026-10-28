package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jcz extends admr {
    public final TextView a;
    public final ImageButton b;
    public jig c;
    private final Context d;
    private final izf e;
    private final vxe f;
    private final admd g;
    private final View h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final View l;
    private final vxz m;

    public jcz(Context context, izf izfVar, vxe vxeVar, vxz vxzVar) {
        this.d = context;
        this.e = izfVar;
        this.f = vxeVar;
        jdw jdwVar = new jdw(context);
        this.g = jdwVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.music_description_shelf, (ViewGroup) null);
        this.h = linearLayout.findViewById(R.id.description_header_container);
        this.i = (TextView) linearLayout.findViewById(R.id.description_header);
        this.j = (TextView) linearLayout.findViewById(R.id.description_sub_header);
        this.a = (TextView) linearLayout.findViewById(R.id.description);
        this.k = (TextView) linearLayout.findViewById(R.id.footer);
        this.b = (ImageButton) linearLayout.findViewById(R.id.description_toggle_button);
        this.l = linearLayout.findViewById(R.id.description_toggle_button_container);
        jdwVar.c(linearLayout);
        this.m = vxzVar;
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.g).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        kro.Z(((jdw) this.g).a, 0, 0);
        TextView textView = this.a;
        kro.Z(textView, 0, 0);
        TextView textView2 = this.k;
        kro.Z(textView2, 0, 0);
        kro.Z(this.l, 0, 0);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        textView.setVisibility(8);
        textView2.setVisibility(8);
        ImageButton imageButton = this.b;
        imageButton.setVisibility(8);
        imageButton.setOnClickListener(null);
        jig jigVar = this.c;
        if (jigVar != null) {
            jigVar.c();
            this.c = null;
        }
    }

    @Override // defpackage.admr
    protected final /* synthetic */ void d(adly adlyVar, Object obj) {
        annb annbVar = (annb) obj;
        boolean zL = this.m.l(192, 45702665L, false);
        TextView textView = this.a;
        if (zL) {
            Context context = this.d;
            alay alayVar = annbVar.e;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            tuk.u(textView, vxl.a(context, alayVar, this.f, false));
        } else {
            alay alayVar2 = annbVar.e;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            tuk.u(textView, ackj.k(null, alayVar2, null, false));
        }
        TextView textView2 = this.i;
        alay alayVar3 = annbVar.c;
        if (alayVar3 == null) {
            alayVar3 = alay.a;
        }
        tuk.u(textView2, ackj.k(null, alayVar3, null, false));
        TextView textView3 = this.j;
        alay alayVar4 = annbVar.d;
        if (alayVar4 == null) {
            alayVar4 = alay.a;
        }
        tuk.u(textView3, ackj.k(null, alayVar4, null, false));
        TextView textView4 = this.k;
        alay alayVar5 = annbVar.f;
        if (alayVar5 == null) {
            alayVar5 = alay.a;
        }
        tuk.u(textView4, ackj.k(null, alayVar5, null, false));
        View view = this.h;
        int i = annbVar.b;
        tuk.l(view, ((i & 1) == 0 && (i & 2) == 0) ? false : true);
        int iBc = a.bc(annbVar.j);
        int i2 = R.style.TextAppearance_YouTubeMusic_Display1;
        if (iBc != 0 && iBc == 3) {
            i2 = R.style.TextAppearance_YouTubeMusic_Display2;
        }
        textView2.setTextAppearance(i2);
        apji apjiVar = annbVar.g;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        Optional optionalH = kro.H(apjiVar, ajnp.b);
        Context context2 = this.d;
        int integer = context2.getResources().getInteger(R.integer.description_collapsed_line_count);
        int i3 = annbVar.b & 64;
        int i4 = Alert.DURATION_SHOW_INDEFINITELY;
        if (i3 != 0 && (integer = annbVar.h) == 0) {
            integer = Integer.MAX_VALUE;
        }
        int integer2 = context2.getResources().getInteger(R.integer.description_expanded_line_count);
        if ((annbVar.b & SemanticState.Focused) == 0 || (integer2 = annbVar.i) != 0) {
            i4 = integer2;
        }
        TextView textView5 = this.a;
        this.c = new jig(textView5, integer, i4);
        textView5.post(new awu(this, integer, 9));
        if (!optionalH.isPresent() || (((ajno) optionalH.get()).b & 32) == 0 || (((ajno) optionalH.get()).b & SemanticState.Obscured) == 0) {
            this.b.setVisibility(8);
        } else {
            izf izfVar = this.e;
            alja aljaVar = ((ajno) optionalH.get()).e;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            final int iA = izfVar.a(alizVarA);
            alja aljaVar2 = ((ajno) optionalH.get()).h;
            if (aljaVar2 == null) {
                aljaVar2 = alja.a;
            }
            aliz alizVarA2 = aliz.a(aljaVar2.c);
            if (alizVarA2 == null) {
                alizVarA2 = aliz.UNKNOWN;
            }
            final int iA2 = izfVar.a(alizVarA2);
            alay alayVar6 = ((ajno) optionalH.get()).f;
            if (alayVar6 == null) {
                alayVar6 = alay.a;
            }
            final Spanned spannedK = ackj.k(null, alayVar6, null, false);
            alay alayVar7 = ((ajno) optionalH.get()).i;
            if (alayVar7 == null) {
                alayVar7 = alay.a;
            }
            final Spanned spannedK2 = ackj.k(null, alayVar7, null, false);
            if (this.c.d) {
                f(iA2, spannedK2);
            } else {
                f(iA, spannedK);
            }
            this.b.setOnClickListener(new View.OnClickListener() { // from class: jcy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    jcz jczVar = this.a;
                    jig jigVar = jczVar.c;
                    if (jigVar != null) {
                        if (jigVar.d) {
                            CharSequence charSequence = spannedK;
                            int i5 = iA;
                            jigVar.c();
                            jczVar.f(i5, charSequence);
                            return;
                        }
                        CharSequence charSequence2 = spannedK2;
                        int i6 = iA2;
                        jigVar.b();
                        jczVar.f(i6, charSequence2);
                    }
                }
            });
        }
        int iB = adlyVar.b("pagePadding", -1);
        kro.T(((jdw) this.g).a, adlyVar);
        if (iB > 0) {
            int iW = (context2.getResources().getDisplayMetrics().widthPixels - (jnj.w(context2) << 1)) - kro.ab(context2);
            textView5.setPaddingRelative(0, 0, iW, 0);
            textView4.setPaddingRelative(0, 0, iW, 0);
            this.l.setPaddingRelative(0, 0, iW, 0);
        }
        if (textView2 != null) {
            textView2.setTextAppearance(R.style.TextAppearance_YouTubeMusic_Display2Modern);
        }
        this.f.d(annbVar.l, null);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((annb) obj).k.G();
    }

    public final void f(int i, CharSequence charSequence) {
        ImageButton imageButton = this.b;
        imageButton.setImageResource(i);
        imageButton.setContentDescription(charSequence);
    }
}

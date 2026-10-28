package defpackage;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acwl extends acwh {
    public final abfv d;
    private final Context e;
    private final vxe f;
    private final xgn g;
    private final aduv h;
    private final tun i;
    private final acwv j;
    private final akdd k;
    private final acwm l;

    /* JADX WARN: Illegal instructions before constructor call */
    public acwl(Context context, vxe vxeVar, xgn xgnVar, abfv abfvVar, aduv aduvVar, tun tunVar, abfv abfvVar2, acwv acwvVar) {
        Object obj = acwvVar.f;
        akdd akddVar = acwvVar.a;
        super(vxeVar, abfvVar, obj, (akddVar.b & 32) != 0 ? akddVar.e : null);
        this.e = context;
        this.f = vxeVar;
        xgn xgnVar2 = acwvVar.g;
        this.g = xgnVar2 != null ? xgnVar2 : xgnVar;
        this.h = aduvVar;
        this.i = tunVar;
        this.d = abfvVar2;
        this.j = acwvVar;
        akdd akddVar2 = acwvVar.a;
        akddVar2.getClass();
        this.k = akddVar2;
        this.l = acwvVar.e;
    }

    @Deprecated
    public static acwl i(Context context, akdd akddVar, vxe vxeVar, xgn xgnVar, abfv abfvVar, boolean z, boolean z2, acwm acwmVar, Object obj, aduv aduvVar, tun tunVar, abfv abfvVar2, boolean z3) {
        acwu acwuVarA = acwv.a();
        acwuVarA.d(akddVar);
        acwuVarA.b(z);
        acwuVarA.c(z2);
        acwuVarA.f();
        acwuVarA.e(z3);
        acwuVarA.a = acwmVar;
        acwuVarA.b = obj;
        acwl acwlVar = new acwl(context, vxeVar, xgnVar, abfvVar, aduvVar, tunVar, abfvVar2, acwuVarA.a());
        acwlVar.h();
        return acwlVar;
    }

    @Override // defpackage.acwh
    protected final Map a() {
        Map mapA = super.a();
        mapA.remove(xhd.c);
        return mapA;
    }

    @Override // defpackage.acwh
    protected final void c() {
        akdd akddVar = this.k;
        ajnf ajnfVarA = acfz.A(akddVar);
        if (ajnfVarA != null) {
            if ((ajnfVarA.b & SemanticState.Obscured) != 0) {
                vxe vxeVar = this.a;
                ajwo ajwoVar = ajnfVarA.r;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.c(ajwoVar, a());
            }
            if ((ajnfVarA.b & SemanticState.Modal) != 0) {
                vxe vxeVar2 = this.a;
                ajwo ajwoVar2 = ajnfVarA.q;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vxeVar2.c(ajwoVar2, a());
            }
            if ((ajnfVarA.b & SemanticState.Multiline) != 0) {
                vxe vxeVar3 = this.a;
                ajwo ajwoVar3 = ajnfVarA.s;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                vxeVar3.c(ajwoVar3, a());
            }
            this.g.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(ajnfVarA.y, (amud) null), null);
        } else if ((akddVar.b & 268435456) != 0) {
            vxe vxeVar4 = this.a;
            ajwo ajwoVar4 = akddVar.s;
            if (ajwoVar4 == null) {
                ajwoVar4 = ajwo.a;
            }
            vxeVar4.c(ajwoVar4, a());
        }
        acwm acwmVar = this.l;
        if (acwmVar != null) {
            acwmVar.a();
        }
        tun tunVar = this.i;
        if (tunVar != null) {
            tunVar.c();
        }
    }

    @Override // defpackage.acwh
    protected final void d() {
        akdd akddVar = this.k;
        ajnf ajnfVarB = acfz.B(akddVar);
        if (ajnfVarB != null) {
            if ((ajnfVarB.b & SemanticState.Multiline) != 0) {
                vxe vxeVar = this.a;
                ajwo ajwoVar = ajnfVarB.s;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.c(ajwoVar, a());
            }
            if ((ajnfVarB.b & SemanticState.Obscured) != 0) {
                vxe vxeVar2 = this.a;
                ajwo ajwoVar2 = ajnfVarB.r;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vxeVar2.c(ajwoVar2, a());
            }
            if ((ajnfVarB.b & SemanticState.Modal) != 0) {
                vxe vxeVar3 = this.a;
                ajwo ajwoVar3 = ajnfVarB.q;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                vxeVar3.c(ajwoVar3, a());
            }
            this.g.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(ajnfVarB.y, (amud) null), null);
        } else {
            int i = akddVar.b;
            if ((536870912 & i) != 0) {
                vxe vxeVar4 = this.a;
                ajwo ajwoVar4 = akddVar.t;
                if (ajwoVar4 == null) {
                    ajwoVar4 = ajwo.a;
                }
                vxeVar4.c(ajwoVar4, a());
            } else if ((i & 134217728) != 0) {
                vxe vxeVar5 = this.a;
                ajwo ajwoVar5 = akddVar.r;
                if (ajwoVar5 == null) {
                    ajwoVar5 = ajwo.a;
                }
                vxeVar5.c(ajwoVar5, a());
            }
        }
        acwm acwmVar = this.l;
        if (acwmVar != null) {
            acwmVar.b();
        }
        tun tunVar = this.i;
        if (tunVar != null) {
            tunVar.c();
        }
    }

    @Override // defpackage.acwh
    protected final void g(int i) {
        acwm acwmVar = this.l;
        if (acwmVar != null) {
            acwmVar.c(i == 5 || i == 6 || i == 7);
        }
        if (i != 1) {
            this.a.e(this.k.k, this.b);
            if (i == 6) {
                return;
            }
        }
        tun tunVar = this.i;
        if (tunVar != null) {
            tunVar.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:88:0x01da  */
    public final void h() {
        AlertDialog.Builder builder;
        alay alayVar;
        CharSequence[] charSequenceArr;
        CharSequence charSequenceE;
        CharSequence charSequenceD;
        aduv aduvVar;
        xgn xgnVar;
        ajnf ajnfVarB;
        ajnf ajnfVarA;
        abfv abfvVar = this.d;
        if (abfvVar != null) {
            if (abfvVar.k()) {
                acwv acwvVar = this.j;
                if (abfvVar.k()) {
                    Object obj = abfvVar.b;
                    acrj acrjVar = new acrj(acwvVar, 5);
                    Optional optional = (Optional) obj;
                    optional.isPresent();
                    ((acwq) optional.get()).d((acwv) acrjVar.a);
                }
            } else {
                builder = abfvVar.g(this.e);
            }
            xgnVar = this.g;
            akdd akddVar = this.k;
            xgnVar.w(new xgj(akddVar.m, (amud) null), null);
            ajnfVarB = acfz.B(akddVar);
            if (ajnfVarB != null) {
                xgnVar.w(new xgj(ajnfVarB.y, (amud) null), null);
            }
            ajnfVarA = acfz.A(akddVar);
            if (ajnfVarA != null) {
                xgnVar.w(new xgj(ajnfVarA.y, (amud) null), null);
            }
            vxe vxeVar = this.f;
            vxeVar.e(akddVar.j, this.j.f);
            vxeVar.b(akddVar.n);
        }
        builder = new AlertDialog.Builder(this.e);
        akdd akddVar2 = this.k;
        if ((akddVar2.b & 16) != 0 && (aduvVar = this.h) != null) {
            alja aljaVar = akddVar2.d;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            builder.setIcon(aduvVar.a(alizVarA));
        }
        if ((akddVar2.b & 1) != 0) {
            alayVar = akddVar2.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        builder.setTitle(ackj.k(null, alayVar, null, false));
        vxe vxeVar2 = this.f;
        if (akddVar2.f.size() != 0) {
            charSequenceArr = new CharSequence[akddVar2.f.size()];
            for (int i = 0; i < akddVar2.f.size(); i++) {
                charSequenceArr[i] = vxl.a(null, (alay) akddVar2.f.get(i), vxeVar2, false);
            }
        } else {
            charSequenceArr = null;
        }
        acwv acwvVar2 = this.j;
        builder.setMessage(acfz.C(charSequenceArr));
        builder.setNegativeButton(acfz.D(akddVar2), this);
        builder.setPositiveButton(acfz.E(akddVar2), this);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCancelable(acwvVar2.b);
        alertDialogCreate.setCanceledOnTouchOutside(acwvVar2.c);
        e(alertDialogCreate);
        f();
        ViewGroup viewGroup = (ViewGroup) alertDialogCreate.findViewById(R.id.content);
        if (viewGroup != null && (viewGroup.getChildAt(0) instanceof ViewGroup) && ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1) != null) {
            ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1).setMinimumHeight(0);
        }
        Button button = (Button) alertDialogCreate.findViewById(R.id.button1);
        ajnf ajnfVarB2 = acfz.B(akddVar2);
        if (ajnfVarB2 == null) {
            charSequenceE = acfz.E(akddVar2);
        } else {
            aiqe aiqeVar = ajnfVarB2.v;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            if ((aiqeVar.b & 1) != 0) {
                aiqe aiqeVar2 = ajnfVarB2.v;
                if (aiqeVar2 == null) {
                    aiqeVar2 = aiqe.a;
                }
                aiqd aiqdVar = aiqeVar2.c;
                if (aiqdVar == null) {
                    aiqdVar = aiqd.a;
                }
                charSequenceE = aiqdVar.c;
            } else {
                charSequenceE = acfz.E(akddVar2);
            }
        }
        button.setContentDescription(charSequenceE);
        Button button2 = (Button) alertDialogCreate.findViewById(R.id.button2);
        ajnf ajnfVarA2 = acfz.A(akddVar2);
        if (ajnfVarA2 == null) {
            charSequenceD = acfz.D(akddVar2);
        } else {
            aiqe aiqeVar3 = ajnfVarA2.v;
            if (aiqeVar3 == null) {
                aiqeVar3 = aiqe.a;
            }
            if ((aiqeVar3.b & 1) != 0) {
                aiqe aiqeVar4 = ajnfVarA2.v;
                if (aiqeVar4 == null) {
                    aiqeVar4 = aiqe.a;
                }
                aiqd aiqdVar2 = aiqeVar4.c;
                if (aiqdVar2 == null) {
                    aiqdVar2 = aiqd.a;
                }
                charSequenceD = aiqdVar2.c;
            } else {
                charSequenceD = acfz.D(akddVar2);
            }
        }
        button2.setContentDescription(charSequenceD);
        if (!acwvVar2.d) {
            Context context = this.e;
            button.setTextColor(tzk.n(context, com.google.android.apps.youtube.music.R.attr.ytCallToAction).orElse(button.getTextColors().getDefaultColor()));
            button2.setTextColor(tzk.n(context, com.google.android.apps.youtube.music.R.attr.ytCallToAction).orElse(button2.getTextColors().getDefaultColor()));
        }
        View viewFindViewById = alertDialogCreate.findViewById(R.id.message);
        if (viewFindViewById instanceof TextView) {
            Iterator it = akddVar2.f.iterator();
            while (it.hasNext()) {
                if (ackj.i((alay) it.next())) {
                    ((TextView) viewFindViewById).setMovementMethod(LinkMovementMethod.getInstance());
                    break;
                }
            }
        }
        xgnVar = this.g;
        akdd akddVar3 = this.k;
        xgnVar.w(new xgj(akddVar3.m, (amud) null), null);
        ajnfVarB = acfz.B(akddVar3);
        if (ajnfVarB != null) {
            xgnVar.w(new xgj(ajnfVarB.y, (amud) null), null);
        }
        ajnfVarA = acfz.A(akddVar3);
        if (ajnfVarA != null) {
            xgnVar.w(new xgj(ajnfVarA.y, (amud) null), null);
        }
        vxe vxeVar3 = this.f;
        vxeVar3.e(akddVar3.j, this.j.f);
        vxeVar3.b(akddVar3.n);
    }
}

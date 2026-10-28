package defpackage;

import android.graphics.drawable.Drawable;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.ads.player.ui.AdProgressTextView;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class spg extends spf {
    private final xgn e;
    private final boolean f;
    private String g;
    private String h;
    private String i;
    private final boolean j;
    private final boolean k;

    public spg(vxu vxuVar, vyo vyoVar, xgn xgnVar) {
        super(soo.b().a());
        this.e = xgnVar;
        boolean z = vxuVar.b().m;
        this.f = taq.ax(vyoVar);
        this.j = afxw.e(vyoVar).by;
        this.k = afxw.e(vyoVar).ct;
    }

    private final void e(boolean z) {
        if (this.d) {
            ((AdProgressTextView) this.b).setVisibility(true != z ? 8 : 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b1  */
    @Override // defpackage.spf
    public final /* synthetic */ void a(Object obj, boolean z) {
        String str;
        String str2;
        String str3;
        ajnf ajnfVar;
        apzt apztVarC;
        soo sooVar = (soo) obj;
        int i = sooVar.a;
        if (i == -1) {
            ((AdProgressTextView) this.b).a.a();
            i = -1;
        }
        boolean z2 = sooVar.b;
        if (z2 != ((soo) this.a).b) {
            ((AdProgressTextView) this.b).b(z2);
        }
        if (this.c != z) {
            e(z);
        }
        ager agerVar = new ager(this.g);
        agep agepVar = new agep(agerVar, agerVar);
        apzt apztVarC2 = sooVar.c();
        if (apztVarC2 == null) {
            str = this.h;
        } else {
            aivw aivwVar = apztVarC2.c;
            if (aivwVar == null) {
                aivwVar = aivw.a;
            }
            str = aivwVar.b;
        }
        sgn sgnVar = sooVar.c;
        int i2 = sgnVar.c;
        if (i2 == 0 || i2 == 1) {
            str2 = null;
        } else {
            agev agevVar = sgnVar.f;
            if (agevVar.g()) {
                str2 = ((aivw) agevVar.c()).b;
            } else {
                str2 = null;
            }
        }
        String strB = agepVar.b(Arrays.asList(str, str2, i < 0 ? null : typ.i((i + 999) / 1000, 3)));
        boolean z3 = this.k;
        if (z3) {
            apzt apztVarC3 = sooVar.c();
            if (apztVarC3 == null) {
                str3 = null;
                break;
            }
            Iterator it = apztVarC3.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str3 = null;
                    break;
                }
                apzs apzsVar = (apzs) it.next();
                int iAU = a.aU(apzsVar.d);
                if (iAU == 0) {
                    iAU = 1;
                }
                if (iAU == 2 && (apzsVar.b & 1) != 0) {
                    askp askpVar = apzsVar.c;
                    if (askpVar == null) {
                        askpVar = askp.a;
                    }
                    if (!askpVar.c.isEmpty()) {
                        askp askpVar2 = apzsVar.c;
                        if (askpVar2 == null) {
                            askpVar2 = askp.a;
                        }
                        str3 = askpVar2.c;
                        break;
                    }
                }
            }
            AdProgressTextView adProgressTextView = (AdProgressTextView) this.b;
            if (TextUtils.isEmpty(str3)) {
                if (adProgressTextView.a()) {
                    adProgressTextView.b(adProgressTextView.a());
                }
                adProgressTextView.setText(strB);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strB);
                if (adProgressTextView.a()) {
                    adProgressTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    Drawable drawable = adProgressTextView.getContext().getDrawable(R.drawable.ad_choices_instream_icon);
                    if (drawable != null) {
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        spannableStringBuilder.append((CharSequence) " ");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(new spc(drawable), length, spannableStringBuilder.length(), 33);
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    spannableStringBuilder.append((CharSequence) adProgressTextView.getResources().getString(R.string.ad_text_separator)).append((CharSequence) BidiFormatter.getInstance().unicodeWrap(str3));
                }
                adProgressTextView.setText(spannableStringBuilder);
            }
        } else {
            ((AdProgressTextView) this.b).setText(strB);
            str3 = null;
        }
        if (this.j) {
            String strConcat = (!z3 || str3 == null) ? "" : String.valueOf(this.g).concat(str3);
            ((AdProgressTextView) this.b).setContentDescription(strB + strConcat + ' ' + this.i);
        }
        if (z && (apztVarC = sooVar.c()) != null && (apztVarC.b & 8) != 0) {
            this.e.w(new xgj(apztVarC.d, (amud) null), null);
        }
        if (this.f && z && z2) {
            if (sgnVar != null) {
                agev agevVar2 = sgnVar.g;
                if (agevVar2.g()) {
                    ajnfVar = (ajnf) agevVar2.c();
                } else {
                    ajnfVar = null;
                }
            } else {
                ajnfVar = null;
            }
            if (ajnfVar != null) {
                if ((ajnfVar.b & 2097152) == 0) {
                    amud amudVar = ajnfVar.z;
                    if (amudVar == null) {
                        amudVar = amud.b;
                    }
                    if ((amudVar.c & 1) == 0) {
                        return;
                    }
                }
                amud amudVar2 = ajnfVar.z;
                if (amudVar2 == null) {
                    amudVar2 = amud.b;
                }
                if ((amudVar2.c & 1) == 0) {
                    if ((ajnfVar.b & 2097152) != 0) {
                        this.e.w(new xgj(ajnfVar.y, (amud) null), null);
                    }
                } else {
                    xgn xgnVar = this.e;
                    amud amudVar3 = ajnfVar.z;
                    if (amudVar3 == null) {
                        amudVar3 = amud.b;
                    }
                    xgnVar.w(new xgj(amudVar3), null);
                }
            }
        }
    }

    @Override // defpackage.spf
    public final void c() {
        e(this.c);
        this.g = ((AdProgressTextView) this.b).getResources().getString(R.string.ad_text_separator);
        this.h = ((AdProgressTextView) this.b).getResources().getString(R.string.sponsored_ad_badge);
        this.i = ((AdProgressTextView) this.b).getResources().getString(R.string.my_ad_center);
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class xat extends xac {
    private static final agkj v;
    protected final TextView u;
    private final adhv w;

    static {
        agkh agkhVar = new agkh(4);
        agkhVar.e(aliz.UNKNOWN, Integer.valueOf(R.style.live_chat_author_default));
        agkhVar.e(aliz.OWNER, Integer.valueOf(R.style.live_chat_author_owner));
        agkhVar.e(aliz.MODERATOR, Integer.valueOf(R.style.live_chat_author_moderator));
        agkhVar.e(aliz.MEMBER, Integer.valueOf(R.style.live_chat_author_member));
        agkhVar.e(aliz.VERIFIED, Integer.valueOf(R.style.live_chat_author_verified));
        v = agkhVar.d(true);
    }

    public xat(Activity activity, Context context, adhv adhvVar, vxe vxeVar, aduv aduvVar, adsa adsaVar, wyv wyvVar, xpl xplVar, tza tzaVar, aeda aedaVar) {
        super(true == aedaVar.i() ? context : activity, aduvVar, vxeVar, adsaVar, wyvVar, xplVar, tzaVar, aedaVar);
        this.w = adhvVar;
        TextView textView = (TextView) this.f.findViewById(R.id.chat_message);
        textView.getClass();
        this.u = textView;
        textView.setOnClickListener(this.n);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setFilters(new InputFilter[]{new adsf(textView, this.d.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) this.d.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift))});
    }

    @Override // defpackage.xac, defpackage.adma
    public void b(admh admhVar) {
        this.a.e(null, 0, null);
        this.t.e(null, 0, null);
        this.j = null;
        this.k = null;
        this.q = null;
        this.r = false;
        this.o = false;
        this.s = false;
        this.p = false;
        this.f.setContentDescription(null);
        this.w.f(this.g);
        this.f.setBackgroundColor(0);
    }

    @Override // defpackage.xac
    protected final int d() {
        return tzk.n(this.d, R.attr.ytTextDisabled).orElse(0);
    }

    @Override // defpackage.xac
    protected final int e() {
        return R.layout.live_chat_light_text_item;
    }

    @Override // defpackage.xac
    protected final ImageView f() {
        return (ImageView) this.f.findViewById(R.id.avatar);
    }

    @Override // defpackage.xac
    protected final TextView g() {
        return (TextView) this.f.findViewById(R.id.chat_message);
    }

    @Override // defpackage.xac
    protected agkj h() {
        return v;
    }

    @Override // defpackage.xac
    protected void i(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder sb) {
        StringBuilder sb2;
        alay alayVar;
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
        spannableStringBuilder4.append((CharSequence) spannableStringBuilder);
        List list = this.k;
        if (list == null || list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            this.a.b(spannableStringBuilder4, sb2, this.k, this.m, this.j, this.u.getId(), this.p);
        }
        yno.dF(spannableStringBuilder4, this.l);
        spannableStringBuilder4.append((CharSequence) spannableStringBuilder2);
        s(spannableStringBuilder4);
        boolean zC = twb.c(this.d);
        if (zC) {
            sb2.append((CharSequence) spannableStringBuilder2);
        }
        TextView textView = this.u;
        textView.setText(spannableStringBuilder4);
        if (!this.o) {
            adsc adscVar = this.t;
            alay alayVar2 = this.j.g;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            ampd ampdVar = this.j;
            if ((ampdVar.b & 16) != 0) {
                alayVar = ampdVar.g;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            StringBuilder sb3 = sb2;
            adscVar.f(alayVar2, ackj.k(null, alayVar, null, false), spannableStringBuilder4, sb3, this.j, textView.getId());
            sb2 = sb3;
        }
        if (zC) {
            textView.setContentDescription(sb2);
        }
    }

    @Override // defpackage.xac
    public void j(View view) {
        ajwo ajwoVar = this.i;
        if (ajwoVar != null) {
            this.e.a(ajwoVar);
        }
    }

    @Override // defpackage.xac
    protected final void k(aqmh aqmhVar) {
        this.w.h(this.g, aqmhVar);
    }

    @Override // defpackage.xac
    protected final boolean l() {
        return true;
    }

    @Override // defpackage.xac
    protected View m() {
        return this.f.findViewById(R.id.highlight_bar);
    }

    @Override // defpackage.xac
    protected boolean p() {
        return true;
    }

    @Override // defpackage.xac
    public final boolean t() {
        return true;
    }
}

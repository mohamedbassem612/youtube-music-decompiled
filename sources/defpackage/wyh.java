package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyh extends xac {
    private static final agkj u;
    private final adia v;
    private final zwb w;
    private final TextView x;
    private final TextView y;
    private final TextView z;

    static {
        agkh agkhVar = new agkh(4);
        agkhVar.e(aliz.UNKNOWN, Integer.valueOf(R.style.live_chat_overlay_author));
        agkhVar.e(aliz.OWNER, Integer.valueOf(R.style.live_creation_author_owner));
        agkhVar.e(aliz.MODERATOR, Integer.valueOf(R.style.live_chat_author_moderator));
        agkhVar.e(aliz.MEMBER, Integer.valueOf(R.style.live_chat_author_member));
        agkhVar.e(aliz.VERIFIED, Integer.valueOf(R.style.live_chat_author_verified));
        u = agkhVar.d(true);
    }

    public wyh(Context context, Context context2, adhv adhvVar, aduv aduvVar, vxe vxeVar, zwb zwbVar, adsa adsaVar, wyv wyvVar, xpl xplVar, tza tzaVar, aeda aedaVar) {
        super(true != aedaVar.i() ? context : context2, aduvVar, vxeVar, adsaVar, wyvVar, xplVar, tzaVar, aedaVar);
        this.w = zwbVar;
        Resources resources = aedaVar.i() ? context2.getResources() : context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_vertical_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_horizontal_margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        this.f.setLayoutParams(marginLayoutParams);
        this.v = new adia(adhvVar, this.g, false);
        TextView textView = (TextView) this.f.findViewById(R.id.author);
        textView.getClass();
        this.x = textView;
        TextView textView2 = (TextView) this.f.findViewById(R.id.timestamp);
        textView2.getClass();
        this.z = textView2;
        TextView textView3 = (TextView) this.f.findViewById(R.id.comment);
        textView3.getClass();
        this.y = textView3;
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setOnClickListener(this.n);
        textView3.setFilters(new InputFilter[]{new adsf(textView3, resources.getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) resources.getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift))});
    }

    private final boolean u(View view) {
        if (view.getAlpha() > 0.0f) {
            return !(view.getParent() instanceof View) || u((View) view.getParent());
        }
        return false;
    }

    @Override // defpackage.xac, defpackage.adma
    public final void b(admh admhVar) {
        this.v.a();
    }

    @Override // defpackage.xac
    protected final int d() {
        return tzk.n(r(), R.attr.ytTextDisabled).orElse(0);
    }

    @Override // defpackage.xac
    protected final int e() {
        return R.layout.live_chat_light_overlay_text_item;
    }

    @Override // defpackage.xac
    protected final ImageView f() {
        return (ImageView) this.f.findViewById(R.id.avatar);
    }

    @Override // defpackage.xac
    protected final TextView g() {
        return (TextView) this.f.findViewById(R.id.author);
    }

    @Override // defpackage.xac
    protected final agkj h() {
        return u;
    }

    @Override // defpackage.xac
    protected final void i(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder sb) {
        SpannableStringBuilder spannableStringBuilder4;
        StringBuilder sb2;
        alay alayVar;
        List list = this.k;
        if (list == null || list.isEmpty()) {
            spannableStringBuilder4 = spannableStringBuilder;
            sb2 = sb;
        } else {
            spannableStringBuilder4 = spannableStringBuilder;
            sb2 = sb;
            this.a.b(spannableStringBuilder4, sb2, this.k, this.m, this.j, this.x.getId(), false);
        }
        s(spannableStringBuilder2);
        this.x.setText(spannableStringBuilder4);
        TextView textView = this.y;
        textView.setText(spannableStringBuilder2);
        this.z.setText(spannableStringBuilder3);
        boolean zC = twb.c(this.d);
        if (zC) {
            sb2.append((CharSequence) spannableStringBuilder2);
            textView.setImportantForAccessibility(2);
        }
        if (!this.o) {
            adsc adscVar = this.t;
            alay alayVar2 = this.j.g;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            alay alayVar3 = alayVar2;
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
            adscVar.f(alayVar3, ackj.k(null, alayVar, null, false), spannableStringBuilder2, sb3, this.j, textView.getId());
            sb2 = sb3;
        }
        if (zC) {
            this.f.setContentDescription(sb2);
        }
    }

    @Override // defpackage.xac
    public final void j(View view) {
        if (!this.w.u() || this.j == null || this.i == null || !u(view)) {
            return;
        }
        this.e.a(this.i);
    }

    @Override // defpackage.xac
    protected final void k(aqmh aqmhVar) {
        this.v.f(aqmhVar, null);
    }

    @Override // defpackage.xac
    protected final boolean l() {
        return false;
    }
}

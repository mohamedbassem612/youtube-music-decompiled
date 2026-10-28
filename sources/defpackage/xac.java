package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class xac implements adma {
    private static Locale u;
    private static DateFormat v;
    private final wyv A;
    private final aduv B;
    private final aeda C;
    private final xpl D;
    protected final adry a;
    protected final adse b;
    protected final StringBuilder c;
    protected final Context d;
    protected final vxe e;
    protected final View f;
    protected final ImageView g;
    protected final View h;
    protected ajwo i;
    protected ampd j;
    protected List k;
    protected final float l;
    protected final float m;
    protected final View.OnClickListener n;
    protected boolean o;
    protected boolean p;
    public CharSequence q;
    public boolean r;
    public boolean s;
    protected final adsc t;
    private final Context w;
    private final SpannableStringBuilder x;
    private final SpannableStringBuilder y;
    private final SpannableStringBuilder z;

    static {
        agkh agkhVar = new agkh(4);
        agkhVar.e(aliz.UNKNOWN, Integer.valueOf(R.style.live_chat_author_default));
        agkhVar.e(aliz.OWNER, Integer.valueOf(R.style.live_chat_author_owner));
        agkhVar.e(aliz.MODERATOR, Integer.valueOf(R.style.live_chat_author_moderator));
        agkhVar.e(aliz.MEMBER, Integer.valueOf(R.style.live_chat_author_member));
        agkhVar.e(aliz.VERIFIED, Integer.valueOf(R.style.live_chat_author_verified));
        agkhVar.d(true);
    }

    public xac(Context context, aduv aduvVar, vxe vxeVar, adsa adsaVar, wyv wyvVar, xpl xplVar, tza tzaVar, aeda aedaVar) {
        this.d = context;
        this.e = vxeVar;
        this.B = aduvVar;
        this.A = wyvVar;
        this.D = xplVar;
        this.C = aedaVar;
        if (tzaVar != null) {
            this.w = new ContextThemeWrapper(context, tzaVar.a);
        } else {
            this.w = context;
        }
        View viewInflate = View.inflate(r(), e(), null);
        this.f = viewInflate;
        vhv vhvVar = new vhv(this, 13);
        this.n = vhvVar;
        viewInflate.setOnClickListener(vhvVar);
        this.g = f();
        this.h = m();
        Resources resources = context.getResources();
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.live_chat_message_spacing);
        float dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_badge_spacing);
        float fMeasureText = g().getPaint().measureText(" ");
        this.l = dimensionPixelSize / fMeasureText;
        this.m = dimensionPixelOffset / fMeasureText;
        adse adseVar = new adse(viewInflate);
        this.b = adseVar;
        this.a = new adry(context, aduvVar, adsaVar, l(), adseVar, false);
        this.t = new adsc(context, adsaVar, l(), adseVar, true);
        this.x = new SpannableStringBuilder();
        this.y = new SpannableStringBuilder();
        this.z = new SpannableStringBuilder();
        this.c = new StringBuilder();
    }

    private static boolean u(List list, aliz alizVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((adrx) it.next()).b == alizVar) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.f;
    }

    @Override // defpackage.adma
    public void b(admh admhVar) {
        throw null;
    }

    protected abstract int d();

    protected abstract int e();

    protected abstract ImageView f();

    protected abstract TextView g();

    protected agkj h() {
        throw null;
    }

    protected abstract void i(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder sb);

    public void j(View view) {
        throw null;
    }

    protected abstract void k(aqmh aqmhVar);

    protected abstract boolean l();

    protected View m() {
        return null;
    }

    protected List n(List list) {
        return adrx.a(list, agkj.k(aliz.VERIFIED, Integer.valueOf(tzk.i(r(), R.attr.ytIconActiveOther)), aliz.MODERATOR, Integer.valueOf(tzk.i(r(), R.attr.ytCallToAction))));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    @Override // defpackage.adma
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void hU(adly adlyVar, ampd ampdVar) {
        amms ammsVar;
        ammr ammrVar;
        boolean z;
        amms ammsVar2;
        alay alayVar;
        SpannableStringBuilder spannableStringBuilder;
        boolean z2;
        amms ammsVar3;
        Spanned spannedK;
        int iAU;
        alay alayVar2;
        int length;
        int iIntValue;
        boolean z3;
        int iDD;
        int i;
        Object obj;
        alay alayVar3;
        alay alayVar4;
        alay alayVar5;
        SpannableStringBuilder spannableStringBuilder2 = this.x;
        spannableStringBuilder2.clear();
        SpannableStringBuilder spannableStringBuilder3 = this.y;
        spannableStringBuilder3.clear();
        SpannableStringBuilder spannableStringBuilder4 = this.z;
        spannableStringBuilder4.clear();
        StringBuilder sb = this.c;
        sb.setLength(0);
        adry adryVar = this.a;
        Context context = this.d;
        boolean zC = twb.c(context);
        adryVar.e(null, 0, null);
        this.t.e(null, 0, null);
        this.j = ampdVar;
        this.k = n(ampdVar.j);
        Object objC = adlyVar.c("live_chat_item_action");
        ajwo ajwoVar = objC instanceof ajwo ? (ajwo) objC : null;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ammr.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ammr.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                ammrVar = (ammr) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                ammsVar = null;
            } else {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(amms.b);
                ajwoVar.c(aihlVarCheckIsLite3);
                if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(amms.b);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                    ammsVar = (amms) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                    ammrVar = null;
                } else {
                    ammsVar = null;
                    ammrVar = null;
                }
            }
        } else {
            ammsVar = null;
            ammrVar = null;
        }
        if (adlyVar.c("live_chat_item_action") instanceof ajwo) {
            ajwo ajwoVar2 = (ajwo) adlyVar.c("live_chat_item_action");
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ammp.b);
            ajwoVar2.c(aihlVarCheckIsLite5);
            if (ajwoVar2.j.n(aihlVarCheckIsLite5.d)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.q = null;
        if (yno.dL(ammrVar, ammsVar) && !this.r) {
            this.q = ackj.k(null, yno.dJ(ammrVar, ammsVar), null, false);
        }
        int i2 = ampdVar.b & SemanticState.Multiline;
        if (i2 != 0 && !this.r) {
            if (i2 != 0) {
                alayVar5 = ampdVar.k;
                if (alayVar5 == null) {
                    alayVar5 = alay.a;
                }
            } else {
                alayVar5 = null;
            }
            this.q = ackj.k(null, alayVar5, null, false);
        }
        if (this.q == null) {
            if ((ampdVar.b & 16) != 0) {
                alayVar4 = ampdVar.g;
                if (alayVar4 == null) {
                    alayVar4 = alay.a;
                }
            } else {
                alayVar4 = null;
            }
            this.q = vxl.a(null, alayVar4, this.e, false);
        }
        this.o = (yno.dL(ammrVar, ammsVar) || (ampdVar.b & SemanticState.Multiline) != 0) && !this.r;
        if (q()) {
            if ((ampdVar.b & 4) != 0) {
                alayVar3 = ampdVar.e;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
            } else {
                alayVar3 = null;
            }
            CharSequence charSequenceK = ackj.k(null, alayVar3, null, false);
            ammsVar2 = ammsVar;
            if (TextUtils.isEmpty(charSequenceK)) {
                long j = ampdVar.d / 1000;
                if (j != 0) {
                    Locale locale = Locale.getDefault();
                    if (!locale.equals(u)) {
                        v = android.text.format.DateFormat.getTimeFormat(context);
                        u = locale;
                    }
                    charSequenceK = v.format(new Date(j));
                } else {
                    charSequenceK = null;
                }
            }
            if (!TextUtils.isEmpty(charSequenceK)) {
                yno.dE(r(), spannableStringBuilder3, charSequenceK, R.style.live_chat_message_time, false);
                if (zC) {
                    sb.append(charSequenceK);
                    sb.append(' ');
                }
            }
        } else {
            ammsVar2 = ammsVar;
        }
        CharSequence charSequence = this.q;
        if (charSequence != null) {
            spannableStringBuilder4.append(charSequence);
        }
        if ((ampdVar.b & SemanticState.Focused) != 0) {
            alayVar = ampdVar.h;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK2 = ackj.k(null, alayVar, null, false);
        if (TextUtils.isEmpty(spannedK2)) {
            spannableStringBuilder = spannableStringBuilder3;
            z2 = z;
        } else {
            Context contextR = r();
            agkj agkjVarH = h();
            List list = this.k;
            if (list == null || list.isEmpty() || !agkjVarH.containsKey(((adrx) list.get(0)).b)) {
                z2 = z;
                Object obj2 = aliz.UNKNOWN;
                if (!agkjVarH.containsKey(obj2)) {
                    iIntValue = R.style.live_chat_author_default;
                    break;
                }
                iIntValue = ((Integer) agkjVarH.get(obj2)).intValue();
            } else {
                aliz alizVar = aliz.OWNER;
                if (!u(list, alizVar)) {
                    aliz alizVar2 = aliz.MODERATOR;
                    if (!u(list, alizVar2)) {
                        aliz alizVar3 = aliz.MEMBER;
                        if (!u(list, alizVar3)) {
                            z2 = z;
                            aliz alizVar4 = aliz.VERIFIED;
                            if (!u(list, alizVar4)) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((adrx) it.next()).a != null) {
                                            iIntValue = ((Integer) agkjVarH.get(alizVar3)).intValue();
                                            break;
                                        }
                                    } else {
                                        iIntValue = R.style.live_chat_author_default;
                                        break;
                                    }
                                }
                            } else {
                                iIntValue = ((Integer) agkjVarH.get(alizVar4)).intValue();
                            }
                        } else {
                            iIntValue = ((Integer) agkjVarH.get(alizVar3)).intValue();
                        }
                    } else {
                        iIntValue = ((Integer) agkjVarH.get(alizVar2)).intValue();
                    }
                } else {
                    iIntValue = ((Integer) agkjVarH.get(alizVar)).intValue();
                }
                z2 = z;
            }
            yno.dE(contextR, spannableStringBuilder2, spannedK2, iIntValue, true);
            if (t()) {
                Context contextR2 = r();
                List<adrx> list2 = this.k;
                aduv aduvVar = this.B;
                xpl xplVar = this.D;
                int length2 = spannedK2.length();
                View view = this.f;
                boolean zP = p();
                agkj agkjVarH2 = h();
                if (list2 == null || list2.isEmpty()) {
                    spannableStringBuilder = spannableStringBuilder3;
                } else {
                    amoo amooVar = (amoo) xplVar.b;
                    boolean z4 = amooVar.b;
                    boolean z5 = amooVar.d;
                    ArrayList arrayList = new ArrayList();
                    boolean z6 = false;
                    boolean z7 = false;
                    boolean z8 = false;
                    for (adrx adrxVar : list2) {
                        z4 = z4;
                        spannableStringBuilder3 = spannableStringBuilder3;
                        if (z4 && adrxVar.b == aliz.OWNER) {
                            z6 = true;
                        }
                        if (z5 && (obj = adrxVar.b) == aliz.VERIFIED) {
                            int iA = aduvVar.a((aliz) obj);
                            if (iA > 0) {
                                arrayList.add(contextR2.getDrawable(iA));
                            }
                            z7 = true;
                        }
                        Object obj3 = adrxVar.b;
                        if (obj3 == aliz.MEMBER || obj3 == aliz.MODERATOR) {
                            z8 = true;
                        }
                    }
                    spannableStringBuilder = spannableStringBuilder3;
                    if (z6) {
                        iDD = yno.dD(contextR2, ((Integer) agkjVarH2.getOrDefault(aliz.OWNER, Integer.valueOf(R.style.live_chat_author_default))).intValue());
                        i = tzk.i(contextR2, R.attr.ytStaticYellow);
                    } else {
                        if (!z7 || z8) {
                            if (z6 && zP) {
                                view.setBackgroundColor(tzk.n(contextR2, R.attr.ytBrandBackgroundSolid).orElse(0));
                            }
                            z3 = !z6 || (z7 && !z8);
                        } else {
                            iDD = yno.dD(contextR2, ((Integer) agkjVarH2.getOrDefault(aliz.VERIFIED, Integer.valueOf(R.style.live_chat_author_default))).intValue());
                            i = tzk.i(contextR2, R.attr.liveChatVerifiedBadgeChipBackground);
                        }
                        this.p = z3;
                    }
                    spannableStringBuilder2.setSpan(new wzd(contextR2, iDD, i, arrayList), spannableStringBuilder2.length() - length2, spannableStringBuilder2.length(), 33);
                    if (z6) {
                        view.setBackgroundColor(tzk.n(contextR2, R.attr.ytBrandBackgroundSolid).orElse(0));
                    }
                    if (z6) {
                    }
                    this.p = z3;
                }
                this.p = z3;
            } else {
                spannableStringBuilder = spannableStringBuilder3;
            }
            if (zC) {
                sb.append((CharSequence) spannedK2);
                sb.append(' ');
            }
        }
        Pattern pattern = this.A.b;
        alay alayVar6 = this.j.g;
        if (alayVar6 == null) {
            alayVar6 = alay.a;
        }
        if (alayVar6 != null && alayVar6.c.size() > 0) {
            for (alba albaVar : alayVar6.c) {
                if (albaVar.c.contains("@") || albaVar.c.contains("#")) {
                    if (this.q != null && pattern != null && (length = spannableStringBuilder4.length() - this.q.length()) >= 0) {
                        Matcher matcher = pattern.matcher(this.q);
                        while (matcher.find()) {
                            spannableStringBuilder4.setSpan(new wzd(r(), 0, context.getColor(R.color.live_chat_mentions_bg_color), null), matcher.start() + length, matcher.end() + length, 33);
                        }
                        break;
                    } else {
                        break;
                        break;
                        break;
                    }
                }
            }
        }
        int i3 = ampdVar.b & 16384;
        if (i3 != 0) {
            if (i3 != 0) {
                alayVar2 = ampdVar.l;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            spannedK = ackj.k(null, alayVar2, null, false);
            ammsVar3 = ammsVar2;
        } else {
            ammsVar3 = ammsVar2;
            spannedK = ackj.k(null, yno.dK(ammrVar, ammsVar3), null, false);
        }
        boolean z9 = spannedK != null;
        boolean zJ = adlyVar.j("is-auto-mod-message");
        CharSequence charSequence2 = this.q;
        if (charSequence2 != null && (yno.dL(ammrVar, ammsVar3) || z9 || zJ)) {
            yno.dG(spannableStringBuilder4, charSequence2.length(), new ForegroundColorSpan(d()));
            yno.dG(spannableStringBuilder4, this.q.length(), new StyleSpan(2));
        }
        View view2 = this.h;
        if (view2 != null) {
            tuk.l(view2, yno.dK(ammrVar, ammsVar3) != null || z9);
        }
        if (z9 && !this.r) {
            xaa xaaVar = new xaa(this, adlyVar, ampdVar);
            yno.dF(spannableStringBuilder4, this.l);
            spannableStringBuilder4.append((CharSequence) spannedK);
            yno.dG(spannableStringBuilder4, spannedK.length(), xaaVar);
            yno.dG(spannableStringBuilder4, spannedK.length(), new ForegroundColorSpan(d()));
        }
        if (this.g != null) {
            aqmh aqmhVar = ampdVar.i;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            k(aqmhVar);
        }
        ajwo ajwoVar3 = ampdVar.m;
        if (ajwoVar3 == null) {
            ajwoVar3 = ajwo.a;
        }
        this.i = ajwoVar3;
        if (z2) {
            if (view2 != null) {
                view2.setBackgroundColor(context.getColor(R.color.yt_medium_red));
                tuk.l(view2, true);
            }
            spannableStringBuilder4.setSpan(new ForegroundColorSpan(tzk.n(context, R.attr.ytTextDisabled).orElse(0)), 0, spannableStringBuilder4.length(), 33);
        }
        i(spannableStringBuilder2, spannableStringBuilder4, spannableStringBuilder, sb);
        if ((ampdVar.b & 2097152) == 0 || (iAU = a.aU(ampdVar.o)) == 0 || iAU != 2) {
            return;
        }
        adlyVar.b.w(new xgj(ampdVar.n.G()), null);
    }

    protected boolean p() {
        return false;
    }

    protected boolean q() {
        return true;
    }

    protected final Context r() {
        return this.C.i() ? this.d : this.w;
    }

    protected final void s(SpannableStringBuilder spannableStringBuilder) {
        for (ClickableSpan clickableSpan : (ClickableSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
            spannableStringBuilder.setSpan(new xab(this, clickableSpan), spannableStringBuilder.getSpanStart(clickableSpan), spannableStringBuilder.getSpanEnd(clickableSpan), spannableStringBuilder.getSpanFlags(clickableSpan));
            spannableStringBuilder.removeSpan(clickableSpan);
        }
    }

    protected boolean t() {
        return false;
    }
}

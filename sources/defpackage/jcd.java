package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jcd implements adma {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;
    private final Object c;
    private final View d;
    private final Object e;
    private final Object f;

    public jcd(Context context, vxe vxeVar, adhv adhvVar, int i) {
        this.$cid = i;
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.album_release_artist_item, null);
        this.c = viewGroup;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.artist_avatar);
        this.a = imageView;
        this.b = new adia(adhvVar, imageView, false);
        this.d = (TextView) viewGroup.findViewById(R.id.artist_display);
        jdw jdwVar = new jdw(context);
        this.e = jdwVar;
        jdwVar.c(viewGroup);
        this.f = new adlw(vxeVar, jdwVar, (adlu) null);
    }

    private static void d(ImageView imageView, Drawable drawable) {
        if (drawable == null) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // defpackage.adma
    public final View a() {
        Object obj;
        int i = this.$cid;
        if (i == 0) {
            obj = this.f;
        } else {
            if (i == 1 || i == 2) {
                return (View) this.a;
            }
            if (i != 3) {
                if (i != 4) {
                    return this.d;
                }
                obj = this.f;
            } else {
                obj = this.e;
            }
        }
        return ((jdw) obj).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        int i = this.$cid;
        if (i == 0) {
            kro.X((ViewGroup) this.a, admhVar);
            View view = this.d;
            kro.X((ViewGroup) view, admhVar);
            ((LinearLayout) view).setVisibility(8);
            return;
        }
        if (i == 1 || i == 2) {
            return;
        }
        if (i == 3) {
            ((adia) this.b).a();
            ((ViewGroup) this.c).setVisibility(0);
            ((adlw) this.f).b();
        } else {
            if (i != 4) {
                ((SpannableStringBuilder) this.a).clear();
                ((StringBuilder) this.e).setLength(0);
                return;
            }
            LinearLayout linearLayout = (LinearLayout) this.c;
            int childCount = linearLayout.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    return;
                }
                View childAt = linearLayout.getChildAt(childCount);
                linearLayout.removeView(childAt);
                admhVar.e(childAt);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [aduv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v27, types: [admh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [admh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [admh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aduv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [admd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [admd, java.lang.Object] */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        String string;
        ajwo ajwoVar;
        alay alayVar2;
        int i = this.$cid;
        boolean z = false;
        apji apjiVar = null;
        Drawable drawableA = null;
        if (i == 0) {
            alfq alfqVar = (alfq) obj;
            ixn ixnVarC = jeo.c(adlyVar);
            adly adlyVarT = kro.T((View) this.c, adlyVar);
            if (ixnVarC != null) {
                kro.Q(ixnVarC, (ViewGroup) this.a, this.e, adlyVarT);
            }
            Object obj2 = this.b;
            alay alayVar3 = alfqVar.c;
            if (alayVar3 == null) {
                alayVar3 = alay.a;
            }
            tuk.u((TextView) obj2, ackj.k(null, alayVar3, null, false));
            View view = this.d;
            LinearLayout linearLayout = (LinearLayout) view;
            linearLayout.removeAllViews();
            if ((alfqVar.b & 2) != 0 && (apjiVar = alfqVar.d) == null) {
                apjiVar = apji.a;
            }
            Optional optionalH = kro.H(apjiVar, ajnp.a);
            if (optionalH.isPresent()) {
                linearLayout.setVisibility(0);
                kro.Q((ajnf) optionalH.get(), (ViewGroup) view, this.e, adlyVarT);
                return;
            }
            return;
        }
        if (i == 1) {
            ajan ajanVar = (ajan) obj;
            alay alayVar4 = ajanVar.c;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
            tuk.u((TextView) this.f, ackj.k(null, alayVar4, null, false));
            Object obj3 = this.b;
            alay alayVar5 = ajanVar.d;
            if (alayVar5 == null) {
                alayVar5 = alay.a;
            }
            tuk.u((TextView) obj3, ackj.k(null, alayVar5, null, false));
            alja aljaVar = ajanVar.b;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            int i2 = aljaVar.b & 1;
            View view2 = this.d;
            if (i2 == 0) {
                ((ImageView) view2).setVisibility(8);
                return;
            }
            Object obj4 = this.c;
            ?? r8 = this.e;
            alja aljaVar2 = ajanVar.b;
            if (aljaVar2 == null) {
                aljaVar2 = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar2.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            ImageView imageView = (ImageView) view2;
            imageView.setImageDrawable(dl.d((Context) obj4, r8.a(alizVarA)));
            imageView.setVisibility(0);
            return;
        }
        if (i == 2) {
            anmu anmuVar = (anmu) obj;
            alay alayVar6 = anmuVar.b;
            if (alayVar6 == null) {
                alayVar6 = alay.a;
            }
            tuk.u((TextView) this.f, ackj.k(null, alayVar6, null, false));
            boolean zBooleanValue = ((Boolean) adlyVar.d("customIndexOrderingIconStart", Boolean.FALSE)).booleanValue();
            ?? r0 = this.e;
            alja aljaVar3 = anmuVar.c;
            if (aljaVar3 == null) {
                aljaVar3 = alja.a;
            }
            aliz alizVarA2 = aliz.a(aljaVar3.c);
            if (alizVarA2 == null) {
                alizVarA2 = aliz.UNKNOWN;
            }
            int iA = r0.a(alizVarA2);
            if (iA > 0) {
                Context context = (Context) this.c;
                aduk adukVar = new aduk(context, iA);
                int iAV = a.aV(anmuVar.d);
                if (iAV == 0) {
                    iAV = 1;
                }
                int i3 = iAV - 1;
                adukVar.b(i3 != 1 ? i3 != 3 ? context.getColor(R.color.ytm_color_grey_05) : tzk.i(context, R.attr.ytStaticBrandRed) : context.getColor(R.color.ytm_color_green_01));
                drawableA = adukVar.a();
            }
            View view3 = this.d;
            if (zBooleanValue) {
                ((ImageView) view3).setVisibility(8);
                d((ImageView) this.b, drawableA);
            } else {
                d((ImageView) view3, drawableA);
                ((ImageView) this.b).setVisibility(8);
            }
            Object obj5 = this.a;
            aiqe aiqeVar = anmuVar.e;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            kro.aa((View) obj5, aiqeVar);
            return;
        }
        if (i == 3) {
            annd anndVar = (annd) obj;
            ImageView imageView2 = (ImageView) this.a;
            imageView2.setVisibility(8);
            TextView textView = (TextView) this.d;
            textView.setVisibility(8);
            if (anndVar.e.size() > 0 && aawb.O((aqmh) anndVar.e.get(0))) {
                imageView2.setVisibility(0);
                ((adia) this.b).f((aqmh) anndVar.e.get(0), null);
            }
            if ((anndVar.b & 1) != 0) {
                alayVar = anndVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            tuk.u(textView, ackj.k(null, alayVar, null, false));
            Object obj6 = this.f;
            xgn xgnVar = adlyVar.b;
            ajwo ajwoVar2 = anndVar.d;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            ((adlw) obj6).a(xgnVar, ajwoVar2, xhd.h(anndVar, true), null);
            int i4 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) this.c;
                if (i4 >= viewGroup.getChildCount()) {
                    break;
                }
                if (viewGroup.getChildAt(i4).getVisibility() != 8) {
                    z = true;
                    break;
                }
                i4++;
            }
            if (z && (anndVar.b & 16) != 0) {
                adlyVar.b.w(new xgj(anndVar.f, (amud) null), null);
            }
            tuk.l(a(), z);
            this.e.e(adlyVar);
            return;
        }
        if (i != 4) {
            ampa ampaVar = (ampa) obj;
            boolean zC = twb.c((Context) this.c);
            if ((ampaVar.b & 1) != 0) {
                alayVar2 = ampaVar.c;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            Spanned spannedA = vxl.a(null, alayVar2, this.f, false);
            ?? r1 = this.a;
            ((SpannableStringBuilder) r1).append((CharSequence) spannedA);
            if (zC) {
                ((StringBuilder) this.e).append((CharSequence) spannedA);
            }
            tuk.u((TextView) this.b, r1);
            return;
        }
        anqz anqzVar = (anqz) obj;
        if (!anqzVar.e.E()) {
            adlyVar.b.l(new xgj(anqzVar.e, (amud) null));
        }
        int iAU = a.aU(anqzVar.d);
        adlyVar.f("displayIconLinkLabel", Boolean.valueOf(iAU != 0 && iAU == 2));
        List listH = ackj.h(anqzVar.b);
        View view4 = this.d;
        View viewA = a();
        int i5 = bac.a;
        int layoutDirection = viewA.getLayoutDirection();
        Iterator it = listH.iterator();
        if (it.hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append(it.next());
            while (it.hasNext()) {
                if (layoutDirection == 1) {
                    sb.insert(0, (CharSequence) " • ");
                    sb.insert(0, it.next());
                } else {
                    sb.append((CharSequence) " • ");
                    sb.append(it.next());
                }
            }
            string = sb.toString();
        } else {
            string = "";
        }
        tuk.u((TextView) view4, string);
        ArrayList arrayList = new ArrayList();
        for (anqy anqyVar : anqzVar.c) {
            if ((anqyVar.b & 1) != 0) {
                alix alixVar = anqyVar.c;
                if (alixVar == null) {
                    alixVar = alix.a;
                }
                arrayList.add(alixVar);
            }
        }
        if (arrayList.size() == 1) {
            ajwoVar = ((alix) arrayList.get(0)).e;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            kro.Y(arrayList);
        } else {
            ajwoVar = null;
        }
        ((adlw) this.b).a(adlyVar.b, ajwoVar, adlyVar.e(), null);
        View viewR = arrayList.size() == 1 ? kro.R((alix) arrayList.get(0), this.e, null, adlyVar) : null;
        if (viewR != null) {
            ((LinearLayout) this.c).addView(viewR);
        }
        this.f.e(adlyVar);
    }

    public jcd(Context context, admh admhVar, int i) {
        this.$cid = i;
        this.e = admhVar;
        View viewInflate = View.inflate(context, R.layout.grid_header, null);
        this.c = viewInflate;
        this.a = (ViewGroup) viewInflate.findViewById(R.id.top_divider);
        this.b = (YouTubeTextView) viewInflate.findViewById(R.id.title);
        this.d = (LinearLayout) viewInflate.findViewById(R.id.icon_links);
        jdw jdwVar = new jdw(context);
        this.f = jdwVar;
        jdwVar.c(viewInflate);
    }

    public jcd(Context context, aduv aduvVar, ViewGroup viewGroup, int i) {
        this.$cid = i;
        this.c = context;
        this.e = aduvVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_custom_index_column, viewGroup, false);
        this.a = viewInflate;
        this.d = (ImageView) viewInflate.findViewById(R.id.icon);
        this.b = (ImageView) viewInflate.findViewById(R.id.iconright);
        this.f = (TextView) viewInflate.findViewById(R.id.index);
    }

    public jcd(Context context, aduv aduvVar, int i) {
        this.$cid = i;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.alert_with_actions, (ViewGroup) null, false);
        this.a = viewInflate;
        this.d = (ImageView) viewInflate.findViewById(R.id.icon);
        this.f = (TextView) viewInflate.findViewById(R.id.alert_title);
        this.b = (TextView) viewInflate.findViewById(R.id.alert_message);
        this.c = context;
        this.e = aduvVar;
    }

    public jcd(Context context, vxe vxeVar, jer jerVar, int i) {
        this.$cid = i;
        vxeVar.getClass();
        jdw jdwVar = new jdw(context);
        this.f = jdwVar;
        this.e = jerVar.a;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.music_list_metadata_info, null);
        this.a = linearLayout;
        this.c = (LinearLayout) linearLayout.findViewById(R.id.icon_links);
        this.d = (TextView) linearLayout.findViewById(R.id.title);
        jdwVar.c(linearLayout);
        this.b = new adlw(vxeVar, jdwVar, (adlu) null);
    }

    public jcd(Context context, vxe vxeVar, int i) {
        this.$cid = i;
        this.c = context;
        this.f = vxeVar;
        View viewInflate = View.inflate(context, R.layout.live_chat_light_moderation_item, null);
        this.d = viewInflate;
        this.b = (TextView) viewInflate.findViewById(R.id.chat_message);
        this.a = new SpannableStringBuilder();
        this.e = new StringBuilder();
    }
}

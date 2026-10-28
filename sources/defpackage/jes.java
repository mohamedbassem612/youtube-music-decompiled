package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jes implements adma {
    private final Context a;
    private final admd b;
    private final adlw c;
    private final admh d;
    private final aduv e;
    private final aduw f;
    private final ggd g;
    private final LinearLayout h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final View l;
    private final LinearLayout m;
    private final View n;
    private final View o;

    public jes(Context context, vxe vxeVar, admh admhVar, aduv aduvVar, aduw aduwVar) {
        context.getClass();
        this.a = context;
        vxeVar.getClass();
        admhVar.getClass();
        this.d = admhVar;
        aduvVar.getClass();
        this.e = aduvVar;
        aduwVar.getClass();
        this.f = aduwVar;
        jdw jdwVar = new jdw(context);
        this.b = jdwVar;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.music_shelf_header, null);
        this.h = linearLayout;
        this.m = (LinearLayout) linearLayout.findViewById(R.id.icon_links);
        this.j = (TextView) linearLayout.findViewById(R.id.title);
        TextView textView = (TextView) linearLayout.findViewById(R.id.shelf_strapline);
        this.i = textView;
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.shelf_subtitle);
        this.k = textView2;
        this.l = linearLayout.findViewById(R.id.title_container);
        View viewFindViewById = linearLayout.findViewById(R.id.contextual_menu_anchor);
        this.n = viewFindViewById;
        View viewFindViewById2 = linearLayout.findViewById(R.id.toolbar_divider);
        this.o = viewFindViewById2;
        this.g = new ggd(viewFindViewById2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.item_small_spacing);
        viewFindViewById.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        jdwVar.c(linearLayout);
        this.c = new adlw(vxeVar, jdwVar, (adlu) null);
        textView.setTextColor(context.getColor(R.color.yt_white1_opacity70));
        textView2.setTextColor(context.getColor(R.color.yt_white1_opacity70));
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.b).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        kro.Z(this.h, 0, 0);
        kro.X(this.m, admhVar);
        this.o.setVisibility(8);
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        List<anwq> list;
        apji apjiVar;
        ajwo ajwoVar;
        boolean z;
        LinearLayout linearLayout = this.h;
        anwt anwtVar = (anwt) obj;
        adly adlyVarT = kro.T(linearLayout, adlyVar);
        xgn xgnVar = adlyVar.b;
        anfy anfyVar = null;
        if (!anwtVar.r.E()) {
            xgnVar.w(new xgj(anwtVar.r, (amud) null), null);
        }
        boolean zJ = adlyVar.j("isStickyHeader");
        ggd ggdVar = this.g;
        if (zJ) {
            ggdVar.b();
        } else {
            ggdVar.a();
        }
        LinearLayout linearLayout2 = this.m;
        int childCount = linearLayout2.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            } else {
                linearLayout2.removeViewAt(childCount);
            }
        }
        Context context = this.a;
        Resources resources = context.getResources();
        int dimension = (int) resources.getDimension(R.dimen.header_horizontal_padding);
        int iBc = a.bc(anwtVar.v);
        if (iBc == 0 || iBc != 3) {
            int dimension2 = (int) resources.getDimension(R.dimen.compact_header_vertical_padding);
            linearLayout.setMinimumHeight((int) resources.getDimension(R.dimen.header_min_height));
            this.l.setPadding(dimension, dimension2, dimension, dimension2);
            this.j.setTextAppearance(R.style.TextAppearance_YouTubeMusic_Display1Modern);
        } else {
            int dimension3 = (int) resources.getDimension(R.dimen.compact_header_vertical_padding);
            linearLayout.setMinimumHeight((int) resources.getDimension(R.dimen.compact_header_min_height));
            this.l.setPadding(dimension, dimension3, dimension, dimension3);
            this.j.setTextAppearance(R.style.TextAppearance_YouTubeMusic_Display2);
        }
        TextView textView = this.j;
        alay alayVar = anwtVar.d;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        if ((anwtVar.c & 16) != 0) {
            aduv aduvVar = this.e;
            alja aljaVar = anwtVar.g;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            Drawable drawableD = dl.d(context, aduvVar.a(alizVarA));
            if (drawableD != null) {
                drawableD.setTint(context.getColor(R.color.ytm_color_white));
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableD, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setVisibility(0);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        }
        TextView textView2 = this.i;
        alay alayVar2 = anwtVar.f;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        tuk.u(textView2, ackj.k(null, alayVar2, null, false));
        TextView textView3 = this.k;
        alay alayVar3 = anwtVar.e;
        if (alayVar3 == null) {
            alayVar3 = alay.a;
        }
        tuk.u(textView3, ackj.k(null, alayVar3, null, false));
        this.l.setVisibility((textView.getVisibility() == 0 || textView2.getVisibility() == 0 || textView3.getVisibility() == 0) ? 0 : 8);
        if (anwtVar.k.size() == 0) {
            list = anwtVar.s;
        } else {
            anws anwsVarV = context.getResources().getConfiguration().orientation == 2 ? rpi.V(anwtVar, 3) : rpi.V(anwtVar, 2);
            list = anwsVarV != null ? anwsVarV.e : agpi.a;
        }
        ArrayList arrayList = new ArrayList();
        for (anwq anwqVar : list) {
            if ((anwqVar.b & 1) != 0) {
                alix alixVar = anwqVar.c;
                if (alixVar == null) {
                    alixVar = alix.a;
                }
                arrayList.add(alixVar);
            }
        }
        if ((anwtVar.c & 524288) != 0) {
            apjiVar = anwtVar.u;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
        } else {
            apjiVar = null;
        }
        Optional optionalH = kro.H(apjiVar, ajnp.a);
        if (arrayList.size() == 1) {
            if ((((alix) arrayList.get(0)).b & 8) != 0) {
                ajwoVar = ((alix) arrayList.get(0)).e;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
            } else {
                ajwoVar = null;
            }
            kro.Y(arrayList);
        } else if (!optionalH.isPresent() || (((ajnf) optionalH.get()).b & SemanticState.Obscured) == 0) {
            ajwoVar = null;
        } else {
            ajwoVar = ((ajnf) optionalH.get()).r;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        }
        this.c.a(xgnVar, ajwoVar, adlyVar.e(), null);
        admh admhVar = this.d;
        kro.V(arrayList, linearLayout2, admhVar, adlyVarT);
        if (optionalH.isPresent()) {
            ajnf ajnfVar = (ajnf) optionalH.get();
            aliz alizVarA2 = aliz.a((ajnfVar.e == 8 ? (alja) ajnfVar.f : alja.a).c);
            if (alizVarA2 == null) {
                alizVarA2 = aliz.UNKNOWN;
            }
            if (alizVarA2 == aliz.MORE_VERT) {
                adlyVarT.f("buttonDrawableGravity", 8388613);
            }
            alay alayVar4 = ((ajnf) optionalH.get()).m;
            if (alayVar4 == null) {
                alayVar4 = alay.a;
            }
            if (alayVar4.d.isEmpty()) {
                linearLayout2.setPaddingRelative(linearLayout2.getPaddingStart(), linearLayout2.getPaddingTop(), context.getResources().getDimensionPixelSize(R.dimen.header_horizontal_padding_for_textless_button), linearLayout2.getPaddingBottom());
            }
            kro.P((ajnf) optionalH.get(), linearLayout2, admhVar, adlyVarT);
        }
        alay alayVar5 = anwtVar.d;
        if (alayVar5 == null) {
            alayVar5 = alay.a;
        }
        float f = 1.0f;
        if (alayVar5 != null) {
            Iterator it = alayVar5.c.iterator();
            while (it.hasNext()) {
                if (((alba) it.next()).g) {
                    f = 0.54f;
                    break;
                }
            }
        }
        linearLayout.setAlpha(f);
        aduw aduwVar = this.f;
        admd admdVar = this.b;
        View view = this.n;
        anwr anwrVar = anwtVar.p;
        if (anwrVar == null) {
            anwrVar = anwr.a;
        }
        if (anwrVar.b == 66439850) {
            anwr anwrVar2 = anwtVar.p;
            if (anwrVar2 == null) {
                anwrVar2 = anwr.a;
            }
            anfyVar = anwrVar2.b == 66439850 ? (anfy) anwrVar2.c : anfy.a;
        }
        anfy anfyVar2 = anfyVar;
        FrameLayout frameLayout = ((jdw) admdVar).a;
        aduwVar.m(frameLayout, view, anfyVar2, anwtVar, xgnVar);
        int i = 0;
        while (true) {
            if (i >= linearLayout.getChildCount()) {
                z = false;
                break;
            } else {
                if (linearLayout.getChildAt(i).getVisibility() != 8) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        tuk.l(linearLayout, z);
        if (Build.VERSION.SDK_INT >= 28) {
            frameLayout.setAccessibilityHeading(true);
        }
        admdVar.e(adlyVar);
    }
}

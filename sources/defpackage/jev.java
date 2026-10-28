package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jev implements adma {
    public final View a;
    private final Context b;
    private final vxe c;
    private izd d;
    private final izr e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final ViewGroup k;
    private final FixedAspectRatioFrameLayout l;
    private final LinearLayout m;
    private final ViewGroup n;
    private final ViewGroup o;
    private final RecyclerView p;
    private final jer q;
    private jeu r;
    private final jnj s;
    private kyr t;

    public jev(Context context, vxe vxeVar, izr izrVar, jer jerVar, jnj jnjVar) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_single_item_shelf, (ViewGroup) null);
        this.a = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        textView.getClass();
        this.f = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.strapline);
        textView2.getClass();
        this.g = textView2;
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.item_title);
        textView3.getClass();
        this.h = textView3;
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.item_subtitle);
        textView4.getClass();
        this.i = textView4;
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.item_companion_text);
        textView5.getClass();
        this.j = textView5;
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) viewInflate.findViewById(R.id.image);
        fixedAspectRatioFrameLayout.getClass();
        this.l = fixedAspectRatioFrameLayout;
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.content_container);
        viewGroup.getClass();
        this.k = viewGroup;
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.subtitle_badges_container);
        linearLayout.getClass();
        this.m = linearLayout;
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.thumbnail_overlay_container);
        viewGroup2.getClass();
        this.n = viewGroup2;
        this.o = (ViewGroup) viewInflate.findViewById(R.id.companion_text_content);
        this.p = (RecyclerView) viewInflate.findViewById(R.id.companion_text_buttons);
        this.c = vxeVar;
        this.b = context;
        this.e = izrVar;
        this.q = jerVar;
        this.s = jnjVar;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        kyr kyrVar = this.t;
        if (kyrVar != null) {
            kyrVar.t();
        }
        izd izdVar = this.d;
        if (izdVar != null) {
            izdVar.c();
            this.d = null;
        }
        this.e.h(this.a);
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = this.l;
        fixedAspectRatioFrameLayout.a = 0.0f;
        RecyclerView recyclerView = this.p;
        recyclerView.removeAllViews();
        recyclerView.aH(this.r);
        kro.X(fixedAspectRatioFrameLayout, admhVar);
        kro.X(this.m, admhVar);
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        ajwo ajwoVar;
        ajwo ajwoVar2;
        float f;
        View viewP;
        anxe anxeVar = (anxe) obj;
        adlyVar.b.w(new xgj(anxeVar.m, (amud) null), null);
        byte[] bArrG = anxeVar.m.G();
        xgn xgnVar = adlyVar.b;
        View view = this.a;
        izd izdVarAc = kro.ac(view, bArrG, xgnVar);
        this.d = izdVarAc;
        xgn xgnVar2 = adlyVar.b;
        if ((anxeVar.b & SemanticState.LiveRegion) != 0) {
            ajwoVar = anxeVar.k;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        vxe vxeVar = this.c;
        izdVarAc.b(izb.b(vxeVar, xgnVar2, ajwoVar, adlyVar.e()));
        izd izdVar = this.d;
        xgn xgnVar3 = adlyVar.b;
        if ((anxeVar.b & SemanticState.ReadOnly) != 0) {
            ajwoVar2 = anxeVar.l;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
        } else {
            ajwoVar2 = null;
        }
        izdVar.a(izb.b(vxeVar, xgnVar3, ajwoVar2, adlyVar.e()));
        izr izrVar = this.e;
        apji apjiVar = anxeVar.o;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        izrVar.d(view, (anfy) kro.H(apjiVar, angi.a).orElse(null), anxeVar, adlyVar.b);
        ViewGroup viewGroup = this.k;
        aiqe aiqeVar = anxeVar.n;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        kro.aa(viewGroup, aiqeVar);
        TextView textView = this.f;
        alay alayVar = anxeVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(textView, ackj.k(null, alayVar, null, false));
        TextView textView2 = this.g;
        alay alayVar2 = anxeVar.d;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        tuk.u(textView2, ackj.k(null, alayVar2, null, false));
        TextView textView3 = this.h;
        alay alayVar3 = anxeVar.e;
        if (alayVar3 == null) {
            alayVar3 = alay.a;
        }
        tuk.u(textView3, ackj.k(null, alayVar3, null, false));
        TextView textView4 = this.i;
        alay alayVar4 = anxeVar.f;
        if (alayVar4 == null) {
            alayVar4 = alay.a;
        }
        tuk.u(textView4, ackj.k(null, alayVar4, null, false));
        TextView textView5 = this.j;
        alay alayVar5 = anxeVar.g;
        if (alayVar5 == null) {
            alayVar5 = alay.a;
        }
        tuk.u(textView5, ackj.k(null, alayVar5, null, false));
        aiie aiieVar = anxeVar.p;
        LinearLayout linearLayout = this.m;
        jba jbaVar = this.q.a;
        kro.W(aiieVar, linearLayout, jbaVar, adlyVar);
        new hde(11).a(adlyVar, null, -1);
        apji apjiVar2 = anxeVar.i;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        Optional optionalH = kro.H(apjiVar2, anyj.a);
        if (optionalH.isPresent()) {
            new adxc(R.dimen.single_item_shelf_thumbnail_corner_radius).a(adlyVar, null, -1);
            FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = this.l;
            int iBc = a.bc(anxeVar.j);
            if (iBc == 0) {
                iBc = 1;
            }
            int i = iBc - 1;
            if (i == 1) {
                f = 1.0f;
            } else if (i != 3) {
                f = i != 4 ? 1.7777778f : 0.71428573f;
            } else {
                f = 2.35f;
            }
            fixedAspectRatioFrameLayout.a = f;
            Context context = this.b;
            if (context.getResources().getConfiguration().orientation == 2) {
                fixedAspectRatioFrameLayout.getLayoutParams().height = jcw.d(context, ajwd.COLLECTION_STYLE_ITEM_SIZE_UNKNOWN, agpi.a);
            }
            kro.P((anyi) optionalH.get(), fixedAspectRatioFrameLayout, jbaVar, adlyVar);
            adly adlyVar2 = new adly(adlyVar);
            adlyVar2.f("presenterSizeConstraint", new jgf(-1, -1));
            adlyVar2.f("animatedEqualizerSize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_two_row_overlay_size)));
            adlyVar2.f("nowPlayingIndicatorSize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_two_row_overlay_size_small)));
            adlyVar2.f("nowPlayingIndicatorMargin", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.item_small_spacing)));
            adlyVar2.f("playButtonSize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_two_row_play_button_size)));
            adlyVar2.f("thumbnailOverlaySize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_two_row_overlay_size)));
            aiie aiieVar2 = anxeVar.q;
            ViewGroup viewGroup2 = this.n;
            ArrayList arrayList = new ArrayList(aiieVar2.size());
            Iterator it = aiieVar2.iterator();
            while (it.hasNext()) {
                Optional optionalH2 = kro.H((apji) it.next(), anqa.a);
                if (optionalH2.isPresent() && (viewP = kro.P((anpz) optionalH2.get(), viewGroup2, jbaVar, adlyVar2)) != null) {
                    adma admaVarD = adul.d(viewP);
                    if (admaVarD instanceof jbb) {
                        arrayList.add((jbb) admaVarD);
                    }
                }
            }
            this.t = new kyr((jbb[]) arrayList.toArray(new jbb[0]));
        }
        Context context2 = this.b;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.single_item_shelf_companion_buttons_item_margin);
        jeu jeuVar = new jeu(dimensionPixelSize);
        this.r = jeuVar;
        RecyclerView recyclerView = this.p;
        recyclerView.aJ(jeuVar);
        int dimensionPixelSize2 = (anxeVar.h.size() <= 0 || (anxeVar.b & 4) != 0) ? context2.getResources().getDimensionPixelSize(R.dimen.single_item_shelf_companion_text_content_top_margin) : dimensionPixelSize - context2.getResources().getDimensionPixelSize(R.dimen.single_item_shelf_image_bottom_margin);
        ViewGroup viewGroup3 = this.o;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup3.getLayoutParams();
        marginLayoutParams.topMargin = dimensionPixelSize2;
        viewGroup3.setLayoutParams(marginLayoutParams);
        aihf aihfVarCreateBuilder = anfy.a.createBuilder();
        for (apji apjiVar3 : anxeVar.h) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar3.c(aihlVarCheckIsLite);
            if (!apjiVar3.j.n(aihlVarCheckIsLite.d)) {
                return;
            }
            aihf aihfVarCreateBuilder2 = angf.a.createBuilder();
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
            apjiVar3.c(aihlVarCheckIsLite2);
            Object objK = apjiVar3.j.k(aihlVarCheckIsLite2.d);
            ajnf ajnfVar = (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            aihfVarCreateBuilder2.copyOnWrite();
            angf angfVar = (angf) aihfVarCreateBuilder2.instance;
            ajnfVar.getClass();
            angfVar.c = ajnfVar;
            angfVar.b |= 1;
            aihfVarCreateBuilder.bJ((angf) aihfVarCreateBuilder2.build());
        }
        izrVar.f(recyclerView, (anfy) aihfVarCreateBuilder.build(), anxeVar, adlyVar.b);
    }
}

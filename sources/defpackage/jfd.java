package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jfd extends admr {
    private final Context a;
    private final vxe b;
    private final izr c;
    private final admh d;
    private final admd e;
    private final jfr f;
    private final View g;
    private final RelativeLayout h;
    private final ViewGroup i;
    private final YouTubeTextView j;
    private final YouTubeTextView k;
    private final YouTubeTextView l;
    private final LinearLayout m;
    private izd n;
    private kyr o;

    public jfd(Context context, vxe vxeVar, izr izrVar, admh admhVar, jfr jfrVar) {
        jdw jdwVar = new jdw(context);
        this.e = jdwVar;
        this.a = context;
        this.b = vxeVar;
        this.c = izrVar;
        this.d = admhVar;
        this.f = jfrVar;
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.music_spotlight_item, (ViewGroup) null);
        this.h = relativeLayout;
        this.g = relativeLayout.findViewById(R.id.spotlight_item_container);
        this.j = (YouTubeTextView) relativeLayout.findViewById(R.id.spotlight_item_header);
        this.k = (YouTubeTextView) relativeLayout.findViewById(R.id.spotlight_item_title);
        this.l = (YouTubeTextView) relativeLayout.findViewById(R.id.spotlight_item_subtitle);
        this.m = (LinearLayout) relativeLayout.findViewById(R.id.spotlight_item_subtitle_badges_container);
        this.i = (ViewGroup) relativeLayout.findViewById(R.id.spotlight_item_thumbnail_container);
        jdwVar.c(relativeLayout);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.e).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        ViewGroup viewGroup = this.i;
        jfr jfrVar = this.f;
        viewGroup.removeView(jfrVar.a);
        jfrVar.b(admhVar);
        izd izdVar = this.n;
        if (izdVar != null) {
            izdVar.c();
            this.n = null;
        }
        kro.X(viewGroup, admhVar);
        kro.X(this.m, admhVar);
        kyr kyrVar = this.o;
        if (kyrVar != null) {
            kyrVar.t();
            this.o = null;
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        anxq anxqVar = (anxq) obj;
        byte[] bArrG = anxqVar.h.G();
        View view = this.g;
        this.n = kro.ac(view, bArrG, adlyVar.b);
        xgn xgnVar = adlyVar.b;
        ajwo ajwoVar = anxqVar.f;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        vxe vxeVar = this.b;
        izb izbVarB = izb.b(vxeVar, xgnVar, ajwoVar, adlyVar.e());
        if (izbVarB != null) {
            this.n.b(izbVarB);
        }
        xgn xgnVar2 = adlyVar.b;
        ajwo ajwoVar2 = anxqVar.g;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        izb izbVarB2 = izb.b(vxeVar, xgnVar2, ajwoVar2, adlyVar.e());
        if (izbVarB2 != null) {
            this.n.a(izbVarB2);
        }
        RelativeLayout relativeLayout = this.h;
        aiqe aiqeVar = anxqVar.i;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        kro.aa(relativeLayout, aiqeVar);
        YouTubeTextView youTubeTextView = this.j;
        alay alayVar = anxqVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(youTubeTextView, ackj.k(null, alayVar, null, false));
        YouTubeTextView youTubeTextView2 = this.k;
        alay alayVar2 = anxqVar.d;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        tuk.u(youTubeTextView2, ackj.k(null, alayVar2, null, false));
        YouTubeTextView youTubeTextView3 = this.l;
        alay alayVar3 = anxqVar.e;
        if (alayVar3 == null) {
            alayVar3 = alay.a;
        }
        tuk.u(youTubeTextView3, ackj.k(null, alayVar3, null, true));
        apji apjiVar = anxqVar.b;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        Optional optionalH = kro.H(apjiVar, anyj.a);
        if (optionalH.isPresent()) {
            new adxc(R.dimen.music_thumbnail_default_corner_radius).a(adlyVar, null, -1);
            jfr jfrVar = this.f;
            jfrVar.hU(adlyVar, (anyi) optionalH.get());
            ViewGroup viewGroup = this.i;
            viewGroup.removeAllViews();
            viewGroup.addView(jfrVar.a);
            viewGroup.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
        if (anxqVar.l.size() != 0) {
            Context context = this.a;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.music_spotlight_item_thumbnail_width);
            jgf jgfVar = new jgf(dimensionPixelSize, dimensionPixelSize);
            adly adlyVar2 = new adly(adlyVar);
            adlyVar2.f("presenterSizeConstraint", jgfVar);
            adlyVar2.f("animatedEqualizerSize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_spotlight_item_overlay_size)));
            adlyVar2.f("nowPlayingIndicatorSize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_icon_size)));
            adlyVar2.f("nowPlayingIndicatorMargin", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.item_small_spacing)));
            adlyVar2.f("playButtonSize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_spotlight_item_play_button_size)));
            adlyVar2.f("thumbnailOverlaySize", Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.music_spotlight_item_overlay_size)));
            ArrayList arrayList = new ArrayList();
            Iterator it = anxqVar.l.iterator();
            while (it.hasNext()) {
                Optional optionalH2 = kro.H((apji) it.next(), anqa.a);
                if (optionalH2.isPresent()) {
                    admh admhVar = this.d;
                    anpz anpzVar = (anpz) optionalH2.get();
                    ViewGroup viewGroup2 = this.i;
                    jdx jdxVar = (jdx) adul.e(admhVar, anpzVar, viewGroup2);
                    if (jdxVar != null) {
                        jdxVar.hU(adlyVar2, (anpz) optionalH2.get());
                        int iA = admhVar.a(optionalH2.get());
                        ViewGroup viewGroup3 = jdxVar.b;
                        adul.j(viewGroup3, jdxVar, iA);
                        viewGroup2.addView(viewGroup3);
                        arrayList.add(jdxVar);
                    }
                }
            }
            this.o = new kyr((jbb[]) arrayList.toArray(new jbb[0]));
        }
        kro.W(anxqVar.k, this.m, this.d, adlyVar);
        izr izrVar = this.c;
        apji apjiVar2 = anxqVar.j;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        izrVar.d(view, (anfy) kro.H(apjiVar2, angi.a).orElse(null), anxqVar, adlyVar.b);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((anxq) obj).h.G();
    }
}

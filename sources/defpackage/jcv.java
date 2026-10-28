package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jcv implements adma {
    private static final adxc b = new adxc(R.dimen.music_thumbnail_default_corner_radius);
    public final vxe a;
    private final admd c;
    private final ViewGroup d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;
    private final View g;
    private final ViewGroup h;
    private final ViewGroup i;
    private final LinearLayout j;
    private final LinearLayout k;
    private final adlw l;
    private final Context m;
    private final admh n;

    public jcv(Context context, vxe vxeVar, admh admhVar) {
        this.m = context;
        this.n = admhVar;
        this.a = vxeVar;
        jdw jdwVar = new jdw(context);
        this.c = jdwVar;
        this.l = new adlw(vxeVar, jdwVar, (adlu) null);
        View viewInflate = View.inflate(context, R.layout.music_carousel_shelf_basic_header, null);
        this.g = viewInflate;
        this.d = (ViewGroup) viewInflate.findViewById(R.id.carousel_header_top_divider);
        this.i = (ViewGroup) viewInflate.findViewById(R.id.section_above_text);
        this.h = (ViewGroup) viewInflate.findViewById(R.id.thumbnail_container);
        this.e = (YouTubeTextView) viewInflate.findViewById(R.id.carousel_title);
        YouTubeTextView youTubeTextView = (YouTubeTextView) viewInflate.findViewById(R.id.carousel_strapline);
        this.f = youTubeTextView;
        this.j = (LinearLayout) viewInflate.findViewById(R.id.end_icons);
        this.k = (LinearLayout) viewInflate.findViewById(R.id.end_title_icons);
        youTubeTextView.setTextColor(context.getColor(R.color.yt_white1_opacity70));
        jdwVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.c).a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        kro.Z(this.g, 0, 0);
        this.c.b(false);
        kro.X(this.j, admhVar);
        kro.X(this.k, admhVar);
        kro.X(this.i, admhVar);
        this.l.b();
        kro.X(this.d, admhVar);
        ViewGroup viewGroup = this.h;
        kro.X(viewGroup, admhVar);
        viewGroup.setOnClickListener(null);
        viewGroup.setClickable(false);
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        View view = this.g;
        anll anllVar = (anll) obj;
        adly adlyVarT = kro.T(view, adlyVar);
        ixn ixnVarC = jeo.c(adlyVarT);
        if (ixnVarC != null) {
            kro.P(ixnVarC, this.d, this.n, adlyVarT);
        }
        apji apjiVar = anllVar.l;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        Optional optionalH = kro.H(apjiVar, ajtd.a);
        boolean zIsPresent = optionalH.isPresent();
        ViewGroup viewGroup = this.i;
        if (zIsPresent) {
            viewGroup.setVisibility(0);
            adly adlyVar2 = new adly(adlyVarT);
            adlyVar2.f("backgroundColor", Integer.valueOf(this.m.getColor(R.color.full_transparent)));
            kro.P((ajta) optionalH.get(), viewGroup, this.n, adlyVar2);
        } else {
            viewGroup.setVisibility(8);
        }
        apji apjiVar2 = anllVar.i;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        Optional optionalH2 = kro.H(apjiVar2, anyj.a);
        if (optionalH2.isPresent()) {
            adly adlyVar3 = new adly(adlyVarT);
            b.a(adlyVar3, adle.a, -1);
            ViewGroup viewGroup2 = this.h;
            viewGroup2.setVisibility(0);
            kro.P((anyi) optionalH2.get(), viewGroup2, this.n, adlyVar3);
        } else {
            this.h.setVisibility(8);
        }
        YouTubeTextView youTubeTextView = this.e;
        alay alayVar = anllVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(youTubeTextView, ackj.k(null, alayVar, null, false));
        YouTubeTextView youTubeTextView2 = this.f;
        alay alayVar2 = anllVar.d;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        tuk.u(youTubeTextView2, ackj.k(null, alayVar2, null, false));
        int iBc = a.bc(anllVar.h);
        int i = R.style.TextAppearance_YouTubeMusic_Display1Modern;
        if (iBc != 0 && iBc == 4) {
            i = R.style.TextAppearance_YouTubeMusic_Display2Modern;
        }
        youTubeTextView.setTextAppearance(i);
        List listI = kro.I(anllVar.g, aliy.a);
        if (((agpi) listI).d == 1) {
            aihf builder = ((alix) listI.get(0)).toBuilder();
            builder.copyOnWrite();
            alix alixVar = (alix) builder.instance;
            alixVar.e = null;
            alixVar.b &= -9;
            listI = agke.q((alix) builder.build());
        }
        LinearLayout linearLayout = this.j;
        admh admhVar = this.n;
        kro.V(listI, linearLayout, admhVar, adlyVarT);
        kro.V(kro.I(anllVar.k, ajkv.a), this.k, admhVar, adlyVarT);
        apji apjiVar3 = anllVar.j;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        Optional optionalH3 = kro.H(apjiVar3, ajnp.a);
        if (optionalH3.isPresent()) {
            kro.P((ajnf) optionalH3.get(), linearLayout, admhVar, adlyVarT);
        }
        if (optionalH2.isPresent() && (((anyi) optionalH2.get()).b & 64) != 0) {
            this.h.setOnClickListener(new gdp(this, optionalH2, 19));
        }
        if ((anllVar.b & 8) != 0) {
            adlw adlwVar = this.l;
            xgn xgnVar = adlyVar.b;
            ajwo ajwoVar = anllVar.f;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            adlwVar.a(xgnVar, ajwoVar, adlyVar.e(), null);
        }
        aiqe aiqeVar = anllVar.e;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        if ((aiqeVar.b & 1) != 0) {
            aiqe aiqeVar2 = anllVar.e;
            if (aiqeVar2 == null) {
                aiqeVar2 = aiqe.a;
            }
            aiqd aiqdVar = aiqeVar2.c;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
            view.setContentDescription(aiqdVar.c);
        } else {
            view.setContentDescription(null);
        }
        bac.q(youTubeTextView, true);
        admd admdVar = this.c;
        bac.q(((jdw) admdVar).a, true);
        admdVar.e(adlyVar);
    }
}

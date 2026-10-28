package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jcr implements SharedPreferences.OnSharedPreferenceChangeListener, SeekBar.OnSeekBarChangeListener, adma, hlo {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/ui/presenter/MusicAutoOfflineEducationShelfPresenter");
    private final ViewGroup b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;
    private final ViewGroup g;
    private final ViewGroup h;
    private final ViewGroup i;
    private final SeekBar j;
    private final Context k;
    private final admh l;
    private final hnq m;
    private final hlp n;
    private final tbt o;
    private final jkp p;
    private final hlz q;
    private final aany r;
    private ankz s;
    private avmn t;
    private final aanb u;
    private final hnz v;
    private final vxz w;

    public jcr(Context context, admh admhVar, hnq hnqVar, hlp hlpVar, vxz vxzVar, tbt tbtVar, jkp jkpVar, hlz hlzVar, aanb aanbVar, hnz hnzVar, aany aanyVar) {
        this.k = context;
        this.l = admhVar;
        this.m = hnqVar;
        this.n = hlpVar;
        this.w = vxzVar;
        this.o = tbtVar;
        this.p = jkpVar;
        this.q = hlzVar;
        this.u = aanbVar;
        this.v = hnzVar;
        this.r = aanyVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.music_auto_offline_education_shelf, (ViewGroup) null);
        this.b = viewGroup;
        this.c = (YouTubeTextView) viewGroup.findViewById(R.id.title);
        this.d = (YouTubeTextView) viewGroup.findViewById(R.id.downloaded_songs_limit);
        this.e = (YouTubeTextView) viewGroup.findViewById(R.id.remaining_space);
        this.f = (YouTubeTextView) viewGroup.findViewById(R.id.description);
        this.h = (ViewGroup) viewGroup.findViewById(R.id.badge_container);
        this.i = (ViewGroup) viewGroup.findViewById(R.id.button_container);
        this.g = (ViewGroup) viewGroup.findViewById(R.id.badge_explanation_container);
        this.j = (SeekBar) viewGroup.findViewById(R.id.num_tracks_seekbar);
    }

    @Override // defpackage.hlo
    public final void U() {
        d(this.m.c());
    }

    @Override // defpackage.hlo
    public final void W() {
        d(this.m.c());
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.s = null;
        kro.Z(this.b, 0, 0);
        kro.X(this.h, admhVar);
        kro.X(this.i, admhVar);
        Object obj = this.t;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.t = null;
        }
        this.n.i(this);
        this.p.unregisterOnSharedPreferenceChangeListener(this);
    }

    public final void d(int i) {
        Resources resources = this.k.getResources();
        String quantityString = resources.getQuantityString(R.plurals.smart_downloads_num_songs_estimated_space, i, Integer.valueOf(i), typ.h(resources, hnq.b(aohx.AUDIO_ONLY, this.n.c(), i)));
        hlz hlzVar = this.q;
        long jB = hlzVar.f.b();
        Context context = hlzVar.d;
        String string = context.getString(R.string.pref_offline_storage_free, typ.h(context.getResources(), jB / 1048576));
        this.d.setText(quantityString);
        this.e.setText(string);
        SeekBar seekBar = this.j;
        if (seekBar.getProgress() != i) {
            seekBar.setProgress(i);
        }
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        ankz ankzVar = (ankz) obj;
        this.s = ankzVar;
        ViewGroup viewGroup = this.b;
        adly adlyVarT = kro.T(viewGroup, adlyVar);
        viewGroup.setBackgroundResource(R.drawable.auto_downloads_education_shelf_background);
        Context context = this.k;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.item_large_spacing);
        int iB = adlyVar.b("pagePadding", 0) + dimensionPixelSize;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(iB, 0, iB, dimensionPixelSize);
        viewGroup.setLayoutParams(marginLayoutParams);
        viewGroup.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.item_small_spacing), 0, dimensionPixelSize);
        SeekBar seekBar = this.j;
        seekBar.setOnSeekBarChangeListener(this);
        iwb iwbVar = new iwb(this, 12);
        hnq hnqVar = this.m;
        this.t = hnqVar.c.af(iwbVar);
        this.n.f(this);
        this.p.registerOnSharedPreferenceChangeListener(this);
        seekBar.setMax(501);
        alay alayVar = ankzVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        tuk.u(this.c, ackj.k(null, alayVar, null, false));
        YouTubeTextView youTubeTextView = this.f;
        alay alayVar2 = ankzVar.d;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        tuk.u(youTubeTextView, ackj.k(null, alayVar2, null, false));
        d(hnqVar.c());
        this.g.setVisibility(8);
        ViewGroup viewGroup2 = this.i;
        viewGroup2.removeAllViews();
        List listI = kro.I(ankzVar.e, ajnp.a);
        if (listI.isEmpty()) {
            tuk.l(viewGroup2, false);
            return;
        }
        adly adlyVar2 = new adly(adlyVarT);
        adlyVar2.f("hideEnclosingActionCommandKey", ankzVar);
        kro.V(listI, viewGroup2, this.l, adlyVar2);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int iL = ahng.L(i, 1, 500);
        seekBar.setContentDescription(a.bN(this.k, R.string.pref_offline_mixtape_storage_capacity_num_tracks, "num_songs", Integer.valueOf(iL)));
        if (z) {
            this.m.e(iL);
            d(iL);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (TextUtils.equals(this.p.b("auto_offline_edu_shelf_dismissed"), str) && this.s != null && this.m.f()) {
            this.o.c(new vvt(this.s));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.m.g()) {
            aanb aanbVar = this.u;
            vxz vxzVar = this.w;
            aaqn aaqnVarB = aanbVar.b();
            if (!vxzVar.l(39, 45376078L, false)) {
                this.v.j(aaqnVarB.s(), aaqnVarB);
                return;
            }
            try {
                aany aanyVar = this.r;
                aihf aihfVarCreateBuilder = aofh.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
                aofhVar.c = 1;
                aofhVar.b |= 1;
                String strAG = kro.aG();
                aihfVarCreateBuilder.copyOnWrite();
                aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
                strAG.getClass();
                aofhVar2.b |= 2;
                aofhVar2.d = strAG;
                aihh aihhVar = (aihh) aofg.b.createBuilder();
                aihhVar.copyOnWrite();
                aofg aofgVar = (aofg) aihhVar.instance;
                aofgVar.c |= 1;
                aofgVar.d = -6;
                aihfVarCreateBuilder.copyOnWrite();
                aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
                aofg aofgVar2 = (aofg) aihhVar.build();
                aofgVar2.getClass();
                aofhVar3.e = aofgVar2;
                aofhVar3.b |= 4;
                aanyVar.a((aofh) aihfVarCreateBuilder.build());
            } catch (aaob e) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/apps/youtube/music/ui/presenter/MusicAutoOfflineEducationShelfPresenter", "onStopTrackingTouch", (char) 281, "MusicAutoOfflineEducationShelfPresenter.java")).t("Couldn't refresh smart download content.");
            }
        }
    }

    @Override // defpackage.hlo
    public final /* synthetic */ void V() {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }
}

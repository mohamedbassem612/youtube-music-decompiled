package defpackage;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iix {
    public final Context a;
    public final vxe b;
    public final tbt c;
    public final acxx d;
    public final acyx e;
    public final nsr f;
    public fv g;
    public iiw h;
    public xgn i;
    public xgz j;
    public final hfn k;
    public final xsc l;
    private final ijd m;
    private final admu n;
    private final admu o;
    private final xgm p;
    private final ahek q;

    public iix(Activity activity, vwt vwtVar, vxe vxeVar, tbt tbtVar, xgm xgmVar, ahek ahekVar, xsc xscVar, acxx acxxVar, acyx acyxVar, nsr nsrVar, avlr avlrVar, hfn hfnVar, jij jijVar) {
        this.a = activity;
        vxeVar.getClass();
        this.b = vxeVar;
        this.c = tbtVar;
        xgmVar.getClass();
        this.p = xgmVar;
        this.q = ahekVar;
        this.l = xscVar;
        this.n = new admu();
        this.o = new admu();
        this.d = acxxVar;
        this.e = acyxVar;
        this.f = nsrVar;
        this.k = hfnVar;
        this.m = new ijd(activity, tbtVar, jijVar);
        xgn xgnVarHB = xgmVar.hB();
        this.i = xgnVarHB == null ? xgn.l : xgnVarHB;
        tbtVar.f(this);
        vwtVar.D(new egz(this, avlrVar, hfnVar, 17, (short[]) null));
    }

    public static /* synthetic */ ajwo c(ajwo ajwoVar, String str) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aotf.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return ajwoVar;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aotf.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aotf aotfVar = (aotf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        aihf builder = aotfVar.toBuilder();
        builder.copyOnWrite();
        ((aotf) builder.instance).e = aotf.emptyProtobufList();
        Iterator it = aotfVar.e.iterator();
        while (it.hasNext()) {
            aihf builder2 = ((aote) it.next()).toBuilder();
            builder2.copyOnWrite();
            aote aoteVar = (aote) builder2.instance;
            str.getClass();
            aoteVar.b |= 32;
            aoteVar.f = str;
            aote aoteVar2 = (aote) builder2.build();
            builder.copyOnWrite();
            aotf aotfVar2 = (aotf) builder.instance;
            aoteVar2.getClass();
            aotfVar2.a();
            aotfVar2.e.add(aoteVar2);
        }
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihhVar.e(aotf.b, (aotf) builder.build());
        return (ajwo) aihhVar.build();
    }

    private final void d(admh admhVar, RecyclerView recyclerView, admu admuVar) {
        admo admoVarD = this.q.d(admhVar);
        admuVar.clear();
        admoVarD.D(admuVar, null);
        recyclerView.ad(admoVarD);
        recyclerView.ah(new iiu(this.a));
    }

    public final void a(alwm alwmVar, xgn xgnVar, iiw iiwVar) {
        int i;
        aiie<alwn> aiieVar = alwmVar.d;
        this.h = iiwVar;
        this.i = xgnVar == null ? this.i : xgnVar;
        if ((alwmVar.b & 16) != 0) {
            xgj xgjVar = new xgj(alwmVar.f, (amud) null);
            this.j = xgjVar;
            this.i.d(xgjVar);
        }
        adlg adlgVar = new adlg();
        int i2 = 1;
        adlgVar.d(aosu.class, new rle(this, i2));
        Context context = this.a;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.add_to_playlist_dialog, (ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.playlists);
        admu admuVar = this.n;
        d(adlgVar, recyclerView, admuVar);
        RecyclerView recyclerView2 = (RecyclerView) viewInflate.findViewById(R.id.top_playlists);
        admu admuVar2 = this.o;
        d(adlgVar, recyclerView2, admuVar2);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.actions);
        admuVar.clear();
        admuVar.e(new adlk(this.i, 0));
        admuVar2.clear();
        admuVar2.e(new adlk(this.i, 0));
        Spanned spannedK = null;
        for (alwn alwnVar : aiieVar) {
            int i3 = alwnVar.b;
            if (i3 == 88978004) {
                aiwx aiwxVar = i3 == 88978004 ? (aiwx) alwnVar.c : aiwx.a;
                if ((aiwxVar.b & i2) != 0) {
                    alay alayVar = aiwxVar.c;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    spannedK = ackj.k(null, alayVar, null, false);
                }
                if (aiwxVar.e.size() > 0) {
                    for (apji apjiVar : aiwxVar.e) {
                        aihl aihlVar = aosv.a;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                        apjiVar.c(aihlVarCheckIsLite);
                        int i4 = i2;
                        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                            apjiVar.c(aihlVarCheckIsLite2);
                            Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                            admuVar2.add(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                        }
                        i2 = i4;
                    }
                    i = i2;
                    viewInflate.findViewById(R.id.top_playlists_container).setVisibility(0);
                    if ((aiwxVar.b & 2) != 0) {
                        YouTubeTextView youTubeTextView = (YouTubeTextView) viewInflate.findViewById(R.id.add_to_playlist_top_playlists_title);
                        youTubeTextView.setVisibility(0);
                        alay alayVar2 = aiwxVar.d;
                        if (alayVar2 == null) {
                            alayVar2 = alay.a;
                        }
                        youTubeTextView.setText(ackj.k(null, alayVar2, null, false));
                    }
                    if ((aiwxVar.b & 8) != 0) {
                        YouTubeTextView youTubeTextView2 = (YouTubeTextView) viewInflate.findViewById(R.id.add_to_playlist_all_playlists_title);
                        youTubeTextView2.setVisibility(0);
                        alay alayVar3 = aiwxVar.f;
                        if (alayVar3 == null) {
                            alayVar3 = alay.a;
                        }
                        youTubeTextView2.setText(ackj.k(null, alayVar3, null, false));
                    }
                } else {
                    i = i2;
                }
                for (aiww aiwwVar : aiwxVar.g) {
                    int i5 = aiwwVar.b;
                    if (i5 == 74079946) {
                        admuVar.add(i5 == 74079946 ? (aosu) aiwwVar.c : aosu.a);
                    }
                }
                ije ijeVarB = this.m.b();
                for (aiwv aiwvVar : aiwxVar.h) {
                    if ((aiwvVar.b & 1) != 0) {
                        linearLayout.addView(ijeVarB.a());
                        adly adlyVar = new adly();
                        adlyVar.a(this.i);
                        ajnf ajnfVar = aiwvVar.c;
                        if (ajnfVar == null) {
                            ajnfVar = ajnf.a;
                        }
                        ijeVarB.hU(adlyVar, ajnfVar);
                    }
                }
                i2 = i;
            }
        }
        fu fuVar = new fu(context);
        fuVar.setView(viewInflate);
        fuVar.g(new gxt(this, 4));
        View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.add_to_playlist_title, (ViewGroup) null, false);
        if (spannedK != null) {
            ((YouTubeTextView) viewInflate2.findViewById(R.id.title_text)).setText(spannedK);
        }
        ((AppCompatImageView) viewInflate2.findViewById(R.id.close_button)).setOnClickListener(new hdf(this, 7));
        fuVar.b(viewInflate2);
        this.g = fuVar.create();
        if (jku.c(context)) {
            this.g.show();
        }
    }

    public final boolean b() {
        fv fvVar;
        return jku.c(this.a) && (fvVar = this.g) != null && fvVar.isShowing();
    }

    @tcc
    void handleDismissAddToPlaylistDialogEvent(iiy iiyVar) {
        if (b()) {
            xgz xgzVar = this.j;
            if (xgzVar != null) {
                this.i.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgzVar, null);
            }
            fv fvVar = this.g;
            if (fvVar != null) {
                fvVar.dismiss();
            }
        }
    }
}

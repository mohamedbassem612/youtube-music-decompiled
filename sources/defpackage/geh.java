package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.activities.MusicActivity;
import com.google.android.libraries.youtube.player.features.storyboard.ScrubbedPreviewView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class geh implements aupn {
    public static gfp b(Activity activity, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, tqj tqjVar) {
        gfp gfpVar;
        if (activity instanceof MusicActivity) {
            int i = tqr.a;
            gfpVar = tqjVar.k(1073830461) ? (gfp) aunnVar2.io() : (gfp) aunnVar.io();
        } else {
            gfpVar = (gfp) aunnVar3.io();
        }
        gfpVar.getClass();
        return gfpVar;
    }

    public static ViewGroup c(MusicActivity musicActivity) {
        ViewGroup viewGroup = (ViewGroup) musicActivity.findViewById(R.id.accessibility_layer_container);
        viewGroup.getClass();
        return viewGroup;
    }

    public static View d(MusicActivity musicActivity) {
        View viewFindViewById = musicActivity.findViewById(R.id.accessibility_layer_container);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    public static avlh e(hwc hwcVar) {
        avlh avlhVar = hwcVar.H;
        avlhVar.getClass();
        return avlhVar;
    }

    public static avlh f(hwc hwcVar) {
        return hwcVar.G.P();
    }

    public static ScrubbedPreviewView g(Context context) {
        ScrubbedPreviewView scrubbedPreviewView = (ScrubbedPreviewView) LayoutInflater.from(context).inflate(R.layout.scrubbed_preview_view, (ViewGroup) null);
        scrubbedPreviewView.getClass();
        return scrubbedPreviewView;
    }

    public static View h(MusicActivity musicActivity) {
        View viewFindViewById = musicActivity.findViewById(R.id.accessibility_layer_container);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    public static MusicActivity i(Activity activity) {
        MusicActivity musicActivityU = gzj.u(activity);
        musicActivityU.getClass();
        return musicActivityU;
    }

    public static glb j(aunn aunnVar) {
        glb glbVar = (glb) aunnVar.io();
        glbVar.getClass();
        return glbVar;
    }

    public static tqo k(tqj tqjVar, awmd awmdVar, awmd awmdVar2) {
        int i = tqr.a;
        if (tqjVar.c(1074004054) + tqjVar.c(1073938522) > 0) {
            awmdVar = awmdVar2;
        }
        tqo tqoVar = (tqo) awmdVar.io();
        tqoVar.getClass();
        return tqoVar;
    }

    public static FirebaseAnalytics l(Context context) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        firebaseAnalytics.getClass();
        return firebaseAnalytics;
    }

    public static agkj m() {
        agkj agkjVar = xdr.a;
        agkjVar.getClass();
        return agkjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xgm n(Activity activity) {
        xgm adymVar = activity instanceof xgm ? (xgm) activity : new adym(1);
        adymVar.getClass();
        return adymVar;
    }

    public static dd o(cf cfVar) {
        dd supportFragmentManager = cfVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        return supportFragmentManager;
    }

    public static hdv p(vxa vxaVar, xgm xgmVar, vxe vxeVar, Map map) {
        xgmVar.getClass();
        vxeVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vwz(map));
        return new hdv(new vwr(new vwy(vxaVar, agke.n(arrayList)), vxeVar), xgmVar);
    }

    public static abvn q(gim gimVar) {
        return new gir(gimVar.a);
    }

    public static abvc r(abvn abvnVar) {
        abvc abvcVarN = abvnVar.n();
        abvcVarN.getClass();
        return abvcVarN;
    }

    public static aboi s(abvn abvnVar) {
        aboi aboiVarZ = abvnVar.Z();
        aboiVarZ.getClass();
        return aboiVarZ;
    }

    public static abvk t(abvn abvnVar) {
        abvk abvkVarO = abvnVar.o();
        abvkVarO.getClass();
        return abvkVarO;
    }

    public static acdo u(abvn abvnVar) {
        acdo acdoVarW = abvnVar.w();
        acdoVarW.getClass();
        return acdoVarW;
    }

    public static hdv v(vxa vxaVar, jnm jnmVar, xgm xgmVar, Map map, Map map2) {
        xgmVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vwz(map));
        arrayList.add(new vwz(map2));
        return new hdv(jnmVar.E(new vwy(vxaVar, agke.n(arrayList))), xgmVar);
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}

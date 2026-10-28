package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class imb extends ilr {
    public awmd a;
    public iwe b;
    public jki c;
    private Bundle cw;
    private AppBarLayout cx;
    private Toolbar cy;
    public ilx d;
    public ilw e;
    public ahfi f;

    private final void aq() {
        if (ar()) {
            this.b.a(0);
        }
    }

    private final boolean ar() {
        return this.c.i(this) && !((WatchWhileLayout) this.a.io()).ac();
    }

    public static imb b(Bundle bundle) {
        bundle.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor").getClass();
        imb imbVar = new imb();
        imbVar.setArguments(bundle);
        return imbVar;
    }

    @Override // defpackage.acoi
    protected final abmy c() {
        getActivity().getClass();
        abmz abmzVar = abmz.a;
        return new abmy(abmzVar, new ima(this), abmzVar, abmzVar);
    }

    @Override // defpackage.acoi, defpackage.acmz
    public final boolean d() {
        return hmy.an(getArguments());
    }

    @Override // defpackage.acoi
    protected final boolean e() {
        return ar() && this.d.b;
    }

    @Override // defpackage.acoi, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        agrx agrxVar = agso.a;
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        setHasOptionsMenu(true);
    }

    @Override // defpackage.acoi, defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        agrx agrxVar = agso.a;
        ilw ilwVar = this.e;
        if (ilwVar.j.m(34, 45671820L)) {
            ilwVar.i();
            aunn aunnVar = ilwVar.f;
            ((ilx) aunnVar.io()).a(true);
            ((ilx) aunnVar.io()).c = true;
        }
        Bundle bundle2 = this.cw;
        if (bundle2 != null) {
            this.cw = null;
            bundle = bundle2;
        }
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        viewOnCreateView.getClass();
        ViewGroup viewGroup3 = (ViewGroup) viewOnCreateView;
        if (!((vxz) this.ck.i).l(278, 45818901L, false) || (viewGroup2 = (ViewGroup) viewGroup3.findViewById(R.id.reel_watch_fragment_root)) == null) {
            viewGroup2 = viewGroup3;
        }
        layoutInflater.inflate(R.layout.reel_samples_app_bar, viewGroup2);
        this.cx = (AppBarLayout) viewGroup3.findViewById(R.id.reel_samples_app_bar);
        this.cy = (Toolbar) viewGroup3.findViewById(R.id.toolbar);
        return viewGroup3;
    }

    @Override // defpackage.acoi, defpackage.cc
    public final void onDestroy() {
        agrx agrxVar = agso.a;
        super.onDestroy();
    }

    @Override // defpackage.acoi, defpackage.cc
    public final void onDestroyView() {
        agrx agrxVar = agso.a;
        super.onDestroyView();
        this.cx = null;
        this.cy = null;
    }

    @Override // defpackage.cc
    public final void onHiddenChanged(boolean z) {
        if (z) {
            return;
        }
        aq();
    }

    @Override // defpackage.cc
    public final void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
    }

    @Override // defpackage.acoi, defpackage.cc
    public final void onResume() {
        super.onResume();
        aq();
    }

    @Override // defpackage.acoi, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        acmd acmdVar;
        agrx agrxVar = agso.a;
        int iMax = 0;
        if (!((vxz) this.ck.m).l(13, 45664026L, false) || this.bg) {
            acqq acqqVarE = this.t.e();
            if (this.t.Q()) {
                agke agkeVar = agpi.a;
                acmdVar = new acmd(agkeVar, agkeVar);
            } else {
                acmdVar = new acmd(acqqVarE.a, this.t.m());
            }
            bundle.putParcelable("ReelToReelListBundleKey", acmdVar);
            String str = acoi.g;
            acrn acrnVar = this.t.b;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("ReelSequenceController.IS_INITIALIZED_KEY", acrnVar.n);
            bundle2.putParcelable("ReelSequenceController.PENDING_PREV_CONTINUATION_KEY", acrnVar.h);
            bundle2.putParcelable("ReelSequenceController.PENDING_NEXT_CONTINUATION_KEY", acrnVar.i);
            bundle2.putParcelable("ReelSequenceController.PENDING_REFRESH_CONTINUATION_KEY", acrnVar.j);
            bundle2.putParcelable("ReelSequenceController.PENDING_SOFT_REFRESH_CONTINUATION_KEY", acrnVar.k);
            bundle2.putBoolean("ReelSequenceController.END_OF_SEQUENCE_KEY", acrnVar.m);
            Optional optional = acrnVar.l;
            acrj acrjVar = new acrj(bundle2, iMax);
            if (true == optional.isPresent()) {
                Object obj = optional.get();
                ((Bundle) acrjVar.a).putByteArray("ReelSequenceController.LATEST_TRACKING_PARAMS_KEY", ((aigj) obj).G());
            }
            bundle.putBundle(str, bundle2);
            bundle.putBoolean("UseRpcSequenceKey", this.t.Q());
            apfu apfuVar = this.br;
            if (apfuVar != null) {
                bundle.putByteArray("ReelWatchExperienceConfigKey", apfuVar.toByteArray());
            }
            xgn xgnVarHB = this.O.hB();
            if (xgnVarHB != null) {
                bundle.putString(acoi.h, xgnVarHB.i());
            }
            bundle.putBundle(acoi.i, Bundle.EMPTY);
            if (this.ck.aG()) {
                bundle.getClass();
            }
            Optional optionalI = this.t.i();
            if (optionalI.isPresent() && ((((acra) optionalI.get()).k() || ((acra) optionalI.get()).j()) && this.cc.m(3, 45368551L))) {
                if (this.ck.T()) {
                    acqz acqzVar = this.t;
                    if (acqzVar.Q()) {
                        hno hnoVar = acqzVar.at;
                        if (hnoVar.Q()) {
                            iMax = Math.max(0, acqzVar.Q - hnoVar.d());
                        }
                    }
                    bundle.putInt("AdapterPositionKey", acqzVar.Q - iMax);
                } else {
                    bundle.putLong("PagePositionKey", ((acra) optionalI.get()).q);
                }
            }
        }
        this.cw = bundle;
    }

    @Override // defpackage.acoi, defpackage.cc
    public final void onStop() {
        abnl abnlVarA;
        acol acolVar;
        wjf wjfVarC;
        agrx agrxVar = agso.a;
        if (isRemoving()) {
            Bundle arguments = getArguments();
            if (hmy.an(arguments)) {
                cb cbVarD = getParentFragmentManager().d(this);
                this.bO = true;
                abnl abnlVar = this.F.f(2).a;
                acmd acmdVar = null;
                if (abnlVar == null) {
                    abnlVarA = (!this.ck.T() || (acolVar = this.bp) == null) ? null : acolVar.c;
                } else if (this.bB == null || !aecm.aq(aecm.Z(abnlVar))) {
                    abnk abnkVarF = abnlVar.f();
                    acfw acfwVarI = this.F.i();
                    if (acfwVarI != null && (wjfVarC = acfwVarI.c()) != null && !wjfVarC.V() && !wjfVarC.aa()) {
                        acfw acfwVarI2 = this.F.i();
                        abnkVarF.k = acfwVarI2 != null ? acfwVarI2.a() : 0L;
                    }
                    abnlVarA = abnkVarF.a();
                } else {
                    abnk abnkVar = new abnk();
                    abnkVar.a = this.bB;
                    abnlVarA = abnkVar.a();
                }
                acqz acqzVar = this.t;
                ArrayList arrayList = new ArrayList();
                Optional optionalJ = acqzVar.j();
                if (optionalJ.isEmpty() || !((acra) optionalJ.get()).l()) {
                    arrayList = null;
                } else {
                    Iterator it = ((acra) optionalJ.get()).o.iterator();
                    while (it.hasNext()) {
                        ajwo ajwoVar = ((acra) it.next()).f;
                        if (acqzVar.at.ai() && ajwoVar != null) {
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                            ajwoVar.c(aihlVarCheckIsLite);
                            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                                ajwoVar.c(aihlVarCheckIsLite2);
                                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                                if (((apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).i == 44) {
                                    aihh aihhVar = (aihh) ajwoVar.toBuilder();
                                    aihl aihlVar = apfp.b;
                                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                                    ajwoVar.c(aihlVarCheckIsLite3);
                                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                                    aihh aihhVar2 = (aihh) ((apfp) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).toBuilder();
                                    aihhVar2.copyOnWrite();
                                    apfp apfpVar = (apfp) aihhVar2.instance;
                                    if (apfpVar.i == 44) {
                                        apfpVar.i = 0;
                                        apfpVar.k = null;
                                    }
                                    aihhVar.e(aihlVar, (apfp) aihhVar2.build());
                                    ajwoVar = (ajwo) aihhVar.build();
                                }
                            }
                        }
                        arrayList.add(ajwoVar);
                    }
                }
                acqz acqzVar2 = this.t;
                ArrayList arrayList2 = new ArrayList();
                Optional optionalJ2 = acqzVar2.j();
                if (optionalJ2.isEmpty() || !((acra) optionalJ2.get()).l()) {
                    arrayList2 = null;
                } else {
                    Iterator it2 = ((acra) optionalJ2.get()).o.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Optional.ofNullable(((acra) it2.next()).d));
                    }
                }
                if (this.ck.aP() && arrayList != null && !arrayList.isEmpty() && arrayList2 != null && !arrayList2.isEmpty()) {
                    acmdVar = new acmd(arrayList, arrayList2);
                }
                acqq acqqVarE = this.t.e();
                if (this.ck.Q()) {
                    this.bP = acqqVarE.b;
                }
                acmd acmdVar2 = new acmd(acqqVarE.a, this.t.m());
                acme acmeVar = this.ak;
                acol acolVar2 = new acol(acmdVar2, acmdVar, new ijt(acmeVar.b ? agkj.h(acmeVar.a) : new HashMap()), abnlVarA);
                ahfi ahfiVar = this.f;
                ahfiVar.a = acolVar2;
                ahfiVar.b = cbVarD;
                ahfiVar.c = arguments;
                this.bp = acolVar2;
            } else {
                this.e.g();
            }
        }
        super.onStop();
    }

    @Override // defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        if (getView() != null) {
            if (getActivity() != null) {
                Toolbar toolbar = this.cy;
                if (toolbar != null) {
                    ((fx) getActivity()).setSupportActionBar(toolbar);
                }
                fl supportActionBar = ((fx) getActivity()).getSupportActionBar();
                if (supportActionBar != null) {
                    boolean zAn = hmy.an(getArguments());
                    supportActionBar.j(false);
                    supportActionBar.h(!zAn);
                    if (zAn) {
                        supportActionBar.l(R.drawable.action_bar_logo_ringo2);
                    } else {
                        supportActionBar.l(0);
                    }
                    Toolbar toolbar2 = this.cy;
                    if (toolbar2 != null) {
                        toolbar2.s(new hdf(this, 14));
                    }
                }
            }
            AppBarLayout appBarLayout = this.cx;
            if (appBarLayout != null) {
                appBarLayout.setFitsSystemWindows(true);
                this.cx.setBackgroundColor(getContext().getColor(R.color.full_transparent));
                this.cx.setOutlineProvider(new ilz());
            }
            Toolbar toolbar3 = this.cy;
            if (toolbar3 != null) {
                toolbar3.setBackgroundColor(getContext().getColor(R.color.full_transparent));
            }
        }
    }

    @Override // defpackage.acoi, defpackage.acvf
    public final void f() {
    }
}

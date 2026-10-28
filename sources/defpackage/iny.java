package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.search.ui.SearchToolbarView;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iny implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ iny(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v44, types: [bog, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v45, types: [java.lang.Object, twi] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.twi
    public final void a(Object obj) {
        LoadingFrameLayout loadingFrameLayout;
        String displayName;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                ioc iocVar = (ioc) this.a;
                iocVar.k();
                ((agrc) ((agrc) ((agrc) ioc.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/search/ui/SearchInputFragment", "processZeroPrefixCacheFetchResult", (char) 720, "SearchInputFragment.java")).t("Error fetching zero-prefix cached response");
                if (iocVar.F.l(0, 45712947L, false) && (loadingFrameLayout = iocVar.v) != null && iocVar.getActivity() != null) {
                    loadingFrameLayout.f(iocVar.getActivity().getResources().getString(R.string.entity_failed), true, false, false);
                    break;
                }
                break;
            case 1:
                ioc iocVar2 = (ioc) this.a;
                if (!iocVar2.isHidden()) {
                    LoadingFrameLayout loadingFrameLayout2 = iocVar2.v;
                    if (loadingFrameLayout2 != null && iocVar2.getActivity() != null) {
                        loadingFrameLayout2.f(iocVar2.getString(R.string.common_error_network), true, false, false);
                    }
                    SearchToolbarView searchToolbarView = iocVar2.u;
                    if (searchToolbarView != null) {
                        searchToolbarView.d();
                    }
                }
                break;
            case 2:
                alxg alxgVar = (alxg) obj;
                if (alxgVar != null) {
                    ioc iocVar3 = (ioc) this.a;
                    if (jku.c(iocVar3.getActivity())) {
                        iocVar3.j(alxgVar);
                    }
                }
                break;
            case 3:
                Object obj2 = this.a;
                iog iogVar = (iog) obj2;
                if (!iogVar.isHidden()) {
                    jio jioVarE = jin.e();
                    jik jikVar = (jik) jioVarE;
                    jikVar.i(-2);
                    cc ccVar = (cc) obj2;
                    jikVar.k(ccVar.getContext().getText(R.string.slow_network_search_toast_text));
                    jioVarE.l(ccVar.getContext().getText(R.string.slow_network_search_toast_cta), new hdf(obj2, 16));
                    iogVar.I.d(jioVarE.b());
                }
                break;
            case 4:
                xgn xgnVar = ((ipb) this.a).f;
                Boolean bool = (Boolean) obj;
                if (xgnVar != null && bool != null) {
                    aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                    aihf aihfVarCreateBuilder2 = amcx.a.createBuilder();
                    int i = true == bool.booleanValue() ? 2 : 3;
                    aihfVarCreateBuilder2.copyOnWrite();
                    amcx amcxVar = (amcx) aihfVarCreateBuilder2.instance;
                    amcxVar.c = i - 1;
                    amcxVar.b |= 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                    amcx amcxVar2 = (amcx) aihfVarCreateBuilder2.build();
                    amcxVar2.getClass();
                    amddVar.l = amcxVar2;
                    amddVar.b |= 32768;
                    xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(181676)), (amdd) aihfVarCreateBuilder.build());
                    break;
                }
                break;
            case 5:
                List list = (List) obj;
                agrf agrfVar = ipo.a;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((PreferenceGroup) this.a).ah((Preference) it.next());
                    }
                }
                break;
            case 6:
                xsc xscVar = (xsc) obj;
                if (xscVar != null) {
                    ((Preference) this.a).n = new ipn(xscVar, 4);
                }
                break;
            case 7:
                Boolean bool2 = (Boolean) obj;
                if (bool2 != null && bool2.booleanValue()) {
                    z = true;
                }
                Object obj3 = this.a;
                ((TwoStatePreference) obj3).k(z);
                ((Preference) obj3).R(true);
                break;
            case 8:
                Boolean bool3 = (Boolean) obj;
                ((TwoStatePreference) this.a).k(bool3 != null && bool3.booleanValue());
                break;
            case 9:
                ivn ivnVar = (ivn) this.a;
                ivnVar.l = true;
                ivnVar.n = true;
                ivnVar.f.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(71178)), null);
                ivnVar.f();
                break;
            case 10:
                Optional optional = (Optional) obj;
                optional.getClass();
                boolean zIsEmpty = optional.isEmpty();
                Object obj4 = this.a;
                if (zIsEmpty) {
                    ((jcp) obj4).f(false);
                } else {
                    jcp jcpVar = (jcp) obj4;
                    jcpVar.c = (anfv) optional.get();
                    jcpVar.d();
                    jcpVar.e(false);
                    jcpVar.f(true);
                }
                break;
            case 11:
                Optional optional2 = (Optional) obj;
                optional2.getClass();
                boolean zIsEmpty2 = optional2.isEmpty();
                Object obj5 = this.a;
                if (zIsEmpty2) {
                    ((jcp) obj5).f(false);
                } else {
                    jcp jcpVar2 = (jcp) obj5;
                    jcpVar2.c = (anfv) optional2.get();
                    jcpVar2.d();
                    jcpVar2.e(false);
                    jcpVar2.f(true);
                }
                break;
            case 12:
                hth hthVar = (hth) obj;
                if (hthVar != null) {
                    jgd jgdVar = (jgd) this.a;
                    hpd hpdVar = jgdVar.d;
                    jgdVar.g(hpdVar.c(hthVar), hpdVar.n(hthVar));
                }
                break;
            case 13:
                hth hthVar2 = (hth) obj;
                if (hthVar2 != null) {
                    jgy jgyVar = (jgy) this.a;
                    hpd hpdVar2 = jgyVar.d;
                    jgyVar.g(hpdVar2.c(hthVar2), hpdVar2.n(hthVar2), hpd.a(hthVar2.d()));
                }
                break;
            case 14:
                ((jjm) this.a).A = 1;
                break;
            case 15:
                wfy wfyVar = (wfy) obj;
                jjm jjmVar = (jjm) this.a;
                int i2 = jjmVar.A;
                jjmVar.A = 1;
                if (wfyVar != null) {
                    alme almeVar = wfyVar.a.f;
                    if (almeVar == null) {
                        almeVar = alme.a;
                    }
                    aqjx aqjxVar = almeVar.b == 121288100 ? (aqjx) almeVar.c : aqjx.a;
                    jjmVar.l(aqjxVar);
                    jjmVar.s(aqjxVar);
                }
                if (i2 == 3) {
                    jjmVar.n(false);
                }
                break;
            case 16:
                Throwable th = (Throwable) obj;
                boolean z2 = th instanceof toe;
                Object obj6 = this.a;
                if (z2) {
                    ((jjm) obj6).p((toe) th);
                } else if (th != null) {
                    ((jjm) obj6).p(new toe(th));
                }
                break;
            case 17:
                jmg jmgVar = (jmg) this.a;
                ImageView imageView = jmgVar.aj;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                TextView textView = jmgVar.ak;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                break;
            case 18:
                aciz acizVar = (aciz) obj;
                if (acizVar != null) {
                    ?? r11 = this.a;
                    aprb aprbVar = (aprb) acizVar.b;
                    jmg jmgVar2 = (jmg) r11;
                    jmgVar2.av = aprbVar;
                    Iterator it2 = aprbVar.c.iterator();
                    while (true) {
                        ?? r4 = acizVar.a;
                        if (it2.hasNext()) {
                            for (apra apraVar : ((apri) it2.next()).c) {
                                apqz apqzVar = apraVar.b == 64166933 ? (apqz) apraVar.c : apqz.a;
                                if (ahno.ag(apqzVar.d, r4)) {
                                    displayName = apqzVar.c;
                                }
                            }
                        } else {
                            List listH = agfm.b('-').h(r4);
                            displayName = new Locale.Builder().setLanguage((String) listH.get(0)).setRegion(ahno.af((String) listH.get(1))).build().getDisplayName();
                        }
                    }
                    jmgVar2.O(displayName);
                    jmgVar2.l.l(new xgj(xhb.b(95983)));
                    ListenableFuture listenableFutureC = ((qrx) ((lqa) jmgVar2.x.io()).a).c();
                    int i3 = 6;
                    taf.k(r11, ahcs.e(listenableFutureC, new aeiw(i3), MoreExecutors.directExecutor()), new jco(5), new jlz(r11, i3));
                }
                break;
            case 19:
                this.a.a("");
                break;
            default:
                jmg jmgVar3 = (jmg) this.a;
                jmgVar3.L();
                if (!(((Throwable) obj).getCause() instanceof CancellationException)) {
                    jmgVar3.K();
                }
                break;
        }
    }
}

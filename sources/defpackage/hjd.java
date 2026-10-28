package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.slimstatusbar.SlimStatusBar;
import com.google.android.material.tabs.TabLayout;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hjd implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hjd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0187  */
    /* JADX WARN: Code duplicated, block: B:55:0x019b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v61, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        int i = 3;
        int i2 = 4;
        int i3 = 2;
        int i4 = 8;
        boolean z = true;
        int i5 = 0;
        switch (this.$cid) {
            case 0:
                if (((aayw) obj).b.b(abnw.e)) {
                    Object obj2 = ((hhb) this.a).a;
                    hje hjeVar = (hje) obj2;
                    if (!hjeVar.d) {
                        hjeVar.d = true;
                        hjeVar.c.e(((aesp) hjeVar.a.io()).s().L(hjeVar.b).al(new hib(obj2, i2), new glg(20)));
                        hjeVar.a();
                    }
                }
                break;
            case 1:
                hje hjeVar2 = (hje) ((hhb) this.a).a;
                hjeVar2.d = false;
                hjeVar2.c.b();
                hjeVar2.a();
                break;
            case 2:
                String str = (String) obj;
                agrx agrxVar = agso.a;
                hjf hjfVar = (hjf) this.a;
                if (!TextUtils.equals(hjfVar.j, str)) {
                    hjfVar.j = str;
                    hjfVar.a(str, hjfVar.i);
                }
                break;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                agrx agrxVar2 = agso.a;
                hjf hjfVar2 = (hjf) this.a;
                hjfVar2.i = zBooleanValue;
                hjfVar2.a(hjfVar2.j, zBooleanValue);
                break;
            case 4:
                arbl[] arblVarArrA = aaxh.a(((aayt) obj).a());
                hjg hjgVar = (hjg) ((hhc) this.a).a;
                hjgVar.b = arblVarArrA;
                hjgVar.f();
                break;
            case 5:
                Object obj3 = this.a;
                hjg hjgVar2 = (hjg) ((hhc) obj3).a;
                if (hjgVar2.c.isPresent() && hjgVar2.k()) {
                    if (DesugarArrays.stream(hjgVar2.b).map(new bwa(18)).anyMatch(new gnh(obj3, i4))) {
                        ((abvk) hjgVar2.a.io()).J(((Float) hjgVar2.c.get()).floatValue());
                    }
                    hjgVar2.c = Optional.empty();
                }
                hjgVar2.f();
                break;
            case 6:
                hji hjiVar = (hji) ((hhb) this.a).a;
                hjiVar.d = false;
                hjiVar.c.b();
                hjiVar.a();
                break;
            case 7:
                if (((aayw) obj).b.b(abnw.e)) {
                    Object obj4 = ((hhb) this.a).a;
                    hji hjiVar2 = (hji) obj4;
                    if (!hjiVar2.d) {
                        hjiVar2.d = true;
                        hjiVar2.c.e(((jan) hjiVar2.a.io()).d().L(hjiVar2.b).al(new hib(obj4, 5), new hmd(1 == true ? 1 : 0)));
                        hjiVar2.a();
                    }
                }
                break;
            case 8:
                ((hkc) this.a).b(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((hkc) this.a).a();
                break;
            case 10:
                ((hkc) this.a).a();
                break;
            case 11:
                hkl hklVar = (hkl) this.a;
                TabLayout tabLayout = hklVar.g;
                if (tabLayout != null) {
                    tabLayout.setPadding(0, 0, 0, hklVar.t.J());
                    hklVar.l();
                }
                break;
            case 12:
                agev agevVar = (agev) obj;
                boolean zG = agevVar.g();
                Object obj5 = this.a;
                if (!zG) {
                    hkr hkrVar = (hkr) obj5;
                    View view = hkrVar.f;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    TextView textView = hkrVar.g;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                } else {
                    Long unreadCount = ((aoau) agevVar.c()).getUnreadCount();
                    int i6 = unreadCount.longValue() > 0 ? 0 : 8;
                    hkr hkrVar2 = (hkr) obj5;
                    View view2 = hkrVar2.f;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    TextView textView2 = hkrVar2.g;
                    if (textView2 != null) {
                        textView2.setVisibility(i6);
                        hkrVar2.g.setText(unreadCount.longValue() <= 9 ? String.format(Locale.getDefault(), "%d", unreadCount) : String.format(Locale.getDefault(), "%d+", 9));
                    }
                }
                break;
            case 13:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue2 = bool.booleanValue();
                hky hkyVar = (hky) this.a;
                aeog aeogVar = hkyVar.c.a;
                if (aeogVar.h()) {
                    tfq tfqVar = aeogVar.t;
                    rmw rmwVar = aeogVar.m;
                    boolean zH = tfqVar.h();
                    rmv rmvVarC = rmwVar.c();
                    byte[] bArr = null;
                    String str2 = rmvVarC == null ? null : rmvVarC.e;
                    if (zH != aeogVar.k) {
                        if (zH) {
                            aeogVar.e();
                        } else {
                            Optional optional = aeogVar.p;
                            optional.isPresent();
                            if (((Boolean) optional.orElse(Boolean.FALSE)).booleanValue() && (aeogVar.a.X() || aeogVar.b.X())) {
                                z = false;
                            } else {
                                z = false;
                                aeogVar.e();
                            }
                        }
                        aeogVar.k = z;
                    } else if (zBooleanValue2) {
                        if (zH) {
                            if (aeogVar.d.e().m()) {
                                aeogVar.e();
                            } else {
                                aeogVar.e();
                            }
                        }
                    } else if (!zH) {
                        aeoh aeohVar = aeogVar.e;
                        Optional optional2 = aeogVar.p;
                        optional2.isPresent();
                        boolean zBooleanValue3 = ((Boolean) optional2.orElse(Boolean.FALSE)).booleanValue();
                        if (aeohVar.r()) {
                            ViewGroup viewGroupB = aeohVar.b(zBooleanValue3);
                            SlimStatusBar slimStatusBarC = aeohVar.c(zBooleanValue3);
                            if (!aeoh.s(viewGroupB, slimStatusBarC)) {
                                aeohVar.k(false, zBooleanValue3);
                            }
                            aeohVar.d();
                            slimStatusBarC.post(new aead(aeohVar, slimStatusBarC, 16, bArr));
                        }
                    } else if (aeogVar.d.e().m() || str2 != null || aeogVar.g()) {
                        aeogVar.e();
                    }
                }
                if (!bool.booleanValue()) {
                    hkyVar.a();
                } else if (hkyVar.d) {
                    hkyVar.b.a();
                    hkyVar.d = false;
                }
                break;
            case 14:
                ((hnt) this.a).b(((Boolean) obj).booleanValue());
                break;
            case 15:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                Object obj6 = this.a;
                if (!zBooleanValue4) {
                    ((hnt) obj6).e.c(new gsd(Optional.empty(), "PPSDST"));
                }
                hnt hntVar = (hnt) obj6;
                hntVar.b(hntVar.c.g());
                break;
            case 16:
                Object obj7 = this.a;
                how howVar = (how) obj7;
                ListenableFuture listenableFutureB = ((hpy) howVar.e.io()).b((List) Collection.EL.stream((List) obj).map(new hnv(12)).collect(aghu.a));
                taf.j(ahno.as(listenableFutureB, new gqb(obj7, listenableFutureB, 6), howVar.c), new hou(i5));
                break;
            case 17:
                ayq ayqVar = (ayq) obj;
                ((Class) ayqVar.a).getSimpleName();
                Object obj8 = ayqVar.c;
                taq.c();
                ayqVar.b.run();
                break;
            case 18:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                ?? r8 = this.a;
                if (!zBooleanValue5) {
                    hvs hvsVar = (hvs) r8;
                    hvsVar.c(hvs.a);
                    if (hvsVar.e) {
                        hvsVar.e = false;
                        hvsVar.c.unregisterOnSharedPreferenceChangeListener(r8);
                        avmn avmnVar = hvsVar.f;
                        if (avmnVar != null) {
                            awka.f((AtomicReference) avmnVar);
                        }
                    }
                } else {
                    hvs hvsVar2 = (hvs) r8;
                    if (!hvsVar2.e) {
                        hvsVar2.e = true;
                        hvsVar2.b();
                        hvsVar2.c.registerOnSharedPreferenceChangeListener(r8);
                        hvsVar2.f = hvsVar2.d.al(new hva(r8, i3), new hpw(i));
                    }
                }
                break;
            case 19:
                ((hvz) this.a).c();
                break;
            default:
                boolean z2 = !((hww) obj).b(hww.c, hww.d, hww.g, hww.h);
                abfx abfxVar = (abfx) this.a;
                if (abfxVar.h != z2) {
                    abfxVar.h = z2;
                    abfxVar.d(2);
                }
                break;
        }
    }
}

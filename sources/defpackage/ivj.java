package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ivj extends ivb implements ivd, ijm {
    public itu ag;
    public boolean ah;
    public final Map ai = new HashMap();
    final qr aj = new ivh(this);
    public jin ak;
    private String al;

    public static Optional J(Object obj) {
        anzi anziVar;
        if (obj instanceof anzi) {
            anziVar = (anzi) obj;
        } else {
            anziVar = obj instanceof iko ? ((iko) obj).a : null;
        }
        if (anziVar != null) {
            anzh anzhVar = anziVar.q;
            if (anzhVar == null) {
                anzhVar = anzh.a;
            }
            if ((anzhVar.b & 1) != 0) {
                anzh anzhVar2 = anziVar.q;
                if (anzhVar2 == null) {
                    anzhVar2 = anzh.a;
                }
                return Optional.of(anzhVar2.c);
            }
        }
        return Optional.empty();
    }

    private final void N() {
        if (kro.M(this)) {
            return;
        }
        Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            jav javVar = (jav) optionalD.get();
            ((nh) javVar.m).j(0, javVar.u());
        }
    }

    private final boolean O(int i) {
        if (kro.M(this)) {
            return false;
        }
        Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            optionalD = Optional.ofNullable(Integer.valueOf(((jav) optionalD.get()).u()));
        }
        return tym.C(i, ((Integer) optionalD.orElse(0)).intValue());
    }

    @Override // defpackage.ijm
    public final int K(adkz adkzVar, int i) {
        if (this.C instanceof ivd) {
            return L(adkzVar, 0, i);
        }
        return 0;
    }

    @Override // defpackage.ijm
    public final int L(adkz adkzVar, int i, int i2) {
        int iL = 0;
        if (!(adkzVar instanceof adlq)) {
            if (!(adkzVar instanceof admu) || adkzVar.a() <= 0) {
                return 0;
            }
            if ((adkzVar.d(0) instanceof anzi) || (adkzVar.d(0) instanceof iko)) {
                return (i2 - i) + 1;
            }
            return 0;
        }
        adlq adlqVar = (adlq) adkzVar;
        while (i <= i2) {
            adlo adloVarV = adlqVar.v(i);
            if (adloVarV == null) {
                return iL;
            }
            iL += L(adloVarV.a, i - adloVarV.b, adloVarV.f() + (-1) < i2 ? adloVarV.a.a() - 1 : i2 - adloVarV.b);
            i = adloVarV.f();
        }
        return iL;
    }

    @Override // defpackage.ijm
    public final int M() {
        if (kro.M(this)) {
            return -1;
        }
        Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            optionalD = Optional.ofNullable(((jav) optionalD.get()).l);
        }
        if (true == optionalD.isPresent()) {
            optionalD = Optional.ofNullable((LinearLayoutManager) ((RecyclerView) optionalD.get()).n);
        }
        if (true == optionalD.isPresent()) {
            optionalD = Optional.ofNullable(Integer.valueOf(((LinearLayoutManager) optionalD.get()).findFirstVisibleItemPosition()));
        }
        return ((Integer) optionalD.orElse(-1)).intValue();
    }

    @Override // defpackage.ijm
    public final String P(int i) {
        if (!O(i)) {
            return null;
        }
        Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            optionalD = Optional.ofNullable(((jav) optionalD.get()).m);
        }
        ivg ivgVar = new ivg(i, 0);
        if (true == optionalD.isPresent()) {
            optionalD = Optional.ofNullable(((admo) optionalD.get()).getItem(ivgVar.a));
        }
        if (true == optionalD.isPresent()) {
            optionalD = J(optionalD.get());
        }
        return (String) optionalD.orElse(null);
    }

    @Override // defpackage.ivd
    public final void S() {
        MenuItem menuItemFindItem;
        this.ah = true;
        adma admaVar = this.C;
        if (admaVar instanceof ivd) {
            ((ivd) admaVar).S();
        }
        Toolbar toolbar = this.y;
        if (toolbar != null && toolbar.f() != null && (menuItemFindItem = this.y.f().findItem(R.id.done_editing)) != null) {
            menuItemFindItem.setVisible(true);
            View actionView = menuItemFindItem.getActionView();
            if (actionView != null) {
                actionView.setOnClickListener(new gdp(this, menuItemFindItem, 12, null));
            }
        }
        if (this.Q.l(224, 45763723L, false)) {
            this.aj.g(true);
        }
        N();
    }

    @Override // defpackage.ivd
    public final void T() {
        this.ah = false;
        adma admaVar = this.C;
        if (admaVar instanceof ivd) {
            ((ivd) admaVar).T();
        }
        Toolbar toolbar = this.y;
        if (toolbar != null && toolbar.f() != null) {
            this.y.f().clear();
            this.y.l(R.menu.entity_browse_page_menu);
            MenuItem menuItemFindItem = this.y.f().findItem(R.id.done_editing);
            if (menuItemFindItem != null) {
                menuItemFindItem.setVisible(false);
            }
        }
        if (this.Q.l(224, 45763723L, false)) {
            this.aj.g(false);
        }
        N();
    }

    @Override // defpackage.ivd
    public final void c(hck hckVar) {
        if (getActivity() == null || !isAdded()) {
            return;
        }
        agke agkeVar = hckVar.a;
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            this.k.c((ajwo) agkeVar.get(i), null);
        }
        adma admaVar = this.C;
        if (admaVar instanceof ivd) {
            ((ivd) admaVar).c(hckVar);
        }
        this.ai.clear();
    }

    @Override // defpackage.ivd
    public final boolean f() {
        boolean zIsEmpty = this.ai.isEmpty();
        boolean z = !zIsEmpty;
        adma admaVar = this.C;
        if (admaVar instanceof ivd) {
            return ((ivd) admaVar).f() || !zIsEmpty;
        }
        return z;
    }

    @Override // defpackage.ivd
    public final void g(aihf aihfVar) {
        Optional optionalOf;
        if (TextUtils.isEmpty(this.al)) {
            return;
        }
        String str = this.al;
        aihfVar.copyOnWrite();
        apzb apzbVar = (apzb) aihfVar.instance;
        apzb apzbVar2 = apzb.a;
        str.getClass();
        apzbVar.c |= 1;
        apzbVar.d = str;
        adma admaVar = this.C;
        if (admaVar instanceof ivd) {
            ((ivd) admaVar).g(aihfVar);
        }
        Map map = this.ai;
        if (map.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList, new awv(18));
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            if (O(iIntValue)) {
                Optional optionalD = d();
                if (true == optionalD.isPresent()) {
                    optionalD = Optional.ofNullable(((jav) optionalD.get()).m);
                }
                admo admoVar = (admo) optionalD.orElse(null);
                if (admoVar == null) {
                    optionalOf = Optional.empty();
                } else {
                    Optional optionalJ = J(admoVar.getItem(iIntValue));
                    ive iveVar = new ive(admoVar, iIntValue, i);
                    if (true != optionalJ.isPresent()) {
                        optionalOf = optionalJ;
                    } else {
                        Object obj = optionalJ.get();
                        admo admoVar2 = iveVar.a;
                        int i3 = iveVar.b;
                        aihf aihfVarCreateBuilder = apyy.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        apyy apyyVar = (apyy) aihfVarCreateBuilder.instance;
                        apyyVar.c = 1;
                        apyyVar.b |= 1;
                        aihfVarCreateBuilder.copyOnWrite();
                        apyy apyyVar2 = (apyy) aihfVarCreateBuilder.instance;
                        apyyVar2.b |= 2;
                        apyyVar2.d = (String) obj;
                        Optional optionalJ2 = J(admoVar2.getItem(i3 + 1));
                        imc imcVar = new imc(aihfVarCreateBuilder, 9);
                        if (true == optionalJ2.isPresent()) {
                            Object obj2 = optionalJ2.get();
                            aihf aihfVar2 = (aihf) imcVar.a;
                            aihfVar2.copyOnWrite();
                            apyy apyyVar3 = (apyy) aihfVar2.instance;
                            apyyVar3.b |= 4;
                            apyyVar3.e = (String) obj2;
                        }
                        optionalOf = Optional.of((apyy) aihfVarCreateBuilder.build());
                    }
                }
            } else {
                optionalOf = Optional.empty();
            }
            imc imcVar2 = new imc(aihfVar, 10);
            if (true == optionalOf.isPresent()) {
                Object obj3 = optionalOf.get();
                Object obj4 = imcVar2.a;
                aihf aihfVarCreateBuilder2 = apyx.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                apyx apyxVar = (apyx) aihfVarCreateBuilder2.instance;
                apyxVar.c = obj3;
                apyxVar.b = 3;
                ((aihf) obj4).cm(aihfVarCreateBuilder2);
            }
        }
    }

    @tcc
    public void handleDeletePlaylistEvent(gsd gsdVar) {
        if (kro.M(this)) {
            return;
        }
        Optional optional = (Optional) gsdVar.e;
        if ((optional.isPresent() && optional.get() == this.D) || gsdVar.a.equals(this.al)) {
            View view = this.t;
            if (view != null) {
                tuk.i(view.findFocus());
            }
            this.j.g(this);
        }
    }

    @tcc
    public void handleSideloadedTrackRemovedFromPlaylistEvent(isp ispVar) {
        if (TextUtils.equals(this.al, ispVar.a)) {
            adma admaVar = this.C;
            if (admaVar instanceof ivd) {
                ((ivd) admaVar).c(ispVar.c);
            }
        }
        Map map = this.ai;
        Integer num = (Integer) map.remove(ispVar.b);
        if (num != null) {
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((Integer) entry.getValue()).intValue();
                if (iIntValue > num.intValue()) {
                    entry.setValue(Integer.valueOf(iIntValue - 1));
                }
            }
        }
    }

    @tcc
    public void handleVideoAddedToPlaylistEvent(wss wssVar) {
        if (TextUtils.equals(this.al, wssVar.a)) {
            hF((heh) this.H);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ijm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [adlz, java.lang.Object] */
    @Override // defpackage.gms
    protected final void n(List list) {
        super.n(list);
        gob gobVar = new gob(this, 9);
        Optional optionalD = d();
        hqc hqcVar = new hqc(this, gobVar, 11);
        if (true == optionalD.isPresent()) {
            Object obj = optionalD.get();
            ?? r3 = hqcVar.a;
            jav javVar = (jav) obj;
            javVar.L(hqcVar.b);
            Object obj2 = javVar.m;
            admo admoVar = (admo) obj2;
            nh nhVar = (nh) obj2;
            nhVar.x(new ijh(r3, admoVar, (RecyclerView) javVar.l, ((ivj) r3).ai, null));
        }
    }

    @Override // defpackage.gms, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            this.ah = bundle.getBoolean("playlist_in_edit_mode");
        }
        this.d.f(this);
    }

    @Override // defpackage.gms, defpackage.cc
    public final void onDestroy() {
        this.d.l(this);
        super.onDestroy();
    }

    @Override // defpackage.gms, defpackage.cc
    public final void onDestroyView() {
        this.aj.f();
        super.onDestroyView();
    }

    @Override // defpackage.cc
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.done_editing) {
            return false;
        }
        aihf aihfVarCreateBuilder = apzb.a.createBuilder();
        g(aihfVarCreateBuilder);
        apzb apzbVar = (apzb) aihfVarCreateBuilder.build();
        if (!apzbVar.e.isEmpty()) {
            this.ag.c(apzbVar.d, apzbVar.e, new ivi(this, 0));
        }
        T();
        return true;
    }

    @Override // defpackage.gms, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        bundle.putBoolean("playlist_in_edit_mode", this.ah);
    }

    @Override // defpackage.gms, defpackage.cc
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        qv onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        bog viewLifecycleOwner = getViewLifecycleOwner();
        qr qrVar = this.aj;
        onBackPressedDispatcher.c(viewLifecycleOwner, qrVar);
        if (this.Q.l(224, 45763723L, false)) {
            qrVar.g(this.ah);
        }
    }

    @Override // defpackage.gms
    protected final void q(Object obj, Map map) {
        super.q(obj, map);
        if (obj instanceof annx) {
            this.al = ((annx) obj).f;
        }
        if (this.ah) {
            S();
        }
    }
}

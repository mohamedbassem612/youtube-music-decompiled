package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ijl extends iiz implements ijo, ijm, ijn {
    public static final agrf ar = agrf.h("com/google/android/apps/youtube/music/playlist/PlaylistDetailPageFragment");
    public String aC;
    public jin aF;
    public hcb aG;
    public vxz aH;
    public grj aI;
    public xow aJ;
    public qa aK;
    public wsl as;
    public hpb at;
    public huf au;
    public hpy av;
    public Executor aw;
    public Executor ax;
    public Executor ay;
    public awku az;
    public final AtomicBoolean aA = new AtomicBoolean(false);
    public final Map aB = new HashMap();
    boolean aD = false;
    private Optional aL = Optional.empty();
    final qr aE = new ijk(this);

    public static Optional N(Object obj) {
        if (obj instanceof annx) {
            apji apjiVar = ((annx) obj).d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(annz.a);
            apjiVar.c(aihlVarCheckIsLite);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
            anny annyVar = (anny) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            if ((annyVar.b & 524288) != 0) {
                return Optional.of(annyVar.q);
            }
        }
        return Optional.empty();
    }

    public static Optional O(Object obj) {
        anzi anziVar;
        if (obj instanceof anzi) {
            anziVar = (anzi) obj;
        } else {
            if (!(obj instanceof iko)) {
                return Optional.empty();
            }
            anziVar = ((iko) obj).a;
        }
        anzh anzhVar = anziVar.q;
        if (anzhVar == null) {
            anzhVar = anzh.a;
        }
        if ((anzhVar.b & 1) == 0) {
            return Optional.empty();
        }
        anzh anzhVar2 = anziVar.q;
        if (anzhVar2 == null) {
            anzhVar2 = anzh.a;
        }
        return Optional.of(anzhVar2.c);
    }

    private final void Z(boolean z) {
        if (TextUtils.isEmpty(this.aC)) {
            return;
        }
        ajlt ajltVarE = ajlu.e(kro.au(this.aC));
        ajltVarE.am(Boolean.valueOf(z));
        hcb hcbVar = this.aG;
        hcbVar.c();
        hcbVar.e(ajltVarE.an());
    }

    private final void aa() {
        if (kro.M(this)) {
            return;
        }
        Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            jav javVar = (jav) optionalD.get();
            ((nh) javVar.m).j(0, javVar.u());
        }
    }

    private final boolean ab(int i) {
        if (kro.M(this)) {
            return false;
        }
        Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            optionalD = Optional.ofNullable(Integer.valueOf(((jav) optionalD.get()).u()));
        }
        return tym.C(i, ((Integer) optionalD.orElse(0)).intValue());
    }

    @Override // defpackage.gms
    public final boolean B() {
        return this.aH.l(R.styleable.AppCompatTheme_windowMinWidthMajor, 45630054L, false);
    }

    @Override // defpackage.ijm
    public final int K(adkz adkzVar, int i) {
        if (this.C instanceof ijo) {
            return hna.p(adkzVar, 0, i);
        }
        return 0;
    }

    @Override // defpackage.ijm
    public final int L(adkz adkzVar, int i, int i2) {
        return hna.p(adkzVar, 0, i2);
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
        if (!ab(i)) {
            return null;
        }
        Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            optionalD = Optional.ofNullable(((jav) optionalD.get()).m);
        }
        ivg ivgVar = new ivg(i, 1);
        if (true == optionalD.isPresent()) {
            optionalD = Optional.ofNullable(((admo) optionalD.get()).getItem(ivgVar.a));
        }
        if (true == optionalD.isPresent()) {
            optionalD = O(optionalD.get());
        }
        return (String) optionalD.orElse(null);
    }

    @Override // defpackage.ijo
    public final void Q(String str) {
        adma admaVar = this.C;
        if (admaVar instanceof ijo) {
            ((ijo) admaVar).Q(str);
        }
    }

    @Override // defpackage.ijn
    public final void R() {
        adma admaVar = this.C;
        if (admaVar instanceof ijn) {
            this.aD = false;
            ((ijn) admaVar).R();
        }
    }

    @Override // defpackage.ijo
    public final void S() {
        MenuItem menuItemFindItem;
        View actionView;
        Object obj;
        anzi anziVarP;
        AtomicBoolean atomicBoolean = this.aA;
        atomicBoolean.set(true);
        adma admaVar = this.C;
        if (admaVar instanceof ijo) {
            ((ijo) admaVar).S();
        }
        Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            agke agkeVarJ = ((jav) optionalD.get()).J();
            int size = agkeVarJ.size();
            for (int i = 0; i < size; i++) {
                advc advcVar = (advc) agkeVarJ.get(i);
                if (advcVar instanceof ikn) {
                    ikn iknVar = (ikn) advcVar;
                    iknVar.h = true;
                    if (iknVar.k.l(237, 45791851L, false)) {
                        admu admuVar = iknVar.b;
                        if (!admuVar.isEmpty() && (anziVarP = ikn.p((obj = admuVar.get(0)))) != null && (anziVarP.b & 1) == 0) {
                            iknVar.g = obj;
                            admuVar.remove(0);
                            iknVar.a.remove(0);
                        }
                    }
                }
            }
        }
        Toolbar toolbar = this.y;
        if (toolbar != null && toolbar.f() != null && (menuItemFindItem = this.y.f().findItem(com.google.android.apps.youtube.music.R.id.done_editing)) != null && menuItemFindItem.isVisible() && (actionView = menuItemFindItem.getActionView()) != null) {
            actionView.setClickable(true);
            actionView.setOnClickListener(new gdp(this, menuItemFindItem, 10, null));
        }
        if (this.C instanceof ijn) {
            Optional optionalOr = this.aL.or(new gpa(this, 7));
            if (optionalOr.isPresent() && !this.aD) {
                taf.k(this, this.aJ.c("", "", (String) optionalOr.get(), this.ax, null, null), new igt(2), new glm(this, 18));
            }
        }
        aa();
        this.aE.g(true);
        Z(atomicBoolean.get());
    }

    @Override // defpackage.ijo
    public final void T() {
        anzi anziVarP;
        AtomicBoolean atomicBoolean = this.aA;
        atomicBoolean.set(false);
        adma admaVar = this.C;
        if (admaVar instanceof ijo) {
            ((ijo) admaVar).T();
        }
        Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            agke agkeVarJ = ((jav) optionalD.get()).J();
            int size = agkeVarJ.size();
            for (int i = 0; i < size; i++) {
                advc advcVar = (advc) agkeVarJ.get(i);
                if (advcVar instanceof ikn) {
                    ikn iknVar = (ikn) advcVar;
                    iknVar.h = false;
                    if (iknVar.k.l(237, 45791851L, false) && iknVar.g != null) {
                        admu admuVar = iknVar.b;
                        if (admuVar.isEmpty() || (anziVarP = ikn.p(admuVar.get(0))) == null || (anziVarP.b & 1) != 0) {
                            admuVar.add(0, iknVar.g);
                            iknVar.a.add(0, iknVar.g);
                        }
                        iknVar.g = null;
                    }
                }
            }
        }
        Toolbar toolbar = this.y;
        if (toolbar != null && toolbar.f() != null) {
            this.y.f().clear();
            this.al.b(this.y.f());
            if (this.y.f().size() == 0) {
                this.y.l(com.google.android.apps.youtube.music.R.menu.entity_browse_page_menu);
            }
        }
        aa();
        this.aE.g(false);
        Z(atomicBoolean.get());
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // defpackage.ijo
    public final void U(wsi wsiVar) {
        if (TextUtils.isEmpty(this.aC)) {
            return;
        }
        wsiVar.a = this.aC;
        hej hejVar = this.H;
        int i = 1;
        if (hejVar != null) {
            ajwo ajwoVar = ((heh) hejVar).f;
            if ((ajwoVar.b & 1) != 0) {
                wsiVar.n(ajwoVar.c);
            } else {
                wsiVar.m();
            }
        } else {
            wsiVar.m();
        }
        adma admaVar = this.C;
        if (admaVar instanceof ijo) {
            ((ijo) admaVar).U(wsiVar);
        }
        Map map = this.aB;
        if (map.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList, new awv(17));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            aote aoteVar = null;
            if (ab(iIntValue)) {
                Optional optionalD = d();
                if (true == optionalD.isPresent()) {
                    optionalD = Optional.ofNullable(((jav) optionalD.get()).m);
                }
                admo admoVar = (admo) optionalD.orElse(null);
                if (admoVar != null) {
                    Optional optionalO = O(admoVar.getItem(iIntValue));
                    ive iveVar = new ive(admoVar, iIntValue, i);
                    if (true == optionalO.isPresent()) {
                        Object obj = optionalO.get();
                        admo admoVar2 = iveVar.a;
                        int i3 = iveVar.b;
                        aihf aihfVarCreateBuilder = aote.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        aote aoteVar2 = (aote) aihfVarCreateBuilder.instance;
                        aoteVar2.b |= 32;
                        aoteVar2.f = (String) obj;
                        aotd aotdVar = aotd.ACTION_MOVE_VIDEO_BEFORE;
                        aihfVarCreateBuilder.copyOnWrite();
                        aote aoteVar3 = (aote) aihfVarCreateBuilder.instance;
                        aoteVar3.d = aotdVar.an;
                        aoteVar3.b |= 1;
                        Object item = admoVar2.getItem(i3 + 1);
                        if (item != null) {
                            Optional optionalO2 = O(item);
                            hun hunVar = new hun(aihfVarCreateBuilder, 19);
                            if (true == optionalO2.isPresent()) {
                                Object obj2 = optionalO2.get();
                                aihf aihfVar = (aihf) hunVar.a;
                                aihfVar.copyOnWrite();
                                aote aoteVar4 = (aote) aihfVar.instance;
                                aoteVar4.b |= SemanticState.LiveRegion;
                                aoteVar4.h = (String) obj2;
                            }
                        }
                        optionalO = Optional.ofNullable((aote) aihfVarCreateBuilder.build());
                    }
                    aoteVar = (aote) optionalO.orElse(null);
                }
            }
            if (aoteVar != null) {
                wsiVar.e(agke.q(aoteVar));
            }
        }
    }

    @Override // defpackage.ijp
    public final void V(alvy alvyVar) {
        if (getActivity() == null || !isAdded()) {
            return;
        }
        String str = this.aC;
        if (str != null) {
            taf.i(this.at.o(this.av, str), this.aw, new ihw(3), new itt(this, str, 1), null);
        }
        jin jinVar = this.aF;
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(getText(com.google.android.apps.youtube.music.R.string.edit_playlist_done));
        jinVar.d(jioVarE.b());
        adma admaVar = this.C;
        if (admaVar instanceof ijp) {
            ((ijp) admaVar).V(alvyVar);
        }
        if (alvyVar != null) {
            this.k.d(alvyVar.g, null);
        }
        this.aB.clear();
        if (this.aD) {
            R();
        }
        alvz alvzVar = alvyVar.e;
        if (alvzVar == null) {
            alvzVar = alvz.a;
        }
        this.aL = N(alvzVar.b == 173690432 ? (annx) alvzVar.c : annx.a);
    }

    @Override // defpackage.ijp
    public final void W(alvy alvyVar, aotd aotdVar) {
        V(alvyVar);
    }

    @Override // defpackage.ijn
    public final void X(alxg alxgVar) {
        if (alxgVar != null) {
            this.g.d(new xgj(alxgVar.e, (amud) null));
            adma admaVar = this.C;
            if (admaVar instanceof ijn) {
                this.aD = true;
                ((ijn) admaVar).X(alxgVar);
            }
        }
    }

    @Override // defpackage.ijo
    public final boolean Y() {
        boolean zIsEmpty = this.aB.isEmpty();
        boolean z = !zIsEmpty;
        adma admaVar = this.C;
        if (admaVar instanceof ijo) {
            return ((ijo) admaVar).Y() || !zIsEmpty;
        }
        return z;
    }

    @tcc
    public void handleDeletePlaylistEvent(gsd gsdVar) {
        if (kro.M(this)) {
            return;
        }
        Optional optional = (Optional) gsdVar.e;
        if (optional.isPresent() && optional.get() == this.D) {
            View view = this.t;
            if (view != null) {
                tuk.i(view.findFocus());
            }
            this.j.g(this);
            return;
        }
        if (gsdVar.a.equals(this.aC)) {
            View view2 = this.t;
            if (view2 != null) {
                tuk.i(view2.findFocus());
            }
            this.j.g(this);
        }
    }

    @tcc
    public void handleReloadPlaylistEvent(wsp wspVar) {
        aotd aotdVar = wspVar.c;
        if (aotdVar == aotd.ACTION_JOIN_COLLABORATION) {
            r();
        }
        if (TextUtils.equals(this.aC, wspVar.a)) {
            adma admaVar = this.C;
            if (admaVar instanceof ijp) {
                ((ijp) admaVar).W(wspVar.b, aotdVar);
                if (aotdVar == aotd.ACTION_SET_CUSTOM_THUMBNAIL || aotdVar == aotd.ACTION_COPY_FROM_PLAYLIST) {
                    r();
                }
            }
            alvy alvyVar = wspVar.b;
            if (alvyVar == null || (alvyVar.b & 32) == 0) {
                return;
            }
            alwd alwdVar = alvyVar.f;
            if (alwdVar == null) {
                alwdVar = alwd.a;
            }
            if (alwdVar.b == 175617300) {
                this.aB.clear();
                this.az.kk(Boolean.FALSE);
            }
        }
    }

    @tcc
    public void handleVideoAddedToPlaylistEvent(wss wssVar) {
        if (!TextUtils.equals(this.aC, wssVar.a) || wssVar.a()) {
            return;
        }
        hF((heh) this.H);
    }

    @tcc
    public void handleVideoRemovedFromPlaylistEvent(wsv wsvVar) {
        if (TextUtils.equals(this.aC, wsvVar.a)) {
            adma admaVar = this.C;
            if (admaVar instanceof ijp) {
                ((ijp) admaVar).V(wsvVar.c);
            }
        }
        Map map = this.aB;
        Integer num = (Integer) map.remove(wsvVar.b);
        if (num != null) {
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((Integer) entry.getValue()).intValue();
                if (iIntValue > num.intValue()) {
                    entry.setValue(Integer.valueOf(iIntValue - 1));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ijm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [adlz, java.lang.Object] */
    @Override // defpackage.gms
    protected final void n(List list) {
        super.n(list);
        final boolean z = this.C instanceof ijo;
        final AtomicBoolean atomicBoolean = this.aA;
        adlz adlzVar = new adlz() { // from class: iji
            @Override // defpackage.adlz
            public final void a(adly adlyVar, adkz adkzVar, int i) {
                anzi anziVar;
                agrf agrfVar = ijl.ar;
                Object objD = adkzVar.d(i);
                boolean z2 = objD instanceof anzi;
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                boolean z3 = true;
                if (z2) {
                    anziVar = (anzi) objD;
                } else {
                    if (!(objD instanceof iko)) {
                        if (objD instanceof anwz) {
                            adlyVar.f("hideSideAlignedItemRenderer", Boolean.valueOf(!atomicBoolean2.get()));
                            return;
                        }
                        return;
                    }
                    anziVar = ((iko) objD).a;
                }
                if ((anziVar.b & 2097152) == 0 || !anziVar.z) {
                    return;
                }
                int iP = z ? hna.p(adkzVar, 0, i) : 0;
                if (!atomicBoolean2.get() || (iP <= 1 && hna.p(adkzVar, 0, adkzVar.a() - 1) <= 1)) {
                    z3 = false;
                }
                adlyVar.f("isDraggable", Boolean.valueOf(z3));
            }
        };
        Optional optionalD = d();
        hqc hqcVar = new hqc(this, adlzVar, 9);
        if (true == optionalD.isPresent()) {
            Object obj = optionalD.get();
            ?? r3 = hqcVar.a;
            jav javVar = (jav) obj;
            javVar.L(hqcVar.b);
            Object obj2 = javVar.m;
            View view = javVar.l;
            ijl ijlVar = (ijl) r3;
            RecyclerView recyclerView = (RecyclerView) view;
            admo admoVar = (admo) obj2;
            ijh ijhVar = new ijh(r3, admoVar, recyclerView, ijlVar.aB, ijlVar.az);
            ijlVar.aK = ijhVar;
            ((nh) obj2).x(ijhVar);
        }
    }

    @Override // defpackage.gox, defpackage.gms, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            this.aA.set(bundle.getBoolean("playlist_in_edit_mode"));
        }
        this.az.kk(Boolean.FALSE);
    }

    @Override // defpackage.gox, defpackage.gms, defpackage.cc
    public final void onDestroy() {
        this.aI.b();
        super.onDestroy();
    }

    @Override // defpackage.gox, defpackage.gms, defpackage.cc
    public final void onDestroyView() {
        qa qaVar = this.aK;
        if (qaVar != null) {
            Optional optionalD = d();
            hun hunVar = new hun(qaVar, 20);
            if (true == optionalD.isPresent()) {
                ((nh) ((jav) optionalD.get()).m).y((qa) hunVar.a);
            }
            this.aK = null;
        }
        Toolbar toolbar = this.y;
        if (toolbar != null && toolbar.f() != null) {
            this.y.f().clear();
        }
        this.aD = false;
        if (!TextUtils.isEmpty(this.aC)) {
            hcb hcbVar = this.aG;
            String strAu = kro.au(this.aC);
            wer werVarE = hcbVar.c().e();
            werVarE.j(strAu);
            werVarE.b().D();
        }
        super.onDestroyView();
    }

    @Override // defpackage.cc
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = 0;
        if (menuItem.getItemId() != com.google.android.apps.youtube.music.R.id.done_editing) {
            return false;
        }
        wsi wsiVarA = this.as.a();
        U(wsiVarA);
        if (!wsiVarA.b.isEmpty()) {
            taf.i(this.as.b(wsiVarA, this.aw), this.ay, new ijj(this, i), new hvn(this, 8), null);
        }
        T();
        return true;
    }

    @Override // defpackage.cc
    public final void onPause() {
        super.onPause();
        this.aE.f();
    }

    @Override // defpackage.gox, defpackage.gms, defpackage.cc
    public final void onResume() {
        super.onResume();
        this.i.a(getContext().getColor(com.google.android.apps.youtube.music.R.color.black_header_color));
        qv onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        bog viewLifecycleOwner = getViewLifecycleOwner();
        qr qrVar = this.aE;
        onBackPressedDispatcher.c(viewLifecycleOwner, qrVar);
        qrVar.g(this.aA.get());
    }

    @Override // defpackage.gms, defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        super.m668x22bc4f96(bundle);
        bundle.putBoolean("playlist_in_edit_mode", this.aA.get());
    }

    @Override // defpackage.gox, defpackage.gms
    protected final void q(Object obj, Map map) {
        super.q(obj, map);
        if (obj instanceof annx) {
            this.aC = ((annx) obj).f;
        }
        if (obj instanceof anob) {
            anob anobVar = (anob) obj;
            if ((anobVar.b & 16) != 0) {
                anoa anoaVar = anobVar.f;
                if (anoaVar == null) {
                    anoaVar = anoa.a;
                }
                this.aC = anoaVar.b;
            }
        }
        if (this.aA.get()) {
            S();
        }
    }
}

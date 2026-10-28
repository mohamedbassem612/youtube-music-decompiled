package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdh extends admr implements ijo, ijn, ivd, aeum, gdy, jiw {
    private final advb a;
    private final Context b;
    private adma c;
    private adma d;
    private adma e;
    private final iwe f;
    private final inn g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final Toolbar m;
    private MenuItem n;
    private adly o = new adly();
    private boolean p;
    private anny q;
    private boolean s;
    private final jin t;
    private final vxz u;
    private aihf v;
    private aihf w;
    private final hef x;

    public jdh(Context context, inn innVar, iwe iweVar, vxz vxzVar, hef hefVar, advb advbVar, jin jinVar, adxj adxjVar, View view) {
        this.b = context;
        this.g = innVar;
        this.a = advbVar;
        this.f = iweVar;
        this.x = hefVar;
        this.u = vxzVar;
        this.t = jinVar;
        this.h = view;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.detail_page_collapsing_toolbar);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.detail_page_toolbar);
        this.m = toolbar;
        if (view.findViewById(R.id.detail_header_container) == null) {
            if (toolbar.f() != null && toolbar.f().size() == 0) {
                toolbar.l(R.menu.entity_browse_page_menu);
            }
            LayoutInflater.from(context).inflate(R.layout.editable_playlist_header, (ViewGroup) collapsingToolbarLayout, true);
            ((TextView) view.findViewById(R.id.collaborate_title)).setCompoundDrawablesRelativeWithIntrinsicBounds(adxjVar.d(context, arqz.jN), (Drawable) null, (Drawable) null, (Drawable) null);
            ((ImageView) view.findViewById(R.id.collaborate_arrow)).setImageResource(adxjVar.b(arqz.fU));
            collapsingToolbarLayout.bringChildToFront(toolbar);
        }
        this.i = view.findViewById(R.id.header_info_container);
        this.j = view.findViewById(R.id.detail_header_container);
        this.k = view.findViewById(R.id.music_element_header_container);
        View viewFindViewById = view.findViewById(R.id.edit_header_container);
        this.l = viewFindViewById;
        viewFindViewById.setBackgroundColor(context.getColor(R.color.black_header_color));
        viewFindViewById.setOnClickListener(new iks(4));
        if (toolbar.f() != null) {
            this.n = toolbar.f().findItem(R.id.action_search);
        }
    }

    private static Optional h(annx annxVar) {
        apji apjiVar = annxVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anoc.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            return Optional.empty();
        }
        apji apjiVar2 = annxVar.c;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anoc.a);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        return Optional.of((anob) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
    }

    private static Optional j(annx annxVar) {
        apji apjiVar = annxVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(annf.b);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            return Optional.empty();
        }
        apji apjiVar2 = annxVar.c;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(annf.b);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        return Optional.of((anne) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
    }

    private static Optional k(annx annxVar) {
        apji apjiVar = annxVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(annz.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            return Optional.empty();
        }
        apji apjiVar2 = annxVar.d;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(annz.a);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        return Optional.of((anny) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
    }

    private final void l(int i, boolean z) {
        this.m.f().findItem(i).setVisible(z);
    }

    private final void n(annx annxVar, boolean z) {
        if (annxVar != null) {
            Optional optionalJ = j(annxVar);
            if (this.c != null && optionalJ.isPresent()) {
                this.v = ((aihn) optionalJ.get()).toBuilder();
                this.c.hU(this.o, optionalJ.get());
            }
            Optional optionalH = h(annxVar);
            if (this.d != null && optionalH.isPresent()) {
                this.w = ((aihn) optionalH.get()).toBuilder();
                this.d.b(((jce) this.a).a);
                this.d.hU(this.o, optionalH.get());
            }
            if (z || !this.p) {
                Optional optionalK = k(annxVar);
                if (this.e == null || !optionalK.isPresent()) {
                    return;
                }
                this.q = (anny) optionalK.get();
                this.e.hU(this.o, optionalK.get());
            }
        }
    }

    private static final int o(anny annyVar) {
        apji apjiVar = annyVar.i;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akog.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        for (akny aknyVar : ((akob) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c) {
            akoa akoaVar = aknyVar.c;
            if (akoaVar == null) {
                akoaVar = akoa.a;
            }
            if (akoaVar.g) {
                akoa akoaVar2 = aknyVar.c;
                if (akoaVar2 == null) {
                    akoaVar2 = akoa.a;
                }
                return iju.a(akoaVar2);
            }
        }
        return 1;
    }

    private static final int p(anny annyVar) {
        akoc akocVar = annyVar.h;
        if (akocVar == null) {
            akocVar = akoc.a;
        }
        akob akobVar = akocVar.b;
        if (akobVar == null) {
            akobVar = akob.a;
        }
        for (akny aknyVar : akobVar.c) {
            akoa akoaVar = aknyVar.c;
            if (akoaVar == null) {
                akoaVar = akoa.a;
            }
            if (akoaVar.g) {
                akoa akoaVar2 = aknyVar.c;
                if (akoaVar2 == null) {
                    akoaVar2 = akoa.a;
                }
                return ikq.f(akoaVar2);
            }
        }
        return 1;
    }

    @Override // defpackage.ijo
    public final void Q(String str) {
        int length;
        adma admaVar = this.e;
        if (admaVar instanceof jem) {
            jem jemVar = (jem) admaVar;
            String strValueOf = String.valueOf(str);
            EditText editText = jemVar.g;
            boolean zHasFocus = editText.hasFocus();
            String strConcat = strValueOf.concat(" ");
            if (zHasFocus) {
                String strJ = jem.j(strConcat, editText);
                int selectionStart = editText.getSelectionStart();
                editText.getText().insert(selectionStart, strJ);
                editText.setSelection(selectionStart + strJ.length());
                jemVar.f();
                return;
            }
            EditText editText2 = jemVar.h;
            if (editText2.hasFocus()) {
                strConcat = jem.j(strConcat, editText2);
                length = editText2.getSelectionStart();
            } else {
                if (editText2.getText().length() > 0 && editText2.getText().charAt(editText2.getText().length() - 1) != ' ') {
                    strConcat = " ".concat(strConcat);
                }
                length = editText2.length();
            }
            editText2.getText().insert(length, strConcat);
            editText2.setSelection(length + strConcat.length());
            jemVar.f();
        }
    }

    @Override // defpackage.ijn
    public final void R() {
        adma admaVar = this.e;
        if (admaVar instanceof ijn) {
            ((ijn) admaVar).R();
        }
    }

    @Override // defpackage.ijo
    public final void S() {
        this.p = true;
        adma admaVar = this.e;
        if (admaVar instanceof jem) {
            ((jem) admaVar).g(true);
        }
        this.f.a(this.b.getColor(R.color.black_header_color));
        tuk.l(this.l, true);
        tuk.l(this.k, false);
        tuk.l(this.j, false);
        adma admaVar2 = this.c;
        if (admaVar2 instanceof jde) {
            ((jde) admaVar2).g();
        }
        adma admaVar3 = this.d;
        if (admaVar3 instanceof jdj) {
            ((jdj) admaVar3).g();
        }
        Toolbar toolbar = this.m;
        toolbar.f().clear();
        toolbar.l(R.menu.entity_browse_page_menu);
        l(R.id.action_search, false);
        l(R.id.done_editing, true);
    }

    @Override // defpackage.ijo
    public final void T() {
        this.p = false;
        adma admaVar = this.e;
        if (admaVar instanceof jem) {
            ((jem) admaVar).g(false);
        }
        View view = this.l;
        tuk.i(view.findFocus());
        tuk.l(view, false);
        if (this.c != null) {
            tuk.l(this.j, true);
        }
        if (this.d != null) {
            tuk.l(this.k, true);
        }
        adma admaVar2 = this.c;
        if (admaVar2 instanceof jde) {
            ((jde) admaVar2).h();
        }
        adma admaVar3 = this.d;
        if (admaVar3 instanceof jdj) {
            ((jdj) admaVar3).h();
        }
    }

    @Override // defpackage.ijo
    public final void U(wsi wsiVar) {
        int iK;
        int iL;
        adma admaVar = this.e;
        if (admaVar instanceof jem) {
            jem jemVar = (jem) admaVar;
            String strE = jemVar.e();
            alay alayVar = this.q.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            boolean zContentEquals = strE.contentEquals(ackj.k(null, alayVar, null, false));
            this.s = !zContentEquals;
            if (!zContentEquals) {
                aihf aihfVarCreateBuilder = aote.a.createBuilder();
                aotd aotdVar = aotd.ACTION_SET_PLAYLIST_NAME;
                aihfVarCreateBuilder.copyOnWrite();
                aote aoteVar = (aote) aihfVarCreateBuilder.instance;
                aoteVar.d = aotdVar.an;
                aoteVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                aote aoteVar2 = (aote) aihfVarCreateBuilder.instance;
                strE.getClass();
                aoteVar2.b |= SemanticState.Modal;
                aoteVar2.i = strE;
                wsiVar.b.add((aote) aihfVarCreateBuilder.build());
            }
            String strD = jemVar.d();
            alay alayVar2 = this.q.e;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            if (!strD.contentEquals(ackj.k(null, alayVar2, null, false))) {
                aihf aihfVarCreateBuilder2 = aote.a.createBuilder();
                aotd aotdVar2 = aotd.ACTION_SET_PLAYLIST_DESCRIPTION;
                aihfVarCreateBuilder2.copyOnWrite();
                aote aoteVar3 = (aote) aihfVarCreateBuilder2.instance;
                aoteVar3.d = aotdVar2.an;
                aoteVar3.b |= 1;
                aihfVarCreateBuilder2.copyOnWrite();
                aote aoteVar4 = (aote) aihfVarCreateBuilder2.instance;
                strD.getClass();
                aoteVar4.b |= SemanticState.Obscured;
                aoteVar4.j = strD;
                wsiVar.b.add((aote) aihfVarCreateBuilder2.build());
            }
            int iN = jemVar.n();
            int iAS = a.aS(this.q.f);
            if (iAS == 0) {
                iAS = 1;
            }
            if (iN != iAS) {
                aihf aihfVarCreateBuilder3 = aote.a.createBuilder();
                aotd aotdVar3 = aotd.ACTION_SET_PLAYLIST_PRIVACY;
                aihfVarCreateBuilder3.copyOnWrite();
                aote aoteVar5 = (aote) aihfVarCreateBuilder3.instance;
                aoteVar5.d = aotdVar3.an;
                aoteVar5.b |= 1;
                aihfVarCreateBuilder3.copyOnWrite();
                aote aoteVar6 = (aote) aihfVarCreateBuilder3.instance;
                int i = iN - 1;
                if (iN == 0) {
                    throw null;
                }
                aoteVar6.k = i;
                aoteVar6.b |= 16384;
                wsiVar.b.add((aote) aihfVarCreateBuilder3.build());
            }
            if (this.u.l(56, 45631656L, false) && (iL = jemVar.l()) != p(this.q)) {
                aihf aihfVarCreateBuilder4 = aote.a.createBuilder();
                aotd aotdVar4 = aotd.ACTION_SET_ALLOW_ITEM_VOTE;
                aihfVarCreateBuilder4.copyOnWrite();
                aote aoteVar7 = (aote) aihfVarCreateBuilder4.instance;
                aoteVar7.d = aotdVar4.an;
                aoteVar7.b |= 1;
                aihfVarCreateBuilder4.copyOnWrite();
                aote aoteVar8 = (aote) aihfVarCreateBuilder4.instance;
                int i2 = iL - 1;
                if (iL == 0) {
                    throw null;
                }
                aoteVar8.p = i2;
                aoteVar8.c |= SemanticState.ReadOnly;
                wsiVar.b.add((aote) aihfVarCreateBuilder4.build());
            }
            if ((this.q.b & SemanticState.Focused) == 0 || (iK = jemVar.k()) == o(this.q)) {
                return;
            }
            aihf aihfVarCreateBuilder5 = aote.a.createBuilder();
            aotd aotdVar5 = aotd.ACTION_SET_ALLOW_COMMENT;
            aihfVarCreateBuilder5.copyOnWrite();
            aote aoteVar9 = (aote) aihfVarCreateBuilder5.instance;
            aoteVar9.d = aotdVar5.an;
            aoteVar9.b |= 1;
            aihfVarCreateBuilder5.copyOnWrite();
            aote aoteVar10 = (aote) aihfVarCreateBuilder5.instance;
            aoteVar10.q = iK - 1;
            aoteVar10.c |= SemanticState.Modal;
            wsiVar.b.add((aote) aihfVarCreateBuilder5.build());
        }
    }

    @Override // defpackage.ijp
    public final void V(alvy alvyVar) {
        W(alvyVar, aotd.ACTION_UNKNOWN);
    }

    @Override // defpackage.ijp
    public final void W(alvy alvyVar, aotd aotdVar) {
        aihf aihfVar;
        aihf aihfVar2;
        annx annxVar;
        if (alvyVar != null) {
            if ((alvyVar.b & 8) != 0) {
                this.x.l(true);
                alvz alvzVar = alvyVar.e;
                if (alvzVar == null) {
                    alvzVar = alvz.a;
                }
                if (alvzVar.b == 173690432) {
                    alvz alvzVar2 = alvyVar.e;
                    if (alvzVar2 == null) {
                        alvzVar2 = alvz.a;
                    }
                    annxVar = alvzVar2.b == 173690432 ? (annx) alvzVar2.c : annx.a;
                } else {
                    annxVar = null;
                }
                if (aotdVar != aotd.ACTION_SET_CUSTOM_THUMBNAIL) {
                    n(annxVar, false);
                    return;
                }
                n(annxVar, true);
                jin jinVar = this.t;
                jio jioVarE = jin.e();
                jik jikVar = (jik) jioVarE;
                jikVar.c();
                jikVar.j();
                jikVar.i(0);
                jikVar.k(this.b.getString(R.string.edit_playlist_done));
                jinVar.d(jioVarE.b());
                return;
            }
            int iAU = a.aU(alvyVar.d);
            if (iAU != 0 && iAU != 1) {
                return;
            }
        }
        adma admaVar = this.c;
        if (admaVar != null && (aihfVar2 = this.v) != null) {
            admaVar.hU(this.o, (anne) aihfVar2.build());
        }
        adma admaVar2 = this.d;
        if (admaVar2 != null && (aihfVar = this.w) != null) {
            admaVar2.hU(this.o, (anob) aihfVar.build());
        }
        adma admaVar3 = this.e;
        if (admaVar3 != null) {
            admaVar3.hU(this.o, this.q);
        }
    }

    @Override // defpackage.ijn
    public final void X(alxg alxgVar) {
        adma admaVar = this.e;
        if (admaVar instanceof ijn) {
            ((ijn) admaVar).X(alxgVar);
        }
    }

    @Override // defpackage.ijo
    public final boolean Y() {
        adma admaVar = this.e;
        if (!(admaVar instanceof jem)) {
            return false;
        }
        jem jemVar = (jem) admaVar;
        String strE = jemVar.e();
        alay alayVar = this.q.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        if (strE.contentEquals(ackj.k(null, alayVar, null, false))) {
            String strD = jemVar.d();
            alay alayVar2 = this.q.e;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            if (strD.contentEquals(ackj.k(null, alayVar2, null, false))) {
                int iN = jemVar.n();
                int iAS = a.aS(this.q.f);
                if (iAS == 0) {
                    iAS = 1;
                }
                if (iN == iAS && ((!this.u.l(56, 45631656L, false) || jemVar.l() == p(this.q)) && ((this.q.b & SemanticState.Focused) == 0 || jemVar.k() == o(this.q)))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.adma
    public final View a() {
        return this.h;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        adma admaVar = this.c;
        if (admaVar != null) {
            admaVar.b(admhVar);
        }
        adma admaVar2 = this.d;
        if (admaVar2 != null) {
            admaVar2.b(admhVar);
        }
        adma admaVar3 = this.e;
        if (admaVar3 != null) {
            admaVar3.b(admhVar);
        }
        this.o = new adly();
    }

    @Override // defpackage.ivd
    public final void c(hck hckVar) {
        aihf aihfVar;
        aihf aihfVar2;
        annx annxVar = hckVar.b;
        if (annxVar != null) {
            n(annxVar, false);
            return;
        }
        adma admaVar = this.e;
        if (admaVar instanceof jem) {
            jem jemVar = (jem) admaVar;
            if (this.s) {
                alay alayVarD = ackj.d(jemVar.e());
                if (this.c != null && (aihfVar2 = this.v) != null) {
                    aihfVar2.copyOnWrite();
                    anne anneVar = (anne) aihfVar2.instance;
                    anne anneVar2 = anne.a;
                    alayVarD.getClass();
                    anneVar.c = alayVarD;
                    anneVar.b |= 1;
                    this.c.hU(this.o, (anne) this.v.build());
                }
                adma admaVar2 = this.d;
                if (admaVar2 != null && (aihfVar = this.w) != null) {
                    admaVar2.hU(this.o, (anob) aihfVar.build());
                }
                aihf builder = this.q.toBuilder();
                builder.copyOnWrite();
                anny annyVar = (anny) builder.instance;
                alayVarD.getClass();
                annyVar.c = alayVarD;
                annyVar.b |= 1;
                anny annyVar2 = (anny) builder.build();
                this.q = annyVar2;
                adma admaVar3 = this.e;
                if (admaVar3 != null) {
                    admaVar3.hU(this.o, annyVar2);
                }
            }
        }
    }

    @Override // defpackage.admr
    public final /* synthetic */ void d(adly adlyVar, Object obj) {
        annx annxVar = (annx) obj;
        annxVar.getClass();
        MenuItem menuItem = this.n;
        if (menuItem != null) {
            this.g.a(menuItem);
        }
        this.o = adlyVar;
        apji apjiVar = annxVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anoc.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            tuk.l(this.j, false);
            tuk.l(this.k, true);
            Optional optionalH = h(annxVar);
            if (optionalH.isPresent()) {
                this.w = ((aihn) optionalH.get()).toBuilder();
                advb advbVar = this.a;
                adma admaVarE = adul.e(((jce) advbVar).a, optionalH.get(), null);
                this.d = admaVarE;
                if (admaVarE == null) {
                    return;
                } else {
                    admaVarE.hU(adlyVar, optionalH.get());
                }
            }
        } else {
            Optional optionalJ = j(annxVar);
            if (optionalJ.isPresent()) {
                this.v = ((aihn) optionalJ.get()).toBuilder();
                advb advbVar2 = this.a;
                adma admaVarE2 = adul.e(((jce) advbVar2).a, optionalJ.get(), null);
                this.c = admaVarE2;
                if (admaVarE2 == null) {
                    return;
                } else {
                    admaVarE2.hU(adlyVar, optionalJ.get());
                }
            }
        }
        Optional optionalK = k(annxVar);
        if (optionalK.isPresent()) {
            this.q = (anny) optionalK.get();
            advb advbVar3 = this.a;
            adma admaVarE3 = adul.e(((jce) advbVar3).a, optionalK.get(), null);
            this.e = admaVarE3;
            if (admaVarE3 != null) {
                admaVarE3.hU(adlyVar, optionalK.get());
            }
        }
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((annx) obj).e.G();
    }

    @Override // defpackage.ivd
    public final boolean f() {
        adma admaVar = this.e;
        if (!(admaVar instanceof jem)) {
            return false;
        }
        String strE = ((jem) admaVar).e();
        alay alayVar = this.q.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        return !strE.contentEquals(ackj.k(null, alayVar, null, false));
    }

    @Override // defpackage.ivd
    public final void g(aihf aihfVar) {
        adma admaVar = this.e;
        if (admaVar instanceof jem) {
            String strE = ((jem) admaVar).e();
            alay alayVar = this.q.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            boolean zContentEquals = strE.contentEquals(ackj.k(null, alayVar, null, false));
            this.s = !zContentEquals;
            if (zContentEquals) {
                return;
            }
            aihf aihfVarCreateBuilder = apyx.a.createBuilder();
            aihf aihfVarCreateBuilder2 = apza.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            apza apzaVar = (apza) aihfVarCreateBuilder2.instance;
            strE.getClass();
            apzaVar.b |= 1;
            apzaVar.c = strE;
            aihfVarCreateBuilder.copyOnWrite();
            apyx apyxVar = (apyx) aihfVarCreateBuilder.instance;
            apza apzaVar2 = (apza) aihfVarCreateBuilder2.build();
            apzaVar2.getClass();
            apyxVar.c = apzaVar2;
            apyxVar.b = 4;
            aihfVar.cm(aihfVarCreateBuilder);
        }
    }

    @Override // defpackage.gdy
    public final void hS(Configuration configuration) {
        adma admaVar = this.c;
        if (admaVar instanceof gdy) {
            ((gdy) admaVar).hS(configuration);
        }
        adma admaVar2 = this.d;
        if (admaVar2 instanceof gdy) {
            ((gdy) admaVar2).hS(configuration);
        }
    }

    @Override // defpackage.jiw
    public final void i(int i) {
        int height = this.m.getHeight() + i;
        View view = this.i;
        view.setPadding(0, height, 0, 0);
        view.requestLayout();
        adma admaVar = this.e;
        if (admaVar instanceof jem) {
            ((jem) admaVar).i(i);
        }
    }

    @Override // defpackage.aeum, defpackage.aeui
    public final void m(AppBarLayout appBarLayout, int i) {
        adma admaVar = this.d;
        boolean z = false;
        if (admaVar != null && this.c == null) {
            z = true;
        }
        if (this.p) {
            admaVar = this.e;
        } else if (!z) {
            admaVar = this.c;
        }
        if (admaVar instanceof aeum) {
            ((aeum) admaVar).m(appBarLayout, i);
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ixs extends adtv implements advc {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/ui/components/grid/GridController");
    private final admu b;
    private final advn c;
    private final adlq d;
    private final Context e;
    private final tbt f;
    private final acxn g;
    private alfr h;
    private Configuration i;
    private final vxz j;

    public ixs(Context context, tbt tbtVar, ttm ttmVar, acxn acxnVar, vxz vxzVar, alfr alfrVar, wnf wnfVar, xgn xgnVar) {
        super(wnfVar, tbtVar, new Object(), ttmVar, xgnVar);
        this.e = context;
        this.f = tbtVar;
        this.g = acxnVar;
        this.j = vxzVar;
        adlq adlqVar = new adlq(false);
        this.d = adlqVar;
        admu admuVar = new admu();
        this.b = admuVar;
        advn advnVar = new advn();
        this.c = advnVar;
        tbtVar.f(this);
        adlqVar.m(-1, admuVar, true);
        adlqVar.m(-1, advnVar, true);
        v(alfrVar);
        u(alfrVar);
        r(l(alfrVar), alfrVar);
    }

    private static final boolean A(Object obj) {
        return (obj instanceof alfq) || (obj instanceof anwz);
    }

    private final int h(alfr alfrVar) {
        alfp alfpVar;
        int iW = w();
        if ((alfrVar.b & SemanticState.ReadOnly) != 0) {
            alfpVar = alfrVar.f;
            if (alfpVar == null) {
                alfpVar = alfp.a;
            }
        } else {
            alfpVar = null;
        }
        if (alfpVar == null) {
            return this.e.getResources().getInteger(R.integer.grid_shelf_num_columns);
        }
        int i = iW - 1;
        if (i == 0) {
            return alfpVar.c;
        }
        if (i != 1) {
            return i != 2 ? alfpVar.f : alfpVar.d;
        }
        return alfpVar.e;
    }

    private final List j() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            admu admuVar = this.b;
            if (i >= admuVar.size()) {
                return arrayList;
            }
            Object obj = admuVar.get(i);
            if (!A(obj)) {
                if (obj instanceof adla) {
                    for (Object obj2 : ((adla) obj).b()) {
                        if (obj2 != null) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList.add(obj);
                }
            }
            i++;
        }
    }

    private final List l(alfr alfrVar) {
        Object objA;
        ArrayList arrayList = new ArrayList();
        for (alfu alfuVar : alfrVar.d) {
            int i = alfuVar.b;
            if ((i & SemanticState.Hidden) != 0) {
                objA = alfuVar.c;
                if (objA == null) {
                    objA = anzn.a;
                }
            } else if ((32768 & i) != 0) {
                objA = alfuVar.d;
                if (objA == null) {
                    objA = ansm.a;
                }
            } else if ((262144 & i) != 0) {
                objA = alfuVar.f;
                if (objA == null) {
                    objA = ankz.a;
                }
            } else {
                if ((i & 131072) == 0) {
                    throw new IllegalArgumentException("Unsupported renderer in GridRenderer");
                }
                acxn acxnVar = this.g;
                akrn akrnVar = alfuVar.e;
                if (akrnVar == null) {
                    akrnVar = akrn.a;
                }
                objA = acxnVar.a(akrnVar);
            }
            arrayList.add(objA);
        }
        return arrayList;
    }

    private final void q(Object obj) {
        alfr alfrVarY = y(this.h, obj);
        v(alfrVarY);
        u(alfrVarY);
        r(l(alfrVarY), alfrVarY);
    }

    private final void r(List list, alfr alfrVar) {
        Optional optionalEmpty;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ixs ixsVar = this;
        alfr alfrVar2 = alfrVar;
        int iH = ixsVar.h(alfrVar2);
        if (iH == 0) {
            throw new IllegalArgumentException("Server sent a value of zero for number of columns in the grid.");
        }
        int iW = ixsVar.w();
        if ((alfrVar2.b & SemanticState.Modal) != 0) {
            alfs alfsVar = alfrVar2.g;
            if (alfsVar == null) {
                alfsVar = alfs.a;
            }
            optionalEmpty = Optional.of(alfsVar);
        } else {
            optionalEmpty = Optional.empty();
        }
        int i8 = 0;
        int i9 = 0;
        while (i9 < list.size()) {
            ArrayList arrayList = new ArrayList();
            int i10 = i8;
            int i11 = i10;
            while (true) {
                if (i10 >= iH || i9 >= list.size()) {
                    i = i8;
                    break;
                }
                arrayList.add(list.get(i9));
                i11 |= (i9 == list.size() + (-1) ? i8 : 1) ^ 1;
                if (i9 == 0) {
                    if (list.get(i8) instanceof ankz) {
                        i9 = 1;
                        i = 1;
                        break;
                    }
                    i9 = i8;
                }
                i9++;
                i10++;
            }
            admu admuVar = ixsVar.b;
            Context context = ixsVar.e;
            int i12 = 1 != i ? iH : 1;
            ajwd ajwdVarA = ajwd.a(alfrVar2.h);
            if (ajwdVarA == null) {
                ajwdVarA = ajwd.COLLECTION_STYLE_ITEM_SIZE_UNKNOWN;
            }
            vxz vxzVar = ixsVar.j;
            if (optionalEmpty.isPresent()) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int iW2 = jnj.w(context);
                Object obj = optionalEmpty.get();
                int i13 = iW - 1;
                if (i13 == 0) {
                    i7 = ((alfs) obj).g;
                } else if (i13 != 1) {
                    i7 = i13 != 2 ? ((alfs) obj).j : ((alfs) obj).h;
                } else {
                    i7 = ((alfs) obj).i;
                }
                int iC = twm.c(displayMetrics, i7);
                i2 = 0;
                int i14 = (!vxzVar.l(221, 45757537L, false) || i11 == 0) ? iC : 0;
                admuVar.e(new adli(iW2, 0));
                admuVar.e(new adlx(context, ajwdVarA, 1));
                i4 = iW2;
                i5 = i4;
                i6 = iC;
                i3 = i14;
            } else {
                i2 = i8;
                i3 = i2;
                i4 = i3;
                i5 = i4;
                i6 = i5;
            }
            admuVar.add(new adla(i12, arrayList, i3, i4, i5, i6));
            alfrVar2 = alfrVar;
            iH = iH;
            i8 = i2;
            ixsVar = this;
        }
    }

    private final void u(alfr alfrVar) {
        Optional optionalEmpty = Optional.empty();
        apji apjiVar = alfrVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(alfv.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            apji apjiVar2 = alfrVar.c;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(alfv.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            optionalEmpty = Optional.of(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        } else {
            apji apjiVar3 = alfrVar.c;
            if (apjiVar3 == null) {
                apjiVar3 = apji.a;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anwz.b);
            apjiVar3.c(aihlVarCheckIsLite3);
            if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                apji apjiVar4 = alfrVar.c;
                if (apjiVar4 == null) {
                    apjiVar4 = apji.a;
                }
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(anwz.b);
                apjiVar4.c(aihlVarCheckIsLite4);
                Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                optionalEmpty = Optional.of(objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
            } else {
                admu admuVar = this.b;
                if (admuVar.size() > 0 && A(admuVar.get(0))) {
                    optionalEmpty = Optional.of(admuVar.get(0));
                }
            }
        }
        admu admuVar2 = this.b;
        admuVar2.clear();
        admuVar2.getClass();
        imc imcVar = new imc(admuVar2, 14);
        if (true == optionalEmpty.isPresent()) {
            ((AbstractList) imcVar.a).add(optionalEmpty.get());
        }
    }

    private final void v(alfr alfrVar) {
        this.h = alfrVar;
        acjx acjxVarAe = null;
        for (alft alftVar : alfrVar.e) {
            if ((alftVar.b & 1) != 0) {
                aobx aobxVar = alftVar.c;
                if (aobxVar == null) {
                    aobxVar = aobx.a;
                }
                acjxVarAe = aawb.ae(aobxVar);
            }
        }
        aI(acjxVarAe == null ? agpi.a : agke.q(acjxVarAe));
    }

    private final int w() {
        Configuration configuration = this.i;
        if (configuration == null) {
            configuration = this.e.getResources().getConfiguration();
        }
        Context context = this.e;
        int i = configuration.orientation;
        boolean zV = twm.v(context);
        if (i != 2) {
            return zV ? 3 : 1;
        }
        return zV ? 4 : 2;
    }

    private static final alfr y(alfr alfrVar, Object obj) {
        aihf builder = alfrVar.toBuilder();
        builder.copyOnWrite();
        ((alfr) builder.instance).d = alfr.emptyProtobufList();
        for (alfu alfuVar : alfrVar.d) {
            if ((alfuVar.b & SemanticState.Hidden) != 0) {
                anzn anznVar = alfuVar.c;
                if (anznVar == null) {
                    anznVar = anzn.a;
                }
                if (!anznVar.equals(obj)) {
                    builder.aZ(alfuVar);
                }
            }
            if ((alfuVar.b & 262144) != 0) {
                ankz ankzVar = alfuVar.f;
                if (ankzVar == null) {
                    ankzVar = ankz.a;
                }
                if (!ankzVar.equals(obj)) {
                    builder.aZ(alfuVar);
                }
            }
            if ((alfuVar.b & 131072) != 0) {
                akrn akrnVar = alfuVar.e;
                if (akrnVar == null) {
                    akrnVar = akrn.a;
                }
                if (!akrnVar.equals(obj)) {
                    builder.aZ(alfuVar);
                }
            }
        }
        return (alfr) builder.build();
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.d;
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ Object c(apjh apjhVar) {
        if (apjhVar == null) {
            return null;
        }
        aihl aihlVar = apoq.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjhVar.c(aihlVarCheckIsLite);
        if (!apjhVar.j.n(aihlVarCheckIsLite.d)) {
            return null;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        apjhVar.c(aihlVarCheckIsLite2);
        Object objK = apjhVar.j.k(aihlVarCheckIsLite2.d);
        apoq apoqVar = (apoq) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if (apoqVar.f.size() <= 0) {
            return null;
        }
        aiie aiieVar = apoqVar.f;
        if (aiieVar.isEmpty() || (((apox) aiieVar.get(0)).b & SemanticState.Hidden) == 0) {
            return null;
        }
        alfr alfrVar = ((apox) aiieVar.get(0)).p;
        return alfrVar == null ? alfr.a : alfrVar;
    }

    @tcc
    public void handleDeletePlaylistEvent(gsd gsdVar) {
        Optional optional = (Optional) gsdVar.e;
        if (optional.isPresent()) {
            q(optional.get());
        }
    }

    @tcc
    void handleErrorEvent(adtr adtrVar) {
        this.c.b(null);
        ((agrc) ((agrc) a.c()).k("com/google/android/apps/youtube/music/ui/components/grid/GridController", "handleErrorEvent", 449, "GridController.java")).w("Problem loading continuation: %s", adtrVar.a.c);
    }

    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        Object obj = vvtVar.a;
        if (!(obj instanceof ankz)) {
            if (obj instanceof anzn) {
                q(obj);
                return;
            } else {
                if (obj instanceof akrn) {
                    q(obj);
                    return;
                }
                return;
            }
        }
        int i = 0;
        while (true) {
            admu admuVar = this.b;
            if (i >= admuVar.size()) {
                return;
            }
            if (admuVar.get(i) instanceof adla) {
                List listB = ((adla) admuVar.get(i)).b();
                for (int i2 = 0; i2 < listB.size(); i2++) {
                    Object obj2 = listB.get(i2);
                    if (obj2 != null && obj2.equals(obj)) {
                        admuVar.remove(i);
                        this.h = y(this.h, obj);
                        return;
                    }
                }
            }
            i++;
        }
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ void hs(Object obj, acjx acjxVar) {
        alfr alfrVar = (alfr) obj;
        super.hs(alfrVar, acjxVar);
        if (alfrVar != null) {
            if (h(alfrVar) != h(this.h)) {
                List listJ = j();
                listJ.addAll(l(alfrVar));
                u(alfrVar);
                v(alfrVar);
                r(listJ, alfrVar);
                return;
            }
            v(alfrVar);
            List listL = l(alfrVar);
            boolean zL = this.j.l(221, 45757537L, false);
            admu admuVar = this.b;
            if (zL) {
                if (admuVar.size() != 0) {
                    Object obj2 = admuVar.get(admuVar.size() - 1);
                    if (obj2 instanceof adla) {
                        List listB = ((adla) obj2).b();
                        int size = listB.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            Object obj3 = listB.get(size);
                            if (obj3 != null) {
                                listL.add(0, obj3);
                            }
                        }
                        admuVar.remove(admuVar.size() - 1);
                    }
                }
            } else if (admuVar.size() != 0) {
                adla adlaVar = (adla) admuVar.get(admuVar.size() - 1);
                List listB2 = adlaVar.b();
                if (listB2.size() < adlaVar.a) {
                    int size2 = listB2.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        Object obj4 = listB2.get(size2);
                        if (obj4 != null) {
                            listL.add(0, obj4);
                        }
                    }
                    admuVar.remove(admuVar.size() - 1);
                }
            }
            r(listL, alfrVar);
        }
    }

    @Override // defpackage.adtv, defpackage.twn
    public final void i() {
        this.f.l(this);
    }

    @Override // defpackage.advc
    public final void k(Configuration configuration) {
        this.i = configuration;
        List listJ = j();
        u(this.h);
        r(listJ, this.h);
    }
}

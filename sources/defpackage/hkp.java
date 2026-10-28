package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hkp implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hkp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v43, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        adxd adxdVar;
        ListenableFuture listenableFutureG;
        int i = 12;
        int i2 = 5;
        switch (this.$cid) {
            case 0:
                hkq hkqVar = (hkq) this.a;
                hkqVar.d = (anit) obj;
                hkqVar.a.invalidateOptionsMenu();
                break;
            case 1:
                aonl aonlVar = (aonl) obj;
                hkl hklVar = (hkl) this.a;
                if (hklVar.g != null) {
                    for (aonl aonlVar2 : hklVar.f) {
                        afdk afdkVar = (afdk) hklVar.e.get(aonlVar2.e);
                        if (afdkVar != null && afdkVar.d != null) {
                            boolean zEquals = aonlVar2.e.equals(aonlVar.e);
                            ImageView imageView = (ImageView) afdkVar.d.findViewById(R.id.icon);
                            izf izfVar = (izf) hklVar.b;
                            aliz alizVarA = aliz.a((aonlVar2.c == 5 ? (alja) aonlVar2.d : alja.a).c);
                            if (alizVarA == null) {
                                alizVarA = aliz.UNKNOWN;
                            }
                            int iB = izfVar.d.b((zEquals && izfVar.c.containsKey(alizVarA)) ? (arqz) izfVar.f.get(alizVarA) : (arqz) izfVar.e.get(alizVarA));
                            if (iB == 0) {
                                Integer num = (zEquals && izfVar.c.containsKey(alizVarA)) ? (Integer) izfVar.c.get(alizVarA) : (Integer) izfVar.b.get(alizVarA);
                                iB = num != null ? num.intValue() : 0;
                            }
                            imageView.setImageResource(iB);
                        }
                    }
                }
                break;
            case 2:
                Object obj2 = this.a;
                hkr hkrVar = (hkr) obj2;
                hkrVar.h = hkrVar.a.b(hkrVar.b.e()).k((String) obj).O(hkrVar.e).af(new hjd(obj2, i));
                break;
            case 3:
                ((hwv) this.a).a = ((abvn) obj).G().x(new hgu(8)).at().e().F(new hwu(1), new hpw(i));
                break;
            case 4:
                ((hwm) ((iio) ((iin) this.a).a).d.io()).c((aima) obj);
                break;
            case 5:
                ((ivn) this.a).h.a((ajwo) obj);
                break;
            case 6:
                int i3 = jbm.f;
                tuk.u((TextView) obj, this.a);
                break;
            case 7:
                ((sgi) obj).r((abnr) this.a);
                break;
            case 8:
                String str = (String) obj;
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                aloi aloiVar = (aloi) aihfVar.instance;
                aloi aloiVar2 = aloi.a;
                str.getClass();
                aloiVar.b |= SemanticState.Focused;
                aloiVar.g = str;
                break;
            case 9:
                int i4 = tce.b;
                ((tbt) obj).c(this.a);
                break;
            case 10:
                Object obj3 = this.a;
                ahno.O(((vqs) obj3).f.isPresent());
                Optional optionalOfNullable = Optional.ofNullable(((Bundle) obj).getString("uuid_state_key"));
                urh urhVar = new urh(obj3, 20);
                if (true == optionalOfNullable.isPresent()) {
                    Object obj4 = optionalOfNullable.get();
                    Object obj5 = urhVar.a;
                    String str2 = (String) obj4;
                    vqs vqsVar = (vqs) obj5;
                    vqsVar.g = str2;
                    abxv abxvVar = (abxv) vqsVar.f.get();
                    byte[] bArr = null;
                    if (((vxz) abxvVar.c).l(372, 45812899L, false)) {
                        xpl xplVar = (xpl) abxvVar.b.remove(str2);
                        if (xplVar == null) {
                            adxdVar = null;
                        } else if (abxv.t((vsv) xplVar.b)) {
                            listenableFutureG = ahng.n(Optional.of(xplVar));
                        } else {
                            twu.c(5, "Dropping invalid EngagementPanelSavedState.", null);
                            listenableFutureG = ahng.n(Optional.empty());
                        }
                        taf.l(vqsVar.e, listenableFutureG, new jco(19), new uny(obj5, 13));
                    } else {
                        ?? r3 = abxvVar.d;
                        Optional optionalFindFirst = Collection.EL.stream(r3).filter(new uso(str2, 17)).findFirst();
                        if (true == optionalFindFirst.isPresent()) {
                            optionalFindFirst = Optional.ofNullable(((vvi) optionalFindFirst.get()).b);
                        }
                        adxdVar = (adxd) optionalFindFirst.orElse(null);
                        Collection.EL.removeIf(r3, new uso(str2, 14));
                    }
                    listenableFutureG = afxd.f(((abxv) abxvVar.a).u()).h(new oly(i2), MoreExecutors.directExecutor()).g(new tvm(str2, adxdVar, 9, bArr), MoreExecutors.directExecutor());
                    taf.l(vqsVar.e, listenableFutureG, new jco(19), new uny(obj5, 13));
                }
                break;
            case 11:
                this.a.invoke(obj);
                break;
            case 12:
                apla aplaVar = (apla) obj;
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                amad amadVar = (amad) aihfVar2.instance;
                amad amadVar2 = amad.a;
                aplaVar.getClass();
                amadVar.w = aplaVar;
                amadVar.c |= SemanticState.Hidden;
                break;
            case 13:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                amad amadVar3 = (amad) aihfVar3.instance;
                amad amadVar4 = amad.a;
                amadVar3.c |= 131072;
                amadVar3.z = zBooleanValue;
                break;
            case 14:
                amuf amufVar = (amuf) obj;
                aihf aihfVar4 = (aihf) this.a;
                aihfVar4.copyOnWrite();
                ambz ambzVar = (ambz) aihfVar4.instance;
                ambz ambzVar2 = ambz.a;
                amufVar.getClass();
                ambzVar.h = amufVar;
                ambzVar.b |= 32;
                break;
            case 15:
                String str3 = (String) obj;
                aihf aihfVar5 = (aihf) this.a;
                aihfVar5.copyOnWrite();
                jrc jrcVar = (jrc) aihfVar5.instance;
                jrc jrcVar2 = jrc.a;
                str3.getClass();
                jrcVar.b |= SemanticState.Focused;
                jrcVar.j = str3;
                break;
            case 16:
                aihf aihfVar6 = (aihf) this.a;
                aihfVar6.copyOnWrite();
                amiu amiuVar = (amiu) aihfVar6.instance;
                amiu amiuVar2 = amiu.a;
                amiuVar.l = ((ajuf) obj).p;
                amiuVar.b |= SemanticState.Modal;
                break;
            case 17:
                ((xjt) this.a).f("mod_li", true != ((Boolean) obj).booleanValue() ? "0" : "1");
                break;
            case 18:
                aigj aigjVar = (aigj) obj;
                aihf aihfVar7 = (aihf) this.a;
                aihfVar7.copyOnWrite();
                jrk jrkVar = (jrk) aihfVar7.instance;
                jrk jrkVar2 = jrk.a;
                aigjVar.getClass();
                jrkVar.c |= 16;
                jrkVar.J = aigjVar;
                break;
            case 19:
                apla aplaVar2 = (apla) obj;
                aihf aihfVar8 = (aihf) this.a;
                aihfVar8.copyOnWrite();
                jrk jrkVar3 = (jrk) aihfVar8.instance;
                jrk jrkVar4 = jrk.a;
                aplaVar2.getClass();
                jrkVar3.K = aplaVar2;
                jrkVar3.c |= 32;
                break;
            default:
                lqa lqaVar = (lqa) obj;
                Object obj6 = this.a;
                adsr adsrVar = (adsr) obj6;
                RecyclerView recyclerView = (RecyclerView) adsrVar.l;
                DisplayMetrics displayMetrics = recyclerView.getResources().getDisplayMetrics();
                adwg adwgVar = (adwg) obj6;
                vxz vxzVar = adwgVar.aa;
                recyclerView.aJ(new aduj(adsrVar.m, lqaVar, displayMetrics, adwgVar.x, vxzVar != null && vxzVar.l(77, 45802733L, false)));
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

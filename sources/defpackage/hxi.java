package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.player.audiovideoswitcher.ui.AudioVideoSwitcherToggleView;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hxi implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hxi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:197:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:270:0x0535  */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        boolean z;
        boolean z2;
        wiw[] wiwVarArr;
        wgi wgiVar;
        boolean z3;
        long j;
        wjf wjfVar;
        int i = -1;
        boolean z4 = true;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                aazj aazjVar = (aazj) obj;
                abob abobVar = aazjVar.a;
                hxj hxjVar = (hxj) ((hhc) this.a).a;
                boolean z5 = hxjVar.e;
                hxjVar.e = abobVar.h();
                wjf wjfVar2 = aazjVar.b;
                boolean z6 = hxjVar.d;
                if (wjfVar2 != null) {
                    z = !hna.x(wjfVar2) && hna.v(wjfVar2);
                    hxjVar.d = z;
                } else {
                    z = z6;
                }
                if (hxjVar.e == z5 && z == z6) {
                    return;
                }
                hxjVar.e();
                return;
            case 1:
                AudioVideoSwitcherToggleView audioVideoSwitcherToggleView = (AudioVideoSwitcherToggleView) this.a;
                audioVideoSwitcherToggleView.b = (iwl) obj;
                audioVideoSwitcherToggleView.d();
                return;
            case 2:
                int iOrdinal = ((aayw) obj).b.ordinal();
                Object obj2 = this.a;
                if (iOrdinal == 0) {
                    ((hxj) ((hhc) obj2).a).g = true;
                } else if (iOrdinal == 4) {
                    hxj hxjVar2 = (hxj) ((hhc) obj2).a;
                    hxjVar2.g = false;
                    hxjVar2.a();
                }
                ((hxj) ((hhc) obj2).a).e();
                return;
            case 3:
                wjf wjfVar3 = ((aazj) obj).b;
                if (wjfVar3 == null || wjfVar3.S()) {
                    z2 = false;
                } else {
                    if (wjfVar3.u() != null && (wjfVar3.u().b & 8) != 0) {
                        alvw alvwVar = wjfVar3.u().g;
                        if (alvwVar == null) {
                            alvwVar = alvw.a;
                        }
                        if ((alvwVar.b & 134217728) != 0) {
                            alvw alvwVar2 = wjfVar3.u().g;
                            if (alvwVar2 == null) {
                                alvwVar2 = alvw.a;
                            }
                            if (alvwVar2.q) {
                                z2 = false;
                            }
                        }
                    }
                    z2 = true;
                }
                hyp hypVar = (hyp) ((hhc) this.a).a;
                hypVar.c = z2;
                ((adyj) hypVar.b.io()).g(hypVar.c);
                return;
            case 4:
                aaxd aaxdVar = (aaxd) obj;
                hyt hytVar = (hyt) ((hwe) this.a).a;
                if (hytVar.c != null) {
                    while (true) {
                        wiwVarArr = hytVar.c;
                        if (i2 < wiwVarArr.length) {
                            if (wiwVarArr[i2].a == aaxdVar.a) {
                                i = i2;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (i >= 0) {
                        hytVar.d(wiwVarArr, i, hytVar.e);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                aayw aaywVar = (aayw) obj;
                int iOrdinal2 = aaywVar.b.ordinal();
                Object obj3 = this.a;
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    ((hyu) ((hwe) obj3).a).a();
                    return;
                }
                if (iOrdinal2 != 4 || (wgiVar = aaywVar.d) == null || wgiVar.b == null) {
                    return;
                }
                Object obj4 = ((hwe) obj3).a;
                amae amaeVar = wgiVar.a;
                if ((amaeVar.b & SemanticState.ReadOnly) != 0) {
                    alzx alzxVar = amaeVar.n;
                    if (alzxVar == null) {
                        alzxVar = alzx.a;
                    }
                    ((hyu) obj4).f = Optional.of(alzxVar);
                    return;
                }
                return;
            case 6:
                abke abkeVar = (abke) obj;
                if (abkeVar instanceof hyw) {
                    hyw hywVar = (hyw) abkeVar;
                    Iterator it = ((axfd) this.a).a.iterator();
                    while (it.hasNext()) {
                        ((hyy) it.next()).a(hywVar);
                    }
                    return;
                }
                return;
            case 7:
                xir xirVar = (xir) ((tyy) obj).a();
                hzi hziVar = (hzi) this.a;
                hziVar.a = xirVar;
                hziVar.b = true;
                return;
            case 8:
                aayw aaywVar2 = (aayw) obj;
                boolean zB = aaywVar2.b.b(abnw.e);
                Object obj5 = this.a;
                if (zB) {
                    amks amksVarW = fhz.W(aaywVar2.d);
                    ((hzp) ((hzo) obj5).a).g = amksVarW != null ? (aihh) amksVarW.toBuilder() : null;
                }
                hzp hzpVar = (hzp) ((hzo) obj5).a;
                Iterator it2 = hzpVar.b.iterator();
                while (it2.hasNext()) {
                    ((hzv) it2.next()).m(hzpVar.g);
                }
                return;
            case 9:
                ibn ibnVar = (ibn) this.a;
                ibh ibhVar = (ibh) obj;
                abke abkeVarK = ibnVar.c.k(ibnVar.h.q());
                if (abkeVarK instanceof hzg) {
                    abkeVarK.getClass();
                    hzg hzgVar = (hzg) abkeVarK;
                    if (Objects.equals(hzgVar.v(ibhVar), hzgVar.c)) {
                        return;
                    }
                    ibnVar.c(ibhVar);
                    HashMap map = new HashMap();
                    awmd awmdVar = ibnVar.a;
                    if (((abvn) awmdVar.io()).o().i() != null) {
                        long jA = ((abvn) awmdVar.io()).o().i().a();
                        kyr kyrVar = hzgVar.g;
                        i2 = kyrVar.b == anzw.MUSIC_VIDEO_TYPE_ATV ? 1 : 0;
                        boolean zL = hwz.l(ibhVar);
                        Object obj6 = kyrVar.a;
                        long j2 = 0;
                        if (obj6 != null) {
                            aout aoutVar = (aout) obj6;
                            if (aoutVar.b.size() != 0) {
                                Iterator it3 = aoutVar.b.iterator();
                                long j3 = 0;
                                while (true) {
                                    if (it3.hasNext()) {
                                        aous aousVar = (aous) it3.next();
                                        j3 = aousVar.d;
                                        z3 = z4;
                                        int i3 = i2;
                                        if (i2 == zL) {
                                            j = aousVar.b;
                                            j2 = aousVar.c;
                                        } else {
                                            j = aousVar.c;
                                            j2 = aousVar.b;
                                        }
                                        if (j <= jA && jA < j + j3) {
                                            j2 += jA - j;
                                        } else if (jA >= j) {
                                            i2 = i3;
                                            z4 = z3;
                                        }
                                    } else {
                                        z3 = z4;
                                        j2 += j3;
                                    }
                                }
                            } else {
                                z3 = true;
                            }
                        } else {
                            z3 = true;
                        }
                        map.put("avSwitchPlaybackStartTime", Long.valueOf(j2));
                    } else {
                        z3 = true;
                    }
                    map.put("avSwitchTargetMode", ibhVar);
                    abnl abnlVarU = hzgVar.u(hzgVar.v(ibhVar));
                    if (abnlVarU != null) {
                        abvc abvcVarN = ((abvn) awmdVar.io()).n();
                        hzi hziVar2 = ibnVar.d;
                        abtt abttVar = abtt.JUMP;
                        abnk abnkVarF = abnlVarU.f();
                        abnkVarF.f(((abvn) awmdVar.io()).o().X() ^ z3);
                        abvcVarN.i(hziVar2.c(abttVar, abnkVarF.a(), map));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                wjf wjfVar4 = ((aazj) obj).b;
                if (wjfVar4 != null) {
                    hwz hwzVar = ((ibn) ((hwf) this.a).a).i;
                    if (hwz.k(hwzVar.f()) || hna.v(wjfVar4)) {
                        return;
                    }
                    if (wjfVar4.u() != null) {
                        alvw alvwVar3 = wjfVar4.u().g;
                        if (alvwVar3 == null) {
                            alvwVar3 = alvw.a;
                        }
                        if (alvwVar3.q) {
                            hwzVar.j(ibh.ATV_PREFERRED);
                            return;
                        }
                    }
                    if (wjfVar4.t() != null) {
                        aony aonyVarA = aony.a(wjfVar4.t().c);
                        if (aonyVarA == null) {
                            aonyVarA = aony.OK;
                        }
                        if (aonyVarA == aony.LIVE_STREAM_OFFLINE) {
                            hwzVar.j(ibh.OMV_PREFERRED);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                aazj aazjVar2 = (aazj) obj;
                abob abobVar2 = aazjVar2.a;
                if (abobVar2 == abob.i && aazjVar2.g != null && (wjfVar = aazjVar2.b) != null) {
                    wjfVar.G();
                }
                aack aackVar = (aack) this.a;
                aackVar.a = abobVar2.h();
                aackVar.d(((hwz) aackVar.d).f());
                return;
            case 12:
                ((aack) this.a).d((ibh) obj);
                return;
            case 13:
                if (((Boolean) obj).booleanValue()) {
                    aesp aespVar = (aesp) this.a;
                    if (((ibv) ((heg) aespVar.i).a).equals(ibv.LOOP_ALL)) {
                        aespVar.u();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                aayw aaywVar3 = (aayw) obj;
                wjf wjfVar5 = aaywVar3.c;
                if (!aaywVar3.b.b(abnw.d) || wjfVar5 == null) {
                    return;
                }
                ((aesp) this.a).v();
                return;
            case 15:
                String str = (String) obj;
                ArrayList arrayList = new ArrayList();
                Object obj7 = this.a;
                synchronized (obj7) {
                    for (int i4 = 0; i4 < ((abjc) obj7).hc(0); i4++) {
                        abke abkeVarO = ((abjc) obj7).O(0, i4);
                        if (str.equals(abkeVarO.t()) && abkeVarO.n() != null && abkeVarO.n().J()) {
                            arrayList.add(Integer.valueOf(i4));
                        }
                        break;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((abjc) obj7).hi(0, ((Integer) arrayList.get(size)).intValue(), 1);
                    }
                    break;
                }
                if (arrayList.isEmpty() || !((abjc) obj7).Q()) {
                    return;
                }
                ((icj) obj7).j.c(new gse());
                return;
            case 16:
                String str2 = ((aazj) obj).g;
                icq icqVar = (icq) this.a;
                if (!icqVar.w.l(121, 45828707L, false)) {
                    icqVar.m = str2;
                    return;
                } else {
                    if (str2 == null || !TextUtils.equals(str2, icqVar.p)) {
                        icqVar.m = str2;
                        icqVar.h(null);
                        return;
                    }
                    return;
                }
            case 17:
                aayw aaywVar4 = (aayw) obj;
                agrx agrxVar = agso.a;
                abnw abnwVar = aaywVar4.b;
                int iOrdinal3 = abnwVar.ordinal();
                Object obj8 = this.a;
                if (iOrdinal3 == 0) {
                    icq icqVar2 = (icq) obj8;
                    icqVar2.n();
                    if (!icqVar2.q) {
                        abnw abnwVar2 = icqVar2.i;
                        if (abnwVar2 != null && abnwVar2 != abnw.a) {
                            icqVar2.j = null;
                        }
                        icqVar2.o = null;
                        icqVar2.g = null;
                        icqVar2.h = null;
                        icqVar2.d.clear();
                        icqVar2.e.clear();
                        if (icqVar2.w.l(114, 45816425L, false) && icqVar2.j == null) {
                            icqVar2.l.clear();
                        }
                    }
                    icqVar2.k = icqVar2.j == null;
                } else if (iOrdinal3 == 1) {
                    ((icq) obj8).n();
                } else if (iOrdinal3 == 3) {
                    icq icqVar3 = (icq) obj8;
                    if (icqVar3.w.l(121, 45828707L, false)) {
                        icqVar3.h(null);
                    }
                } else if (iOrdinal3 == 4) {
                    icq icqVar4 = (icq) obj8;
                    icp icpVar = icqVar4.j;
                    if (icpVar != null) {
                        icqVar4.l.addAll(icpVar.a);
                        agke agkeVar = icqVar4.j.a;
                        int i5 = ((agpi) agkeVar).d;
                        for (int i6 = 0; i6 < i5; i6++) {
                            icqVar4.f((byte[]) agkeVar.get(i6));
                        }
                        icqVar4.f.kk(Boolean.TRUE);
                    }
                    wgi wgiVar2 = aaywVar4.d;
                    if (wgiVar2 == null || fhz.ab(wgiVar2.a) == null) {
                        if (icqVar4.x.k(45860884L, false)) {
                            if (icqVar4.h != null && !TextUtils.equals(icqVar4.m, icqVar4.n)) {
                                icqVar4.n = icqVar4.m;
                                icqVar4.f(icqVar4.h);
                                icqVar4.e();
                                Iterator it4 = icqVar4.e.iterator();
                                while (it4.hasNext()) {
                                    icqVar4.f((byte[]) it4.next());
                                }
                            }
                        } else if (icqVar4.g != null && !TextUtils.equals(icqVar4.m, icqVar4.n)) {
                            icqVar4.n = icqVar4.m;
                            icqVar4.f(icqVar4.g.d());
                            icqVar4.e();
                            Iterator it5 = icqVar4.d.iterator();
                            while (it5.hasNext()) {
                                icqVar4.g((acjy) it5.next());
                            }
                        }
                    }
                    if (icqVar4.k) {
                        icqVar4.k = false;
                        if (wgiVar2 == null) {
                            icqVar4.b.c("UNKNOWN");
                        } else {
                            amae amaeVar2 = wgiVar2.a;
                            aouj aoujVarAa = fhz.aa(amaeVar2);
                            if (aoujVarAa != null) {
                                icqVar4.b.c(aoujVarAa.g.size() > 0 ? "OK" : "EMPTY");
                            } else if (fhz.ac(amaeVar2) != null) {
                                icqVar4.b.c("INCORRECT_PROTO_FIELD");
                            }
                        }
                    }
                    if (icqVar4.q) {
                        icqVar4.q = false;
                    }
                }
                ((icq) obj8).i = abnwVar;
                return;
            case 18:
                ((awku) this.a).kk((Optional) obj);
                return;
            case 19:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                agrx agrxVar2 = agso.a;
                icx icxVar = (icx) this.a;
                icxVar.b.set(zBooleanValue);
                if (zBooleanValue) {
                    icxVar.e();
                    return;
                }
                return;
            default:
                icx icxVar2 = (icx) this.a;
                icxVar2.c((String) obj, false, ((abjp) icxVar2.a.io()).a());
                return;
        }
    }
}

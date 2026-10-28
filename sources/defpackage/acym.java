package defpackage;

import android.graphics.Rect;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acym implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acym(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v50, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v69, types: [absn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v70, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v71, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, mbb] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        abgk abgkVar;
        weh wehVar;
        wjf wjfVar;
        aeth aethVar;
        String str;
        List list;
        int i = 0;
        switch (this.$cid) {
            case 0:
                agkx agkxVar = new agkx();
                Iterator it = ((aksj) obj).b.iterator();
                while (it.hasNext()) {
                    agkxVar.c(((aksi) it.next()).b);
                }
                ((acyn) this.a).d = agkxVar.g();
                break;
            case 1:
                aazn aaznVar = (aazn) obj;
                acvc acvcVar = (acvc) this.a;
                if (acvcVar.k != null && (abgkVar = acvcVar.g) != null) {
                    int i2 = aaznVar.a;
                    if (i2 == 2) {
                        abgkVar.a(new abgi(abgh.b, false));
                    } else if (i2 == 3) {
                        abgkVar.a(new abgi(abgh.c, false));
                    }
                    break;
                }
                break;
            case 2:
                ((aehn) this.a).a((aksj) obj);
                break;
            case 3:
                weh wehVar2 = ((weo) obj).c;
                aihf aihfVarCreateBuilder = asud.a.createBuilder();
                if (wehVar2 != null) {
                    aigj aigjVarV = aigj.v(wehVar2.c());
                    aihfVarCreateBuilder.copyOnWrite();
                    asud asudVar = (asud) aihfVarCreateBuilder.instance;
                    aigjVarV.getClass();
                    asudVar.b |= 1;
                    asudVar.c = aigjVarV;
                }
                this.a.d((asud) aihfVarCreateBuilder.build());
                break;
            case 4:
                ((agrc) ((agrc) addr.a.b()).k("com/google/android/libraries/youtube/rendering/elements/converters/properties/commands/MultiFeedbackTokenCommandHandler", "onCommand", 57, "MultiFeedbackTokenCommandHandler.java")).w("%s", ((addr) this.a).b.a((Throwable) obj).b);
                break;
            case 5:
                Object obj2 = this.a;
                alab alabVar = (alab) obj;
                adhf adhfVar = (adhf) obj2;
                Optional optionalOfNullable = adhfVar.l;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((alab) optionalOfNullable.get()).d);
                }
                String str2 = (String) optionalOfNullable.orElse("");
                Optional optionalOfNullable2 = adhfVar.l;
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = Optional.ofNullable(((alab) optionalOfNullable2.get()).e);
                }
                List list2 = (List) optionalOfNullable2.orElse(agpi.a);
                adhfVar.l = Optional.of(alabVar);
                String str3 = alabVar.d;
                Map map = adhfVar.d;
                if (map.containsKey(str3) && map.get(str3) != null) {
                    if (adhfVar.k.isPresent() && ((String) adhfVar.k.get()).equals(str3) && !adhfVar.h.contains(str3)) {
                        adhfVar.c.b();
                    } else {
                        alae alaeVar = (alae) map.get(str3);
                        Optional optionalOfNullable3 = adhfVar.k;
                        adha adhaVar = new adha(obj2, i);
                        if (true == optionalOfNullable3.isPresent()) {
                            optionalOfNullable3 = Optional.ofNullable((alae) ((adhf) adhaVar.a).d.get(optionalOfNullable3.get()));
                        }
                        int iIndexOf = list2.indexOf(str3);
                        int iIndexOf2 = list2.indexOf(str2);
                        if (iIndexOf != -1 && iIndexOf < iIndexOf2 && optionalOfNullable3.isPresent() && (((alae) optionalOfNullable3.get()).b & SemanticState.Focused) != 0) {
                            vxe vxeVar = adhfVar.a;
                            ajwo ajwoVar = ((alae) optionalOfNullable3.get()).j;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            vxeVar.a(ajwoVar);
                        }
                        adhfVar.c.a(alaeVar);
                        adhfVar.k = Optional.of(str3);
                        adhfVar.h.clear();
                        if (optionalOfNullable3.isPresent() && (((alae) optionalOfNullable3.get()).b & 64) != 0) {
                            vxe vxeVar2 = adhfVar.a;
                            ajwo ajwoVar2 = ((alae) optionalOfNullable3.get()).i;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            vxeVar2.a(ajwoVar2);
                        }
                        if ((alaeVar.b & 32) != 0) {
                            vxe vxeVar3 = adhfVar.a;
                            ajwo ajwoVar3 = alaeVar.h;
                            if (ajwoVar3 == null) {
                                ajwoVar3 = ajwo.a;
                            }
                            vxeVar3.a(ajwoVar3);
                        }
                    }
                } else if (!str3.equals(str2)) {
                    if (adhfVar.i.isPresent()) {
                        adhfVar.a.a((ajwo) adhfVar.i.get());
                    }
                    adhfVar.c.c();
                }
                break;
            case 6:
                adsx adsxVar = (adsx) this.a;
                aeck aeckVar = (aeck) obj;
                if (!adsxVar.h.l(311, 45760391L, false)) {
                    adsxVar.g = agev.i(aeckVar.c());
                    adsxVar.n(aeckVar);
                    adsxVar.g(aeckVar.b());
                } else {
                    int iB = aeckVar.b();
                    aecc aeccVarC = aeckVar.c();
                    if (adsxVar.b(iB) != adsxVar.f || !adsxVar.g.g() || !adsxVar.g.c().equals(aeccVarC)) {
                        adsxVar.g = agev.i(aeccVarC);
                        adsxVar.n(aeckVar);
                        adsxVar.g(iB);
                    }
                }
                break;
            case 7:
                aeck aeckVar2 = (aeck) obj;
                aebp aebpVar = (aebp) this.a;
                if (aebpVar.e != aeckVar2.b()) {
                    aebpVar.f = true;
                    aebpVar.g = true;
                    aebpVar.e = aeckVar2.b();
                }
                break;
            case 8:
                Rect rect = (Rect) obj;
                ((aecj) this.a).g(rect.width(), rect.height());
                break;
            case 9:
                this.a.invoke(obj);
                break;
            case 10:
                aazn aaznVar2 = (aazn) obj;
                aeog aeogVar = (aeog) this.a;
                if (aeogVar.h()) {
                    Optional optional = aeogVar.p;
                    optional.isPresent();
                    if (((Boolean) optional.orElse(Boolean.FALSE)).booleanValue() && !aeogVar.t.h() && aaznVar2.a == 8) {
                        aeoh aeohVar = aeogVar.e;
                        aeohVar.g(true);
                        if (aeohVar.r()) {
                            if (aeohVar.l != 0) {
                                aeohVar.t(true, false, false, null, false);
                            } else {
                                aeohVar.g(true);
                                aeohVar.j(true, 500L);
                            }
                        }
                        break;
                    }
                }
                break;
            case 11:
                ((aera) this.a).d((aeqj) obj);
                break;
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj3 = this.a;
                if (!zBooleanValue) {
                    ((aerl) obj3).a();
                } else {
                    ((aerl) obj3).b();
                }
                break;
            case 13:
                ((aerl) this.a).a();
                break;
            case 14:
                weo weoVar = (weo) obj;
                if (weoVar != null && (wehVar = weoVar.c) != null) {
                    Object obj4 = this.a;
                    amey ameyVar = (amey) wehVar;
                    if (obj4 != null && ameyVar.getPrimaryButtonClicked().booleanValue()) {
                        absf absfVar = (absf) obj4;
                        int i3 = absfVar.a.c;
                        aony aonyVarA = aony.a(i3);
                        if (aonyVarA == null) {
                            aonyVarA = aony.OK;
                        }
                        if (aonyVarA == aony.AGE_CHECK_REQUIRED) {
                            absg absgVar = absfVar.c;
                            absgVar.e = ahng.n(Boolean.TRUE);
                            absgVar.e();
                        } else {
                            aony aonyVarA2 = aony.a(i3);
                            if (aonyVarA2 == null) {
                                aonyVarA2 = aony.OK;
                            }
                            if (aonyVarA2 == aony.CONTENT_CHECK_REQUIRED) {
                                absfVar.c.q(true);
                            }
                        }
                        absh.b(absfVar.b);
                        absn absnVar = absfVar.c.g;
                        if (absnVar != null) {
                            ((acnk) absnVar).i.f("r_wipbc");
                        }
                        break;
                    }
                }
                break;
            case 15:
                twu.c(6, "Error reading primary button status from entity store", null);
                ?? r9 = this.a;
                if (r9 != 0) {
                    r9.a();
                }
                break;
            case 16:
                this.a.invoke(obj);
                break;
            case 17:
                this.a.invoke(obj);
                break;
            case 18:
                aayw aaywVar = (aayw) obj;
                if (aaywVar.b.a(abnw.d) && (wjfVar = aaywVar.c) != null && (str = (aethVar = (aeth) this.a).c) != null && str.equals(wjfVar.G()) && (list = aethVar.d) != null && list.contains(amse.LIVE_PLAYER_STATE_ENDED) && !wjfVar.V()) {
                    aethVar.a();
                    break;
                }
                break;
            case 19:
                if (((aayt) obj).a.ordinal() == 4) {
                    Object obj5 = this.a;
                    aeth aethVar2 = (aeth) obj5;
                    aethVar2.e = aethVar2.b.z().d.p().ak(new acym(obj5, 20));
                }
                break;
            default:
                alvl alvlVar = (alvl) obj;
                aeth aethVar3 = (aeth) this.a;
                List list3 = aethVar3.d;
                if (list3 != null && list3.contains(amse.LIVE_PLAYER_STATE_ENDED)) {
                    alvg alvgVar = alvlVar.r;
                    if (alvgVar == null) {
                        alvgVar = alvg.a;
                    }
                    amsp amspVar = alvgVar.c;
                    if (amspVar == null) {
                        amspVar = amsp.a;
                    }
                    if (amspVar.i) {
                        aethVar3.a();
                    }
                    break;
                }
                break;
        }
    }
}

package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iat implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ iat(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x048b  */
    /* JADX WARN: Code duplicated, block: B:24:0x00eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        Object iexVar;
        aoun aounVar;
        ArrayList arrayList;
        Object obj2;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i = 1;
        switch (this.$cid) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    ((iaw) this.a).h(false);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                iaw iawVar = (iaw) this.a;
                if (zBooleanValue) {
                    iawVar.c.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(77738)), null);
                } else {
                    iawVar.h(true);
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    ((iaw) this.a).h(false);
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 3:
                if (!((Boolean) obj).booleanValue()) {
                    ((iaw) this.a).h(false);
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 4:
                iau iauVar = (iau) obj;
                if (!iauVar.a) {
                    Object obj3 = this.a;
                    Optional optional = iauVar.b;
                    if (optional.isPresent()) {
                        iaw iawVar2 = (iaw) obj3;
                        hpd hpdVar = iawVar2.a;
                        hth hthVar = iauVar.c;
                        if (hpdVar.q(hthVar)) {
                            iawVar2.f(hthVar, (String) optional.get());
                        } else {
                            ((iaw) obj3).h(false);
                        }
                    } else {
                        ((iaw) obj3).h(false);
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 5:
                return ((iaw) this.a).a((Optional) obj);
            case 6:
                Optional optional2 = (Optional) obj;
                boolean zIsPresent = optional2.isPresent();
                Object obj4 = this.a;
                if (zIsPresent) {
                    Object obj5 = optional2.get();
                    if (obj5 instanceof amld) {
                        amlg likeStatus = ((amld) obj5).getLikeStatus();
                        ((aihf) obj4).copyOnWrite();
                        amks amksVar = (amks) ((aihh) obj4).instance;
                        amks amksVar2 = amks.a;
                        amksVar.d = likeStatus.e;
                        amksVar.b |= 2;
                    }
                }
                return Optional.of((amks) ((aihf) obj4).build());
            case 7:
                List list = (List) obj;
                agkz agkzVar = (list == null || list.isEmpty()) ? agpr.a : (agkz) Collection.EL.stream(list).flatMap(new iaa(8)).map(new iaa(9)).collect(aghu.b);
                ?? r12 = this.a;
                return !agkzVar.isEmpty() ? (agke) Collection.EL.stream(r12).filter(new ibz(agkzVar, i)).collect(aghu.a) : r12;
            case 8:
                String strO = ((kjc) ((jij) this.a).c).o();
                ailz ailzVar = ailz.a;
                ailz ailzVar2 = (ailz) ((ailh) obj).b.get(strO);
                if (ailzVar2 != null) {
                    ailzVar = ailzVar2;
                }
                return Float.valueOf(ailzVar.c);
            case 9:
                String strO2 = ((kjc) ((jij) this.a).c).o();
                ailz ailzVar3 = ailz.a;
                ailz ailzVar4 = (ailz) ((ailh) obj).b.get(strO2);
                if (ailzVar4 != null) {
                    ailzVar3 = ailzVar4;
                }
                return Boolean.valueOf(ailzVar3.d);
            case 10:
                ajwo ajwoVar = (ajwo) obj;
                ajwo ajwoVarF = ((iby) this.a).a.a().f(ajwoVar);
                return ajwoVarF == null ? ajwoVar : ajwoVarF;
            case 11:
                return (ailx) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((aimf) obj).b), ((kjc) ((hwz) this.a).a).o(), ailx.a);
            case 12:
                aihf builder = ((aimj) obj).toBuilder();
                builder.ay(((idx) this.a).e.o(), aiml.a);
                return (aimj) builder.build();
            case 13:
                agjz agjzVar = new agjz(4);
                for (aoun aounVar2 : (List) obj) {
                    if (aounVar2 != null) {
                        agjzVar.h(((iev) this.a).e.s(aounVar2));
                    } else {
                        ((agrc) ((agrc) iev.a.c()).k("com/google/android/apps/youtube/music/player/queue/requester/OfflineQueueItemRequester", "requestPlaylistVideoItem", 160, "OfflineQueueItemRequester.java")).t("PlaylistPanelVideoRenderer generation contained a failed future.");
                    }
                }
                return agjzVar.g();
            case 14:
                return agke.q(((iev) this.a).e.s((aoun) obj));
            case 15:
                alss alssVar = (alss) obj;
                agjz agjzVar2 = new agjz(4);
                for (alst alstVar : alssVar.d) {
                    if ((alstVar.b & 1) != 0) {
                        apji apjiVar = alstVar.c;
                        if (apjiVar == null) {
                            apjiVar = apji.a;
                        }
                        Object obj6 = this.a;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(aouq.b);
                        apjiVar.c(aihlVarCheckIsLite);
                        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                            apji apjiVar2 = alstVar.c;
                            if (apjiVar2 == null) {
                                apjiVar2 = apji.a;
                            }
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aouq.b);
                            apjiVar2.c(aihlVarCheckIsLite2);
                            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                            aoun aounVar3 = (aoun) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                            if (gzj.ac(aounVar3)) {
                                hfn hfnVar = ((iew) obj6).i;
                                aihh aihhVar = (aihh) aounVar3.toBuilder();
                                aihhVar.copyOnWrite();
                                aoun aounVar4 = (aoun) aihhVar.instance;
                                aounVar4.b |= SemanticState.Focused;
                                aounVar4.k = false;
                                agjzVar2.h(hfnVar.s((aoun) aihhVar.build()));
                            }
                        } else {
                            apji apjiVar3 = alstVar.c;
                            if (apjiVar3 == null) {
                                apjiVar3 = apji.a;
                            }
                            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aouv.a);
                            apjiVar3.c(aihlVarCheckIsLite3);
                            if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                                apji apjiVar4 = alstVar.c;
                                if (apjiVar4 == null) {
                                    apjiVar4 = apji.a;
                                }
                                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aouv.a);
                                apjiVar4.c(aihlVarCheckIsLite4);
                                Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite4.d);
                                aouu aouuVar = (aouu) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                                if (aouuVar != null) {
                                    apji apjiVar5 = aouuVar.b;
                                    if (apjiVar5 == null) {
                                        apjiVar5 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aouq.b);
                                    apjiVar5.c(aihlVarCheckIsLite5);
                                    Object objK3 = apjiVar5.j.k(aihlVarCheckIsLite5.d);
                                    if ((((aoun) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3))).b & SemanticState.Modal) == 0) {
                                        apji apjiVar6 = aouuVar.b;
                                        if (apjiVar6 == null) {
                                            apjiVar6 = apji.a;
                                        }
                                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aouq.b);
                                        apjiVar6.c(aihlVarCheckIsLite6);
                                        Object objK4 = apjiVar6.j.k(aihlVarCheckIsLite6.d);
                                        ajwo ajwoVar2 = ((aoun) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4))).l;
                                        if (ajwoVar2 == null) {
                                            ajwoVar2 = ajwo.a;
                                        }
                                        if (gzj.Y(ajwoVar2)) {
                                            iew iewVar = (iew) obj6;
                                            agjzVar2.h(iewVar.i.C(aouuVar, iewVar.h));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                iexVar = new iex(agjzVar2.g(), alssVar);
                break;
            case 16:
                wgi wgiVar = (wgi) obj;
                if (wgiVar == null) {
                    return agpi.a;
                }
                aouj aoujVarAb = fhz.ab(wgiVar.a);
                if (aoujVarAb == null) {
                    return agpi.a;
                }
                agjz agjzVar3 = new agjz(4);
                for (aoui aouiVar : aoujVarAb.g) {
                    Object obj7 = this.a;
                    int i2 = aouiVar.b;
                    if ((i2 & 1) != 0) {
                        aoun aounVar5 = aouiVar.c;
                        if (aounVar5 == null) {
                            aounVar5 = aoun.a;
                        }
                        if (gzj.ac(aounVar5)) {
                            agjzVar3.h(((iew) obj7).i.s(aounVar5));
                        }
                    } else if ((i2 & 64) != 0) {
                        aouu aouuVar2 = aouiVar.e;
                        if (aouuVar2 == null) {
                            aouuVar2 = aouu.a;
                        }
                        apji apjiVar7 = aouuVar2.b;
                        if (apjiVar7 == null) {
                            apjiVar7 = apji.a;
                        }
                        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aouq.b);
                        apjiVar7.c(aihlVarCheckIsLite7);
                        if (apjiVar7.j.n(aihlVarCheckIsLite7.d)) {
                            apji apjiVar8 = aouuVar2.b;
                            if (apjiVar8 == null) {
                                apjiVar8 = apji.a;
                            }
                            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aouq.b);
                            apjiVar8.c(aihlVarCheckIsLite8);
                            Object objK5 = apjiVar8.j.k(aihlVarCheckIsLite8.d);
                            aounVar = (aoun) (objK5 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK5));
                        } else {
                            aounVar = null;
                        }
                        if (aounVar != null && gzj.ac(aounVar)) {
                            iew iewVar2 = (iew) obj7;
                            agjzVar3.h(iewVar2.i.C(aouuVar2, iewVar2.h));
                        }
                    }
                }
                return agjzVar3.g();
            case 17:
                hcg hcgVar = (hcg) obj;
                if (hcgVar != null) {
                    agke agkeVar = hcgVar.c;
                    if (agkeVar.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(agkeVar.size());
                        int size = agkeVar.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Object obj8 = this.a;
                            anyx anyxVar = (anyx) agkeVar.get(i3);
                            String str = hcgVar.f;
                            vzq vzqVarA = ini.a();
                            vzqVarA.d(str);
                            yhl yhlVar = (yhl) obj8;
                            int i4 = yhlVar.a;
                            yhlVar.a = i4 + 1;
                            vzqVarA.e(i4);
                            ini iniVarC = vzqVarA.c();
                            zh zhVar = new zh();
                            zhVar.a = 1;
                            arrayList.add(((hfn) yhlVar.c).s((aoun) ((hfn) yhlVar.b).ap(anyx.class, aoun.class, anyxVar, agkj.k("playlist_panel_video_context", iniVarC, "display_context", zhVar.d()))));
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    throw new IllegalStateException("No sideloaded video items");
                }
                return new iex(arrayList, null);
            case 18:
                kyr kyrVar = (kyr) obj;
                Object obj9 = this.a;
                if (kyrVar != null && (obj2 = kyrVar.b) != null) {
                    return ((ige) obj9).b.a((anyx) obj2);
                }
                ige igeVar = (ige) obj9;
                return igeVar.b.b(igeVar.a, R.string.sideloaded_error_unplayable);
            case 19:
                amto amtoVar = (amto) obj;
                int i5 = igh.b;
                aihf aihfVarCreateBuilder = amaa.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amaa amaaVar = (amaa) aihfVarCreateBuilder.instance;
                amtoVar.getClass();
                amaaVar.c = amtoVar;
                amaaVar.b = 61479009;
                amaa amaaVar2 = (amaa) aihfVarCreateBuilder.build();
                Object obj10 = this.a;
                aihf aihfVar = (aihf) obj10;
                aihfVar.copyOnWrite();
                amae amaeVar = (amae) ((aihh) obj10).instance;
                amae amaeVar2 = amae.a;
                amaaVar2.getClass();
                amaeVar.q = amaaVar2;
                amaeVar.b |= 16384;
                return (amae) aihfVar.build();
            default:
                int i6 = igh.b;
                iexVar = new kyr(this.a, (Object) new wgi((amae) obj), (byte[]) null);
                break;
        }
        return iexVar;
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gsu implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gsu(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:211:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r1v132, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v162, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r3v86, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v10, types: [acjx, java.lang.Object] */
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
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        Optional optionalOf;
        xvr xvrVar;
        xvr xvrVar2;
        ajwo ajwoVarA;
        aigj aigjVar;
        boolean z = false;
        int i = 1;
        switch (this.$cid) {
            case 0:
                algt algtVar = (algt) this.b;
                xvz xvzVar = new xvz(algtVar.c);
                xwc xwcVar = new xwc(algtVar.b);
                ArrayList arrayList = new ArrayList();
                arrayList.add(xvzVar);
                Object obj2 = this.a;
                gsw gswVar = (gsw) obj2;
                xws xwsVar = gswVar.e;
                Map mapB = ((xwj) xwsVar.a).b(arrayList, 8);
                if (!mapB.isEmpty()) {
                    xvh xvhVar = (xvh) mapB.get(xvzVar);
                    if (xvhVar != null && ((xwo) xwsVar.d).b(xvhVar)) {
                        Optional optionalA = ((xsa) xwsVar.e).a(xwcVar.b, (Context) xwsVar.b);
                        if (optionalA.isEmpty()) {
                            Iterator it = ((yar) xwsVar.c).b.iterator();
                            do {
                                if (it.hasNext()) {
                                    xvrVar = (xvr) it.next();
                                } else {
                                    xvrVar = null;
                                }
                                if (xvrVar != null) {
                                    optionalA = Optional.of(xvrVar.c());
                                }
                            } while (!xvzVar.equals(xvrVar instanceof xvk ? ((xvk) xvrVar).b() : xvrVar instanceof xvn ? ((xvn) xvrVar).k().d : null));
                            if (xvrVar != null) {
                                optionalA = Optional.of(xvrVar.c());
                            }
                        }
                        String str = (String) optionalA.orElse("YouTube on TV");
                        if (str == null) {
                            throw new NullPointerException("Null friendlyName");
                        }
                        xvc xvcVar = new xvc(str, new xvv(1, false), xvzVar, xwcVar);
                        Object obj3 = xwsVar.c;
                        agrx agrxVar = agso.a;
                        yar yarVar = (yar) obj3;
                        CopyOnWriteArrayList copyOnWriteArrayList = yarVar.d;
                        if (!copyOnWriteArrayList.contains(xvcVar)) {
                            copyOnWriteArrayList.add(xvcVar);
                        }
                        xvr xvrVarB = yarVar.b(xvcVar.a.b);
                        CopyOnWriteArrayList copyOnWriteArrayList2 = yarVar.b;
                        if (!copyOnWriteArrayList2.contains(xvcVar) && xvrVarB == null) {
                            copyOnWriteArrayList2.add(xvcVar);
                        }
                        yarVar.k();
                        optionalOf = Optional.of(xvcVar);
                    }
                    xvrVar2 = (xvr) optionalOf.orElse(null);
                    if (xvrVar2 != null || xvrVar2.d() == null) {
                        return;
                    }
                    Object obj4 = this.c;
                    Optional optionalD = gswVar.d(xvrVar2);
                    if (optionalD.isPresent()) {
                        gswVar.f((dii) optionalD.get(), (amyv) obj4, xvrVar2);
                        return;
                    } else {
                        gswVar.b.H().am().x(500L, TimeUnit.MILLISECONDS).s(gswVar.c).C(new gto(obj2, (Object) xvrVar2, obj4, 1, (byte[]) null), new glg(8));
                        return;
                    }
                }
                agrx agrxVar2 = agso.a;
                optionalOf = Optional.empty();
                xvrVar2 = (xvr) optionalOf.orElse(null);
                if (xvrVar2 != null) {
                    return;
                } else {
                    return;
                }
            case 1:
                Object obj5 = ((aami) obj).b;
                Object obj6 = this.a;
                if (obj5 != null) {
                    ((gms) obj6).i((hej) this.b, (wfy) obj5);
                    return;
                }
                gox goxVar = (gox) obj6;
                ((heh) goxVar.H).j(fhz.T((String) ((Optional) this.c).get(), goxVar.J() == 2));
                HashMap map = new HashMap();
                cc ccVarB = goxVar.j.b();
                if (ccVarB != null) {
                    map.put("remove_previous_fragment_from_back_stack", ccVarB);
                }
                aihf aihfVarCreateBuilder = aodq.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aodq aodqVar = (aodq) aihfVarCreateBuilder.instance;
                aodqVar.c = 1;
                aodqVar.b |= 1;
                xeu xeuVar = goxVar.aj;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.OFFLINE_BROWSE_FALLBACK_EVENT);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    aodq aodqVar2 = (aodq) aihfVarCreateBuilder.build();
                    aodqVar2.getClass();
                    alouVar.d = aodqVar2;
                    alouVar.c = 463;
                    goxVar.aj.b((alou) alosVar.build());
                }
                goxVar.k.c(((heh) goxVar.H).f, map);
                return;
            case 2:
                agke agkeVar = (agke) obj;
                boolean zIsEmpty = agkeVar.isEmpty();
                ?? r3 = this.c;
                if (!zIsEmpty) {
                    aihf aihfVarCreateBuilder2 = aoih.a.createBuilder();
                    int size = agkeVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = (String) agkeVar.get(i2);
                        aihf aihfVarCreateBuilder3 = aoig.a.createBuilder();
                        aihfVarCreateBuilder3.copyOnWrite();
                        aoig aoigVar = (aoig) aihfVarCreateBuilder3.instance;
                        str2.getClass();
                        aoigVar.b |= 1;
                        aoigVar.c = str2;
                        aoig aoigVar2 = (aoig) aihfVarCreateBuilder3.build();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aoih aoihVar = (aoih) aihfVarCreateBuilder2.instance;
                        aoigVar2.getClass();
                        aiie aiieVar = aoihVar.b;
                        if (!aiieVar.c()) {
                            aoihVar.b = aihn.mutableCopy(aiieVar);
                        }
                        aoihVar.b.add(aoigVar2);
                    }
                    r3.put("request_mutator", new grj(new glm((aoih) aihfVarCreateBuilder2.build(), 7)));
                }
                ((gta) this.a).a.c((ajwo) this.b, r3);
                return;
            case 3:
                alpe alpeVar = (alpe) obj;
                Object objS = tym.S(this.c, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                if (objS instanceof zza) {
                    ((zza) objS).a(alpeVar);
                }
                Object obj7 = this.b;
                Object obj8 = this.a;
                ajwo ajwoVar = (ajwo) obj7;
                if (!fhz.K(ajwoVar)) {
                    if (fhz.B(ajwoVar)) {
                        ((gts) obj8).a.c(new gsj(Optional.ofNullable(objS)));
                        return;
                    }
                    return;
                }
                akyo akyoVarJ = fhz.J(ajwoVar);
                if (akyoVarJ.c.size() > 0) {
                    ((vxe) ((gts) obj8).c.io()).e(akyoVarJ.c, objS);
                }
                akyp akypVar = akyoVarJ.d;
                if (akypVar == null) {
                    akypVar = akyp.a;
                }
                if (akypVar.b) {
                    if (objS != null) {
                        ((gts) obj8).a.c(new vvt(objS));
                    } else {
                        zvp.a(zvn.b, zvm.n, "No tag supplied: ".concat(String.valueOf(String.valueOf(ajwoVar.c))));
                    }
                }
                if (alpeVar.d.size() > 0) {
                    ((vxe) ((gts) obj8).c.io()).e(alpeVar.d, objS);
                    return;
                }
                return;
            case 4:
                ((hdd) this.b).dismiss();
                ((gtw) this.a).a.g((ajwo) this.c);
                return;
            case 5:
                ((gwq) this.a).d((apcd) this.b, this.c, ((Boolean) obj).booleanValue());
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                int i3 = true != bool.booleanValue() ? R.string.sideloaded_track_delete_error : R.string.sideloaded_track_delete_success;
                gya gyaVar = (gya) this.a;
                gyaVar.f.c(fhz.P(gyaVar.a.getString(i3)), this.c);
                if (bool.booleanValue()) {
                    gyaVar.c.c(new iso(Optional.ofNullable(this.b)));
                    return;
                }
                return;
            case 7:
                wer werVarE = ((hfp) this.a).b.b(this.b).e();
                Collection.EL.stream((agkz) obj).forEach(new hfo(this.c, werVarE, z ? 1 : 0));
                werVarE.b();
                return;
            case 8:
                ailn ailnVar = (ailn) obj;
                Object obj9 = this.b;
                Object obj10 = this.a;
                if (ailnVar == ailn.GRANTED) {
                    ((hhr) ((hgk) obj10).c.io()).f((hjo) obj9);
                    return;
                }
                ((hgk) obj10).b("MBS: onLoadChildren() failed. User has not consented for browsing: %s", this.c);
                hjo hjoVar = (hjo) obj9;
                hjoVar.a(tau.MEDIA_BROWSER_SEARCH_MISSING_CONSENT);
                hjoVar.b(null);
                return;
            case 9:
                ailn ailnVar2 = (ailn) obj;
                Object obj11 = this.b;
                Object obj12 = this.a;
                if (ailnVar2 == ailn.GRANTED) {
                    ((hhr) ((hgk) obj12).c.io()).d((hjn) obj11);
                    return;
                }
                ((hgk) obj12).b("MBS: onLoadChildren() failed. User has not consented for browsing: %s", this.c);
                hjn hjnVar = (hjn) obj11;
                hjnVar.b(tau.MEDIA_BROWSER_LOAD_CHILDREN_MISSING_CONSENT);
                hjnVar.c(null, null);
                return;
            case 10:
                Map map2 = (Map) obj;
                Object obj13 = this.c;
                if (map2 != null) {
                    hui huiVar = hui.a;
                    if (map2.containsKey(huiVar) && !((List) map2.get(huiVar)).isEmpty()) {
                        Object obj14 = ((List) map2.get(huiVar)).get(0);
                        if (obj14 instanceof anyx) {
                            ias iasVarG = hna.g();
                            iasVarG.a = ((anyx) obj14).getVideoId();
                            iasVarG.b = "PPAD";
                            ajwoVarA = iasVarG.a();
                        } else if (obj14 instanceof anuk) {
                            ias iasVarG2 = hna.g();
                            iasVarG2.b = ((anuk) obj14).getPlaylistId();
                            iasVarG2.k(true);
                            ajwoVarA = iasVarG2.a();
                        } else {
                            if (!(obj14 instanceof anjx)) {
                                hgy.k((awlx) obj13, new toe("Offline search results contained unknown top result."));
                                return;
                            }
                            ias iasVarG3 = hna.g();
                            iasVarG3.b = ((anjx) obj14).getAudioPlaylistId();
                            iasVarG3.k(false);
                            ajwoVarA = iasVarG3.a();
                        }
                        ((hgy) this.b).n((awlx) obj13, ajwoVarA, (Bundle) this.a);
                        return;
                    }
                }
                hgy.k((awlx) obj13, new toe("Offline search response is empty."));
                return;
            case 11:
                anab anabVar = (anab) obj;
                Object obj15 = this.c;
                if (anabVar == null || anabVar.d.size() <= 0) {
                    hgy.l((awlx) obj15, new toe("response is empty"));
                    return;
                }
                Object obj16 = this.a;
                Object obj17 = this.b;
                String str3 = ((amzx) anabVar.d.get(0)).e;
                znf znfVar = znf.a;
                ((hgy) obj17).n((awlx) obj15, yno.ai(str3).a(), (Bundle) obj16);
                return;
            case 12:
                ((awlx) this.c).ki(((hgy) this.b).h((ajwo) obj, (Bundle) this.a));
                return;
            case 13:
                ((jgc) ((hif) this.a).a.io()).j(((zot) this.c).b);
                ((hjo) this.b).b((List) obj);
                return;
            case 14:
                ((jgc) ((hio) this.a).a.io()).j(((zot) this.c).b);
                ((hjo) this.b).b((List) obj);
                return;
            case 15:
                ((hit) this.a).d((amzv) this.c, (Set) obj, this.b);
                return;
            case 16:
                ((hit) this.a).e((amzv) this.b, this.c);
                return;
            case 17:
                Object obj18 = this.c;
                htp htpVar = (htp) this.b;
                htpVar.j.add(obj18);
                htpVar.j(htpVar.a(((hte) this.a).c, ((Boolean) obj).booleanValue()));
                return;
            case 18:
                agab agabVar = (agab) obj;
                ?? r2 = this.c;
                if (agabVar == null) {
                    r2.jj(new toe("OfflineHomeContinuationService: MusicOfflineHomeRenderingBlock is null"));
                    return;
                }
                Object obj19 = this.a;
                aihf aihfVarCreateBuilder4 = apoq.a.createBuilder();
                aihfVarCreateBuilder4.getClass();
                aihf aihfVarCreateBuilder5 = apok.a.createBuilder();
                aihfVarCreateBuilder5.getClass();
                acfz.be(aihfVarCreateBuilder5);
                aihf aihfVarCreateBuilder6 = apoj.a.createBuilder();
                aihfVarCreateBuilder6.getClass();
                aihf aihfVarCreateBuilder7 = ambj.a.createBuilder();
                aihfVarCreateBuilder7.getClass();
                afyd.y(aihfVarCreateBuilder7);
                aihf aihfVarCreateBuilder8 = apox.a.createBuilder();
                aihfVarCreateBuilder8.getClass();
                aihh aihhVar = (aihh) amgg.a.createBuilder();
                aihhVar.getClass();
                List listUnmodifiableList = DesugarCollections.unmodifiableList(((amgg) aihhVar.instance).e);
                listUnmodifiableList.getClass();
                new aikl(listUnmodifiableList);
                aihf aihfVarCreateBuilder9 = amgj.a.createBuilder();
                aihfVarCreateBuilder9.getClass();
                aihh aihhVar2 = (aihh) akrn.a.createBuilder();
                aihf aihfVarCreateBuilder10 = asey.a.createBuilder();
                aihfVarCreateBuilder10.getClass();
                asfb asfbVar = hli.a;
                asfbVar.getClass();
                aihfVarCreateBuilder10.copyOnWrite();
                asey aseyVar = (asey) aihfVarCreateBuilder10.instance;
                aseyVar.c = asfbVar;
                aseyVar.b |= 1;
                String string = ((hut) obj19).a.getString(R.string.from_your_downloads);
                string.getClass();
                aihfVarCreateBuilder10.copyOnWrite();
                asey aseyVar2 = (asey) aihfVarCreateBuilder10.instance;
                aseyVar2.b |= 2;
                aseyVar2.d = string;
                aihfVarCreateBuilder10.copyOnWrite();
                asey aseyVar3 = (asey) aihfVarCreateBuilder10.instance;
                aseyVar3.e = 1;
                aseyVar3.b |= 4;
                aihn aihnVarBuild = aihfVarCreateBuilder10.build();
                aihnVarBuild.getClass();
                ?? r0 = this.b;
                agabVar.i();
                asmv asmvVar = asmv.a;
                acxu.b(aihhVar2, (asmv) agabVar.f(-1889262080, (asey) aihnVarBuild, aihn.getParserForClass(asmv.class)));
                aihn aihnVarBuild2 = aihhVar2.build();
                aihnVarBuild2.getClass();
                aihfVarCreateBuilder9.copyOnWrite();
                amgj amgjVar = (amgj) aihfVarCreateBuilder9.instance;
                amgjVar.dP = (akrn) aihnVarBuild2;
                amgjVar.i |= SemanticState.LiveRegion;
                aihn aihnVarBuild3 = aihfVarCreateBuilder9.build();
                aihnVarBuild3.getClass();
                aihhVar.j((amgj) aihnVarBuild3);
                aihn aihnVarBuild4 = aihhVar.build();
                aihnVarBuild4.getClass();
                aihfVarCreateBuilder8.copyOnWrite();
                apox apoxVar = (apox) aihfVarCreateBuilder8.instance;
                apoxVar.m = (amgg) aihnVarBuild4;
                apoxVar.b |= 32;
                aihfVarCreateBuilder7.bv(acfz.ba(aihfVarCreateBuilder8));
                aihf aihfVarCreateBuilder11 = ambd.a.createBuilder();
                aihfVarCreateBuilder11.getClass();
                afyd.A(aihfVarCreateBuilder11);
                afyd.x(afyd.z(aihfVarCreateBuilder11), aihfVarCreateBuilder7);
                acfz.bh(afyd.w(aihfVarCreateBuilder7), aihfVarCreateBuilder6);
                aihfVarCreateBuilder5.cg(acfz.bg(aihfVarCreateBuilder6));
                acfz.bc(acfz.bd(aihfVarCreateBuilder5), aihfVarCreateBuilder4);
                hus husVar = new hus(acfz.bb(aihfVarCreateBuilder4));
                r0.f(tau.BROWSE_RESPONSE_RECEIVED);
                r2.a(husVar);
                return;
            case 19:
                acjy acjyVar = (acjy) obj;
                agrx agrxVar3 = agso.a;
                icl iclVar = (icl) this.a;
                acjx acjxVar = iclVar.c;
                ?? r7 = this.c;
                if (r7 == acjxVar) {
                    iclVar.c = null;
                    jij jijVar = iclVar.e;
                    boolean z2 = acjyVar instanceof wgi;
                    if (z2) {
                        jijVar.k((wgi) acjyVar);
                    }
                    icj icjVar = iclVar.d;
                    if (icjVar != 0) {
                        acjw acjwVarA = r7.a();
                        if (acjyVar == null || acjyVar.a() == null) {
                            icjVar.h.kk(Boolean.FALSE);
                        } else {
                            apjh apjhVarA = acjyVar.a();
                            aihl aihlVar = aouj.b;
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                            apjhVarA.c(aihlVarCheckIsLite);
                            if (apjhVarA.j.n(aihlVarCheckIsLite.d)) {
                                icq icqVar = icjVar.c;
                                if (icqVar.x.k(45860884L, false)) {
                                    byte[] bArrD = acjyVar.d();
                                    icqVar.e.add(bArrD);
                                    icqVar.f(bArrD);
                                } else {
                                    icqVar.d.add(acjyVar);
                                    icqVar.g(acjyVar);
                                }
                                apjh apjhVarA2 = acjyVar.a();
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                                apjhVarA2.c(aihlVarCheckIsLite2);
                                Object objK = apjhVarA2.j.k(aihlVarCheckIsLite2.d);
                                aouj aoujVar = (aouj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                                icf icfVar = icjVar.o;
                                if (icfVar != null && (aigjVar = aoujVar.o) != null) {
                                    ((idr) icfVar).a(aigjVar.G());
                                }
                                if (z2) {
                                    ((awku) icjVar.g.io()).kk(new icw(((wgi) acjyVar).a, null));
                                }
                                if (acjw.b == acjwVarA || acjw.h == acjwVarA) {
                                    aae aaeVarJ = icjVar.J(aoujVar);
                                    icjVar.h.kk(Boolean.TRUE);
                                    icjVar.A(aoujVar, acjwVarA);
                                    ?? r4 = aaeVarJ.c;
                                    r4.size();
                                    if (!icjVar.n && icjVar.hc(1) <= 0) {
                                        i = 0;
                                    }
                                    icjVar.ha(i, icjVar.hc(i), r4);
                                    Optional optional = (Optional) aaeVarJ.b;
                                    if (optional.isPresent()) {
                                        icjVar.v((ajwo) optional.get(), false);
                                    }
                                } else if (acjw.c == acjwVarA) {
                                    ?? r5 = icjVar.J(aoujVar).c;
                                    if (icjVar.E()) {
                                        icjVar.A(aoujVar, acjwVarA);
                                    }
                                    ice iceVar = icjVar.e;
                                    icjVar.hl(iceVar);
                                    r5.size();
                                    icjVar.ha(0, 0, r5);
                                    icjVar.hg(iceVar);
                                }
                                icjVar.s();
                            } else {
                                icjVar.h.kk(Boolean.FALSE);
                            }
                        }
                    }
                    ?? r1 = this.b;
                    if (r1 != 0) {
                        r1.a(acjyVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                aimq aimqVar = (aimq) obj;
                if (this.b == anuk.class) {
                    ?? r6 = this.c;
                    if (r6.isEmpty()) {
                        return;
                    }
                    anuk anukVar = (anuk) r6.get(0);
                    anukVar.getClass();
                    Uri uri = Uri.parse(anukVar.c.v);
                    StringBuilder sb = new StringBuilder();
                    if (ish.q.match(uri) == 6) {
                        sb.append("InternalDB");
                    } else {
                        sb.append("MediaStore");
                    }
                    sb.append(", ");
                    aimp aimpVarA = aimp.a(aimqVar.c);
                    if (aimpVarA == null) {
                        aimpVarA = aimp.NOT_SET;
                    }
                    Object obj20 = this.a;
                    sb.append(aimpVarA.e);
                    sb.append(", ");
                    sb.append(aimqVar.d);
                    sb.append(", ");
                    sb.append(aimqVar.e);
                    jio jioVarE = jin.e();
                    String string2 = sb.toString();
                    jik jikVar = (jik) jioVarE;
                    jikVar.k(string2);
                    jikVar.i(5000);
                    ((iss) obj20).b.d(jioVarE.b());
                    return;
                }
                return;
        }
    }

    public /* synthetic */ gsu(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ gsu(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ gsu(zza zzaVar, hut hutVar, xir xirVar, int i) {
        this.$cid = i;
        this.c = zzaVar;
        this.a = hutVar;
        this.b = xirVar;
    }
}

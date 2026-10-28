package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import io.grpc.Status;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hpn implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hpn(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, wek] */
    /* JADX WARN: Type inference failed for: r12v1, types: [hpy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, nry] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, nry] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.Object, nsr] */
    /* JADX WARN: Type inference failed for: r12v51, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r12v59, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r12v6, types: [hyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v64, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, nry] */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        aofh aofhVar;
        switch (this.$cid) {
            case 0:
                hfw hfwVar = new hfw(this.a, 18);
                avlr avlrVarA = avlb.e().A();
                ?? r12 = this.b;
                return gzj.at(hfwVar, avlr.L(agke.r(avlrVarA, avlr.M(r12.f(anjx.class), r12.f(anuk.class)).B(new hhw((agke) obj, 5)))), r12);
            case 1:
                Object obj2 = this.b;
                aihf aihfVar = ((aphf) obj2).a;
                Object obj3 = this.a;
                agrf agrfVar = hob.a;
                String str = ((aphi) aihfVar.build()).d;
                aihf aihfVar2 = ((anxg) obj3).a;
                aihfVar2.copyOnWrite();
                anxj anxjVar = (anxj) aihfVar2.instance;
                anxj anxjVar2 = anxj.a;
                str.getClass();
                anxjVar.b |= 2;
                anxjVar.d = str;
                return ((hcc) obj).a(agke.r(obj2, obj3));
            case 2:
                return Boolean.valueOf(((hzc) obj).b(this.a, ((jgt) this.b).a.e != null));
            case 3:
                avle avleVarC = this.b.c((CommandOuterClass$Command) obj, (nrv) this.a, 1);
                if (avleVarC instanceof avol) {
                    return ((avol) avleVarC).a();
                }
                avra avraVar = new avra(avleVarC);
                avnn avnnVar = atqp.j;
                return avraVar;
            case 4:
                return this.b.c((CommandOuterClass$Command) obj, (nrv) this.a, 1);
            case 5:
                return this.b.c((CommandOuterClass$Command) obj, (nrv) this.a, 1);
            case 6:
                byte[] bArr = (byte[]) ((agev) obj).e(nty.a);
                Object obj4 = this.b;
                Object obj5 = this.a;
                try {
                    axoz axozVarA = EkoProcessor.a(((asox) obj4).d.G(), bArr);
                    Object obj6 = axozVarA.b;
                    if (!((Status) obj6).e()) {
                        throw new nud("Eko processor error: " + ((Status) obj6).getDescription());
                    }
                    ?? r13 = ((mgc) obj5).a;
                    String str2 = ((asox) obj4).c;
                    Object obj7 = axozVarA.a;
                    obj7.getClass();
                    r13.b(str2, (byte[]) obj7);
                    return avlb.e();
                } catch (IOException e) {
                    throw new nud("Invalid eko template", e);
                }
            case 7:
                return Boolean.valueOf(((vao) this.a).b((agkz) obj, (vbd) this.b));
            case 8:
                weo weoVar = (weo) obj;
                ajfu ajfuVar = (ajfu) weoVar.c;
                Object obj8 = this.b;
                if (ajfuVar == null) {
                    return Integer.valueOf(((AtomicInteger) obj8).decrementAndGet());
                }
                for (ajfv ajfvVar : ajfuVar.getSelectedAssetIds()) {
                    if (ajfuVar.getAssetItemSelectedState() == ajga.ASSET_ITEM_SELECTED_STATE_SELECTED) {
                        vat vatVar = (vat) this.a;
                        if (vatVar.h) {
                            ajwo ajwoVar = ajfvVar.e;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajfz.b);
                            ajwoVar.c(aihlVarCheckIsLite);
                            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                            vatVar.q((ajfz) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
                        } else {
                            uzx uzxVar = vatVar.i;
                            if (uzxVar != null) {
                                uzy uzyVarA = uzz.a();
                                uzyVarA.b(ajfvVar.c);
                                uzyVarA.c(ajfvVar.d);
                                uzyVarA.e(ajfvVar.f);
                                uzyVarA.c = weoVar.a;
                                uzxVar.f(uzyVarA.a());
                                if (vatVar.k) {
                                    String str3 = ajfvVar.d;
                                }
                            }
                        }
                    }
                }
                return Integer.valueOf(((AtomicInteger) obj8).decrementAndGet());
            case 9:
                return ((Boolean) obj).booleanValue() ? this.a : this.b;
            case 10:
                wer werVarE = this.a.e();
                apmf apmfVarE = ((apmh) obj).d();
                apmfVarE.a.cf(new String[]{(String) this.b}[0]);
                werVarE.e(apmfVarE.am());
                return werVarE.b();
            case 11:
                wer werVarE2 = this.a.e();
                apmf apmfVarE2 = ((apmh) obj).d();
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList((String) this.b));
                aihf aihfVar3 = apmfVarE2.a;
                List<String> listUnmodifiableList = DesugarCollections.unmodifiableList(((apmi) aihfVar3.instance).d);
                aihfVar3.copyOnWrite();
                ((apmi) aihfVar3.instance).d = apmi.emptyProtobufList();
                for (String str4 : listUnmodifiableList) {
                    if (!linkedHashSet.contains(str4)) {
                        aihfVar3.cf(str4);
                    }
                }
                werVarE2.e(apmfVarE2.am());
                return werVarE2.b();
            case 12:
                agke agkeVar = (agke) obj;
                if (agkeVar.isEmpty()) {
                    return avlb.e();
                }
                aaeu aaeuVar = (aaeu) this.a;
                wer werVarE3 = aaeuVar.d.e();
                int size = agkeVar.size();
                for (int i = 0; i < size; i++) {
                    String str5 = (String) agkeVar.get(i);
                    werVarE3.a(str5);
                    aamt aamtVarF = aaeuVar.c.f(wfs.h(str5));
                    if (aamtVarF == null) {
                        aofhVar = null;
                    } else {
                        aihf aihfVarCreateBuilder = aoom.a.createBuilder();
                        aofb aofbVar = aofb.OFFLINE_NOW;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoom aoomVar = (aoom) aihfVarCreateBuilder.instance;
                        aoomVar.k = aofbVar.i;
                        aoomVar.c |= SemanticState.ReadOnly;
                        Optional optionalOfNullable = Optional.ofNullable(aamtVarF.d);
                        if (true == optionalOfNullable.isPresent()) {
                            optionalOfNullable = Optional.ofNullable(aigj.v((byte[]) optionalOfNullable.get()));
                        }
                        aigj aigjVar = (aigj) optionalOfNullable.orElse(aigj.d);
                        aihfVarCreateBuilder.copyOnWrite();
                        aoom aoomVar2 = (aoom) aihfVarCreateBuilder.instance;
                        aigjVar.getClass();
                        aoomVar2.c |= 1;
                        aoomVar2.d = aigjVar;
                        aohx aohxVar = aamtVarF.b;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoom aoomVar3 = (aoom) aihfVarCreateBuilder.instance;
                        aoomVar3.e = aohxVar.l;
                        aoomVar3.c |= 2;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoom aoomVar4 = (aoom) aihfVarCreateBuilder.instance;
                        aoomVar4.c |= 16384;
                        aoomVar4.o = false;
                        aoom aoomVar5 = (aoom) aihfVarCreateBuilder.build();
                        aihf aihfVarCreateBuilder2 = aofh.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aofh aofhVar2 = (aofh) aihfVarCreateBuilder2.instance;
                        aofhVar2.c = 1;
                        aofhVar2.b |= 1;
                        aihfVarCreateBuilder2.copyOnWrite();
                        aofh aofhVar3 = (aofh) aihfVarCreateBuilder2.instance;
                        str5.getClass();
                        aofhVar3.b |= 2;
                        aofhVar3.d = str5;
                        aihh aihhVar = (aihh) aofg.b.createBuilder();
                        aihhVar.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                        aihhVar.e(aoom.b, aoomVar5);
                        aihfVarCreateBuilder2.copyOnWrite();
                        aofh aofhVar4 = (aofh) aihfVarCreateBuilder2.instance;
                        aofg aofgVar = (aofg) aihhVar.build();
                        aofgVar.getClass();
                        aofhVar4.e = aofgVar;
                        aofhVar4.b |= 4;
                        aofhVar = (aofh) aihfVarCreateBuilder2.build();
                    }
                    if (aofhVar != null) {
                        ((ArrayList) this.b).add(aofhVar);
                    }
                }
                return werVarE3.b();
            case 13:
                if (((agkz) obj).isEmpty()) {
                    return this.a.g((String) this.b).g(amtc.class);
                }
                return avlm.l();
            case 14:
                aapa aapaVar = (aapa) this.a;
                return tzk.c(((aapd) aapaVar.b.io()).a(acqf.d((wgi) obj, (abnl) this.b, aapaVar.d)));
            case 15:
                agke agkeVar2 = (agke) obj;
                if (agkeVar2.isEmpty()) {
                    return avmc.t(agpi.a);
                }
                return this.a.o(agkeVar2).u(new yrb(this.b, 10));
            case 16:
                abqc abqcVar = (abqc) this.a;
                if (!abqcVar.g) {
                    return tzk.f(this.b);
                }
                abqcVar.i();
                return avlm.l();
            case 17:
                abqc abqcVar2 = (abqc) this.a;
                if (!abqcVar2.g) {
                    return this.b;
                }
                abqcVar2.i();
                return avlr.z();
            default:
                aazk aazkVar = (aazk) obj;
                return Boolean.valueOf(abvb.a(aazkVar).compareTo((Duration) this.b) >= 0 || ((abvb) this.a).c(aazkVar));
        }
    }

    public /* synthetic */ hpn(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}

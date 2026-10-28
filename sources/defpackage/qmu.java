package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qmu implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ qmu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v108, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v110, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v34, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v73, types: [awmd, java.lang.Object] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) throws Throwable {
        zwa zwaVarJ;
        Optional optionalEmpty;
        switch (this.$cid) {
            case 0:
                return ((qnc) this.a).c((qnd) obj);
            case 1:
                return ((qnc) this.a).c((qnd) obj);
            case 2:
                return ((qnc) this.a).c(qnc.a((qkr) obj));
            case 3:
                return ahng.o((ListenableFuture) ((qnf) this.a).f.io());
            case 4:
                MessageLite messageLite = (MessageLite) obj;
                Object obj2 = this.a;
                qrg qrgVar = (qrg) obj2;
                Uri uri = (Uri) ahng.v(qrgVar.b);
                Uri uriA = rmp.A(uri, ".tmp");
                try {
                    afuu afuuVarB = ((qrg) obj2).d.b("Write " + ((qrg) obj2).a);
                    try {
                        qpu qpuVar = new qpu();
                        try {
                            ayq ayqVar = ((qrg) obj2).h;
                            qqu qquVar = new qqu();
                            qquVar.a = new qpu[]{qpuVar};
                            OutputStream outputStream = (OutputStream) ayqVar.X(uriA, qquVar);
                            try {
                                messageLite.writeTo(outputStream);
                                qpuVar.a();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                afuuVarB.close();
                                ((qrg) obj2).h.ab(uriA, uri);
                                return ahng.n(messageLite);
                            } catch (Throwable th) {
                                if (outputStream == null) {
                                    throw th;
                                }
                                try {
                                    outputStream.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (IOException e) {
                            throw nqw.f(((qrg) obj2).h, uri, e, ((qrg) obj2).a);
                        }
                    } catch (Throwable th3) {
                        try {
                            afuuVarB.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (IOException e2) {
                    ayq ayqVar2 = qrgVar.h;
                    if (!ayqVar2.ac(uriA)) {
                        throw e2;
                    }
                    try {
                        ayqVar2.aa(uriA);
                        throw e2;
                    } catch (IOException e3) {
                        e2.addSuppressed(e3);
                        throw e2;
                    }
                }
            case 5:
                qrt qrtVar = (qrt) this.a;
                qrtVar.e((Uri) ahng.v(qrtVar.a), obj);
                return aher.a;
            case 6:
                qrt qrtVar2 = (qrt) this.a;
                return ahng.n(qrtVar2.d((Uri) ahng.v(qrtVar2.a)));
            case 7:
                Object obj3 = this.a;
                ((IOException) obj3).addSuppressed((IOException) obj);
                throw ((Throwable) obj3);
            case 8:
                return a.k(this.a, obj);
            case 9:
                rmj rmjVar = (rmj) this.a;
                rmjVar.a.edit().remove("incognito_visitor_id").apply();
                taf.g(((omj) rmjVar.b.io()).G(), new gpq(13));
                return rmjVar.i((rlt) obj, false);
            case 10:
                String str = (String) obj;
                Object obj4 = this.a;
                if (str != null) {
                    zwaVarJ = ((rmc) ((rmo) obj4).c).j(str, false);
                } else {
                    if (((rmo) obj4).d) {
                        zvp.a(zvn.a, zvm.I, "Fail to resolve incognito previousSignedInIdentity");
                    }
                    zwaVarJ = null;
                }
                rmo rmoVar = (rmo) obj4;
                rmoVar.a.edit().remove("incognito_visitor_id").apply();
                taf.g(((omj) rmoVar.b.io()).G(), new gpq(15));
                return zwaVarJ != null ? rmoVar.h((rlt) zwaVarJ) : rmoVar.j(false);
            case 11:
                rmo rmoVar2 = (rmo) this.a;
                if (rmoVar2.d) {
                    zvp.a(zvn.a, zvm.I, "Fail to fetch incognito previousSignedInIdentity");
                }
                rmoVar2.a.edit().remove("incognito_visitor_id").apply();
                taf.g(((omj) rmoVar2.b.io()).G(), new gpq(14));
                return rmoVar2.j(false);
            case 12:
                ((rpa) this.a).f.i("ERROR");
                zvp.e(zvn.b, zvm.I, "Failed to save offline account items", (Throwable) obj);
                return aher.a;
            case 13:
                rou rouVarA = ((rpa) this.a).a((affd) obj);
                return ahno.ar(rouVarA.d.i(), new rns(rouVarA, 2), rouVarA.a);
            case 14:
                Stream stream = Collection.EL.stream((List) obj);
                Object obj5 = this.a;
                return afxd.f(ahng.k((agke) stream.map(new rhk(obj5, 4)).collect(aghu.a))).g(new rmk(6), ((rpa) obj5).d);
            case 15:
                if (!((Boolean) obj).booleanValue()) {
                    return aher.a;
                }
                Object obj6 = this.a;
                return ahno.ao(new rno(obj6, 7), ((rrx) obj6).c);
            case 16:
                Throwable th5 = (Throwable) obj;
                Set set = uhc.a;
                th5.getClass();
                File file = (File) this.a;
                if (file.exists()) {
                    file.delete();
                }
                return ahng.m(th5);
            case 17:
                toe toeVar = (toe) obj;
                boolean z = toeVar instanceof toe;
                alps alpsVar = alps.a;
                if (z) {
                    Iterator it = (toeVar instanceof tyo ? (tyo) toeVar : new tyo(toeVar)).b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            aifv aifvVar = (aifv) it.next();
                            if (aifvVar.b.equals("type.googleapis.com/youtube.api.pfiinnertube.YoutubeApiInnertube.GetDynamicCreationAssetResponse")) {
                                optionalEmpty = Optional.ofNullable(((wjr) ((addn) ((aend) this.a).d).a.io()).D(aifvVar.c.G(), alpsVar));
                            }
                        } else {
                            optionalEmpty = Optional.empty();
                        }
                    }
                } else {
                    optionalEmpty = Optional.empty();
                }
                if (true == optionalEmpty.isPresent()) {
                    optionalEmpty = Optional.ofNullable(ahng.n((alps) optionalEmpty.get()));
                }
                return (ListenableFuture) (true != optionalEmpty.isPresent() ? ahng.m((Throwable) new hly(toeVar, 11).a) : optionalEmpty.get());
            case 18:
                if (!((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.TRUE);
                }
                final unn unnVarPeer = ((unj) this.a).peer();
                final vfb vfbVar = (vfb) unnVarPeer.e.b();
                if (vfbVar != null) {
                    tuk.l(unnVarPeer.b(), true);
                    final ukh ukhVarA = ((ShortsPlayerView) unnVarPeer.b.requireView().findViewById(R.id.shorts_edit_player_view)).a();
                    unf unfVarD = unnVarPeer.d();
                    final boolean z2 = unfVarD != null && unfVarD.c;
                    final boolean z3 = unfVarD != null && unfVarD.d;
                    return ape.f(new aqk() { // from class: unk
                        @Override // defpackage.aqk
                        public final Object a(aqi aqiVar) {
                            agke agkeVarQ;
                            unn unnVar;
                            ListenableFuture listenableFutureF;
                            ListenableFuture listenableFutureG;
                            List listF;
                            aufh aufhVar;
                            final vfb vfbVar2 = vfbVar;
                            unn unnVar2 = unnVarPeer;
                            unj unjVar = unnVar2.b;
                            vao vaoVar = unnVar2.j;
                            ulp ulpVar = unnVar2.d;
                            ulj uljVar = ulpVar.v;
                            boolean z4 = true;
                            byte[] bArr = null;
                            if (unn.i(unjVar, vaoVar)) {
                                Optional optionalH = vfbVar2.h();
                                if (true == optionalH.isPresent()) {
                                    auhs auhsVar = ((auij) optionalH.get()).d;
                                    if (auhsVar == null) {
                                        auhsVar = auhs.a;
                                    }
                                    optionalH = Optional.ofNullable(auhsVar);
                                }
                                auhs auhsVar2 = (auhs) optionalH.orElse(null);
                                if (auhsVar2 == null || auhsVar2.g.size() == 0) {
                                    listF = awno.a;
                                } else {
                                    Duration durationL = usj.l(auhsVar2);
                                    durationL.getClass();
                                    aufh aufhVar2 = aufh.a;
                                    aihf aihfVarCreateBuilder = aufhVar2.createBuilder();
                                    aihfVarCreateBuilder.getClass();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aufh aufhVar3 = (aufh) aihfVarCreateBuilder.instance;
                                    aufhVar3.c = 1;
                                    aufhVar3.b |= 1;
                                    aigu aiguVar = aikw.a;
                                    aiguVar.getClass();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aufh aufhVar4 = (aufh) aihfVarCreateBuilder.instance;
                                    aufhVar4.d = aiguVar;
                                    aufhVar4.b |= 2;
                                    aigu aiguVarU = aext.u(durationL);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aufh aufhVar5 = (aufh) aihfVarCreateBuilder.instance;
                                    aufhVar5.e = aiguVarU;
                                    aufhVar5.b |= 4;
                                    aihn aihnVarBuild = aihfVarCreateBuilder.build();
                                    aihnVarBuild.getClass();
                                    aufh aufhVar6 = (aufh) aihnVarBuild;
                                    awoa awoaVar = new awoa(10);
                                    for (aufd aufdVar : auhsVar2.g) {
                                        int i = aufdVar.e;
                                        if (i == 1000) {
                                            ajwo ajwoVar = (i == 1000 ? (auff) aufdVar.f : auff.a).c;
                                            if (ajwoVar == null) {
                                                ajwoVar = ajwo.a;
                                            }
                                            ajwoVar.getClass();
                                            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajfz.b);
                                            ajwoVar.c(aihlVarCheckIsLite);
                                            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajfz.b);
                                                ajwoVar.c(aihlVarCheckIsLite2);
                                                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                                                Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                                                objC.getClass();
                                                ajfz ajfzVar = (ajfz) objC;
                                                if ((aufdVar.b & 2) != 0) {
                                                    aufh aufhVar7 = aufdVar.h;
                                                    aufhVar = aufhVar7 == null ? aufhVar2 : aufhVar7;
                                                } else {
                                                    aufhVar = aufhVar6;
                                                }
                                                aufhVar.getClass();
                                                for (ajfy ajfyVar : ajfzVar.d) {
                                                    awoaVar.add(new vaa(ajfyVar.c, "", ajfyVar.d, ardj.EFFECT_SUBPACKAGE_ID_UNSPECIFIED, awnp.a, aufhVar));
                                                }
                                            }
                                        }
                                    }
                                    listF = awoaVar.f();
                                }
                                agkeVarQ = agke.n(listF);
                            } else {
                                z4 = true;
                                vaa vaaVarG = ulpVar.i.g();
                                agkeVarQ = vaaVarG != null ? agke.q(vaaVarG) : agpi.a;
                            }
                            final agke agkeVar = agkeVarQ;
                            ahey aheyVar = unnVar2.f;
                            final ukh ukhVar = ukhVarA;
                            int i2 = 9;
                            int i3 = 6;
                            if (!vfbVar2.f || z3) {
                                vxz vxzVar = vfbVar2.o;
                                unnVar = unnVar2;
                                if (!vxzVar.l(63, 45750808L, false) || !vfbVar2.t()) {
                                    z4 = false;
                                }
                                if (vxzVar.l(60, 45735895L, false) && vfbVar2.u() && !z4) {
                                    listenableFutureG = afxd.f(ahng.r(afwl.j(new tsp(vfbVar2, i2)), aheyVar)).g(new tvm(vfbVar2, ukhVar, 6, null), aheyVar).b(Exception.class, new vdm(vfbVar2, 2), aheyVar);
                                } else {
                                    qun qunVar = ((uld) uljVar.k()).q;
                                    if (qunVar == null) {
                                        listenableFutureF = ahng.m(new IllegalStateException("Trying to generate the thumbnail when the player is null."));
                                    } else {
                                        rdr rdrVar = (rdr) qunVar;
                                        rdrVar.I();
                                        rdrVar.G = null;
                                        rdi rdiVar = rdrVar.x;
                                        if (rdiVar != null) {
                                            rdiVar.f(new plj(rdiVar, rdrVar.r, 13, null));
                                        }
                                        qunVar.b();
                                        qunVar.f(ahbt.b(0L));
                                        rdrVar.I();
                                        rdrVar.B();
                                        if (rdrVar.B) {
                                            rdrVar.k.a();
                                            listenableFutureF = ahcs.f(rdrVar.f.a(rdk.d, new qoh(qunVar, 5)), new oly(4), MoreExecutors.directExecutor());
                                        } else {
                                            listenableFutureF = ahng.m(new IllegalStateException("Unable to initialize resource for creating thumbnail."));
                                        }
                                    }
                                    listenableFutureG = afxd.f(listenableFutureF).h(new rox(vfbVar2, z2, aheyVar, ukhVar, 2), aheyVar).h(new row(vfbVar2, aheyVar, 7, bArr), aheyVar).g(new agek() { // from class: vev
                                        @Override // defpackage.agek
                                        public final Object apply(Object obj7) {
                                            auhs auhsVar3;
                                            uxb uxbVar;
                                            Boolean bool;
                                            int i4;
                                            uxb uxbVar2;
                                            Boolean bool2 = (Boolean) obj7;
                                            boolean zBooleanValue = bool2.booleanValue();
                                            vfb vfbVar3 = vfbVar2;
                                            if (!zBooleanValue) {
                                                vfbVar3.p(ajtv.ERROR_LEVEL_ERROR, "saveStagingOutput failed to save image", null);
                                                return bool2;
                                            }
                                            Optional optionalH2 = vfbVar3.h();
                                            int i5 = 2;
                                            int i6 = 1;
                                            if (true == optionalH2.isPresent() && (((auij) optionalH2.get()).b & 2) == 0) {
                                                optionalH2 = Optional.empty();
                                            }
                                            if (true == optionalH2.isPresent()) {
                                                auhs auhsVar4 = ((auij) optionalH2.get()).d;
                                                if (auhsVar4 == null) {
                                                    auhsVar4 = auhs.a;
                                                }
                                                optionalH2 = Optional.ofNullable(auhsVar4);
                                            }
                                            auhs auhsVar5 = (auhs) optionalH2.orElse(null);
                                            agke agkeVar2 = agpi.a;
                                            uxb uxbVar3 = new uxb();
                                            aihf aihfVarCreateBuilder2 = akqy.a.createBuilder();
                                            if (auhsVar5 != null) {
                                                akqv akqvVarA = vfw.a.a(auhsVar5);
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                akqy akqyVar = (akqy) aihfVarCreateBuilder2.instance;
                                                akqvVarA.getClass();
                                                akqyVar.c = akqvVarA;
                                                akqyVar.b |= 1;
                                                Iterator it2 = auhsVar5.m.iterator();
                                                while (true) {
                                                    i4 = 13;
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    }
                                                    aufj aufjVar = (aufj) it2.next();
                                                    Long lValueOf = Long.valueOf(aufjVar.c);
                                                    auhs auhsVar6 = auhsVar5;
                                                    Long lValueOf2 = Long.valueOf(aufjVar.d);
                                                    aufd aufdVar2 = aufjVar.e;
                                                    if (aufdVar2 == null) {
                                                        aufdVar2 = aufd.a;
                                                    }
                                                    Optional optionalB = vfw.b(lValueOf, lValueOf2, aufdVar2);
                                                    aihfVarCreateBuilder2.getClass();
                                                    urh urhVar = new urh(aihfVarCreateBuilder2, i4);
                                                    if (true == optionalB.isPresent()) {
                                                        Object obj8 = optionalB.get();
                                                        aihf aihfVar = (aihf) urhVar.a;
                                                        aihfVar.copyOnWrite();
                                                        akqy akqyVar2 = (akqy) aihfVar.instance;
                                                        aiie aiieVar = akqyVar2.j;
                                                        if (!aiieVar.c()) {
                                                            akqyVar2.j = aihn.mutableCopy(aiieVar);
                                                        }
                                                        akqyVar2.j.add(obj8);
                                                    }
                                                    auhsVar5 = auhsVar6;
                                                }
                                                auhsVar3 = auhsVar5;
                                                for (augy augyVar : auhsVar3.d) {
                                                    for (aufd aufdVar3 : augyVar.u) {
                                                        aufh aufhVar8 = aufdVar3.h;
                                                        if (aufhVar8 == null) {
                                                            aufhVar8 = aufh.a;
                                                        }
                                                        int iAW = a.aW(aufhVar8.c);
                                                        if (iAW == 0) {
                                                            iAW = i6;
                                                        }
                                                        int i7 = iAW - 2;
                                                        i5 = i5;
                                                        if (i7 == i5) {
                                                            uxbVar2 = uxbVar3;
                                                            Optional optionalB2 = vfw.b(null, Long.valueOf(augyVar.e), aufdVar3);
                                                            aihfVarCreateBuilder2.getClass();
                                                            urh urhVar2 = new urh(aihfVarCreateBuilder2, i4);
                                                            if (true == optionalB2.isPresent()) {
                                                                Object obj9 = optionalB2.get();
                                                                aihf aihfVar2 = (aihf) urhVar2.a;
                                                                aihfVar2.copyOnWrite();
                                                                akqy akqyVar3 = (akqy) aihfVar2.instance;
                                                                aiie aiieVar2 = akqyVar3.j;
                                                                if (!aiieVar2.c()) {
                                                                    akqyVar3.j = aihn.mutableCopy(aiieVar2);
                                                                }
                                                                akqyVar3.j.add(obj9);
                                                            }
                                                        } else if (i7 == 3) {
                                                            uxbVar2 = uxbVar3;
                                                            Optional optionalB3 = vfw.b(Long.valueOf(augyVar.e), null, aufdVar3);
                                                            aihfVarCreateBuilder2.getClass();
                                                            urh urhVar3 = new urh(aihfVarCreateBuilder2, i4);
                                                            if (true == optionalB3.isPresent()) {
                                                                Object obj10 = optionalB3.get();
                                                                aihf aihfVar3 = (aihf) urhVar3.a;
                                                                aihfVar3.copyOnWrite();
                                                                akqy akqyVar4 = (akqy) aihfVar3.instance;
                                                                aiie aiieVar3 = akqyVar4.j;
                                                                if (!aiieVar3.c()) {
                                                                    akqyVar4.j = aihn.mutableCopy(aiieVar3);
                                                                }
                                                                akqyVar4.j.add(obj10);
                                                            }
                                                        }
                                                        uxbVar3 = uxbVar2;
                                                        i6 = 1;
                                                    }
                                                }
                                                uxbVar = uxbVar3;
                                                aufr aufrVar = (aufr) yno.gh(auhsVar3.f, aufr.b);
                                                if (aufrVar != null && aufrVar.c) {
                                                    aihf aihfVarCreateBuilder3 = akpj.a.createBuilder();
                                                    aihfVarCreateBuilder3.copyOnWrite();
                                                    akpj akpjVar = (akpj) aihfVarCreateBuilder3.instance;
                                                    akpjVar.b |= 1;
                                                    akpjVar.c = true;
                                                    aihfVarCreateBuilder2.copyOnWrite();
                                                    akqy akqyVar5 = (akqy) aihfVarCreateBuilder2.instance;
                                                    akpj akpjVar2 = (akpj) aihfVarCreateBuilder3.build();
                                                    akpjVar2.getClass();
                                                    akqyVar5.k = akpjVar2;
                                                    akqyVar5.b |= 32;
                                                }
                                            } else {
                                                auhsVar3 = auhsVar5;
                                                uxbVar = uxbVar3;
                                            }
                                            agke agkeVar3 = agkeVar;
                                            String str2 = "";
                                            if (agkeVar3 == null || agkeVar3.isEmpty()) {
                                                bool = bool2;
                                            } else {
                                                agir agirVar = agir.a;
                                                aihf aihfVarCreateBuilder4 = akrd.a.createBuilder();
                                                Iterator it3 = agkeVar3.iterator();
                                                while (it3.hasNext()) {
                                                    vaa vaaVar = (vaa) it3.next();
                                                    agke agkeVarC = agirVar.c(vaaVar);
                                                    String str3 = vaaVar.d;
                                                    if (!str3.equals("")) {
                                                        aihf aihfVarCreateBuilder5 = akrb.a.createBuilder();
                                                        aihfVarCreateBuilder5.copyOnWrite();
                                                        akrb akrbVar = (akrb) aihfVarCreateBuilder5.instance;
                                                        str3.getClass();
                                                        akrbVar.b |= 2;
                                                        akrbVar.d = str3;
                                                        aihfVarCreateBuilder5.copyOnWrite();
                                                        akrb akrbVar2 = (akrb) aihfVarCreateBuilder5.instance;
                                                        aiie aiieVar4 = akrbVar2.e;
                                                        if (!aiieVar4.c()) {
                                                            akrbVar2.e = aihn.mutableCopy(aiieVar4);
                                                        }
                                                        aifs.addAll(agkeVarC, akrbVar2.e);
                                                        if (!str3.equals("unpublished_effect_logging_id")) {
                                                            String str4 = vaaVar.b;
                                                            aihfVarCreateBuilder5.copyOnWrite();
                                                            akrb akrbVar3 = (akrb) aihfVarCreateBuilder5.instance;
                                                            str4.getClass();
                                                            akrbVar3.b |= 1;
                                                            akrbVar3.c = str4;
                                                        }
                                                        aufh aufhVar9 = vaaVar.e;
                                                        int i8 = aufhVar9.b;
                                                        if ((i8 & 2) != 0 && (i8 & 4) != 0) {
                                                            aihf aihfVarCreateBuilder6 = akra.a.createBuilder();
                                                            aigu aiguVar2 = aufhVar9.d;
                                                            if (aiguVar2 == null) {
                                                                aiguVar2 = aigu.a;
                                                            }
                                                            long jB = aikw.b(aiguVar2);
                                                            aihfVarCreateBuilder6.copyOnWrite();
                                                            akra akraVar = (akra) aihfVarCreateBuilder6.instance;
                                                            akraVar.b |= 1;
                                                            akraVar.c = jB;
                                                            aigu aiguVar3 = aufhVar9.d;
                                                            if (aiguVar3 == null) {
                                                                aiguVar3 = aigu.a;
                                                            }
                                                            aigu aiguVar4 = aufhVar9.e;
                                                            if (aiguVar4 == null) {
                                                                aiguVar4 = aigu.a;
                                                            }
                                                            aigu aiguVarA = vfw.a(aiguVar3, aiguVar4);
                                                            aihfVarCreateBuilder6.copyOnWrite();
                                                            akra akraVar2 = (akra) aihfVarCreateBuilder6.instance;
                                                            aiguVarA.getClass();
                                                            akraVar2.d = aiguVarA;
                                                            akraVar2.b |= 2;
                                                            akra akraVar3 = (akra) aihfVarCreateBuilder6.build();
                                                            aihfVarCreateBuilder5.copyOnWrite();
                                                            akrb akrbVar4 = (akrb) aihfVarCreateBuilder5.instance;
                                                            akraVar3.getClass();
                                                            akrbVar4.f = akraVar3;
                                                            akrbVar4.b |= 32;
                                                        }
                                                        aihfVarCreateBuilder4.copyOnWrite();
                                                        akrd akrdVar = (akrd) aihfVarCreateBuilder4.instance;
                                                        akrb akrbVar5 = (akrb) aihfVarCreateBuilder5.build();
                                                        akrbVar5.getClass();
                                                        aiie aiieVar5 = akrdVar.d;
                                                        if (!aiieVar5.c()) {
                                                            akrdVar.d = aihn.mutableCopy(aiieVar5);
                                                        }
                                                        akrdVar.d.add(akrbVar5);
                                                    } else if ((((akrd) aihfVarCreateBuilder4.instance).b & 1) == 0) {
                                                        aihf aihfVarCreateBuilder7 = akrc.a.createBuilder();
                                                        aihf aihfVarCreateBuilder8 = akre.a.createBuilder();
                                                        String str5 = vaaVar.b;
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        akre akreVar = (akre) aihfVarCreateBuilder8.instance;
                                                        str5.getClass();
                                                        akreVar.b |= 2;
                                                        akreVar.d = str5;
                                                        String str6 = vaaVar.c;
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        akre akreVar2 = (akre) aihfVarCreateBuilder8.instance;
                                                        str6.getClass();
                                                        akreVar2.b |= 1;
                                                        akreVar2.c = str6;
                                                        aihfVarCreateBuilder8.copyOnWrite();
                                                        akre akreVar3 = (akre) aihfVarCreateBuilder8.instance;
                                                        akreVar3.b |= 4;
                                                        akreVar3.e = "SHORTS_PRESETS";
                                                        akre akreVar4 = (akre) aihfVarCreateBuilder8.build();
                                                        aihfVarCreateBuilder7.copyOnWrite();
                                                        akrc akrcVar = (akrc) aihfVarCreateBuilder7.instance;
                                                        akreVar4.getClass();
                                                        akrcVar.c = akreVar4;
                                                        akrcVar.b |= 1;
                                                        aihfVarCreateBuilder7.copyOnWrite();
                                                        akrc akrcVar2 = (akrc) aihfVarCreateBuilder7.instance;
                                                        akrcVar2.b |= 2;
                                                        akrcVar2.d = 1.0d;
                                                        aihfVarCreateBuilder4.copyOnWrite();
                                                        akrd akrdVar2 = (akrd) aihfVarCreateBuilder4.instance;
                                                        akrc akrcVar3 = (akrc) aihfVarCreateBuilder7.build();
                                                        akrcVar3.getClass();
                                                        akrdVar2.c = akrcVar3;
                                                        akrdVar2.b |= 1;
                                                    }
                                                    agirVar = agirVar;
                                                    bool2 = bool2;
                                                    it3 = it3;
                                                }
                                                bool = bool2;
                                                akrd akrdVar3 = (akrd) aihfVarCreateBuilder4.build();
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                akqy akqyVar6 = (akqy) aihfVarCreateBuilder2.instance;
                                                akrdVar3.getClass();
                                                akqyVar6.d = akrdVar3;
                                                akqyVar6.b |= 2;
                                            }
                                            int i9 = ((agpi) agkeVar2).d;
                                            int i10 = 0;
                                            while (i10 < i9) {
                                                auip auipVar = (auip) agkeVar2.get(i10);
                                                aihf aihfVarCreateBuilder9 = akqx.a.createBuilder();
                                                aihf aihfVarCreateBuilder10 = arcw.a.createBuilder();
                                                auin auinVar = auipVar.d;
                                                if (auinVar == null) {
                                                    auinVar = auin.a;
                                                }
                                                String str7 = str2;
                                                long j = auinVar.c;
                                                aihfVarCreateBuilder10.copyOnWrite();
                                                arcw arcwVar = (arcw) aihfVarCreateBuilder10.instance;
                                                arcwVar.b |= 1;
                                                arcwVar.c = j;
                                                auin auinVar2 = auipVar.d;
                                                if (auinVar2 == null) {
                                                    auinVar2 = auin.a;
                                                }
                                                aigu aiguVarC = aikw.c(auinVar2.d);
                                                aihfVarCreateBuilder10.copyOnWrite();
                                                arcw arcwVar2 = (arcw) aihfVarCreateBuilder10.instance;
                                                aiguVarC.getClass();
                                                arcwVar2.d = aiguVarC;
                                                arcwVar2.b |= 2;
                                                arcw arcwVar3 = (arcw) aihfVarCreateBuilder10.build();
                                                aihfVarCreateBuilder9.copyOnWrite();
                                                akqx akqxVar = (akqx) aihfVarCreateBuilder9.instance;
                                                arcwVar3.getClass();
                                                akqxVar.c = arcwVar3;
                                                akqxVar.b |= 1;
                                                akqx akqxVar2 = (akqx) aihfVarCreateBuilder9.build();
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                akqy akqyVar7 = (akqy) aihfVarCreateBuilder2.instance;
                                                akqxVar2.getClass();
                                                aiie aiieVar6 = akqyVar7.e;
                                                if (!aiieVar6.c()) {
                                                    akqyVar7.e = aihn.mutableCopy(aiieVar6);
                                                }
                                                akqyVar7.e.add(akqxVar2);
                                                i10++;
                                                str2 = str7;
                                            }
                                            String str8 = str2;
                                            agkj agkjVarH = agpn.b;
                                            if (auhsVar3 != null) {
                                                HashMap map = new HashMap();
                                                Collection.EL.stream(auhsVar3.d).filter(new uvm(5)).forEach(new usf(map, 14));
                                                agkjVarH = agkj.h(map);
                                            }
                                            int i11 = 0;
                                            while (i11 < i9) {
                                                auim auimVar = (auim) agkeVar2.get(i11);
                                                aihf aihfVarCreateBuilder11 = akqw.a.createBuilder();
                                                aihf aihfVarCreateBuilder12 = arcw.a.createBuilder();
                                                auin auinVar3 = auimVar.e;
                                                if (auinVar3 == null) {
                                                    auinVar3 = auin.a;
                                                }
                                                long j2 = auinVar3.c;
                                                aihfVarCreateBuilder12.copyOnWrite();
                                                arcw arcwVar4 = (arcw) aihfVarCreateBuilder12.instance;
                                                arcwVar4.b |= 1;
                                                arcwVar4.c = j2;
                                                auin auinVar4 = auimVar.e;
                                                if (auinVar4 == null) {
                                                    auinVar4 = auin.a;
                                                }
                                                aigu aiguVarC2 = aikw.c(auinVar4.d);
                                                aihfVarCreateBuilder12.copyOnWrite();
                                                arcw arcwVar5 = (arcw) aihfVarCreateBuilder12.instance;
                                                aiguVarC2.getClass();
                                                arcwVar5.d = aiguVarC2;
                                                arcwVar5.b |= 2;
                                                arcw arcwVar6 = (arcw) aihfVarCreateBuilder12.build();
                                                aihfVarCreateBuilder11.copyOnWrite();
                                                akqw akqwVar = (akqw) aihfVarCreateBuilder11.instance;
                                                arcwVar6.getClass();
                                                akqwVar.c = arcwVar6;
                                                akqwVar.b |= 1;
                                                String str9 = auimVar.f;
                                                aihfVarCreateBuilder11.copyOnWrite();
                                                akqw akqwVar2 = (akqw) aihfVarCreateBuilder11.instance;
                                                str9.getClass();
                                                akqwVar2.b |= 2;
                                                akqwVar2.d = str9;
                                                Long lValueOf3 = Long.valueOf(auimVar.c);
                                                String str10 = str8;
                                                String str11 = (String) agkjVarH.getOrDefault(lValueOf3, str10);
                                                aihfVarCreateBuilder11.copyOnWrite();
                                                akqw akqwVar3 = (akqw) aihfVarCreateBuilder11.instance;
                                                str11.getClass();
                                                akqwVar3.b |= 4;
                                                akqwVar3.e = str11;
                                                akqw akqwVar4 = (akqw) aihfVarCreateBuilder11.build();
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                akqy akqyVar8 = (akqy) aihfVarCreateBuilder2.instance;
                                                akqwVar4.getClass();
                                                aiie aiieVar7 = akqyVar8.g;
                                                if (!aiieVar7.c()) {
                                                    akqyVar8.g = aihn.mutableCopy(aiieVar7);
                                                }
                                                akqyVar8.g.add(akqwVar4);
                                                i11++;
                                                str8 = str10;
                                            }
                                            if (((akqy) aihfVarCreateBuilder2.instance).e.size() > 0) {
                                                float fA = uxbVar.a(arfu.VOLUME_TYPE_VOICEOVER);
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                akqy akqyVar9 = (akqy) aihfVarCreateBuilder2.instance;
                                                akqyVar9.b |= 4;
                                                akqyVar9.f = fA;
                                            }
                                            if (((akqy) aihfVarCreateBuilder2.instance).g.size() > 0) {
                                                float fA2 = uxbVar.a(arfu.VOLUME_TYPE_TEXT_TO_SPEECH);
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                akqy akqyVar10 = (akqy) aihfVarCreateBuilder2.instance;
                                                akqyVar10.b |= 8;
                                                akqyVar10.h = fA2;
                                            }
                                            if (!agkeVar2.isEmpty()) {
                                                float fA3 = uxbVar.a(arfu.VOLUME_TYPE_VISUAL_REMIX);
                                                aihfVarCreateBuilder2.copyOnWrite();
                                                akqy akqyVar11 = (akqy) aihfVarCreateBuilder2.instance;
                                                akqyVar11.b |= 16;
                                                akqyVar11.i = fA3;
                                            }
                                            vfbVar3.n = new vfa((akqy) aihfVarCreateBuilder2.build(), ukhVar, vfbVar3.b);
                                            return bool;
                                        }
                                    }, aheyVar);
                                }
                            } else {
                                vfbVar2.p(ajtv.ERROR_LEVEL_WARNING, "ImageProjectState: saveStagingOutput called for animated image without allowExportAnimatedImageFirstFrame. May still save repositioned image.", null);
                                if (vfbVar2.y()) {
                                    qtt qttVar = vfbVar2.c;
                                    listenableFutureG = qttVar == null ? ahng.n(Boolean.FALSE) : afxd.f(aheyVar.submit(afwl.j(new tsn(vfbVar2, qttVar, i3)))).h(new row(vfbVar2, aheyVar, i3, bArr), aheyVar).g(new tvm(vfbVar2, ukhVar, 7, null), aheyVar);
                                } else {
                                    Bitmap bitmap = vfbVar2.j;
                                    listenableFutureG = bitmap == null ? ahng.n(Boolean.FALSE) : afxd.f(vfbVar2.e(bitmap, aheyVar, vfbVar2.m())).g(new tvm(vfbVar2, ukhVar, 8, null), aheyVar);
                                }
                                unnVar = unnVar2;
                            }
                            unn unnVar3 = unnVar;
                            taf.k(unjVar, listenableFutureG, new svm(unnVar3, aqiVar, 10), new svm(unnVar3, aqiVar, i2));
                            return "ImageEditorFragmentPeer.saveStagingEdits";
                        }
                    });
                }
                zvl zvlVar = unnVarPeer.g;
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 70;
                zvjVarA.i = 75;
                zvjVarA.d("ImageProjectState is unexpectedly null when saving temp edits");
                zvlVar.a(zvjVarA.a());
                return ahng.m(new IllegalStateException("ImageProjectState is unexpectedly null when saving temp edits"));
            case 19:
                return a.k(this.a, obj);
            default:
                return a.k(this.a, obj);
        }
    }
}

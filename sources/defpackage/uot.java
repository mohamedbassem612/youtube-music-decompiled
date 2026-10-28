package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uot implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ uot(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
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
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v20, types: [auht, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v66, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [auht, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String path;
        int i;
        int i2 = 2;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                return ((View) this.a).requireViewById(((Integer) obj).intValue());
            case 1:
                aihf aihfVarCreateBuilder = asct.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                aihn aihnVarBuild = aihfVarCreateBuilder.build();
                aihnVarBuild.getClass();
                gif gifVar = (gif) ((qcb) ((aaok) this.a).b).a;
                gjx gjxVar = gifVar.c;
                asct asctVar = (asct) aihnVarBuild;
                aend aendVar = (aend) gjxVar.bO.io();
                ght ghtVar = gifVar.a;
                Executor executor = (Executor) ghtVar.u.io();
                zvl zvlVar = (zvl) ghtVar.dO.io();
                gkg gkgVar = gjxVar.cl;
                ght ghtVar2 = gkgVar.b;
                aend aendVar2 = new aend((abxv) ghtVar2.gK.io(), (wlp) ghtVar2.kE.io(), (tgg) ghtVar2.zQ.io(), (zwh) gkgVar.c.io());
                ght ghtVar3 = gjxVar.a;
                xsc xscVar = new xsc(aendVar2, (Executor) ghtVar3.u.io(), (awut) gjxVar.bQ.io());
                Context context = (Context) ghtVar.v.io();
                vxe vxeVar = (vxe) gifVar.d.i.io();
                tfq tfqVar = (tfq) ghtVar.cd.io();
                roq roqVar = (roq) gjxVar.af.io();
                xit xitVar = (xit) ghtVar.fa.io();
                zf zfVar = (zf) gifVar.b.an.io();
                Context context2 = (Context) ghtVar3.v.io();
                ghx ghxVar = ghtVar3.a;
                xte xteVar = new xte(context2, (ssr) ghxVar.iU.io(), ghxVar.cq(), (awut) ghtVar3.bm.io(), (aaok) ghxVar.iz.io(), aupm.b(gjxVar.bS), (zvl) ghtVar3.dO.io());
                Context context3 = (Context) ghtVar3.v.io();
                bec becVar = (bec) gkgVar.ao.io();
                awou awouVar = (awou) ghtVar2.bl.io();
                becVar.getClass();
                awouVar.getClass();
                return new vcl(asctVar, aendVar, executor, zvlVar, xscVar, context, vxeVar, tfqVar, roqVar, xitVar, zfVar, xteVar, new vcp(context3, azu.f(becVar, awouVar), (ahbw) ghtVar3.cx.io(), ghxVar.cw(), (Executor) ghtVar3.z.io(), (Executor) ghtVar3.T.io()));
            case 2:
                augy augyVar = (augy) obj;
                agrf agrfVar = uql.a;
                if (augyVar.c != 110) {
                    return new uxk(augyVar);
                }
                aimy aimyVar = augyVar.q;
                if (aimyVar == null) {
                    aimyVar = aimy.a;
                }
                return new uxk(augyVar, Optional.of(aimyVar), Optional.of((augj) yno.gx(this.a, augj.b)));
            case 3:
                Object obj2 = this.a;
                agrf agrfVar2 = usj.a;
                aufa aufaVar = (aufa) usj.m((auhs) obj2, ((augo) obj).b).orElse(null);
                if (aufaVar == null) {
                    return null;
                }
                Uri uri = Uri.parse((aufaVar.c == 100 ? (aufb) aufaVar.d : aufb.a).c);
                if (uri == null || !tyu.f(uri) || (path = uri.getPath()) == null) {
                    return null;
                }
                aihf aihfVarCreateBuilder2 = auip.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                auip auipVar = (auip) aihfVarCreateBuilder2.instance;
                auipVar.b |= 1;
                auipVar.c = path;
                auin auinVarK = usj.k(aufaVar);
                aihfVarCreateBuilder2.copyOnWrite();
                auip auipVar2 = (auip) aihfVarCreateBuilder2.instance;
                auinVarK.getClass();
                auipVar2.d = auinVarK;
                auipVar2.b |= 2;
                aufu aufuVar = (aufu) yno.gh(aufaVar.k, aufu.b);
                if (aufuVar != null && (aufuVar.c & 1) != 0) {
                    alcv alcvVar = aufuVar.d;
                    if (alcvVar == null) {
                        alcvVar = alcv.a;
                    }
                    aihfVarCreateBuilder2.copyOnWrite();
                    auip auipVar3 = (auip) aihfVarCreateBuilder2.instance;
                    alcvVar.getClass();
                    auipVar3.e = alcvVar;
                    auipVar3.b |= 4;
                }
                return (auip) aihfVarCreateBuilder2.build();
            case 4:
                Object obj3 = this.a;
                agrf agrfVar3 = usj.a;
                return usj.m((auhs) obj3, ((Long) obj).longValue()).stream();
            case 5:
                return new File(((usk) this.a).a, (String) obj);
            case 6:
                augj augjVar = (augj) obj;
                jrq jrqVar = (jrq) augjVar.toBuilder();
                jrqVar.copyOnWrite();
                ((augj) jrqVar.instance).c = augj.emptyProtobufList();
                Stream stream = Collection.EL.stream(augjVar.c);
                Object obj4 = this.a;
                jrqVar.i((Iterable) stream.filter(new uso(obj4, 7)).collect(aghu.a));
                jrr jrrVar = (jrr) augi.a.createBuilder();
                jrrVar.copyOnWrite();
                augi augiVar = (augi) jrrVar.instance;
                augiVar.b |= 1;
                uts utsVar = (uts) obj4;
                augiVar.c = utsVar.a;
                jrrVar.copyOnWrite();
                augi augiVar2 = (augi) jrrVar.instance;
                String str = utsVar.b;
                str.getClass();
                augiVar2.b |= 4;
                augiVar2.e = str;
                jrrVar.copyOnWrite();
                augi augiVar3 = (augi) jrrVar.instance;
                augiVar3.b |= 2;
                augiVar3.d = utsVar.c;
                jrrVar.copyOnWrite();
                augi augiVar4 = (augi) jrrVar.instance;
                augiVar4.f = utsVar.f - 1;
                augiVar4.b |= 8;
                jrrVar.copyOnWrite();
                augi augiVar5 = (augi) jrrVar.instance;
                augiVar5.g = utsVar.g - 1;
                augiVar5.b |= 16;
                jrrVar.copyOnWrite();
                augi augiVar6 = (augi) jrrVar.instance;
                String str2 = utsVar.d;
                str2.getClass();
                augiVar6.b |= 32;
                augiVar6.h = str2;
                jrrVar.copyOnWrite();
                augi augiVar7 = (augi) jrrVar.instance;
                augiVar7.i = utsVar.h - 1;
                augiVar7.b |= 64;
                jrrVar.g(utsVar.e);
                augi augiVar8 = (augi) jrrVar.build();
                jrqVar.copyOnWrite();
                augj augjVar2 = (augj) jrqVar.instance;
                augiVar8.getClass();
                augjVar2.a();
                augjVar2.c.add(augiVar8);
                return (augj) jrqVar.build();
            case 7:
                return utc.a((utc) obj, ((uuc) this.a).a ? Float.valueOf(0.3f) : null, null, 5);
            case 8:
                return utc.a((utc) obj, ((uui) this.a).a, null, 5);
            case 9:
                return ((uur) this.a).a;
            case 10:
                return ((uur) this.a).a;
            case 11:
                return (yno) this.a.getValue();
            case 12:
                return this.a.invoke(obj);
            case 13:
                return this.a.invoke(obj);
            case 14:
                augy augyVar2 = (augy) obj;
                akqu akquVar = (akqu) vfi.a.apply(augyVar2);
                if (augyVar2.c != 110) {
                    return akquVar;
                }
                Optional optionalFindFirst = Collection.EL.stream(((augj) yno.gx(this.a, augj.b)).c).filter(new uqr(augyVar2.e, i2)).findFirst();
                wap wapVar = new wap(akquVar, augyVar2, i3);
                if (true == optionalFindFirst.isPresent()) {
                    Object obj5 = optionalFindFirst.get();
                    Object obj6 = wapVar.a;
                    Object obj7 = wapVar.b;
                    augi augiVar9 = (augi) obj5;
                    akqs akqsVar = ((akqu) obj6).c;
                    if (akqsVar == null) {
                        akqsVar = akqs.a;
                    }
                    akql akqlVar = akqsVar.b == 1 ? (akql) akqsVar.c : akql.a;
                    aihf builder = ((aihn) obj6).toBuilder();
                    aihf builder2 = akqsVar.toBuilder();
                    aihf builder3 = akqlVar.toBuilder();
                    String str3 = augiVar9.h;
                    builder3.copyOnWrite();
                    akql akqlVar2 = (akql) builder3.instance;
                    str3.getClass();
                    akqlVar2.b |= 1;
                    akqlVar2.c = str3;
                    int iBc = a.bc(augiVar9.g);
                    if (iBc == 0) {
                        iBc = 1;
                    }
                    builder3.copyOnWrite();
                    akql akqlVar3 = (akql) builder3.instance;
                    akqlVar3.h = iBc - 1;
                    akqlVar3.b |= 32;
                    int iBc2 = a.bc(augiVar9.g);
                    if (iBc2 == 0 || iBc2 != 3) {
                        augy augyVar3 = (augy) obj7;
                        i = (augyVar3.c == 110 ? (auhb) augyVar3.d : auhb.a).e;
                    } else {
                        augy augyVar4 = (augy) obj7;
                        i = (augyVar4.c == 110 ? (auhb) augyVar4.d : auhb.a).f;
                    }
                    akqk akqkVarA = vfo.a(i);
                    builder3.copyOnWrite();
                    akql akqlVar4 = (akql) builder3.instance;
                    akqkVarA.getClass();
                    akqlVar4.e = akqkVarA;
                    akqlVar4.b |= 4;
                    String str4 = augiVar9.e;
                    builder3.copyOnWrite();
                    akql akqlVar5 = (akql) builder3.instance;
                    str4.getClass();
                    akqlVar5.b |= 64;
                    akqlVar5.i = str4;
                    int iAV = a.aV(augiVar9.i);
                    if (iAV == 0) {
                        iAV = 1;
                    }
                    builder3.copyOnWrite();
                    akql akqlVar6 = (akql) builder3.instance;
                    akqlVar6.j = iAV - 1;
                    akqlVar6.b |= SemanticState.Focused;
                    akql akqlVar7 = (akql) builder3.build();
                    builder2.copyOnWrite();
                    akqs akqsVar2 = (akqs) builder2.instance;
                    akqlVar7.getClass();
                    akqsVar2.c = akqlVar7;
                    akqsVar2.b = 1;
                    akqs akqsVar3 = (akqs) builder2.build();
                    builder.copyOnWrite();
                    akqu akquVar2 = (akqu) builder.instance;
                    akqsVar3.getClass();
                    akquVar2.c = akqsVar3;
                    akquVar2.b |= 2;
                    optionalFindFirst = Optional.ofNullable((akqu) builder.build());
                }
                return (akqu) optionalFindFirst.orElse(akquVar);
            case 15:
                auhh auhhVar = (auhh) obj;
                String str5 = vjq.h;
                if (auhhVar.c != 5) {
                    return auhhVar;
                }
                Object obj8 = this.a;
                aihf builder4 = auhhVar.toBuilder();
                aihf aihfVarCreateBuilder3 = auhe.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                auhe auheVar = (auhe) aihfVarCreateBuilder3.instance;
                obj8.getClass();
                auheVar.b |= 1;
                auheVar.c = (String) obj8;
                builder4.copyOnWrite();
                auhh auhhVar2 = (auhh) builder4.instance;
                auhe auheVar2 = (auhe) aihfVarCreateBuilder3.build();
                auheVar2.getClass();
                auhhVar2.d = auheVar2;
                auhhVar2.c = 5;
                return (auhh) builder4.build();
            case 16:
                augy augyVar5 = (augy) obj;
                if (augyVar5.c != 103) {
                    if (!yno.ff(augyVar5)) {
                        return augyVar5;
                    }
                    auhv auhvVar = augyVar5.c == 107 ? (auhv) augyVar5.d : auhv.a;
                    if ((auhvVar.c == 2 ? (auih) auhvVar.d : auih.a).c == 10) {
                        return augyVar5;
                    }
                    auhv auhvVar2 = augyVar5.c == 107 ? (auhv) augyVar5.d : auhv.a;
                    if ((auhvVar2.c == 2 ? (auih) auhvVar2.d : auih.a).c == 9) {
                        return augyVar5;
                    }
                }
                aigu aiguVar = augyVar5.i;
                if (aiguVar == null) {
                    aiguVar = aigu.a;
                }
                Object obj9 = this.a;
                aigu aiguVar2 = aikw.a;
                if (aiguVar.equals(aiguVar2)) {
                    aigu aiguVar3 = augyVar5.j;
                    if (aiguVar3 == null) {
                        aiguVar3 = aigu.a;
                    }
                    if (aiguVar3.equals(ahng.au((Duration) obj9))) {
                        return augyVar5;
                    }
                }
                jrr jrrVar2 = (jrr) augyVar5.toBuilder();
                jrrVar2.copyOnWrite();
                augy augyVar6 = (augy) jrrVar2.instance;
                aiguVar2.getClass();
                augyVar6.i = aiguVar2;
                augyVar6.b |= 16;
                aigu aiguVarAu = ahng.au((Duration) obj9);
                jrrVar2.copyOnWrite();
                augy augyVar7 = (augy) jrrVar2.instance;
                aiguVarAu.getClass();
                augyVar7.j = aiguVarAu;
                augyVar7.b |= 32;
                return (augy) jrrVar2.build();
            case 17:
                return (auga) ((Optional) this.a).orElse(auga.a);
            case 18:
                return ((vrj) this.a).a((apji) obj);
            case 19:
                return new aeiv((ek) ((xpl) this.a).a, (String) obj);
            default:
                String str6 = (String) obj;
                return str6 + '.' + ((String) this.a.get(str6));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
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
        return Function$CC.$default$compose(this, function);
    }
}

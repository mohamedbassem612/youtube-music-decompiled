package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wci implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wci(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, wmd] */
    /* JADX WARN: Type inference failed for: r9v53, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v55, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v61, types: [java.lang.Object, java.util.concurrent.Future] */
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
    @Override // java.util.concurrent.Callable
    public final Object call() throws jxr, jye, IOException {
        int i = 5;
        int i2 = 4;
        switch (this.$cid) {
            case 0:
                return ((wck) this.a).b.h(this.b);
            case 1:
                wck wckVar = (wck) this.a;
                Map map = wckVar.c;
                Object obj = this.b;
                awly awlyVarQ = wck.q(map, obj);
                awly awlyVarAz = awlu.au().az();
                return awlyVarAz.V(wckVar.b.g((String) obj)).v(new vtu(awlyVarQ.af(new vva(new hho((Object) awlyVarAz, 8, (char[][]) null), 11)), i2)).H();
            case 2:
                wck wckVar2 = (wck) this.a;
                Map map2 = wckVar2.c;
                Object obj2 = this.b;
                int i3 = 12;
                avlr avlrVarK = wck.q(map2, obj2).K(new ugm(new uhd(14), i3));
                awly awlyVarAz2 = awlu.au().az();
                return awlyVarAz2.V(agev.h(wckVar2.b.c((String) obj2))).v(new vtu(avlrVarK.af(new vva(new hho((Object) awlyVarAz2, 9, (char[][]) null), i3)), i));
            case 3:
                return ((wck) this.a).b.c((String) this.b);
            case 4:
                ?? r0 = this.b;
                Object obj3 = this.a;
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    try {
                        ((wks) it.next()).d(obj3);
                    } catch (Throwable th) {
                        zvp.b(zvn.b, zvm.e, "Error in Decorator.seriallyDecorate()", th);
                    }
                }
                return new ulo(17);
            case 5:
                Iterator it2 = this.b.iterator();
                while (true) {
                    Object obj4 = this.a;
                    if (!it2.hasNext()) {
                        return obj4;
                    }
                    try {
                        a$$ExternalSyntheticApiModelOutline0.m7m(ahng.v((ListenableFuture) it2.next())).r(obj4);
                    } catch (Throwable th2) {
                        zvp.b(zvn.b, zvm.e, "Error in Decorator.combiner()", th2);
                    }
                }
                break;
            case 6:
                return this.b.d((wmc) this.a);
            case 7:
                aihf aihfVarCreateBuilder = InnertubeContext$InnerTubeContext.a.createBuilder();
                ?? r1 = this.b;
                Object obj5 = this.a;
                Iterator it3 = r1.iterator();
                while (it3.hasNext()) {
                    try {
                        ((wmd) it3.next()).h(aihfVarCreateBuilder, ((wmc) obj5).b);
                    } catch (Throwable th3) {
                        zvp.b(zvn.b, zvm.e, "Error in RequestContextDecorator.seriallyDecorate()", th3);
                    }
                }
                return (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder.build();
            case 8:
                Iterator it4 = this.b.iterator();
                while (true) {
                    Object obj6 = this.a;
                    if (!it4.hasNext()) {
                        return obj6;
                    }
                    try {
                        ((aihf) obj6).mergeFrom((aihn) ahng.v((ListenableFuture) it4.next()));
                    } catch (Throwable th4) {
                        zvp.b(zvn.b, zvm.e, "Error in RequestContextDecorator.combiner()", th4);
                    }
                }
                break;
            case 9:
                Object obj7 = this.b;
                Object obj8 = this.a;
                return ((avlh) ((abzo) obj8).j).L((avmb) obj7).ak(new xbo(obj8, i));
            case 10:
                Object obj9 = this.b;
                xot xotVar = (xot) this.a;
                xos xosVar = new xos(xotVar, (String) obj9);
                xotVar.f.c(xosVar, true);
                return xosVar;
            case 11:
                if (((xyk) this.b).b.a(((tge) this.a).a()).a == 200) {
                    return null;
                }
                agrx agrxVar = agso.a;
                return null;
            case 12:
                xns xnsVar = ((yaz) this.b).o;
                xvn xvnVar = (xvn) this.a;
                return xnsVar.a(xvnVar.a, xvnVar.p());
            case 13:
                ydn ydnVar = (ydn) this.a;
                if (ydnVar.s == null) {
                    ydnVar.s = new kyr(ydnVar.j, (byte[]) null);
                }
                ydnVar.s.o(new Account((String) this.b, "com.google"), "https://accounts.google.com");
                return null;
            case 14:
                yyv yyvVar = (yyv) this.a;
                yye yyeVar = yyvVar.h;
                return Boolean.valueOf(yyvVar.t.r(yyeVar.l, (zcf) this.b, yyeVar.i, true));
            case 15:
                byte[] bytes = ((String) this.b).getBytes(StandardCharsets.UTF_8);
                zfj zfjVar = (zfj) this.a;
                zfr zfrVar = (zfr) zfjVar.c.io();
                mbc mbcVar = zfjVar.d;
                long epochMilli = mbcVar.f().toEpochMilli();
                zjr zjrVar = zfjVar.b;
                int iAS = a.aS(zjrVar.aa().h);
                int i4 = iAS != 0 ? iAS : 1;
                apbm apbmVarAa = zjrVar.aa();
                xir xirVar = zfjVar.e;
                zfp zfpVarA = zfrVar.a(bytes, zik.aF(i4), apbmVarAa, xirVar);
                long epochMilli2 = mbcVar.f().toEpochMilli();
                if (zfpVarA.a()) {
                    return zfpVarA;
                }
                xirVar.g(tau.PROOF_OF_ORIGIN_TOKEN_MINT_STARTED, epochMilli);
                xirVar.g(tau.PROOF_OF_ORIGIN_TOKEN_MINT_FINISHED, epochMilli2);
                return zfpVarA;
            case 16:
                aaai aaaiVar = (aaai) this.b;
                aode aodeVar = ((vyo) aaaiVar.c).b().p;
                if (aodeVar == null) {
                    aodeVar = aode.a;
                }
                if (!aodeVar.g) {
                    return InnertubeContext$InnerTubeContext.getDefaultInstance();
                }
                Object obj10 = this.a;
                aihf aihfVarCreateBuilder2 = aocf.a.createBuilder();
                hld hldVar = (hld) obj10;
                int i5 = true != hldVar.c((Context) aaaiVar.b) ? 3 : 2;
                aihfVarCreateBuilder2.copyOnWrite();
                aocf aocfVar = (aocf) aihfVarCreateBuilder2.instance;
                aocfVar.c = i5 - 1;
                aocfVar.b |= 1;
                long jA = hldVar.a();
                if (jA > 0) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    aocf aocfVar2 = (aocf) aihfVarCreateBuilder2.instance;
                    aocfVar2.b |= 2;
                    aocfVar2.d = jA;
                }
                aihf aihfVarCreateBuilder3 = InnertubeContext$InnerTubeContext.a.createBuilder();
                aihf aihfVarCreateBuilder4 = InnertubeContext$ClientInfo.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) aihfVarCreateBuilder4.instance;
                aocf aocfVar3 = (aocf) aihfVarCreateBuilder2.build();
                aocfVar3.getClass();
                innertubeContext$ClientInfo.U = aocfVar3;
                innertubeContext$ClientInfo.d |= 1048576;
                aihfVarCreateBuilder3.copyOnWrite();
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder3.instance;
                InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder4.build();
                innertubeContext$ClientInfo2.getClass();
                innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo2;
                innertubeContext$InnerTubeContext.b |= 1;
                return (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder3.build();
            case 17:
                return agev.h(((aadk) this.a).b((String) this.b));
            case 18:
                aajk.f((ug) ahng.v(this.a));
                return (rv) ahng.v(this.b);
            case 19:
                return (agke) Stream.CC.concat(Collection.EL.stream((agke) ahng.v(this.a)), Collection.EL.stream((agke) ahng.v(this.b))).collect(aghu.a);
            default:
                List list = (List) ahng.v(this.a);
                List list2 = (List) ahng.v(this.b);
                agjz agjzVar = new agjz(4);
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    agjzVar.h(aaka.b(((aamo) it5.next()).d()));
                }
                Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    agjzVar.h(aaka.a(((aamh) it6.next()).a));
                }
                return agjzVar.g();
        }
    }

    public /* synthetic */ wci(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}

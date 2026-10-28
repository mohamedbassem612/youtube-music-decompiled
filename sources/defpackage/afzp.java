package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afzp extends InstanceProxy {
    public final asiu a;
    public final agcv b;

    public afzp(agcv agcvVar, asiu asiuVar) {
        this.b = agcvVar;
        this.a = asiuVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* synthetic */ mew a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0065  */
    /* JADX WARN: Type inference failed for: r8v5, types: [awut, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        xtl xtlVar;
        xtl xtlVar2;
        xtl xtlVar3;
        xtl xtlVar4;
        char c = 4;
        char c2 = 1;
        boolean zQ = true;
        z = true;
        boolean z = true;
        z = true;
        boolean z2 = true;
        boolean zA = false;
        if (i == -1171865774) {
            asee aseeVar = (asee) aihn.parseFrom(asee.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcv agcvVar = this.b;
            aseeVar.getClass();
            String str = aseeVar.c;
            xql xqlVar = ((xll) agcvVar).b;
            xqlVar.w.f();
            xvq xvqVarA = xqlVar.a(str);
            if (xvqVarA == null || (xtlVar4 = (xtl) xqlVar.b.io()) == null) {
                zQ = false;
            } else if (!xqlVar.e.l()) {
                try {
                    xqlVar.g = xvqVarA;
                    xtlVar4.b();
                    xqlVar.u.a(xqlVar);
                    xqlVar.l();
                } catch (RuntimeException unused) {
                    ((agrc) ((agrc) xql.a.c()).k("com/google/android/libraries/youtube/mdx/mediahub/MediaHubDeviceDataModel", "connectToDevice", 415, "MediaHubDeviceDataModel.java")).t("disconnectRoute failed");
                    zQ = false;
                }
            } else if (xqlVar.n(xvqVarA)) {
                zQ = false;
            } else {
                ahfi ahfiVar = xqlVar.w;
                Object obj = ahfiVar.a;
                if (obj != null) {
                    aihf builder = ((aihn) obj).toBuilder();
                    aihf aihfVarCreateBuilder = aisk.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aisk aiskVar = (aisk) aihfVarCreateBuilder.instance;
                    aiskVar.c = 4;
                    aiskVar.b |= 1;
                    aisk aiskVar2 = (aisk) aihfVarCreateBuilder.build();
                    builder.copyOnWrite();
                    airx airxVar = (airx) builder.instance;
                    aiskVar2.getClass();
                    airxVar.h = aiskVar2;
                    airxVar.b |= 131072;
                    ahfiVar.c = (airx) builder.build();
                }
                ahfiVar.e();
                zQ = xqlVar.q(xvqVarA);
            }
            return ahcs.f(xll.b(zQ), new afzd(12), MoreExecutors.directExecutor());
        }
        if (i == 1519473234) {
            aigv aigvVar = (aigv) aihn.parseFrom(aigv.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcv agcvVar2 = this.b;
            aigvVar.getClass();
            ((xtl) ((xll) agcvVar2).b.b.io()).b();
            return ahcs.f(xll.b(true), new afzd(13), MoreExecutors.directExecutor());
        }
        if (i == 969547939) {
            asee aseeVar2 = (asee) aihn.parseFrom(asee.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcv agcvVar3 = this.b;
            aseeVar2.getClass();
            asef asefVar = aseeVar2.e;
            if (asefVar == null) {
                asefVar = asef.a;
            }
            ased asedVar = asefVar.b == 1 ? (ased) asefVar.c : ased.a;
            xql xqlVar2 = ((xll) agcvVar3).b;
            boolean z3 = asedVar.b;
            xvq xvqVarA2 = xqlVar2.a(aseeVar2.c);
            if (xvqVarA2 != null && (xtlVar3 = (xtl) xqlVar2.b.io()) != null) {
                if (xvqVarA2.k()) {
                    xqlVar2.w.f();
                    xtlVar3.h(true);
                } else {
                    xqlVar2.w.e();
                    xqlVar2.o.g.set(z3);
                    zA = xtlVar3.a(xvqVarA2.a);
                }
            }
            return ahcs.f(xll.b(zA), new afzd(14), MoreExecutors.directExecutor());
        }
        if (i == -1727902229) {
            asee aseeVar3 = (asee) aihn.parseFrom(asee.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcv agcvVar4 = this.b;
            aseeVar3.getClass();
            String str2 = aseeVar3.c;
            xql xqlVar3 = ((xll) agcvVar4).b;
            xvq xvqVarA3 = xqlVar3.a(str2);
            if (xvqVarA3 == null || (xtlVar2 = (xtl) xqlVar3.b.io()) == null) {
                z = false;
            } else if (xqlVar3.n(xvqVarA3)) {
                xqlVar3.b().A();
            } else {
                xtlVar2.j(xvqVarA3);
            }
            return ahcs.f(xll.b(z), new afzd(15), MoreExecutors.directExecutor());
        }
        int i2 = 19;
        if (i == -1685714970) {
            asee aseeVar4 = (asee) aihn.parseFrom(asee.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcv agcvVar5 = this.b;
            aseeVar4.getClass();
            xql xqlVar4 = ((xll) agcvVar5).b;
            xvq xvqVarA4 = xqlVar4.a(aseeVar4.c);
            if (xvqVarA4 == null || (xtlVar = (xtl) xqlVar4.b.io()) == null) {
                z2 = false;
            } else if (xqlVar4.n(xvqVarA4)) {
                xqlVar4.b().ap(false, 19);
            } else {
                xtlVar.i(xvqVarA4);
            }
            return ahcs.f(xll.b(z2), new afzd(16), MoreExecutors.directExecutor());
        }
        int i3 = 17;
        if (i == -2081302156) {
            asee aseeVar5 = (asee) aihn.parseFrom(asee.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcv agcvVar6 = this.b;
            aseeVar5.getClass();
            xql xqlVar5 = ((xll) agcvVar6).b;
            return ahcs.f(xll.b(xqlVar5.r(xqlVar5.c(aseeVar5), new ulo(i2))), new afzd(i3), MoreExecutors.directExecutor());
        }
        int i4 = 20;
        if (i == -1136023748) {
            asee aseeVar6 = (asee) aihn.parseFrom(asee.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcv agcvVar7 = this.b;
            aseeVar6.getClass();
            xql xqlVar6 = ((xll) agcvVar7).b;
            return ahcs.f(xll.b(xqlVar6.r(xqlVar6.c(aseeVar6), new ulo(i4))), new afzd(18), MoreExecutors.directExecutor());
        }
        if (i == -1386245498) {
            asee aseeVar7 = (asee) aihn.parseFrom(asee.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcv agcvVar8 = this.b;
            aseeVar7.getClass();
            asef asefVar2 = aseeVar7.e;
            if (asefVar2 == null) {
                asefVar2 = asef.a;
            }
            aseo aseoVar = asefVar2.b == 2 ? (aseo) asefVar2.c : aseo.a;
            xql xqlVar7 = ((xll) agcvVar8).b;
            int i5 = aseoVar.b;
            xqlVar7.q = i5;
            xqlVar7.l.b(i5);
            return ahcs.f(xll.b(true), new afzd(i2), MoreExecutors.directExecutor());
        }
        if (i != -958051549) {
            if (i != 74157380) {
                throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '642663627'."));
            }
            asee aseeVar8 = (asee) aihn.parseFrom(asee.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            agcv agcvVar9 = this.b;
            aseeVar8.getClass();
            xll xllVar = (xll) agcvVar9;
            asee aseeVarC = xllVar.b.c(aseeVar8);
            aseeVarC.getClass();
            xsc xscVar = xllVar.o;
            return ahcs.f(awrc.ag(xscVar.c, awov.a, new qbj(xscVar, aseeVarC, (awoq) null, 17)), new agbg(c2), MoreExecutors.directExecutor());
        }
        asen asenVar = (asen) aihn.parseFrom(asen.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agcv agcvVar10 = this.b;
        asenVar.getClass();
        switch (asenVar.b) {
            case 0:
                c = 2;
                break;
            case 1:
                c = 3;
                break;
            case 2:
                break;
            case 3:
                c = 5;
                break;
            case 4:
                c = 6;
                break;
            case 5:
                c = 7;
                break;
            case 6:
                c = '\b';
                break;
            case 7:
                c = '\t';
                break;
            case 8:
                c = '\n';
                break;
            default:
                c = 0;
                break;
        }
        switch ((c != 0 ? c : (char) 1) - 2) {
            case 2:
                Context context = ((xll) agcvVar10).a;
                Intent intentDe = yno.de(context, false);
                intentDe.addFlags(268435456);
                yno.dc(context, intentDe);
                break;
            case 3:
                ((xll) agcvVar10).a(yct.LISTENING);
                break;
            case 4:
                ((xll) agcvVar10).a(yct.NOT_LISTENING_WITH_DPAD);
                break;
            case 5:
                xll xllVar2 = (xll) agcvVar10;
                if (xllVar2.b.e().isPresent()) {
                    xllVar2.n.a();
                    aihf aihfVarCreateBuilder2 = apxs.a.createBuilder();
                    aihfVarCreateBuilder2.getClass();
                    aihf aihfVarCreateBuilder3 = akud.a.createBuilder();
                    aihfVarCreateBuilder3.getClass();
                    afyd.P("engagement-panel-playlist", aihfVarCreateBuilder3);
                    acfz.aT(afyd.O(aihfVarCreateBuilder3), aihfVarCreateBuilder2);
                    apxs apxsVarAS = acfz.aS(aihfVarCreateBuilder2);
                    aihh aihhVar = (aihh) ajwo.a.createBuilder();
                    aihhVar.getClass();
                    aihl aihlVar = apxs.b;
                    aihlVar.getClass();
                    aihhVar.e(aihlVar, apxsVarAS);
                    xllVar2.f.a(atqp.W(aihhVar));
                }
                break;
            case 6:
                xll xllVar3 = (xll) agcvVar10;
                if (!xllVar3.m.l(254, 45835026L, false)) {
                    ((zdj) xllVar3.e.io()).d();
                }
                break;
            case 7:
                Intent flags = new Intent("android.intent.action.VIEW", xtj.a).setFlags(268435456);
                flags.getClass();
                yno.dc(((xll) agcvVar10).a, flags);
                break;
            case 8:
                ((xll) agcvVar10).h.d();
                break;
        }
        return ahcs.f(ahng.n(aigv.a), new afzd(i4), MoreExecutors.directExecutor());
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '642663627'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 279863794 || i == -1540738641 || i == -2060541234 || i == -1171865774 || i == 1519473234 || i == 969547939 || i == -1727902229 || i == -1685714970 || i == -2081302156 || i == -1136023748 || i == -1386245498 || i == -958051549 || i == 74157380;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        if (i != -1540738641) {
            if (i != -2060541234) {
                throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '642663627'."));
            }
            ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
            aigv aigvVar = aigv.a;
            aigv aigvVar2 = (aigv) aihn.parseFrom(aigvVar, bArr, generatedRegistry);
            agcv agcvVar = this.b;
            aigvVar2.getClass();
            ((xll) agcvVar).i.a(null);
            aigvVar.getClass();
            return aigvVar.toByteArray();
        }
        ExtensionRegistryLite generatedRegistry2 = ExtensionRegistryLite.getGeneratedRegistry();
        aigv aigvVar3 = aigv.a;
        aigv aigvVar4 = (aigv) aihn.parseFrom(aigvVar3, bArr, generatedRegistry2);
        agcv agcvVar2 = this.b;
        aigvVar4.getClass();
        xll xllVar = (xll) agcvVar2;
        xllVar.i.a(xllVar.b.i.P().L(xllVar.c).H(new ugm(new xlk(agcvVar2), 16)).L(xllVar.d).ak(new xbo(new uwk(agcvVar2, 18), 10)));
        aigvVar3.getClass();
        return aigvVar3.toByteArray();
    }
}

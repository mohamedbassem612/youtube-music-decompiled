package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wed implements wlc {
    public static final /* synthetic */ int a = 0;
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/innertube/entities/processor/EntityFrameworkUpdateTransportProcessor");
    private static final ExtensionRegistryLite c;
    private static final int d;
    private final wfl e;
    private final hed f;

    static {
        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite();
        extensionRegistryLite.b(akuz.b);
        c = extensionRegistryLite;
        d = (akuz.b.a() << 3) | 2;
    }

    public wed(hed hedVar, wfl wflVar) {
        this.f = hedVar;
        this.e = wflVar;
    }

    @Override // defpackage.wlc
    public final /* synthetic */ wlf a(zwa zwaVar, albe albeVar) {
        c(zwaVar, albeVar);
        return wlf.a;
    }

    @Override // defpackage.wlc
    public final ListenableFuture b(Executor executor, zwa zwaVar, albe albeVar) {
        ListenableFuture listenableFutureF;
        afuu afuuVarC = afwt.c(70, "fut entities");
        try {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akuz.b);
            albeVar.c(aihlVarCheckIsLite);
            Object objK = albeVar.j.k(aihlVarCheckIsLite.d);
            akuz akuzVar = (akuz) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            afwt.i(wln.c, Integer.valueOf(akuzVar.getSerializedSize()));
            afwt.i(wln.e, Integer.valueOf(akuzVar.d.size()));
            this.e.a("UTP", String.format("Processing %s mutations: %s ", Integer.valueOf(akuzVar.d.size()), new aghw(akuzVar.d, new vxq(4))));
            hed hedVar = this.f;
            if (akuzVar.d.size() == 0) {
                listenableFutureF = aher.a;
            } else {
                afuu afuuVarC2 = afwt.c(73, "fut entity mutation");
                try {
                    gmf gmfVar = new gmf(hedVar, zwaVar, akuzVar, 16);
                    long j = afwl.a;
                    ahfo ahfoVar = new ahfo(new afwh(afty.c(false), gmfVar, 0));
                    executor.execute(ahfoVar);
                    listenableFutureF = afxd.f(ahfoVar);
                    afuuVarC2.a(listenableFutureF);
                    afuuVarC2.close();
                } catch (Throwable th) {
                    try {
                        afuuVarC2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            afuuVarC.a(listenableFutureF);
            afuuVarC.close();
            return listenableFutureF;
        } catch (Throwable th3) {
            try {
                afuuVarC.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.wlc
    public final void c(zwa zwaVar, albe albeVar) {
        akuz akuzVar;
        aigm aigmVarG = albeVar.toByteString().g();
        while (true) {
            akuzVar = null;
            try {
                if (aigmVarG.D()) {
                    break;
                }
                int iN = aigmVarG.n();
                if (iN == d) {
                    akuz akuzVar2 = akuz.a;
                    aiix parserForClass = aihn.getParserForClass(akuz.class);
                    ExtensionRegistryLite extensionRegistryLite = c;
                    int iK = aigmVarG.K();
                    Object objJ = parserForClass.j(aigmVarG, extensionRegistryLite);
                    aigmVarG.R(iK);
                    akuzVar = (akuz) objJ;
                    break;
                }
                aigmVarG.F(iN);
            } catch (IOException e) {
                ((agrc) ((agrc) ((agrc) b.b()).j(e)).k("com/google/android/libraries/youtube/innertube/entities/processor/EntityFrameworkUpdateTransportProcessor", "parseUpdate", 'n', "EntityFrameworkUpdateTransportProcessor.java")).t("[ENTITY] Error parsing batch update.");
            }
        }
        if (akuzVar == null) {
            this.e.a("UTP", "No batch update data found on transport packet.");
        } else {
            this.e.a("UTP", String.format("Processing %s mutations: %s ", Integer.valueOf(akuzVar.d.size()), new aghw(akuzVar.d, new qmd(12))));
            this.f.G(zwaVar, akuzVar);
        }
    }

    @Override // defpackage.wlc
    public final boolean d(albe albeVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akuz.b);
        albeVar.c(aihlVarCheckIsLite);
        return albeVar.j.n(aihlVarCheckIsLite.d);
    }
}

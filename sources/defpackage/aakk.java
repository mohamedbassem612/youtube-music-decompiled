package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aakk implements aant {
    public final avmb a;
    private final awmd b;
    private final wco c;
    private final Executor d;
    private final abfv e;

    public aakk(awmd awmdVar, wco wcoVar, Executor executor, abfv abfvVar) {
        this.b = awmdVar;
        this.c = wcoVar;
        this.d = executor;
        this.a = new awir(executor);
        this.e = abfvVar;
    }

    private final aalf f(zwa zwaVar) {
        aaqn aaqnVarB = ((aanb) this.b.io()).b();
        String strS = aaqnVarB.s();
        if (Objects.equals(zwaVar.k(), strS) || Objects.equals(zwaVar.i(), strS)) {
            return aaqnVarB.g();
        }
        return null;
    }

    private final ListenableFuture g(zwa zwaVar, String str, amsz amszVar, final boolean z) {
        final int i = 1;
        if ((amszVar.c & 1) == 0) {
            aano aanoVar = new aano(aanp.c);
            aanoVar.d = 18;
            return ahng.n(aanoVar.a());
        }
        aalf aalfVarF = f(zwaVar);
        if (aalfVarF == null) {
            aano aanoVar2 = new aano(aanp.c);
            aanoVar2.d = 26;
            return ahng.n(aanoVar2.a());
        }
        wcn wcnVarB = this.c.b(zwaVar);
        String str2 = amszVar.d;
        if (aalfVarF.e == null) {
            aalfVarF.e = new File(aalfVarF.c, "images");
        }
        final File file = new File(aalfVarF.e, aalf.r(str2));
        if ((amszVar.c & 4) != 0 && !amszVar.f.isEmpty()) {
            avmc avmcVarR = wcnVarB.h(str).n(new wsh(str2, 6)).o(new mkc(this, wcnVarB, amszVar, 7, null)).A(avmc.n(new hog(this, wcnVarB, amszVar, str, str2, file, 5))).r(new avnn(this) { // from class: aakj
                public final /* synthetic */ aakk a;

                {
                    this.a = this;
                }

                @Override // defpackage.avnn
                public final Object a(Object obj) {
                    if (i != 0) {
                        amtc amtcVar = (amtc) obj;
                        File file2 = file;
                        return ((!file2.exists() || z) ? this.a.d(file2, amtcVar.getRemoteImageUrl()) : avlb.e()).B(avmc.t(aanp.a));
                    }
                    amtc amtcVar2 = (amtc) obj;
                    File file3 = file;
                    return (!file3.exists() || z) ? this.a.d(file3, amtcVar2.getRemoteImageUrl()) : avlb.e();
                }
            });
            aano aanoVar3 = new aano(aanp.b);
            aanoVar3.d = 19;
            return tzk.b(avmcVarR.x(aanoVar3.a()).y(this.a));
        }
        avlm avlmVarG = wcnVarB.g(str);
        avmb avmbVar = this.a;
        final int i2 = 0;
        avmc avmcVarB = avlmVarG.s(avmbVar).g(amtc.class).o(new yrb(str2, 4)).t().A(avmc.n(new hni(this, wcnVarB, str, str2, file, 13))).c(new avnn(this) { // from class: aakj
            public final /* synthetic */ aakk a;

            {
                this.a = this;
            }

            @Override // defpackage.avnn
            public final Object a(Object obj) {
                if (i2 != 0) {
                    amtc amtcVar = (amtc) obj;
                    File file2 = file;
                    return ((!file2.exists() || z) ? this.a.d(file2, amtcVar.getRemoteImageUrl()) : avlb.e()).B(avmc.t(aanp.a));
                }
                amtc amtcVar2 = (amtc) obj;
                File file3 = file;
                return (!file3.exists() || z) ? this.a.d(file3, amtcVar2.getRemoteImageUrl()) : avlb.e();
            }
        }).B(avmc.t(aanp.a));
        aano aanoVar4 = new aano(aanp.b);
        aanoVar4.d = 19;
        return tzk.b(avmcVarB.x(aanoVar4.a()).y(avmbVar));
    }

    @Override // defpackage.aant
    public final aans a(aofh aofhVar) {
        return aans.c;
    }

    @Override // defpackage.aant
    public final ListenableFuture b(zwa zwaVar, aofh aofhVar) {
        int iBc = a.bc(aofhVar.c);
        if (iBc == 0) {
            iBc = 1;
        }
        int i = iBc - 1;
        if (i == 1) {
            String str = aofhVar.d;
            aofg aofgVar = aofhVar.e;
            if (aofgVar == null) {
                aofgVar = aofg.b;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(amsz.b);
            aofgVar.c(aihlVarCheckIsLite);
            Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
            return g(zwaVar, str, (amsz) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)), false);
        }
        if (i != 2) {
            if (i != 3) {
                aano aanoVar = new aano(aanp.c);
                aanoVar.d = 23;
                return ahng.n(aanoVar.a());
            }
            String str2 = aofhVar.d;
            aofg aofgVar2 = aofhVar.e;
            if (aofgVar2 == null) {
                aofgVar2 = aofg.b;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amsz.b);
            aofgVar2.c(aihlVarCheckIsLite2);
            Object objK2 = aofgVar2.j.k(aihlVarCheckIsLite2.d);
            return g(zwaVar, str2, (amsz) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2)), true);
        }
        String str3 = aofhVar.d;
        aofg aofgVar3 = aofhVar.e;
        if (aofgVar3 == null) {
            aofgVar3 = aofg.b;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(amsz.b);
        aofgVar3.c(aihlVarCheckIsLite3);
        Object objK3 = aofgVar3.j.k(aihlVarCheckIsLite3.d);
        amsz amszVar = (amsz) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3));
        wcn wcnVarB = this.c.b(zwaVar);
        if ((amszVar.c & 4) != 0 && !amszVar.f.isEmpty()) {
            return tzk.b(wcnVarB.h(str3).r(new xdx(16)).A(avmc.t(Optional.empty())).r(new aaki(this, wcnVarB, zwaVar, amszVar, 0)).y(this.a));
        }
        if ((amszVar.c & 2) == 0) {
            return ahno.as(tzk.e(wcnVarB.a(str3).x(agpr.a).i(new hpn(wcnVarB, str3, 13))), new qmw((Object) this, (Object) wcnVarB, (Object) zwaVar, (Object) str3, 6, (byte[]) null), this.d);
        }
        if (e(zwaVar, amszVar.e)) {
            return ahng.n(aanp.a);
        }
        aano aanoVar2 = new aano(aanp.b);
        aanoVar2.d = 28;
        return ahng.n(aanoVar2.a());
    }

    @Override // defpackage.aant
    public final ListenableFuture c(zwa zwaVar, agke agkeVar) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [adhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public final avlb d(File file, String str) {
        Uri uriBuild = Uri.parse(str);
        String scheme = uriBuild.getScheme();
        if (scheme != null && ahno.ag("http", scheme)) {
            uriBuild = uriBuild.buildUpon().scheme("https").build();
        }
        abfv abfvVar = this.e;
        ?? r0 = abfvVar.a;
        sxv sxvVarC = sxv.c();
        r0.m(uriBuild, sxvVarC);
        return tzk.c(ahng.u(sxvVarC, 30L, TimeUnit.SECONDS, abfvVar.b)).c(new yrb(file, 5));
    }

    public final boolean e(zwa zwaVar, String str) {
        return f(zwaVar) != null && aalf.s(str);
    }
}

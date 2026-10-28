package defpackage;

import android.content.Context;
import android.os.StatFs;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ong {
    public agev a = agdf.a;
    private final Context b;
    private final String c;
    private final omj d;
    private final vwt e;

    public ong(Context context, vwt vwtVar, omj omjVar) {
        this.b = context;
        this.e = vwtVar;
        this.c = context.getPackageName();
        this.d = omjVar;
    }

    private final void r(int i, aihf aihfVar, long j) {
        aihf aihfVarCreateBuilder = ahaz.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahaz ahazVar = (ahaz) aihfVarCreateBuilder.instance;
        ahazVar.b |= 1;
        ahazVar.c = false;
        p(i, aihfVar, j, (ahaz) aihfVarCreateBuilder.build());
    }

    private final ListenableFuture s(int i, ahcx ahcxVar) {
        ListenableFuture listenableFutureE = this.d.e(this.a);
        qrj qrjVar = new qrj(this, ahcxVar, i, 1);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), qrjVar, 1);
        int i2 = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureE, ahdbVar);
        listenableFutureE.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
        return ahcqVar;
    }

    private final void t(int i, aihf aihfVar) {
        ListenableFuture listenableFutureE = this.d.e(this.a);
        onf onfVar = new onf(this, i, aihfVar);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        listenableFutureE.addListener(new ahei(listenableFutureE, new afwj(afty.c(false), onfVar, 0)), executorDirectExecutor);
    }

    public final ListenableFuture a(ahcx ahcxVar) {
        return s(1046, new ojf(ahcxVar, 2));
    }

    public final ListenableFuture b(ahcx ahcxVar) {
        return s(1058, new ojf(ahcxVar, 3));
    }

    public final ListenableFuture c(ahcx ahcxVar) {
        return s(1057, new ojf(ahcxVar, 4));
    }

    public final void d(ahal ahalVar) {
        if (onb.a(100L)) {
            aihf aihfVarCreateBuilder = ahak.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ahak ahakVar = (ahak) aihfVarCreateBuilder.instance;
            ahalVar.getClass();
            ahakVar.q = ahalVar;
            ahakVar.d |= 4;
            r(1075, aihfVarCreateBuilder, 100L);
        }
    }

    public final void e(ahai ahaiVar, aham ahamVar) {
        aihf aihfVarCreateBuilder = ahak.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahak ahakVar = (ahak) aihfVarCreateBuilder.instance;
        ahamVar.getClass();
        ahakVar.r = ahamVar;
        ahakVar.d |= 8;
        aihfVarCreateBuilder.copyOnWrite();
        ahak ahakVar2 = (ahak) aihfVarCreateBuilder.instance;
        ahaiVar.getClass();
        ahakVar2.e = ahaiVar;
        ahakVar2.b |= SemanticState.Hidden;
        t(1082, aihfVarCreateBuilder);
    }

    public final void f(ahaq ahaqVar) {
        aihf aihfVarCreateBuilder = ahak.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahak ahakVar = (ahak) aihfVarCreateBuilder.instance;
        ahaqVar.getClass();
        ahakVar.s = ahaqVar;
        ahakVar.d |= SemanticState.Hidden;
        t(1110, aihfVarCreateBuilder);
    }

    public final void g(ahai ahaiVar) {
        aihf aihfVarCreateBuilder = ahak.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ahau.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ahau ahauVar = (ahau) aihfVarCreateBuilder2.instance;
        ahaiVar.getClass();
        ahauVar.c = ahaiVar;
        ahauVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        ahak ahakVar = (ahak) aihfVarCreateBuilder.instance;
        ahau ahauVar2 = (ahau) aihfVarCreateBuilder2.build();
        ahauVar2.getClass();
        ahakVar.p = ahauVar2;
        ahakVar.d |= 1;
        t(1071, aihfVarCreateBuilder);
    }

    public final void h(ahai ahaiVar, int i) {
        aihf aihfVarCreateBuilder = ahav.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahav ahavVar = (ahav) aihfVarCreateBuilder.instance;
        ahavVar.b |= 1;
        ahavVar.c = i;
        ahav ahavVar2 = (ahav) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = ahak.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ahak ahakVar = (ahak) aihfVarCreateBuilder2.instance;
        ahavVar2.getClass();
        ahakVar.u = ahavVar2;
        ahakVar.d |= SemanticState.Modal;
        aihfVarCreateBuilder2.copyOnWrite();
        ahak ahakVar2 = (ahak) aihfVarCreateBuilder2.instance;
        ahaiVar.getClass();
        ahakVar2.e = ahaiVar;
        ahakVar2.b |= SemanticState.Hidden;
        t(1117, aihfVarCreateBuilder2);
    }

    public final void i(ahai ahaiVar, ahay ahayVar) {
        aihf aihfVarCreateBuilder = ahak.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahak ahakVar = (ahak) aihfVarCreateBuilder.instance;
        ahayVar.getClass();
        ahakVar.t = ahayVar;
        ahakVar.d |= SemanticState.LiveRegion;
        aihfVarCreateBuilder.copyOnWrite();
        ahak ahakVar2 = (ahak) aihfVarCreateBuilder.instance;
        ahaiVar.getClass();
        ahakVar2.e = ahaiVar;
        ahakVar2.b |= SemanticState.Hidden;
        t(1018, aihfVarCreateBuilder);
    }

    public final void j(int i) {
        t(i, ahak.a.createBuilder());
    }

    public final void k(int i, String str, int i2, long j, String str2) {
        aihf aihfVarCreateBuilder = ahai.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar = (ahai) aihfVarCreateBuilder.instance;
        str.getClass();
        ahaiVar.b |= 1;
        ahaiVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar2 = (ahai) aihfVarCreateBuilder.instance;
        ahaiVar2.b |= 2;
        ahaiVar2.d = i2;
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar3 = (ahai) aihfVarCreateBuilder.instance;
        ahaiVar3.b |= 64;
        ahaiVar3.i = j;
        aihfVarCreateBuilder.copyOnWrite();
        ahai ahaiVar4 = (ahai) aihfVarCreateBuilder.instance;
        str2.getClass();
        ahaiVar4.b |= SemanticState.Focused;
        ahaiVar4.j = str2;
        ahai ahaiVar5 = (ahai) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = ahak.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ahak ahakVar = (ahak) aihfVarCreateBuilder2.instance;
        ahaiVar5.getClass();
        ahakVar.e = ahaiVar5;
        ahakVar.b |= SemanticState.Hidden;
        t(i, aihfVarCreateBuilder2);
    }

    public final void l(int i, int i2) {
        aihf aihfVarCreateBuilder = ahak.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ahao.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ahao ahaoVar = (ahao) aihfVarCreateBuilder2.instance;
        ahaoVar.b |= 2;
        ahaoVar.d = i2;
        aihfVarCreateBuilder2.copyOnWrite();
        ahao ahaoVar2 = (ahao) aihfVarCreateBuilder2.instance;
        ahaoVar2.c = i - 2;
        ahaoVar2.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        ahak ahakVar = (ahak) aihfVarCreateBuilder.instance;
        ahao ahaoVar3 = (ahao) aihfVarCreateBuilder2.build();
        ahaoVar3.getClass();
        ahakVar.k = ahaoVar3;
        ahakVar.c |= 32768;
        t(1053, aihfVarCreateBuilder);
    }

    public final void m(ahai ahaiVar, int i, long j, long j2, String str, int i2) {
        aihf aihfVarCreateBuilder = ahak.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ahar.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ahar aharVar = (ahar) aihfVarCreateBuilder2.instance;
        ahaiVar.getClass();
        aharVar.c = ahaiVar;
        aharVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        ahar aharVar2 = (ahar) aihfVarCreateBuilder2.instance;
        aharVar2.d = i - 2;
        aharVar2.b |= 2;
        aihfVarCreateBuilder2.copyOnWrite();
        ahar aharVar3 = (ahar) aihfVarCreateBuilder2.instance;
        aharVar3.b |= 4;
        aharVar3.e = j;
        aihfVarCreateBuilder2.copyOnWrite();
        ahar aharVar4 = (ahar) aihfVarCreateBuilder2.instance;
        aharVar4.b |= 8;
        aharVar4.f = j2;
        aihfVarCreateBuilder2.copyOnWrite();
        ahar aharVar5 = (ahar) aihfVarCreateBuilder2.instance;
        str.getClass();
        aharVar5.b |= 16;
        aharVar5.g = str;
        aihfVarCreateBuilder2.copyOnWrite();
        ahar aharVar6 = (ahar) aihfVarCreateBuilder2.instance;
        aharVar6.b |= 32;
        aharVar6.h = i2;
        aihfVarCreateBuilder.copyOnWrite();
        ahak ahakVar = (ahak) aihfVarCreateBuilder.instance;
        ahar aharVar7 = (ahar) aihfVarCreateBuilder2.build();
        aharVar7.getClass();
        ahakVar.n = aharVar7;
        ahakVar.c |= 4194304;
        t(1068, aihfVarCreateBuilder);
    }

    public final void n(ahai ahaiVar, int i) {
        aihf aihfVarCreateBuilder = ahak.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ahax.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ahax ahaxVar = (ahax) aihfVarCreateBuilder2.instance;
        ahaxVar.c = i - 2;
        ahaxVar.b |= 1;
        ahax ahaxVar2 = (ahax) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        ahak ahakVar = (ahak) aihfVarCreateBuilder.instance;
        ahaxVar2.getClass();
        ahakVar.v = ahaxVar2;
        ahakVar.d |= 16384;
        aihfVarCreateBuilder.copyOnWrite();
        ahak ahakVar2 = (ahak) aihfVarCreateBuilder.instance;
        ahaiVar.getClass();
        ahakVar2.e = ahaiVar;
        ahakVar2.b |= SemanticState.Hidden;
        t(1119, aihfVarCreateBuilder);
    }

    public final void o(int i) {
        r(i, ahak.a.createBuilder(), 10000L);
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [boolean, int] */
    public final void p(int i, aihf aihfVar, long j, ahaz ahazVar) {
        aihf aihfVarCreateBuilder = ahah.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahah ahahVar = (ahah) aihfVarCreateBuilder.instance;
        String str = this.c;
        str.getClass();
        ahahVar.b |= 2;
        ahahVar.d = str;
        aihfVarCreateBuilder.copyOnWrite();
        ahah ahahVar2 = (ahah) aihfVarCreateBuilder.instance;
        ahahVar2.b |= 1;
        ahahVar2.c = 722788935;
        aihfVar.copyOnWrite();
        ahak ahakVar = (ahak) aihfVar.instance;
        ahak ahakVar2 = ahak.a;
        ahakVar.b |= 524288;
        ahakVar.f = j;
        aihf aihfVarCreateBuilder2 = ahaj.a.createBuilder();
        StatFs statFs = new StatFs(this.b.getFilesDir().getAbsolutePath());
        long blockCount = statFs.getBlockCount();
        long blockSize = statFs.getBlockSize();
        long availableBlocks = statFs.getAvailableBlocks();
        long blockSize2 = statFs.getBlockSize();
        double dMin = Math.min(5.24288E8d, blockCount * blockSize * 0.05d);
        aihfVarCreateBuilder2.copyOnWrite();
        ahaj ahajVar = (ahaj) aihfVarCreateBuilder2.instance;
        ahajVar.b |= 1;
        ahajVar.c = ((availableBlocks * blockSize2) > dMin ? 1 : ((availableBlocks * blockSize2) == dMin ? 0 : -1)) >>> 31;
        aihfVar.copyOnWrite();
        ahak ahakVar3 = (ahak) aihfVar.instance;
        ahaj ahajVar2 = (ahaj) aihfVarCreateBuilder2.build();
        ahajVar2.getClass();
        ahakVar3.i = ahajVar2;
        ahakVar3.c |= SemanticState.Focused;
        aihfVar.copyOnWrite();
        ahak ahakVar4 = (ahak) aihfVar.instance;
        ahah ahahVar3 = (ahah) aihfVarCreateBuilder.build();
        ahahVar3.getClass();
        ahakVar4.m = ahahVar3;
        ahakVar4.c |= 524288;
        aihfVar.copyOnWrite();
        ahak ahakVar5 = (ahak) aihfVar.instance;
        ahazVar.getClass();
        ahakVar5.g = ahazVar;
        ahakVar5.b |= 1048576;
        vwt vwtVar = this.e;
        aihn aihnVarBuild = aihfVar.build();
        int i2 = i - 2;
        if (aihnVarBuild instanceof ahak) {
            alos alosVar = (alos) alou.a.createBuilder();
            aihf aihfVarCreateBuilder3 = akjv.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            akjv akjvVar = (akjv) aihfVarCreateBuilder3.instance;
            akjvVar.c = 4;
            akjvVar.d = Integer.valueOf(i2);
            aigj byteString = aihnVarBuild.toByteString();
            aihfVarCreateBuilder3.copyOnWrite();
            akjv akjvVar2 = (akjv) aihfVarCreateBuilder3.instance;
            byteString.getClass();
            akjvVar2.b |= 1;
            akjvVar2.e = byteString;
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            akjv akjvVar3 = (akjv) aihfVarCreateBuilder3.build();
            akjvVar3.getClass();
            alouVar.d = akjvVar3;
            alouVar.c = 392;
            ((dov) vwtVar.a).R((alou) alosVar.build());
        }
    }

    public final void q(int i, ahai ahaiVar, int i2) {
        aihf aihfVarCreateBuilder = ahak.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ahan.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ahan ahanVar = (ahan) aihfVarCreateBuilder2.instance;
        ahanVar.c = i == 1 ? aiif.a() : i - 2;
        ahanVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        ahan ahanVar2 = (ahan) aihfVarCreateBuilder2.instance;
        ahaiVar.getClass();
        ahanVar2.d = ahaiVar;
        ahanVar2.b |= 2;
        aihfVarCreateBuilder2.copyOnWrite();
        ahan ahanVar3 = (ahan) aihfVarCreateBuilder2.instance;
        ahanVar3.e = i2 == 1 ? aiif.a() : i2 - 2;
        ahanVar3.b |= 4;
        aihfVarCreateBuilder2.copyOnWrite();
        ahan ahanVar4 = (ahan) aihfVarCreateBuilder2.instance;
        ahanVar4.b |= 8;
        ahanVar4.f = 0;
        aihfVarCreateBuilder.copyOnWrite();
        ahak ahakVar = (ahak) aihfVarCreateBuilder.instance;
        ahan ahanVar5 = (ahan) aihfVarCreateBuilder2.build();
        ahanVar5.getClass();
        ahakVar.o = ahanVar5;
        ahakVar.c |= Integer.MIN_VALUE;
        t(1070, aihfVarCreateBuilder);
    }
}

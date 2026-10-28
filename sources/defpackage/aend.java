package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.api.innertube.InnertubeGetAssetService$GetAssetResponse;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aend extends wnn {
    public final Object c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aend(abxv abxvVar, tgg tggVar, wlp wlpVar, zwb zwbVar) {
        super(abxvVar, tggVar);
        abxvVar.getClass();
        tggVar.getClass();
        wlpVar.getClass();
        zwbVar.getClass();
        this.c = zwbVar;
        this.d = f(aqel.a, wlpVar, new ablq(10), new wvb(19));
    }

    public final ListenableFuture a(wry wryVar, Executor executor) {
        return ((wnh) this.c).b(wryVar, executor, null);
    }

    public final wqj b() {
        return new wqj(this.b);
    }

    public final ListenableFuture c(wqj wqjVar, Executor executor) {
        return ahcs.e(((wnh) this.d).b(wqjVar, executor, null), new vdm(this, 14), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwh] */
    public final wqd d() {
        return new wqd(this.b, this.d.hw());
    }

    public final ListenableFuture g(wqd wqdVar, Executor executor) {
        return ((wnh) this.c).b(wqdVar, executor, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwb] */
    public final wpr h() {
        return new wpr(this.b, this.c.e());
    }

    public final void i(wpr wprVar) {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwb] */
    public final woc j() {
        return new woc(this.b, this.d.e());
    }

    public final ListenableFuture k(woc wocVar) {
        return ((wnh) this.c).a(wocVar);
    }

    public aend(wlp wlpVar, abxv abxvVar, tgg tggVar, addn addnVar) {
        super(abxvVar, tggVar);
        this.c = f(alps.a, wlpVar, new heo(6), new hep(3));
        this.d = addnVar;
    }

    public aend(abxv abxvVar, wlp wlpVar, tgg tggVar, zwh zwhVar) {
        super(abxvVar, tggVar);
        this.d = zwhVar;
        this.c = f(alzf.a, wlpVar, new heo(8), new hep(4));
    }

    public aend(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, short[] sArr, byte[] bArr) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.c = f(allk.a, wlpVar, new heo(11), new hep(6));
    }

    public aend(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.d = wlpVar;
    }

    public aend(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, char[] cArr, byte[] bArr) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.d = f(aloh.a, wlpVar, new wpa(9), new wph(4));
    }

    public aend(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, byte[] bArr, byte[] bArr2) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.c = f(alph.a, wlpVar, new wpa(10), new wph(5));
    }

    public aend(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, int[] iArr) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.c = f(alul.a, wlpVar, new wpa(12), new wph(7));
    }

    public aend(wlp wlpVar, abxv abxvVar, zwh zwhVar, tgg tggVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(abxvVar, tggVar);
        this.d = zwhVar;
        this.c = f(InnertubeGetAssetService$GetAssetResponse.getDefaultInstance(), wlpVar, new wpa(13), new wph(8));
    }

    public aend(wlp wlpVar, abxv abxvVar, tgg tggVar, wjz wjzVar) {
        super(abxvVar, tggVar);
        this.c = wjzVar;
        this.d = f(alzm.a, wlpVar, new wpa(15), new wph(10));
    }

    public aend(wlp wlpVar, abxv abxvVar, zwh zwhVar, tgg tggVar, byte[] bArr, byte[] bArr2) {
        super(abxvVar, tggVar);
        this.d = zwhVar;
        this.c = f(alwg.a, wlpVar, new wqy(15), new wrj(10));
    }

    public aend(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, short[] sArr) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.c = f(alww.a, wlpVar, new wsj(4), new wrj(20));
    }

    public aend(wlp wlpVar, abxv abxvVar, zwh zwhVar, tgg tggVar, byte[] bArr) {
        super(abxvVar, tggVar);
        this.c = zwhVar;
        this.d = f(alqv.a, wlpVar, new wsj(10), new wtk(5));
    }

    public aend(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, char[] cArr) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.d = f(alxg.a, wlpVar, new wsj(16), new wtk(11));
    }

    public aend(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, byte[] bArr) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.c = f(alyp.a, wlpVar, new wsj(17), new wtk(12));
    }

    public aend(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        wlpVar.getClass();
        this.c = wlpVar;
    }

    public aend(wlp wlpVar, abxv abxvVar, zwh zwhVar, tgg tggVar) {
        super(abxvVar, tggVar);
        this.c = zwhVar;
        this.d = f(alqa.a, wlpVar, new ablq(6), new wvb(16));
    }

    public aend(abxv abxvVar, zwh zwhVar, tgg tggVar, aend aendVar) {
        super(abxvVar, tggVar);
        this.c = zwhVar;
        this.d = aendVar;
    }
}

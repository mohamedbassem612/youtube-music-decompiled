package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olq implements ola {
    public final Executor a;
    public final qrx b;
    public final qnl c;
    private final omj d;

    public olq(omj omjVar, qnl qnlVar, qrx qrxVar, Executor executor) {
        this.d = omjVar;
        this.c = qnlVar;
        this.b = qrxVar;
        this.a = executor;
    }

    @Override // defpackage.ola
    public final ListenableFuture a(oip oipVar) {
        int i = onb.a;
        oip oipVarD = nsp.d(oipVar, (this.d.f() / 1000) + oipVar.k);
        ArrayList arrayList = new ArrayList();
        arrayList.add(oipVarD);
        return m(arrayList);
    }

    @Override // defpackage.ola
    public final ListenableFuture b() {
        return ooi.d(k()).f(new oll(this, 7), this.a);
    }

    @Override // defpackage.ola
    public final ListenableFuture c() {
        ArrayList arrayList = new ArrayList();
        olj oljVar = new olj(arrayList, 8);
        Executor executor = this.a;
        return ooi.d(this.b.a(oljVar, executor)).e(new olj(arrayList, 9), executor);
    }

    @Override // defpackage.ola
    public final ListenableFuture d() {
        ArrayList arrayList = new ArrayList();
        kjh kjhVar = new kjh(this, arrayList, 5, null);
        Executor executor = this.a;
        return ooi.d(this.b.a(kjhVar, executor)).e(new olj(arrayList, 5), executor);
    }

    @Override // defpackage.ola
    public final ListenableFuture e() {
        return ahno.ar(this.b.c(), new olk(6), this.a);
    }

    @Override // defpackage.ola
    public final ListenableFuture f() {
        return aher.a;
    }

    @Override // defpackage.ola
    public final ListenableFuture g(oiw oiwVar) {
        return ahno.ar(this.b.c(), new olj(qnl.aZ(oiwVar), 6), this.a);
    }

    @Override // defpackage.ola
    public final ListenableFuture h(oiw oiwVar) {
        return ahno.ar(this.b.c(), new olj(qnl.aZ(oiwVar), 3), this.a);
    }

    @Override // defpackage.ola
    public final ListenableFuture i(oiw oiwVar) {
        olj oljVar = new olj(qnl.aZ(oiwVar), 7);
        Executor executor = this.a;
        return ooi.d(this.b.a(oljVar, executor)).e(new olk(12), executor).b(IOException.class, new olk(13), executor);
    }

    @Override // defpackage.ola
    public final ListenableFuture j(List list) {
        olj oljVar = new olj(list, 4);
        Executor executor = this.a;
        return ooi.d(this.b.a(oljVar, executor)).e(new olk(4), executor).b(IOException.class, new olk(5), executor);
    }

    @Override // defpackage.ola
    public final ListenableFuture k() {
        return this.b.a(new olk(7), this.a);
    }

    @Override // defpackage.ola
    public final ListenableFuture l(oiw oiwVar, oip oipVar) {
        kjh kjhVar = new kjh(qnl.aZ(oiwVar), oipVar, 6);
        Executor executor = this.a;
        return ooi.d(this.b.a(kjhVar, executor)).e(new olk(9), executor).b(IOException.class, new olk(10), executor);
    }

    @Override // defpackage.ola
    public final ListenableFuture m(List list) {
        olj oljVar = new olj(list, 2);
        Executor executor = this.a;
        return ooi.d(this.b.a(oljVar, executor)).e(new olk(8), executor).b(IOException.class, new olk(11), executor);
    }
}

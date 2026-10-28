package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wbh implements wfa {
    private final wbd a;
    private final AtomicBoolean b = new AtomicBoolean();
    private final aijp c;
    private final vwt d;

    public wbh(vwt vwtVar, wbd wbdVar, aijp aijpVar) {
        this.a = wbdVar;
        this.d = vwtVar;
        this.c = aijpVar;
    }

    private final avlb o(boolean z, agev agevVar) {
        if (this.b.getAndSet(true)) {
            return avlb.m(new IllegalStateException("PendingEditsImpl cannot be committed multiple times"));
        }
        wbd wbdVar = this.a;
        vwt vwtVar = this.d;
        return wbdVar.a(vwtVar.e(), this.c, z, agevVar);
    }

    @Override // defpackage.wer
    public final wer a(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.wer
    public final avlb b() {
        return o(true, agdf.a);
    }

    @Override // defpackage.wer
    public final avlb c(wem wemVar) {
        return o(true, agev.i(wemVar));
    }

    @Override // defpackage.wer
    public final avlb d() {
        return o(false, agdf.a);
    }

    @Override // defpackage.wer
    public final void e(weh wehVar) {
        this.d.f(wehVar.b(), wbc.d(wehVar), wav.a);
    }

    @Override // defpackage.wer
    public final void f(weh wehVar, wej wejVar) {
        this.d.f(wehVar.b(), wbc.d(wehVar), tzk.M(wejVar));
    }

    @Override // defpackage.wfa
    public final void g(String str, byte[] bArr) {
        this.d.f(str, new wat(new wax(new waz(bArr))), wav.a);
    }

    @Override // defpackage.wer
    public final /* synthetic */ void h(Iterable iterable) {
        yno.ex(this, iterable);
    }

    @Override // defpackage.wer
    public final void i(String str, wej wejVar) {
        this.d.f(str, new wat(wav.a), tzk.M(wejVar));
    }

    @Override // defpackage.wer
    public final void j(String str) {
        waw wawVar = waw.a;
        this.d.f(str, new wat(wawVar), wawVar);
    }

    @Override // defpackage.wer
    public final void k(String str, akvd akvdVar, byte[] bArr) {
        this.d.f(str, new was(new wbg(akvdVar, str, aigj.v(bArr))), wav.a);
    }

    @Override // defpackage.wer
    public final /* synthetic */ void l(weh wehVar) {
        yno.ey(this, wehVar);
    }

    @Override // defpackage.wer
    public final void m(tzk tzkVar) {
        e(tzkVar.I(this.a));
    }

    @Override // defpackage.wer
    public final void n(tzk tzkVar, wej wejVar) {
        f(((amta) tzkVar).ao(), wejVar);
    }
}

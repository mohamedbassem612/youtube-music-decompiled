package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vyo {
    public final avlr a;
    public final ListenableFuture b = ape.f(new tzc(this, 3));
    public volatile alik c;
    public final wll d;

    public vyo(avlr avlrVar, wll wllVar) {
        this.a = avlrVar;
        this.d = wllVar;
        avlrVar.af(new vub(this, 7));
    }

    public final ListenableFuture a() {
        return ahng.o(this.b);
    }

    public final alik b() {
        if (this.c != null) {
            return this.c;
        }
        avlr avlrVar = this.a;
        Object obj = alik.a;
        avox avoxVar = new avox();
        avlrVar.ak(avoxVar);
        Object objE = avoxVar.e();
        if (objE != null) {
            obj = objE;
        }
        return (alik) obj;
    }

    public final avlr c(avnn avnnVar) {
        return this.a.K(avnnVar).r();
    }

    @Deprecated
    public final avlr d() {
        return this.a.H();
    }

    public final String e() {
        return this.d.f.a;
    }
}

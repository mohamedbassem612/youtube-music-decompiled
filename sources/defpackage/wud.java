package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wud extends wnn {
    public final boolean c;
    public final wnh d;
    public final Object e;

    public wud(abxv abxvVar, tgg tggVar, zwb zwbVar, vxu vxuVar, wlp wlpVar) {
        super(abxvVar, tggVar);
        this.e = zwbVar;
        this.c = vys.a(vxuVar);
        this.d = f(aqeg.a, wlpVar, new wsj(13), new wtk(8));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwb] */
    public final wuc a() {
        return new wuc(this.b, this.e.e(), this.c);
    }

    public final ListenableFuture b(wuc wucVar, Executor executor) {
        return this.d.b(wucVar, executor, null);
    }

    public wud(abxv abxvVar, tgg tggVar, zwh zwhVar, vxu vxuVar, wlp wlpVar) {
        super(abxvVar, tggVar);
        this.e = zwhVar;
        this.c = vys.a(vxuVar);
        this.d = f(akzt.a, wlpVar, new wpa(11), new wph(6));
    }
}

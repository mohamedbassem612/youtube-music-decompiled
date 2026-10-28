package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mfh implements nuc {
    private final Set a;

    public mfh(Set set) {
        this.a = set;
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void a(aslh aslhVar, String str, Object... objArr) {
        nqy.a(this, aslhVar, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void b(asnc asncVar, String str, Object... objArr) {
        nqy.b(this, asncVar, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void c(aslh aslhVar, nsl nslVar, String str, Object... objArr) {
        h(aslhVar, nslVar, null, null, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void d(asnc asncVar, nsl nslVar, String str, Object... objArr) {
        i(asncVar, nslVar, null, null, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void e(asnc asncVar, Throwable th, String str, Object... objArr) {
        nqy.c(this, asncVar, th, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void f(aslh aslhVar, nsl nslVar, Throwable th, String str, Object... objArr) {
        h(aslhVar, nslVar, th, null, str, objArr);
    }

    @Override // defpackage.nuc
    public final /* synthetic */ void g(asnc asncVar, nsl nslVar, Throwable th, String str, Object... objArr) {
        i(asncVar, nslVar, th, null, str, objArr);
    }

    @Override // defpackage.nuc
    public final void h(aslh aslhVar, nsl nslVar, Throwable th, asmw asmwVar, String str, Object... objArr) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nuc) it.next()).h(aslhVar, nslVar, th, asmwVar, str, objArr);
        }
    }

    @Override // defpackage.nuc
    public final void i(asnc asncVar, nsl nslVar, Throwable th, asmw asmwVar, String str, Object... objArr) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nuc) it.next()).i(asncVar, nslVar, th, asmwVar, str, objArr);
        }
    }
}

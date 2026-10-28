package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mfk implements nuc {
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
        char c;
        int iOrdinal = aslhVar.ordinal();
        if (iOrdinal != 11) {
            c = (iOrdinal == 12 || iOrdinal == 26) ? (char) 5 : (char) 6;
        } else {
            c = 4;
        }
        String str2 = String.format("%s %s %s", aslhVar.name(), String.format(str, objArr), ket.Y(asmwVar));
        if (c != 4) {
            if (c != 5) {
                Log.e("ElementsErrorLogger", str2, th);
            } else {
                Log.w("ElementsErrorLogger", str2, th);
            }
        }
    }

    @Override // defpackage.nuc
    public final void i(asnc asncVar, nsl nslVar, Throwable th, asmw asmwVar, String str, Object... objArr) {
        aslh aslhVarA = aslh.a(asncVar.d);
        if (aslhVarA == null) {
            aslhVarA = aslh.ERROR_TYPE_UNKNOWN;
        }
        h(aslhVarA, nslVar, th, asmwVar, str, objArr);
    }
}

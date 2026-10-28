package defpackage;

import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aage implements aafv {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public aage(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [aalv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [aalv, java.lang.Object] */
    @Override // defpackage.aafv
    public final void a(String str, aoen aoenVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            aagl aaglVarS = ((aagg) obj).s(str);
            if (aaglVarS != null) {
                aaglVarS.g();
                return;
            }
            return;
        }
        aado aadoVar = (aado) obj;
        if (aarq.j(aadoVar.e, aadoVar.b)) {
            aerj aerjVarD = aadoVar.D();
            aerjVarD.i(aajc.e((String) aerjVarD.b, str));
            aerj aerjVarD2 = aadoVar.D();
            Object obj2 = aerjVarD2.c;
            ci ciVar = (ci) obj2;
            ciVar.aA(String.format(Locale.US, "%s:%s:ad", aerjVarD2.b, str));
            aerj aerjVarD3 = aadoVar.D();
            aerjVarD3.i(aajc.d((String) aerjVarD3.b, str));
        }
        abfv abfvVar = aadoVar.z;
        typ.f(str);
        List listIo = ((aada) abfvVar.a).io();
        if (listIo == null || !aabq.k(str, listIo)) {
            return;
        }
        if (aoenVar != null) {
            abfvVar.b.a(aoenVar);
        } else {
            abfvVar.b.h(str, aofb.OFFLINE_TYPE_UNKNOWN);
        }
    }
}

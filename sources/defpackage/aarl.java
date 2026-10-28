package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aarl implements aary {
    private final wco a;
    private final zwb b;
    private final agfr c;

    public aarl(wco wcoVar, abxv abxvVar, zwb zwbVar) {
        this.a = wcoVar;
        this.b = zwbVar;
        this.c = aguu.al(new zaz(abxvVar, 15));
    }

    public static aaro a(zwa zwaVar, aqph aqphVar, wej wejVar) {
        aama aamaVar = new aama(wejVar);
        String strB = aqphVar.b();
        int iA = aamaVar.a("transferFailureCount");
        aqpc transferState = aqphVar.getTransferState();
        aqpe failureReason = aqphVar.getFailureReason();
        aqphVar.getCotn();
        return new aaro(zwaVar, strB, aamaVar, iA, transferState, failureReason);
    }

    @Override // defpackage.aary
    public final agev b(String str) {
        wco wcoVar = this.a;
        zwa zwaVarE = this.b.e();
        avlm avlmVarR = wcoVar.b(zwaVarE).h(str).r(new yrb(zwaVarE, 9)).r(new aalc(3));
        Object obj = agdf.a;
        avoy avoyVar = new avoy();
        avlmVarR.F(avoyVar);
        if (avoyVar.getCount() != 0) {
            try {
                boolean z = atqp.x;
                avoyVar.await();
            } catch (InterruptedException e) {
                avoyVar.e();
                throw awkh.b(e);
            }
        }
        Throwable th = avoyVar.b;
        if (th != null) {
            throw awkh.b(th);
        }
        Object obj2 = avoyVar.a;
        if (obj2 != null) {
            obj = obj2;
        }
        return (agev) obj;
    }

    @Override // defpackage.aary
    public final String c() {
        return "";
    }

    @Override // defpackage.aary
    public final List d(zwa zwaVar) {
        agfr agfrVar = this.c;
        wcn wcnVarB = this.a.b(zwaVar);
        return (List) wcnVarB.s((wjr) agfrVar.io()).r(new hpn(wcnVarB, zwaVar, 15)).E();
    }

    @Override // defpackage.aary
    public final void e(aaro aaroVar) {
        j(aaroVar);
    }

    @Override // defpackage.aary
    public final void j(aaro aaroVar) {
        wcn wcnVarB = this.a.b(aaroVar.l);
        aqph aqphVar = (aqph) wcnVarB.g(aaroVar.a).g(aqph.class).E();
        if (aqphVar != null) {
            aqpf aqpfVarD = aqphVar.d();
            aqpfVarD.as(aaroVar.j);
            aihh aihhVar = aqpfVarD.a;
            aihhVar.copyOnWrite();
            aqpi aqpiVar = (aqpi) aihhVar.instance;
            aihw aihwVar = aqpi.a;
            aqpiVar.c &= -5;
            aqpiVar.h = 0;
            aqpe aqpeVar = aaroVar.k;
            if (aqpeVar != null) {
                aqpfVarD.aq(aqpeVar);
            }
            wer werVarE = wcnVarB.e();
            werVarE.e(aqpfVarD.I(wcnVarB));
            aamb aambVar = aaroVar.f;
            if (aambVar instanceof aama) {
                aambVar.j("transferFailureCount", aaroVar.i);
                werVarE.i(aqphVar.b(), ((aama) aaroVar.f).e());
            }
            werVarE.b().G();
        }
    }

    @Override // defpackage.aary
    public final void g() {
    }

    @Override // defpackage.aary
    public final void f(aaro aaroVar) {
    }

    @Override // defpackage.aary
    public final void h(aaro aaroVar) {
    }

    @Override // defpackage.aary
    public final void i(String str) {
    }
}

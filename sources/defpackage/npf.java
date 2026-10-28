package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npf implements nuc {
    private final awmd a;

    public npf(awmd awmdVar) {
        this.a = awmdVar;
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
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = String.format(str, objArr);
        String strY = ket.Y(asmwVar);
        aihf aihfVarCreateBuilder = aijp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((aijp) aihfVarCreateBuilder.instance).b = jCurrentTimeMillis / 1000;
        aihfVarCreateBuilder.copyOnWrite();
        ((aijp) aihfVarCreateBuilder.instance).c = (int) ((jCurrentTimeMillis % 1000) * 1000000);
        aijp aijpVar = (aijp) aihfVarCreateBuilder.build();
        aslh aslhVar2 = aslh.LOG_LEVEL_WARN;
        aihf aihfVarCreateBuilder2 = asrs.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        asrs asrsVar = (asrs) aihfVarCreateBuilder2.instance;
        asrsVar.e = (aslhVar == aslhVar2 ? 3 : 4) - 1;
        asrsVar.b |= 4;
        String strName = aslhVar.name();
        aihfVarCreateBuilder2.copyOnWrite();
        asrs asrsVar2 = (asrs) aihfVarCreateBuilder2.instance;
        strName.getClass();
        asrsVar2.b |= 8;
        asrsVar2.f = strName;
        String strCl = a.cl(strY, (byte) 32, str2);
        aihfVarCreateBuilder2.copyOnWrite();
        asrs asrsVar3 = (asrs) aihfVarCreateBuilder2.instance;
        asrsVar3.b |= 1;
        asrsVar3.c = strCl;
        aihfVarCreateBuilder2.copyOnWrite();
        asrs asrsVar4 = (asrs) aihfVarCreateBuilder2.instance;
        aijpVar.getClass();
        asrsVar4.d = aijpVar;
        asrsVar4.b |= 2;
        if (th != null) {
            String str3 = str2 + ' ' + strY + '\n' + th.toString();
            aihfVarCreateBuilder2.copyOnWrite();
            asrs asrsVar5 = (asrs) aihfVarCreateBuilder2.instance;
            asrsVar5.b |= 1;
            asrsVar5.c = str3;
            aihf aihfVarCreateBuilder3 = asrt.a.createBuilder();
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                aihf aihfVarCreateBuilder4 = asrr.a.createBuilder();
                String str4 = stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
                aihfVarCreateBuilder4.copyOnWrite();
                asrr asrrVar = (asrr) aihfVarCreateBuilder4.instance;
                asrrVar.b |= 1;
                asrrVar.c = str4;
                int lineNumber = stackTraceElement.getLineNumber();
                if (lineNumber >= 0) {
                    aihfVarCreateBuilder4.copyOnWrite();
                    asrr asrrVar2 = (asrr) aihfVarCreateBuilder4.instance;
                    asrrVar2.b |= 4;
                    asrrVar2.e = lineNumber;
                }
                String fileName = stackTraceElement.getFileName();
                if (fileName != null) {
                    aihfVarCreateBuilder4.copyOnWrite();
                    asrr asrrVar3 = (asrr) aihfVarCreateBuilder4.instance;
                    asrrVar3.b |= 2;
                    asrrVar3.d = fileName;
                }
                asrr asrrVar4 = (asrr) aihfVarCreateBuilder4.build();
                aihfVarCreateBuilder3.copyOnWrite();
                asrt asrtVar = (asrt) aihfVarCreateBuilder3.instance;
                asrrVar4.getClass();
                aiie aiieVar = asrtVar.b;
                if (!aiieVar.c()) {
                    asrtVar.b = aihn.mutableCopy(aiieVar);
                }
                asrtVar.b.add(asrrVar4);
            }
            asrt asrtVar2 = (asrt) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder2.copyOnWrite();
            asrs asrsVar6 = (asrs) aihfVarCreateBuilder2.instance;
            asrtVar2.getClass();
            asrsVar6.g = asrtVar2;
            asrsVar6.b |= 16;
        }
        ((DebuggerClient) this.a.io()).sendLog(((asrs) aihfVarCreateBuilder2.build()).toByteArray());
        if (th == null || th.getCause() == null) {
            return;
        }
        h(aslhVar, nslVar, th.getCause(), asmwVar, "Caused by:", new Object[0]);
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

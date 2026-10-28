package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adgh implements oui {
    final /* synthetic */ nuc c;

    public adgh(nuc nucVar) {
        this.c = nucVar;
    }

    @Override // defpackage.oui
    public final /* synthetic */ void a(aslh aslhVar, String str) {
        c(aslhVar, str, null);
    }

    @Override // defpackage.oui
    public final void b(String str, Throwable th) {
        c(aslh.LOG_TYPE_INTERNAL_ERROR, str, th);
    }

    @Override // defpackage.oui
    public final void c(aslh aslhVar, String str, Throwable th) {
        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
        asncVar.d = aslhVar.I;
        asncVar.b |= 2;
        if (th instanceof mhb) {
            aiov aiovVar = ((mhb) th).b().g;
            if (aiovVar == null) {
                aiovVar = aiov.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aina.b);
            aiovVar.c(aihlVarCheckIsLite);
            Object objK = aiovVar.j.k(aihlVarCheckIsLite.d);
            String str2 = ((aina) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
            aihfVarCreateBuilder.copyOnWrite();
            asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
            str2.getClass();
            asncVar2.b |= 8;
            asncVar2.f = str2;
        }
        this.c.e((asnc) aihfVarCreateBuilder.build(), th, "RenderNext: %s", str);
    }

    @Override // defpackage.oui
    public final /* synthetic */ void d() {
        b("ElementsDrawable.draw: copy failed", null);
    }
}

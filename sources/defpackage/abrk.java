package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abrk implements avnn {
    public final ahbw a;
    public final wjb b;
    public final Set c;
    public final String d;
    public final long e;

    public abrk(ahbw ahbwVar, wjb wjbVar, Set set, String str, long j) {
        this.a = ahbwVar;
        this.b = wjbVar;
        this.c = set;
        this.d = str;
        this.e = j;
    }

    @Override // defpackage.avnn
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wjf a(alvt alvtVar) {
        abmw abmwVar = abmw.MEDIASESSION;
        alvw alvwVar = alvtVar.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        String str = alvwVar.c;
        wjg wjgVar = new wjg();
        wjgVar.b = alvtVar;
        wjgVar.c = this.a.a();
        long j = this.e;
        wjgVar.b(j);
        wja wjaVarAi = wji.ai(this.b, alvtVar, j);
        if (wjaVarAi != null) {
            wjgVar.g = wjaVarAi;
        }
        wji wjiVarA = wjgVar.a();
        for (wjw wjwVar : this.c) {
            if (wjwVar != null) {
                wjwVar.a(wjiVarA);
            }
        }
        return wjiVarA;
    }
}

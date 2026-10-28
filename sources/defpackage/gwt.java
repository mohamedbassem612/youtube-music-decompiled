package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwt extends gut {
    private static final String a = kro.aA();
    private final wco b;
    private final zwb c;
    private final ahbw d;

    public gwt(wco wcoVar, zwb zwbVar, ahbw ahbwVar) {
        this.b = wcoVar;
        this.c = zwbVar;
        this.d = ahbwVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        int i;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apcr.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apcr.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        apcr apcrVar = (apcr) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        wcn wcnVarB = this.b.b(this.c.e());
        String str = a;
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = apcn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        apcn apcnVar = (apcn) aihfVarCreateBuilder.instance;
        apcnVar.b |= 1;
        apcnVar.c = str;
        apco apcoVar = new apco(aihfVarCreateBuilder);
        int i2 = apcrVar.c;
        if (i2 == 0) {
            i = 4;
        } else if (i2 == 1) {
            i = 1;
        } else if (i2 != 2) {
            i = 3;
            if (i2 != 3) {
                i = 0;
            }
        } else {
            i = 2;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            long jLongValue = i2 == 1 ? ((Long) apcrVar.d).longValue() : 0L;
            if (jLongValue > 0) {
                long epochSecond = this.d.a().plusSeconds(jLongValue).getEpochSecond();
                Long lValueOf = Long.valueOf(epochSecond);
                aihf aihfVar = apcoVar.a;
                lValueOf.getClass();
                aihfVar.copyOnWrite();
                apcn apcnVar2 = (apcn) aihfVar.instance;
                apcnVar2.b |= 2;
                apcnVar2.d = epochSecond;
            }
        } else if (i3 == 1) {
            aihf aihfVar2 = apcoVar.a;
            aihfVar2.copyOnWrite();
            apcn apcnVar3 = (apcn) aihfVar2.instance;
            apcnVar3.b &= -3;
            apcnVar3.d = 0L;
        }
        wer werVarE = wcnVarB.e();
        werVarE.m(apcoVar);
        werVarE.b().D();
    }
}

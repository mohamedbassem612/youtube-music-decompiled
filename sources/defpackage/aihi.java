package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aihi extends aihn implements aihj {
    public aiha j = aiha.a;

    final aiha a() {
        aiha aihaVar = this.j;
        if (aihaVar.c) {
            this.j = aihaVar.clone();
        }
        return this.j;
    }

    @Override // defpackage.aihj
    public final Object b(aigw aigwVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
        c(aihlVarCheckIsLite);
        Object objK = this.j.k(aihlVarCheckIsLite.d);
        return objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
    }

    public final void c(aihl aihlVar) {
        if (aihlVar.a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}

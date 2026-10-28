package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adal implements acxn {
    @Override // defpackage.acxn
    public final acxm a(akrn akrnVar) {
        akro akroVar = akrnVar.c;
        if (akroVar == null) {
            akroVar = akro.a;
        }
        return akroVar.h ? new adai(akrnVar) : new acxm(akrnVar);
    }
}

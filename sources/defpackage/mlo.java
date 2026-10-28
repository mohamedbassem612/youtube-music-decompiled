package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlo {
    private static final asmv b;
    public final ntr a;

    static {
        aihh aihhVar = (aihh) asmv.a.createBuilder();
        aihh aihhVar2 = (aihh) asow.a.createBuilder();
        aihhVar2.e(asmb.b, asmb.a);
        aihhVar.copyOnWrite();
        asmv asmvVar = (asmv) aihhVar.instance;
        asow asowVar = (asow) aihhVar2.build();
        asowVar.getClass();
        asmvVar.c = asowVar;
        asmvVar.b |= 1;
        asmv asmvVar2 = (asmv) aihhVar.build();
        b = asmvVar2;
        asmvVar2.toByteArray();
    }

    public mlo(ntr ntrVar) {
        this.a = ntrVar;
    }

    public final fgy a(fhd fhdVar, nsl nslVar, byte[] bArr, nth nthVar, avmm avmmVar) {
        return this.a.b(fhdVar, nslVar, bArr, nthVar, avmmVar);
    }

    public final fgy b(fhd fhdVar, nsl nslVar, acxm acxmVar, nth nthVar, avmm avmmVar) {
        return this.a.b(fhdVar, nslVar, acxmVar.c, nthVar, avmmVar);
    }
}

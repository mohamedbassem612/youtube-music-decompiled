package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hdy implements avlt {
    final /* synthetic */ hea a;
    private final Iterable b;
    private final String c;
    private final String d;
    private final int e;

    public hdy(hea heaVar, Iterable iterable, String str, int i, String str2) {
        this.a = heaVar;
        this.c = str;
        this.e = i;
        this.b = iterable;
        this.d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zwb] */
    @Override // defpackage.avlt
    public final void a(avls avlsVar) {
        aihf aihfVarCreateBuilder = aldw.a.createBuilder();
        String str = this.c;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aldw aldwVar = (aldw) aihfVarCreateBuilder.instance;
            aldwVar.b |= 4;
            aldwVar.f = str;
        }
        int i = this.e;
        if (i != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            aldw aldwVar2 = (aldw) aihfVarCreateBuilder.instance;
            aldwVar2.g = i - 1;
            aldwVar2.b |= 8;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aldw aldwVar3 = (aldw) aihfVarCreateBuilder.instance;
        aiie aiieVar = aldwVar3.d;
        if (!aiieVar.c()) {
            aldwVar3.d = aihn.mutableCopy(aiieVar);
        }
        hea heaVar = this.a;
        String str2 = this.d;
        aifs.addAll(this.b, aldwVar3.d);
        aihfVarCreateBuilder.copyOnWrite();
        aldw aldwVar4 = (aldw) aihfVarCreateBuilder.instance;
        str2.getClass();
        aldwVar4.b |= 2;
        aldwVar4.e = str2;
        aapz aapzVar = heaVar.h;
        heq heqVar = new heq(aapzVar, aapzVar.d.e(), aihfVarCreateBuilder);
        heqVar.m();
        taf.i(((wnh) aapzVar.f).b(heqVar, aapzVar.c, null), heaVar.a, new gtq(avlsVar, 6), new gln(avlsVar, 8), null);
    }
}

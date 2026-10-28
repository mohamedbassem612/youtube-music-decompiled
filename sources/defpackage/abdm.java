package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class abdm implements abdx {
    private final abdi a;

    public abdm(abdi abdiVar) {
        this.a = abdiVar;
    }

    @Override // defpackage.abdx
    public final void b(aayw aaywVar) {
        int iOrdinal = aaywVar.b.ordinal();
        if (iOrdinal == 0) {
            abdi abdiVar = this.a;
            abdiVar.l(abdiVar.p(aaywVar.e));
            return;
        }
        if (iOrdinal == 1) {
            abdi abdiVar2 = this.a;
            ajwo ajwoVar = aaywVar.e;
            if (abdiVar2.o(ajwoVar)) {
                abdiVar2.l(abdiVar2.p(ajwoVar));
                abdiVar2.b(ajwoVar);
                return;
            }
            return;
        }
        if (iOrdinal == 3) {
            abdi abdiVar3 = this.a;
            ajwo ajwoVar2 = aaywVar.e;
            if (abdiVar3.o(ajwoVar2)) {
                abdiVar3.l(abdiVar3.p(ajwoVar2));
                abdiVar3.b(ajwoVar2);
            }
            abdiVar3.g(aaywVar.c, aaywVar.f);
            return;
        }
        if (iOrdinal == 4) {
            abdi abdiVar4 = this.a;
            ajwo ajwoVar3 = aaywVar.e;
            if (abdiVar4.o(ajwoVar3)) {
                abdiVar4.l(abdiVar4.p(ajwoVar3));
                abdiVar4.b(ajwoVar3);
                abdiVar4.g(aaywVar.c, aaywVar.f);
            }
            abdiVar4.r(abdiVar4.d, aaywVar.d, abdiVar4.e);
        }
    }

    @Override // defpackage.abdx
    public final /* synthetic */ void a() {
    }
}

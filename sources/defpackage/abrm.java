package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abrm implements avnn {
    private final wjz a;

    public abrm(wjz wjzVar) {
        this.a = wjzVar;
    }

    @Override // defpackage.avnn
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wgi a(alyi alyiVar) {
        int i = alyiVar.e;
        if (i == 5) {
            throw new ExecutionException(alyiVar.e == 5 ? (String) alyiVar.f : "", null);
        }
        amae amaeVar = i == 3 ? (amae) alyiVar.f : amae.a;
        this.a.a(amaeVar);
        return new wgi(amaeVar);
    }
}

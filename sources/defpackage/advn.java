package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class advn extends admu implements advo {
    @Override // defpackage.advo
    public void b(advl advlVar) {
        if (advlVar == null) {
            if (isEmpty()) {
                return;
            }
            clear();
        } else if (isEmpty()) {
            add(advlVar);
        } else if (((advl) get(0)) != advlVar) {
            hM(0, advlVar);
        }
    }

    @Override // defpackage.admu, defpackage.adkz
    public /* bridge */ /* synthetic */ void h(adky adkyVar) {
        super.hK(adkyVar);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cox extends cna {
    private final bss c;

    public cox(btn btnVar, bss bssVar) {
        super(btnVar);
        this.c = bssVar;
    }

    @Override // defpackage.cna, defpackage.btn
    public final btm e(int i, btm btmVar, long j) {
        super.e(i, btmVar, j);
        bss bssVar = this.c;
        btmVar.d = bssVar;
        bsp bspVar = bssVar.c;
        btmVar.c = bspVar != null ? bspVar.h : null;
        return btmVar;
    }
}

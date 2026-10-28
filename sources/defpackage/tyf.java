package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tyf implements tyh {
    private final ast a;

    public tyf(ast astVar) {
        this.a = astVar;
    }

    @Override // defpackage.tyh
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        asv asvVar = (asv) layoutParams;
        ast astVar = asvVar.a;
        ast astVar2 = this.a;
        if (astVar == astVar2) {
            return false;
        }
        asvVar.b(astVar2);
        return true;
    }
}

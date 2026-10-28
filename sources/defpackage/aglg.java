package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aglg extends agki {
    private static final long serialVersionUID = 0;
    private final Comparator a;

    public aglg(aglh aglhVar) {
        super(aglhVar);
        this.a = aglhVar.comparator();
    }

    @Override // defpackage.agki
    public final /* bridge */ /* synthetic */ agkh a(int i) {
        return new agld(this.a);
    }
}

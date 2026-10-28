package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fzh implements Comparator {
    final /* synthetic */ fys a;
    final /* synthetic */ kwq b;

    public fzh(fys fysVar, kwq kwqVar) {
        this.a = fysVar;
        this.b = kwqVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        fyy fyyVar = (fyy) obj;
        fyy fyyVar2 = (fyy) obj2;
        if (fyyVar instanceof fzc) {
            return fyyVar2 instanceof fzc ? 0 : 1;
        }
        if (fyyVar2 instanceof fzc) {
            return -1;
        }
        fys fysVar = this.a;
        return fysVar == null ? fyyVar.i().compareTo(fyyVar2.i()) : (int) fxw.a(fysVar.a(this.b, Arrays.asList(fyyVar, fyyVar2)).h().doubleValue());
    }
}

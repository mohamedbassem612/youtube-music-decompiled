package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class bhv extends bhy {
    private static final long serialVersionUID = 1;

    @Override // defpackage.bhy, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new lwu(this, 1);
    }
}

package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acau extends tzk {
    final /* synthetic */ boolean a;
    final /* synthetic */ abmt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acau(boolean z, abmt abmtVar) {
        super(null);
        this.a = z;
        this.b = abmtVar;
    }

    @Override // defpackage.tzk
    public final void G(Deque deque, Attributes attributes, String str) {
        deque.pollFirst();
    }

    @Override // defpackage.tzk
    public final void H(Deque deque, Attributes attributes) {
        deque.offerFirst(new acbm(this.a, this.b));
    }
}

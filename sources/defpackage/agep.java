package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agep extends ager {
    final /* synthetic */ ager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agep(ager agerVar, ager agerVar2) {
        super(agerVar2);
        this.a = agerVar;
    }

    @Override // defpackage.ager
    public final String b(Iterable iterable) {
        return e(iterable.iterator());
    }

    @Override // defpackage.ager
    public final void c(Appendable appendable, Iterator it) throws IOException {
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                appendable.append(this.a.a(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                ager agerVar = this.a;
                appendable.append(agerVar.c);
                appendable.append(agerVar.a(next2));
            }
        }
    }
}

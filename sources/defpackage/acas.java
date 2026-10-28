package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acas extends tzk {
    final /* synthetic */ boolean a;
    final /* synthetic */ abmt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acas(boolean z, abmt abmtVar) {
        super(null);
        this.a = z;
        this.b = abmtVar;
    }

    @Override // defpackage.tzk
    public final void G(Deque deque, Attributes attributes, String str) {
        if ("3".equals(attributes.getValue("format"))) {
            acbp acbpVar = (acbp) deque.peekFirst();
            if (acbpVar == null) {
                return;
            }
            acbq acbqVar = acbpVar.f;
            if (acbqVar != null) {
                acbpVar.g(acbqVar);
            }
        }
        deque.pollFirst();
    }

    @Override // defpackage.tzk
    public final void H(Deque deque, Attributes attributes) {
        boolean zEquals = "3".equals(attributes.getValue("format"));
        boolean z = this.a;
        if (zEquals) {
            deque.offerFirst(new acbp(z, this.b));
        } else {
            deque.offerFirst(new acbm(z, this.b));
        }
    }
}

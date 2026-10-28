package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wnm extends wnl {
    private final Set a;

    public wnm(wlp wlpVar, tgg tggVar, MessageLite messageLite, Set set, sya syaVar, sxz sxzVar) {
        super(wlpVar, tggVar, messageLite, syaVar, sxzVar);
        set.getClass();
        this.a = set;
    }

    @Override // defpackage.wnl
    public final void l(MessageLite messageLite) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wjz) it.next()).a(messageLite);
        }
    }

    public wnm(wlp wlpVar, tgg tggVar, MessageLite messageLite, wjz wjzVar, sya syaVar, sxz sxzVar) {
        this(wlpVar, tggVar, messageLite, new agqj(wjzVar), syaVar, sxzVar);
    }
}

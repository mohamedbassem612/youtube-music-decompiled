package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fim extends fip implements fiu, fin {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fim() {
        super(null, -1048037474, null);
        Map map = fgy.h;
        this.b = this;
    }

    public abstract void b(ComponentTree componentTree, Exception exc);

    @Override // defpackage.fip
    public final /* synthetic */ void gK(Object obj) {
        z(this, (isw) obj);
    }

    @Override // defpackage.fin
    public final Object z(fip fipVar, Object obj) {
        int i = fipVar.c;
        Map map = fgy.h;
        if (i != -1048037474) {
            return null;
        }
        isw iswVar = (isw) obj;
        Object obj2 = iswVar.b;
        Object obj3 = iswVar.a;
        azs.l(obj3);
        b((ComponentTree) obj3, (Exception) obj2);
        return null;
    }

    @Override // defpackage.fiu
    public final fin n() {
        return this;
    }
}

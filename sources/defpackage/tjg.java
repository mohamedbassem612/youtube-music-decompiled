package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tjg implements tjj {
    private final tic a;
    private final axff b = new axfi(false);
    private final Map c = new LinkedHashMap();

    public tjg(tic ticVar) {
        this.a = ticVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.tjj
    public final Object a(String str, tns tnsVar, Function0 function0, awoq awoqVar) throws Throwable {
        tje tjeVar;
        tid tidVarA;
        axff axffVar;
        if (awoqVar instanceof tje) {
            tjeVar = (tje) awoqVar;
            int i = tjeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjeVar.c = i - Integer.MIN_VALUE;
            } else {
                tjeVar = new tje(this, awoqVar);
            }
        } else {
            tjeVar = new tje(this, awoqVar);
        }
        Object obj = tjeVar.a;
        Object tjiVar = awox.a;
        int i2 = tjeVar.c;
        boolean z = true;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                tidVarA = this.a.a(str, tnsVar);
                axffVar = this.b;
                tjeVar.d = (tig) function0;
                tjeVar.e = tidVarA;
                tjeVar.f = (axfi) axffVar;
                tjeVar.c = 1;
                if (axffVar.a(tjeVar) != tjiVar) {
                }
                return tjiVar;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            axffVar = tjeVar.f;
            tidVarA = tjeVar.e;
            function0 = tjeVar.d;
            atqp.j(obj);
            Map map = this.c;
            Object objInvoke = map.get(tidVarA);
            if (objInvoke == null) {
                objInvoke = function0.invoke();
                map.put(tidVarA, objInvoke);
                z = false;
            }
            tjiVar = new tji((awuz) objInvoke, z);
            return tjiVar;
        } finally {
            axffVar.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.tjj
    public final Object b(String str, tns tnsVar, awoq awoqVar) throws Throwable {
        tjf tjfVar;
        tid tidVarA;
        axff axffVar;
        if (awoqVar instanceof tjf) {
            tjfVar = (tjf) awoqVar;
            int i = tjfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjfVar.c = i - Integer.MIN_VALUE;
            } else {
                tjfVar = new tjf(this, awoqVar);
            }
        } else {
            tjfVar = new tjf(this, awoqVar);
        }
        Object obj = tjfVar.a;
        awox awoxVar = awox.a;
        int i2 = tjfVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            tidVarA = this.a.a(str, tnsVar);
            axffVar = this.b;
            tjfVar.d = tidVarA;
            tjfVar.e = (axfi) axffVar;
            tjfVar.c = 1;
            if (axffVar.a(tjfVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            axffVar = tjfVar.e;
            tidVarA = tjfVar.d;
            atqp.j(obj);
        }
        try {
            return awmy.a;
        } finally {
            axffVar.c();
        }
    }

    @Override // defpackage.tjj
    public final List c(String str, tns tnsVar) {
        return awno.a;
    }
}

package defpackage;

import j$.util.Optional;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class xjm {
    public final xjq a;

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    protected xjm(String str, xkd xkdVar) {
        xjq xjtVar;
        tqj tqjVar = xkdVar.f;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073814149)) {
                xjtVar = new xjp(str, xkdVar);
            } else {
                xjtVar = new xjt(str, xkdVar);
            }
        } else {
            xjtVar = new xjt(str, xkdVar);
        }
        this.a = xjtVar;
    }

    static /* synthetic */ void h(String str, aihf aihfVar) {
        aihf aihfVarD = xjl.d(aihfVar);
        Optional optionalOfNullable = Optional.ofNullable(amjs.a(Integer.parseInt(str)));
        aihfVarD.getClass();
        xdd xddVar = new xdd(aihfVarD, 5);
        if (true == optionalOfNullable.isPresent()) {
            Object obj = optionalOfNullable.get();
            aihf aihfVar2 = (aihf) xddVar.a;
            aihfVar2.copyOnWrite();
            amiw amiwVar = (amiw) aihfVar2.instance;
            amiw amiwVar2 = amiw.a;
            amiwVar.f = ((amjs) obj).i;
            amiwVar.b |= 16;
        }
        amiw amiwVar3 = (amiw) aihfVarD.build();
        aihfVar.copyOnWrite();
        amiu amiuVar = (amiu) aihfVar.instance;
        amiu amiuVar2 = amiu.a;
        amiwVar3.getClass();
        amiuVar.N = amiwVar3;
        amiuVar.d |= 8;
    }

    protected void a(tas tasVar, Set set, Set set2) {
        this.a.d(tasVar, set, set2);
    }

    public gdk b() {
        return this.a.a();
    }

    protected boolean c(tas tasVar) {
        return this.a.h(tasVar);
    }

    public final void d() {
        this.a.c();
    }

    protected final void e(String str) {
        this.a.e(str);
    }

    protected final void f(String str, String str2) {
        this.a.f(str, str2);
    }

    public final boolean g() {
        return this.a.g();
    }
}

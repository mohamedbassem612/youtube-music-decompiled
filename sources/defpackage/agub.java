package defpackage;

import dalvik.system.VMStack;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class agub extends agtt {
    @Override // defpackage.agtt
    public agro a(Class cls, int i) {
        return agro.a;
    }

    @Override // defpackage.agtt
    public String b(Class cls) {
        StackTraceElement stackTraceElementA;
        if (agud.a) {
            try {
                if (cls.equals(agud.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        if (!agud.b || (stackTraceElementA = agvl.a(cls, 1)) == null) {
            return null;
        }
        return stackTraceElementA.getClassName();
    }
}

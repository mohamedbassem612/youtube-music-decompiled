package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agus extends agtt {
    public static final agtt a = new agus();

    @Override // defpackage.agtt
    public final agro a(Class cls, int i) {
        StackTraceElement stackTraceElementA = agvl.a(cls, i + 1);
        return stackTraceElementA != null ? new agsh(stackTraceElementA) : agro.a;
    }

    @Override // defpackage.agtt
    public final String b(Class cls) {
        StackTraceElement stackTraceElementA = agvl.a(cls, 1);
        if (stackTraceElementA != null) {
            return stackTraceElementA.getClassName();
        }
        throw new IllegalStateException("no caller found on the stack for: ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }
}

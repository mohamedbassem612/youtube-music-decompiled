package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class awre extends awrh implements Function0, awsj {
    public awre(Object obj, Class cls) {
        super(obj, cls, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
    }

    public final awsg a() {
        return ((awre) getReflected()).a();
    }

    public Object b() {
        return a().call(new Object[0]);
    }

    @Override // defpackage.awqt
    protected final awsc computeReflected() {
        int i = awrn.a;
        return this;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return b();
    }
}

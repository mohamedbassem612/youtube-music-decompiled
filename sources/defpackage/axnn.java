package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetUrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axnn implements Runnable {
    private final /* synthetic */ int $cid;
    public Object a;
    final /* synthetic */ Object b;

    public axnn(axdl axdlVar, Runnable runnable, int i) {
        this.$cid = i;
        this.b = axdlVar;
        this.a = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid == 0) {
            Object obj = this.b;
            ((CronetUrlRequest) obj).a();
            Object obj2 = this.a;
            this.a = null;
            try {
                synchronized (((CronetUrlRequest) obj).d) {
                    try {
                        if (!((CronetUrlRequest) obj).h()) {
                            ((CronetUrlRequest) obj).c = true;
                            ((CronetUrlRequest) obj).f.onReadCompleted((UrlRequest) obj, ((CronetUrlRequest) obj).h, (ByteBuffer) obj2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            } catch (Exception e) {
                ((CronetUrlRequest) this.b).e(e);
                return;
            }
        }
        int i = 0;
        while (true) {
            try {
                this.a.run();
            } catch (Throwable th2) {
                awrc.Q(awov.a, th2);
            }
            try {
                ?? r2 = this.b;
                Runnable runnableH = ((axdl) r2).h();
                if (runnableH == null) {
                    return;
                }
                this.a = runnableH;
                i++;
                if (i >= 16) {
                    awuq awuqVar = ((axdl) r2).a;
                    try {
                        if (awuqVar.fX(r2)) {
                            ?? r0 = this.b;
                            awuq awuqVar2 = ((axdl) r0).a;
                            try {
                                awuqVar2.a(r0, this);
                                return;
                            } catch (Throwable th3) {
                                throw new awve(th3, awuqVar2, r0);
                            }
                        }
                    } catch (Throwable th4) {
                        throw new awve(th4, awuqVar, r2);
                    }
                }
            } catch (Throwable th5) {
                Object obj3 = this.b;
                synchronized (((axdl) obj3).c) {
                    ((axdl) obj3).b.a();
                    throw th5;
                }
            }
        }
    }

    public axnn(CronetUrlRequest cronetUrlRequest, int i) {
        this.$cid = i;
        this.b = cronetUrlRequest;
    }
}

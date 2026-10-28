package defpackage;

import internal.org.jni_zero.JniZero;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfs extends awpk implements awqg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ bft d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfs(bft bftVar, awoq awoqVar) {
        super(1, awoqVar);
        this.d = bftVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new bfs(this.d, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((bfs) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
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
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Exception {
        ?? r0;
        ?? r1;
        awox awoxVar = awox.a;
        ?? r2 = this.c;
        try {
            try {
                try {
                    if (r2 == 0) {
                        atqp.j(obj);
                        bft bftVar = this.d;
                        FileInputStream fileInputStream = new FileInputStream(bftVar.a);
                        bgh bghVar = bftVar.b;
                        this.a = fileInputStream;
                        this.b = null;
                        this.c = 1;
                        obj = bghVar.b(fileInputStream);
                        r2 = fileInputStream;
                        if (obj == awoxVar) {
                            return awoxVar;
                        }
                    } else {
                        if (r2 != 1) {
                            r0 = this.b;
                            try {
                                atqp.j(obj);
                                r1 = r0;
                                JniZero.l(r1, null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    JniZero.l(r0, th);
                                    throw th2;
                                }
                            }
                        }
                        Object obj2 = this.a;
                        atqp.j(obj);
                        r2 = obj2;
                    }
                    JniZero.l(r2, null);
                } catch (FileNotFoundException unused) {
                    bft bftVar2 = this.d;
                    File file = bftVar2.a;
                    if (!file.exists()) {
                        return this.d.b.a();
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        bgh bghVar2 = bftVar2.b;
                        this.a = null;
                        this.b = fileInputStream2;
                        this.c = 2;
                        obj = bghVar2.b(fileInputStream2);
                        if (obj == awoxVar) {
                            return awoxVar;
                        }
                        r1 = fileInputStream2;
                    } catch (Throwable th3) {
                        th = th3;
                        r0 = fileInputStream2;
                        throw th;
                    }
                }
                return obj;
            } catch (Exception e) {
                if (e instanceof FileNotFoundException) {
                    throw acq.c(this.d.a.getParent(), e);
                }
                throw e;
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                JniZero.l(r2, th4);
                throw th5;
            }
        }
    }
}

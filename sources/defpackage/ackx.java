package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ackx extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    long d;
    int e;
    final /* synthetic */ acky f;
    final /* synthetic */ Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ackx(acky ackyVar, Context context, awoq awoqVar) {
        super(2, awoqVar);
        this.f = ackyVar;
        this.g = context;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new ackx(this.f, this.g, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ackx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[Catch: all -> 0x00c9, TryCatch #4 {all -> 0x00c9, blocks: (B:6:0x0012, B:20:0x0067, B:35:0x00a4, B:36:0x00ac, B:42:0x00c2, B:45:0x00c6, B:46:0x00c7, B:28:0x0073, B:31:0x009a, B:47:0x00c8, B:37:0x00ad, B:40:0x00b6, B:41:0x00bd), top: B:59:0x0008, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6 A[Catch: all -> 0x00c5, TryCatch #2 {, blocks: (B:37:0x00ad, B:40:0x00b6, B:41:0x00bd), top: B:58:0x00ad, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #2 {, blocks: (B:37:0x00ad, B:40:0x00b6, B:41:0x00bd), top: B:58:0x00ad, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8 A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #4 {all -> 0x00c9, blocks: (B:6:0x0012, B:20:0x0067, B:35:0x00a4, B:36:0x00ac, B:42:0x00c2, B:45:0x00c6, B:46:0x00c7, B:28:0x0073, B:31:0x009a, B:47:0x00c8, B:37:0x00ad, B:40:0x00b6, B:41:0x00bd), top: B:59:0x0008, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [ackx, awoq] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2, types: [axff] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v9, types: [axff] */
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
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4;
        OutOfMemoryError e;
        Object obj5;
        long j;
        Exception e2;
        ?? r5;
        awox awoxVar = awox.a;
        int i = this.e;
        Typeface typeface = null;
        try {
            try {
                if (i == 0) {
                    atqp.j(obj);
                    acky ackyVar = this.f;
                    obj2 = this.g;
                    axff axffVar = ackyVar.g;
                    this.a = axffVar;
                    this.b = ackyVar;
                    this.c = obj2;
                    this.e = 1;
                    if (axffVar.a(this) == awoxVar) {
                        return awoxVar;
                    }
                    obj3 = ackyVar;
                    obj4 = axffVar;
                } else {
                    if (i != 1) {
                        j = this.d;
                        obj3 = this.b;
                        obj5 = this.a;
                        try {
                            atqp.j(obj);
                            obj5 = obj5;
                            typeface = (Typeface) obj;
                            this = obj5;
                        } catch (Exception e3) {
                            e2 = e3;
                            this = obj5;
                            if (e2 instanceof CancellationException) {
                                throw e2;
                            }
                        } catch (OutOfMemoryError e4) {
                            e = e4;
                            ((agrc) ((agrc) acky.a.c()).j(e).k("com/google/android/libraries/youtube/proto/formatted/font/engine/FontLoader", "triggerAsyncLoad$<anonymous>$<anonymous>", 330, "FontLoader.kt")).u("OOM loading font asynchronously for resId=%d", ((acky) obj3).b);
                            this = obj5;
                        }
                        if (j >= 0) {
                            ((acky) obj3).c.c();
                        }
                        synchronized (obj3) {
                            if (((acky) obj3).d == null) {
                                if (typeface == null) {
                                    ((acky) obj3).e = true;
                                } else {
                                    ((acky) obj3).d = typeface;
                                }
                            }
                        }
                        r5 = this;
                        r5 = obj4;
                        r5.c();
                        return awmy.a;
                    }
                    obj2 = this.c;
                    obj3 = this.b;
                    Object obj6 = this.a;
                    atqp.j(obj);
                    obj4 = obj6;
                }
                r5 = obj4;
                if (((acky) obj3).d == null && !((acky) obj3).e) {
                    r5 = obj4;
                    try {
                        axlj axljVar = ((acky) obj3).h;
                        int i2 = ((acky) obj3).b;
                        this.a = obj4;
                        this.b = obj3;
                        this.c = null;
                        this.d = -1L;
                        this.e = 2;
                        obj = axljVar.G((Context) obj2, i2, this);
                        if (obj == awoxVar) {
                            return awoxVar;
                        }
                        obj5 = obj4;
                        j = -1;
                        typeface = (Typeface) obj;
                        this = obj5;
                        if (j >= 0) {
                            ((acky) obj3).c.c();
                        }
                        synchronized (obj3) {
                            if (((acky) obj3).d == null) {
                                if (typeface == null) {
                                    ((acky) obj3).e = true;
                                } else {
                                    ((acky) obj3).d = typeface;
                                }
                            }
                            r5 = this;
                        }
                    } catch (Exception e5) {
                        e2 = e5;
                        obj5 = obj4;
                        j = -1;
                        this = obj5;
                        if (e2 instanceof CancellationException) {
                            throw e2;
                        }
                    } catch (OutOfMemoryError e6) {
                        e = e6;
                        obj5 = obj4;
                        j = -1;
                        ((agrc) ((agrc) acky.a.c()).j(e).k("com/google/android/libraries/youtube/proto/formatted/font/engine/FontLoader", "triggerAsyncLoad$<anonymous>$<anonymous>", 330, "FontLoader.kt")).u("OOM loading font asynchronously for resId=%d", ((acky) obj3).b);
                        this = obj5;
                    }
                }
                r5 = obj4;
                r5.c();
                return awmy.a;
            } catch (Throwable th) {
                th = th;
                this = obj4;
                this.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            this.c();
            throw th;
        }
    }
}

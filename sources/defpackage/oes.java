package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oes implements oel, obi {
    public final Context a;
    public final ahex b;
    private final oaq c;
    private final obc e;
    private final omj g;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private ListenableFuture f = aher.a;

    public oes(Context context, omj omjVar, ahex ahexVar, oaq oaqVar, obc obcVar) {
        this.a = context;
        this.g = omjVar;
        this.b = ahexVar;
        this.c = oaqVar;
        this.e = obcVar;
    }

    @Override // defpackage.obi
    public final ListenableFuture a() {
        if (this.d.getAndSet(true)) {
            return aher.a;
        }
        if (!this.c.i) {
            return aher.a;
        }
        final SettableFuture settableFutureCreate = SettableFuture.create();
        this.f = settableFutureCreate;
        this.g.l(53, new Runnable() { // from class: oep
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e(1, 0L, settableFutureCreate);
            }
        });
        return aher.a;
    }

    @Override // defpackage.oel
    public final void b(Map map) {
        map.put("gs", this.f);
    }

    @Override // defpackage.oel
    public final void c(Map map) {
        map.put("gs", this.f);
    }

    @Override // defpackage.oel
    public final void d(Map map, Context context) {
        map.put("gs", this.f);
    }

    public final void e(final int i, final long j, final SettableFuture settableFuture) {
        Runnable runnable = new Runnable() { // from class: oer
            @Override // java.lang.Runnable
            public final void run() {
                final oes oesVar = this.a;
                final SettableFuture settableFuture2 = settableFuture;
                final int i2 = i;
                final long j2 = j;
                oesVar.b.execute(new Runnable() { // from class: oeq
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
                        oes oesVar2 = oesVar;
                        SettableFuture settableFuture3 = settableFuture2;
                        try {
                            Context context = oesVar2.a;
                            fxl fxlVarF = new kwf(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode)).f();
                            if (fxlVarF != null && ((fxlVarF.b & 524288) == 0 || fxlVarF.q != 32768)) {
                                settableFuture3.set(fxlVarF);
                                return;
                            }
                        } catch (Throwable unused) {
                        }
                        int i3 = i2;
                        if (i3 < 3) {
                            oesVar2.e(i3 + 1, i3 == 1 ? 100L : j2 << 1, settableFuture3);
                        } else {
                            settableFuture3.set(null);
                        }
                    }
                });
            }
        };
        if (j > 0) {
            this.e.b(runnable, j);
        } else {
            runnable.run();
        }
    }
}

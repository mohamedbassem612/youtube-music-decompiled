package defpackage;

import android.media.AudioFormat;
import android.text.TextUtils;
import android.util.Size;
import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.Control;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.InputFrameSource;
import j$.util.Collection;
import j$.util.Optional;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rha extends atuv implements rhu {
    public static final /* synthetic */ int d = 0;
    private static final rbm o = new rbm("rha");
    public final Object a;
    public volatile Optional b;
    public agke c;
    private final Object m;
    private boolean n;

    public rha(atwd atwdVar, atwc atwcVar, atth atthVar) {
        super(atwdVar, atwcVar, atthVar);
        this.a = new Object();
        this.m = new Object();
        this.b = Optional.empty();
        this.c = agpi.a;
    }

    public static String b(String str, String str2) {
        new rbc(o, rbd.b).a("Coalescing errors: %s, %s", str, str2);
        if (TextUtils.equals(str2, "xeno::effect::EffectWasReconfiguredStatus()")) {
            return "xeno::effect::EffectWasReconfiguredStatus()";
        }
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    @Override // defpackage.rhu
    public final agke a() {
        agke agkeVar;
        synchronized (this.a) {
            agkeVar = this.c;
        }
        return agkeVar;
    }

    @Override // defpackage.atvq, defpackage.rhu
    public final void c() {
        synchronized (this.m) {
            super.c();
            this.n = true;
        }
    }

    @Override // defpackage.rhu
    public final void d(final agke agkeVar, final Callbacks$StatusCallback callbacks$StatusCallback) {
        synchronized (this.m) {
            if (this.n) {
                callbacks$StatusCallback.onCompletion(false, "Processor has already been released");
                return;
            }
            axoz axozVarG = axoz.g(agkeVar, new HashSet());
            if (axozVarG != null) {
                p(new axoz(axozVarG, ahub.M()), new atva() { // from class: rgz
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
                    @Override // defpackage.atva
                    public final void a(String str, axoz axozVar) {
                        agqh agqhVarAe;
                        Callbacks$StatusCallback callbacks$StatusCallback2 = callbacks$StatusCallback;
                        if (axozVar == null) {
                            callbacks$StatusCallback2.onCompletion(str == null, str);
                            return;
                        }
                        agke agkeVar2 = agkeVar;
                        String strB = rha.b(str, (String) axozVar.b);
                        int size = agkeVar2.size();
                        for (int i = 0; i < size; i++) {
                            strB = rha.b(strB, (String) ((agkj) axozVar.a).get((Effect) agkeVar2.get(i)));
                        }
                        boolean z = strB == null;
                        if (!z) {
                            agkeVar2 = agpi.a;
                        }
                        rha rhaVar = this.a;
                        synchronized (rhaVar.a) {
                            agqhVarAe = ahng.ae(agkz.n(rhaVar.c), agkz.n(agkeVar2));
                            rhaVar.c = agkeVar2;
                        }
                        agke agkeVar3 = (agke) Collection.EL.stream(agqhVarAe).flatMap(new rcs(16)).collect(aghu.a);
                        int size2 = agkeVar3.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            Optional optionalOfNullable = Optional.ofNullable(((Control) agkeVar3.get(i2)).b);
                            if (true == optionalOfNullable.isPresent()) {
                                ((Control.GpuBufferSetting) optionalOfNullable.get()).a(null);
                            }
                        }
                        callbacks$StatusCallback2.onCompletion(z, strB);
                    }
                });
                return;
            }
            rbc rbcVar = new rbc(o, rbd.d);
            rbcVar.c();
            rbcVar.a("Invalid effect order", new Object[0]);
            callbacks$StatusCallback.onCompletion(false, "Invalid effect order");
            synchronized (this.a) {
                try {
                    this.c = agpi.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.rhu
    public final void e(final InputFrameSource inputFrameSource, final Size size) {
        final AudioFormat audioFormat = (AudioFormat) this.b.orElse(null);
        iD(new atvh() { // from class: atvc
            @Override // defpackage.atvh
            public final void a(long j) {
                int channelCount;
                int i;
                int i2 = atuv.e;
                Size size2 = size;
                long width = size2.getWidth();
                long height = size2.getHeight();
                AudioFormat audioFormat2 = audioFormat;
                if (audioFormat2 == null) {
                    i = 0;
                    channelCount = 0;
                } else {
                    int sampleRate = audioFormat2.getSampleRate();
                    channelCount = audioFormat2.getChannelCount();
                    i = sampleRate;
                }
                atuv.nativeLifecycleStartProcessing(j, inputFrameSource.e, width, height, i, channelCount, new atuw(null));
            }
        });
    }

    @Override // defpackage.rhu
    public final void f() {
        k(null);
    }
}

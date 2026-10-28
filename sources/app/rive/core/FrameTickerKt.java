package app.rive.core;

import android.view.Choreographer;
import defpackage.aok;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awou;
import defpackage.awox;
import defpackage.awpg;
import defpackage.awpk;
import defpackage.awqg;
import defpackage.awqk;
import defpackage.awro;
import defpackage.awud;
import defpackage.awut;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class FrameTickerKt {
    private static final FrameTicker ChoreographerFrameTicker = FrameTickerKt$ChoreographerFrameTicker$1.INSTANCE;
    private static final FrameTicker ComposeFrameTicker = new FrameTicker() { // from class: app.rive.core.FrameTickerKt$ComposeFrameTicker$1

        /* JADX INFO: renamed from: app.rive.core.FrameTickerKt$ComposeFrameTicker$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: PG */
        final class AnonymousClass1 extends awpk implements awqk {
            final /* synthetic */ awqg $onFrame;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(awqg awqgVar, awoq awoqVar) {
                super(2, awoqVar);
                this.$onFrame = awqgVar;
            }

            static final awmy invokeSuspend$lambda$0(awqg awqgVar, long j) {
                awqgVar.invoke(Long.valueOf(j));
                return awmy.a;
            }

            @Override // defpackage.awpe
            public final awoq create(Object obj, awoq awoqVar) {
                return new AnonymousClass1(this.$onFrame, awoqVar);
            }

            @Override // defpackage.awqk
            public final Object invoke(awut awutVar, awoq awoqVar) {
                return ((AnonymousClass1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
            }

            @Override // defpackage.awpe
            public final Object invokeSuspend(Object obj) throws Throwable {
                awox awoxVar = awox.a;
                int i = this.label;
                if (i == 0) {
                    atqp.j(obj);
                    final awqg awqgVar = this.$onFrame;
                    awqg awqgVar2 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: CONSTRUCTOR (r1v1 'awqgVar2' awqg) = (r4v1 'awqgVar' awqg A[DONT_INLINE]) A[DECLARE_VAR, MD:(awqg):void (m)] (LINE:29) call: app.rive.core.FrameTickerKt$ComposeFrameTicker$1$1$$ExternalSyntheticLambda0.<init>(awqg):void type: CONSTRUCTOR in method: app.rive.core.FrameTickerKt$ComposeFrameTicker$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: app.rive.core.FrameTickerKt$ComposeFrameTicker$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 21 more
                        */
                    /*
                        this = this;
                        awox r0 = defpackage.awox.a
                        int r1 = r3.label
                        r2 = 1
                        if (r1 == 0) goto L15
                        if (r1 != r2) goto Ld
                        defpackage.atqp.j(r4)
                        goto L27
                    Ld:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        r3.<init>(r4)
                        throw r3
                    L15:
                        defpackage.atqp.j(r4)
                        awqg r4 = r3.$onFrame
                        app.rive.core.FrameTickerKt$ComposeFrameTicker$1$1$$ExternalSyntheticLambda0 r1 = new app.rive.core.FrameTickerKt$ComposeFrameTicker$1$1$$ExternalSyntheticLambda0
                        r1.<init>(r4)
                        r3.label = r2
                        java.lang.Object r3 = defpackage.aie.b(r1, r3)
                        if (r3 == r0) goto L29
                    L27:
                        awmy r0 = defpackage.awmy.a
                    L29:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.rive.core.FrameTickerKt$ComposeFrameTicker$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // app.rive.core.FrameTicker
            public final Object withFrame(awqg awqgVar, awoq awoqVar) throws Throwable {
                Object objP = awro.p((awou) aok.a.a(), new AnonymousClass1(awqgVar, null), awoqVar);
                return objP != awox.a ? awmy.a : objP;
            }
        };

        /* JADX INFO: renamed from: app.rive.core.FrameTickerKt$withFrameNanosChoreographer$1, reason: invalid class name */
        /* JADX INFO: compiled from: PG */
        final class AnonymousClass1 extends awpg {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(awoq awoqVar) {
                super(awoqVar);
            }

            @Override // defpackage.awpe
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FrameTickerKt.withFrameNanosChoreographer(null, this);
            }
        }

        public static final FrameTicker getChoreographerFrameTicker() {
            return ChoreographerFrameTicker;
        }

        public static final FrameTicker getComposeFrameTicker() {
            return ComposeFrameTicker;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object withFrameNanosChoreographer(awqg awqgVar, awoq awoqVar) {
            AnonymousClass1 anonymousClass1;
            if (awoqVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) awoqVar;
                int i = anonymousClass1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(awoqVar);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(awoqVar);
            }
            Object objJ = anonymousClass1.result;
            awox awoxVar = awox.a;
            int i2 = anonymousClass1.label;
            if (i2 == 0) {
                atqp.j(objJ);
                anonymousClass1.L$0 = awqgVar;
                anonymousClass1.label = 1;
                final awud awudVar = new awud(JniZero.q(anonymousClass1), 1);
                awudVar.w();
                final Choreographer choreographer = Choreographer.getInstance();
                final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: app.rive.core.FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$onFrameCallback$1
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        awudVar.resumeWith(Long.valueOf(j));
                    }
                };
                choreographer.postFrameCallback(frameCallback);
                awudVar.b(new awqg() { // from class: app.rive.core.FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$1
                    @Override // defpackage.awqg
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return awmy.a;
                    }

                    public final void invoke(Throwable th) {
                        choreographer.removeFrameCallback(frameCallback);
                    }
                });
                objJ = awudVar.j();
                if (objJ == awoxVar) {
                    anonymousClass1.getClass();
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awqgVar = (awqg) anonymousClass1.L$0;
                atqp.j(objJ);
            }
            return awqgVar.invoke(new Long(((Number) objJ).longValue()));
        }
    }

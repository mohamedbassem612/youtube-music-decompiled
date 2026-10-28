package app.rive;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import app.rive.core.ArtboardHandle;
import app.rive.core.CommandQueue;
import app.rive.core.RiveSurface;
import app.rive.core.StateMachineHandle;
import app.rive.core.SurfaceTextureSurface;
import defpackage.a;
import defpackage.alh;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.awrl;
import defpackage.awro;
import defpackage.awtl;
import defpackage.awtn;
import defpackage.awuq;
import defpackage.awut;
import defpackage.awvi;
import defpackage.awwo;
import defpackage.awxf;
import defpackage.axds;
import defpackage.bob;
import defpackage.boc;
import defpackage.bod;
import defpackage.bog;
import defpackage.bou;
import defpackage.xnm;
import internal.org.jni_zero.JniZero;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveView extends FrameLayout {
    public static final int $stable = 8;
    private ArtboardHandle artboardHandle;
    private RiveFile riveFile;
    private RiveSurface riveSurface;
    private StateMachineHandle stateMachineHandle;
    private int surfaceHeight;
    private SurfaceTexture surfaceTexture;
    private int surfaceWidth;
    private final TextureView textureView;

    /* JADX INFO: renamed from: app.rive.RiveView$onAttachedToWindow$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass1 extends awpk implements awqk {
        final /* synthetic */ bog $owner;
        int label;
        final /* synthetic */ RiveView this$0;

        /* JADX INFO: renamed from: app.rive.RiveView$onAttachedToWindow$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: PG */
        final class C00011 extends awpk implements awqk {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ RiveView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00011(RiveView riveView, awoq awoqVar) {
                super(2, awoqVar);
                this.this$0 = riveView;
            }

            static final awtl invokeSuspend$lambda$0(awrl awrlVar, long j) {
                int i = awtl.b;
                awtn awtnVar = awtn.NANOSECONDS;
                long j2 = awrc.j(j, awtnVar);
                awtl awtlVar = new awtl(a.aB(awrlVar.a, awrc.i(0, awtnVar)) ? awrc.i(0, awtnVar) : awtl.e(j2, awrlVar.a));
                awrlVar.a = j2;
                return awtlVar;
            }

            @Override // defpackage.awpe
            public final awoq create(Object obj, awoq awoqVar) {
                C00011 c00011 = new C00011(this.this$0, awoqVar);
                c00011.L$0 = obj;
                return c00011;
            }

            @Override // defpackage.awqk
            public final Object invoke(awut awutVar, awoq awoqVar) {
                return ((C00011) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0043  */
            /* JADX WARN: Code duplicated, block: B:15:0x0067 A[ADDED_TO_REGION, REMOVE] */
            /* JADX WARN: Code duplicated, block: B:16:0x006a  */
            /* JADX WARN: Code duplicated, block: B:20:0x007a  */
            /* JADX WARN: Code duplicated, block: B:22:0x0084  */
            /* JADX WARN: Code duplicated, block: B:23:0x0087  */
            /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
            /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:9:0x003d A[PHI: r4 r5
              0x003d: PHI (r4v1 awrl) = (r4v0 awrl), (r4v2 awrl) binds: [B:8:0x0025, B:27:0x00a7] A[DONT_GENERATE, DONT_INLINE]
              0x003d: PHI (r5v4 awut) = (r5v3 awut), (r5v5 awut) binds: [B:8:0x0025, B:27:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0059 -> B:13:0x005b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.awpe
            public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                /*
                    r20 = this;
                    r0 = r20
                    awox r1 = defpackage.awox.a
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L25
                    if (r2 != r3) goto L1d
                    java.lang.Object r2 = r0.L$2
                    awri r2 = (defpackage.awri) r2
                    java.lang.Object r4 = r0.L$1
                    awrl r4 = (defpackage.awrl) r4
                    java.lang.Object r5 = r0.L$0
                    awut r5 = (defpackage.awut) r5
                    defpackage.atqp.j(r21)
                    r6 = r21
                    goto L5b
                L1d:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L25:
                    defpackage.atqp.j(r21)
                    java.lang.Object r2 = r0.L$0
                    awut r2 = (defpackage.awut) r2
                    awrl r4 = new awrl
                    r4.<init>()
                    int r5 = defpackage.awtl.b
                    r5 = 0
                    awtn r6 = defpackage.awtn.NANOSECONDS
                    long r5 = defpackage.awrc.i(r5, r6)
                    r4.a = r5
                    r5 = r2
                L3d:
                    boolean r2 = defpackage.awrc.N(r5)
                    if (r2 == 0) goto La9
                    awri r2 = new awri
                    r2.<init>()
                    app.rive.RiveView$onAttachedToWindow$1$1$$ExternalSyntheticLambda0 r6 = new app.rive.RiveView$onAttachedToWindow$1$1$$ExternalSyntheticLambda0
                    r6.<init>()
                    r0.L$0 = r5
                    r0.L$1 = r4
                    r0.L$2 = r2
                    r0.label = r3
                    java.lang.Object r6 = app.rive.core.FrameTickerKt.withFrameNanosChoreographer(r6, r0)
                    if (r6 == r1) goto Lab
                L5b:
                    awtl r6 = (defpackage.awtl) r6
                    long r6 = r6.a
                    app.rive.RiveView r8 = r0.this$0
                    app.rive.RiveFile r9 = app.rive.RiveView.access$getRiveFile$p(r8)
                    if (r9 != 0) goto L6a
                    r2.a = r3
                    goto La5
                L6a:
                    app.rive.core.ArtboardHandle r10 = app.rive.RiveView.access$getArtboardHandle$p(r8)
                    if (r10 == 0) goto La3
                    long r11 = r10.m376unboximpl()
                    app.rive.core.StateMachineHandle r10 = app.rive.RiveView.access$getStateMachineHandle$p(r8)
                    if (r10 == 0) goto La0
                    long r13 = r10.m570unboximpl()
                    app.rive.core.RiveSurface r15 = app.rive.RiveView.access$getRiveSurface$p(r8)
                    if (r15 != 0) goto L87
                    r2.a = r3
                    goto La5
                L87:
                    app.rive.core.CommandQueue r10 = r9.getRiveWorker()
                    r10.m394advanceStateMachineDDXDRQI(r13, r6)
                    app.rive.Fit$Contain r6 = new app.rive.Fit$Contain
                    r7 = 0
                    r6.<init>(r7, r3, r7)
                    r18 = 16
                    r19 = 0
                    r17 = 0
                    r16 = r6
                    app.rive.core.CommandQueue.m387drawOcc3x_Y$default(r10, r11, r13, r15, r16, r17, r18, r19)
                    goto La5
                La0:
                    r2.a = r3
                    goto La5
                La3:
                    r2.a = r3
                La5:
                    boolean r2 = r2.a
                    if (r2 == 0) goto L3d
                La9:
                    awmy r1 = defpackage.awmy.a
                Lab:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: app.rive.RiveView.AnonymousClass1.C00011.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bog bogVar, RiveView riveView, awoq awoqVar) {
            super(2, awoqVar);
            this.$owner = bogVar;
            this.this$0 = riveView;
        }

        @Override // defpackage.awpe
        public final awoq create(Object obj, awoq awoqVar) {
            return new AnonymousClass1(this.$owner, this.this$0, awoqVar);
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
                bog bogVar = this.$owner;
                RiveView riveView = this.this$0;
                boc lifecycle = bogVar.getLifecycle();
                bob bobVar = bob.e;
                C00011 c00011 = new C00011(riveView, null);
                this.label = 1;
                if (alh.d(lifecycle, bobVar, c00011, this) == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
            return awmy.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        TextureView textureView = new TextureView(context);
        textureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveView$textureView$1$1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                surfaceTexture.getClass();
                this.this$0.surfaceTexture = surfaceTexture;
                this.this$0.surfaceWidth = i2;
                this.this$0.surfaceHeight = i3;
                RiveFile riveFile = this.this$0.riveFile;
                if (riveFile != null) {
                    RiveView riveView = this.this$0;
                    riveView.setRiveSurface(riveView.createRiveSurface(riveFile, surfaceTexture));
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                surfaceTexture.getClass();
                this.this$0.setRiveSurface(null);
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                surfaceTexture.getClass();
                this.this$0.surfaceTexture = surfaceTexture;
                this.this$0.surfaceWidth = i2;
                this.this$0.surfaceHeight = i3;
                RiveSurface riveSurface = this.this$0.riveSurface;
                if (riveSurface != null) {
                    riveSurface.resize$third_party_java_android_libs_rive_rive_android(i2, i3);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                surfaceTexture.getClass();
            }
        });
        this.textureView = textureView;
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RiveSurface createRiveSurface(RiveFile riveFile, SurfaceTexture surfaceTexture) {
        return riveFile.getRiveWorker().createRiveSurface(new SurfaceTextureSurface(surfaceTexture, this.surfaceWidth, this.surfaceHeight));
    }

    public static /* synthetic */ void setRiveFile$default(RiveView riveView, RiveFile riveFile, Artboard artboard, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            artboard = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        riveView.setRiveFile(riveFile, artboard, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRiveSurface(RiveSurface riveSurface) {
        RiveSurface riveSurface2 = this.riveSurface;
        if (riveSurface2 != null) {
            riveSurface2.close();
        }
        this.riveSurface = riveSurface;
    }

    public final TextureView getTextureView() {
        return this.textureView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        AtomicReference atomicReference;
        bod bodVar;
        awwo awwoVar;
        CommandQueue riveWorker;
        super.onAttachedToWindow();
        bog bogVarC = bou.c(this);
        if (bogVarC == null) {
            throw new IllegalStateException("RiveView must be hosted under a LifecycleOwner.");
        }
        RiveFile riveFile = this.riveFile;
        if (riveFile != null && (riveWorker = riveFile.getRiveWorker()) != null) {
            riveWorker.acquire("RiveView");
        }
        boc lifecycle = bogVarC.getLifecycle();
        lifecycle.getClass();
        do {
            atomicReference = (AtomicReference) lifecycle.a.a;
            bodVar = (bod) atomicReference.get();
            if (bodVar == null) {
                awxf awxfVar = new awxf(null);
                awuq awuqVar = awvi.a;
                awwoVar = axds.a;
                bodVar = new bod(lifecycle, JniZero.u(awxfVar, awwoVar.j()));
            }
            awro.t(bodVar, null, 0, new AnonymousClass1(bogVarC, this, null), 3);
        } while (!a.ap(atomicReference, bodVar));
        awro.t(bodVar, awwoVar.j(), 0, new xnm(bodVar, (awoq) null, 1), 2);
        awro.t(bodVar, null, 0, new AnonymousClass1(bogVarC, this, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        CommandQueue riveWorker;
        super.onDetachedFromWindow();
        RiveFile riveFile = this.riveFile;
        if (riveFile == null || (riveWorker = riveFile.getRiveWorker()) == null) {
            return;
        }
        riveWorker.release("RiveView", "Detached from window");
    }

    public final void setRiveFile(RiveFile riveFile, Artboard artboard, String str) {
        StateMachineHandle stateMachineHandleM564boximpl;
        riveFile.getClass();
        riveFile.checkOpen$third_party_java_android_libs_rive_rive_android();
        if (artboard != null) {
            artboard.checkOpen$third_party_java_android_libs_rive_rive_android();
            artboard.requireFromFile$third_party_java_android_libs_rive_rive_android(riveFile);
        }
        this.riveFile = riveFile;
        this.artboardHandle = artboard != null ? ArtboardHandle.m370boximpl(artboard.m269getArtboardHandlenSTdbJo()) : ArtboardHandle.m370boximpl(riveFile.getRiveWorker().m405createDefaultArtboard6NrLy0M(riveFile.m289getFileHandleENT3xMk()));
        if (str != null) {
            CommandQueue riveWorker = riveFile.getRiveWorker();
            ArtboardHandle artboardHandle = this.artboardHandle;
            artboardHandle.getClass();
            stateMachineHandleM564boximpl = StateMachineHandle.m564boximpl(riveWorker.m409createStateMachineByNameItmKBmM(artboardHandle.m376unboximpl(), str));
        } else {
            CommandQueue riveWorker2 = riveFile.getRiveWorker();
            ArtboardHandle artboardHandle2 = this.artboardHandle;
            artboardHandle2.getClass();
            stateMachineHandleM564boximpl = StateMachineHandle.m564boximpl(riveWorker2.m407createDefaultStateMachinexY8vNfM(artboardHandle2.m376unboximpl()));
        }
        this.stateMachineHandle = stateMachineHandleM564boximpl;
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture == null || this.riveSurface != null) {
            return;
        }
        setRiveSurface(createRiveSurface(riveFile, surfaceTexture));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ RiveView(Context context, AttributeSet attributeSet, int i, int i2, awqx awqxVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

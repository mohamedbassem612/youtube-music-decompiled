package app.rive.runtime.kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window$OnFrameMetricsAvailableListener;
import app.rive.RiveLog;
import app.rive.runtime.kotlin.controllers.ControllerState;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.ContextAssetLoader;
import app.rive.runtime.kotlin.core.Direction;
import app.rive.runtime.kotlin.core.FallbackAssetLoader;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.FileAssetLoader;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.Loop;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import app.rive.runtime.kotlin.core.errors.ArtboardException;
import app.rive.runtime.kotlin.core.errors.RiveException;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.TextValueRunException;
import app.rive.runtime.kotlin.renderers.PointerEvents;
import app.rive.runtime.kotlin.renderers.Renderer;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import app.rive.runtime.kotlin.renderers.RiveArtboardRenderer;
import app.rive.semantics.SemanticState;
import defpackage.a;
import defpackage.aav;
import defpackage.atqq;
import defpackage.avkz;
import defpackage.awmj;
import defpackage.awmr;
import defpackage.awmy;
import defpackage.awns;
import defpackage.awqg;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.boc;
import defpackage.bof;
import defpackage.bog;
import defpackage.bou;
import defpackage.eqo;
import defpackage.eqp;
import defpackage.equ;
import internal.org.jni_zero.JniZero;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class RiveAnimationView extends RiveTextureView implements Observable {
    public static final int SINGLE_TOUCH_ID = 0;
    public static final String TAG = "RiveL/RiveAnimationView";
    public static final boolean shouldLoadCDNAssetsDefault = true;
    public static final boolean traceAnimationsDefault = false;
    private final RectF bounds;
    private RiveFileController controller;
    private final boolean defaultAutoplay;
    private Window$OnFrameMetricsAvailableListener frameMetricsListener;
    private bog lifecycleOwner;
    private boolean multiTouchEnabled;
    private final SparseBooleanArray pointersInsideView;
    private final RendererAttributes rendererAttributes;
    private boolean touchPassThrough;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int alignmentIndexDefault = Alignment.CENTER.ordinal();
    private static final int fitIndexDefault = Fit.CONTAIN.ordinal();
    private static final int loopIndexDefault = Loop.AUTO.ordinal();
    private static final int rendererIndexDefault = Rive.INSTANCE.getDefaultRendererType().getValue();

    /* JADX INFO: compiled from: PG */
    public final class Builder {
        public static final int $stable = 8;
        private Alignment alignment;
        private String animationName;
        private String artboardName;
        private FileAssetLoader assetLoader;
        private boolean autoBind;
        private Boolean autoplay;
        private final Context context;
        private Fit fit;
        private Loop loop;
        private boolean multiTouchEnabled;
        private RendererType rendererType;
        private Object resource;
        private ResourceType resourceType;
        private boolean shouldLoadCDNAssets;
        private String stateMachineName;
        private boolean touchPassThrough;
        private Boolean traceAnimations;

        public Builder(Context context) {
            context.getClass();
            this.context = context;
            this.shouldLoadCDNAssets = true;
        }

        public final RiveAnimationView build() {
            return new RiveAnimationView(this);
        }

        public final Alignment getAlignment$third_party_java_android_libs_rive_rive_android() {
            return this.alignment;
        }

        public final String getAnimationName$third_party_java_android_libs_rive_rive_android() {
            return this.animationName;
        }

        public final String getArtboardName$third_party_java_android_libs_rive_rive_android() {
            return this.artboardName;
        }

        public final FileAssetLoader getAssetLoader$third_party_java_android_libs_rive_rive_android() {
            return this.assetLoader;
        }

        public final boolean getAutoBind$third_party_java_android_libs_rive_rive_android() {
            return this.autoBind;
        }

        public final Boolean getAutoplay$third_party_java_android_libs_rive_rive_android() {
            return this.autoplay;
        }

        public final Context getContext$third_party_java_android_libs_rive_rive_android() {
            return this.context;
        }

        public final Fit getFit$third_party_java_android_libs_rive_rive_android() {
            return this.fit;
        }

        public final Loop getLoop$third_party_java_android_libs_rive_rive_android() {
            return this.loop;
        }

        public final boolean getMultiTouchEnabled$third_party_java_android_libs_rive_rive_android() {
            return this.multiTouchEnabled;
        }

        public final RendererType getRendererType$third_party_java_android_libs_rive_rive_android() {
            return this.rendererType;
        }

        public final Object getResource$third_party_java_android_libs_rive_rive_android() {
            return this.resource;
        }

        public final ResourceType getResourceType$third_party_java_android_libs_rive_rive_android() {
            return this.resourceType;
        }

        public final boolean getShouldLoadCDNAssets$third_party_java_android_libs_rive_rive_android() {
            return this.shouldLoadCDNAssets;
        }

        public final String getStateMachineName$third_party_java_android_libs_rive_rive_android() {
            return this.stateMachineName;
        }

        public final boolean getTouchPassThrough$third_party_java_android_libs_rive_rive_android() {
            return this.touchPassThrough;
        }

        public final Boolean getTraceAnimations$third_party_java_android_libs_rive_rive_android() {
            return this.traceAnimations;
        }

        public final Builder setAlignment(Alignment alignment) {
            alignment.getClass();
            this.alignment = alignment;
            return this;
        }

        public final void setAlignment$third_party_java_android_libs_rive_rive_android(Alignment alignment) {
            this.alignment = alignment;
        }

        public final Builder setAnimationName(String str) {
            str.getClass();
            this.animationName = str;
            return this;
        }

        public final void setAnimationName$third_party_java_android_libs_rive_rive_android(String str) {
            this.animationName = str;
        }

        public final Builder setArtboardName(String str) {
            str.getClass();
            this.artboardName = str;
            return this;
        }

        public final void setArtboardName$third_party_java_android_libs_rive_rive_android(String str) {
            this.artboardName = str;
        }

        public final Builder setAssetLoader(FileAssetLoader fileAssetLoader) {
            fileAssetLoader.getClass();
            this.assetLoader = fileAssetLoader;
            return this;
        }

        public final void setAssetLoader$third_party_java_android_libs_rive_rive_android(FileAssetLoader fileAssetLoader) {
            this.assetLoader = fileAssetLoader;
        }

        public final Builder setAutoBind(boolean z) {
            this.autoBind = z;
            return this;
        }

        public final void setAutoBind$third_party_java_android_libs_rive_rive_android(boolean z) {
            this.autoBind = z;
        }

        public final Builder setAutoplay(boolean z) {
            this.autoplay = Boolean.valueOf(z);
            return this;
        }

        public final void setAutoplay$third_party_java_android_libs_rive_rive_android(Boolean bool) {
            this.autoplay = bool;
        }

        public final Builder setFit(Fit fit) {
            fit.getClass();
            this.fit = fit;
            return this;
        }

        public final void setFit$third_party_java_android_libs_rive_rive_android(Fit fit) {
            this.fit = fit;
        }

        public final Builder setLoop(Loop loop) {
            loop.getClass();
            this.loop = loop;
            return this;
        }

        public final void setLoop$third_party_java_android_libs_rive_rive_android(Loop loop) {
            this.loop = loop;
        }

        public final Builder setMultiTouchEnabled(boolean z) {
            this.multiTouchEnabled = z;
            return this;
        }

        public final void setMultiTouchEnabled$third_party_java_android_libs_rive_rive_android(boolean z) {
            this.multiTouchEnabled = z;
        }

        public final Builder setRendererType(RendererType rendererType) {
            rendererType.getClass();
            this.rendererType = rendererType;
            return this;
        }

        public final void setRendererType$third_party_java_android_libs_rive_rive_android(RendererType rendererType) {
            this.rendererType = rendererType;
        }

        public final Builder setResource(Object obj) {
            obj.getClass();
            this.resourceType = ResourceType.Companion.makeMaybeResource(obj);
            this.resource = obj;
            return this;
        }

        public final void setResource$third_party_java_android_libs_rive_rive_android(Object obj) {
            this.resource = obj;
        }

        public final void setResourceType$third_party_java_android_libs_rive_rive_android(ResourceType resourceType) {
            this.resourceType = resourceType;
        }

        public final Builder setShouldLoadCDNAssets(boolean z) {
            this.shouldLoadCDNAssets = z;
            return this;
        }

        public final void setShouldLoadCDNAssets$third_party_java_android_libs_rive_rive_android(boolean z) {
            this.shouldLoadCDNAssets = z;
        }

        public final Builder setStateMachineName(String str) {
            str.getClass();
            this.stateMachineName = str;
            return this;
        }

        public final void setStateMachineName$third_party_java_android_libs_rive_rive_android(String str) {
            this.stateMachineName = str;
        }

        public final Builder setTouchPassThrough(boolean z) {
            this.touchPassThrough = z;
            return this;
        }

        public final void setTouchPassThrough$third_party_java_android_libs_rive_rive_android(boolean z) {
            this.touchPassThrough = z;
        }

        public final Builder setTraceAnimations(boolean z) {
            this.traceAnimations = Boolean.valueOf(z);
            return this;
        }

        public final void setTraceAnimations$third_party_java_android_libs_rive_rive_android(Boolean bool) {
            this.traceAnimations = bool;
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class PointerInfo {
        private final int id;
        private final float x;
        private final float y;

        public PointerInfo(int i, float f, float f2) {
            this.id = i;
            this.x = f;
            this.y = f2;
        }

        public static /* synthetic */ PointerInfo copy$default(PointerInfo pointerInfo, int i, float f, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pointerInfo.id;
            }
            if ((i2 & 2) != 0) {
                f = pointerInfo.x;
            }
            if ((i2 & 4) != 0) {
                f2 = pointerInfo.y;
            }
            return pointerInfo.copy(i, f, f2);
        }

        public final int component1() {
            return this.id;
        }

        public final float component2() {
            return this.x;
        }

        public final float component3() {
            return this.y;
        }

        public final PointerInfo copy(int i, float f, float f2) {
            return new PointerInfo(i, f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PointerInfo) {
                PointerInfo pointerInfo = (PointerInfo) obj;
                if (this.id == pointerInfo.id && Float.compare(this.x, pointerInfo.x) == 0 && Float.compare(this.y, pointerInfo.y) == 0) {
                    return true;
                }
            }
            return false;
        }

        public final int getId() {
            return this.id;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return (((this.id * 31) + Float.floatToIntBits(this.x)) * 31) + Float.floatToIntBits(this.y);
        }

        public String toString() {
            return "PointerInfo(id=" + this.id + ", x=" + this.x + ", y=" + this.y + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveAnimationView(Context context, AttributeSet attributeSet) {
        boc lifecycle;
        super(context, attributeSet);
        context.getClass();
        this.defaultAutoplay = true;
        this.bounds = new RectF();
        Object context2 = getContext();
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                context2 = null;
                break;
            } else if (context2 instanceof bog) {
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        this.lifecycleOwner = (bog) context2;
        this.pointersInsideView = new SparseBooleanArray();
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveAnimationView._init_$lambda$0();
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.RiveAnimationView, 0, 0);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(10, -1);
            ResourceType resourceTypeMakeMaybeResource = ResourceType.Companion.makeMaybeResource(resourceId != -1 ? Integer.valueOf(resourceId) : typedArrayObtainStyledAttributes.getString(15));
            RendererAttributes.Companion companion = RendererAttributes.Companion;
            String string = typedArrayObtainStyledAttributes.getString(3);
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            FileAssetLoader fileAssetLoaderAssetLoaderFrom = companion.assetLoaderFrom(string, applicationContext);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(11, true);
            setTouchPassThrough(typedArrayObtainStyledAttributes.getBoolean(13, false));
            setMultiTouchEnabled(typedArrayObtainStyledAttributes.getBoolean(8, false));
            int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveAlignment, alignmentIndexDefault);
            int integer2 = typedArrayObtainStyledAttributes.getInteger(6, fitIndexDefault);
            int integer3 = typedArrayObtainStyledAttributes.getInteger(7, loopIndexDefault);
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(5, getDefaultAutoplay());
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(4, false);
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(14, false);
            String string2 = typedArrayObtainStyledAttributes.getString(2);
            String string3 = typedArrayObtainStyledAttributes.getString(1);
            String string4 = typedArrayObtainStyledAttributes.getString(12);
            int integer4 = typedArrayObtainStyledAttributes.getInteger(9, rendererIndexDefault);
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            RendererAttributes rendererAttributes = new RendererAttributes(integer, integer2, integer3, integer4, z2, z3, z4, string2, string3, string4, resourceTypeMakeMaybeResource, new FallbackAssetLoader(applicationContext2, z, fileAssetLoaderAssetLoaderFrom));
            this.rendererAttributes = rendererAttributes;
            this.controller = new RiveFileController(rendererAttributes.getLoop(), rendererAttributes.getAutoplay(), null, null, null, 28, null);
            bog bogVar = this.lifecycleOwner;
            if (bogVar != null && (lifecycle = bogVar.getLifecycle()) != null) {
                lifecycle.b(getLifecycleObserver());
            }
            if (resourceTypeMakeMaybeResource != null) {
                RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RiveAnimationView.lambda$1$0$0();
                    }
                });
                loadFileFromResource(new awqg() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda10
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj) {
                        return RiveAnimationView.lambda$1$0$1(this.f$0, (File) obj);
                    }
                });
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static final String _init_$lambda$0() {
        return "Creating RiveAnimationView.";
    }

    static final String createObserver$lambda$0() {
        return "Creating lifecycle observer.";
    }

    static final String createRenderer$lambda$0() {
        return "Creating RiveArtboardRenderer.";
    }

    private final boolean inBounds(float f, float f2) {
        return f >= 0.0f && f2 >= 0.0f && f < ((float) getWidth()) && f2 < ((float) getHeight());
    }

    static final String lambda$1$0$0() {
        return "Resource available - loading file immediately.";
    }

    static final awmy lambda$1$0$1(RiveAnimationView riveAnimationView, File file) throws StateMachineException {
        file.getClass();
        riveAnimationView.controller.setFile(file);
        riveAnimationView.controller.setupScene$third_party_java_android_libs_rive_rive_android(riveAnimationView.rendererAttributes);
        return awmy.a;
    }

    private final void loadFileFromResource(awqg awqgVar) {
        final ResourceType resource = this.rendererAttributes.getResource();
        int iSwitchDispatch = RiveAnimationView$$ExternalSyntheticTypeSwitchClass23.switchDispatch(resource, 0);
        if (iSwitchDispatch == -1) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveAnimationView.loadFileFromResource$lambda$0();
                }
            });
            return;
        }
        if (iSwitchDispatch == 0) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveAnimationView.loadFileFromResource$lambda$1();
                }
            });
            awqgVar.invoke(((ResourceType.ResourceRiveFile) resource).getFile());
            return;
        }
        if (iSwitchDispatch == 1) {
            loadFromNetwork(((ResourceType.ResourceUrl) resource).getUrl(), awqgVar);
            return;
        }
        if (iSwitchDispatch == 2) {
            RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveAnimationView.loadFileFromResource$lambda$2(resource);
                }
            });
            byte[] bytes = ((ResourceType.ResourceBytes) resource).getBytes();
            RendererAttributes rendererAttributes = this.rendererAttributes;
            File file = new File(bytes, rendererAttributes.getRendererType(), rendererAttributes.getAssetLoader());
            awqgVar.invoke(file);
            file.release();
            return;
        }
        if (iSwitchDispatch != 3) {
            throw new awmj();
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveAnimationView.loadFileFromResource$lambda$3(resource);
            }
        });
        InputStream inputStreamOpenRawResource = getResources().openRawResource(((ResourceType.ResourceId) resource).getId());
        try {
            inputStreamOpenRawResource.getClass();
            File file2 = new File(avkz.b(inputStreamOpenRawResource), this.rendererAttributes.getRendererType(), this.rendererAttributes.getAssetLoader());
            awqgVar.invoke(file2);
            file2.release();
            JniZero.l(inputStreamOpenRawResource, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(inputStreamOpenRawResource, th);
                throw th2;
            }
        }
    }

    static final String loadFileFromResource$lambda$0() {
        return "loadResource: no resource to load";
    }

    static final String loadFileFromResource$lambda$1() {
        return "Loading Rive file from existing Rive File. No extra work required.";
    }

    static final String loadFileFromResource$lambda$2(ResourceType resourceType) {
        return "Loading Rive file from bytes with length: " + ((ResourceType.ResourceBytes) resourceType).getBytes().length;
    }

    static final String loadFileFromResource$lambda$3(ResourceType resourceType) {
        return "Loading Rive file from resource ID: " + ((ResourceType.ResourceId) resourceType).getId();
    }

    private final void loadFromNetwork(final String str, final awqg awqgVar) {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return "Loading Rive file from network: ".concat(String.valueOf(str));
            }
        });
        a.bD(getContext().getApplicationContext()).a(new RiveFileRequest(str, this.rendererAttributes.getRendererType(), new eqp() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda21
            @Override // defpackage.eqp
            public final void onResponse(Object obj) {
                RiveAnimationView.loadFromNetwork$lambda$1(awqgVar, (File) obj);
            }
        }, new eqo() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda22
            @Override // defpackage.eqo
            public final void onErrorResponse(equ equVar) throws IOException {
                RiveAnimationView.loadFromNetwork$lambda$2(str, equVar);
            }
        }, this.rendererAttributes.getAssetLoader()));
    }

    static final void loadFromNetwork$lambda$1(awqg awqgVar, File file) {
        file.getClass();
        awqgVar.invoke(file);
        file.release();
    }

    static final void loadFromNetwork$lambda$2(String str, equ equVar) throws IOException {
        throw new IOException("Unable to download Rive file ".concat(String.valueOf(str)), equVar);
    }

    static final awmy onAttachedToWindow$lambda$0(RiveAnimationView riveAnimationView, File file) throws StateMachineException {
        file.getClass();
        riveAnimationView.controller.setFile(file);
        riveAnimationView.controller.setupScene$third_party_java_android_libs_rive_rive_android(riveAnimationView.rendererAttributes);
        return awmy.a;
    }

    static final String onMeasure$lambda$0() {
        return "onMeasure(): Renderer not instantiated yet.";
    }

    static final String onTouchEvent$lambda$0() {
        return "onTouchEvent(): Renderer not instantiated yet.";
    }

    private static final PointerInfo onTouchEvent$pointerInfoAt(RiveAnimationView riveAnimationView, MotionEvent motionEvent, int i) {
        return new PointerInfo(riveAnimationView.getMultiTouchEnabled() ? motionEvent.getPointerId(i) : 0, motionEvent.getX(i), motionEvent.getY(i));
    }

    public static /* synthetic */ void pause$default(RiveAnimationView riveAnimationView, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        riveAnimationView.pause(str, ((i & 2) == 0) & z);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, String str, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i & 2) != 0) {
            loop = Loop.AUTO;
        }
        if ((i & 4) != 0) {
            direction = Direction.AUTO;
        }
        riveAnimationView.play(str, loop, direction, z & ((i & 8) == 0), z2 | (!((i & 16) == 0)));
    }

    static final String setAssetLoader$lambda$0(FileAssetLoader fileAssetLoader) {
        Objects.toString(fileAssetLoader);
        return "setAssetLoader: assetLoader is already set to ".concat(String.valueOf(fileAssetLoader));
    }

    static final String setAssetLoader$lambda$1(FileAssetLoader fileAssetLoader) {
        Objects.toString(fileAssetLoader);
        return "setAssetLoader: ".concat(String.valueOf(fileAssetLoader));
    }

    public static /* synthetic */ void setRiveBytes$default(RiveAnimationView riveAnimationView, byte[] bArr, String str, String str2, String str3, boolean z, boolean z2, Fit fit, Alignment alignment, Loop loop, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveBytes");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            z = riveAnimationView.controller.getAutoplay();
        }
        boolean z3 = z2 & ((i & 32) == 0);
        if ((i & 64) != 0) {
            fit = Fit.Companion.fromIndex(fitIndexDefault);
        }
        if ((i & SemanticState.Focused) != 0) {
            alignment = Alignment.Companion.fromIndex(alignmentIndexDefault);
        }
        if ((i & SemanticState.Hidden) != 0) {
            loop = Loop.Companion.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveBytes(bArr, str, str2, str3, z, z3, fit, alignment, loop);
    }

    static final String setRiveBytes$lambda$0(byte[] bArr) {
        return "setRiveBytes with bytes length: " + bArr.length;
    }

    static final awmy setRiveBytes$lambda$2(RiveAnimationView riveAnimationView, File file) throws StateMachineException {
        file.getClass();
        riveAnimationView.controller.setFile(file);
        riveAnimationView.controller.setupScene$third_party_java_android_libs_rive_rive_android(riveAnimationView.rendererAttributes);
        return awmy.a;
    }

    public static /* synthetic */ void setRiveFile$default(RiveAnimationView riveAnimationView, File file, String str, String str2, String str3, boolean z, boolean z2, Fit fit, Alignment alignment, Loop loop, int i, Object obj) throws RiveException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveFile");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            z = riveAnimationView.controller.getAutoplay();
        }
        boolean z3 = z2 & ((i & 32) == 0);
        if ((i & 64) != 0) {
            fit = Fit.Companion.fromIndex(fitIndexDefault);
        }
        if ((i & SemanticState.Focused) != 0) {
            alignment = Alignment.Companion.fromIndex(alignmentIndexDefault);
        }
        if ((i & SemanticState.Hidden) != 0) {
            loop = Loop.Companion.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveFile(file, str, str2, str3, z, z3, fit, alignment, loop);
    }

    static final String setRiveFile$lambda$0(File file) {
        Objects.toString(file);
        return "setRiveFile with file: ".concat(String.valueOf(file));
    }

    public static /* synthetic */ void setRiveResource$default(RiveAnimationView riveAnimationView, int i, String str, String str2, String str3, boolean z, boolean z2, Fit fit, Alignment alignment, Loop loop, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRiveResource");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            z = riveAnimationView.controller.getAutoplay();
        }
        boolean z3 = z2 & ((i2 & 32) == 0);
        if ((i2 & 64) != 0) {
            fit = Fit.Companion.fromIndex(fitIndexDefault);
        }
        if ((i2 & SemanticState.Focused) != 0) {
            alignment = Alignment.Companion.fromIndex(alignmentIndexDefault);
        }
        if ((i2 & SemanticState.Hidden) != 0) {
            loop = Loop.Companion.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveResource(i, str, str2, str3, z, z3, fit, alignment, loop);
    }

    static final awmy setRiveResource$lambda$2(RiveAnimationView riveAnimationView, File file) throws StateMachineException {
        file.getClass();
        riveAnimationView.controller.setFile(file);
        riveAnimationView.controller.setupScene$third_party_java_android_libs_rive_rive_android(riveAnimationView.rendererAttributes);
        return awmy.a;
    }

    private final void startFrameMetrics() {
        RendererMetrics rendererMetrics = new RendererMetrics(getActivity());
        getActivity().getWindow().addOnFrameMetricsAvailableListener(rendererMetrics, new Handler(Looper.getMainLooper()));
        this.frameMetricsListener = rendererMetrics;
    }

    static final String startFrameMetrics$lambda$1() {
        return "FrameMetrics is available with Android SDK 24 (Nougat) and higher";
    }

    public static /* synthetic */ void stop$default(RiveAnimationView riveAnimationView, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
        }
        riveAnimationView.stop(str, ((i & 2) == 0) & z);
    }

    private final void stopFrameMetrics() {
        Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener = this.frameMetricsListener;
        if (window$OnFrameMetricsAvailableListener != null) {
            getActivity().getWindow().removeOnFrameMetricsAvailableListener(window$OnFrameMetricsAvailableListener);
        }
    }

    private final void validateLifecycleOwner() {
        boc lifecycle;
        boc lifecycle2;
        bog bogVarC = bou.c(this);
        if (bogVarC == null || awrc.c(bogVarC, this.lifecycleOwner)) {
            return;
        }
        bog bogVar = this.lifecycleOwner;
        if (bogVar != null && (lifecycle2 = bogVar.getLifecycle()) != null) {
            lifecycle2.c(getLifecycleObserver());
        }
        this.lifecycleOwner = bogVarC;
        if (bogVarC == null || (lifecycle = bogVarC.getLifecycle()) == null) {
            return;
        }
        lifecycle.b(getLifecycleObserver());
    }

    public final void addEventListener(RiveFileController.RiveEventListener riveEventListener) {
        riveEventListener.getClass();
        this.controller.addEventListener(riveEventListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.RiveTextureView
    public bof createObserver() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveAnimationView.createObserver$lambda$0();
            }
        });
        return new RiveViewLifecycleObserver(atqq.ar(atqq.aQ(new RefCount[]{this.controller, this.rendererAttributes.getAssetLoader()})));
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView
    protected Renderer createRenderer() {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveAnimationView.createRenderer$lambda$0();
            }
        });
        RendererAttributes rendererAttributes = this.rendererAttributes;
        return new RiveArtboardRenderer(rendererAttributes.getRiveTraceAnimations(), rendererAttributes.getRendererType(), this.controller);
    }

    public final void fireState(String str, String str2) {
        str.getClass();
        str2.getClass();
        RiveFileController.fireState$default(this.controller, str, str2, null, 4, null);
    }

    public final void fireStateAtPath(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.controller.fireStateAtPath(str, str2);
    }

    public final Alignment getAlignment() {
        return this.controller.getAlignment();
    }

    public final List getAnimations() {
        return this.controller.getAnimations();
    }

    public final String getArtboardName() {
        Artboard activeArtboard = this.controller.getActiveArtboard();
        if (activeArtboard != null) {
            return activeArtboard.getName();
        }
        return null;
    }

    public final RiveArtboardRenderer getArtboardRenderer() {
        String simpleName;
        Class<?> cls;
        Renderer renderer = getRenderer();
        if (renderer == null || (renderer instanceof RiveArtboardRenderer)) {
            return (RiveArtboardRenderer) getRenderer();
        }
        Renderer renderer2 = getRenderer();
        if (renderer2 == null || (cls = renderer2.getClass()) == null || (simpleName = cls.getSimpleName()) == null) {
            simpleName = "NULL";
        }
        throw new awmr("Expected RiveArtboardRenderer but got ".concat(String.valueOf(simpleName)));
    }

    public final boolean getAutoplay() {
        return this.controller.getAutoplay();
    }

    public final RiveFileController getController() {
        return this.controller;
    }

    public boolean getDefaultAutoplay() {
        return this.defaultAutoplay;
    }

    public final File getFile() {
        return this.controller.getFile();
    }

    public final Fit getFit() {
        return this.controller.getFit();
    }

    public final Float getLayoutScaleFactor() {
        return this.controller.getLayoutScaleFactor();
    }

    public final float getLayoutScaleFactorAutomatic() {
        return this.controller.getLayoutScaleFactorAutomatic();
    }

    public boolean getMultiTouchEnabled() {
        return this.multiTouchEnabled;
    }

    public final HashSet getPlayingAnimations() {
        return this.controller.getPlayingAnimations();
    }

    public final HashSet getPlayingStateMachines() {
        return this.controller.getPlayingStateMachines();
    }

    public final RendererAttributes getRendererAttributes() {
        return this.rendererAttributes;
    }

    public final List getStateMachines() {
        return this.controller.getStateMachines();
    }

    public final String getTextRunValue(String str, String str2) {
        str.getClass();
        str2.getClass();
        return this.controller.getTextRunValue(str, str2);
    }

    public boolean getTouchPassThrough() {
        return this.touchPassThrough;
    }

    public final Float getVolume() {
        return this.controller.getVolume();
    }

    public final boolean isPlaying() {
        Renderer renderer = getRenderer();
        return renderer != null && renderer.isPlaying();
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        validateLifecycleOwner();
        if (this.controller.getFile() == null) {
            loadFileFromResource(new awqg() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda1
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return RiveAnimationView.onAttachedToWindow$lambda$0(this.f$0, (File) obj);
                }
            });
        }
        Renderer renderer = getRenderer();
        renderer.getClass();
        if (renderer.getTrace()) {
            startFrameMetrics();
        }
        this.controller.setActive(true);
        Renderer renderer2 = getRenderer();
        renderer2.getClass();
        renderer2.start();
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.View
    protected void onDetachedFromWindow() {
        this.controller.setActive(false);
        stopFrameMetrics();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getRenderer() == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveAnimationView.onMeasure$lambda$0();
                }
            });
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int iWidth = mode == 0 ? (int) this.controller.getArtboardBounds().width() : View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int iHeight = mode2 == 0 ? (int) this.controller.getArtboardBounds().height() : View.MeasureSpec.getSize(i2);
        this.controller.setLayoutScaleFactorAutomatic$third_party_java_android_libs_rive_rive_android(getResources().getDisplayMetrics().density);
        this.bounds.set(0.0f, 0.0f, iWidth, iHeight);
        RectF rectFCalculateRequiredBounds = Rive.INSTANCE.calculateRequiredBounds(this.controller.getFit(), this.controller.getAlignment(), this.bounds, this.controller.getArtboardBounds(), this.controller.getLayoutScaleFactorActive$third_party_java_android_libs_rive_rive_android());
        if (mode == Integer.MIN_VALUE) {
            iWidth = Math.min((int) rectFCalculateRequiredBounds.width(), iWidth);
        } else if (mode != 1073741824) {
            iWidth = (int) rectFCalculateRequiredBounds.width();
        }
        if (mode2 == Integer.MIN_VALUE) {
            iHeight = Math.min((int) rectFCalculateRequiredBounds.height(), iHeight);
        } else if (mode2 != 1073741824) {
            iHeight = (int) rectFCalculateRequiredBounds.height();
        }
        setMeasuredDimension(iWidth, iHeight);
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        super.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        this.controller.setTargetBounds(new RectF(0.0f, 0.0f, i, i2));
        this.controller.getRequireArtboardResize$third_party_java_android_libs_rive_rive_android().set(true);
    }

    @Override // app.rive.runtime.kotlin.RiveTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        super.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        this.controller.setTargetBounds(new RectF(0.0f, 0.0f, i, i2));
        this.controller.getRequireArtboardResize$third_party_java_android_libs_rive_rive_android().set(true);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        boolean z = !getTouchPassThrough();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            PointerInfo pointerInfoOnTouchEvent$pointerInfoAt = onTouchEvent$pointerInfoAt(this, motionEvent, motionEvent.getActionIndex());
            int iComponent1 = pointerInfoOnTouchEvent$pointerInfoAt.component1();
            float fComponent2 = pointerInfoOnTouchEvent$pointerInfoAt.component2();
            float fComponent3 = pointerInfoOnTouchEvent$pointerInfoAt.component3();
            this.pointersInsideView.put(iComponent1, inBounds(fComponent2, fComponent3));
            this.controller.pointerEvent(PointerEvents.POINTER_DOWN, iComponent1, fComponent2, fComponent3);
        } else if (actionMasked == 1) {
            PointerInfo pointerInfoOnTouchEvent$pointerInfoAt2 = onTouchEvent$pointerInfoAt(this, motionEvent, motionEvent.getActionIndex());
            int iComponent2 = pointerInfoOnTouchEvent$pointerInfoAt2.component1();
            float fComponent4 = pointerInfoOnTouchEvent$pointerInfoAt2.component2();
            float fComponent5 = pointerInfoOnTouchEvent$pointerInfoAt2.component3();
            this.controller.pointerEvent(PointerEvents.POINTER_UP, iComponent2, fComponent4, fComponent5);
            this.controller.pointerEvent(PointerEvents.POINTER_EXIT, iComponent2, fComponent4, fComponent5);
            if (this.pointersInsideView.get(iComponent2)) {
                performClick();
            }
            this.pointersInsideView.clear();
        } else if (actionMasked == 2) {
            int pointerCount = getMultiTouchEnabled() ? motionEvent.getPointerCount() : 1;
            for (int i = 0; i < pointerCount; i++) {
                PointerInfo pointerInfoOnTouchEvent$pointerInfoAt3 = onTouchEvent$pointerInfoAt(this, motionEvent, i);
                int iComponent3 = pointerInfoOnTouchEvent$pointerInfoAt3.component1();
                float fComponent6 = pointerInfoOnTouchEvent$pointerInfoAt3.component2();
                float fComponent7 = pointerInfoOnTouchEvent$pointerInfoAt3.component3();
                boolean z2 = this.pointersInsideView.get(iComponent3);
                boolean zInBounds = inBounds(fComponent6, fComponent7);
                if (z2 && !zInBounds) {
                    this.controller.pointerEvent(PointerEvents.POINTER_EXIT, iComponent3, fComponent6, fComponent7);
                }
                this.pointersInsideView.put(iComponent3, zInBounds);
                this.controller.pointerEvent(PointerEvents.POINTER_MOVE, iComponent3, fComponent6, fComponent7);
            }
        } else {
            if (actionMasked == 3) {
                awns awnsVarC = aav.c(this.pointersInsideView);
                while (awnsVarC.hasNext()) {
                    int iA = awnsVarC.a();
                    this.controller.pointerEvent(PointerEvents.POINTER_UP, iA, -1.0f, -1.0f);
                    this.controller.pointerEvent(PointerEvents.POINTER_EXIT, iA, -1.0f, -1.0f);
                }
                this.pointersInsideView.clear();
                return z;
            }
            if (actionMasked != 5) {
                if (actionMasked != 6) {
                    RiveLog.INSTANCE.getLogger().w(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RiveAnimationView.onTouchEvent$lambda$0();
                        }
                    });
                    return z;
                }
                if (getMultiTouchEnabled()) {
                    PointerInfo pointerInfoOnTouchEvent$pointerInfoAt4 = onTouchEvent$pointerInfoAt(this, motionEvent, motionEvent.getActionIndex());
                    int iComponent4 = pointerInfoOnTouchEvent$pointerInfoAt4.component1();
                    float fComponent8 = pointerInfoOnTouchEvent$pointerInfoAt4.component2();
                    float fComponent9 = pointerInfoOnTouchEvent$pointerInfoAt4.component3();
                    this.controller.pointerEvent(PointerEvents.POINTER_UP, iComponent4, fComponent8, fComponent9);
                    this.controller.pointerEvent(PointerEvents.POINTER_EXIT, iComponent4, fComponent8, fComponent9);
                    if (this.pointersInsideView.get(iComponent4)) {
                        performClick();
                    }
                    this.pointersInsideView.delete(iComponent4);
                    return z;
                }
            } else if (getMultiTouchEnabled()) {
                PointerInfo pointerInfoOnTouchEvent$pointerInfoAt5 = onTouchEvent$pointerInfoAt(this, motionEvent, motionEvent.getActionIndex());
                int iComponent5 = pointerInfoOnTouchEvent$pointerInfoAt5.component1();
                float fComponent10 = pointerInfoOnTouchEvent$pointerInfoAt5.component2();
                float fComponent11 = pointerInfoOnTouchEvent$pointerInfoAt5.component3();
                this.pointersInsideView.put(iComponent5, inBounds(fComponent10, fComponent11));
                this.controller.pointerEvent(PointerEvents.POINTER_DOWN, iComponent5, fComponent10, fComponent11);
                return z;
            }
        }
        return z;
    }

    public final void pause() {
        RiveArtboardRenderer artboardRenderer = getArtboardRenderer();
        if (artboardRenderer != null) {
            artboardRenderer.stop();
        }
        this.controller.pause();
        stopFrameMetrics();
    }

    public final void play(String str, Loop loop, Direction direction, boolean z, boolean z2) {
        str.getClass();
        loop.getClass();
        direction.getClass();
        String str2 = true != z ? str : null;
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setAnimationName(str2);
        rendererAttributes.setStateMachineName(true == z ? str : null);
        rendererAttributes.setLoop(loop);
        this.controller.play(str, loop, direction, z, z2);
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void registerListener(RiveFileController.Listener listener) {
        listener.getClass();
        this.controller.registerListener(listener);
    }

    public final void removeEventListener(RiveFileController.RiveEventListener riveEventListener) {
        riveEventListener.getClass();
        this.controller.removeEventListener(riveEventListener);
    }

    public final void reset() throws ArtboardException {
        RiveArtboardRenderer artboardRenderer = getArtboardRenderer();
        if (artboardRenderer != null) {
            artboardRenderer.reset();
        }
    }

    public final void restoreControllerState(ControllerState controllerState) {
        controllerState.getClass();
        this.controller.restoreControllerState(controllerState);
    }

    public final ControllerState saveControllerState() {
        this.rendererAttributes.setResource(null);
        return this.controller.saveControllerState();
    }

    public final void setAlignment(Alignment alignment) {
        alignment.getClass();
        this.controller.setAlignment(alignment);
    }

    public final void setArtboardName(String str) throws ArtboardException {
        this.controller.selectArtboard(str);
    }

    public final void setAssetLoader(final FileAssetLoader fileAssetLoader) {
        if (awrc.c(fileAssetLoader, this.rendererAttributes.getAssetLoader())) {
            RiveLog.INSTANCE.getLogger().w(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveAnimationView.setAssetLoader$lambda$0(fileAssetLoader);
                }
            });
            return;
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveAnimationView.setAssetLoader$lambda$1(fileAssetLoader);
            }
        });
        RendererAttributes rendererAttributes = this.rendererAttributes;
        FileAssetLoader assetLoader = rendererAttributes.getAssetLoader();
        rendererAttributes.setAssetLoader(fileAssetLoader);
        if (fileAssetLoader != null) {
            fileAssetLoader.acquire();
        }
        if (assetLoader != null) {
            assetLoader.release();
        }
        bof lifecycleObserver = getLifecycleObserver();
        RiveViewLifecycleObserver riveViewLifecycleObserver = lifecycleObserver instanceof RiveViewLifecycleObserver ? (RiveViewLifecycleObserver) lifecycleObserver : null;
        if (riveViewLifecycleObserver != null) {
            if (assetLoader != null) {
                riveViewLifecycleObserver.remove(assetLoader);
            }
            if (fileAssetLoader != null) {
                riveViewLifecycleObserver.insert(fileAssetLoader);
            }
        }
    }

    public final void setAutoplay(boolean z) {
        this.controller.setAutoplay(z);
    }

    public final void setBooleanState(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        RiveFileController.setBooleanState$default(this.controller, str, str2, z, null, 8, null);
    }

    public final void setBooleanStateAtPath(String str, boolean z, String str2) {
        str.getClass();
        str2.getClass();
        this.controller.setBooleanStateAtPath(str, z, str2);
    }

    public final void setController(RiveFileController riveFileController) {
        riveFileController.getClass();
        this.controller = riveFileController;
    }

    public final void setFit(Fit fit) {
        fit.getClass();
        this.controller.setFit(fit);
    }

    public final void setLayoutScaleFactor(Float f) {
        this.controller.setLayoutScaleFactor(f);
    }

    public final void setLayoutScaleFactorAutomatic$third_party_java_android_libs_rive_rive_android(float f) {
        this.controller.setLayoutScaleFactorAutomatic$third_party_java_android_libs_rive_rive_android(f);
    }

    public void setMultiTouchEnabled(boolean z) {
        this.multiTouchEnabled = z;
        if (z) {
            return;
        }
        awns awnsVarC = aav.c(this.pointersInsideView);
        while (awnsVarC.hasNext()) {
            int iA = awnsVarC.a();
            if (iA != 0) {
                this.controller.pointerEvent(PointerEvents.POINTER_UP, iA, -1.0f, -1.0f);
                this.controller.pointerEvent(PointerEvents.POINTER_EXIT, iA, -1.0f, -1.0f);
                this.pointersInsideView.delete(iA);
            }
        }
    }

    public final void setMultipleStates(ChangedInput... changedInputArr) {
        changedInputArr.getClass();
        this.controller.queueInputs$third_party_java_android_libs_rive_rive_android((ChangedInput[]) Arrays.copyOf(changedInputArr, changedInputArr.length));
    }

    public final void setNumberState(String str, String str2, float f) {
        str.getClass();
        str2.getClass();
        RiveFileController.setNumberState$default(this.controller, str, str2, f, null, 8, null);
    }

    public final void setNumberStateAtPath(String str, float f, String str2) {
        str.getClass();
        str2.getClass();
        this.controller.setNumberStateAtPath(str, f, str2);
    }

    public final void setRiveBytes(final byte[] bArr, String str, String str2, String str3, boolean z, boolean z2, Fit fit, Alignment alignment, Loop loop) {
        bArr.getClass();
        fit.getClass();
        alignment.getClass();
        loop.getClass();
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveAnimationView.setRiveBytes$lambda$0(bArr);
            }
        });
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(str);
        rendererAttributes.setAnimationName(str2);
        rendererAttributes.setStateMachineName(str3);
        rendererAttributes.setAutoplay(z);
        rendererAttributes.setAutoBind(z2);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.Companion.makeMaybeResource(bArr));
        loadFileFromResource(new awqg() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda18
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return RiveAnimationView.setRiveBytes$lambda$2(this.f$0, (File) obj);
            }
        });
    }

    public final void setRiveFile(final File file, String str, String str2, String str3, boolean z, boolean z2, Fit fit, Alignment alignment, Loop loop) throws RiveException {
        file.getClass();
        fit.getClass();
        alignment.getClass();
        loop.getClass();
        if (file.getRendererType() != this.rendererAttributes.getRendererType()) {
            throw new RiveException("Incompatible Renderer types: file initialized with " + file.getRendererType().name() + " but View is set up for " + this.rendererAttributes.getRendererType().name());
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiveAnimationView.setRiveFile$lambda$0(file);
            }
        });
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(str);
        rendererAttributes.setAnimationName(str2);
        rendererAttributes.setStateMachineName(str3);
        rendererAttributes.setAutoplay(z);
        rendererAttributes.setAutoBind(z2);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.Companion.makeMaybeResource(file));
        this.controller.setFile(file);
        this.controller.setupScene$third_party_java_android_libs_rive_rive_android(this.rendererAttributes);
    }

    public final void setRiveResource(final int i, String str, String str2, String str3, boolean z, boolean z2, Fit fit, Alignment alignment, Loop loop) {
        fit.getClass();
        alignment.getClass();
        loop.getClass();
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.bR(i, "setRiveResource with resId: ");
            }
        });
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(str);
        rendererAttributes.setAnimationName(str2);
        rendererAttributes.setStateMachineName(str3);
        rendererAttributes.setAutoplay(z);
        rendererAttributes.setAutoBind(z2);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.Companion.makeMaybeResource(Integer.valueOf(i)));
        loadFileFromResource(new awqg() { // from class: app.rive.runtime.kotlin.RiveAnimationView$$ExternalSyntheticLambda5
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return RiveAnimationView.setRiveResource$lambda$2(this.f$0, (File) obj);
            }
        });
    }

    public final void setTextRunValue(String str, String str2, String str3) throws TextValueRunException {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.controller.setTextRunValue(str, str2, str3);
    }

    public void setTouchPassThrough(boolean z) {
        this.touchPassThrough = z;
    }

    public final void setVolume(float f) {
        this.controller.setVolume(f);
    }

    public final void stop() {
        this.controller.stopAnimations();
        stopFrameMetrics();
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void unregisterListener(RiveFileController.Listener listener) {
        listener.getClass();
        this.controller.unregisterListener(listener);
    }

    /* JADX INFO: compiled from: PG */
    public final class RendererAttributes {
        private Alignment alignment;
        private String animationName;
        private String artboardName;
        private FileAssetLoader assetLoader;
        private boolean autoBind;
        private boolean autoplay;
        private Fit fit;
        private Loop loop;
        private RendererType rendererType;
        private ResourceType resource;
        private boolean riveTraceAnimations;
        private String stateMachineName;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ RendererAttributes(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, String str, String str2, String str3, ResourceType resourceType, FileAssetLoader fileAssetLoader, int i5, awqx awqxVar) {
            this((i5 & 1) != 0 ? RiveAnimationView.Companion.getAlignmentIndexDefault() : i, (i5 & 2) != 0 ? RiveAnimationView.Companion.getFitIndexDefault() : i2, (i5 & 4) != 0 ? RiveAnimationView.Companion.getLoopIndexDefault() : i3, (i5 & 8) != 0 ? RiveAnimationView.Companion.getRendererIndexDefault() : i4, z, ((i5 & 32) == 0) & z2, ((i5 & 64) == 0) & z3, str, str2, str3, resourceType, (i5 & SemanticState.Modal) != 0 ? null : fileAssetLoader);
        }

        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final String getAnimationName() {
            return this.animationName;
        }

        public final String getArtboardName() {
            return this.artboardName;
        }

        public final FileAssetLoader getAssetLoader() {
            return this.assetLoader;
        }

        public final boolean getAutoBind() {
            return this.autoBind;
        }

        public final boolean getAutoplay() {
            return this.autoplay;
        }

        public final Fit getFit() {
            return this.fit;
        }

        public final Loop getLoop() {
            return this.loop;
        }

        public final RendererType getRendererType() {
            return this.rendererType;
        }

        public final ResourceType getResource() {
            return this.resource;
        }

        public final boolean getRiveTraceAnimations() {
            return this.riveTraceAnimations;
        }

        public final String getStateMachineName() {
            return this.stateMachineName;
        }

        public final void setAlignment(Alignment alignment) {
            alignment.getClass();
            this.alignment = alignment;
        }

        public final void setAnimationName(String str) {
            this.animationName = str;
        }

        public final void setArtboardName(String str) {
            this.artboardName = str;
        }

        public final void setAssetLoader(FileAssetLoader fileAssetLoader) {
            this.assetLoader = fileAssetLoader;
        }

        public final void setAutoBind(boolean z) {
            this.autoBind = z;
        }

        public final void setAutoplay(boolean z) {
            this.autoplay = z;
        }

        public final void setFit(Fit fit) {
            fit.getClass();
            this.fit = fit;
        }

        public final void setLoop(Loop loop) {
            loop.getClass();
            this.loop = loop;
        }

        public final void setRendererType(RendererType rendererType) {
            rendererType.getClass();
            this.rendererType = rendererType;
        }

        public final void setResource(ResourceType resourceType) {
            this.resource = resourceType;
        }

        public final void setRiveTraceAnimations(boolean z) {
            this.riveTraceAnimations = z;
        }

        public final void setStateMachineName(String str) {
            this.stateMachineName = str;
        }

        /* JADX INFO: compiled from: PG */
        public final class Companion {
            private Companion() {
            }

            static final String assetLoaderFrom$lambda$5(String str, Exception exc) {
                return "Failed to initialize AssetLoader from name: " + str + " (exception: " + exc.getMessage() + ')';
            }

            public final FileAssetLoader assetLoaderFrom(final String str, Context context) {
                Constructor<?> constructor;
                Constructor<?> constructor2;
                Object objNewInstance;
                FileAssetLoader fileAssetLoader;
                Object objNewInstance2;
                context.getClass();
                if (str == null || str.length() == 0) {
                    return null;
                }
                try {
                    Class<?> cls = Class.forName(str);
                    cls.getClass();
                    Constructor<?>[] constructors = cls.getConstructors();
                    constructors.getClass();
                    int length = constructors.length;
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = constructors[i2];
                        if (constructor.getParameterTypes().length == 1 && awrc.c(constructor.getParameterTypes()[0], Context.class)) {
                            break;
                        }
                        i2++;
                    }
                    if (constructor == null || (objNewInstance2 = constructor.newInstance(context.getApplicationContext())) == null || !(objNewInstance2 instanceof ContextAssetLoader)) {
                        Constructor<?>[] constructors2 = cls.getConstructors();
                        constructors2.getClass();
                        int length2 = constructors2.length;
                        while (true) {
                            if (i >= length2) {
                                constructor2 = null;
                                break;
                            }
                            constructor2 = constructors2[i];
                            Class<?>[] parameterTypes = constructor2.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0) {
                                break;
                            }
                            i++;
                        }
                        if (constructor2 == null || (objNewInstance = constructor2.newInstance(null)) == null || !(objNewInstance instanceof FileAssetLoader)) {
                            RiveLog.INSTANCE.getLogger().e(RiveAnimationView.TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$RendererAttributes$Companion$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return "Failed to initialize AssetLoader: No suitable constructor in ".concat(String.valueOf(str));
                                }
                            });
                            return null;
                        }
                        fileAssetLoader = (FileAssetLoader) objNewInstance;
                    } else {
                        fileAssetLoader = (FileAssetLoader) objNewInstance2;
                    }
                    return fileAssetLoader;
                } catch (Exception e) {
                    RiveLog.INSTANCE.getLogger().e(RiveAnimationView.TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.RiveAnimationView$RendererAttributes$Companion$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RiveAnimationView.RendererAttributes.Companion.assetLoaderFrom$lambda$5(str, e);
                        }
                    });
                    return null;
                }
            }

            public /* synthetic */ Companion(awqx awqxVar) {
                this();
            }
        }

        public static /* synthetic */ void getAnimationName$annotations() {
        }

        public static /* synthetic */ void getLoop$annotations() {
        }

        public RendererAttributes(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, String str, String str2, String str3, ResourceType resourceType, FileAssetLoader fileAssetLoader) {
            this.autoplay = z;
            this.autoBind = z2;
            this.riveTraceAnimations = z3;
            this.artboardName = str;
            this.animationName = str2;
            this.stateMachineName = str3;
            this.resource = resourceType;
            this.assetLoader = fileAssetLoader;
            this.alignment = Alignment.Companion.fromIndex(i);
            this.fit = Fit.Companion.fromIndex(i2);
            this.loop = Loop.Companion.fromIndex(i3);
            this.rendererType = RendererType.Companion.fromIndex(i4);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public final int getAlignmentIndexDefault() {
            return RiveAnimationView.alignmentIndexDefault;
        }

        public final int getFitIndexDefault() {
            return RiveAnimationView.fitIndexDefault;
        }

        public final int getLoopIndexDefault() {
            return RiveAnimationView.loopIndexDefault;
        }

        public final int getRendererIndexDefault() {
            return RiveAnimationView.rendererIndexDefault;
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }

        public static /* synthetic */ void getLoopIndexDefault$annotations() {
        }
    }

    public final void stop(String str, boolean z) {
        str.getClass();
        this.controller.stopAnimations(str, z);
    }

    public final void stop(List list, boolean z) {
        list.getClass();
        this.controller.stopAnimations(list, z);
    }

    public final String getTextRunValue(String str) {
        str.getClass();
        return this.controller.getTextRunValue(str);
    }

    public final void setTextRunValue(String str, String str2) throws TextValueRunException {
        str.getClass();
        str2.getClass();
        this.controller.setTextRunValue(str, str2);
    }

    public final void pause(String str, boolean z) {
        str.getClass();
        this.controller.pause(str, z);
    }

    public static /* synthetic */ void getAnimations$annotations() {
    }

    public static /* synthetic */ void getPlayingAnimations$annotations() {
    }

    public static /* synthetic */ void getPlayingStateMachines$annotations() {
    }

    public static /* synthetic */ void getRendererAttributes$annotations() {
    }

    public static /* synthetic */ void getStateMachines$annotations() {
    }

    public final void pause(List list, boolean z) {
        list.getClass();
        this.controller.pause(list, z);
    }

    public static /* synthetic */ void pause$default(RiveAnimationView riveAnimationView, List list, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        riveAnimationView.pause(list, ((i & 2) == 0) & z);
    }

    public static /* synthetic */ void stop$default(RiveAnimationView riveAnimationView, List list, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stop");
        }
        riveAnimationView.stop(list, ((i & 2) == 0) & z);
    }

    public final void play(Loop loop, Direction direction, boolean z) {
        loop.getClass();
        direction.getClass();
        this.rendererAttributes.setLoop(loop);
        this.controller.play(loop, direction, z);
    }

    public final void play(List list, Loop loop, Direction direction, boolean z, boolean z2) {
        list.getClass();
        loop.getClass();
        direction.getClass();
        this.rendererAttributes.setLoop(loop);
        this.controller.play(list, loop, direction, z, z2);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, Loop loop, Direction direction, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i & 1) != 0) {
            loop = Loop.AUTO;
        }
        if ((i & 2) != 0) {
            direction = Direction.AUTO;
        }
        riveAnimationView.play(loop, direction, (!((i & 4) == 0)) | z);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, List list, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i & 2) != 0) {
            loop = Loop.AUTO;
        }
        if ((i & 4) != 0) {
            direction = Direction.AUTO;
        }
        riveAnimationView.play(list, loop, direction, z & ((i & 8) == 0), z2 | (!((i & 16) == 0)));
    }

    public /* synthetic */ RiveAnimationView(Context context, AttributeSet attributeSet, int i, awqx awqxVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RiveAnimationView(Builder builder) {
        this(builder.getContext$third_party_java_android_libs_rive_rive_android(), null, 2, 0 == true ? 1 : 0);
        builder.getClass();
        if (getArtboardRenderer() == null) {
            RendererAttributes rendererAttributes = this.rendererAttributes;
            RendererType rendererType$third_party_java_android_libs_rive_rive_android = builder.getRendererType$third_party_java_android_libs_rive_rive_android();
            rendererAttributes.setRendererType(rendererType$third_party_java_android_libs_rive_rive_android == null ? RendererType.Companion.fromIndex(rendererIndexDefault) : rendererType$third_party_java_android_libs_rive_rive_android);
            Boolean autoplay$third_party_java_android_libs_rive_rive_android = builder.getAutoplay$third_party_java_android_libs_rive_rive_android();
            rendererAttributes.setAutoplay(autoplay$third_party_java_android_libs_rive_rive_android != null ? autoplay$third_party_java_android_libs_rive_rive_android.booleanValue() : getDefaultAutoplay());
            rendererAttributes.setAutoBind(builder.getAutoBind$third_party_java_android_libs_rive_rive_android());
            Boolean traceAnimations$third_party_java_android_libs_rive_rive_android = builder.getTraceAnimations$third_party_java_android_libs_rive_rive_android();
            rendererAttributes.setRiveTraceAnimations(traceAnimations$third_party_java_android_libs_rive_rive_android != null ? traceAnimations$third_party_java_android_libs_rive_rive_android.booleanValue() : false);
            rendererAttributes.setArtboardName(builder.getArtboardName$third_party_java_android_libs_rive_rive_android());
            rendererAttributes.setAnimationName(builder.getAnimationName$third_party_java_android_libs_rive_rive_android());
            rendererAttributes.setStateMachineName(builder.getStateMachineName$third_party_java_android_libs_rive_rive_android());
            rendererAttributes.setResource(builder.getResourceType$third_party_java_android_libs_rive_rive_android());
            FileAssetLoader assetLoader = rendererAttributes.getAssetLoader();
            assetLoader.getClass();
            ((FallbackAssetLoader) assetLoader).resetWith$third_party_java_android_libs_rive_rive_android(builder);
            Alignment alignment$third_party_java_android_libs_rive_rive_android = builder.getAlignment$third_party_java_android_libs_rive_rive_android();
            rendererAttributes.setAlignment(alignment$third_party_java_android_libs_rive_rive_android == null ? rendererAttributes.getAlignment() : alignment$third_party_java_android_libs_rive_rive_android);
            Fit fit$third_party_java_android_libs_rive_rive_android = builder.getFit$third_party_java_android_libs_rive_rive_android();
            rendererAttributes.setFit(fit$third_party_java_android_libs_rive_rive_android == null ? rendererAttributes.getFit() : fit$third_party_java_android_libs_rive_rive_android);
            Loop loop$third_party_java_android_libs_rive_rive_android = builder.getLoop$third_party_java_android_libs_rive_rive_android();
            rendererAttributes.setLoop(loop$third_party_java_android_libs_rive_rive_android == null ? rendererAttributes.getLoop() : loop$third_party_java_android_libs_rive_rive_android);
            setTouchPassThrough(builder.getTouchPassThrough$third_party_java_android_libs_rive_rive_android());
            setMultiTouchEnabled(builder.getMultiTouchEnabled$third_party_java_android_libs_rive_rive_android());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}

package android.support.rastermill;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FrameSequenceDrawable extends Drawable implements Animatable, Runnable {
    private static final long DEFAULT_DELAY_MS = 100;
    public static final int LOOP_DEFAULT = 3;
    public static final int LOOP_FINITE = 1;
    public static final int LOOP_INF = 2;

    @Deprecated
    public static final int LOOP_ONCE = 1;
    private static final long MIN_DELAY_MS = 20;
    private static final int STATE_DECODING = 2;
    private static final int STATE_READY_TO_SWAP = 4;
    private static final int STATE_SCHEDULED = 1;
    private static final int STATE_WAITING_TO_SWAP = 3;
    private static final String TAG = "FrameSequence";
    private static HandlerThread sDecodingThread;
    private static Handler sDecodingThreadHandler;
    private final long defaultDelayMs;
    private Bitmap mBackBitmap;
    private BitmapShader mBackBitmapShader;
    private final BitmapProvider mBitmapProvider;
    private boolean mCircleMaskEnabled;
    private int mCornerRadiusPx;
    private int mCurrentLoop;
    private final Runnable mDecodeRunnable;
    private boolean mDestroyed;
    private final Runnable mFinishedCallbackRunnable;
    private final FrameSequence mFrameSequence;
    private final FrameSequence.State mFrameSequenceState;
    private Bitmap mFrontBitmap;
    private BitmapShader mFrontBitmapShader;
    private long mLastSwap;
    private final Object mLock;
    private int mLoopBehavior;
    private int mLoopCount;
    private int mNextFrameToDecode;
    private long mNextSwap;
    private OnFinishedListener mOnFinishedListener;
    private final Paint mPaint;
    private final Rect mSrcRect;
    private int mState;
    private final RectF mTempRectF;
    private final Runnable mUiScheduleRunnable;
    private final long minDelayMs;
    private boolean onlyStartOnce;
    private boolean started;
    private static final Object sLock = new Object();
    private static BitmapProvider sAllocatingBitmapProvider = new BitmapProvider() { // from class: android.support.rastermill.FrameSequenceDrawable.1
        @Override // android.support.rastermill.FrameSequenceDrawable.BitmapProvider
        public Bitmap acquireBitmap(int i, int i2) {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }

        @Override // android.support.rastermill.FrameSequenceDrawable.BitmapProvider
        public void releaseBitmap(Bitmap bitmap) {
        }
    };
    private static final Handler sMainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public interface BitmapProvider {
        Bitmap acquireBitmap(int i, int i2);

        void releaseBitmap(Bitmap bitmap);
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public interface OnFinishedListener {
        void onFinished(FrameSequenceDrawable frameSequenceDrawable);
    }

    public FrameSequenceDrawable(FrameSequence frameSequence, BitmapProvider bitmapProvider, long j, long j2) {
        this.mLock = new Object();
        this.mDestroyed = false;
        this.onlyStartOnce = false;
        this.started = false;
        this.mLoopBehavior = 3;
        this.mLoopCount = 1;
        this.mTempRectF = new RectF();
        this.mDecodeRunnable = new Runnable(this) { // from class: android.support.rastermill.FrameSequenceDrawable.2
            final /* synthetic */ FrameSequenceDrawable this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                long frame;
                boolean z;
                Bitmap bitmap;
                synchronized (this.this$0.mLock) {
                    if (this.this$0.mDestroyed) {
                        return;
                    }
                    int i = this.this$0.mNextFrameToDecode;
                    if (i < 0) {
                        return;
                    }
                    Bitmap bitmap2 = this.this$0.mBackBitmap;
                    this.this$0.mState = 2;
                    boolean z2 = true;
                    try {
                        frame = this.this$0.mFrameSequenceState.getFrame(i, bitmap2, i - 2);
                        z = false;
                    } catch (Exception e) {
                        Log.e(FrameSequenceDrawable.TAG, "exception during decode: ".concat(e.toString()));
                        frame = 0;
                        z = true;
                    }
                    if (frame < this.this$0.minDelayMs) {
                        frame = this.this$0.defaultDelayMs;
                    }
                    synchronized (this.this$0.mLock) {
                        boolean z3 = this.this$0.mDestroyed;
                        FrameSequenceDrawable frameSequenceDrawable = this.this$0;
                        bitmap = null;
                        if (z3) {
                            Bitmap bitmap3 = frameSequenceDrawable.mBackBitmap;
                            this.this$0.mBackBitmap = null;
                            bitmap = bitmap3;
                        } else if (frameSequenceDrawable.mNextFrameToDecode >= 0 && this.this$0.mState == 2) {
                            FrameSequenceDrawable frameSequenceDrawable2 = this.this$0;
                            frameSequenceDrawable2.mNextSwap = z ? Long.MAX_VALUE : frame + frameSequenceDrawable2.mLastSwap;
                            this.this$0.mState = 3;
                        }
                        z2 = false;
                    }
                    if (z2) {
                        FrameSequenceDrawable.sMainHandler.post(this.this$0.mUiScheduleRunnable);
                    }
                    if (bitmap != null) {
                        this.this$0.mBitmapProvider.releaseBitmap(bitmap);
                    }
                }
            }
        };
        this.mUiScheduleRunnable = new Runnable(this) { // from class: android.support.rastermill.FrameSequenceDrawable.3
            final /* synthetic */ FrameSequenceDrawable this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

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
            public void run() {
                FrameSequenceDrawable frameSequenceDrawable = this.this$0;
                FrameSequenceDrawable.super.unscheduleSelf(frameSequenceDrawable);
                FrameSequenceDrawable frameSequenceDrawable2 = this.this$0;
                frameSequenceDrawable2.scheduleSelf(frameSequenceDrawable2, frameSequenceDrawable2.mNextSwap);
            }
        };
        this.mFinishedCallbackRunnable = new Runnable(this) { // from class: android.support.rastermill.FrameSequenceDrawable.4
            final /* synthetic */ FrameSequenceDrawable this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (this.this$0.mLock) {
                    this.this$0.mNextFrameToDecode = -1;
                    this.this$0.mState = 0;
                }
                if (this.this$0.mOnFinishedListener != null) {
                    FrameSequenceDrawable frameSequenceDrawable = this.this$0;
                    frameSequenceDrawable.mOnFinishedListener.onFinished(frameSequenceDrawable);
                }
            }
        };
        if (frameSequence == null || bitmapProvider == null) {
            throw new IllegalArgumentException();
        }
        this.minDelayMs = j;
        this.defaultDelayMs = j2;
        this.mFrameSequence = frameSequence;
        FrameSequence.State stateCreateState = frameSequence.createState();
        this.mFrameSequenceState = stateCreateState;
        int width = frameSequence.getWidth();
        int height = frameSequence.getHeight();
        this.mBitmapProvider = bitmapProvider;
        this.mFrontBitmap = acquireAndValidateBitmap(bitmapProvider, width, height);
        this.mBackBitmap = acquireAndValidateBitmap(bitmapProvider, width, height);
        this.mSrcRect = new Rect(0, 0, width, height);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setFilterBitmap(true);
        this.mFrontBitmapShader = new BitmapShader(this.mFrontBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.mBackBitmapShader = new BitmapShader(this.mBackBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.mLastSwap = 0L;
        this.mNextFrameToDecode = -1;
        stateCreateState.getFrame(0, this.mFrontBitmap, -1);
        initializeDecodingThread();
    }

    private static Bitmap acquireAndValidateBitmap(BitmapProvider bitmapProvider, int i, int i2) {
        Bitmap bitmapAcquireBitmap = bitmapProvider.acquireBitmap(i, i2);
        if (bitmapAcquireBitmap.getWidth() < i || bitmapAcquireBitmap.getHeight() < i2 || bitmapAcquireBitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Invalid bitmap provided");
        }
        return bitmapAcquireBitmap;
    }

    private void checkDestroyedLocked() {
        if (this.mDestroyed) {
            throw new IllegalStateException("Cannot perform operation on recycled drawable");
        }
    }

    private static void initializeDecodingThread() {
        synchronized (sLock) {
            if (sDecodingThread != null) {
                return;
            }
            HandlerThread handlerThread = new HandlerThread("FrameSequence decoding thread", 10);
            sDecodingThread = handlerThread;
            handlerThread.start();
            sDecodingThreadHandler = new Handler(sDecodingThread.getLooper());
        }
    }

    private void scheduleDecodeLocked() {
        this.mState = 1;
        this.mNextFrameToDecode = (this.mNextFrameToDecode + 1) % this.mFrameSequence.getFrameCount();
        sDecodingThreadHandler.post(this.mDecodeRunnable);
    }

    public void destroy() {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.mBitmapProvider == null) {
            throw new IllegalStateException("BitmapProvider must be non-null");
        }
        synchronized (this.mLock) {
            checkDestroyedLocked();
            bitmap = this.mFrontBitmap;
            bitmap2 = null;
            this.mFrontBitmap = null;
            if (this.mState != 2) {
                Bitmap bitmap3 = this.mBackBitmap;
                this.mBackBitmap = null;
                bitmap2 = bitmap3;
            }
            this.mDestroyed = true;
        }
        this.mBitmapProvider.releaseBitmap(bitmap);
        if (bitmap2 != null) {
            this.mBitmapProvider.releaseBitmap(bitmap2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060 A[Catch: all -> 0x0106, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0019, B:9:0x001b, B:11:0x0021, B:13:0x0025, B:15:0x0047, B:17:0x0051, B:23:0x0060, B:21:0x0058, B:24:0x0066, B:25:0x0069), top: B:41:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[Catch: all -> 0x0106, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0019, B:9:0x001b, B:11:0x0021, B:13:0x0025, B:15:0x0047, B:17:0x0051, B:23:0x0060, B:21:0x0058, B:24:0x0066, B:25:0x0069), top: B:41:0x0003 }] */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        synchronized (this.mLock) {
            checkDestroyedLocked();
            if (this.mState == 3 && this.mNextSwap - SystemClock.uptimeMillis() <= 0) {
                this.mState = 4;
            }
            if (isRunning() && this.mState == 4) {
                Bitmap bitmap = this.mBackBitmap;
                this.mBackBitmap = this.mFrontBitmap;
                this.mFrontBitmap = bitmap;
                BitmapShader bitmapShader = this.mBackBitmapShader;
                this.mBackBitmapShader = this.mFrontBitmapShader;
                this.mFrontBitmapShader = bitmapShader;
                this.mLastSwap = SystemClock.uptimeMillis();
                if (this.mNextFrameToDecode == this.mFrameSequence.getFrameCount() - 1) {
                    int i = this.mCurrentLoop + 1;
                    this.mCurrentLoop = i;
                    int i2 = this.mLoopBehavior;
                    if (i2 == 1) {
                        if (i != this.mLoopCount) {
                            scheduleDecodeLocked();
                        } else {
                            scheduleSelf(this.mFinishedCallbackRunnable, 0L);
                        }
                    } else if (i2 == 3 && i == this.mFrameSequence.getDefaultLoopCount()) {
                        scheduleSelf(this.mFinishedCallbackRunnable, 0L);
                    } else {
                        scheduleDecodeLocked();
                    }
                } else {
                    scheduleDecodeLocked();
                }
            }
        }
        if (!this.mCircleMaskEnabled && this.mCornerRadiusPx <= 0) {
            this.mPaint.setShader(null);
            canvas.drawBitmap(this.mFrontBitmap, this.mSrcRect, getBounds(), this.mPaint);
            return;
        }
        Rect bounds = getBounds();
        int intrinsicWidth = getIntrinsicWidth();
        int intrinsicHeight = getIntrinsicHeight();
        float fWidth = bounds.width();
        float f = intrinsicWidth;
        float fHeight = bounds.height();
        float f2 = intrinsicHeight;
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        float f3 = fWidth / f;
        float f4 = fHeight / f2;
        canvas.scale(f3, f4);
        this.mPaint.setShader(this.mFrontBitmapShader);
        if (this.mCircleMaskEnabled) {
            float fMin = Math.min(bounds.width(), bounds.height());
            float f5 = fMin / f3;
            float f6 = fMin / f4;
            this.mTempRectF.set((f - f5) / 2.0f, (f2 - f6) / 2.0f, (f + f5) / 2.0f, (f2 + f6) / 2.0f);
            canvas.drawOval(this.mTempRectF, this.mPaint);
        } else {
            this.mTempRectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            float f7 = this.mCornerRadiusPx;
            canvas.drawRoundRect(this.mTempRectF, f7 / f3, f7 / f4, this.mPaint);
        }
        canvas.restore();
    }

    protected void finalize() throws Throwable {
        try {
            this.mFrameSequenceState.destroy();
        } finally {
            super.finalize();
        }
    }

    public final boolean getCircleMaskEnabled() {
        return this.mCircleMaskEnabled;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mFrameSequence.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mFrameSequence.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.mFrameSequence.isOpaque() ? -1 : -2;
    }

    public boolean isDestroyed() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mDestroyed;
        }
        return z;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        boolean z;
        synchronized (this.mLock) {
            z = false;
            if (this.mNextFrameToDecode >= 0 && !this.mDestroyed) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        synchronized (this.mLock) {
            z = false;
            if (this.mNextFrameToDecode >= 0 && this.mState == 3) {
                this.mState = 4;
                z = true;
            }
        }
        if (z) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    public final void setCircleMaskEnabled(boolean z) {
        if (this.mCircleMaskEnabled != z) {
            this.mCircleMaskEnabled = z;
            this.mPaint.setAntiAlias(z);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public final void setCornerRadius(int i) {
        if (this.mCornerRadiusPx != i) {
            this.mCornerRadiusPx = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.mPaint.setFilterBitmap(z);
    }

    public void setLoopBehavior(int i) {
        this.mLoopBehavior = i;
    }

    public void setLoopCount(int i) {
        this.mLoopCount = i;
    }

    public void setOnFinishedListener(OnFinishedListener onFinishedListener) {
        this.mOnFinishedListener = onFinishedListener;
    }

    public void setOnlyStartOnce(boolean z) {
        this.onlyStartOnce = z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            stop();
        } else if (z2 || visible) {
            stop();
            if (!this.started || !this.onlyStartOnce) {
                start();
                this.started = true;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (isRunning()) {
            return;
        }
        synchronized (this.mLock) {
            checkDestroyedLocked();
            if (this.mState != 1) {
                this.mCurrentLoop = 0;
                scheduleDecodeLocked();
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (isRunning()) {
            unscheduleSelf(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        synchronized (this.mLock) {
            this.mNextFrameToDecode = -1;
            this.mState = 0;
        }
        super.unscheduleSelf(runnable);
    }

    public FrameSequenceDrawable(FrameSequence frameSequence, long j, long j2) {
        this(frameSequence, sAllocatingBitmapProvider, j, j2);
    }

    public FrameSequenceDrawable(FrameSequence frameSequence, BitmapProvider bitmapProvider) {
        this(frameSequence, bitmapProvider, MIN_DELAY_MS, DEFAULT_DELAY_MS);
    }

    public FrameSequenceDrawable(FrameSequence frameSequence) {
        this(frameSequence, MIN_DELAY_MS, DEFAULT_DELAY_MS);
    }
}
